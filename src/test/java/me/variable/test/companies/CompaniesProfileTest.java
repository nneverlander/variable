package me.variable.test.companies;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.categories.CompanyCulture;
import me.variable.categories.Office;
import me.variable.common.Constants;
import me.variable.common.Enums;
import me.variable.entities.company.CompanyProfile;
import me.variable.test.TestConstants;
import me.variable.test.util.HttpUtil;
import me.variable.test.util.Response;
import me.variable.test.util.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by adi on 3/5/17.
 */
public class CompaniesProfileTest {

    private static int count = 0;
    private static int officeCount = 0;
    private ObjectMapper mapper = new ObjectMapper();

    public CompaniesProfileTest() throws IOException {
    }

    @Test
    public void testCreateProfile() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.COMPANIES_PROFILES_PATH;
        CompanyProfile companyProfile = buildTestCompanyProfile();
        try {
            Response resp = HttpUtil.sendPost(url, mapper.writeValueAsString(companyProfile));
            Assert.assertEquals("response code mismatch", 204, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testListAllProfiles() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.COMPANIES_PROFILES_PATH;
        try {
            Response resp = HttpUtil.sendGet(url);
            Assert.assertEquals("response code mismatch", 200, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public CompanyProfile buildTestCompanyProfile() {
        CompanyProfile companyProfile = new CompanyProfile();

        companyProfile.setIndustry("industry-test-" + count);

        Enums.CompanyType[] values = Enums.CompanyType.values();
        int ordinal = ThreadLocalRandom.current().nextInt(0, values.length);
        companyProfile.setCompanyType(values[ordinal]);

        CompanyCulture companyCulture = Utils.buildTestCompanyCulture();
        companyProfile.setCompanyCulture(companyCulture);

        List<Office> offices = new ArrayList<>();
        offices.add(Utils.buildTestOffice(officeCount++));
        offices.add(Utils.buildTestOffice(officeCount++));
        offices.add(Utils.buildTestOffice(officeCount++));
        offices.add(Utils.buildTestOffice(officeCount++));
        companyProfile.setOffices(offices);

        companyProfile.setCompanyName("company-name-test-" + count);
        companyProfile.setCompanyRef("company-ref-test-" + count);
        companyProfile.setCreatedBy("createdby-test-" + count);
        companyProfile.setCreatedAt(new Date());
        companyProfile.setUpdatedBy("updatedby-test-" + count);
        companyProfile.setUpdatedAt(new Date());

        count++;
        return companyProfile;
    }

}

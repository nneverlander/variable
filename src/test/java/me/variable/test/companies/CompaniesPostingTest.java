package me.variable.test.companies;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.categories.Job;
import me.variable.common.Constants;
import me.variable.entities.company.CompanyPosting;
import me.variable.test.TestConstants;
import me.variable.test.util.HttpUtil;
import me.variable.test.util.Response;
import me.variable.test.util.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by adi on 3/5/17.
 */
public class CompaniesPostingTest {

    private static int count = 0;
    private ObjectMapper mapper = new ObjectMapper();

    public CompaniesPostingTest() throws IOException {
    }

    @Test
    public void testCreateCompanyPosting() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.COMPANIES_POSTINGS_PATH;
        CompanyPosting companyPosting = buildTestCompanyPosting();
        try {
            Response resp = HttpUtil.sendPost(url, mapper.writeValueAsString(companyPosting));
            Assert.assertEquals("response code mismatch", 204, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testListAllPostings() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.COMPANIES_POSTINGS_PATH;
        try {
            Response resp = HttpUtil.sendGet(url);
            Assert.assertEquals("response code mismatch", 200, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public CompanyPosting buildTestCompanyPosting() {
        CompanyPosting companyPosting = new CompanyPosting();
        companyPosting.setPostingId("company-posting-test-" + count);

        Job job = Utils.buildTestJob(count);
        companyPosting.setJob(job);

        companyPosting.setCompanyName("company-name-test-" + count);
        companyPosting.setCompanyRef("company-ref-test-" + count);
        companyPosting.setCreatedBy("createdby-test-" + count);
        companyPosting.setCreatedAt(Calendar.getInstance().getTime());
        companyPosting.setUpdatedBy("updatedby-test-" + count);
        companyPosting.setUpdatedAt(Calendar.getInstance().getTime());

        count++;
        return companyPosting;
    }
}

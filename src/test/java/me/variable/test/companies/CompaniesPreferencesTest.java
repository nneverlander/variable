package me.variable.test.companies;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.categories.Award;
import me.variable.categories.Education;
import me.variable.categories.Skill;
import me.variable.categories.WorkEx;
import me.variable.common.Constants;
import me.variable.entities.company.CompanyPreferences;
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

/**
 * Created by adi on 3/5/17.
 */
public class CompaniesPreferencesTest {

    private static int count = 0;
    private static int awardCount = 0;
    private static int orgCount = 0;
    private static int activityCount = 0;
    private static int educationCount = 0;
    private static int skillCount = 0;
    private static int workExCount = 0;
    private static int dutiesCount = 0;
    private static int learningsCount = 0;

    private ObjectMapper mapper = new ObjectMapper();

    public CompaniesPreferencesTest() throws IOException {
    }

    @Test
    public void testCreatePreferences() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.COMPANIES_PREFERENCES_PATH;
        CompanyPreferences companyPreferences = buildTestCompanyPreferences();
        try {
            Response resp = HttpUtil.sendPost(url, mapper.writeValueAsString(companyPreferences));
            Assert.assertEquals("response code mismatch", 204, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testListAllPreferences() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.COMPANIES_PREFERENCES_PATH;
        try {
            Response resp = HttpUtil.sendGet(url);
            Assert.assertEquals("response code mismatch", 200, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public CompanyPreferences buildTestCompanyPreferences() {
        CompanyPreferences companyPreferences = new CompanyPreferences();

        List<Education> educations = new ArrayList<>();
        List<WorkEx> workExps = new ArrayList<>();
        List<Skill> skills = new ArrayList<>();
        List<Award> awards = new ArrayList<>();

        educations.add(Utils.buildTestEducation(educationCount++, orgCount++, activityCount++, awardCount++));
        educations.add(Utils.buildTestEducation(educationCount++, orgCount++, activityCount++, awardCount++));

        workExps.add(Utils.buildTestWorkEx(workExCount++, dutiesCount++, learningsCount++, skillCount++));
        workExps.add(Utils.buildTestWorkEx(workExCount++, dutiesCount++, learningsCount++, skillCount++));

        skills.add(Utils.buildTestSkill(skillCount++));
        skills.add(Utils.buildTestSkill(skillCount++));
        skills.add(Utils.buildTestSkill(skillCount++));
        skills.add(Utils.buildTestSkill(skillCount++));

        awards.add(Utils.buildTestAward(awardCount++));
        awards.add(Utils.buildTestAward(awardCount++));

        companyPreferences.setEducations(educations);
        companyPreferences.setWorkExps(workExps);
        companyPreferences.setSkills(skills);
        companyPreferences.setAwards(awards);

        companyPreferences.setCompanyName("company-name-test-" + count);
        companyPreferences.setCompanyRef("company-ref-test-" + count);
        companyPreferences.setCreatedBy("createdby-test-" + count);
        companyPreferences.setCreatedAt(new Date());
        companyPreferences.setUpdatedBy("updatedby-test-" + count);
        companyPreferences.setUpdatedAt(new Date());

        count++;

        return companyPreferences;
    }
}

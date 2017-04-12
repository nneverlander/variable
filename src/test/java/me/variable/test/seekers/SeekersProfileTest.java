package me.variable.test.seekers;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.categories.Award;
import me.variable.categories.Education;
import me.variable.categories.Skill;
import me.variable.categories.WorkEx;
import me.variable.common.Constants;
import me.variable.entities.seeker.SeekerProfile;
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
public class SeekersProfileTest {

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

    public SeekersProfileTest() throws IOException {
    }

    @Test
    public void testCreateProfile() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.SEEKERS_PROFILES_PATH;
        SeekerProfile seekerProfile = buildTestSeekerProfile();
        try {
            Response resp = HttpUtil.sendPost(url, mapper.writeValueAsString(seekerProfile));
            Assert.assertEquals("response code mismatch", 204, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testListAllProfiles() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.SEEKERS_PROFILES_PATH;
        try {
            Response resp = HttpUtil.sendGet(url);
            Assert.assertEquals("response code mismatch", 200, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public SeekerProfile buildTestSeekerProfile() {
        SeekerProfile seekerProfile = new SeekerProfile();

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

        seekerProfile.setEducations(educations);
        seekerProfile.setWorkExps(workExps);
        seekerProfile.setSkills(skills);
        seekerProfile.setAwards(awards);

        seekerProfile.setFirstName("seeker-fname-test-" + count);
        seekerProfile.setLastName("seeker-lname-test-" + count);
        seekerProfile.setEmail("seeker@test" + count + ".com");
        String phone = String.valueOf(ThreadLocalRandom.current().nextInt(200000000, 999999999));
        seekerProfile.setPhone(phone);

        seekerProfile.setCreatedBy("createdby-test-" + count);
        seekerProfile.setCreatedAt(new Date());
        seekerProfile.setUpdatedBy("updatedby-test-" + count);
        seekerProfile.setUpdatedAt(new Date());

        count++;

        return seekerProfile;
    }

}

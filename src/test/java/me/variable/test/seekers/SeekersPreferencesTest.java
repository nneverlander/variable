package me.variable.test.seekers;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.categories.CompanyCulture;
import me.variable.categories.Job;
import me.variable.common.Constants;
import me.variable.entities.seeker.SeekerPreferences;
import me.variable.test.TestConstants;
import me.variable.test.util.HttpUtil;
import me.variable.test.util.Response;
import me.variable.test.util.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by adi on 3/5/17.
 */
public class SeekersPreferencesTest {

    private static int count = 0;
    private static int officeCount = 0;
    private ObjectMapper mapper = new ObjectMapper();

    public SeekersPreferencesTest() throws IOException {
    }

    @Test
    public void testCreatePreferences() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.SEEKERS_PREFERENCES_PATH;
        SeekerPreferences seekerPreferences = buildTestSeekerPreferences();
        try {
            Response resp = HttpUtil.sendPost(url, mapper.writeValueAsString(seekerPreferences));
            Assert.assertEquals("response code mismatch", 204, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testListAllPreferences() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.SEEKERS_PREFERENCES_PATH;
        try {
            Response resp = HttpUtil.sendGet(url);
            Assert.assertEquals("response code mismatch", 200, resp.getRespCode());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public SeekerPreferences buildTestSeekerPreferences() {
        SeekerPreferences seekerPreferences = new SeekerPreferences();

        CompanyCulture companyCulture = Utils.buildTestCompanyCulture();
        seekerPreferences.setCompanyCulture(companyCulture);

        Job job = Utils.buildTestJob(count);
        seekerPreferences.setJob(job);

        seekerPreferences.setFirstName("seeker-fname-test-" + count);
        seekerPreferences.setLastName("seeker-lname-test-" + count);
        seekerPreferences.setEmail("seeker@test" + count + ".com");
        String phone = String.valueOf(ThreadLocalRandom.current().nextInt(200000000, 999999999));
        seekerPreferences.setPhone(phone);

        seekerPreferences.setCreatedBy("createdby-test-" + count);
        seekerPreferences.setCreatedAt(new Date());
        seekerPreferences.setUpdatedBy("updatedby-test-" + count);
        seekerPreferences.setUpdatedAt(new Date());

        count++;
        return seekerPreferences;
    }

}

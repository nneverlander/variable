package me.variable.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.Constants;
import me.variable.category.Benefits;
import me.variable.category.Job;
import me.variable.category.Office;
import me.variable.common.Location;
import me.variable.entity.company.Posting;
import me.variable.util.HttpUtil;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by adi on 3/5/17.
 */
public class PostingTest {

    private String path = "/posting";
    private ObjectMapper mapper = new ObjectMapper();

    public PostingTest() throws IOException {
    }

    @Test
    public void testPosting() {
        Job job = new Job();
        job.setTitle("job-title");
        job.setJobType("full time");

        Benefits benefits = new Benefits();
        benefits.setSalary(1000);
        benefits.setJoiningBonus(1000);

        Office office = new Office();
        Location location = new Location();
        location.setCity("sf");
        location.setAddress("54 sharon");
        office.setLocation(location);

        job.setOffice(office);
        job.setBenefits(benefits);

        Posting posting = new Posting();
        posting.setPostingId("test-posting-unittest");
        posting.setJob(job);
        posting.setCompanyName("companyName");

        try {
            HttpUtil.sendPost(Constants.HOST + Constants.BASEPATH + path, mapper.writeValueAsString(posting));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

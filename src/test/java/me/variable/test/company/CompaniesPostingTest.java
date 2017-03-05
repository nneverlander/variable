package me.variable.test.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.test.TestConstants;
import me.variable.test.categories.Benefits;
import me.variable.test.categories.Job;
import me.variable.test.categories.Office;
import me.variable.test.common.Constants;
import me.variable.test.common.Location;
import me.variable.test.entities.company.CompanyPosting;
import me.variable.test.util.HttpUtil;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by adi on 3/5/17.
 */
public class CompaniesPostingTest {

    private ObjectMapper mapper = new ObjectMapper();

    public CompaniesPostingTest() throws IOException {
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

        CompanyPosting companyPosting = new CompanyPosting();
        companyPosting.setPostingId("test-companyPosting-unittest");
        companyPosting.setJob(job);
        companyPosting.setCompanyName("companyName");

        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.COMPANIES_POSTINGS_PATH;

        try {
            HttpUtil.sendPost(url, mapper.writeValueAsString(companyPosting));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

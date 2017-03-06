package me.variable.test.companies;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.categories.Benefits;
import me.variable.categories.Job;
import me.variable.categories.Office;
import me.variable.common.Constants;
import me.variable.common.Location;
import me.variable.entities.company.CompanyPosting;
import me.variable.test.TestConstants;
import me.variable.test.util.HttpUtil;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by adi on 3/5/17.
 */
public class CompaniesPostingTest {

    private static int count = 0;
    private ObjectMapper mapper = new ObjectMapper();

    public CompaniesPostingTest() throws IOException {
    }

    @Test
    public void testCompanyPosting() {
        CompanyPosting companyPosting = new CompanyPosting();
        companyPosting.setPostingId("company-posting-unittest-" + count);

        Job job = new Job();
        job.setTitle("job-title-unittest-" + count);
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

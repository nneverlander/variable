package me.variable.company;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.Constants;
import me.variable.category.Job;
import me.variable.category.Skill;
import me.variable.entity.company.Posting;
import me.variable.util.HttpUtil;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
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

        Posting posting = new Posting();
        posting.setPostingId("test-posting");
        posting.setJob(job);

        try {
            String post = mapper.writeValueAsString(posting);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            JsonGenerator jsonGen = new JsonFactory().createGenerator(bos, JsonEncoding.UTF8);
            mapper.writeValue(jsonGen, posting);
            HttpUtil.sendPost(Constants.HOST + Constants.BASEPATH + path, bos.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

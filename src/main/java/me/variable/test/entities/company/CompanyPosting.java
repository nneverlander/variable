package me.variable.test.entities.company;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import me.variable.test.categories.Job;

/**
 * Created by adi on 3/5/17.
 */
@Entity
public class CompanyPosting extends CompanyMetadata {

    @Index
    private String postingId;
    private Job job;

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

}

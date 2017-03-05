package me.variable.entity.company;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import me.variable.category.Job;

/**
 * Created by adi on 3/5/17.
 */
@Entity
public class Posting extends Metadata {

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

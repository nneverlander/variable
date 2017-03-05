package me.variable.entity.company;

import me.variable.category.Benefits;
import me.variable.category.Job;

/**
 * Created by adi on 3/5/17.
 */
public class Posting extends Metadata {

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

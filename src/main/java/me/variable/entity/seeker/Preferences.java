package me.variable.entity.seeker;

import me.variable.category.Benefits;
import me.variable.category.CompanyCulture;
import me.variable.category.Job;
import me.variable.category.Office;

/**
 * Created by adi on 3/4/17.
 */
public class Preferences extends Metadata {

    private CompanyCulture companyCulture;
    private Job job;

    public CompanyCulture getCompanyCulture() {
        return companyCulture;
    }

    public void setCompanyCulture(CompanyCulture companyCulture) {
        this.companyCulture = companyCulture;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

}

package me.variable.test.entities.seeker;

import com.googlecode.objectify.annotation.Entity;
import me.variable.test.categories.CompanyCulture;
import me.variable.test.categories.Job;

/**
 * Created by adi on 3/4/17.
 */
@Entity
public class SeekerPreferences extends SeekerMetadata {

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

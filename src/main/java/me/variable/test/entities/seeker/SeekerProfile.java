package me.variable.test.entities.seeker;

import com.googlecode.objectify.annotation.Entity;
import me.variable.test.categories.Award;
import me.variable.test.categories.Education;
import me.variable.test.categories.Skill;
import me.variable.test.categories.WorkEx;

import java.util.List;

/**
 * Created by adi on 3/4/17.
 */
@Entity
public class SeekerProfile extends SeekerMetadata {

    private List<Education> educations;
    private List<WorkEx> workExps;
    private List<Skill> skills;
    private List<Award> awards;

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<WorkEx> getWorkExps() {
        return workExps;
    }

    public void setWorkExps(List<WorkEx> workExps) {
        this.workExps = workExps;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
}

package me.variable.entity.seeker;

import me.variable.category.Award;
import me.variable.category.Education;
import me.variable.category.Skill;
import me.variable.category.WorkEx;

import java.util.List;

/**
 * Created by adi on 3/4/17.
 */
public class Profile extends Metadata {

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

package me.variable.entities.company;

import com.googlecode.objectify.annotation.Entity;
import me.variable.categories.Award;
import me.variable.categories.Education;
import me.variable.categories.Skill;
import me.variable.categories.WorkEx;

import java.util.List;

/**
 * Created by adi on 3/5/17.
 */
@Entity
public class CompanyPreferences extends CompanyMetadata {

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

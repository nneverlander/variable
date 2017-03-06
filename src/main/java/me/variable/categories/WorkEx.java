package me.variable.categories;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import me.variable.common.Enums;
import me.variable.common.Location;
import me.variable.utils.RFC3339DateSerializer;

import java.util.Date;
import java.util.List;

/**
 * Created by adi on 3/4/17.
 */
public class WorkEx {

    private String occupation;
    private String company;
    private String field;
    @JsonSerialize(using = RFC3339DateSerializer.class)
    private Date started;
    @JsonSerialize(using = RFC3339DateSerializer.class)
    private Date ended;
    private Location location;
    private Enums.JobType type;
    private List<String> duties;
    private List<Skill> skills;
    private List<String> learnings;
    private boolean isInterestedInField;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getEnded() {
        return ended;
    }

    public void setEnded(Date ended) {
        this.ended = ended;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Enums.JobType getType() {
        return type;
    }

    public void setType(Enums.JobType type) {
        this.type = type;
    }

    public List<String> getDuties() {
        return duties;
    }

    public void setDuties(List<String> duties) {
        this.duties = duties;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<String> getLearnings() {
        return learnings;
    }

    public void setLearnings(List<String> learnings) {
        this.learnings = learnings;
    }

    public boolean isInterestedInField() {
        return isInterestedInField;
    }

    public void setInterestedInField(boolean interestedInField) {
        isInterestedInField = interestedInField;
    }
}

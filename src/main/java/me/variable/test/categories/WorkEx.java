package me.variable.test.categories;

import java.util.Date;
import java.util.List;

/**
 * Created by adi on 3/4/17.
 */
public class WorkEx {

    private String occupation;
    private String company;
    private String field;
    private Date started;
    private Date ended;
    private String location;
    private String type; //todo enum for this like full time etc.
    private List<String> duties;
    private List<String> skills;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getDuties() {
        return duties;
    }

    public void setDuties(List<String> duties) {
        this.duties = duties;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
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

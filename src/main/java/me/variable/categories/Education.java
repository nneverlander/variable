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
public class Education {

    private String schoolName;
    private Enums.EducationLevel level;
    private Enums.EducationType type;
    private String field;
    private float gpa;
    @JsonSerialize(using = RFC3339DateSerializer.class)
    private Date started;
    @JsonSerialize(using = RFC3339DateSerializer.class)
    private Date ended;
    private Location location;
    private List<Award> awards;
    private List<String> orgs;
    private List<String> activities;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Enums.EducationLevel getLevel() {
        return level;
    }

    public void setLevel(Enums.EducationLevel level) {
        this.level = level;
    }

    public Enums.EducationType getType() {
        return type;
    }

    public void setType(Enums.EducationType type) {
        this.type = type;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
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

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public List<String> getOrgs() {
        return orgs;
    }

    public void setOrgs(List<String> orgs) {
        this.orgs = orgs;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
}

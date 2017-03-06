package me.variable.categories;

/**
 * Created by adi on 3/4/17.
 */
public class Job {

    private String title;
    private boolean isWorkScheduleFlexible;
    private boolean isWfhAllowed;
    private boolean isRemoteAllowed;
    private String jobType;
    private Office office;
    private Benefits benefits;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isWorkScheduleFlexible() {
        return isWorkScheduleFlexible;
    }

    public void setWorkScheduleFlexible(boolean workScheduleFlexible) {
        isWorkScheduleFlexible = workScheduleFlexible;
    }

    public boolean isWfhAllowed() {
        return isWfhAllowed;
    }

    public void setWfhAllowed(boolean wfhAllowed) {
        isWfhAllowed = wfhAllowed;
    }

    public boolean isRemoteAllowed() {
        return isRemoteAllowed;
    }

    public void setRemoteAllowed(boolean remoteAllowed) {
        isRemoteAllowed = remoteAllowed;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Benefits getBenefits() {
        return benefits;
    }

    public void setBenefits(Benefits benefits) {
        this.benefits = benefits;
    }
}

package me.variable.categories;

import java.util.Date;

/**
 * Created by adi on 3/4/17.
 */
public class Award {

    private String name;
    private String awardedBy;
    private Date dateAwarded;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAwardedBy() {
        return awardedBy;
    }

    public void setAwardedBy(String awardedBy) {
        this.awardedBy = awardedBy;
    }

    public Date getDateAwarded() {
        return dateAwarded;
    }

    public void setDateAwarded(Date dateAwarded) {
        this.dateAwarded = dateAwarded;
    }
}

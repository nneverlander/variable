package me.variable.categories;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import me.variable.utils.RFC3339DateSerializer;

import java.util.Date;

/**
 * Created by adi on 3/4/17.
 */
public class Award {

    private String name;
    private String awardedBy;
    @JsonSerialize(using = RFC3339DateSerializer.class)
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

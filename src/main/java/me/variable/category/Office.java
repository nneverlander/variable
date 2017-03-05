package me.variable.category;

import com.google.apphosting.datastore.EntityV4;
import me.variable.common.Location;

import java.util.List;

/**
 * Created by adi on 3/4/17.
 */
public class Office {

    private List<String> facilities;
    private List<String> conveniences;
    private Location location;

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public List<String> getConveniences() {
        return conveniences;
    }

    public void setConveniences(List<String> conveniences) {
        this.conveniences = conveniences;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}

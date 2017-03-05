package me.variable.entity.company;

import com.googlecode.objectify.annotation.Index;
import me.variable.entity.Base;

/**
 * Created by adi on 3/4/17.
 */
public class Metadata extends Base {

    private String companyRef;
    @Index private String name;

    public String getCompanyRef() {
        return companyRef;
    }

    public void setCompanyRef(String companyRef) {
        this.companyRef = companyRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

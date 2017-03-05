package me.variable.test.entities.company;

import com.googlecode.objectify.annotation.Index;
import me.variable.test.entities.Base;

/**
 * Created by adi on 3/4/17.
 */
public class CompanyMetadata extends Base {

    private String companyRef;
    @Index
    private String companyName;

    public String getCompanyRef() {
        return companyRef;
    }

    public void setCompanyRef(String companyRef) {
        this.companyRef = companyRef;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}

package me.variable.entities.company;

import me.variable.entities.Base;

/**
 * Created by adi on 3/4/17.
 */
public class CompanyMetadata extends Base {

    private String companyRef;
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

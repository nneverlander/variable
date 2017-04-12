package me.variable.categories;

import me.variable.common.Enums;

/**
 * Created by adi on 3/4/17.
 */
public class CompanyCulture {

    private Enums.CompanySize size;
    private Enums.CompanyFunding funding;

    public Enums.CompanySize getSize() {
        return size;
    }

    public void setSize(Enums.CompanySize size) {
        this.size = size;
    }

    public Enums.CompanyFunding getFunding() {
        return funding;
    }

    public void setFunding(Enums.CompanyFunding funding) {
        this.funding = funding;
    }
}

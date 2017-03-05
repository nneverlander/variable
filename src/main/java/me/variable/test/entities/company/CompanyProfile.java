package me.variable.test.entities.company;

import com.googlecode.objectify.annotation.Entity;
import me.variable.test.categories.CompanyCulture;
import me.variable.test.categories.Office;

import java.util.List;

/**
 * Created by adi on 3/5/17.
 */
@Entity
public class CompanyProfile extends CompanyMetadata {

    private String industry;
    private String type; //todo enum public, private
    private CompanyCulture companyCulture;
    private List<Office> office;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CompanyCulture getCompanyCulture() {
        return companyCulture;
    }

    public void setCompanyCulture(CompanyCulture companyCulture) {
        this.companyCulture = companyCulture;
    }

    public List<Office> getOffice() {
        return office;
    }

    public void setOffice(List<Office> office) {
        this.office = office;
    }

}

package me.variable.api.companies;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.api.Base;
import me.variable.common.Constants;
import me.variable.entities.company.CompanyProfile;
import me.variable.service.company.CompanyProfileService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyProfileResource extends Base {

    CompanyProfileService companyProfileService = CompanyProfileService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = Constants.COMPANIES_PROFILES_PATH)
    public void createProfile(CompanyProfile companyProfile) {
        companyProfileService.addProfile(companyProfile);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = Constants.COMPANIES_PROFILES_PATH)
    public Collection<CompanyProfile> listAllProfiles() {
        return companyProfileService.listProfiles();
    }

}

package me.variable.api.companies;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.api.Base;
import me.variable.common.Constants;
import me.variable.entities.company.CompanyPreferences;
import me.variable.service.company.CompanyPreferencesService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyPreferencesResource extends Base {

    CompanyPreferencesService companyPreferencesService = CompanyPreferencesService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = Constants.COMPANIES_PREFERENCES_PATH)
    public void createPreferences(CompanyPreferences companyPreferences) {
        companyPreferencesService.addPreferences(companyPreferences);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = Constants.COMPANIES_PREFERENCES_PATH)
    public Collection<CompanyPreferences> listAllPreferences() {
        return companyPreferencesService.listPreferences();
    }

}

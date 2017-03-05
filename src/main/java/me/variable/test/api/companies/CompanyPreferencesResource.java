package me.variable.test.api.companies;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.test.api.Base;
import me.variable.test.entities.company.CompanyPreferences;
import me.variable.test.service.company.CompanyPreferencesService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyPreferencesResource extends Base {

    CompanyPreferencesService companyPreferencesService = CompanyPreferencesService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = "companies/preferences")
    public void createPreferences(CompanyPreferences companyPreferences) {
        companyPreferencesService.addPreferences(companyPreferences);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = "companies/preferences")
    public Collection<CompanyPreferences> listAllPreferences() {
        return companyPreferencesService.listPreferences();
    }

}

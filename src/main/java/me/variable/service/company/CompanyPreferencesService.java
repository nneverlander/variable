package me.variable.service.company;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.QueryKeys;
import me.variable.entities.company.CompanyPreferences;

import java.util.Collection;
import java.util.Map;

import static me.variable.common.OfyService.ofy;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyPreferencesService {

    private static CompanyPreferencesService INSTANCE;

    private CompanyPreferencesService() {
    }

    public static synchronized CompanyPreferencesService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CompanyPreferencesService();
        }
        return INSTANCE;
    }

    public void addPreferences(CompanyPreferences companyPreferences) {
        ofy().save().entity(companyPreferences).now();
    }

    public Collection<CompanyPreferences> listPreferences() {
        QueryKeys<CompanyPreferences> queryKeys = ofy().load().type(CompanyPreferences.class).keys();
        Map<Key<CompanyPreferences>, CompanyPreferences> result = ofy().load().keys(queryKeys);
        return result.values();
    }

}

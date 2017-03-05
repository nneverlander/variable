package me.variable.test.service.company;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.QueryKeys;
import me.variable.test.entities.company.CompanyProfile;

import java.util.Collection;
import java.util.Map;

import static me.variable.test.common.OfyService.ofy;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyProfileService {

    private static CompanyProfileService INSTANCE;

    private CompanyProfileService() {
    }

    public static synchronized CompanyProfileService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CompanyProfileService();
        }
        return INSTANCE;
    }

    public void addProfile(CompanyProfile companyProfile) {
        ofy().save().entity(companyProfile).now();
    }

    public Collection<CompanyProfile> listProfiles() {
        QueryKeys<CompanyProfile> queryKeys = ofy().load().type(CompanyProfile.class).keys();
        Map<Key<CompanyProfile>, CompanyProfile> result = ofy().load().keys(queryKeys);
        return result.values();
    }

}

package me.variable.service.company;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.QueryKeys;
import me.variable.common.OfyService;
import me.variable.entities.company.CompanyProfile;

import java.util.Collection;
import java.util.Map;

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
        OfyService.ofy().save().entity(companyProfile).now();
    }

    public Collection<CompanyProfile> listProfiles() {
        QueryKeys<CompanyProfile> queryKeys = OfyService.ofy().load().type(CompanyProfile.class).keys();
        Map<Key<CompanyProfile>, CompanyProfile> result = OfyService.ofy().load().keys(queryKeys);
        return result.values();
    }

}

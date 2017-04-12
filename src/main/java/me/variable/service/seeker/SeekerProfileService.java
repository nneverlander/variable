package me.variable.service.seeker;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.QueryKeys;
import me.variable.entities.seeker.SeekerProfile;

import java.util.Collection;
import java.util.Map;

import static me.variable.common.OfyService.ofy;

/**
 * Created by adi on 3/5/17.
 */
public class SeekerProfileService {

    private static SeekerProfileService INSTANCE;

    private SeekerProfileService() {
    }

    public static synchronized SeekerProfileService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SeekerProfileService();
        }
        return INSTANCE;
    }

    public void addProfile(SeekerProfile seekerProfile) {
        ofy().save().entity(seekerProfile).now();
    }

    public Collection<SeekerProfile> listProfiles() {
        QueryKeys<SeekerProfile> queryKeys = ofy().load().type(SeekerProfile.class).keys();
        Map<Key<SeekerProfile>, SeekerProfile> result = ofy().load().keys(queryKeys);
        return result.values();
    }

}

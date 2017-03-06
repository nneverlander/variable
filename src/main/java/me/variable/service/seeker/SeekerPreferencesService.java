package me.variable.service.seeker;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.QueryKeys;
import me.variable.entities.seeker.SeekerPreferences;
import me.variable.common.OfyService;

import java.util.Collection;
import java.util.Map;

/**
 * Created by adi on 3/5/17.
 */
public class SeekerPreferencesService {

    private static SeekerPreferencesService INSTANCE;

    private SeekerPreferencesService() {
    }

    public static synchronized SeekerPreferencesService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SeekerPreferencesService();
        }
        return INSTANCE;
    }

    public void addPreference(SeekerPreferences seekerPreferences) {
        OfyService.ofy().save().entity(seekerPreferences).now();
    }

    public Collection<SeekerPreferences> listPreferences() {
        QueryKeys<SeekerPreferences> queryKeys = OfyService.ofy().load().type(SeekerPreferences.class).keys();
        Map<Key<SeekerPreferences>, SeekerPreferences> result = OfyService.ofy().load().keys(queryKeys);
        return result.values();
    }

}

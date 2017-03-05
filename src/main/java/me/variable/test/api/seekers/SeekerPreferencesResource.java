package me.variable.test.api.seekers;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.test.api.Base;
import me.variable.test.entities.seeker.SeekerPreferences;
import me.variable.test.service.seeker.SeekerPreferencesService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class SeekerPreferencesResource extends Base {

    SeekerPreferencesService seekerPreferencesService = SeekerPreferencesService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = "seekers/preferences")
    public void createPreference(SeekerPreferences seekerPreferences) {
        seekerPreferencesService.addPreference(seekerPreferences);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = "seekers/preferences")
    public Collection<SeekerPreferences> listAllPreferences() {
        return seekerPreferencesService.listPreferences();
    }

}

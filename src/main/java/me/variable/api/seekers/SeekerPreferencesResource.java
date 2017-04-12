package me.variable.api.seekers;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.api.Base;
import me.variable.common.Constants;
import me.variable.entities.seeker.SeekerPreferences;
import me.variable.service.seeker.SeekerPreferencesService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class SeekerPreferencesResource extends Base {

    SeekerPreferencesService seekerPreferencesService = SeekerPreferencesService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = Constants.SEEKERS_PREFERENCES_PATH)
    public void createPreference(SeekerPreferences seekerPreferences) {
        seekerPreferencesService.addPreference(seekerPreferences);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = Constants.SEEKERS_PREFERENCES_PATH)
    public Collection<SeekerPreferences> listAllPreferences() {
        return seekerPreferencesService.listPreferences();
    }

}

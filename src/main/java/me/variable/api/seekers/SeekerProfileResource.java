package me.variable.api.seekers;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.api.Base;
import me.variable.common.Constants;
import me.variable.entities.seeker.SeekerProfile;
import me.variable.service.seeker.SeekerProfileService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class SeekerProfileResource extends Base {

    SeekerProfileService seekerProfileService = SeekerProfileService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = Constants.SEEKERS_PROFILES_PATH)
    public void createProfile(SeekerProfile seekerProfile) {
        seekerProfileService.addProfile(seekerProfile);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = Constants.SEEKERS_PROFILES_PATH)
    public Collection<SeekerProfile> listAllProfiles() {
        return seekerProfileService.listProfiles();
    }

}

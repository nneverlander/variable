package me.variable.test.api.seekers;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.test.api.Base;
import me.variable.test.entities.seeker.SeekerProfile;
import me.variable.test.service.seeker.SeekerProfileService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class SeekerProfileResource extends Base {

    SeekerProfileService seekerProfileService = SeekerProfileService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = "seekers/profiles")
    public void createProfile(SeekerProfile seekerProfile) {
        seekerProfileService.addProfile(seekerProfile);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = "seekers/profiles")
    public Collection<SeekerProfile> listAllProfiles() {
        return seekerProfileService.listProfiles();
    }

}

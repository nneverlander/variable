package me.variable.common;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import me.variable.entities.company.CompanyPosting;
import me.variable.entities.company.CompanyPreferences;
import me.variable.entities.company.CompanyProfile;
import me.variable.entities.seeker.SeekerPreferences;
import me.variable.entities.seeker.SeekerProfile;

/**
 * Created by adi on 3/5/17.
 */
public class OfyService {
    static {
        ObjectifyService.register(CompanyPosting.class);
        ObjectifyService.register(CompanyPreferences.class);
        ObjectifyService.register(CompanyProfile.class);
        ObjectifyService.register(SeekerPreferences.class);
        ObjectifyService.register(SeekerProfile.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }

}

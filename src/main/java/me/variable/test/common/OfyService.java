package me.variable.test.common;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import me.variable.test.entities.company.CompanyPosting;
import me.variable.test.entities.company.CompanyPreferences;
import me.variable.test.entities.company.CompanyProfile;
import me.variable.test.entities.seeker.SeekerProfile;
import me.variable.test.entities.seeker.SeekerPreferences;

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

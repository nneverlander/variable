package me.variable.common;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import me.variable.entity.company.Posting;
import me.variable.entity.company.Preferences;
import me.variable.entity.company.Profile;

/**
 * Created by adi on 3/5/17.
 */
public class OfyService {
    static {
        ObjectifyService.register(Posting.class);
        ObjectifyService.register(Preferences.class);
        ObjectifyService.register(Profile.class);
        ObjectifyService.register(me.variable.entity.seeker.Preferences.class);
        ObjectifyService.register(me.variable.entity.seeker.Profile.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }

}

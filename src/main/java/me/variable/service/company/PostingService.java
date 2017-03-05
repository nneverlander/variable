package me.variable.service.company;

import me.variable.category.Skill;
import me.variable.entity.company.Posting;

import static me.variable.common.OfyService.ofy;


/**
 * Created by adi on 3/5/17.
 */
public class PostingService {

    private static PostingService INSTANCE;

    private PostingService() {
    }

    public static synchronized PostingService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PostingService();
        }
        return INSTANCE;
    }

    public void addPosting(Posting posting) {
        ofy().save().entity(posting).now();
    }

}

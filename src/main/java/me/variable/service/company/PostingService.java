package me.variable.service.company;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.QueryKeys;
import javafx.geometry.Pos;
import me.variable.entity.company.Posting;

import java.util.Collection;
import java.util.List;
import java.util.Map;

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

    public Collection<Posting> listPostings() {
        QueryKeys<Posting> queryKeys = ofy().load().type(Posting.class).keys();
        Map<Key<Posting>, Posting> result = ofy().load().keys(queryKeys);
        return result.values();
    }

}

package me.variable.test.service.company;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.QueryKeys;
import me.variable.test.entities.company.CompanyPosting;

import java.util.Collection;
import java.util.Map;

import static me.variable.test.common.OfyService.ofy;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyPostingService {

    private static CompanyPostingService INSTANCE;

    private CompanyPostingService() {
    }

    public static synchronized CompanyPostingService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CompanyPostingService();
        }
        return INSTANCE;
    }

    public void addPosting(CompanyPosting companyPosting) {
        ofy().save().entity(companyPosting).now();
    }

    public Collection<CompanyPosting> listPostings() {
        QueryKeys<CompanyPosting> queryKeys = ofy().load().type(CompanyPosting.class).keys();
        Map<Key<CompanyPosting>, CompanyPosting> result = ofy().load().keys(queryKeys);
        return result.values();
    }

}

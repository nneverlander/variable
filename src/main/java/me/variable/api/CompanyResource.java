package me.variable.api;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.entity.company.Posting;
import me.variable.service.company.PostingService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyResource extends Base {

    PostingService postingService = PostingService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = "posting")
    public void createPosting(Posting posting) {
        postingService.addPosting(posting);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = "postings")
    public Collection<Posting> listAllPostings() {
        return postingService.listPostings();
    }

}

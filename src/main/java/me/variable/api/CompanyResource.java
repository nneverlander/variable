package me.variable.api;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.category.Skill;
import me.variable.entity.company.Posting;
import me.variable.service.company.PostingService;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyResource extends Base {

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = "posting")
    public void createPosting(Posting posting) {
        PostingService postingService = PostingService.getInstance();
        postingService.addPosting(posting);
    }

}

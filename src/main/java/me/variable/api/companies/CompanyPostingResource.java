package me.variable.api.companies;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.api.Base;
import me.variable.common.Constants;
import me.variable.entities.company.CompanyPosting;
import me.variable.service.company.CompanyPostingService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyPostingResource extends Base {

    CompanyPostingService companyPostingService = CompanyPostingService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = Constants.COMPANIES_POSTINGS_PATH)
    public void createPosting(CompanyPosting companyPosting) {
        companyPostingService.addPosting(companyPosting);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = Constants.COMPANIES_POSTINGS_PATH)
    public Collection<CompanyPosting> listAllPostings() {
        return companyPostingService.listPostings();
    }

}

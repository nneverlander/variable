package me.variable.test.api.companies;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.test.api.Base;
import me.variable.test.entities.company.CompanyPosting;
import me.variable.test.service.company.CompanyPostingService;

import java.util.Collection;

/**
 * Created by adi on 3/5/17.
 */
public class CompanyPostingResource extends Base {

    CompanyPostingService companyPostingService = CompanyPostingService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.POST, path = "companies/postings")
    public void createPosting(CompanyPosting companyPosting) {
        companyPostingService.addPosting(companyPosting);
    }

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = "companies/postings")
    public Collection<CompanyPosting> listAllPostings() {
        return companyPostingService.listPostings();
    }

}

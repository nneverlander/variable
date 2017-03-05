package me.variable.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * Created by adi on 3/4/17.
 */

@Api(
        name = "variable",
        version = "v1",
        namespace =
        @ApiNamespace(
                ownerDomain = "variable.me",
                ownerName = "variable.me",
                packagePath = ""
        ),
        issuers = {
                @ApiIssuer(
                        name = "firebase",
                        issuer = "https://securetoken.google.com/variable-160407",
                        jwksUri = "https://www.googleapis.com/robot/v1/metadata/x509/securetoken@system.gserviceaccount.com")
        }
)

public class Base {
}

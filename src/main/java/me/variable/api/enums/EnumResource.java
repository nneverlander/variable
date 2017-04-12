package me.variable.api.enums;

import com.google.api.server.spi.config.ApiMethod;
import me.variable.api.Base;
import me.variable.common.Constants;
import me.variable.service.enums.EnumService;

import java.util.Map;

/**
 * Created by adi on 3/5/17.
 */
public class EnumResource extends Base {

    EnumService enumService = EnumService.getInstance();

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = Constants.ENUMS_PATH)
    public Map<String, Map<String, String>> getAllEnums() {
        return enumService.getAll();
    }

}

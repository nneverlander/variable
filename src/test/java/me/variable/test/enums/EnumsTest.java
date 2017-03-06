package me.variable.test.enums;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.variable.common.Constants;
import me.variable.common.Enums;
import me.variable.service.enums.EnumService;
import me.variable.test.TestConstants;
import me.variable.test.util.HttpUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * Created by adi on 3/5/17.
 */
public class EnumsTest {

    EnumService enumService = EnumService.getInstance();
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testGetAllEnums() {
        try {
            Map<String, Map<String, String>> enums = enumService.getAll();
            Assert.assertNotNull("Enums is null", enums);
            Assert.assertEquals("Enums size is not 7", 7, enums.size());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testEnumResource() {
        String url = TestConstants.HOST + "/" + Constants.BASEPATH_EP_VARIABLE_V1 + "/" + Constants.ENUMS_PATH;
        try {
            String response = HttpUtil.sendGet(url).getResponse();
            JsonNode node = objectMapper.readTree(response);
            //random check
            JsonNode companyFunding = node.get(Enums.CompanyFunding.class.getSimpleName());
            String funding = companyFunding.get("BOOTSTRAPPED").asText(); //bootstrapped type
            Assert.assertEquals("Values don't match", "$1-$10000", funding);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }
}

package me.variable.test.util;

/**
 * Created by adi on 3/5/17.
 */
public class Response {

    private int respCode;
    private String response;

    public Response(int respCode, String response) {
        this.respCode = respCode;
        this.response = response;
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

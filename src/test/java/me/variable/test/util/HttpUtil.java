package me.variable.test.util;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by adi on 3/5/17.
 */
public class HttpUtil {

    public static void sendGet(String url) throws Exception {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();

        /*System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());*/

    }

    public static void sendPost(String url, String body) throws Exception {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");

        String [] urlSplit = url.split("\\?");
        String urlParameters = "";
        if (urlSplit.length == 2) {
            urlParameters = urlSplit[1];
        }

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.writeBytes(body);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        /*BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());*/

    }

}

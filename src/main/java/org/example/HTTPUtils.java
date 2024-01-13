package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HTTPUtils {

    private static HttpClient httpClient = HttpClientBuilder.create().build();

    public static String Get(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        HttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        return result;
    }

    public static String Post(String url, String data) throws IOException {
        ObjectMapper ob = new ObjectMapper();

        HttpPost request = new HttpPost(url);
        request.setHeader("Content-Type", "application/json;charset=UTF-8");
        StringEntity requestEntity = new StringEntity(ob.readValue(data, String.class), "UTF-8");
        request.setEntity(requestEntity);
        HttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity);
    }
}

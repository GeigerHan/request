package org.easy.request.browser;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.protocol.HttpContext;
import org.easy.request.Broswer;
import org.easy.request.response.Response;

/**
 * Created by hangu on 2015/8/23 0023.
 */
public class Chrome extends AbstractBroswer implements Broswer {

    public Chrome(CloseableHttpClient closeableHttpClient) {
        super(closeableHttpClient);
    }

    @Override
    protected HttpUriRequest setHeader(HttpUriRequest request){
    request.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36");
    return request;
    }
}

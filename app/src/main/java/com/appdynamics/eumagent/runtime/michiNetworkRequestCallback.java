package com.appdynamics.eumagent.runtime;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by michael.englert on 09.12.17.
 */

public class michiNetworkRequestCallback implements com.appdynamics.eumagent.runtime.NetworkRequestCallback {
    @Override
    public boolean onNetworkRequest(HttpRequestTracker httpRequestTracker) {
        String urlString = httpRequestTracker.getURL().toString();
        try {
            URL url = new URL("http://michi-checkout.com");
            if (urlString.contains("rest/cart/co")) {
                httpRequestTracker.withURL(url);
                return true;
            }
        } catch (MalformedURLException e) {
            return false;
        }
        return true;
    }
}

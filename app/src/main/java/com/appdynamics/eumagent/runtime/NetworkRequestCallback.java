package com.appdynamics.eumagent.runtime;

import com.appdynamics.eumagent.runtime.HttpRequestTracker;

/**
 * Created by michael.englert on 09.12.17.
 */

public interface NetworkRequestCallback {
    boolean onNetworkRequest(HttpRequestTracker httpRequestTracker);
}

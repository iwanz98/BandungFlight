package com.example.android.bandungflight.networks;

import android.content.Context;

/**
 * For LEARNING
 * Created by Ridwan Ismail on 23 April 2016
 * You can contact me at : ismail.ridwan98@gmail.com
 * -------------------------------------------------
 * Bandung Flight
 * com.example.android.bandungflight.networks
 * or see link for more detail http://bibucket.org/iwanz98/bandung-flight
 */

public class SignedUrl {
    private HttpParams mParams;
    private String mRequestUri;

    public SignedUrl(Context context, String requestUri) {
        mParams = new HttpParams();
        mRequestUri = requestUri;
    }

    public void addParam(String key, String value) {
        mParams.put(key, new HttpValues(value));
    }

    public String getSignedUrl() throws Exception {
        try {
            return mRequestUri + mParams.getQueryString();
        } catch (Exception e) {
            throw e;
        }
    }

    public String getSignedPost() throws Exception {
        try {
            return mParams.getQueryString();
        } catch (Exception e) {
            throw e;
        }
    }
}

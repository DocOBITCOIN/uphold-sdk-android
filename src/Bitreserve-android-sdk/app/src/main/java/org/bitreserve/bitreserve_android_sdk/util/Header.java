package org.bitreserve.bitreserve_android_sdk.util;

import android.util.Base64;
import org.bitreserve.bitreserve_android_sdk.config.GlobalConfigurations;
import java.util.HashMap;

/**
 * Header util.
 */

public class Header {

    /**
     * Generates an encoded string to be added to the http authentication header.
     *
     * @param user The username value for the http authentication.
     * @param password The password value for the http authentication.
     * @return The encoded string to be added to the authentication header.
     */

    public static String encodeCredentialsForBasicAuthorization(String user, String password) {
        final String userAndPassword = user + ":" + password;

        return "Basic " + Base64.encodeToString(userAndPassword.getBytes(), Base64.NO_WRAP);
    }

    /**
     * Returns the headers to be added to a http request.
     *
     * @return the header to be added to a http request.
     */

    public static HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();

        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        headers.put("User-Agent", "bitreserve-android-sdk " + GlobalConfigurations.BITRESERVE_SDK_VERSION + " (" + GlobalConfigurations.SDK_GITHUB_URL + ")");

        return headers;
    }

}

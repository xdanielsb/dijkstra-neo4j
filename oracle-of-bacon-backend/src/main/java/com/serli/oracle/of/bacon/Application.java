package com.serli.oracle.of.bacon;

import com.serli.oracle.of.bacon.api.APIEndPoint;
import net.codestory.http.WebServer;

import static com.serli.oracle.of.bacon.utils.Utils.getenv;

public class Application {

    public static void main(String[] args) {
        WebServer webServer = new WebServer();
        webServer.configure(routes -> {
            routes.add(new APIEndPoint());
        });

        String port = getenv("PORT", "8001");

        webServer.start(Integer.valueOf(port));
    }
}

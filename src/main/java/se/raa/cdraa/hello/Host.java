package se.raa.cdraa.hello;

import java.io.Serializable;

public class Host implements Serializable {

    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
}

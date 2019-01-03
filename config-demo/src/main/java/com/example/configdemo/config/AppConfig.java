package com.example.configdemo.config;

import com.example.configdemo.model.Person;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mini", ignoreInvalidFields = false, ignoreUnknownFields = true)
public class AppConfig {
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String securet) {
        this.secret = securet;
    }

    private String appId;
    private String secret;

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    private String channel_id;

//    public Open getOpen() {
//        return open;
//    }
//
//    public void setOpen(Open open) {
//        this.open = open;
//    }
//
//    private Open open;
//
//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
//
//    private Person person;

    public static class Open {
        private String deviceId;
        private String secret;
        private Integer channel;

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        public Integer getChannel() {
            return channel;
        }

        public void setChannel(Integer channel) {
            this.channel = channel;
        }
    }
}

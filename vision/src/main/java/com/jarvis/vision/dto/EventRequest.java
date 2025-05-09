package com.jarvis.vision.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventRequest {
    private String eventId;
    private String userId;
    private String anonymousId;
    private String sessionId;
    private String eventName;
    private String eventType; // e.g., custom, system, commerce
    private ZonedDateTime timestamp;

    private Map<String, Object> properties;
    private UserTraitsDTO userTraits;
    private EventContextDTO context;

    @Data
    public static class UserTraitsDTO {
        private String name;
        private String email;
        private String phone;
        private String location;
        private LocalDate signupDate;
    }

    @Data
    public static class EventContextDTO {
        private DeviceDTO device;
        private String platform; // web, ios, android
        private String ip;
        private String locale;
        private String timezone;
        private String network;
        private LocationDTO location;
        private String userAgent;
    }

    @Data
    public static class DeviceDTO {
        private String deviceId;
        private String model;
        private String os;
        private String osVersion;
        private String appVersion;
        private String sdkVersion;
    }

    @Data
    public static class LocationDTO {
        private Double lat;
        private Double lon;
    }
}
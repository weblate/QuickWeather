package com.ominous.quickweather.weather;

import com.ominous.tylerutils.annotation.JSONFieldName;

@SuppressWarnings("WeakerAccess")
public class OWMWeatherResponse {
    public double lat;
    public double lon;
    public String timezone;
    public OWMDataPoint current;
    public OWMDailyData[] daily;
    public OWMDataPoint[] hourly;
    public OWMAlert[] alerts;

    public static class OWMDataPoint {
        public long dt;
        public double temp;
        public int humidity;
        public double wind_speed;
        public int wind_deg;
        public double pressure;
        public double dew_point;
        public double uvi;
        public int clouds;
        public double pop;
        public OWMWeatherData[] weather;
        public OWMPrecipData rain;
        public OWMPrecipData snow;
    }

    public static class OWMAlert {
        public String sender_name;
        public String event;
        public int start;
        public int end;
        public String description;
    }

    public static class OWMDailyTemp {
        public double min;
        public double max;
    }

    public static class OWMDailyData {
        //public long dt;
        public OWMDailyTemp temp;
        //public int humidity;
        //public double wind_speed;
        //public int wind_deg;
        public double pop;
        public OWMWeatherData[] weather;
        public double rain;
        public double snow;
    }

    public static class OWMWeatherData {
        //public String main;
        public String icon;
        public String description;
    }

    public static class OWMPrecipData {
        @JSONFieldName(name="1h")
        public double volume;
    }

}
package com.ecnu.wisdomfarm.entity;

public class envInfo {
    double temperature;
    double humidity;
    double carbonDioxide;
    double illuminance;
    double soilTempe;
    double soilHumid;
    String timeStamp;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getCarbonDioxide() {
        return carbonDioxide;
    }

    public void setCarbonDioxide(double carbonDioxide) {
        this.carbonDioxide = carbonDioxide;
    }

    public double getIlluminance() {
        return illuminance;
    }

    public void setIlluminance(double illuminance) {
        this.illuminance = illuminance;
    }

    public double getSoilTempe() {
        return soilTempe;
    }

    public void setSoilTempe(double soilTempe) {
        this.soilTempe = soilTempe;
    }

    public double getSoilHumid() {
        return soilHumid;
    }

    public void setSoilHumid(double soilHumid) {
        this.soilHumid = soilHumid;
    }

    public envInfo(double temperature, double humidity, double carbonDioxide, double illuminance, double soilTempe, double soilHumid) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.carbonDioxide = carbonDioxide;
        this.illuminance = illuminance;
        this.soilTempe = soilTempe;
        this.soilHumid = soilHumid;
    }

    public envInfo() {
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override

    public String toString() {
        return "envInfo{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", carbonDioxide=" + carbonDioxide +
                ", illuminance=" + illuminance +
                ", soilTempe=" + soilTempe +
                ", soilHumid=" + soilHumid +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}

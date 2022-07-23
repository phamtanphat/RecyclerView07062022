package com.example.recyclerview07062022;

import java.util.List;

/**
 * Created by pphat on 7/19/2022.
 */
public class Food {
    private int image;
    private String name;
    private String address;
    private List<ServiceKind> serviceKindList;
    private String discount;
    private float distance;
    private int hourOpenTime;
    private int minutesOpenTime;
    private int hourCloseTime;
    private int minutesCloseTime;

    public Food() { }

    public Food(int image, String name, String address, List<ServiceKind> serviceKindList, String discount, float distance, int hourOpenTime, int minutesOpenTime, int hourCloseTime, int minutesCloseTime) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.serviceKindList = serviceKindList;
        this.discount = discount;
        this.distance = distance;
        this.hourOpenTime = hourOpenTime;
        this.minutesOpenTime = minutesOpenTime;
        this.hourCloseTime = hourCloseTime;
        this.minutesCloseTime = minutesCloseTime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ServiceKind> getServiceKindList() {
        return serviceKindList;
    }

    public void setServiceKindList(List<ServiceKind> serviceKindList) {
        this.serviceKindList = serviceKindList;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getHourOpenTime() {
        return hourOpenTime;
    }

    public void setHourOpenTime(int hourOpenTime) {
        this.hourOpenTime = hourOpenTime;
    }

    public int getMinutesOpenTime() {
        return minutesOpenTime;
    }

    public void setMinutesOpenTime(int minutesOpenTime) {
        this.minutesOpenTime = minutesOpenTime;
    }

    public int getHourCloseTime() {
        return hourCloseTime;
    }

    public void setHourCloseTime(int hourCloseTime) {
        this.hourCloseTime = hourCloseTime;
    }

    public int getMinutesCloseTime() {
        return minutesCloseTime;
    }

    public void setMinutesCloseTime(int minutesCloseTime) {
        this.minutesCloseTime = minutesCloseTime;
    }

    @Override
    public String toString() {
        return "Food{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", serviceKindList=" + serviceKindList +
                ", discount='" + discount + '\'' +
                ", distance=" + distance +
                ", hourOpenTime=" + hourOpenTime +
                ", minutesOpenTime=" + minutesOpenTime +
                ", hourCloseTime=" + hourCloseTime +
                ", minutesCloseTime=" + minutesCloseTime +
                '}';
    }
}

package com.software_design.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    int theatreId;
    String address;
    City city;
    List<Screen> screenList = new ArrayList<>();
    List<Show> showList = new ArrayList<>();

    public int getTheatreId() {
        return theatreId;
    }

    public String getAddress() {
        return address;
    }

    public City getCity() {
        return city;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}

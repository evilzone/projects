package com.software_design.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    int screenId;
    List<Show> showList = new ArrayList<>();

    public int getScreenId() {
        return screenId;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}

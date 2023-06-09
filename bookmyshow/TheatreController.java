package com.software_design.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {

    Map<City, List<Theatre>> cityToTheatreMap;
    List<Theatre> theatreList;

    public TheatreController() {
        cityToTheatreMap = new HashMap<>();
        theatreList = new ArrayList<>();
    }

    public void addTheatre(City city, Theatre theatre) {
        theatreList.add(theatre);

        List<Theatre> theatres = cityToTheatreMap.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);

        cityToTheatreMap.put(city, theatres);
    }


}

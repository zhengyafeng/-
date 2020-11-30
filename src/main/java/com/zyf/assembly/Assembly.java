package com.zyf.assembly;

import com.zyf.assembly.station.Station;

import java.util.List;

public interface Assembly {


    void registerStation();

    Assembly getStation(String name);

    List<Station> getStations();

}

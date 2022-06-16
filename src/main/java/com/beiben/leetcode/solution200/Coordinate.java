package com.beiben.leetcode.solution200;

import lombok.Data;

@Data
public class Coordinate {
    private int latitude;

    private int longitude;

    Coordinate(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

}

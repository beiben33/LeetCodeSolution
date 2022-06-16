package com.beiben.leetcode.solution200;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Solution {

    static Coordinate WATER = new Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public int numIslands(char[][] grid) {
        Map<Coordinate, Coordinate> landMap = new HashMap<>();


        for (int m = 0; m < grid.length; m++) {
            for (int n = 0 ; n < grid[m].length; n++) {
                Coordinate coordinate = new Coordinate(m, n);
                if (grid[m][n] == '1' && landMap.get(coordinate) == null) {
                    landMap.put(coordinate, coordinate);
                    nextLandStep(grid, landMap, coordinate, coordinate);
                } else {
                    landMap.put(coordinate, WATER);
                }
            }
        }

        return countLands(landMap);
    }

    private void nextLandStep(char[][] grid, Map<Coordinate, Coordinate> landMap, Coordinate current, Coordinate start) {
        //log.debug("current = {},{}", current.getLongitude(), current.getLatitude());
        //log.debug("start = {},{}", start.getLongitude(), start.getLatitude());
        int m = current.getLatitude();
        int n = current.getLongitude();
        if (n + 1 < grid[m].length) {
            Coordinate next = new Coordinate(m, n + 1);
            if (landMap.get(next) == null) {
                if (grid[m][n + 1] == '1') {
                    landMap.put(next, start);
                    nextLandStep(grid, landMap, next, start);
                } else {
                    landMap.put(next, WATER);
                }
            }
        }
        if (m + 1 < grid.length) {
            Coordinate next = new Coordinate(m + 1, n);
            if (landMap.get(next) == null) {
                if (grid[m + 1][n] == '1') {
                    landMap.put(next, start);
                    nextLandStep(grid, landMap, next, start);
                } else {
                    landMap.put(next, WATER);
                }
            }
        }
    }

    private int countLands(Map<Coordinate, Coordinate> landMap) {
        Map<Coordinate, Integer> lands = new HashMap<>();
        for (Coordinate coordinate : landMap.keySet()) {
            if (!lands.containsKey(landMap.get(coordinate)) && !landMap.get(coordinate).equals(WATER)) {
                lands.put(landMap.get(coordinate), 1);
            }
        }
        return lands.keySet().size();
    }
}

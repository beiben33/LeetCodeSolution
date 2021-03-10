package com.beiben;

import com.beiben.leetcode.solution131.StandardSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        ObjectMapper om = new ObjectMapper();
        log.info("start solution131");
        try {
            StandardSolution standardSolution = new StandardSolution();
            log.info(om.writeValueAsString(standardSolution.partition("aab")));
            standardSolution = new StandardSolution();
            log.info(om.writeValueAsString(standardSolution.partition("a")));
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        log.info("end solution131");
    }
}

package com.beiben;

import com.beiben.leetcode.solution131.Solution;
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
        Solution solution = new Solution();
        try {
            log.info(om.writeValueAsString(solution.partition("aab")));
            log.info(om.writeValueAsString(solution.partition("a")));
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        log.info("end solution131");
    }
}

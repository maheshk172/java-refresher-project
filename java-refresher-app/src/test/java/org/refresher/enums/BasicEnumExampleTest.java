package org.refresher.enums;

import org.junit.Test;

/**
 * Created by kulkamah on 2/7/2017.
 */
public class BasicEnumExampleTest {
    @Test
    public void compareLevel() throws Exception {
        BasicEnumExample enumExample = new BasicEnumExample();
        assert(enumExample.compareLevel(org.refresher.enums.Level.LOW)).contains("Low Volume");
    }

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }



}
package org.java8.features;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 * Created by kulkamah on 2/8/2017.
 */
public class DateTimeExamples {

    public static void main(String[] args) {

        Clock clock = Clock.systemDefaultZone();
        long milis = clock.millis();

        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant);

        System.out.println(milis);
        System.out.println(legacyDate);


    }

}

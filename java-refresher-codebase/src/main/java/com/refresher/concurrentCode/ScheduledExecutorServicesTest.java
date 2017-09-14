package com.refresher.concurrentCode;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServicesTest {
    public static void main(String[] args) throws IOException {
        ScheduledExecutorService ses =
                Executors.newScheduledThreadPool(1);
        Runnable pinger = new Runnable() {
            public void run() {
                System.out.println("PING!");
            }
        };

        ScheduledFuture future = ses.scheduleAtFixedRate(pinger, 5, 5, TimeUnit.SECONDS);
        System.out.println("Press X to cancel the ping ....");

        System.in.read();
        System.out.println("Interrupting ping...");
        future.cancel(true);


    }
}

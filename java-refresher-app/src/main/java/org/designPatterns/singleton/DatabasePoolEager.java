package org.designPatterns.singleton;

/**
 * Created by kulkamah on 2/10/2017.
 *
 * Eager Implementation:
 * ----------------------
 * This is Eager implementation, where instance is created well before somebody needs it
 * No Scope for Exception handling
 */
public class DatabasePoolEager {
    public static DatabasePoolEager databasepool = new DatabasePoolEager();

    private DatabasePoolEager() {

    }

    public static DatabasePoolEager getDatabasePool() {
        return DatabasePoolEager.databasepool;
    }

}

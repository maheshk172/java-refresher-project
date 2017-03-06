package org.designPatterns.singleton;

/**
 * Created by kulkamah on 2/10/2017.
 * Single Thread Singleton:
 * ----------------------
 * Adding Synchronized method to Static method makes its Thread Safe,
 * But performance downgraded.
 */

public class DatabasePoolThreadSafe {
    public static DatabasePoolThreadSafe databasepool;

    private DatabasePoolThreadSafe() {

    }

    /* Single Thread Singleton:
     * ----------------------
     * Adding Synchronized method to Static method makes its Thread Safe,
     * But performance downgraded.
     */
    public static synchronized DatabasePoolThreadSafe getDatabasePoolThreadSafe() {
        if (DatabasePoolThreadSafe.databasepool == null) {
            DatabasePoolThreadSafe.databasepool = new DatabasePoolThreadSafe();
        }
        return DatabasePoolThreadSafe.databasepool;
    }

    /* Double checked Locking - Thread safe Singleton:
     * -----------------------------------------------
     *
     * The Object creation is moved inside the Synchronized Block with Current Class used for
     * applying Locking
     */
    public static DatabasePoolThreadSafe getDatabasePoolThreadSafeDoubleChecked() {
        synchronized (DatabasePoolThreadSafe.class) {
            if (DatabasePoolThreadSafe.databasepool == null) {
                DatabasePoolThreadSafe.databasepool = new DatabasePoolThreadSafe();
            }
        }
        return DatabasePoolThreadSafe.databasepool;
    }

}

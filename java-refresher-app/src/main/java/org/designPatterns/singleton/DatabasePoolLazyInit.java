package org.designPatterns.singleton;

/**
 * Created by kulkamah on 2/10/2017.
 * Lazy Initialization:
 * ----------------------
 * The instance will be created when first time some client will request it
 */

public class DatabasePoolLazyInit {
    public static DatabasePoolLazyInit databasepool;

    private DatabasePoolLazyInit() {

    }

    public static DatabasePoolLazyInit getDatabasePool() {
        if(DatabasePoolLazyInit.databasepool == null) {
            DatabasePoolLazyInit.databasepool = new DatabasePoolLazyInit();
        }
        return DatabasePoolLazyInit.databasepool;
    }

}

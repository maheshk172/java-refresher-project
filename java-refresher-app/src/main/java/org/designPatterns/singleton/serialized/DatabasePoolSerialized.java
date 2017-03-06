package org.designPatterns.singleton.serialized;

import org.designPatterns.singleton.DatabasePoolLazyInit;

import java.io.Serializable;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class DatabasePoolSerialized implements Serializable {

    public static final long serialVersionUID = -7604766932017737115L;

    public static DatabasePoolSerialized databasepool;

    private DatabasePoolSerialized() {

    }

    public static DatabasePoolSerialized getDatabasePool() {
        if(DatabasePoolSerialized.databasepool == null) {
            DatabasePoolSerialized.databasepool = new DatabasePoolSerialized();
        }
        return DatabasePoolSerialized.databasepool;
    }

    // Implemented this to resolve issue, new object will not get created
    protected Object readResolve() {
        return getDatabasePool();
    }
}

package org.designPatterns.singleton;

/**
 * Created by kulkamah on 2/10/2017.
 * Static Block Initialization:
 * -----------------------------
 * This is same to Eager way, But we can do exception handling here.
 */
public class DatabasePoolStaticBlock {
    public static DatabasePoolStaticBlock databasepool;

    private DatabasePoolStaticBlock() {

    }

    static {
        try {
            databasepool = new DatabasePoolStaticBlock();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public static DatabasePoolStaticBlock getDatabasePool() {
        return DatabasePoolStaticBlock.databasepool;
    }

}

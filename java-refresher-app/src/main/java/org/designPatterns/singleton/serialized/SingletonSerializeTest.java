package org.designPatterns.singleton.serialized;


import java.io.*;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class SingletonSerializeTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DatabasePoolSerialized serialized1 = DatabasePoolSerialized.getDatabasePool();

        //writing to the file
        System.out.println("Before Writing to file, Hashcode: " + serialized1.hashCode());
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:\\backup_02_02_2017\\test.text"));
        out.writeObject(serialized1);
        out.close();

        //reading from file
        ObjectInput input = new ObjectInputStream(new FileInputStream("C:\\backup_02_02_2017\\test.text"));
        DatabasePoolSerialized serialized2 = (DatabasePoolSerialized)input.readObject();
        input.close();
        System.out.println("after reading from file, Hashcode: " + serialized2.hashCode());

        // outputs ->
        // Before Writing to file, Hashcode: 1956725890
        // after reading from file, Hashcode: 1828972342
        // To fix this, // protected Object readResolve() need to be implemented

    }
}

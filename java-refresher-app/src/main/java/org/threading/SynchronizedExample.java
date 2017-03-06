package org.threading;

/**
 * Created by kulkamah on 2/22/2017.
 */
public class SynchronizedExample {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("A");

        CharacterGenerator generator1 = new CharacterGenerator(buffer);
        CharacterGenerator generator2 = new CharacterGenerator(buffer);
        CharacterGenerator generator3 = new CharacterGenerator(buffer);

        generator1.setName("Generator 1");
        generator2.setName("Generator 2");
        generator3.setName("Generator 3");

        generator1.start();
        generator2.start();
        generator3.start();


    }
}


class CharacterGenerator extends Thread  {
    private StringBuffer buffer;
    public void run() {
        this.runnableLogic();
    }

    public synchronized void runnableLogic() {

            for(int i = 0; i<100; i++) {
                System.out.print(this.buffer);

                /** If the Thread does not sleep then its possible that the i value will be shared across
                 /*try {
                 Thread.sleep(150);
                 } catch(InterruptedException ex) {
                 ex.printStackTrace();
                 }*/
                System.out.println("Current Thread :" + Thread.currentThread().getName() + ", Value of i: " + i);
            }

            System.out.println("");
            int c = this.buffer.toString().trim().charAt(0) + 1;
            buffer.setCharAt(0, (char)c);

    }

    CharacterGenerator() {
        super();
    }

    CharacterGenerator(final StringBuffer buffer ) {
        this.buffer = buffer;
    }
}

package bg.tyvarna.java;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            PostBox o1 = new PostBox();
            o1.getMessage("dataIn.txt");

            System.out.println(o1.providerIdSort());
            System.out.println(o1.messageSort());

            o1.fillOut(o1.getInColl());
            o1.compose("dataOut.txt");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

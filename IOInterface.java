package bg.tyvarna.java;

import java.io.IOException;

public interface IOInterface {

    public void read(String fileName) throws IOException;
    public void write(String fileName) throws IOException;
}

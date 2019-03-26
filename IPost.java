package bg.tyvarna.java;

import java.io.IOException;

public interface IPost {

    public void compose(String fileName) throws IOException;
    public void getMessage(String fileName) throws IOException;
}

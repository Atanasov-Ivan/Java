package bg.tyvarna.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PostBox implements IPost {

    Collection<EMailImpl> inColl;
    Collection<EMailImpl> outColl;

    public PostBox() {

        inColl = new ArrayList<EMailImpl>();
        outColl = new ArrayList<EMailImpl>();
    }

    public Collection<EMailImpl> getInColl() {
        return inColl;
    }


    public Collection<EMailImpl> getOutColl() {
        return outColl;
    }

    public List<EMailImpl> providerIdSort() {

        List<EMailImpl> sortList = new ArrayList<EMailImpl>((Collection<? extends EMailImpl>) inColl);
        Collections.sort(sortList, new EmailIDComparator());
        return  sortList;
    }

    public List<EMailImpl> messageSort() {

        List<EMailImpl> sortList = new ArrayList<EMailImpl>((Collection<? extends EMailImpl>) inColl);
        Collections.sort(sortList, new EmailMessComparator());
        return  sortList;
    }

    public void fillOut(Collection<EMailImpl> fromColl) {
        outColl.addAll((Collection<? extends EMailImpl>) fromColl);
    }

    public void compose(String fileName) throws IOException {

        FileWriter fWriter = null;

        try {

            fWriter = new FileWriter(fileName);
            fWriter.write(outColl.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fWriter != null)
                fWriter.close();
        }
    }

    public void getMessage(String fileName) throws IOException {
        FileReader fReader = null;
        BufferedReader bReader = null;

        try {

            fReader = new FileReader(fileName);
            bReader = new BufferedReader(fReader);
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    String[] arg = line.split(" ");

                    //inColl.add(new EMailImpl(Integer.parseInt(arg[0]), arg[1], arg[2], arg[3]));
                    inColl.add(new EMailImpl(arg[0]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fReader != null)
                fReader.close();

            if (bReader != null)
                bReader.close();
        }
    }
}

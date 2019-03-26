package bg.tyvarna.java;

import java.util.Comparator;

public class EmailMessComparator implements Comparator<EMailImpl> {
    public int compare(EMailImpl o1, EMailImpl o2) {
        return o1.compareToMessage(o2.getEMailMessage());
    }
}

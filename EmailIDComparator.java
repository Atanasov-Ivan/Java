package bg.tyvarna.java;

import java.util.Comparator;

public class EmailIDComparator implements Comparator<EMailImpl> {

    public int compare(EMailImpl o1, EMailImpl o2) {
        return o1.compareToId(o2.getId());
    }
}

package example7;

import java.util.Comparator;

class LastNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Person)o1).getKeys()[0].compareTo(((Person)o2).getKeys()[0]);
    }
}

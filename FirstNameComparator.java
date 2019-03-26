package example7;

import java.util.Comparator;

class FirstNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Person)o1).getKeys()[1].compareTo(((Person)o2).getKeys()[1]);
    }
}

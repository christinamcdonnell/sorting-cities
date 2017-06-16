package org.launchcode.comparators;

import java.util.ArrayList;

/**
 * Created by Christy on 6/15/2017.
 */
public class CompoundComparator {
    ArrayList<City>

    public CompoundComparator() {
        this.comparators = new ArrayList<Comparator<City>>();
    }
    @Override
    public void compare(City 01, City 02) {
        int i = 0;
        int comparison;

        do {
            int comparison = this.comparators.get(i).compare(01, 02);
            i++;
        }while(comparison == 0 && i < this.comparators.size);
        return comparison;
    }

    @Override
    public void add (Comparator<City> city) {

    }
}

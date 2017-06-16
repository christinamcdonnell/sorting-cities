package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here

        //NameComparator comparator = new NameComparator();
        //cities.sort(comparator);
        //printCities(cities);

        //StateComparator state_comparator = new StateComparator();
        //cities.sort(comparator);
       // printCities(cities);

        PopulationComparator pop_comparator = new PopulationComparator();
        cities.sort(pop_comparator);
        //printCities(cities);

        //AreaComparator area_comparator = new AreaComparator();
        //cities.sort(comparator);
        printCities(cities);


        cc.add(comparator);
        cc.add(popComparator);
        cities.sort(cc);
    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}

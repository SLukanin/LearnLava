package Lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main6 {
    public static void main(String[] args) {
        LinkedList<Integer> lnList = new LinkedList<>();
        lnList.add(5);
        lnList.add(5);
        lnList.add(2);
        lnList.add(3);
        lnList.add(9);

        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(19);
        hSet.add(9);
        hSet.add(1);
        hSet.add(8);
        hSet.add(5);

        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        Collection<Integer> difference = utils.difference(lnList, hSet);

        //System.out.println(difference);
        System.out.println(utils.difference(hSet, lnList));

    }
}

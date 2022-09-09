package medium.myCalendar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class MyCalendar {
    TreeSet<int[]> books = new TreeSet<int[]>(Comparator.comparingInt((int[] a) -> a[0]));

    public boolean book(int start, int end) {
        int[] book = new int[]{start, end};
        int[] ceiling = books.ceiling(book);
        int[] floor = books.floor(book);
        if(floor!=null && floor[1] >start){ return false;}
        if(ceiling!=null && ceiling[0] <end){ return false;}
        books.add(book);
        return true;
    }
}

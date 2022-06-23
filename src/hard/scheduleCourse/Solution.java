package hard.scheduleCourse;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a, b)->a[1]-b[1]);
        PriorityQueue<Integer> takenCourses = new PriorityQueue<>((a,b)->b-a);
        int total = 0;
        for(int[] course : courses){
            total += course[0];
            takenCourses.add(course[0]);
            if(total > course[1]){ total -= takenCourses.poll(); }

        }
        return takenCourses.size();

    }
}

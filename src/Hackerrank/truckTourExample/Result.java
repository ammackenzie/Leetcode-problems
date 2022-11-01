package Hackerrank.truckTourExample;

import java.util.List;
import java.util.TreeSet;

public class Result {

    public static int truckTour(List<List<Integer>> petrolpumps) {
        for(int i=0; i< petrolpumps.size(); i++){
            if(canCompleteCircle(petrolpumps, i)) return i;
        }
        return -1;
    }

    public static boolean canCompleteCircle(List<List<Integer>> petrolpumps, int station){
        int tank = petrolpumps.get(station).get(0);
        int distance = petrolpumps.get(station).get(1);
        if(tank < distance) return false;
        tank-= distance;
        for(int s = station+1; s < petrolpumps.size()+station; s++){
            int index = s >=petrolpumps.size()? s - petrolpumps.size(): s;
            tank += petrolpumps.get(index).get(0);
            int nextDistance = petrolpumps.get(index).get(1);
            if(tank - nextDistance <= 0){
                //can't make it
                return false;
            }
            tank -= nextDistance;
        }
        return true;
    }
}

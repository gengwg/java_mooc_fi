
import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 

    public static double sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        // write code here
        return sum(list) * 1.0 / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);

        ArrayList<Double> deltaSquare = new ArrayList<Double>();
        for (Integer num : list) {
            deltaSquare.add((num - avg) * (num - avg));
        }

        double variance = 0.0;
        for (Integer num : list) {
            variance += (num - avg) * (num - avg);
        }
        variance /= list.size()-1;

        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}

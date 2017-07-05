import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        NHLStatistics.searchByPlayer("Sidney Crosby");  // prints stats of Jaromir Jagr

        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");  // Statistics of New York Rangers

        System.out.println("Statistics for Anaheim Ducks sorted by points:");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");  // Statistics of New York Rangers

    }
}

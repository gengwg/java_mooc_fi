/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wg
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Grade {

    //private int failed;
    private ArrayList<Integer> scores;
    private int[] grades;
    private Scanner reader; // = new Scanner(System.in);

    public Grade(Scanner reader) {
        this.reader = reader;
        this.scores = new ArrayList<Integer>();
        //this.failed = 0;
        this.grades = new int[6];
        for (int i = 0; i < this.grades.length; i++) {
            this.grades[i] = 0;
        }
    }

    public void getScores() {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = Integer.parseInt(this.reader.nextLine());
            if (score >= 0 && score <= 60) {
                this.scores.add(score);
            }

            if (score == -1) {
                break;
            }
        }

    }

    public int grader(int score) {

        if (score < 30) {
            return 0;
        }

        if (score < 35) {
            return 1;
        }
        if (score < 40) {
            return 2;
        }

        if (score < 45) {
            return 3;
        }

        if (score < 50) {
            return 4;
        }

        return 5;

    }

    public void gradeGiver() {
        for (int score : this.scores) {
            int grade = grader(score);
            this.grades[grade]++;
        }
    }

    public double accPercentage() {

        if (this.scores.isEmpty()) {
            return 0.0;
        }

        return (this.scores.size() - this.grades[0]) * 100 / this.scores.size();

    }

    public void printGrades() {

        System.out.println("Grade distribution:");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ":");
            for (int j = 0; j < this.grades[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("Acceptance Percentage: " + accPercentage());
    }
}

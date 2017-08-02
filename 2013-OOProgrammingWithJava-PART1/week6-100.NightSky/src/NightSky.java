/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wg
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint; 
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        
        Random rand = new Random();
 

        for (int i = 0; i < this.width; i++) {
            if (rand.nextDouble() < this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");

    }
    
    public void print() {
        this.starsInLastPrint = 0; // reset this to 0 before each print!!
        for (int j = 0; j < this.height; j ++) {
            this.printLine();
        }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }

}

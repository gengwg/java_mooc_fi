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

public class BirdDB {
    
    private ArrayList<Bird> birds;
    private Scanner reader;
    
    public BirdDB(Scanner reader) {
        this.birds = new ArrayList<Bird>();
        this.reader = reader;
    }
    
    public void Add(String name, String latinName) {
        Bird newbird = new Bird(name, latinName);
        this.birds.add(newbird);
    }
    
    public void Observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.Observe();
                return;
            }
        }
        
        System.out.println("Is not a bird!");
    }
    
    public void Statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void Show(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
    }
    
    public void getBirds() {
        while (true) {
            System.out.print("? ");
            String input = this.reader.nextLine();
            if (input.toLowerCase().equals("add")) {
                System.out.print("Name: ");
                String name = this.reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = this.reader.nextLine();
                this.Add(name, latinName);
            } else if (input.toLowerCase().equals("observation")) {
                System.out.print("What was observed:?");
                String name = this.reader.nextLine();
                this.Observation(name);
            } else if (input.toLowerCase().equals("statistics")) {
                this.Statistics();
            } else if (input.toLowerCase().equals("show")) {
                System.out.print("What? ");
                String name = this.reader.nextLine();
                this.Show(name);
            } else if (input.equals("Quit")) {
                break;
            }
        }
    }
    
}

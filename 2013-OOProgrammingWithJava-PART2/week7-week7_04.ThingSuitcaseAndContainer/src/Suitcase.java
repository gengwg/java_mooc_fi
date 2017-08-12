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

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;
    //private int totalWeight;

    public Suitcase(int weightLimit) {
        this.maxWeight = weightLimit;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    public int totalWeight() {
        int total_weight = 0;
        for (Thing th : this.things) {
            total_weight += th.getWeight();
        }

        return total_weight;
    }

    public void printThings() {
        for (Thing th : this.things) {
            System.out.println(th);
        }

    }

    public Thing heaviestThing() {

        if (this.things.isEmpty()) {
            return null;
        }

        Thing heaviest_thing = this.things.get(0);
        for (Thing thing : this.things) {
            if (thing.getWeight() > heaviest_thing.getWeight()) {
                heaviest_thing = thing;
            }
        }
        return heaviest_thing;
    }

    public String toString() {
        if (things.isEmpty()) {
            return "empty (0 kg)";
        } else if (things.size() == 1) {
            return this.things.size() + " thing " + "(" + this.totalWeight() + " kg)";
        }

        return this.things.size() + " things " + "(" + this.totalWeight() + " kg)";
    }
}

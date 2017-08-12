/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wg
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class Airport {

    HashMap<String, Plane> planes;
    //private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public Airport() {
        // this.planes = new ArrayList<Plane>();
        this.planes = new HashMap<String, Plane>();
        this.flights = new ArrayList<Flight>();
    }

    public void addPlane(Plane plane) {
        this.planes.put(plane.getId(), plane);
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public Collection<Plane> getPlanes() {
        return this.planes.values();
    }

    public void printPlanes() {
        for (Plane plane : this.planes.values()) {
            System.out.println(plane);;
        }
    }

    public void printFlights() {
        for (Flight flt : this.flights) {
            System.out.println(flt);
        }
    }

    public Plane getPlane(String id) {
        return this.planes.get(id);
    }
}

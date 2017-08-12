/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wg
 */
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Airport airport;

    public TextUserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    public void start() {

        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        while (true) {
            printAirportInstructions();
            String cmd = this.reader.nextLine();
            if (cmd.equals("x")) {
                System.out.println("");
                break;
            } else if (cmd.equals("1")) {
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(this.reader.nextLine());
                Plane newPlane = new Plane(id, capacity);
                this.airport.addPlane(newPlane);
                System.out.println("");
            } else if (cmd.equals("2")) {
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine();
                System.out.print("Give departure airport code: ");
                String depart = this.reader.nextLine();
                System.out.print("Give destination airport code: ");
                String dest = this.reader.nextLine();
                Flight newFlight = new Flight(this.airport.getPlane(id), depart, dest);
                this.airport.addFlight(newFlight);
                System.out.println("");

            } else {
                System.out.println("Unknown statement");
            }
        }

        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println("");
        while (true) {
            printFlightInstructions();
            String cmd = this.reader.nextLine();
            if (cmd.equals("x")) {
                System.out.println("");
                break;
            } else if (cmd.equals("1")) {
                this.airport.printPlanes();
                System.out.println("");
            } else if (cmd.equals("2")) {
                this.airport.printFlights();
                System.out.println("");

            } else if (cmd.equals("3")) {
                System.out.println("Give plane ID: ");
                String id = this.reader.nextLine();
                System.out.println(this.airport.getPlane(id));
            } else {
                System.out.println("Unknown statement");
            }
        }

    }

    private static void printAirportInstructions() {
        System.out.print("Choose operation:\n"
                + "[1] Add airplane\n"
                + "[2] Add flight\n"
                + "[x] Exit\n"
                + "> ");
    }

    private static void printFlightInstructions() {
        System.out.print("Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit\n"
                + "> ");
    }

}

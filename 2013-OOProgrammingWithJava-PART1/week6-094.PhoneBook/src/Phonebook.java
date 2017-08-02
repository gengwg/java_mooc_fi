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

public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<Person>();
    
    public Phonebook() {
    }
    
    public void add (String name, String number) {
        // Person p = new Person(name, number);
        // this.persons.add(p);
        this.persons.add(new Person(name, number));
    }
    
    public void printAll() {
        for (Person p : this.persons) {
            System.out.println(p);
        }
    }
    
    public String searchNumber(String searchName) {
        for (Person p : this.persons) {
            if ( p.getName().equals(searchName) ) {
                return p.getNumber();
            }
        }
        
        return "number not known";
    }
}

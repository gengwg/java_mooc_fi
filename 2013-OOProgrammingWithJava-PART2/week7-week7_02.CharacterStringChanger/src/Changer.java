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

public class Changer {
    private ArrayList<Change> changes;
    
    public Changer () {
        this.changes = new ArrayList<Change>();
    }
    
    public void addChange(Change chng) {
        this.changes.add(chng);
    }
    
    public String change (String charString) {
        String word = charString;
        for (Change chng : changes) {
            word = chng.change(word);
        }
        return word;
    }
}

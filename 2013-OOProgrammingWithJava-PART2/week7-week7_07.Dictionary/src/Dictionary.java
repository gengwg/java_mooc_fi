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

public class Dictionary {

    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }

    public String translate(String word) {
        return this.dict.get(word);
    }

    public void add(String word, String translation) {
        this.dict.put(word, translation);
    }

    public int amountOfWords() {
        return this.dict.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translation_list = new ArrayList<String>();

        for (String key : this.dict.keySet()) {
            translation_list.add(key + " = " + this.dict.get(key));
        }

        return translation_list;
    }

}

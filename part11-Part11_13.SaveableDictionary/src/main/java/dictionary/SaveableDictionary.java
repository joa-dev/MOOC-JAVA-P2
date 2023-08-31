/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joa-dev
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(file)).map(row -> row.split(":")).forEach(row -> {
                dictionary.put(row[0], row[1]);
                dictionary.put(row[1], row[0]);
            });
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void delete(String word) {
        String translation = dictionary.get(word);
        dictionary.remove(word);
        dictionary.remove(translation);
    }

    public boolean save() {
        try {
            ArrayList<String> temp = new ArrayList<>();
            FileWriter writer = new FileWriter(file);

            for (String key : dictionary.keySet()) {
                if (!temp.contains(key + ":" + dictionary.get(key))) {
                    if (!temp.contains(dictionary.get(key) + ":" + key)) {
                        temp.add(key + ":" + dictionary.get(key));
                    }
                }
            }
            temp.stream().forEach(row -> {
                try {
                    writer.write(row + "\n");
                } catch (IOException e) {
                    System.out.println(e);
                }
            });
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}

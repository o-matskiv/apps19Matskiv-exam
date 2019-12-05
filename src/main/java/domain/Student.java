package domain;

import json.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class Student extends BasicStudent {
    private ArrayList<Tuple<String, Integer>> exams;

    public Student(String name, String surname, Integer year, Tuple<String, Integer>... exams) {
        super(name, surname, year);
        this.exams = new ArrayList<>();
        for (Tuple<String, Integer> exam : exams) {
            this.exams.add(exam);
        }
    }

    public JsonObject toJsonObject() {
        // ToDo
        return null;
    }
}

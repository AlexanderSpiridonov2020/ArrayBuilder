package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator(10000,10000);
        fileCreator.create();
        FileReaderToList fileReaderToList = new FileReaderToList(10000);
        ArrayList<Integer> arrayList = fileReaderToList.read();
        Calculator calculator = new Calculator();
        calculator.sum(arrayList);
        calculator.subZero(arrayList);
        calculator.aboveZero(arrayList);
        calculator.minElement(arrayList);
        calculator.maxElement(arrayList);


    }

}

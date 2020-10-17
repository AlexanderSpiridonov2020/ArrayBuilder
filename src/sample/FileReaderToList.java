package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class FileReaderToList {
    int n;
    FileReaderToList (int a){
        n = a;
    }


    ArrayList<Integer> read() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            File file = new File("src\\resources\\inputData.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            for (int i = 0; i < 2; i++) {
                try {
                    arrayList.add(Integer.parseInt(bufferedReader.readLine()));
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arrayList;
    }


}

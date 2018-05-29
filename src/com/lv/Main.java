package com.lv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws  Exception {
        ArrayList<HotSpot> hotSpots = Utils.getAllHotspots();

        File fileFolder = new File("C:\\E\\dataSet\\2018-05-29\\8点时间段");
        File[] files = fileFolder.listFiles();
        for (File file : files) {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                double x = Double.parseDouble(data[0]);

            }
        }
    }

}

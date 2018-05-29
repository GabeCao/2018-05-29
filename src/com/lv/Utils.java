package com.lv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Utils {

    public static ArrayList<HotSpot> getAllHotspots() throws Exception{
        ArrayList<HotSpot> hotSpotArrayList = new ArrayList<>();
        File fileFolder = new File("C:\\E\\dataSet\\2018-05-29\\hotspot.txt");
        FileReader fileReader = new FileReader(fileFolder);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            double x = Double.parseDouble(data[0]);
            double y = Double.parseDouble(data[1]);
            int number = Integer.parseInt(data[2]);
            HotSpot hotSpot = new HotSpot(x, y,number);
            hotSpotArrayList.add(hotSpot);
        }
        return hotSpotArrayList;
    }

    //判断 Point 和 HotSpot 点之间的距离
    public static double getDistanceBetweenAndPointAndHotSpot(Point p1, HotSpot p2) {
        return Math.sqrt(Math.abs((p1.getX() - p2.getX())* (p1.getX() - p2.getX())+(p1.getY() - p2.getY())* (p1.getY() - p2.getY())));
    }

}

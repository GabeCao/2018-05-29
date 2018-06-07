package com.lv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractData {
    //获取每个时间段的数据
    public static void main(String[] args) throws Exception {

        File fileFolder = new File("C:\\E\\dataSet\\2018-05-29\\四秒\\sensor数据四秒");
        File[] files = fileFolder.listFiles();

        for (File file : files) {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            Date start = simpleDateFormat.parse("21:00:00");
            Date end   = simpleDateFormat.parse("22:00:00");

            File outFile = new File("C:\\E\\dataSet\\2018-05-29\\四秒\\时间段\\21是时间段\\" + file.getName());
            FileWriter fileWriter = new FileWriter(outFile, true);
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Date date = simpleDateFormat.parse(data[2]);
                if (date.after(start) && date.before(end) || date.equals(start)) {
                    fileWriter.write(line + "\n");
                }

            }
            fileWriter.close();
            System.out.println(file.getName());
        }
    }
}

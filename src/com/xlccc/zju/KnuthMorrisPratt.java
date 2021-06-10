package com.xlccc.zju;


import java.io.*;
import java.util.HashMap;

/**
 * KMP字符串查找算法
 */
public class KnuthMorrisPratt {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "/resources/音型码.txt";
        File file = new File(filePath);
        HashMap<String, String> frequencyMap = new HashMap<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String str = null;
            while ((str = in.readLine()) != null) {
                String[] split = str.split(":");
                String key = split[0].replace("'","");
                String value = split[1].trim().replace("'","").replace(",","");
                frequencyMap.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

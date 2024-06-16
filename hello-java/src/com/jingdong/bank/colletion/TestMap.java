package com.jingdong.bank.colletion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {

        // Hash  是散列无序的
        System.out.println("HashMap  散列无序-------");
        Map<String,String> mapHash = new HashMap<>();
        extractedAddData(mapHash);

        System.out.println("LinkedHashMap 根据put进行排序-------");
        Map<String,String> mapLinkedHash = new LinkedHashMap<>();
        extractedAddData(mapLinkedHash);


        System.out.println("TreeMap 根据KEY进行升序排序-------");
        Map<String,String> mapTreeMap = new TreeMap<>();
        extractedAddData(mapTreeMap);

    }

    private static void extractedAddData(Map<String,String> map) {

        map.put("hello","hhhh");
        map.put("world","wwwww");
        map.put("good", "ggg");
        map.put("morning", "mmmmm");

        // map 如果KEY相同，新KEY会把老KEY和老KEY对应的值覆盖
        map.put("good", "ddd");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();

            System.out.println("key:"+ key + "  val:" + val);
        }
    }

}

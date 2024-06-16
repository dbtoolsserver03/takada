package com.jingdong.bank.colletion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {

        //List<String> strLst = new ArrayList<String>();

        // Hash  是散列无序的
        System.out.println("HashSet  散列无序-------");
        Set<String> setHash = new HashSet<>();
        extractedAddData(setHash);

        System.out.println("LinkedHashSet 根据add进行排序-------");
        Set<String> setLinkedHash = new LinkedHashSet<>();
        extractedAddData(setLinkedHash);


        System.out.println("TreeSet 根据KEY进行升序排序-------");
        Set<String> setTreeSet = new TreeSet<>();
        extractedAddData(setTreeSet);

    }

    private static void extractedAddData(Set<String> set) {



        set.add("hello");
        set.add("world");
        set.add("good");
        set.add("morning");

        // set 如果KEY相同，新KEY会把老KEY覆盖
        set.add("good");
        for (String str : set) {
            System.out.println(str);
        }
    }

}

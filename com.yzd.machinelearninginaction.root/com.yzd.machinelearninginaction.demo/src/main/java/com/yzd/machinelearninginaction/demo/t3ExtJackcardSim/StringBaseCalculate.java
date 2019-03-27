package com.yzd.machinelearninginaction.demo.t3ExtJackcardSim;

import java.util.HashSet;
import java.util.Set;

public class StringBaseCalculate {
    /**
     * 把reducebykey的结果中的value　进行统计（reducebykey((a, b) => a+' '+b)） 尽量多一个空格
     * @param s
     * @return
     */
    public static Set<String> getHashKey(final String s){
        Set<String> all = new HashSet<>();
        String[] strings = s.split("\\s+");
        for (String string : strings) {
            all.add(string);
        }
        return all;

    }
}

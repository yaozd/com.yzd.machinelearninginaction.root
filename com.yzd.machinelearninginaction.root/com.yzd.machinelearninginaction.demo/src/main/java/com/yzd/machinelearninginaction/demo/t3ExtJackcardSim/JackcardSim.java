package com.yzd.machinelearninginaction.demo.t3ExtJackcardSim;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bee on 17/4/12.
 */
public class JackcardSim {

    public static double calJackcardSim(Set<String> s1, Set<String> s2) {

        Set<String> all = new HashSet<>();
        all.addAll(s1);
        all.addAll(s2);
        System.out.println(all);
        Set<String> both = new HashSet<>();
        both.addAll(s1);
        both.retainAll(s2);
        System.out.println(both);

        return (double) both.size() / all.size();

    }

    /**
     * Jackcard相似度和余弦相似度(向量空间模型)的java实现
     * https://blog.csdn.net/napoay/article/details/69945833
     * @param args
     */
    public static void main(String[] args) {

        Set<String> s1 = new HashSet<String>();
        s1.add("互联网");
        s1.add("金融");
        s1.add("房产");
        s1.add("融资");
        s1.add("科技");

        Set<String> s2 = new HashSet<String>();
        s2.add("互联网");
        s2.add("开源");
        s2.add("人工智能");
        s2.add("软件");
        s2.add("科技");

        System.out.println(calJackcardSim(s1, s2));

    }
}

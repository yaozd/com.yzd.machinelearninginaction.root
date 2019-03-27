package com.yzd.machinelearninginaction.demo.t3ExtJackcardSim;

import java.util.Set;

public class Recommend {
    //推荐函数
    private String[] products ;
    private double[] simMatrix;
    //
    //
    public void fic(String s, String[] products) {
        this.products=products;
        this.simMatrix = getSimilarity(s, products);
    }

    //
    private double[] getSimilarity(String s, String[] products) {

        int productSize = products.length;
        double[] res = new double[productSize];
        for (int j = 0; j < productSize; j++) {
            Set<String> s1 = StringBaseCalculate.getHashKey(s);
            Set<String> s2 = StringBaseCalculate.getHashKey(products[j]);
            res[j] = JackcardSim.calJackcardSim(s1, s2);
        }
        return res;
    }

    public String[] getProducts() {
        return products;
    }

    public double[] getSimMatrix() {
        return simMatrix;
    }
}

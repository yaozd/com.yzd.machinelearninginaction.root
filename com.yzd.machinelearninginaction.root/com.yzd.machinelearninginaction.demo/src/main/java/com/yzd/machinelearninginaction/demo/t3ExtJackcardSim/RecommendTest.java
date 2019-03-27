package com.yzd.machinelearninginaction.demo.t3ExtJackcardSim;

public class RecommendTest {
    public static void main(String[] args) {
        //利用物品的内容属性计算物品之间的相似度
        String[] products = {"dog cate pen cake pie","dog cat water coco","pie cake pen cate"};
        //String s = "pie cake pen cate";
        String s = "pie";
        Recommend rec = new Recommend();
        rec.fic(s,products);
        int length=rec.getProducts().length;
        for (int i = 0; i < length ; i++) {
            System.out.println(rec.getProducts()[i]+"，相似度="+rec.getSimMatrix()[i]);
        }
    }
}

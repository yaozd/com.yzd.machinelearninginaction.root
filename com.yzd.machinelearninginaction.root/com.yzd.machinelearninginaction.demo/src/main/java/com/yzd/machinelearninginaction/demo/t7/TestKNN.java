package com.yzd.machinelearninginaction.demo.t7;


import com.yzd.machinelearninginaction.demo.t4.LoadData;
import com.yzd.machinelearninginaction.demo.utils.FileUtil2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * KNN算法测试类
 *
 * @author Rowen
 * @qq 443773264
 * @mail luowen3405@163.com
 * @blog blog.csdn.net/luowen3405
 * @data 2011.03.25
 */
public class TestKNN {

    /**
     * 从数据文件中读取数据
     *
     * @param datas 存储数据的集合对象
     * @param path  数据文件的路径
     */
    public void read(List<List<Double>> datas, String path) {
        try {
            BufferedReader br = new BufferedReader(FileUtil2.getReader(path));
            String data = br.readLine();
            List<Double> l = null;
            while (data != null) {
                String t[] = data.split("    ");
                l = new ArrayList<Double>();

                for (int i = 0; i < t.length; i++) {

                    l.add(Double.parseDouble(t[i]));
//                    System.out.println(l);
                }
                datas.add(l);
                data = br.readLine();

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 程序执行入口
     *
     * @param args
     */
    public static void main(String[] args) {
        TestKNN t = new TestKNN();
        String datafile = "t7/datafile.txt";
        String testfile = "t7/testfile.txt";
//        System.out.println(datafile);
        try {
            List<List<Double>> datas = new ArrayList<List<Double>>();
            List<List<Double>> testDatas = new ArrayList<List<Double>>();
            t.read(datas, datafile);
            t.read(testDatas, testfile);
//            System.out.println(datas);
            KNN knn = new KNN();
            for (int i = 0; i < testDatas.size(); i++) {
                List<Double> test = testDatas.get(i);
                System.out.print("测试元组: ");
                for (int j = 0; j < test.size(); j++) {
                    System.out.print(test.get(j) + " ");
                }
                System.out.print("类别为: ");
                System.out.println(Math.round(Float.parseFloat((knn.knn(datas, test, 3)))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class Resource {
        public InputStreamReader getInputStreamReader(String file) {
            InputStream in = this.getClass().getClassLoader().getResourceAsStream(file);
            try {
                return new InputStreamReader(in, "utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
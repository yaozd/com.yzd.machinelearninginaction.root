package com.yzd.machinelearninginaction.demo.t2;
/*
主类
 */

import java.io.IOException;

public class LRMain {
    //GITHUB
    //https://github.com/shiluqiang/Logistic_Regression_java
    //https://github.com/yaozd/Logistic_Regression_java
    //来源：
    //【机器学习】Logistic Regression逻辑回归原理与java实现
    //https://blog.csdn.net/Luqiang_Shi/article/details/86440197
    //感谢作者：Luqiang_Shi
    public static void main(String[] args) throws IOException {
        // filename
        String filename = "t2/data.txt";
        // 导入样本特征和标签
        double[][] feature = LoadData.Loadfeature(filename);
        double[] Label = LoadData.LoadLabel(filename);
        // 参数设置
        int samNum = feature.length;
        int paraNum = feature[0].length;
        //学习率 Learning Rate(属于超参，需要人工调整)
        double rate = 1.1;
        //double rate = 0.01;
        //最大循环次数，理论上：循环次数越大误差会越小(属于超参，需要人工调整)
        int maxCycle = 1000;
        // LR模型训练
        LRtrainGradientDescent LR = new LRtrainGradientDescent(feature, Label, paraNum, rate, samNum, maxCycle);
        double[] W = LR.Updata(feature, Label, maxCycle, rate);
        //保存模型
        String model_path = "wrights.txt";
        SaveModel.savemodel(model_path, W);
        //模型测试
        double[] pre_results = LRTest.lrtest(paraNum, samNum, feature, W);
        //保存测试结果
        String results_path = "pre_results.txt";
        SaveModel.saveresults(results_path, pre_results);
    }

}

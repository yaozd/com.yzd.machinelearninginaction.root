# [Softmax Regression算法原理与java实现](https://blog.csdn.net/Luqiang_Shi/article/details/86487151)
> GITHUB-CODE
- [https://github.com/shiluqiang/Softmax-Regression-java](https://github.com/shiluqiang/Softmax-Regression-java)
- [https://github.com/yaozd/Softmax-Regression-java](https://github.com/yaozd/Softmax-Regression-java)备份

# Softmax-Regression-java-线性多分类器

LoadData.java---导入样本特征与标签。

SRtrainGradientDescent.java---利用梯度下降法训练模型。

SRTest.java---样本测试。

SaveModelResults.java---保存模型权重矩阵与测试结果。

SRMain.java---主类。
> Softmax回归 VS k个二元分类器（LR逻辑回归）区别
- 来源[Softmax回归（Softmax Regression）](https://www.cnblogs.com/BYRans/p/4905420.html)
```
举例说明：
如果你在开发一个音乐分类的应用，需要对k种类型的音乐进行识别，那么是选择使用softmax分类器呢，还是使用logistic回归算法建立 k个独立的二元分类器呢？
这一选择取决于你的类别之间是否互斥，例如，如果你有四个类别的音乐，分别为：古典音乐、乡村音乐、摇滚乐和爵士乐，
那么你可以假设每个训练样本只会被打上一个标签（即：一首歌只能属于这四种音乐类型的其中一种），
此时你应该使用类别数 k = 4 的softmax回归。（如果在你的数据集中，有的歌曲不属于以上四类的其中任何一类，那么你可以添加一个“其他类”，并将类别数 k 设为5。）
如果你的四个类别如下：人声音乐、舞曲、影视原声、流行歌曲，那么这些类别之间并不是互斥的。例如：一首歌曲可以来源于影视原声，同时也包含人声 。
这种情况下，使用4个二分类的logistic回归分类器更为合适。这样，对于每个新的音乐作品 ，我们的算法可以分别判断它是否属于各个类别。

---------------------
例子：
如手写字的识别，即识别{0,1,2,3,4,5,6,7,8,9}中的数字
https://www.cnblogs.com/wanshuai/p/9104518.html
```
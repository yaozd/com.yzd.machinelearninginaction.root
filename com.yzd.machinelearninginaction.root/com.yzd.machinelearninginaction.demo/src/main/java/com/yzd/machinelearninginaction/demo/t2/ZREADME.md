# [Logistic_Regression_java](https://github.com/shiluqiang/Logistic_Regression_java)
LoadData.java---样本特征与样本标签导入

LRtrainGradientDescent.java---基于梯度下降法的模型训练

Sigmoid.java---Sigmoid函数

LRTest.java---模型训练

SavaModel---模型参数与预测结果存储

data.txt---样本特征与标签存储文件

> 关键参数--调整
```

```

> Logistic Regression逻辑回归
- [【机器学习】Logistic Regression逻辑回归原理与java实现](https://blog.csdn.net/Luqiang_Shi/article/details/86440197)-推荐参考byArvin
    - [java实现](https://github.com/shiluqiang/Logistic_Regression_java)
- [逻辑回归的数学推导及java代码实现](https://blog.csdn.net/ygq114/article/details/78838247)
- []()
- []()
> GITHUB
- [https://github.com/shiluqiang/Logistic_Regression_java](https://github.com/shiluqiang/Logistic_Regression_java)
- [https://github.com/yaozd/Logistic_Regression_java](https://github.com/yaozd/Logistic_Regression_java)-备份

```
基于概率的机器学习算法
机器学习算法可以分为基于概率、基于距离、基于树和基于神经网络四类。基于概率的机器学习算法本质上是计算每个样本属于对应类别的概率，然后利用极大似然估计法对模型进行训练。基于概率的机器学习算法的损失函数为负的log似然函数。
基于概率的机器学习算法包括朴素贝叶斯算法、Logistic Regression算法、Softmax Regression算法和Factorization Machine算法等。
--------------------- 
因子分解机（Factorization Machine）与Logistic Regression算法和Softmax Regression算法一样，都是基于概率的机器学习算法。
不同的是，
LR算法适用于线性二分类问题，
SR算法适用于线性多分类问题，
FM算法适用于非线性二分类问题。
因为在因子分解机模型中，不仅包含了每个特征的线性权重，也包含了非线性的交叉项，利用矩阵分解的方法构造两个不同特征之间的相互关系（参考资料1）。
--------------------- 
作者：Luqiang_Shi 
来源：CSDN 
原文：https://blog.csdn.net/Luqiang_Shi/article/details/86440197 
版权声明：本文为博主原创文章，转载请附上博文链接！
```
> 参考推荐
- [理解深度学习中的学习率及多种选择策略](https://baijiahao.baidu.com/s?id=1591271039698173396)
```
什么是学习速率？
学习速率是指导我们该如何通过损失函数的梯度调整网络权重的超参数。学习率越低，损失函数的变化速度就越慢。虽然使用低学习率可以确保我们不会错过任何局部极小值，但也意味着我们将花费更长的时间来进行收敛，特别是在被困在高原区域的情况下。
下述公式表示了上面所说的这种关系。
new_weight = existing_weight — learning_rate * gradient

不同学习速率对收敛的影响（图片来源：cs231n）
此外，学习速率对模型收敛到局部极小值（也就是达到最好的精度）的速度也是有影响的。因此，从正确的方向做出正确的选择意味着我们可以用更短的时间来训练模型。
Less training time, lesser money spent on GPU cloud compute. :)

有更好的方法选择学习速率吗？
在「训练神经网络的周期性学习速率」[4] 的 3.3 节中，Leslie N. Smith 认为，用户可以以非常低的学习率开始训练模型，
在每一次迭代过程中逐渐提高学习率（线性提高或是指数提高都可以），用户可以用这种方法估计出最佳学习率。
```
- []()
- []()
- []()
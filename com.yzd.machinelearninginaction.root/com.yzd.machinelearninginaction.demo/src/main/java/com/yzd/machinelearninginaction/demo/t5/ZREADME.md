> GITHUB CODE-请移步到此项目
- [https://github.com/yaozd/RecommendSystem](https://github.com/yaozd/RecommendSystem)

# 基于奇异值分解（SVD）的协同过滤推荐算法及python实现
- [基于奇异值分解（SVD）的协同过滤推荐算法及python实现](https://blog.csdn.net/Luqiang_Shi/article/details/87885680)
- [SVD在推荐系统中的应用](http://yanyiwu.com/work/2012/09/10/SVD-application-in-recsys.html)理论
> 数据背景
  
  （1）样本数据
  
  本次样本数据是11*11，其中行表示用户，列表示食品，中间数字表示该用户对食品的打分。如果数字为0，表示该用户没有吃过该食品。本次模型的目的就是向用户推荐未吃过的食品。
  
  
  （2）推荐思路
  
  首先，寻找用户未评价的食品，即用户-矩阵中的0值；
  
  再次，对用户未打分的食品，通过相似度计算预计其可能会打多少分数；
  
  最后，对这些打分的食品根据评分从高到低进行排序，返回前N个食品，这就是推荐结果。
> 
> 感谢-liujm7

> GITHUB CODE
- [https://github.com/liujm7/RecommendSystem](https://github.com/liujm7/RecommendSystem)
    ```
    推荐系统重构版java
    1.Baseline: 实现了基准线预测,评分预测和topN预测均可
    2.MeanFilling:实现了全局均值插值法，用户均值插值法和商品均值插值法 ,评分预测
    3.UserKNN:基于用户的协同过滤KNN算法，实现了评分预测和topN预测
    4.ItemKNN:基于物品的协同过滤KNN算法, 实现了评分预测和topN预测
    5.MatrixFactorization:基本矩阵分解协同过滤，实现了sgd的评分预测和topN预测
    6.BiasedMatrixFactorization:偏差性矩阵分解，实现了sgd的评分预测和topN预测
    7.AlternatingLeastSquares:继承MatrixFactorization，实现了als的评分预测
    8.SVDPlusPlus:SVD++分解，综合考虑用户评分偏差、商品评分偏差和整体评分均值，实现了sgd的评分预测和topN预测
    ```
- [https://github.com/liujm7/Recommend](https://github.com/liujm7/Recommend)
    ```
    java推荐算法库
    使用java语言重新实现一部分python推荐方法
    UserBasedCF:基于用户协同过滤
    ItemBasedCF:基于商品协同过滤
    ModelCF:基于模型协同过滤 目前不成熟
    CBF:基于内容的推荐
    HybridCbfCF:基于内容和协同过滤的混合推荐
    BaselinePredictor: 基准预测的推荐
    SVD:结合基准预测的svd推荐重实现
    备注:实验数据 movielens
    ```
> 实验数据 movielens
- [http://files.grouplens.org/datasets/movielens/ml-100k/](http://files.grouplens.org/datasets/movielens/ml-100k/)

> DEMO-入口方法说明
- core.collaborativeFiltering.SVDPlusPlus （SVD++分解，综合考虑用户评分偏差、商品评分偏差和整体评分均值，实现了sgd的评分预测和topN预测）
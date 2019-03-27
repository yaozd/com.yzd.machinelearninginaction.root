## Jackcard相似度-利用物品的内容属性计算物品之间的相似度
> t3的扩展应用-推荐
- jaccard举例？
```
jaccard举例？
比如我们的用户对新闻的一个浏览数据如下： 
ABCD 代表的四个用户 ；1,2,3,4 代表的是四个新闻；1代表看过该新闻，0代表没有看过该新闻；下面简单计算一下相似度：
用户A 和 用户B 的相似度计算：  M11 就是1   M01+M10+M11 = 4  所以J（A,B） = 1/4 = 25%
用户A 和 用户C 的相似度计算：  M11 就是3   M01+M10+M11 = 4  所以J（A,B） = 3/4 = 75%
用户A 和 用户D 的相似度计算：  M11 就是2   M01+M10+M11 = 4  所以J（A,B） = 2/4 = 50%

由此可见A跟用户的相似度排名从高到低就是   C D B ；
```
- 在CTR指标上，针对行为相关性计算的Jaccard的推荐精准度比Cosine方法要高的多。
    - 来源：[推荐算法之Jaccard相似度与Consine相似度](https://blog.csdn.net/chivalrousli/article/details/80306448)
    ```
    将两种方法的算法结果，直接放到线上应用的三个应用场景，通过跟踪不同算法结果的实际的CTR（曝光点击率），详细数据如下：
    场景
    推荐策略 CTR（Jaccard VS Cosine）
    简要分析：    
    （1）如果是完全以相关性推荐为主题的页面，比如“收藏offer成功后的提示页面”,Jaccard方法对应的CTR提升最大；
    （2）提升达到9%的进货单页面，该页面的核心价值是促进加入进货单的商品进入交易付款环节，并不是推荐，因此在推荐场景布置上有很大局限；    
    （3）提升达到12%的阿里巴巴每日焦点-热卖，虽然整个页面的主题就是推荐，但是毕竟推荐的是P4P商品，因为P4P商品覆盖率不是很高，行为相关性粘稠度肯定不如普通商品，所以覆盖率也没有达到20%。
    ```
 # PS：
 - 个性化推荐-Jaccard的推荐精准度比Cosine方法要高的多
    - 来源：[推荐算法之Jaccard相似度与Consine相似度](https://blog.csdn.net/chivalrousli/article/details/80306448
 
 > 推荐参考：
 - [Jackcard相似度和余弦相似度(向量空间模型)的java实现](https://blog.csdn.net/napoay/article/details/69945833)
 - [推荐算法之Jaccard相似度与Consine相似度](https://blog.csdn.net/chivalrousli/article/details/80306448)
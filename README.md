# RecyclerViewSide
RecyclerView侧滑实现删除、置顶等功能

先看设计图（ps用不大好，凑合看效果图吧，哈）：

![1](https://github.com/wuqingsen/RecyclerViewSide/blob/master/%E6%95%88%E6%9E%9C%E5%9B%BE/1.png)

**使用时要注意的地方**

```
　holder.swipeMenuLayout.setIos(false);//设置是否开启IOS阻塞式交互
　holder.swipeMenuLayout.setLeftSwipe(true);//true往左滑动,false为往右侧滑动
　holder.swipeMenuLayout.setSwipeEnable(true);//设置侧滑功能开关
```
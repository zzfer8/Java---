# Java---
Java课程作业项目仓库
# 实验三 学生选课模拟系统
## 一.实验目的
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
2.掌握面向对象的类设计方法（属性、方法）；
3.掌握类的继承用法，通过构造方法实例化对象；
4.学会使用super()，用于实例化子类；
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 二.业务要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。

对象：

人员（编号、姓名、性别）

教师（编号、姓名、性别、所授课程）

学生（编号、姓名、性别、所选课程）

课程（编号、课程名称、上课地点、时间、授课教师）
## 三.实验过程
1. Person类下定义三个基本属性（ID、Name、Sex），利用构造方法实例化对象为属性赋值；
2. Student类继承Person类，获得父类属性，同时定义一个Course对象Course（所选课程），其数据类型为Course型。然后通过构造方法，在其首行利用super()方法实例化子类，为父类属性赋值；
  定义Setcourse(Course ce)方法，对Course（所选课程）属性进行赋值。重写toString()方法，将相关属性以既定方式输出显示；
3. Techer类继承Person类，获得父类属性，同时定义一个Course对象Course（所授课程），其数据类型为Course型。然后通过构造方法，在其首行利用super()方法实例化子类，为父类属性赋值；
定义Setcourse(Course ce)方法，对Course（所授课程）属性进行赋值。重写toString()方法，将相关属性以既定方式输出显示；
4. Course类下定义六个基本属性（ID、Name、Location、Time、Teacher【授课教师】、Student【选课学生】），利用构造方法实例化对象为属性赋值；
5. 在Test主类中，定义类下的特有属性static char opt以及方法curriculumTest(char o)为opt赋值；
   main方法中创建一个Teacher对象T1，调用构造方法对其父类属性（ID、Name、Sex）赋值；
   main方法中创建一个Student对象S1，调用构造方法对其父类属性（ID、Name、Sex）赋值；
   main方法中创建一个Course对象C1，调用构造方法为其自身属性（ID、Name、Location、Time、Teacher【授课教师】、Student【选课学生】）赋值；
   然后分别调用S1与T1下的Setcourse(Course ce)方法，将参数ce改为C1，实现学生选课，老师授课；
   接着调用相关类下重写的toString()方法,输出各类属性赋值信息；
## 四.核心代码
![](https://github.com/001221lry/Java-2/blob/main/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_2.png)
## 五.实验结果
![](https://github.com/001221lry/Java-2/blob/main/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_1.png)
## 六.实验感想
对super访问父类属性和extends继承父类构造方法有一些了解；掌握面向对象的类设计方法（属性、方法）掌握类的继承用法，通过构造方法实例化对象；对于extends继承函数也有了初步的了解，还有super关键字直接访问父类的属性，用toString更容易直观看出内容。这次的实验需要先确定类和对象，找好继承关系，接下来就相对容易一些，通过这次实验我收获很大。

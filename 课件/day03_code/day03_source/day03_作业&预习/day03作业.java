1:常见的逻辑运算符有哪些?
| || & && !  
  &和&&的区别是什么?& 结果为真还会计算第二个表达式， &&一个为true 结果就为true  共同点：两个逻辑运算符结果都是一样
  |和||的区别是什么?
答:结果一样.
| 只要一个为真结果就为真 两个都为false结果才为false 第一个结果为真还会判断第二个结果是否为真
|| 第一个结果为真,答案直接就为true 不会再判断第二个了
  
2:位运算符^的特点是什么? 异或两次同一个数，等于本身自己
  
3:如何实现对两个整数变量的值进行互换。
第一种方法 用第三方变量 交换位置
第二种方法  
int a =5 ,b =10 ;
a = a +b ; // a = 15 ;
b = a - b ; //b = 5 ;
a = a - b ; //a = 10 ;
第三种方法：
int a = 5 , b = 10 ;
a = a ^ b ; // a = a ^ b
b = a ^ b ; // b = a ^ b ^ b 同时异或两次等于本身自己 所以 b = a 
a = a ^ b ; // b 已经等于a  所以 a = a ^ b ^ a  所以a = b  

4:三元运算符的格式是什么?  ？ :
  执行流程是什么? a = a > b ? b : 1 
从左往右  如果表达式成立就把 第一个值赋给 本身 不成立就把第二个值赋给本身
  
5:使用三元运算符完成如下练习
	比较两个数是否相等 boolean b =(5==4)?ture:false
	获取两个数中最大值 int a =(5>4)?5:4;
	获取三个数中最大值int temp =(5>4)?5:4;  int max = (temp>8)?temp:8;
	
6:流程控制语句有几种?
if
if else
if else if  else
switch

7:if语句的格式有几种?注意事项是什么?分别在什么时候使用?

8:看程序写结果：请自己独立分析，先不要编译运行。
第一题
int x = 1,y = 1;

if(x++==2 & ++y==2) //false & true
{
	x =7;
}
System.out.println("x="+x+",y="+y);   // x = 2,y = 2

---------------------------------------------------
第二题
int x = 1,y = 1;

if(x++==2 && ++y==2) //x = 2; y = 1
{
	x =7;
}
System.out.println("x="+x+",y="+y);

---------------------------------------------------
第三题
int x = 1,y = 1;

if(x++==1 | ++y==1) //true  | false  x = 7 y = 2;
{
	x =7;
}
System.out.println("x="+x+",y="+y); //x= 7,y = 2

---------------------------------------------------
第四题
int x = 1,y = 1;

if(x++==1 || ++y==1) //true 
{
	x =7;
}
System.out.println("x="+x+",y="+y); //x = 7,y = 1

---------------------------------------------------
第五题
boolean b = true;

if(b=false) //true == false;  //b
	System.out.println("a");
else if(b)
	System.out.println("b");
else if(!b)
	System.out.println("c");
else
	System.out.println("d");

---------------------------------------------------

9:编写代码实现如下内容：if语句实现
考试成绩分等级。
	90~100	A等。
	80-89	B等。
	70-79	C等。
	60-69	D等。
	60以下	E等。
请根据给定成绩，输出对应的等级。

10:switch语句的格式?针对格式的解释?以及注意事项?
switch(条件表达式)
	条件 1
		执行代码块
	条件 2
		执行代码块

11:看程序，分析下面程序的结果：
int x = 2,y=3;

switch(x)
{
	default:
		y++; //4
	case 3:
		y++; //5
		break;
	case 4:
		y++;
}

System.out.println("y="+y);

12:根据输入的值，判断是星期几。(分别用if语句和switch语句实现)
	输入：1	 
		输出：星期1		
13:把今天讲过的其他案例再练习一遍
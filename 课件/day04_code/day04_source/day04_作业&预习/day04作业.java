1:for循环的格式?要能看懂执行流程。
  用for循环完成如下案例
  
  求和    for (int i =1;i<=10;i++)
		sum+=i;
  求偶数和  for (int i =2;i<=10;i+=2)
		sum+=i
  求奇数和for (int i =1;i<=10;i+=2)
		sum+=i
  打印水仙花数for (int i =100;i<=999;i++)
		int ge = i%10
		int shi =i/10%10;
		int bai = i/100;
		if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i)
		System.out.println(i);
  统计水仙花数

  九九乘法表for (int i =1;i<=9;i++)
		for(int j =1;j<=i; j++)
		System.out.print(i*j=i*j);
		System.out.println();

2:while循环的格式?要能看懂执行流程
  用while循环完成如下案例
  
  求和
  假设有一张足够大的纸，厚度为1毫米，珠穆朗玛峰高度为8848米，
  求纸张至少折叠几次可以超过珠穆朗玛峰的高度
  int start  = 1;
  int end  = 8848000;

  while(start < end){
	start+=start
  
  }


3:break,continue和return分别有什么用?
能用在 switch 和 循环
continue 终止本次循环,继续下次循环
return 结束方法  返回值

4:函数的概念?函数的格式?格式的解释说明
修饰符 返回值类型 方法名(参数数据类型 参数名,....){
	代码块;
}
public static int 方法名(int a ,int b ){
	return a+b;
}

5:函数的调用
赋值 直接调用 输出调用
	A:明确返回值类型的函数调用
赋值调用
	B:void类型的函数调用
直接调用
	
6:函数的练习：
	A:求两个数据之和
	B:判断两个数据是否相等
	C:获取两个数中较大的值
	D:打印m行n列的星形矩形
	E:打印nn乘法表

7:什么是函数重载?以及函数重载的练习?把讲过的案例练习一次即可
方法名相同 参数列表不同 跟返回值无关
public static int add(int a,int  b){
	return a +b;
}
public static double add(double c,int  d){
	return c +d;
}
public static double add2(int  d,double c){
	return c +d;
}




public static int add(int c,int  d,int e){
	return c +d + e;
}

数据类型不一样  个数不一样 顺序不同
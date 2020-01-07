class MethodDemo {
	public static void main(String [] args){
    //千万不要在这里面写方法
	   int  he =  add(10,20,30);
	   System.out.println("he = " + he);
	}
//要在大括号下面去书写
//如果不需要返回任何值,就写void
// 如果要返回具体的数据,看这个数据是什么类型的返回值就写什么类型的

	public static int add(int a,int b,int c){
		int sum = a + b + c;
		return sum;
	} 

//写好方法后 怎么调用?
//在主方法里面,直接写方法名(传入相应参数)
}

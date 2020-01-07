class Demo_Duotai {
	public static void main(String[] args) {
		//如果没有方法重写,这样就失去多态的意义
		Father f = new Son();
		//编译看左边,运行看右边
		f.show(); 

		Son s = new Son();
		s.show();
	}
}

class Father
{
	public void show(){
		System.out.println("父类的show方法");
	}
}
class Son extends Father
{
	//子类实际上是有,这个方法是从父类里面继承过来的
}
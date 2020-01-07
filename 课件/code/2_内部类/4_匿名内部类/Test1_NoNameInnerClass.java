class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		//如何调用PersonDemo中的method方法呢?
		/*PersonDemo pd = new PersonDemo ();
		//pd.method(new Student());
		pd.method(new Person() {
			public void show() {
				System.out.println("show");
			}
		});*/

		PersonDemo pd = new PersonDemo();
		//第二种方案 : 匿名内部类的用法:作为参数传递
		pd.method(new MyInter(){
			public void show() {
				System.out.println("这是匿名内部类的show方法...");
			}
		});
		//pd.method(new MyInterImpl());  //Test1_NoNameInnerClass.java:13: 错误: Person是抽象的; 无法实例化
	}
}
//这里写抽象类，接口都行
abstract class Person {
	public abstract void show();
}

class PersonDemo {
	
	//public void method(Person p) {		//Person p = new Student();		//父类引用指向子类对象
	/*
	Person p = new Person(){
		public void show() {
			System.out.println("show");
		}
	};
	*/
	//当你看到一个方法的形式参数是一个类名的时候,这里其实需要的该类的对象
	//补充: 当你看到一个方法的形式参数是一个抽象类类名或者是接口名的时候,这里其实需要的是该抽象类的子类对象或者该接口的实现类对象
	public void method(MyInter p) {
		p.show();
	}
}

class Student extends Person {
	public void show() {
		System.out.println("show");
	}
}

interface MyInter
{
	public abstract void show();
}
//第一种方案
class MyInterImpl implements MyInter
{
	public void show() {
		System.out.println("这是实现类的show方法...");
	}
}
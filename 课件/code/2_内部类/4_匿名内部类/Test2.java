/*
	要求在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现 
*/
public class Test2 {
		public static void main(String[] args) {
			/*
			方案一
			A a = new A();
			a.methodA(new InterAImpl());*/
			
			//方案二
			/*
			A a = new A();
			a.methodA(new InterA(){
				public void showA(){
					System.out.println("这是匿名内部类的实现方式");
				}
			});*/
			//方案三:这种是局部内部类的写法
			class InnerImpl implements InterA
			{
				public void showA(){
					System.out.println("这是局部内部类的写法");
				}
			}
			A a = new A();
			a.methodA(new InnerImpl());
		}
	}
	//定义接口
interface InterA {
	void showA();	
}
class A {
	public void methodA(InterA a) {
		a.showA();		
	}	
}
//方案一
class InterAImpl implements InterA
{
	public void showA(){
		System.out.println("这是子实现类的showA方法");
	}
}

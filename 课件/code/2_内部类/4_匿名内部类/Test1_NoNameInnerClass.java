class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		//��ε���PersonDemo�е�method������?
		/*PersonDemo pd = new PersonDemo ();
		//pd.method(new Student());
		pd.method(new Person() {
			public void show() {
				System.out.println("show");
			}
		});*/

		PersonDemo pd = new PersonDemo();
		//�ڶ��ַ��� : �����ڲ�����÷�:��Ϊ��������
		pd.method(new MyInter(){
			public void show() {
				System.out.println("���������ڲ����show����...");
			}
		});
		//pd.method(new MyInterImpl());  //Test1_NoNameInnerClass.java:13: ����: Person�ǳ����; �޷�ʵ����
	}
}
//����д�����࣬�ӿڶ���
abstract class Person {
	public abstract void show();
}

class PersonDemo {
	
	//public void method(Person p) {		//Person p = new Student();		//��������ָ���������
	/*
	Person p = new Person(){
		public void show() {
			System.out.println("show");
		}
	};
	*/
	//���㿴��һ����������ʽ������һ��������ʱ��,������ʵ��Ҫ�ĸ���Ķ���
	//����: ���㿴��һ����������ʽ������һ�����������������ǽӿ�����ʱ��,������ʵ��Ҫ���Ǹó���������������߸ýӿڵ�ʵ�������
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
//��һ�ַ���
class MyInterImpl implements MyInter
{
	public void show() {
		System.out.println("����ʵ�����show����...");
	}
}
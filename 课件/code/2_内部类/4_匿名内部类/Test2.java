/*
	Ҫ���ڲ�����Test�д���A�Ķ���a�����ó�Ա����methodA(),Ҫ�������ַ�ʽʵ�� 
*/
public class Test2 {
		public static void main(String[] args) {
			/*
			����һ
			A a = new A();
			a.methodA(new InterAImpl());*/
			
			//������
			/*
			A a = new A();
			a.methodA(new InterA(){
				public void showA(){
					System.out.println("���������ڲ����ʵ�ַ�ʽ");
				}
			});*/
			//������:�����Ǿֲ��ڲ����д��
			class InnerImpl implements InterA
			{
				public void showA(){
					System.out.println("���Ǿֲ��ڲ����д��");
				}
			}
			A a = new A();
			a.methodA(new InnerImpl());
		}
	}
	//����ӿ�
interface InterA {
	void showA();	
}
class A {
	public void methodA(InterA a) {
		a.showA();		
	}	
}
//����һ
class InterAImpl implements InterA
{
	public void showA(){
		System.out.println("������ʵ�����showA����");
	}
}

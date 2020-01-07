class NoNameDemo {
	public static void main(String[] args) {
		//����:���ô���ʵ�ֵ��� method����?
		/*����һ����:
		Test t = new Test();
		//ͨ������,���method��Ҫ���Ǵ���һ��Inter�ӿڵ���ʵ�������
		t.method(new InterImpl()); //�������ʵ������󴫽�ȥ
		*/

		//���Ƿ�����: ͨ���������ͷ���һ�ĶԱ�,���ǿ��Կ�����,�����ڲ�����Լ����ǵĴ�����д,����ֻ��Ҫ�ڴ�������ʱ����һ�������ڲ������Ϳ���ʵ�ַ����ĵ���
		//��ʡ����
		Test t = new Test();
		t.method(new Inter(){
			public void add(){
				System.out.println("���������ڲ����add����");
			}
		});

	}
}

interface Inter
{
	public abstract void add();
}

class Test
{
	public void method(Inter i){ //Inter i = new InterImpl();   ��ʵ�������;
		//���뿴����,���п�����
		i.add();
	}
}


//����һ:дһ����ʵ����
class InterImpl implements Inter
{
	public void add(){
		System.out.println("��ӷ���");
	}
}
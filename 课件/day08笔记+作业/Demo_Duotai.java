class Demo_Duotai {
	public static void main(String[] args) {
		//���û�з�����д,������ʧȥ��̬������
		Father f = new Son();
		//���뿴���,���п��ұ�
		f.show(); 

		Son s = new Son();
		s.show();
	}
}

class Father
{
	public void show(){
		System.out.println("�����show����");
	}
}
class Son extends Father
{
	//����ʵ��������,��������ǴӸ�������̳й�����
}
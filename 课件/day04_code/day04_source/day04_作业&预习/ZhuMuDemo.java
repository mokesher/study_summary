/*
���
  ������һ���㹻���ֽ�����Ϊ1���ף����������߶�Ϊ8848�ף�
  ��ֽ�������۵����ο��Գ������������ĸ߶�
  */
class ZhuMuDemo {
	public static void main(String[] args) {
		/*
		int start  = 1;
		int end = 8848000;
		int count = 0;
		while(start < end){
			start =start * 2;
			count ++;
		}
		System.out.println("count = " + count);*/
		int count = 0 ;
		int start  = 1,end = 8848000;
		for (;start < end ; )
		{
			start *=2;
			count ++;
		}
		System.out.println("count = " + count);
	}
}

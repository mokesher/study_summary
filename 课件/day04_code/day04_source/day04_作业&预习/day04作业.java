1:forѭ���ĸ�ʽ?Ҫ�ܿ���ִ�����̡�
  ��forѭ��������°���
  
  ���    for (int i =1;i<=10;i++)
		sum+=i;
  ��ż����  for (int i =2;i<=10;i+=2)
		sum+=i
  ��������for (int i =1;i<=10;i+=2)
		sum+=i
  ��ӡˮ�ɻ���for (int i =100;i<=999;i++)
		int ge = i%10
		int shi =i/10%10;
		int bai = i/100;
		if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i)
		System.out.println(i);
  ͳ��ˮ�ɻ���

  �žų˷���for (int i =1;i<=9;i++)
		for(int j =1;j<=i; j++)
		System.out.print(i*j=i*j);
		System.out.println();

2:whileѭ���ĸ�ʽ?Ҫ�ܿ���ִ������
  ��whileѭ��������°���
  
  ���
  ������һ���㹻���ֽ�����Ϊ1���ף����������߶�Ϊ8848�ף�
  ��ֽ�������۵����ο��Գ������������ĸ߶�
  int start  = 1;
  int end  = 8848000;

  while(start < end){
	start+=start
  
  }


3:break,continue��return�ֱ���ʲô��?
������ switch �� ѭ��
continue ��ֹ����ѭ��,�����´�ѭ��
return ��������  ����ֵ

4:�����ĸ���?�����ĸ�ʽ?��ʽ�Ľ���˵��
���η� ����ֵ���� ������(������������ ������,....){
	�����;
}
public static int ������(int a ,int b ){
	return a+b;
}

5:�����ĵ���
��ֵ ֱ�ӵ��� �������
	A:��ȷ����ֵ���͵ĺ�������
��ֵ����
	B:void���͵ĺ�������
ֱ�ӵ���
	
6:��������ϰ��
	A:����������֮��
	B:�ж����������Ƿ����
	C:��ȡ�������нϴ��ֵ
	D:��ӡm��n�е����ξ���
	E:��ӡnn�˷���

7:ʲô�Ǻ�������?�Լ��������ص���ϰ?�ѽ����İ�����ϰһ�μ���
��������ͬ �����б�ͬ ������ֵ�޹�
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

�������Ͳ�һ��  ������һ�� ˳��ͬ
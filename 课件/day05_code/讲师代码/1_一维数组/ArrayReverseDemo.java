class ArrayReverseDemo {
	public static void main(String[] args) {
		//��һ�� ����һ������
		int [] arr = {11,22,33,44,55};
		//�ڶ���: reverseArr
		int[] newArr = reverseArr(arr);
		for (int j = 0;j < newArr.length ;j++ )
		{
			System.out.print(newArr[j] + " ");
		}
	}

	public static int[] reverseArr(int[] oldArr){
		//˼�� 
		//��һ�� ����һ���µ�����,Ȼ�󳤶Ⱥ��㴫���������鳤��һ��
		//�ڶ��� �Ѿɵ�����Ԫ�� �Ӻ��濪ʼ ��ǰһ���� �浽�µ���������
		int [] newArr = new int[oldArr.length];
		//������ ����
		for (int i = 0;i < oldArr.length ;i++ )
		{
			newArr[i] = oldArr[oldArr.length - 1 - i]; 
		}
		return newArr;
		/*
		for (int j = 0;j < newArr.length ;j++ )
		{
			System.out.print(newArr[j] + " ");
		}*/

	}
}

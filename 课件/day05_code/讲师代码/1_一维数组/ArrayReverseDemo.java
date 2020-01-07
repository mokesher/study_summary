class ArrayReverseDemo {
	public static void main(String[] args) {
		//第一步 创建一个数组
		int [] arr = {11,22,33,44,55};
		//第二步: reverseArr
		int[] newArr = reverseArr(arr);
		for (int j = 0;j < newArr.length ;j++ )
		{
			System.out.print(newArr[j] + " ");
		}
	}

	public static int[] reverseArr(int[] oldArr){
		//思想 
		//第一步 创建一个新的数组,然后长度和你传进来的数组长度一样
		//第二步 把旧的数组元素 从后面开始 往前一个个 存到新的数组里面
		int [] newArr = new int[oldArr.length];
		//第三步 遍历
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

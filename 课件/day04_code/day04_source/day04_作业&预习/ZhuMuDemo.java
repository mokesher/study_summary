/*
求和
  假设有一张足够大的纸，厚度为1毫米，珠穆朗玛峰高度为8848米，
  求纸张至少折叠几次可以超过珠穆朗玛峰的高度
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

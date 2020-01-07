/*
* A:break的使用场景
	* 只能在switch和循环中 
*/
class Demo1_Break {
	public static void main(String[] args) {
		for (int x = 1;x <= 10 ;x++ ) {
			//1 2 3 4 
			if (x == 4) {
				break;							//跳出循环
			}

			System.out.println("x = " + x); // 1 2 3
		}
	}
}

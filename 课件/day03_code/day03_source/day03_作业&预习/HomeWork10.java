class HomeWork10 {
	public static void main(String[] args) {
		int x = 2,y=3;

		switch(x)
		{
			default:
				y++; //4
			case 3:
				y++; //5
				break;
			case 4:
				y++;
		}

		System.out.println("y="+y);
	}
}

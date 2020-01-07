class Animal {
	public static void main(String[] args) {
		Cat c = new Cat("¼Ó·Æ",8);
		c.eat();
		c.sleep();

		JumpCat jc = new JumpCat("Ã¨Ìø¸ß",3);
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}
abstract class Animal_1{
	private String name ;
	private int age ;

	public Animal_1(){}

	public Animal_1(String name, int age){
		this.name = name ;
		this.age = age;
	}
	public String setName(String name){
	    this.name = name;
	}
	public String getName(){
	    return name;
	} 
	public int setAge(int age){
		this.age = age;
	}
    public int getAge(){
	     return age;
	}
	public abstract void eat();

	public abstract void sleep();
  }
}
interface Jumping{
	public void jump();
}
class Cat extends Animal_1{

	public	Cat(){}

	public Cat (String name , int age){
		super (name, age ); 
	}
	public void eat (){
		System.out.println("Ã¨³ÔÓã");
	}
	public void sleep(){
		System.out.println("²à×ÅË¯");
	}
}
class JumpCat extends Cat implements Jumping{
	public JumpCat(){}

	public JumpCat (String name , int age){
			super (name, age);
	}
	public void jump(){
		System.out.println("Ã¨Ìø¸ß");
	}
}



		

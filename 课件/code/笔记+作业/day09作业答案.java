public class Car_Polymorphic {
	public static void main(String[] args) {
		AudiCar audi = new AudiCar("奥迪A4L","红色",300000);
		audi.run();
		AudiSuperCar audiSuperCar = new AudiSuperCar("奥迪A8L","白色",1000000);
		audiSuperCar.run();
		audiSuperCar.noPersonDrive();
		audiSuperCar.autoStopCar();
	}
}
abstract class Car{
	private String brand;//品牌
	private String color;//颜色
	private int price;//价格
	public Car(){}
	public Car(String brand,String color,int price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return this.brand;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return this.price;
	}
	//车的行驶方法
	public abstract void run();
}
/*
*普通Audi车
*/
class AudiCar extends Car {
	public AudiCar(){}
	public AudiCar(String brand,String color,int price){
		super(brand,color,price);
	}
	public void run(){
		System.out.println("普通"+getColor()+"的"+getBrand()+"开跑......");
	}
}
/**
 * 无人驾驶接口
 * @author JX
 *
 */
interface NoPersonDriving {
	//无人驾驶方法
	public abstract void noPersonDrive();
}
/**
 * 自动泊车功能
 * @author JX
 *
 */
interface AutoStopCar {
	//自动泊车功能
	public abstract void autoStopCar();
}

/*
*高端奥迪车
*/
class AudiSuperCar extends AudiCar implements NoPersonDriving,AutoStopCar{
	public AudiSuperCar(){}
	public AudiSuperCar(String brand,String color,int price){
		super(brand,color,price);
	}
	public void noPersonDrive(){
		System.out.println("您好,我已进入无人驾驶状态,请闭上眼睛,否则您的小心会颤颤欧......放心我会安全到达目的地....");
	}	
	public void autoStopCar(){
		System.out.println("您好,我已经进入自动泊车状态,虽然空间很小,但我还是能安全停放的..哟...........");
	}
	public void run(){
		System.out.println("超级"+getColor()+"的"+getBrand()+"开跑......");
	}
}

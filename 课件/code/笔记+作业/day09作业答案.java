public class Car_Polymorphic {
	public static void main(String[] args) {
		AudiCar audi = new AudiCar("�µ�A4L","��ɫ",300000);
		audi.run();
		AudiSuperCar audiSuperCar = new AudiSuperCar("�µ�A8L","��ɫ",1000000);
		audiSuperCar.run();
		audiSuperCar.noPersonDrive();
		audiSuperCar.autoStopCar();
	}
}
abstract class Car{
	private String brand;//Ʒ��
	private String color;//��ɫ
	private int price;//�۸�
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
	//������ʻ����
	public abstract void run();
}
/*
*��ͨAudi��
*/
class AudiCar extends Car {
	public AudiCar(){}
	public AudiCar(String brand,String color,int price){
		super(brand,color,price);
	}
	public void run(){
		System.out.println("��ͨ"+getColor()+"��"+getBrand()+"����......");
	}
}
/**
 * ���˼�ʻ�ӿ�
 * @author JX
 *
 */
interface NoPersonDriving {
	//���˼�ʻ����
	public abstract void noPersonDrive();
}
/**
 * �Զ���������
 * @author JX
 *
 */
interface AutoStopCar {
	//�Զ���������
	public abstract void autoStopCar();
}

/*
*�߶˰µϳ�
*/
class AudiSuperCar extends AudiCar implements NoPersonDriving,AutoStopCar{
	public AudiSuperCar(){}
	public AudiSuperCar(String brand,String color,int price){
		super(brand,color,price);
	}
	public void noPersonDrive(){
		System.out.println("����,���ѽ������˼�ʻ״̬,������۾�,��������С�Ļ����ŷ......�����һᰲȫ����Ŀ�ĵ�....");
	}	
	public void autoStopCar(){
		System.out.println("����,���Ѿ������Զ�����״̬,��Ȼ�ռ��С,���һ����ܰ�ȫͣ�ŵ�..Ӵ...........");
	}
	public void run(){
		System.out.println("����"+getColor()+"��"+getBrand()+"����......");
	}
}

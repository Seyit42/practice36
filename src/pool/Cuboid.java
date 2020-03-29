package pool;

public class Cuboid extends Rectangle{
	private double height;
	
//	Cuboid(double width, double length, double height){
//		
//	}
	
	Cuboid(double width, double length, double height) {
		super(width, length);
		setHeight(height);
		
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,-5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());
		int[] index = new int[8];
		for(int x = 0; x < 8; x++) {
			index[x] = x + x;
			//index[x] += 2;
			System.out.println(index[x]);
		}
		
	}
	
	public double getVolume() {
		return height * getArea();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height < 0){
			height = 0;
		}
		this.height = height;
	}
	
}


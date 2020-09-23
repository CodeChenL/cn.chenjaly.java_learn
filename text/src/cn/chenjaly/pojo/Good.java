package cn.chenjaly.pojo;

public class Good {

	int id;
	String name;
	float price;
	int num;
	
//	无参构造器
	public  Good() {
		super();
	}
	
//	有参构造器
	public Good(int id, String name, float price, int num) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.num = num;
	}
	
//	get and set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", price=" + price + ", num=" + num + "]";
	}
	
}

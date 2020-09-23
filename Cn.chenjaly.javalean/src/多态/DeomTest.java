package 多态;


public class DeomTest {

//	多态的优点2
	public static void function(Animal a) {
		a.eat();
		
		if (a instanceof Cat) {
			Cat cat = (Cat)a;
			cat.eat();
		}
		
		if (a instanceof Dog) {
			Dog dog = (Dog)a;
			dog.eat();
		}
	}
	
	public static void function(Cat cat) {
		
	}
	
	public static void function(Dog dog) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	多态的条件1:要有继承关系
//		多态的条件2:子类要重写父类的方法
//		多态的条件3:父类的引用指向子类的对象(向上转型:子类自动转换为父类)
		Animal animal = new Cat();
		
//		结论1:非静态方法,编译看左边(父类),运行看右边(子类).动态绑定
		animal.eat();
		
//		结论2:静态方法,编译看左边(父类),运行看左边(父类).
		animal.sleep();
		
//		结论3:成员变量,编译看左边(父类),运行看左边(父类).		
		System.out.println(animal.num);
		System.out.println(animal.age);
		
//		多态的弊端:不能使用子类特有的成员属性和子类特有的成员方法.
		animal.run();//可以访问父类的方法
//		animal.catchMouse();//这个父类指向子类对象的引用无法访问子类特有的方法
		
//		如果父类的引用需要引用子类的属性和方法
		Cat cat2 = (Cat)animal;
		
		cat2.eat();
		cat2.sleep();
		cat2.catchMouse();
		cat2.run();
		
		
		function(new Cat());
		function(new Dog());
		
		
	}

}

package 接口;

public class Test {

	public void BuruAnimal(AnimalAction action) {
		if (action instanceof Cat) {
			Cat cat1 = (Cat) action;
			cat1.eat();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		自动向上转型
		AnimalAction action = new Cat();
		
		action.eat();
		action.drink();
		
		action = new Bird();
		action.eat();
		action.drink();
		
//		强制向下转型
		Bird xBird = (Bird)action;
		xBird.LoveType();
		System.out.println(xBird.sleep());
		

	}

}

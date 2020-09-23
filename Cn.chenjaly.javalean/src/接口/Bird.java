package 接口;

public class Bird implements AnimalAction,AnimalLove,AnimalSleep{

	@Override
	public String sleep() {
		String string = "我是鸟,白天活动,晚上睡觉";
		return string;
	}

	@Override
	public void LoveType() {
		System.out.println("我是鸟,求偶方式是修鸟窝");
	}

	@Override
	public void eat() {
		System.out.println("我是鸟,喜欢吃虫子");
	}

	@Override
	public void drink() {
		System.out.println("我是鸟,喝水啄着喝");
	}

	
}

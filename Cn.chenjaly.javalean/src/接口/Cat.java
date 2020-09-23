package 接口;

public class Cat implements AnimalAction,AnimalLove,AnimalSleep{

	@Override
	public String sleep() {
		String string = "我是猫,白天睡觉,晚上活动";
		return string;
	}

	@Override
	public void LoveType() {
		System.out.println("我是猫,求偶方式是抓老鼠");
	}

	@Override
	public void eat() {
		System.out.println("我是猫,喜欢吃鱼");
	}

	@Override
	public void drink() {
		System.out.println("我是猫,喝水很斯文");
	}

	
}

package jp.co.diworks.action;


//インスタンス化演習①
public class Test {
	public static void main(String[]args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
	}

}

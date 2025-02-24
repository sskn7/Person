package jp.co.diworks.action;


//インスタンス化演習①
public class Test {
	public static void main(String[]args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		
		//演習②
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		
		//演習④
		Person number = new Person();
		number.phoneNumber = "0312341234";
		number.address = "abc.123@mai.com";
		
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		//演習④
		System.out.println(number.phoneNumber);
		System.out.println(number.address);
	}

}

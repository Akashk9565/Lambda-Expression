package work;

public class Main {

	public static void main(String[] args) {
		System.out.println("My System start...");
		
		
//		MyInter myInterImpl = new MyInterImpl();
//		myInterImpl.sayHello();
		
//		MyInter myInter = new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("This is first anonymous class");
//				
//			}
//		};
//		myInter.sayHello();
//		
//		
//		MyInter myInter2 = new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("This is second anonymous class");
//				
//			}
//		};
//		myInter2.sayHello();
		
		// using our interface with Lambda Expression
		
//		MyInter i = () ->{System.out.println("This is Lambda Expression");};
//		i.sayHello();
//		
//		MyInter i2 = () ->System.out.println("This is second Lambda Expression");
//		i2.sayHello();
//		
		
		
//		SumInter sumInter = (int a, int b) ->{
//			return a+b;
//		};
//		System.out.println(sumInter.sum(10, 20));
//		
//		
//		SumInter sumInter2 = (a, b) -> {
//				return a+b;
//			};
//			System.out.println(sumInter2.sum(20, 30));
//			
//			
//			SumInter sumInter3 = (a, b) -> a + b;
//			System.out.println(sumInter2.sum(10, 30));
		
		
		
		LengthInter lengthInter = str -> str.length();
		System.out.println(lengthInter.getLength("Akash Kumar"));
	
	}
	 

}

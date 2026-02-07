class Calculator{
	int add(int a, int b){
		return a + b;
	}
	int multiply(int a , int b){
		return a * b;
		
	}
	int square(int a){
		return a*a;
	}
	
}

public class Cal{
	public static void main(String[]args){
		Calculator value = new Calculator();
		
		int m1 = value.multiply(3,4);
		int m2 = value.multiply(5,7);
		int sum1 = value.add(m1, m2);
		int result1 = value.square(sum1);
		
		System.out.println("Result 1 = " + result1);
		
		int sumA = value.add(4, 7);
        int sqA = value.square(sumA);
        int sumB = value.add(8, 3);
        int sqB = value.square(sumB);
        int result2 = value.add(sqA, sqB);
		
		System.out.println("Result 2 = " + result2);
	}
}
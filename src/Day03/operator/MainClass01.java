package Day03.operator;
/*
 * [[연산자]]
 * 1.산술연산자
 * +,  
 * 
 * 
 * 
 * 
 */
public class MainClass01 {
 public static void main(String[] args) {
	int num1=10;
	int num2=5;
	
	int sum=num1=num1+num2;
	System.out.println(sum);
	
	
	//두수의 곱을 구해서 multiply라는 변수값을 대입
	int multiply=num1*num2;
	System.out.println(num1+"*"+num2+"="+multiply);
	
	
	//나누기
	int result=10/3;
	System.out.println("10/3="+result);
	System.out.println("10/3="+result);
	
	//실수 계산 부동소수점 오차 생길 수 있다.
	double dResult=10/3.0;
	System.out.println("10/3="+dResult);
	
	
	//9를5로 나눈 나머지 값 result2에 대입
	int result2=9%5;
	System.out.println("9%5="+result2);
	
	
	
	
 }

}


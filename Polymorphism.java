package Java;
//tow types of polymorphism- Run time- method overriding concept
//Complie Time-method overloading concept

class Polymorphism {
	public static  int add(int a, int b) {
		return a+b;
	}
public static void add(double a, double b) {
	System.out.println("Addition:"+(a+b));
}
public static void main(String[]args) {
	System.out.println(add(10,20));
	add(10.5,20.5);
}
}

    
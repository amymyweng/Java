package tw.myweng.javaproject.oop.collection.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class TestInteger{
	private Integer i1;

	public Integer getI1() {
		return i1;
	}

	public void setI1(Integer i1) {
		this.i1 = i1;
	}
}

class TestDouble{
	private Double d1;

	public Double getD1() {
		return d1;
	}

	public void setD1(Double d1) {
		this.d1 = d1;
	}
}

//...

class TestObject{
	private Object o1;

	public Object getO1() {
		return o1;
	}

	public void setO1(Object o1) {
		this.o1 = o1;
	}
}

class TestGenerics<T>{
	private T t1;

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}
}


public class CallTestGenericsEx1 {

	public static void main(String[] args) {
		TestObject obj1 = new TestObject();
		obj1.setO1(6);
		int value1 = (Integer)obj1.getO1();
		System.out.println("(value1+1)=" + (value1+1));
		
		//double value2 = (Double)obj1.getO1();
		//System.out.println("(value2+2)=" + (value2+2));
		
		TestGenerics<Integer> test1 = new TestGenerics<Integer>();
		test1.setT1(5);
		int value3 = test1.getT1();
		System.out.println("(value3+3)=" + (value3+3));
		
		TestGenerics<Double> test2 = new TestGenerics<>();
		test2.setT1(3.14);
		double value4 = test2.getT1();
		System.out.println("(value4+4)=" + (value4+4));
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		
		TestGenerics<ArrayList> test3 = new TestGenerics<>();
//		List<Integer> L1 = new List<>(); 
		test3.setT1(a);
		
		System.out.println(test3.getT1());
	}

}








package com.tk.d18;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Streamapibasic {
  public static void main(String args[])
  {
	  List<Integer>numList=Arrays.asList(2,3,4,5,6);//creating a list from array
	  
	  Stream<Integer>stream=numList.stream();//retriving stream from list
	  
	  stream=stream.map(x->x*x);
	  stream.forEach(x->System.out.println(x));
	  
	  stream=numList.stream();
	  Function<Integer,Integer> fun=(x)->x*x;
	  stream=stream.map(fun);
	  
	 stream.forEach(System.out::println);//method reference
	  
	  stream=numList.stream();
	  System.out.println("count:" +stream.count());
	  
	  stream=numList.stream();
	  List sqrList=stream.map(x->x*x).toList();
	  
	  System.out.println("number list is "+numList);
	  System.out.println("Square list"+sqrList);
  }
}

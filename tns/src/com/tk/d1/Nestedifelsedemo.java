package com.tk.d1;
//greatest of three numbers
public class Nestedifelsedemo {

	public static void main(String[] args) {
		int a=10,b=20,c=50;
		if(a>b && a>c)
		{
			System.out.println("a is greater");
			System.out.println(a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
			System.out.println(b);
		}
		else
		{
			System.out.println("c is greater");
			System.out.println(c);
		}

	}

}
/*int a=10, b=20, c=5;
System.out.println("The largest number is");
if(a>b)//10>20
{
	if(a>c)
		System.out.println(a);
	else
		System.out.println(c);
}
else
{
	if(c>b)//5>20
		System.out.println(c);
	else
		System.out.println(b);//20
}*/




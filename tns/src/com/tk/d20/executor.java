package com.tk.d20;

public class executor {

	public static void main(String[] args) {
		statementinterfacedemo.showEmp();
//		System.out.println("----------------------------------------------");
	System.out.println(statementinterfacedemo.updateEmpName(5, "Neha"));
//		StatementInterfaceDemo.updateEmpSalary(5, 65000);
//		System.out.println("-------------After Updating Name and Salary------------");
//		StatementInterfaceDemo.showEmp();
		statementinterfacedemo.deleteEmp(5);
//		StatementInterfaceDemo.deleteEmp(101);
//		StatementInterfaceDemo.deleteEmp(102);
//		System.out.println("-----------After Deleting --------------------");
		statementinterfacedemo.showEmp();

	}

}


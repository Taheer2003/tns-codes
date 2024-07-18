package com.tk.d20;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class statementinterfacedemo 
{
static Connection cn;
static Statement st;

static
{
	cn=dbutil.getConnection();
	try {
		st=cn.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
//creation
public static int addEmployee(int empId, String empName, double empSalary)
{
	int n=0;
	String query="INSERT INTO emp VALUES(" + empId + ",'" + empName + "'," + empSalary + ")";
	try {
		n=st.executeUpdate(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return n;
}
//validating emp
public static int validateEmp(int empId) {
	int n = 0;
	try {
		String query = "SELECT count(*) FROM emp where id=" + empId;
		ResultSet rs = st.executeQuery(query);//
		if (rs.next()) //columns
		{
			if (rs.getInt(1) != 0)
				n = 1;
		}

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
	return n;
}
//deletion
public static boolean deleteEmp(int empId) {
	boolean status = false;

	try {

		int n = validateEmp(empId);//10(n=1)
		if (n == 1) 
		{
			String query = "DELETE FROM emp WHERE id=" + empId;
			st.executeUpdate(query);//make changes
			status = true;//able to delete
		}

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
	return status;//false
}
//updation
public static boolean updateEmpName(int empId, String empName) {
	boolean status = false;
	try {

		if (validateEmp(empId) == 1) {
			String query = "UPDATE emp set name='" + empName + "' WHERE id=" + empId;
			st.executeUpdate(query);
			status = true;
		} else

			System.out.println("No such Employee Record.....");

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
	return status;//false
}
public static boolean updateEmpSalary(int empId, double salary) {
	boolean status = false;
	try {

		if (validateEmp(empId) == 1) {
			String query = "UPDATE emp SET salary=" + salary + " WHERE id=" + empId;
			st.executeUpdate(query);
			status = true;
		} else
			System.out.println("No such Employee Record.....");

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
	return status;
}
public static void showEmp() {
	try {

		String query = "SELECT * FROM emp";
		ResultSet rs = st.executeQuery(query);

		/*
		 * System.out.println(rs.next());
		 * System.out.println("----------------------------");
		 * System.out.println("::::"+rs.getInt(1));
		 */

		if (rs.next()) //check the row
		{
			while (rs.next()) //check column
			{

				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));
			}
		} else
			System.out.println("No Employee Records.....");

rs.close();

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
}
public void closeConnection() {
	try {
		st.close();
		cn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}

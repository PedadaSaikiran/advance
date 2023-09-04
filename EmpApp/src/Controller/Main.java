package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Dto.Emp;
import Factory.ServiceFactory;
import Service.services;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		int empid;
		String name, role;
		double salary;
		String choice = "YES";
		services ser = ServiceFactory.serviceFactory();
		Emp emp = new Emp();
		do {
			System.out.println("1.INSERT EMPLOYEE\n" + "2.UPDATE EMPLOYEEE\n" + "3.DELETE EMPLOYEE\n" + "4.DISPLAY EMPLOYEE");
			System.out.println("SELECT YOUR CHOICE");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("ENTER EMPID");
				empid = sc.nextInt();
				System.out.println("ENTER EMPname");
				name = sc.next();
				System.out.println("ENTER ROLE");
				role = sc.next();
				System.out.println("ENTER SALARY");
				salary = sc.nextDouble();
				emp.setEmpid(empid);
				emp.setName(name);
				emp.setRole(role);
				emp.setSalary(salary);
				if (ser.insert(emp) > 0) {
					System.out.println("INSERTED SUCCESFULLY");
				} else {
					System.out.println("PLS TRY AGAIN");
				}
				break;
			case 2:
				System.out.println("ENTER EMPID");
				empid = sc.nextInt();
				System.out.println("ENTER EMPname");
				name = sc.next();
				System.out.println("ENTER ROLE");
				role = sc.next();
				System.out.println("ENTER SALARY");
				salary = sc.nextDouble();
				emp.setEmpid(empid);
				emp.setName(name);
				emp.setRole(role);
				emp.setSalary(salary);
				if (ser.update(emp) > 0) {
					System.out.println("UPDATED SUCCESFULLY");
				} else {
					System.out.println("PLS TRY AGAIN");
				}
				break;
			case 3:
				System.out.println("ENTER EMPID");
				empid = sc.nextInt();
				if (ser.delete(empid) > 0) {
					System.out.println("DELETED SUCCESFULLY");
				} else {
					System.out.println("PLS TRY AGAIN");
				}
				break;
			case 4:
				ResultSet rs = ser.display();
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getDouble(4)+"\t");
					System.out.println();
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("pls enter correct option");
				break;

			}

			System.out.println("PRESS YES TO CONTINUE");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("yes"));
		System.out.println("THANK YOU FOR VISTING WEDSITE");

	}

}

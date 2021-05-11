package javaPackage;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		List<Employee> employeeList=new ArrayList<Employee>();
		String another="Y";

		while(another.equalsIgnoreCase("Y")) {
			System.out.println("!!Employee Registration!!\n");
			System.out.println("# Add Employee (type 'ADD')");
			System.out.println("# Update Employee (type 'UPDATE')");
			System.out.println("# Delete Employee (type 'DELETE')");
			System.out.println("# Get Employee (type 'GET')");
			System.out.print("Enter Your Choice : ");
			String choice = sc.nextLine().toUpperCase().trim();
			
			Methods methods = new Methods();
			switch (choice) {
				case "ADD" :
					methods.addEmployee(employeeList);
					break;
				case "UPDATE" :
					methods.updateEmployee(employeeList);
					break;
				case "DELETE" :
					methods.deleteEmployee(employeeList);
					break;
				case "GET" :
					System.out.println("Enter 1 to Get ALL Employee Details");
					System.out.print("Or Enter 0 to Provide Employee ID/Index : ");
					int all = sc.nextInt();
					switch (all) {
					case 1 :
						methods.getAllEmployee(employeeList);
						break;
					case 0 :
						System.out.print("Provide Employee ID/Index : ");
						int ID = sc.nextInt();
						methods.getEmployee(employeeList,ID);
						break;
					default :
						System.out.println("Incorrect Input");
						break;
					}
				default :
					System.out.println("Incorrect Input");
					break;	
			}
			System.out.print("Another Response(Y/N) : ");
			another = sc.nextLine().trim();
		}
		sc.close();
	}
}
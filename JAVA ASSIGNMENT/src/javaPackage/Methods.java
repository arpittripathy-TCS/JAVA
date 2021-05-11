package javaPackage;

import java.util.List;
import java.util.Scanner;

public class Methods {
Scanner sc = new Scanner(System.in);
	
	public void addEmployee(List<Employee> employeeList) {
			System.out.print("Enter Employee Name : ");
			String empName = sc.nextLine().trim();
			System.out.print("Enter Employee Age : ");
			int empAge = sc.nextInt();sc.nextLine();
			System.out.print("Enter Employee Address : ");
			String empAddress = sc.nextLine().trim();
			long empId = 10125 + (employeeList.size()-1) + 1;
			Employee employee = new Employee(empId, empName, empAge, empAddress);
			employeeList.add(employee);
			System.out.println("Employee Added!!\n");
		
	}
	
	public void updateEmployee(List<Employee> employeeList) {
		System.out.print("Enter Employee ID / INDEX : ");
		long id = sc.nextLong();
		sc.nextLine();
		Employee emp = null;
		for(Employee e : employeeList) {
			if(e.getEmpId()==id||e.getEmpId()==10125+id) {
				emp = e;
				break;
			}
		}
		if (emp == null) {
			System.out.println("Incorrect ID");
			return;
		}
		System.out.print("Enter the field you want to UPDATE (NAME/AGE/ADDRESS) : ");
		String field = sc.nextLine();
		
		if(field.trim().equalsIgnoreCase("NAME")) {
			System.out.print("Enter new Name : ");
			emp.setEmpName(sc.nextLine());
			System.out.println("Employee Name Updated");
		} else if (field.trim().equalsIgnoreCase("AGE")) {
			System.out.print("Enter new Age : ");
			emp.setEmpAge(sc.nextInt());
			System.out.println("Employee Age Updated");
		} else if (field.trim().toUpperCase().contains("ADDR")) {
			System.out.print("Enter new Address : ");
			emp.setEmpAddress(sc.nextLine());
			System.out.println("Employee Address Update");
		} else {
			System.out.println("Incorrect Feild");
		}
	}
	
	public void deleteEmployee(List<Employee> employeeList) {
		System.out.print("Enter Employee ID / INDEX : ");
		long id = sc.nextLong();
		Employee emp = null;
		for(Employee e : employeeList) {
			if(e.getEmpId()==id||e.getEmpId()==10125+id) {
				emp = e;
				break;
			}
		}
		if (emp == null) {
			System.out.println("Incorrect ID");
			return;
		}
		employeeList.remove(emp);
		for(int i=0;i<employeeList.size();i++) {
			employeeList.get(i).setEmpId(10125+(i-1)+1);
		}
		System.out.println("Emolyee Deleted");
	}

	public void getAllEmployee(List<Employee> employeeList) {
		System.out.println("empID\tempName\t\tempAge\tempAddress");
		for(Employee emp : employeeList) {
			System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpAge()+"\t"+emp.getEmpAddress());
		}
	}
	
	public void getEmployee(List<Employee> employeeList, int id) {
		
		Employee emp = null;
		for(Employee e : employeeList) {
			if(e.getEmpId()==id||e.getEmpId()==10125+id) {
				emp = e;
				break;
			}
		}
		
		if (emp == null) {
			System.out.println("Incorrect ID");
			return;
		}
		
		System.out.println("empID\tempName\t\tempAge\tempAddress");
		System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpAge()+"\t"+emp.getEmpAddress());
	}
}

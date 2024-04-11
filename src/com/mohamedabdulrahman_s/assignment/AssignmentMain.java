package com.mohamedabdulrahman_s.assignment;

import com.mohamedabdulrahman_s.assignment.employees.*;
import com.mohamedabdulrahman_s.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
          Developer dev = new Developer("rahman",20,Employee.totalEmployees+1,30000.00,"smdabdulrahman",2);
          //generating githublink
          System.out.println(EmployeeUtilities.gitHubLink(dev));
          
          Manager man = new Manager("abu",20,Employee.totalEmployees+1,45684.00,"toast",3,6);
          //to get salary difference
          System.out.println(EmployeeUtilities.salaryDifference(dev, man));
          //to print basic details of employee
          EmployeeUtilities.printBasicDetails(man);
          
	}

}

package javaloops;

public class Example2 {

	public static void main(String[] args) {
	
		
			//forEach loop

			//Array		
			int employeeIds[] = {2029, 2211, 3331, 3938, 2928};

			double employeeSalaries[] = {93032.23, 83932.34, 92672.32, 47647.44, 56353.55};


			for(int employeeId: employeeIds) 
			{ 
				System.out.println(employeeId); 
			}

			System.out.println("======================");
			
			for(double employeeSalary: employeeSalaries)
			{
				System.out.println(employeeSalary);
			}

		}
	


	}



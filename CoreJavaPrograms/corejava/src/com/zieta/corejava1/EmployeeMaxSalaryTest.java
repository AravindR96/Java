
package com.zieta.corejava1;

public class EmployeeMaxSalaryTest {

	public static void main(String[] args) {
		EmployeeMaxSalary emp1=new EmployeeMaxSalary();
		EmployeeMaxSalary emp2=new EmployeeMaxSalary();
		EmployeeMaxSalary emp3=new EmployeeMaxSalary();
		EmployeeMaxSalary emp4=new EmployeeMaxSalary();
		
		
		emp1.Employee("Aravind",151,500);
		emp2.Employee("Arun",152,600);
		emp3.Employee("Akash",153,700);
		emp4.Employee("varun",154,650);
		EmployeeMaxSalary emp[]= {emp1,emp2,emp3,emp4};
		//int a=5;
		//int b=6;
		//int x[]= {a,b};
		
		/*int arr[]= {5,6,4,9,7,3,1,8,2};
		int max1=0,max2=-1;                      // int max=0;
		for (int val:arr) {                        // for(int val:arr){
			if (val>max1 &&val>max2 ) {            // if (val>max){
				max2=max1;                          // max=val;
				max1=val;                           // }
			}                                      // else if(val>max)
			                                         //     max=val;
			else if(val>max2) {                     //}
				max2=val;
			}
		}
		System.out.println(max1+" "+max2);
		*/
		int max1=0,max2=-1, max3=-2;
		String name1="";
		String name2="";
		String name3="";
		for (EmployeeMaxSalary val:emp) {
			if (val.salary>max1 &&val.salary>max2 &&val.salary>max3) {
				max3=max2;
				name3=name2;
				max2=max1;
				name2=name1;
				max1=val.salary;
				name1=val.name;
			}
			else if(  val.salary>max2) {
				max3=max2;
				name3=name2;
				max2=val.salary;
				name2=val.name;
			}
			else if(val.salary>max3) {
				max3=val.salary;
				name3=val.name;
		}
		
	}
		System.out.println(name1+" is geting highest"+max1+"\n"+name2+" 2nd highest "+max2+"\n" +name3+ " 3rd highest "+max3);
}
}

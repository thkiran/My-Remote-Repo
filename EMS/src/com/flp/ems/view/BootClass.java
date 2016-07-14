package com.flp.ems.view;
import com.flp.ems.domain.Employee;
import java.util.Scanner;

public class BootClass {
	
	public static void main(String[] args) {
        BootClass c =new BootClass();
	    c.menuSelection();
	}
	
     public void menuSelection(){
		UserInteraction obj =new UserInteraction();
		System.out.println("option 1 for AddEmployee");
		System.out.println("option 2 for ModifyEmployee");
		System.out.println("option 3 for RemoveEmployee");
		System.out.println("option 4 for SearchEmployee");
		System.out.println("option 5 for getAllEmployee");
		Scanner sc=new Scanner(System.in);  
		int i= sc.nextInt();
     
	switch(i){
		case 1:
		   obj.AddEmployee();
		   break;
		   
		case 2:
		   obj.ModifyEmployee();
		   break;
		   
		case 3:
		    obj.RemoveEmployee();
		    break;
		    
		case 4:
		   obj.SearchEmployee();
		   break;
		   
		case 5:
		   obj.getAllEmployee();
		   
		
		
		}
		
		
	}
	

}

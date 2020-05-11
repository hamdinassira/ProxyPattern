package com.pattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements ListEmploye{
	
	ListEmpIm l;
	 public List<Employe> getListEmp() {
		 
			
		
		 for (int j = 0; j < 3; j++) {
	        if(l == null){
	            System.out.println("Creation du contact list ...");
	            l = new ListEmpIm();
	        }}
	        return l.getListEmp();
		 }
	    
}

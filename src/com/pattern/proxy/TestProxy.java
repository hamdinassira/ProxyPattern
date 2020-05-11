package com.pattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class TestProxy {
	public static void main(String[] args) {
		
		ListEmploye lEmp=new Proxy();
		
		List<Employe> empList = lEmp.getListEmp();
		for(Employe emp : empList){
            System.out.println(emp);
        }
	}

}

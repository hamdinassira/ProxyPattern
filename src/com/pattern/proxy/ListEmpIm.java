package com.pattern.proxy;

import java.util.ArrayList;
import java.util.List;

public  class ListEmpIm implements ListEmploye{

	@Override
	public List<Employe> getListEmp() {
		// TODO Auto-generated method stub
		return getEmpList();
	}

    private static List<Employe> getEmpList(){
        List<Employe> empList = new ArrayList<Employe>(5);
        empList.add(new Employe("Employee A","aaaa", 25, "hiuhi"));
        empList.add(new Employe("Employee B","cccc", 24, "ihiuhyiu"));
        empList.add(new Employe("Employee C","bbb", 21, "khukhiu"));
        empList.add(new Employe("Employee D","dddd", 29, "kjuhuh"));
        empList.add(new Employe("Employee E","eeee", 27, "kuhiu"));
        return empList;
    }


}

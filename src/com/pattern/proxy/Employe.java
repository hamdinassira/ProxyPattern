package com.pattern.proxy;

public class Employe {
	String nom;
	String prenom;
	int age;
	String adresse;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Employe(String nom, String prenom, int age, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 public String toString(){
	        return "le nom: "+nom+", le prenom est: "+prenom+", l'age est : "+age+"l'adresse est "+adresse;
	    }
	 
	

}

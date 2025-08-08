package com.healthcare.module;
	public class Regpatient {
		private String Name;
		private int Age;
		private int ID;
		private String Illness;
		
		public void setName(String Patientname)
		 {
			 Name = Patientname; 
		 }
		public void setAge(int PatientAge)
		 { 
			 Age = PatientAge; 
		 }
		
		 public void setId(int PatientID)
		 {
			 ID = PatientID; 
		 }
		 public void setIllness(String PatientIllness)
		 {
			Illness = PatientIllness; 
		 }
		 public String Patientname() {     
		        return  Name;
		    }
		 public int PatientAge() {     
		        return  Age;
		    }
		 public int PatientID() {     
		        return  ID;
		    }
		 public String PatientIllness() {     
		        return  Illness;
		    }
		 
		 
	}


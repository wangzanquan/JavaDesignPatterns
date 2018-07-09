package com.javaSession.creational.four.factory.Practice;

public class GetPlanFactory {
	
	public Plan getPlan(String planType) {
		
		if(planType == null) {
			return null;
		}
		if(planType.equalsIgnoreCase("domesticplan")) {
			return new DomesticPlan();
		}
		if(planType.equalsIgnoreCase("Commercialplan")) {
			return new CommercialPlan();
		}
		if(planType.equalsIgnoreCase("Institutionplan")) {
			return new InstitutionPlan();
		}
		
		return null;
	}
	
	
}

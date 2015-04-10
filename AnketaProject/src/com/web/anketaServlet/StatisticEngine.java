package com.web.anketaServlet;

import java.util.ArrayList;

public class StatisticEngine {
	public static ArrayList <Respondent> respList = new ArrayList<>();
	
	
	public double getPercent(String musicPrefer){
		int count = 0;
		for(int i=0; i<respList.size(); i++){
			if(respList.get(i).musicPreferation.equals(musicPrefer)){
				count++;
			}	
		}
		double countDouble = count;
		double size = respList.size();
		
		double result = countDouble/(size/100);
		
		
		
		
		return result;
	}
	
	
}

package com.rajesh.data.visual.chartjs.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CanvasjsChartData {
	static Map<Object,Object> map = null;
	static List<List<Map<Object,Object>>> list = new ArrayList<List<Map<Object,Object>>>();
	static List<Map<Object,Object>> dataPoints1 = new ArrayList<Map<Object,Object>>();
	
	static {
		int count = 1000;
		int yVal = 100;
		Random rand = new Random();
		 
		for(int i = 0; i < count; i++){
			yVal += rand.nextInt(11) - 5;
			map = new HashMap<Object,Object>(); map.put("x", i + 1); map.put("y", yVal); dataPoints1.add(map);
		}
		
		list.add(dataPoints1);
	}
 
	public static List<List<Map<Object, Object>>> getCanvasjsDataList() {
		return list;
	}
}

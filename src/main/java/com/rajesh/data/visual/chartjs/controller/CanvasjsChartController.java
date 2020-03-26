package com.rajesh.data.visual.chartjs.controller;

import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.rajesh.data.visual.chartjs.service.CanvasjsChartService;

@Controller
public class CanvasjsChartController {
	@Autowired(required=true)
	private CanvasjsChartService canvasjsChartService;
 
	@GetMapping("/chartjs")
	public String springMVC(ModelMap modelMap) {
		List<List<Map<Object, Object>>> canvasjsDataList = canvasjsChartService.getCanvasjsChartData();
		modelMap.addAttribute("dataPointsList", canvasjsDataList);
		System.out.println("Returning");
		return "chartjsChart";
	}
	
	@GetMapping("/")
	public String myFunction() {
		return "apple";
	}
}

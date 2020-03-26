package com.rajesh.data.visual.chartjs.dao;

import java.util.List;
import java.util.Map;

import com.rajesh.data.visual.chartjs.model.CanvasjsChartData;

public class CanvasjsChartDaoImpl implements CanvasjsChartDao {
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData() {
		return CanvasjsChartData.getCanvasjsDataList();
	}
}

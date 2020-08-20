package com.textiles.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.textiles.po.TWarehouse;
import com.textiles.po.TWarehouseProduct1;


public interface TWarehouseProduct1Mapper {
	List<Map<String, Object>> selectInfo(String whNum);

	HashMap<String, Object> selectInfo2(int id);
	
	List<Map<String, Object>> selectInfo4(Map<String, String> rMap);
	
	List<Map<String, Object>> selectInfo5(Map<String, Object> rMap);

	int insertInfo(TWarehouse wp);
	
	int updateInfo(Map<String,Object> zMap);
	
	int deleteInfo(Map<String,Object> zMap);
	

}

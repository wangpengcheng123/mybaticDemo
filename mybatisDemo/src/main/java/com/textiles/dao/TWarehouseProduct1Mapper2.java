package com.textiles.dao;


import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Select;


public interface TWarehouseProduct1Mapper2 {
	@Select("select * from t_warehouse_product_1 where id=#{id} ")
	Map<String, Object> selectInfo2(int id);
}

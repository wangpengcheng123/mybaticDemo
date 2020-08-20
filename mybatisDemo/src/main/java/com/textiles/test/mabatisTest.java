package com.textiles.test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.textiles.dao.TWarehouseProduct1Mapper;
import com.textiles.dao.TWarehouseProduct1Mapper2;
import com.textiles.po.TWarehouse;
import com.textiles.po.TWarehouseProduct1;



public class mabatisTest {
	private SqlSession session;
	@Before
	public void beforeTest() {
		 String resource = "mybatis-config.xml";
    	 InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			 SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	    	  session=sqlSessionFactory.openSession();//true事务自动提交
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testMybatis1() {
	 //String statement="com.textiles.dao.TWarehouseProduct1Mapper.selectInfo2";
   	 //Map<String, Object> rMap=session.selectOne(statement, 14);
   	 //System.out.println(rMap.toString());
   	 //第一种通过命名空间来调用获取结果
   	 //Map<String, Object> resultMap_=session.selectMap(statement, "A04-73", "{wh_num}");
   	 //List<Map<String, Object>> resultMap_= resultMap_=session.selectList(statement, "A04-73");
   	 //for (Map<String, Object> map : resultMap_) {
			//System.out.println(map);
		//}
	 //String statement="com.textiles.dao.TWarehouseProduct1Mapper.selectInfo3";
	 //TWarehouseProduct1 wp=session.selectOne(statement, 14);
	 //System.out.println(wp.toString());
   	 //第二种通过接口对应xml文件
   	 //TWarehouseProduct1Mapper wpm_=session.getMapper(TWarehouseProduct1Mapper.class);
   	 //HashMap<String, Object> zkMap_=(HashMap<String, Object>) wpm_.selectInfo2(14);
   	 //System.out.println(zkMap_);
   	 //TWarehouseProduct1Mapper wpm_=session.getMapper(TWarehouseProduct1Mapper.class);
   	 //List<Map<String, Object>> zkMap_= wpm_.selectInfo("D20-35");
   	 //System.out.println(zkMap_.size());
   	 
   	 //第三种通过注解
   	 //TWarehouseProduct1Mapper2 wpm_=session.getMapper(TWarehouseProduct1Mapper2.class);
   	 //Map<String, Object> zkMap_=(Map<String, Object>) wpm_.selectInfo2(14);
   	// System.out.println(zkMap_);
	}
	//增删查改
	@Test
	public void testMybatis2() {
//	   	 TWarehouseProduct1Mapper wpm_=session.getMapper(TWarehouseProduct1Mapper.class);
//	   	 Map<String, String> rMap=new HashMap<String, String>();
//	   	 rMap.put("whId", "1");
//	   	 rMap.put("whNum", "D20-35");
//	   	 List<Map<String, Object>> zkList_=wpm_.selectInfo4(rMap);
//	   	 for (Map<String, Object> map : zkList_) {
//	   		System.out.println(map);
//		}
	   	 TWarehouseProduct1Mapper wpm_=session.getMapper(TWarehouseProduct1Mapper.class);
	   	 Map<String, Object> rMap=new HashMap<String, Object>();
	   	 rMap.put("whId", "1");
	   	 List<String> rmList=new ArrayList<String>();
	   	 rmList.add("D20-35");rmList.add("D11-53");
	   	rMap.put("whNums", rmList);
	   	 List<Map<String, Object>> zkList_=wpm_.selectInfo5(rMap);
	   	 for (Map<String, Object> map : zkList_) {
	   		System.out.println(map);
		}
	   	
	}
	
	//增改
	@Test
	public void testMybatis3() {
	   	//插入 
		 TWarehouseProduct1Mapper wpm_=session.getMapper(TWarehouseProduct1Mapper.class);
	   	 TWarehouse wh_=new TWarehouse();
	   	 wh_.setWhName("测试仓库1");
	   	 wh_.setCompanyId(1);
	   	 wh_.setWhTel("");
	   	 wh_.setWhAddress("");
	   	 wh_.setWhContacts("");
	   	 wh_.setOperatorId(16);
	   	 wh_.setOperatorName("系统管理员");
	   	 wh_.setCtime(new Date());
	   	 wh_.setParentId(0);
	   	 wh_.setParentIds("");
	   	 wh_.setWhLevel(1);
	   	 int countC_=wpm_.insertInfo(wh_);
	   	 Map<String, Object> rMap=new HashMap<String, Object>();
	   	 rMap.put("id", wh_.getId());rMap.put("whName", "测试仓库2");rMap.put("parentIds", "["+wh_.getId()+"]");
	   	 int countk_=wpm_.updateInfo(rMap);
	   	 
	}
	
	
	 //删
	@Test
	public void testMybatis4() {
	   	//插入 
		 TWarehouseProduct1Mapper wpm_=session.getMapper(TWarehouseProduct1Mapper.class);
	   	 Map<String, Object> rMap=new HashMap<String, Object>();
	   	 rMap.put("id", 48);
	   	 int countk_=wpm_.deleteInfo(rMap);  	 
	}
	

	@After
	public void AfterTest() {
		 session.commit();
    	 session.close();
	}

    
}

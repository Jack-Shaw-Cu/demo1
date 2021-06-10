package com.cdrundle.cdc.test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试实验室枚举
 *
 * @author 肖铜
 * @date 2021-05-31
 */
public class Test {

	@org.junit.Test
	public void test(){
//		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		System.out.println(MachineCode.Microplate.name());
		System.out.println(MachineCode.Microplate.toCode());
	}
}

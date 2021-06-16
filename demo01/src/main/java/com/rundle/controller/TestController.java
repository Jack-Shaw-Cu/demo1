package com.rundle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类 Controller
 * @author 肖铜
 * @date 2021-05-25
 */
@RestController
public class TestController {

	@GetMapping("/get/{id}")
	public Integer test(@PathVariable Integer id){
		System.out.println(id + "-----------");
		return changeValue(id);
	}

	/**
	 * id翻倍
	 *
	 * @param id
	 * @return
	 */
	public Integer changeValue(Integer id){
		System.out.println("双倍奉还");
		System.out.println("hello github");
		return id * id;
	}

	/**
	 * 测试方法
	 */
	public void test(){
		System.out.println("hello world");
	}
	
	@GetMapping("/hello")
	public Integer test2() {
		return 10;
	}

}

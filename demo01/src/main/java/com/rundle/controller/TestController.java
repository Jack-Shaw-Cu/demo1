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
		return id;
	}
}

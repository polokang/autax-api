package com.zhk.autaxapi.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zhk.autaxapi.domain.User;
import com.zhk.autaxapi.domain.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	// 创建线程安全的Map
	static Map<Integer, User> users = Collections.synchronizedMap(new HashMap<Integer, User>());
	@Autowired
    private UserRepository userRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<User> getUserList() {
		// 处理"/users/"的GET请求，⽤来获取⽤户列表
		// 还可以通过@RequestParam从⻚⾯中传递参数来进⾏查询条件或者翻⻚信息的传递
		List<User> r = new ArrayList<User>(users.values());
		return r;
	}

	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String postUser(@RequestBody String param) {
		// 处理"/users/"的POST请求，⽤来创建User
		// 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从⻚⾯中传递参数
		
		HashMap<?,?> parseMap = (HashMap<?,?>)JSONObject.parseObject(param, HashMap.class);
		
		JSONObject obj =(JSONObject) parseMap.get("user");
		User user = JSONObject.toJavaObject(obj,User.class);
		userRepository.save(user);
		return "success";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable Integer id) {
		// 处理"/users/{id}"的GET请求，⽤来获取url中id值的User信息
		// url中的id可通过@PathVariable绑定到函数的参数中
		User r = userRepository.getOne(id);
		System.out.println(r.getName());
		
		return r;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public String putUser(@PathVariable Integer id, @ModelAttribute User user) {
		// 处理"/users/{id}"的PUT请求，⽤来更新User信息
		User u = users.get(id);
		u.setName(user.getName());
		u.setAge(user.getAge());
		users.put(id, u);
		return "success";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable Integer id) {
		// 处理"/users/{id}"的DELETE请求，⽤来删除User
//		users.remove(id);
		return "success";
	}
}

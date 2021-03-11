package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

	
	//add to commit
	@RequestMapping(value = "/getInfo", method = RequestMethod.GET)  
	public List<String> getAllBooks()   
	{  
	 System.out.println("Inside method");
	 List<String> listString = new ArrayList<String>();
	 listString.add("Cindrella");
	 listString.add("Snowhite");
	 listString.add("How To Fall in Love");
	 System.out.println("Ending method");
	 return listString;
	}  
}

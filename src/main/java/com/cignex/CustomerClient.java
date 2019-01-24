package com.cignex;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CustomerClient {

	public static void main(String[] args) {
		String url="http://localhost:8080/customer";
		RestTemplate restTemplate=new RestTemplate();
		/*Customer[] entity=restTemplate.getForObject(url+"/list", Customer[].class);
		System.out.println(entity.toString());
		List<Customer> list=Arrays.asList(entity);
		for(Customer lists:list) {
			System.out.println(lists.toString());
		}*/
		
		/*ResponseEntity<Customer> responseEntity=restTemplate.getForEntity(url+"/ram", Customer.class);
		System.out.println(responseEntity);
		Customer customer=responseEntity.getBody();
		System.out.println(customer.toString());
		*/
		Customer request=new Customer("malav", "24", "989");
		ResponseEntity<Customer> responseEntity2=restTemplate.postForEntity(url+"/save", request, Customer.class);
		System.out.println(responseEntity2);
		Customer customer2=responseEntity2.getBody();
		System.out.println(customer2.toString());
	}
}

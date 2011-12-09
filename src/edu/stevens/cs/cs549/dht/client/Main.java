//
//	Main.java
//  Author : Bo Yu (boyu2011@gmail.com)
//  This program is used for test DHT REST services.
//

package edu.stevens.cs.cs549.dht.client;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Main {

	public static void main(String[] args) {
		
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		
		//
		// access the service through URI
		//
		
		WebResource service = client.resource(getBaseURI()).path("dhtresource");
		
		//
		// Put operation for DHT
		//
		
		String s = service.path("put")
			   .queryParam("key", "2")
			   .queryParam("value", "bob")
			   .accept(MediaType.TEXT_PLAIN)
			   .get(String.class);
		System.out.println(s);
		
		s = service.path("put")
			.queryParam("key", "2")
			.queryParam("value", "jack")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
		
		s = service.path("put")
			.queryParam("key", "2")
			.queryParam("value", "bill")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
		
		s = service.path("put")
			.queryParam("key", "3")
			.queryParam("value", "mark")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
		
		//
		// Get operation for DHT
		//
		
		s = service.path("get")
			.queryParam("key", "2")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
		
		//
		// Drop(2) operation for DHT
		//
		
		s = service.path("drop")
			.queryParam("key", "2")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
		
		//
		// Put(2)
		//
		
		s = service.path("put")
			.queryParam("key", "2")
			.queryParam("value", "neo")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
		
		//
		// Get operation for DHT
		//
		
		s = service.path("get")
			.queryParam("key", "2")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
		
		//
		// Insert(100) operation for DHT
		//
		
		s = service.path("insert")
			.queryParam("key", "100")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
		
		//
		// Put(100) operation for DHT
		//
		
		s = service.path("put")
				.queryParam("key", "100")
				.queryParam("value", "us")
				.accept(MediaType.TEXT_PLAIN)
				.get(String.class);
		System.out.println(s);
		
		//
		// Get operation for DHT
		//
		
		s = service.path("get")
			.queryParam("key", "100")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
/*		
		//
		// Delete operation for DHT
		//
		
		s = service.path("delete")
				.queryParam("key", "100")
				.accept(MediaType.TEXT_PLAIN)
				.get(String.class);
		System.out.println(s);
		
		//
		// Insert(100) operation for DHT
		//
		
		s = service.path("insert")
			.queryParam("key", "100")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
		
		//
		// Put(100) operation for DHT
		//
		
		s = service.path("put")
				.queryParam("key", "100")
				.queryParam("value", "china")
				.accept(MediaType.TEXT_PLAIN)
				.get(String.class);
		System.out.println(s);	
		
		//
		// Get operation for DHT
		//
		
		s = service.path("get")
			.queryParam("key", "100")
			.accept(MediaType.TEXT_PLAIN)
			.get(String.class);
		System.out.println(s);
*/
		
	}
	
	private static URI getBaseURI()
	{
		// For local uri.
		//return UriBuilder.fromUri("http://localhost/").port(9090).build();
		// For EC2 uri.
		return UriBuilder.fromUri("http://ec2-184-73-98-162.compute-1.amazonaws.com/").port(9090).build();
	}
}

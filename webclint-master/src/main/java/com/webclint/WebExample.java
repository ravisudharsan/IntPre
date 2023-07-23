package com.webclint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class WebExample {
	@GetMapping(value="/play")
	public String get() {
		String url="http://localhost:8080/hi";
		WebClient.Builder a=WebClient.builder();
		String Sample=a.build().get().uri(url).retrieve().bodyToMono(String.class).block();
		return Sample;
				}

}

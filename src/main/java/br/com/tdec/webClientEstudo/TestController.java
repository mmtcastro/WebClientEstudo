package br.com.tdec.webClientEstudo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@ComponentScan
public class TestController {
	
	@GetMapping
	public String test() {
		return"<H1> Hello </H1>";
	}
}

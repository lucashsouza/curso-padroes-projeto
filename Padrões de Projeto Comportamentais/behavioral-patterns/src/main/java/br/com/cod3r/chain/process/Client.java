package br.com.cod3r.chain.process;

import br.com.cod3r.chain.process.service.GenericService;
import br.com.cod3r.chain.process.service.ProcessContext;
import br.com.cod3r.chain.process.service.ServicesCatalog;

public class Client {

	public static void main(String[] args) {

		ProcessContext processContext = new ProcessContext();
		processContext.put("name", "Lucas");
		processContext.put("email", "teste@test.com");
		processContext.put("password", "1234");
		Object response = GenericService.run(ServicesCatalog.saveUserProcess, processContext);
		System.out.println(response);

		processContext.reset();
		processContext.put("name", "Jessica");
		processContext.put("email", "test2@test.com");
		processContext.put("password", "1234");
		response = GenericService.run(ServicesCatalog.saveUserProcess, processContext);
		System.out.println(response);
	}
}

package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		ITGuy itGuy = new ITGuy("Lucas Souza", 21, 4000d);
		ProjectManager projectManager = new ProjectManager("Jessica Iansen", 20, 6000d);

		System.out.println(csvConverter.getEmployeeFormatted(itGuy));
		System.out.println(jsonConverter.getEmployeeFormatted(itGuy));

		System.out.println(csvConverter.getEmployeeFormatted(projectManager));
		System.out.println(jsonConverter.getEmployeeFormatted(projectManager));

	}
}

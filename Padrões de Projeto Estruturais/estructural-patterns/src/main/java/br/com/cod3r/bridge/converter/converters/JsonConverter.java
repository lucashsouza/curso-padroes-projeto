package br.com.cod3r.bridge.converter.converters;

import br.com.cod3r.bridge.converter.employees.Employee;

public class JsonConverter implements Converter {

	@Override
	public String getEmployeeFormatted(Employee employee) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("{\n")
			.append("\t\"name\": \"").append(employee.getName()).append("\",\n")
			.append("\t\"age\": \"").append(employee.getAge()).append("\",\n")
			.append("\t\"salary\": \"").append(employee.getSalary()).append("\",\n")
		.append("}");
		
		return stringBuilder.toString();
	}

}

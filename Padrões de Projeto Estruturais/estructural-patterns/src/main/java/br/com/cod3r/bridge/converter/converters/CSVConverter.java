package br.com.cod3r.bridge.converter.converters;

import br.com.cod3r.bridge.converter.employees.Employee;

import java.util.Locale;

public class CSVConverter implements Converter {

	@Override
	public String getEmployeeFormatted(Employee employee) {
		return String.format(Locale.US, "%s;%d;%.2f",
				employee.getName(),
				employee.getAge(),
				employee.getSalary());
	}

}

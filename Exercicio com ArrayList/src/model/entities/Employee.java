package model.entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	public Employee() {
	}

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		double newValue = this.salary * (percentage / 100);
		this.salary += newValue; // this é opcional porque nao tem abguidade
		// salary+= salary * percentage / 100; -> correcao
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary) + "\n";
	}
}

package ej5;

public class DevolverFuncion {
	enum EmployeeType {Hourly, Salary, Sales};

	public float calculatePay(int hourssWorked, 
			float payRate, EmployeeType type) {
		switch (type) {
		case Hourly:
			return hourssWorked * payRate;
		case Salary:
			return 40 * payRate;
		case Sales:
			return 500.0f + 0.15f * payRate;
		default:
			return 0.0f;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class NestedClass {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Programmern Zaman Now");

        Company.Employee employee = company.new Employee();
        employee.setName("Sony Darmawan");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}

package spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;

import spring.orm.entity.Employee;

@Transactional
public class EmployeeDao {
	
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public int insert(Employee employee) {
		Serializable result = template.save(employee);
		return (Integer) result;
	}
	
	public void update(Employee employee) {
		template.update(employee);
	}
	
	public void delete(int id) {
		Employee e = template.get(Employee.class, id);
		template.delete(e);
		System.out.println("employee with id "+id+" is deleted successfully");
	}
	
	public Employee getEmployee(int id) {
		Employee employee = template.get(Employee.class, id);
		return employee;
	}
	
	public List<Employee> getEmployees(){
		List<Employee> employees = template.loadAll(Employee.class);
		return employees;
	}
}

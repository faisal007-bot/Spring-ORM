package spring.orm.executor;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.orm.dao.EmployeeDao;
import spring.orm.entity.Employee;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/orm/executor/config.xml");
		EmployeeDao dao = context.getBean("dao",EmployeeDao.class);
		
//		inserting the employee
//		Employee e1 = new Employee(56, "neko", "delhi");
//		int status = dao.insert(e1);
//		System.out.println("employee with id "+status+" successfully inserted");
		
//		updating the employee
//		Employee e2 = new Employee();
//		e2.setId(11);
//		e2.setCity("sharjah");
//		e2.setName("faisal");
//		dao.update(e2);
//		System.out.println("employee with employee id "+e2.getId()+" updated successfully");

//		deleting the employee
//		dao.delete(151);
		
//		getting the single employee
//		Employee e = dao.getEmployee(1531);
//		System.out.println("id = "+e.getId());
//		System.out.println("name = "+e.getName());
//		System.out.println("city = "+e.getCity());
		
//		getting all the employees
		List<Employee> employees = dao.getEmployees();
		for(Employee e:employees) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getCity());
		}
	}
}

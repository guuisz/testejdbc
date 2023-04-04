package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=== TEST 2: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== TEST 3: department insert ====");
		Department depInsert = new Department(null,"Dogs");
		departmentDao.insert(depInsert);
		System.out.println("Dep if Id = " + depInsert.getId() + " is inserted!");
		
		System.out.println();
		System.out.println("=== TEST 4: department update ====");
		dep.setName("Cats");
		departmentDao.update(dep);
		System.out.println("Updated!");
		
		System.out.println();
		System.out.println("=== TEST 5: department delete ====");
		departmentDao.deleteById(11);
		System.out.println("Deleted!!");

	}

}

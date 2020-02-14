package EmployeeDB;

import java.util.List;
import java.util.OptionalInt;

public interface EmployeeDB {
List< EmployeeDB> getAllEmployeeDB();
	
	OptionalInt getEmployeeDBById(String c_id);
	 EmployeeDB addNewEmployeeDB( EmployeeDB com);
	 
	boolean IsEmployeeDBIsExsists(String s);

}

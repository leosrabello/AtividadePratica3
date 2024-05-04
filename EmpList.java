import java.util.ArrayList;

public class EmpList {

        private ArrayList<Employee> employees;

    public EmpList() {
        employees = new ArrayList<>();
    }

    public void addEmp (Employee employee) {
        employees.add(employee);
    }

    
    public void showEmps() {
        for (Employee employee : employees) {
            System.out.println(employee.name + "\n" + employee.id);
        }
        
    }
    
    public Employee searchByName (String name) {
        
        for (Employee employee : employees) {
            
            if (employee.name.equals(name)) {
                return employee;
            }
            
        }
        
        return null;
        
    }
    
    public Employee searchById (int id) {
        
        for (Employee employee : employees) {
            
            if (employee.id == id) {
                return employee;
            }
            
        }
        
        return null; 
    }
    public void deleteByName (String name) {
    
        for (int i = 0; i < employees.size(); i++) {
    
            if (employees.get(i).name.equals(name)) {
                employees.remove(i);
                return; 
            }
        }
    }
    
    public void deleteById(int id) {
    
        for (int i = 0; i < employees.size(); i++) {
    
            if (employees.get(i).id == id) {
                employees.remove(i);
                return;
            }
    
        }
    
    }
}

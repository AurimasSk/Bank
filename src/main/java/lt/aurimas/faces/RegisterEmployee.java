package lt.aurimas.faces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import lt.aurimas.controller.EmployeeController;
import lt.aurimas.model.Employee;

@ManagedBean
@SessionScoped
public class RegisterEmployee {
 
    @ManagedProperty("#{employeeService}")
    private EmployeeController emplyoyeeController;
 
    private Employee employee = new Employee();
 
    public EmployeeController getEmployeeService() {
        return emplyoyeeController;
    }
 
    public void setEmployeeService(EmployeeController employeeService) {
        this.emplyoyeeController = employeeService;
    }
 
    public Employee getEmployee() {
        return employee;
    }
 
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
 
    public String register() {
        // Calling Business Service
    	emplyoyeeController.register(employee);
        // Add message
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("The Employee "+this.employee.getEmployeeName()+" Is Registered Successfully"));
        return "";
    }
}

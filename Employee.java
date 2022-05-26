package mypack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	String empName;
	@Autowired
	Address address;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}
	public void employeeAddress()
	{
		address.printAddress();
	}
	
	

}

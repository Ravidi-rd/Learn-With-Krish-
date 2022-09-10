package model;

public class Employee {
    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }



    private String EmployeeId;
    private String EmployeeCode;
    private String FirstName;
    private String LastName;
    private String Address;
    private String NIC;

    public Employee(String EmployeeId, String EmployeeCode, String FirstName, String LastName, String Address, String NIC) {

        this.EmployeeId = EmployeeId;
        this.EmployeeCode = EmployeeCode;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.NIC = NIC;


    }

    @Override
    public boolean equals(Object obj) {

        Employee employee = (Employee) obj;

        if (employee.getEmployeeId() == this.EmployeeId || employee.getEmployeeCode() == this.EmployeeCode) {

            return  true;

        } else{

            return false;

        }


    }
    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", EmployeeCode='" + EmployeeCode + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                ", NIC='" + NIC + '\'' +
                '}';
    }

}

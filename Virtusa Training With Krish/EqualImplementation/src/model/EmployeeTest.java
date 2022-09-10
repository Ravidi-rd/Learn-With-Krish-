package model;

public class EmployeeTest {
    public static void main(String[] args){

        Employee employee0001 = new Employee("E0001","EC0001","Ravidi","Rathnasri","Udanaluwela,Balangoda","199884810919");
        Employee employee0002 = new Employee("E0002","EC0002","Kasun","Bandara","Pinnawala,Balangoda","199811181091");

        Boolean testresult1 = employee0001.equals(employee0002);
        System.out.println("employee0001 Equals employee0002 :"+ testresult1);

        System.out.println(employee0001);
        System.out.println(employee0002);

        System.out.println("===================================================================");

        employee0002.setEmployeeId("E0001");
        employee0002.setEmployeeCode("EC0001");
        Boolean testresult2 = employee0001.equals(employee0002);
        System.out.println("employee0001 Equals employee0002 :"+ testresult2);

        System.out.println(employee0001);
        System.out.println(employee0002);

    }
}

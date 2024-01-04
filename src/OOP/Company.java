package OOP;

interface Company {
    String NameOfCompany="Microsoft";

}
class Department implements Company{
    int DeptNo;
    String DeptName;
}

class Employee extends Department{
    String name;
    String designation;

    Employee(String name, String Designation,int DeptNo,String DeptName,String Company){
        this.designation=Designation;
        this.DeptName=DeptName;
        this.name=name;
        this.DeptNo=DeptNo;
    }
}
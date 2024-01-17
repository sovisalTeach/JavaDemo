package DemoOOPs.DemoInterFace;

public class Employee {
    private String nameEmployee;
    private String phoneEmployee;

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getGenderEmployee() {
        return genderEmployee;
    }

    public void setGenderEmployee(String genderEmployee) {
        this.genderEmployee = genderEmployee;
    }

    private String genderEmployee;

    public Employee(String nameEmployee, String phoneEmployee, String genderEmployee){
        this.nameEmployee = nameEmployee;
        this.phoneEmployee = phoneEmployee;
        this.genderEmployee = genderEmployee;
    }
}

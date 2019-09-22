public class Employee extends Address implements EmployeeInterface {


    String name;
    String DOB;
    Integer age;

    public Employee(String name, String DOB, Integer age) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean setAddress(String streetNo, String postOffice, String country) {
        super.streetNo =streetNo;
        super.postOffice = postOffice;
        super.country = country;
        return true;
    }

    @Override
    public String getAddress() {
        return super.getStreetNo() + "," + super.getPostOffice() + "," + super.getCountry();
    }

    @Override
    public int getEmployeeAge(String name) {
        return this.age;
    }

    @Override
    public String getDOB(String name) {
        return this.DOB;
    }

    public String getName() {
        return name;
    }
}

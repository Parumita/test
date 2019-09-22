public interface EmployeeInterface {

    boolean setAddress(String streetNo, String postOffice, String country);
    String getAddress();
    int getEmployeeAge(String name);
    String getDOB(String name);
}

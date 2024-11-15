public class Employee {
    private int emp_id;
    private String name;

    public int getEmpid(){
        return emp_id;

    }
    public void setEmpid(int emp_id){
        this.emp_id = emp_id;

    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpid(77204);
        emp.setName("Saurabh Pathak");

        System.out.println("Name:" + " " + emp.getName());
        System.out.println("Emp ID:" + " " + emp.getEmpid());
    }
}


public class Student {
    private int stud_id;
    private String name;
    private float grades;

    public int getstud_id(){
        return stud_id;
    }
    public void setStud(int stud_id){
        this.stud_id=stud_id;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public float getGrades(){
        return grades;
    }
    public void setGrades(float grades){
        this.grades=grades;
    } 
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Saurabh");
        std.setStud(2345);
        std.setGrades(8);
        System.out.println("Name" + " " +std.getName());
        System.out.println("Stud ID" + " " +std.getstud_id());
        System.out.println("Grades" + " " +std.getGrades());
        
    }
    
}

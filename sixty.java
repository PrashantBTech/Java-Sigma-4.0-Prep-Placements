public class sixty {
    public static void main(String[] args) {
        
    student s1 = new student();
    s1.setname("John");
    s1.setSchoolname("School");
    student s2 = new student();
    s2.setname("John");
    s2.getinfo();

}


}
class student{
    String name;
    static String Schoolname;
    void setname(String name){
        this.name=name;
    }
    void setSchoolname(String Schoolname){
        this.Schoolname=Schoolname;
    }
    void getinfo(){
       System.out.println(name+" "+Schoolname);
    }
}

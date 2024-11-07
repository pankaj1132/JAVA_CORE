package Object;

public class student {
    int sid;
    String sname;

    public student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
    public boolean  equals(Object o){
        student s3=(student)o;
        return this.sname==s3.sname && this.sid == s3.sid;
    }
    public int hashCode(){
        return Integer.hashCode(sid)+sname.hashCode();
    }
    public static void main(String[] args) {
        student s1=new student(123,"ram");
        student s2=new student(123,"ram");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
    }
}
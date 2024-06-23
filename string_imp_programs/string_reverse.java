package Saurabh_Automation_Project.string_imp_programs;

public class string_reverse {
    public static void main(String[] args){
        String s="StringReverse"; String o="";
        char [] c=s.toCharArray();
        for (int i=c.length-1; i>0; i--){
            o=o+c[i];
        }
        System.out.println(o);
        System.out.println("c1");
    }
}

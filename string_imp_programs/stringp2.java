package Saurabh_Automation_Project.string_imp_programs;

public class stringp2 {
    public static void main(String[]args){
    
    String s="haurabS"; char b[]=s.toCharArray();
    char t;
    for(int i=0; i<s.length(); i++){
        if(i==0){
            t=b[i];
            b[i]=b[b.length-1];
            b[b.length-1]=t;
        }
    }
    System.out.println(String.valueOf(b));
}
}
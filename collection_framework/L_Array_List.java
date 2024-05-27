package Saurabh_Automation_Project.collection_framework;
import java.util.ArrayList;
import java.util.Iterator;
public class L_Array_List {

public static void main(String[]args){
    ArrayList <String> al=new <String> ArrayList();
    al.add("Monday");
    al.add("Tuesday");
    al.add("Wednesday");
    al.add("Thrussday");
    al.add("Friday");
    al.add("Saturday");
    al.add("Sunday");
    al.set(0, "Days");

    Iterator<String> it=al.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
}
}
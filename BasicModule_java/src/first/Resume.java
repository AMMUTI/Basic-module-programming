package first;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class Resume {
String name;
String age;
String degree;
String branch;
String contact;
static int regID=0;
public Resume (String name,String age,String degree,String branch,String contact)
{
this.name=name;
this.age=age;
this.degree=degree;
this.branch=branch;
this.contact=contact;

}
public static void main(String args[]) throws IOException  
{
	String name;
	String age;
	String degree;
	String branch;
	String contact;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Name");
	name=br.readLine();
	System.out.println("Enter your age");
	age=br.readLine();
	System.out.println("Enter your Degree");
	degree=br.readLine();
	System.out.println("Enter your Branch");
	branch=br.readLine();
	System.out.println("Enter your Contact Number");
	contact=br.readLine();
	Resume stud= new Resume(name,age,degree,branch,contact);
	stud.register(name,age,degree,branch,contact);
	
}
void register(String name,String age,String degree,String branch,String contact)
{
System.out.println("Name	   :"+this.name);
System.out.println("Age        :"+this.age);
System.out.println("Degree     : "+this.degree);
System.out.println("Branch     :"+this.branch);
System.out.println("Contact    :"+this.contact);

}
}


import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
    @Override 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException 
{ 
 String name=request.getParameter("name"); 
 String fathername=request.getParameter("fathersname"); 
 String address=request.getParameter("address"); 
 String phonenumber =request.getParameter("phonenumber"); 
 String emailid=request.getParameter("emailid"); 
 String date=request.getParameter("Date"); 
 String month=request.getParameter("Month"); 
 String year=request.getParameter("Year"); 
 String course1=request.getParameter("Course1"); 
 String course2=request.getParameter("Course2"); 
 String course3=request.getParameter("Course3"); 
 String grade1=request.getParameter("Grade1"); 
 String grade2=request.getParameter("Grade2"); 
 String grade3=request.getParameter("Grade3"); 
 String py1=request.getParameter("passingyear1"); 
 String py2=request.getParameter("passingyear2"); 
 String py3=request.getParameter("passingyear3"); 
 
 String h1=request.getParameter("h1"); 
 String h2=request.getParameter("h2"); 
 String h3=request.getParameter("h3"); 
 String h4=request.getParameter("h4"); 
 String r1=request.getParameter("lang1"); 
 String r2=request.getParameter("lang2"); 
 String r3=request.getParameter("lang3"); 
 String r4=request.getParameter("lang4"); 
 String r5=request.getParameter("lang5"); 
 String r6=request.getParameter("lang6"); 
 String r7=request.getParameter("lang7"); 
 String r8=request.getParameter("lang8"); 
 response.setContentType("text/html"); 
 PrintWriter out = response.getWriter(); 
 out.print("<h1>Resume</h1> <br/>"); 
 out.print("<h3><u>Personal Information</u></h3><br/>"); 
 out.print("Name :"+name+"<br>"); 
 out.print("Father's name : "+ fathername +"<br/>"); 
 out.print("Resisential Address : "+ address +"<br/>"); 
 out.print("Contact Number : "+ phonenumber +"<br/>"); 
 out.print("Email Address : "+ emailid +"<br/>"); 
 out.print("Date of Birth :"+date+ " "+month+" "+year); 
 out.print("<h3><u>Qualification Related Information</u></h3><br/>"); 
 out.print("<h2><b>Graduation:</b></h2><br/>"); 
 out.print("Course : "+course1+"<br/>"); 
 out.print("Grade : "+grade1+"<br/>"); 
 out.print("Year of Passing : "+py1+"<br/>"); 
 out.print("<h2><b>Intermediate:</b></h2><br/>"); 
 out.print("Course : "+course2+"<br/>"); 
 out.print("Grade : "+grade2+"<br/>"); 
 out.print("Year of Passing : "+py2+"<br/>"); 
 out.print("<h2><b>Matriculation:</b></h2><br/>"); 
 out.print("Course : "+course3+"<br/>"); 
 out.print("Grade : "+grade3+"<br/>"); 
 out.print("Year of Passing : "+py3+"<br/>"); 
 out.print("<h3><u>Experience</u></h3><br/>"); 
 out.print("<h3><u>Skills</u></h3><br/>"); 
 out.print("Hobbies and Interests : <br>"+ h1+"<br>"+h2+"<br>"+h3+" "+h4+"<br>"); 
 String a="Any Other-"; 
 out.print("Programming Languages Known : <br>"+ r1+"<br>"+r2+"<br>"+ 
r3+"<br>"+ r4+"<br>" + r5+"<br>"+ r6+"<br>"+ r7+"<br>"+a+" "+r8); 
 out.print("</body></html>"); 
 
 } 
 
}


    
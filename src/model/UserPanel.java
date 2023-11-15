
package model;


import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import javax.imageio.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;


public class UserPanel {
   private int pid;
   private String firstName;
   private String lastName;
   private String age;
   private Date dob;
   private String gender;
   private String email;
   private String patientType;
   private String msg;
   private Icon pic;

   public int getPid(){
       return pid;
   }
   public void setPid(int pid){
       this.pid=pid;
   }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public Date getDOB(){
        
    return dob;
    }
    public void setDOB(Date dob){
        this.dob=dob;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Icon getPic() {
        return pic;
    }

    public void setPic(Icon pic) {
        this.pic = pic;
    }
    
    
}

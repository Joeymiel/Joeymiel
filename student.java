/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class student {
 
    private String name;
    private String section;
    private String motto;


    public Student(String name, String section, String motto) {
        this.name = name;
        this.section = section;
        this.motto = motto;
    }

    
    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public String getMotto() {
        return motto;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String toString() {
        return "Name: " + name + "\nSection: " + section + "\nMotto: " + motto;
    }
}

}

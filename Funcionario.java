import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {
    private String name, gender;
    private int birthDay, birthMonth, birthYear;
    private int age;

    public Funcionario() {

    }

    public Funcionario(String name, int birthYear, int birthDay, int birthMonth, String gender, int age) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay() {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth() {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear() {
        this.birthYear = birthYear;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender() {
        this.gender = gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge() {
        this.age = age;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.enterprise.inject.Model;

/**
 *
 * @author kareem
 */

@Model
public class TwoCDi {
    
    private String name ;
    
    private String password ;

    private String comments ;

    private boolean full ;

    private ArrayList allLanguages = new ArrayList(Arrays.asList("java","c","c-sharp","objective-c","visual basic"
    ,"action script"));
    
    private ArrayList hisLangs ;

    private Date birthDate = new Date() ;

    private String favIDE ;
    
    public Date getBirthDate() {
    
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
    
        this.birthDate = birthDate;
    }
    
    public ArrayList getAllLanguages() {
    
        return allLanguages;
    }

    public ArrayList getHisLangs() {
    
        return hisLangs;
    }

    public void setHisLangs(ArrayList hisLangs) {
    
        this.hisLangs = hisLangs;
    }
    
    public boolean getFull() {
    
        return full;
    }

    public void setFull(boolean full) {
    
        this.full = full;
    }
   
    public String getComments() {
    
        return comments;
    }

    public void setComments(String comments) {
    
        this.comments = comments;
    }
    
    public String getName() {
    
        return name;
    }

    public String getPassword() {
    
        return password;
    }

    public void setName(String name) {
    
        this.name = name;
    }

    public void setPassword(String password) {
    
        this.password = password;
    }

    public String getFavIDE() {
    
        return favIDE;
    }

    public void setFavIDE(String favIDE) {
    
        this.favIDE = favIDE;
    }
    
    
}

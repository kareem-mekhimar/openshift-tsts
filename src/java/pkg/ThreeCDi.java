/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;

/**
 *
 * @author kareem
 */

@Model
public class ThreeCDi {
    
    private String s1 ;

    private String date ;

    private String tel ;
    
    private int slideValue ;

    private String time ;

    private String dateTimeLocal ;

    private String email ;
    
    private String url ;
    
    private String week ;
    
    private String month ;

    private int number ;

    private String [] options = new String[4] ;
    
    @PostConstruct
    private void init()
    {
      options[0] = "kareem" ;
      
      options[1] = "esraa" ;
      
      options[2] = "aziza" ;
      
      options[3] = "mama" ;
      
    }
    
    public int getNumber() {
    
        return number;
    }

    public String getTel() {
    
        return tel;
    }

    public void setOptions(String[] options) {
    
        this.options = options;
    }

    public String[] getOptions() {
    
        return options;
    }

    public void setNumber(int number) {
    
        this.number = number;
    }
    
    public String getEmail() {
    
        return email;
    }

    public String getMonth() {
    
        return month;
    }

    public void setEmail(String email) {
    
        this.email = email;
    }

    public void setMonth(String month) {
    
        this.month = month;
    }

    public void setUrl(String url) {
    
        this.url = url;
    }

    public void setWeek(String week) {
    
        this.week = week;
    }

    public String getUrl() {
    
        return url;
    }

    public String getWeek() {
    
        return week;
    }
    
    
    public String getDateTimeLocal() {
    
        return dateTimeLocal;
    }

    public void setDateTimeLocal(String dateTimeLocal) {
    
        this.dateTimeLocal = dateTimeLocal;
    }
    
    
    public String getTime() {
    
        return time;
    }

    public void setTime(String time) {
    
        this.time = time;
    }
    
    
    public int getSlideValue() {
    
        return slideValue;
    }

    public void setSlideValue(int slideValue) {
    
        this.slideValue = slideValue;
    }
    
    
    public String getDate() {
    
        return date;
    }

    public void setDate(String date) {
    
        this.date = date;
    }
    
    
    public String getS1() {
    
        return s1;
    }

    public void setS1(String s1) {
    
        this.s1 = s1;
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.component.UINamingContainer;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;

/**
 *
 * @author kareem
 */

@FacesComponent("date")
public class DateComponent extends UIInput implements NamingContainer{
    
    private UIInput daysInput ;
    
    private UIInput monthsInput ;
    
    private UIInput yearInput ;

    @Override
    public String getFamily() {

        return UINamingContainer.COMPONENT_FAMILY ; 
    }

    @Override
    public void decode(FacesContext context) {
    
        Map<String,String> requestMap = context.getExternalContext().getRequestParameterMap() ;
        
        String days = requestMap.get(daysInput.getClientId(context)) ;
        
        String month = requestMap.get(monthsInput.getClientId(context)) ;
        
        String year = requestMap.get(yearInput.getClientId(context)) ;
        
        setSubmittedValue(days+"/"+month+"/"+year);
        
    }

    @Override
    protected Object getConvertedValue(FacesContext context, Object newSubmittedValue) throws ConverterException {

        return getConverter().getAsObject(context, this, newSubmittedValue+"") ;
    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException {
    
        Date date =  (Date) super.getValue(); 
        
        System.out.println(date);
        
        Calendar calendar = Calendar.getInstance() ;
        
        calendar.setTime(date);
        
        daysInput.setValue(calendar.get(Calendar.DAY_OF_MONTH));
        
        monthsInput.setValue(calendar.get(Calendar.MONTH) + 1);
        
        yearInput.setValue(calendar.get(Calendar.YEAR));
    
        super.encodeBegin(context);
    }
    
    
    public UIInput getDaysInput() {
    
        return daysInput;
    }

    public UIInput getMonthsInput() {
    
        return monthsInput;
    }

    public UIInput getYearInput() {
    
        return yearInput;
    }

    public void setDaysInput(UIInput daysInput) {
    
        this.daysInput = daysInput;
    }

    public void setMonthsInput(UIInput monthsInput) {
    
        this.monthsInput = monthsInput;
    }

    public void setYearInput(UIInput yearInput) {
    
        this.yearInput = yearInput;
    }
    
    public int [] getYears()
    {
      int [] years = new int[50] ;
      
      for(int year = 1975 , i = 0 ; i < 50 ; i++ , year ++)
      {
        years[i] = year ;  
      }
      
      return years ;
    }
    
    public int[] getMonths()
    {
      int [] months = new int[12] ;
      
      for(int i = 1 ; i <= months.length ; i++)
          
          months[i - 1] = i ;
      
      return months ;
    }
    
    public int [] getDays()
    {
      GregorianCalendar calendar = new GregorianCalendar() ;
         
      Object valueOfMonthField = monthsInput.getValue() ;
      
      if(valueOfMonthField != null)
          
          calendar.set(Calendar.MONTH, Integer.parseInt(valueOfMonthField+"") - 1);
      
      int noOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH) ;
      
      int [] days = new int[noOfDays] ;
      
      for(int i = 0 ; i < days.length ; i++)
      {
         days[i] = i + 1 ; 
      }
      
      return days ;
    }
    
        
}

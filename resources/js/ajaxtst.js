/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function (){
    
    $(document).ajaxSend(function (opts){

        $('<img id="lo" src="'+imgUrl+'"/>').appendTo("#target") ;
    }) ;
    
    $(document).ajaxComplete(function (){
    
        $("#lo").remove() ;
    }) ;
    
    
    $("#but").click(function (){
        
       //. $("#target").load(context+"/ajaxtst",{name:"koko"}) ;
       
       $.ajax({
           url:context+"/ajaxtst" ,
           data:{name:"kimo00000000000"},
           type:"post",
           success:function (result)
           {
             $("#target").html(result) ;   
           }
       });
    }) ;
   
   //////////////////////////////////////// jsf global ajax
   
    var statusFunc = function(data)
    {
      var status = data.status ;
      
      if(status == "begin")
      {
        $("#target").empty() ;
        
        $('<img id="lo" src="'+imgUrl+'"/>').appendTo("#target") ;   
      }
      else if(status == "complete")
      {
        $("#target").empty() ;
        
        $("#target").append("<h1 id='re'>request is completed</h1>") ;
      }
      else if(status == "success") // success
      {
        alert(data.responseCode) ;
        
        $("#re").append(" and success") ;
      }
    }

    var onError = function (data)
    {
        alert(data.responseCode) ;  
    }
    
    jsf.ajax.addOnEvent(statusFunc) ;   
    
    jsf.ajax.addOnError(onError) ;
});

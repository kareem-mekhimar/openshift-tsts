/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function (){
    
    var isPressed ;
    
    $("#canvas").mousedown(function (){
        
        isPressed = true ;
        
    }).mouseup(function (){
        
        isPressed = false ;
        
    }) ;
    
    $("#canvas").mousemove(function (event){
        
        if(isPressed)
            
           $("#canvas").drawRect({
              fillStyle : "red" ,
              x : event.pageX ,
              y : event.pageY ,
              width : 5 , 
              height : 5
           }) ;  
    }) ;
}) ;
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function (){
   
    $("#diabImg").on("dragstart",function (event){
        
        var dataTransfer = event.originalEvent.dataTransfer ;
        
        dataTransfer.setData("Text",this.id) ;
        
        dataTransfer.effectAllowed = "move" ;
        
    }) ;
    

     $("#target").on("dragover",function (e){
        
         var event = e.originalEvent;
   
         if (event.preventDefault) {
        
             event.preventDefault();
        }
    
         event.dataTransfer.dropEffect = 'move';
        
         return false ;
        
    }).on("drop",function (e){
        
         var event = e.originalEvent;
    
         if (event.stopPropagation) {
        
             event.stopPropagation();
        }
    
        var dataTransfer = event.dataTransfer;
    
        var draggedId = dataTransfer.getData('Text');
    
        $("#"+draggedId).appendTo("#"+this.id) ;
        
         return false ;
    });
}) ;
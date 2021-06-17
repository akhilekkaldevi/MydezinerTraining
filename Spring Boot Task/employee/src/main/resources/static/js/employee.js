$(document).ready(function () {
    $.get('http://localhost:8080/employee',function (data) {
        
        $('.empDiv').append("<table class='empTable'></table>");
        $('.empTable').append("<th>ID</th><th>Name</th><th>Designation</th><th>Date Of Birth</th><th>Action</th>");
        for (let i = 0; i < data.length; i++) {
            $('.empTable').append("<tr class='display'><td>" + data[i].id + "</td><td>" + data[i].employeeName + "</td><td>" + data[i].designation + "</td><td>" + data[i].dateOfBirth + "</td><td><img src= 'arrow.png' alt= arrowdown image'  width='25' height='22' border='1px solid black' /></td></tr>");
            $('.empTable').append("<tr class='open' ><td colspan='6'><p> ---> " + data[i].employeeName + " is " + (2021 - Number(data[i].dateOfBirth.substr(4, 8))) + " years old and he has " + (2021 - Number(data[i].dateOfJoining.substr(4, 8))) + " years of experience and earns " + (2021 - Number(data[i].dateOfJoining.substr(4, 8))) * 12000 + "/month</p></td></tr>");
        }
        $('.display').mouseenter(function () {
            $(this).css('background-color', 'darkgrey');
        }).mouseleave(function () {
            $(this).css('background-color', 'white');
        }).css('cursor', 'pointer');

        for (var i = 0; i < data.length; i++) {
            $("img").eq(i).click(function () {
                $(this).parent().parent().next().toggleClass();
            })
        }
    });
   $("#delete_btn").click(function(){
        id=document.getElementById("delete").value;
        $.ajax({
            url:'http://localhost:8080/employee/'+id,
            type:'DELETE',
            success:function(result){
            console.log("deleted");
            }
        });
   });
   $("#update_btn").click(function() {
        id=document.getElementById("update_id").value;
        object={ "id":document.getElementById("update_id").value,
        "employeeName":document.getElementById("employeeName").value,
        "designation":document.getElementById("designation").value,
        "dateOfBirth":document.getElementById("dateOfBirth").value,
        "dateOfJoining":document.getElementById("dateOfJoining").value
        };

        data= JSON.stringify(object);

        $.ajax({
           url:'http://localhost:8080/employee/'+id,
           type:'PUT',
           contentType: 'application/json',
           data: data,
           success:function(data){
                  if(data.success == true){
                       setTimeout(function(){
                               location.reload();
                       }, 10000);
                  }
           }
        });
   });
    $("#post_btn").click(function() {

        object={ "id":document.getElementById("post_id").value,
        "employeeName":document.getElementById("p_employeeName").value,
        "designation":document.getElementById("p_designation").value,
        "dateOfBirth":document.getElementById("p_dateOfBirth").value,
        "dateOfJoining":document.getElementById("p_dateOfJoining").value
        };

         data= JSON.stringify(object);

           $.ajax({
              url:'http://localhost:8080/employee/',
              type:'POST',
              contentType: 'application/json',
              data: data,
              success:function(data){
                         if(data.success == true){
                            setTimeout(function(){
                                 location.reload();
                            }, 10000);
                         }
              }
           });
      });
});


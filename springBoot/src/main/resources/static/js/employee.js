$(document).ready(function(){
    $.get("http://localhost:8086/list", function(data) {
                data = JSON.parse(data);
                $('.table').append("<table class='empTable'></table>");
                $('.empTable').append("<th>ID</th><th>Name</th><th>Date of Birth</th><th>Role</th>").css('background-color', 'powderblue');
                for (let i = 0; i < data.length; i++) {
                    $('.empTable').append("<tr class='display'><td>" + data[i].id + "</td><td>" + data[i].name + "</td><td>" + data[i].birthDate + "</td><td>" + data[i].role + "</td><td><div class='arrow-down'></div></td></tr>");
                    $('.empTable').append("<tr class='description'><td colspan='5'><p>" + data[i].Name + " is '22' years old and he has 3 years of experience and earns 55000/month</p></td></tr>");
                }
        
                for (var i = 0; i < data.length; i++) {
                    $(".arrow-down").eq(i).click(function () {
                        $(this).parent().parent().next().slideToggle("fast");
                    })
                }
    });

    $("#delete_btn").click(function(){
        id=document.getElementById("delete").value;
        $.ajax({
            url:'http://localhost:8086/list/'+id,
            type:'DELETE',
            success:function(result){
            console.log("deleted");
            }
        });
   });
   $("#update_btn").click(function() {
        id=document.getElementById("id_update").value;
        object={ "id":document.getElementById("id_update").value,
        "name":document.getElementById("name_update").value,
        "birthDate":document.getElementById("birthDate_update").value,
        "role":document.getElementById("role_update").value,
        };

        data= JSON.stringify(object);

        $.ajax({
           url:'http://localhost:8086/list/'+id,
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

        object={ "id":document.getElementById("id_post").value,
        "name":document.getElementById("name_post").value,
        "birthDate":document.getElementById("birthDate_post").value,
        "role":document.getElementById("role_post").value
        };

         data= JSON.stringify(object);

           $.ajax({
              url:'http://localhost:8086/list/',
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





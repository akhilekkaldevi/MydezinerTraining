 $(document).ready(function () {

			$.ajax("http://localhost:8080/emp",   // request url
			{            
				success: function (data) {  
				alert($(data).length);
						var len=$(data).length;
						var data1=JSON.stringify(data);
						for(var i=0;i<len;i++)
						{
						$("#employee_table").append("<tr class='sai'><td>"+$(data)[i].id+"</td><td>"+$(data)[i].name+"</td><td>"+$(data)[i].salary+"</td><td>"+$(data)[i].companyname+"</td><td></tr>");
						$("#employee_table").append("<tr class='sai1'><td colspan='4' >"+$(data)[i].name + "is 22 years old and he has 3 years of experience and earns " + $(data)[i].salary+ "/month</td></tr>");
						}
			for(var i=0;i<len;i++)
			{
			$('.sai').eq(i).click(function(){
			$(this).next().toggle();
			});
			}
			
			}
			
			
		});
		$("#delete_btn").click(function(){
        id=document.getElementById("delete").value;
        $.ajax({
            url:'http://localhost:8080/emp1/'+id,
            type:'GET',
            success:function(result){
            console.log("deleted");
            }
        });
   });
   $("#update_btn").click(function() {

        data=JSON.stringify($("#update_form").formToJson());

        id=document.getElementById("update_id").value;
        $.ajax({
           url:'http://localhost:8080/employes/'+id,
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

           data=JSON.stringify($("#post_form").formToJson());

           $.ajax({
              url:'http://localhost:8080/employees/',
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
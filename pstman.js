$(document).ready(function () {

    $.ajax("https://d934d61f-5d0f-43a6-bedd-8aefa4ff292c.mock.pstmn.io/sample",   // request url
    {            
        success: function (data) {  
                var len=$(data).length;
                var data1=JSON.stringify(data);
                for(var i=0;i<len;i++)
                {
                $("#employee_table").append("<tr class='sai'><td>"+$(data)[i].Name+"</td><td>"+$(data)[i].Designation+"</td><td>"+$(data)[i].Salary+"</td><td>"+$(data)[i].companyname+"</td></tr>");
                $("#employee_table").append("<tr class='sai1'><td colspan='4' >"+$(data)[i].Name + "is 22 years old and he has 3 years of experience and earns " + $(data)[i].Salary+ "/month</td></tr>");
                }
    for(var i=0;i<len;i++)
    {
    $('.sai').eq(i).click(function(){
    $(this).next().toggle();
    });
    }
    
    }
    
    
});
});
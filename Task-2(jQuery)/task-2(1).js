$(document).ready(function(){
    $.get("https://064ed185-4fbe-4feb-a4b4-46a56c620855.mock.pstmn.io/Emp", function(data) {
                data = JSON.parse(data);
                $("#main").append("<tr class='empData'><th> Id </th><th> Name </th><th> Designation </th><th> DOB </th><th> Action </th></tr>");
                for(let i = 0; i < data.length; i++){
                    $("#main").append("<tr class='empBioData'><td>" + data[i].Id + "</td><td>" + data[i].Name + "</td><td>" + data[i].Designation + "</td><td>" + data[i].DOB + "</td><td><div class='arrow-down'></div></td></tr>");
                    $("#main").append("<tr class='description'><td colspan='5'><p>" + data[i].Name + " is '22' years old and he has 3 years of experience and earns 55000/month</p></td></tr>");
                }

                $(".description").hide();

                for (let i = 0; i < data.length; i++) {
                    $(".arrow-down").eq(i).click(function () {
                        $(this).parent().parent().next().slideToggle("fast");
                    })
                }
    });
                
});





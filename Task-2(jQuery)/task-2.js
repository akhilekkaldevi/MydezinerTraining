$(document).ready(function(){
                var arr= [];
                for(let i = 0; i <= 3; i++){
                    arr[i] = [];
                }
                arr = [[1234,"Ajay","Software Developer","16/12/1999"],[1235,"Rajesh","Software Engineer","12/16/1999"],[1236,"Manisyam","Software Engineer","01/01/1999"],[1111,"Uday","Software Developer","01/01/1999"]];
                $("#main").append("<tr class='empData'><th> Id </th><th> Name </th><th> Designation </th><th> DOB </th><th> Action </th></tr>");
                for(let j = 0; j < arr.length; j++){
                    $("#main").append("<tr class='empBData'>");
                    for(let k = 0; k < arr.length; k++){
                        $("#main").append("<td>"+arr[j][k]+"</td>");
                    }
                    $("#main").append("<td> <div class='arrow-down'></div> </td>");
                    $("#main").append("</tr>");
                    $("#main").append("<tr class='data'><td colspan='5'><p>" + arr[j][1] + " is '22' years old and he has 3 years of experience and earns 55000/month</p></td></tr>");
                }

                $(".data").hide();

                for (let i = 0; i < arr.length; i++) {
                    $(".arrow-down").eq(i).click(function () {
                        $(this).parent().next().slideToggle("fast");
                    })
                }
            });

$(document).ready(function(){
    /*var arr= [];
    for(let i = 0; i <= 3; i++){
        arr[i] = [];
    }*/
    //arr = [[1234,"Ajay","Software Developer","16/12/1999"],[1235,"Rajesh","Software Engineer","12/16/1999"],[1236,"Manisyam","Software Engineer","01/01/1999"],[1111,"Uday","Software Developer","01/01/1999"]];
    let arr = [{Id : "1234", Name : "Ajay", Designation : "Software Developer", DOB : "07/11/1999"},
           {Id : "1235", Name : "Rajesh", Designation : "Software Engineer", DOB : "16/12/1999"},
           {Id : "1236", Name : "Manisyam", Designation : "Software Engineer", DOB : "01/01/1999"},
           {Id : "1111", Name : "Uday", Designation : "Software Developer", DOB : "01/01/1999"}
          ]
    $("#main").append("<tr class='empData'><th> Id </th><th> Name </th><th> Designation </th><th> DOB </th><th> Action </th></tr>");
    for(let i = 0; i < arr.length; i++){
        $("#main").append("<tr class='empBData'><td>" + arr[i].Id + "</td><td>" + arr[i].Name + "</td><td>" + arr[i].Designation + "</td><td>" + arr[i].DOB + "</td><td><div class='arrow-down'></div></td></tr>");
        $("#main").append("<tr class='dataB'><td colspan='5'><p>" + arr[i].Name + " is '22' years old and he has 3 years of experience and earns 55000/month</p></td></tr>");
    }
    /*for(let j = 0; j < arr.length; j++){
        $("#main").append("<tr class='empBData'>");
        for(let k = 0; k < arr.length; k++){
            $("#main").append("<td>"+arr[j][k]+"</td>");
        }
        $("#main").append("<td> <div class='arrow-down'></div> </td>");
        $("#main").append("</tr>");*/
        
    

    $(".dataB").hide();

    for (let i = 0; i < arr.length; i++) {
        $(".arrow-down").eq(i).click(function () {
            $(this).parent().parent().next().slideToggle("fast");
        })
    }
});

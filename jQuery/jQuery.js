$(document).ready(function () {
    let arr = [
        { ID: "1111", name: "Uday", Designation: "Software Developer", DOB: "01/01/1996", DOJ: "01/01/2018" },
        { ID: "1112", name: "satish", Designation: "Trainee Software Developer", DOB: "01/01/1999", DOJ: "01/01/2020" },
        { ID: "1113", name: "ramesh", Designation: "Senior Software Developer", DOB: "01/01/1994", DOJ: "01/01/2016" },
        { ID: "1114", name: "Mukesh", Designation: "Software Developer", DOB: "01/01/1997", DOJ: "01/01/2018" }
    ]
    $('.empDiv').append("<table class='empTable'></table>");
    $('.empTable').append("<th>ID</th><th>Name</th><th>Designation</th><th>DOB</th><th>Action</th>");
    for (let i = 0; i < arr.length; i++) {
        $('.empTable').append("<tr class='display'><td>" + arr[i].ID + "</td><td>" + arr[i].name + "</td><td>" + arr[i].Designation + "</td><td>" + arr[i].DOB + "</td><td><img src='arrow.png' alt='arrow image'  width='25' height='22' border='1px solid black' /></td></tr>");
        $('.empTable').append("<tr class='open' ><td colspan='6'><p> ---> " + arr[i].name + " is " + (2021 - Number(arr[i].DOB.substr(6, 10))) + " years old and he has " + (2021 - Number(arr[i].DOJ.substr(6, 10))) + " years of experience and earns " + (2021 - Number(arr[i].DOJ.substr(6, 10))) * 12000 + "/month</p></td></tr>");
    }

    $('.display').mouseenter(function () {
        $(this).css('background-color', 'darkgrey');
    }).mouseleave(function () {
        $(this).css('background-color', 'white');
    }).css('cursor', 'pointer');
    
    for (var i = 0; i < arr.length; i++) {
        $("img").eq(i).click(function () {
            $(this).parent().parent().next().toggleClass();
        })
    }

});

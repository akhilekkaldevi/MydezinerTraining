$(document).ready(function () {
    $.get("https://47533fb7-f54c-4c7a-aac6-9a2b127a96a5.mock.pstmn.io/empdata", function (data) {
        console.log(data);
        $('.empDiv').append("<table class='empTable'></table>");
        $('.empTable').append("<th>ID</th><th>Name</th><th>Designation</th><th>DOB</th><th>Action</th>");
        for (let i = 0; i < data.length; i++) {
            $('.empTable').append("<tr class='display'><td>" + data[i].ID + "</td><td>" + data[i].name + "</td><td>" + data[i].Designation + "</td><td>" + data[i].DOB + "</td><td><img src= 'arrow.png' alt= arrowdown image'  width='25' height='22' border='1px solid black' /></td></tr>");
            $('.empTable').append("<tr class='open' ><td colspan='6'><p> ---> " + data[i].name + " is " + (2021 - Number(data[i].DOB.substr(6, 10))) + " years old and he has " + (2021 - Number(data[i].DOJ.substr(6, 10))) + " years of experience and earns " + (2021 - Number(data[i].DOJ.substr(6, 10))) * 12000 + "/month</p></td></tr>");
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

});

function queryAllShuDong() {
    $.ajax({
        url:"/shudong/all",
        dataType:"json",
        data:{
            "id":$("#id").val(),
            "name":$("#name").val(),
            "text":$("#text").val(),
            "date":$("#date").val(),
        },
        success:function (data) {
            $("#api-query-table tbody").html("");
            let list=data.list;
            let total=data.total;
            for (let i = 0; i < list.length; i++) {
                let tr = <tr id="api-${list[i].apiId}"><td>${list[i].id}</td><td>${list[i].name}</td><td>${list[i].text}</td><td>${list[i].date}</td></tr>`;
                $("#api-query-table tbody").append(tr);
            }
        },
        error: function(data){
            window.location="/error";
        }
    });
}

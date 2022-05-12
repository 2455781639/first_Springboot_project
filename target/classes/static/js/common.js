function alertBox(message, callback) {
    if (!message) return false;

    var template_alert_box =
        '<div class="modal" id="alert-box" tabindex="-1" role="dialog">'+
        '<div class="modal-dialog" role="document" style="margin:100px auto;">'+
        '<div class="modal-content">'+
        '<div class="modal-header">'+
        '<h5 class="modal-title">提示</h5>'+
        '<button type="button" class="close" data-dismiss="modal" aria-label="Close">'+
        '<span aria-hidden="true">&times;</span>'+
        '</button>'+
        '</div>'+
        '<div class="modal-body">'+
        '<p id="alert-box-message"></p>'+
        '</div>'+
        '<div class="modal-footer">'+
        '<button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>'+
        '</div>'+
        '</div>'+
        '</div>'+
        '</div>';

    if ($("#alert-box")) $("#alert-box").remove();

    var $box = $(template_alert_box);
    $box.find("#alert-box-message").text(message);
    $box.modal({backdrop:"static", show:true});
    if (callback) $box.on('hidden.bs.modal', callback);
    $("body").append($box);

    return true;
}
function checkEmail(){
    const strEmail = document.add.email.value;
    const strRegex = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/;
    if (strEmail.length===0)
    {
        alertBox("电子邮件不能为空!");
        return false;
    }
    if(!strRegex.test(strEmail)){
        // alert("邮箱输入有误!");
        // alert("<div class='alert alert-danger'>错误！邮箱输入有误。</div>");
        alertBox("邮箱输入有误!")
        return false;
    }
    return true;
}
function checkDate(){
    const date__ = document.add.birth.value;
    const re =/^(\d{4})-(\d{2})-(\d{2})$/;
    if(!re.test(date__)){
        //判断日期格式为YYYY-MM-DD标准
        alertBox("日期校验格式有误，例如2022-10-10");
        return false;
    }
    return true;
}

//检验姓名  
function checkName () {
  const name = document.add.name.value;
  const re = /^[\u4e00-\u9fa5]{2,4}$/;
  if (!re.test(name)) {
    alertBox("姓名格式有误，例如张三");
    return false;
  }
  return true;
}


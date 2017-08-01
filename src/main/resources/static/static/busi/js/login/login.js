var Login = Login || {};

Login.geetestObj = null;

/**
 * 加载验证
 * @param type
 */
Login.loadGeetese = function () {
    var handler = function (captchaObj) {
        Login.geetestObj = captchaObj;
        $("#login_button").click(function (e) {
            var result = captchaObj.getValidate();
            if (!result) {
                $("#errorMsg").show();
                setTimeout(function () {
                    $("#errorMsg").hide();
                }, 2000);
                e.preventDefault();
            }
        });
        // 将验证码加到id为captcha的元素里，同时会有三个input的值用于表单提交
        captchaObj.appendTo("#captcha2");
        captchaObj.onReady(function () {
            $("#wait2").hide();
        });
        // 更多接口参考：http://www.geetest.com/install/sections/idx-client-sdk.html
    }

    $.ajax({
        url: Global.ctx + "/public/getVerify?t=" + (new Date()).getTime(), // 加随机数防止缓存
        type: "post",
        dataType: "json",
        success: function (data) {
            // 调用 initGeetest 初始化参数
            // 参数1：配置参数
            // 参数2：回调，回调的第一个参数验证码对象，之后可以使用它调用相应的接口
            initGeetest({
                gt: data.gt,
                challenge: data.challenge,
                new_captcha: data.new_captcha, // 用于宕机时表示是新验证码的宕机
                offline: !data.success, // 表示用户后台检测极验服务器是否宕机，一般不需要关注
                product: "popup", // 产品形式，包括：float，popup
                width: "100%"
                // 更多配置参数请参见：http://www.geetest.com/install/sections/idx-client-sdk.html#config
            }, handler);
        }
    });
}

/**
 * 登录 action
 */
Login.toLogin = function () {
    var result = $("#login_from").valid();
    if (!result) {
       return;
    }
    Global.ajax({
        url: Global.ctx + '/public/validate',
        type: 'post',
        data: Global.KV2Obj($("#login_from").serialize()),
        success: function (data) {
            if (data != 0) {
                alert(data);
                if (Login.geetestObj) {
                    Login.geetestObj.reset();
                }
                return;
            }
            alert("登录成功");
        },
        error : function () {
            if (Login.geetestObj) {
                Login.geetestObj.reset();
            }
        }
    });
}

/**
 * 登录表单绑定jquery validate
 */
Login.initSigninFormValidate = function () {
    $("#login_from").validate({
        rules : {
            username : {required : true},
            password : {required : true, rangelength : [6, 18]}
        },
        messages : {
            username : {required : "账号不能为空"},
            password : {required : "密码不能为空", rangelength : "长度为6-18位"}
        },
        focusCleanup : true,
        focusInvalid : false,
        errorPlacement : function(error, element) {
            if ($(error).html() == "") {
                return;
            }
            $(element).parent().find(".error-tips").html(error.html());
        },
        success : function(error, element) {
            $(element).parent().find(".error-tips").html("");
        }
    });
}


$(function() {
    Login.loadGeetese();

    Login.initSigninFormValidate();

    $("#login_button").click(function () {
        Login.toLogin();
    });
    
    $("#sign_button").click(function() {
    		$("#login_div").hide();
    		$("#sign_div").show();
    		$("#tit").html("注册");
    });
    
    $("#sign_call").click(function() {
    		$("#login_div").show();
    		$("#sign_div").hide();
    		$("#tit").html("登录");
    });
});

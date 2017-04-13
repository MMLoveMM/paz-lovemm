
jQuery(document).ready(function() {

    $('.page-container form').submit(function(){
        var username = $(this).find('#username').val();
        var password = $(this).find('#password').val();
        if(username == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '27px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.username').focus();
            });
            return false;
        }
        if(password == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '96px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.password').focus();
            });
            return false;
        }
    });

    $('.page-container form .username, .page-container form .password').keyup(function(){
        $(this).parent().find('.error').fadeOut('fast');
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

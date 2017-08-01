/**
 * Created by maner on 2017/4/21.
 */
var Global = Global || {};

Global.Util = Global.Util || {};

/**
 * querystring 转 obj
 */
Global.KV2Obj = function (serializeStr) {
    var jsonArr = {};
    if(!serializeStr){
        return null;
    }
    var kv=serializeStr.split("&");
    for(var i = 0; i < kv.length; i++){
        var arr = kv[i].split("=");
        if ($.trim(arr[1]) == ""){ // 过滤空元素
            continue;
        }
        jsonArr[decodeURIComponent(arr[0])] = decodeURIComponent(arr[1]);
    };
    var rtn = null;
    // 判断是否有值
    for (var key in jsonArr) {
        rtn = jsonArr;
        break;
    }
    return rtn;
}

/**
 * 全局ajax
 */
Global.ajax = function (options) {
    $.ajax({
        url : options.url,
        type : options.type || "post",
        dataType : options.dataType || "text",
        data : options.data || {},
        success : function(data) {
            if (!options.success) {
                return;
            }
            options.success(data);
        },
        error : function(arg0, arg1, arg2) {
            if (!options.error) {
                bootbox.alert("[" + arg1 + "][" + arg0.status + "][" + arg2
                    + "]");
                return;
            }
            options.error(arg0, arg1, arg2);
        }
    });
}
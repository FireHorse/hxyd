/**
 *通用JS 同步ajax调用 返回json Object
 * 
 * @param {}
 *            urlStr
 * @param {}
 *            paramsStr 为字符串键值对形式“key=value&key2=value2”
 * @ return {} 返回json Object
 */
function ajaxSyncCall(urlStr, paramsStr) {
	var obj=null;
	if (window.ActiveXObject) {
		obj = new ActiveXObject('Microsoft.XMLHTTP');
	} else if (window.XMLHttpRequest) {
		obj = new XMLHttpRequest();
	}
	obj.open('POST', urlStr, false);
	obj.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	obj.send(paramsStr);
	var result =obj.responseText;
	return result;
}
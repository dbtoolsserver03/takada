/**
 * 
 */

function loginFun() {
	//ctrl + space 代码联想
	
	// document 当前的HTML文件
	// getElementBy... 从document里取标签对象
	var userTag = document.getElementById("id_user");
	var pwdTag = document.getElementById("id_pwd");
	
	console.log(userTag.value);
	console.log(pwdTag.value);
					
	if(userTag.value =="z3" && pwdTag.value=="123") {
		// 跳转到指定的 URL 地址
		location.href = "https://www.example.com";
	} else {
		var msgTag = document.getElementById("id_msg");
		msgTag.innerText="user password error";
		
		
		userTag.style.backgroundColor="pink";
		pwdTag.style.backgroundColor="pink";
	}
}
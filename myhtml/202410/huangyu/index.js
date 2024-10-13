/**
 * 
 */

	
	function caculate(event,operation){
		//阻止表单默认提交
		event.preventDefault();
		
//ID 为 input1 的输入框中获取用户输入的值，并将其转换为浮点数，存储在变量 num1 中。
//document.getElementById(““).value     访问id的值
		var num1 = parseFloat(document.getElementById("input1").value);
		var num2 = parseFloat(document.getElementById("input2").value);

		var result = 0;
		var msg ="";
		
//检查变量 operation 的值是否等于字符串 'add'。
//如果条件为真，那么后面的大括号 {} 中的代码就会被执行
        if (operation === 'add'){
			if( !isNaN(num1)&& !isNaN(num2) ){
				result = num1 + num2;
				msg = "正常系";
			}else{
				msg = "异常系 请选中运算符号<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp请入力数字"; 
			}			
		}else if(operation === 'subtract'){
			if(!isNaN(num1)&&!isNaN(num2)){
				result=num2-num1;
				msg="正常系";
			}else{
				msg="异常系 请选中运算符号<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp请入力数字";
			}
		}
		//JS的\n没正确显示，所以用html的<br>,&nbsp空格
		document.getElementById("msgdiv").innerHTML=msg; //在js中实现换行
		document.getElementById("result").value = result;
		document.getElementById("msg").value = msg;
     }
	

/**
 * 
 */


function funCal(){
	
	var tags = document.getElementsByName("cal");
	
	var ch = "";
	var isChecked = false;
	
	for(var i = 0; i<tags.length;i++) {
		var tag = tags[i];
		if(tag.checked){
			ch = tag.value;
			isChecked = true;
			break;
		}
	}
	
	var tagMsg = document.getElementById("id_msg");
	if(!isChecked) {
		tagMsg.innerText="計算記号を選択してください";
		return;
	} else {
		tagMsg.innerText="";
	}
	
	
	var num1 = parseInt( document.getElementById("id_num1").value);
	var num2 = parseInt(document.getElementById("id_num2").value);
	
	var sum = 0;
	if (ch == "add") {
		sum = num1 + num2;
	} else if (ch == "minus") {
		sum = num1 - num2;
	} else {

	}
	
	var tagDiv = document.getElementById("id_div");
	tagDiv.innerText=sum;
}
function funClear() {
	var tags = document.getElementsByName("cal");
	for(var i = 0; i<tags.length;i++) {
		var tag = tags[i];
		tag.checked = false;
	}
	
	var tagDiv = document.getElementById("id_div");
	tagDiv.innerText = "";
	var tagMsg = document.getElementById("id_msg");
	tagMsg.innerText = "";
	
	
	document.getElementById("id_num1").value="";
	document.getElementById("id_num2").value="";
	
}
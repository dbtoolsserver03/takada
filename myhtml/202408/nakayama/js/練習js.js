/**
 * 
 */
function funCalc(){
	var ch="";
	var ret=0;
	
	var num1=parseInt(document.getElementById("num1").value);
	var num2=parseInt(document.getElementById("num2").value);
	var tags=document.getElementsByName("kigo");
	
	var isChecked=false;
	
	for(var i = 0; i<tags.length;i++){
		var tag=tags[i];
		if(tag.checked){
			isChecked=true;
			ch=tag.value;
			if(ch=="add"){
				ret = num1+num2;
			}else if(ch=="minus"){
				ret=num1-num2;
			}
			break;
		}
	}
	
	if(!isChecked){
		document.getElementById("id_msg").innerText="計算記号を選択してください！";
		return;
	}
	
	document.getElementById("id_ret").innerText = ret;
	}
     function funClear() {
		document.getElementById("num1").value = "";
		document.getElementById("num2").value = "";
		document.getElementById("id_ret").innerText = "";
		
		document.getElementById("id_msg").innerText ="";
		
		var tags = document.getElementsByName("kigo");

		for(var i = 0; i< tags.length; i++) {
			var tag = tags[i];
			tag.checked = false;
		}
	}
		
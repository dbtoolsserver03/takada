/**
 * 
 */

function funCalc(index,sign){
	
	var tagInit = document.getElementById("id_init_" + index);
	var tagJika = document.getElementById("id_jika_" + index);
	var afterJika = 0;
	if (sign == "add") {
		afterJika = parseInt(tagJika.innerText) + 100;
	} else {
		afterJika = parseInt(tagJika.innerText) - 100;
	}
	
	tagJika.innerText = afterJika;
	
	if(afterJika>parseInt(tagInit.innerText)){
		tagJika.className="td_pin";
	}  else if(afterJika<parseInt(tagInit.innerText)){
		tagJika.className="td_green";
	} else{
		tagJika.className="";
	}
}

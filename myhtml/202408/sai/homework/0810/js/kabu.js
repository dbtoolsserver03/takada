
function funCal (rowNum,sign) {
	
	var jika = document.getElementById("id_jika_" + rowNum);
	var hajimene = document.getElementById("id_hajimene_" + rowNum); 
	
	if(sign == 'add') {
		jika.innerText = parseInt( jika.innerText) + 100; 
	} else {
		jika.innerText = parseInt( jika.innerText) - 100; 
	}
	
	
	if( parseInt(jika.innerText) < parseInt(hajimene.innerText)) {
		jika.className="downTd";
	} else if( parseInt(jika.innerText) > parseInt(hajimene.innerText)){
		jika.className="upTd";
	} else {
	jika.className="";
	}
}

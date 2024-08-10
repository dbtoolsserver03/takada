/**
 * 
 */

// ブラウザはHTMLファイルを一行ずつ解析するため
// 下記のソースには、タグまだ生成していない。
// 存在しないタグを取得すると、nullで返却しする。
// nullの属性はないため、エラー発生しまう。
// var tag = document.getElementById("id_num");
// alert(tag.value);

alert("step 1 : 画面表示する前");

function funSum(btn) {

	// document：HTMLファイル
	// getElementById：取得条件 id = id_num
	// tag:変数の定義（タグのオブジェクト　※inputタグ）

	var tag = document.getElementById("id_num");

	var sum = 0;

	// 変数iの生命期間 javaの場合、for内で使える、for外にはエラー発生　
	// 変数iの生命期間 jsの場合、定義した後、どこでも利用可能、危険です。

	for (var i = 0; i <= tag.value; i++) {
		sum = sum + i;
	}

	// 下記の書き方はだめ（生命期間が超えるため）
	//alert(i);
	console.log(i);

	// js    は弱言語
	// java  は強言語

	tag = 111;
	//alert(tag);
	//alert(sum);
	console.log(tag);
	console.log(sum);

	if (sum < 1000) {
		btn.style.backgroundColor = "red";
		btn.style.color = "white";
	} else {
		btn.style.backgroundColor = "green";
		btn.style.color = "black";
	}

}

function init() {
	alert("step 2 : 画面表示した直後");
	var tag = document.getElementById("id_num");
	alert(tag.value);
}

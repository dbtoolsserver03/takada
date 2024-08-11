/**
 * 
 */
function calculate() {
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    var operation = document.getElementById("operation").value;
    var result = document.getElementById("result");

    if (!operation || isNaN(num1) || isNaN(num2)) {
        result.textContent = "エラー: 計算記号を選択し、両方の数字を入力してください。";
        return;
    }

    result.textContent = "結果: " + (operation === "add" ? num1 + num2 : num1 - num2);
}

/**
 * 
 */alert事件看是否绑定
 
 
 ctrl加J是快捷撤销
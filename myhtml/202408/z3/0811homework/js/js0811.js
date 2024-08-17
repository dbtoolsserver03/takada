/**
 * 
 */
function changePrice(elementId, change) {
    var priceElement = document.getElementById(elementId);
    var currentPrice = parseInt(priceElement.textContent);
    var newPrice = currentPrice + change;
    
    priceElement.textContent = newPrice;
    
    // 更新颜色
    if (newPrice > 3000) {
        priceElement.className = 'yellow';
    } else if (newPrice < 1000) {
        priceElement.className = 'red';
    } else {
        priceElement.className = 'green';
    }
}
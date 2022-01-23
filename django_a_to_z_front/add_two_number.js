function doSometing(){
    let a = document.getElementById('input A').value;
    let b = document.getElementById('input B').value;
    document.getElementById('value a').innerHTML = a;
    document.getElementById('value b').innerHTML = b;
    document.getElementById('value c').innerHTML = Number(a) + Number(b);
}
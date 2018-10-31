

var textArea = document.querySelector('.textEx');
document.querySelector('#btn-show').addEventListener('click',function(){

    textArea.classList.toggle("active");
    if (textArea.style.display === "block") {
        textArea.style.display = "none";
    } else {
        textArea.style.display = "block";
    }
    textArea.readOnly = true;

} );




document.querySelector('#btn-edit').addEventListener('click',function(){

    textArea.classList.toggle("active");
    if (textArea.style.display === "block") {
        textArea.style.display = "none";
    } else {
        textArea.style.display = "block";
    }
    textArea.readOnly = false;

    
});



document.querySelector('#btn-close').addEventListener('click',function(){

    document.querySelector('.textEx').classList.toggle("active");
    var content = this.nextElementSibling;
    if (document.querySelector('.textEx').style.display === "block") {
      document.querySelector('.textEx').style.display = "none";
    } else {
        document.querySelector('.textEx').style.display = "block";
    }
    document.querySelector('.textEx').readOnly = true;

} );


document.querySelector('#btn-edit').addEventListener('click',function(){

    document.querySelector('.textEx').classList.toggle("active");
    var content = this.nextElementSibling;
    if (document.querySelector('.textEx').style.display === "block") {
      document.querySelector('.textEx').style.display = "none";
    } else {
        document.querySelector('.textEx').style.display = "block";
    }
    document.querySelector('.textEx').readOnly = false;

    
} );

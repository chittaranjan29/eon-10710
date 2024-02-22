function test()
{
    var data=document.getElementById("a").value;
    alert(data);
}

function getData(event)
{
    console.log(event.target.value);
  document.getElementById("para").innerText=event.target.value;
}


function captureData(event)
{
    console.log(event.target.value);
   document.getElementById("para1").innerText=event.target.value;
}

function imageDisplay()
{
  var image="<img src='sample.jpg'/>";
  document.getElementById("image").innerHTML=image;
}

function imageDisappear()
{
    document.getElementById("image").innerHTML="";
}
//dom  - document object model
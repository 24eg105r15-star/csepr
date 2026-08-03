
let a="🍎";
console.log("\n\t data : "+a);

let api="http://40.0.45.56:4000/api";

async function getData(){
    let req=await fetch(api);
    let res=await req.json();
    console.log("\n\t data : "+res);
    console.log("\n\t data : "+JSON.stringify(res,2));
    let r=document.getElementById("output");
    r.innerHTML=JSON.stringify(res,2);

}

// getData();
async function postData() {
    let x = document.getElementById("x").value;
    let y = document.getElementById("y").value;
    let z = document.getElementById("z").value;
  let obj = {
    name: x,
    rollno: y,
    ip: z,
  };
  console.log("\n\t Data : "+JSON.stringify(obj,2))
  let api = "http://40.0.45.56:4000/api/v1";
  let req = await fetch(api, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(obj),
  });
  let res = await req.json();
  console.log("\n\t response : " + JSON.stringify(res));
}
// postData();

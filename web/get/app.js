const API = "http://40.0.45.56:4000/api/v1";

async function getStudents() {
    try {
        const response = await fetch(API);
        const data = await response.json();

        const tableBody = document.getElementById("tableBody");
        tableBody.innerHTML = "";

        data.list.forEach(student => {

            tableBody.innerHTML += `
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name ?? "-"}</td>
                    <td>${student.rollno ?? "-"}</td>
                    <td>${student.ip ?? "-"}</td>
                </tr>
            `;

        });

    } catch (error) {
        console.log(error);
    }
}


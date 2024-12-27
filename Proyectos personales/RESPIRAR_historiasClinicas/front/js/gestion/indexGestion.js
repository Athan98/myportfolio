

document.addEventListener("DOMContentLoaded", () => {
    const cuerpoTabla = document.querySelector("#bodyTablaPacientes");
    const buscadorEntrada = document.querySelector("#buscadorEntrada");

    //LISTAR PACIENTES
    const listar = async () => {
        try {
            const response = await axios.get(`https://ENDPOINT/`);
            const pacientes = response.data;

            cuerpoTabla.innerHTML = "";

            pacientes.forEach(p => {
                const fila = document.createElement("tr");

                const celdaUsuarioDNIPaciente = document.createElement("td");
                const celdaNombreApellidoPaciente = document.createElement("td");
                const celdaAcciones = document.createElement("td");

                celdaUsuarioDNIPaciente.textContent = p.usuarioDNIPaciente;
                celdaNombreApellidoPaciente.textContent = p.nombreApellidoPaciente;

                const btnMas = document.createElement("button");
                btnMas.innerHTML = '<i class="fa-solid fa-magnifying-glass"></i>VER MAS';
                btnMas.classList.add("btnMas");
                btnMas.addEventListener("click", () => {

                    window.location.href = `/front/pages/gestion/verMasPaciente.html?id=${p.id}`

                });


                celdaAcciones.appendChild(btnMas);
                fila.appendChild(celdaUsuarioDNIPaciente);
                fila.appendChild(celdaNombreApellidoPaciente);
                fila.appendChild(celdaAcciones);

                fila.classList.add("fila");
                cuerpoTabla.appendChild(fila);

            });

        } catch (error) {
            console.error("Error al listar los registros en la tabla", error);
        }
    };

    const filtrarPacientes = () => {
        const filter = buscadorEntrada.value.toLowerCase(); // Obtiene el valor del campo de búsqueda en minúsculas
        const filas = cuerpoTabla.getElementsByTagName('tr'); // Obtiene todas las filas de la tabla

        Array.from(filas).forEach((fila) => { // Itera sobre cada fila
            const celdaDNI = fila.getElementsByTagName('td')[0]; // Selecciona la celda del DNI

            if (celdaDNI) {
                const dni = celdaDNI.textContent || celdaDNI.innerText; // Obtiene el texto del DNI

                // Comprueba si el valor de búsqueda está presente en el apellido, nombre o DNI
                if (
                    dni.toLowerCase().indexOf(filter) > -1
                ) {
                    fila.style.display = ""; // Muestra la fila si coincide
                } else {
                    fila.style.display = "none"; // Oculta la fila si no coincide
                }
            }
        });
    }

    buscadorEntrada.addEventListener("input", filtrarPacientes); // Llama a la función filtrarPacientes cada vez que se escribe en el campo de búsqueda

    listar();
});
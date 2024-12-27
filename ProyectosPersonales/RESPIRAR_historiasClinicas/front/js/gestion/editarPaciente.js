document.addEventListener("DOMContentLoaded", () => {

    const parametrosURL = new URLSearchParams(window.location.search);
    const idPaciente = parametrosURL.get("id");
    const formulario = document.querySelector("#form-editarPaciente");


    // Función para traer el estudio, pacientes, y médicos
    const traerPaciente = async (id) => {
        try {
            const res = await axios.get(`https://ENDPOINT/${id}`);
            const paciente = res.data;

            document.querySelector("#usuarioDNIPaciente").value = paciente.usuarioDNIPaciente;
            document.querySelector("#nombreApellidoPaciente").value = paciente.nombreApellidoPaciente;

        } catch (error) {
            console.log("-Error al traer el registro-", error)
        }
    };

    // Nueva función de inicialización
    const init = async () => {
        if (idPaciente) {
            await traerPaciente(idPaciente);
        }
    };

    // Inicia el proceso cuando el DOM esté listo
    init();


    formulario.addEventListener("submit", async (p) => {
        p.preventDefault();

        const pacienteActualizado = {
            usuarioDNIPaciente: document.querySelector("#usuarioDNIPaciente").value,
            nombreApellidoPaciente: document.querySelector("#nombreApellidoPaciente").value,
        }

        try {
            await axios.put(`https://ENDPOINT/${idPaciente}`, pacienteActualizado);
            alert("Paciente actualizado correctamente");

            //Redirigimos al index.html una vez se actualiza la pelicula
            window.location.href = `/front/pages/gestion/verMasPaciente.html?id=${idPaciente}`;
        } catch (error) {
            console.error("Error al actualizar el paciente", error);
        }
    });

});
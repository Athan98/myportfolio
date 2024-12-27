document.addEventListener("DOMContentLoaded", () => {

    const formulario = document.querySelector("#form-nuevoPaciente");

    formulario.addEventListener("submit", async (p) => {
        p.preventDefault();

        const pacienteNuevo = {
            nombreApellidoPaciente: document.querySelector("#nombreApellidoPaciente").value,
            usuarioDNIPaciente: document.querySelector("#usuarioDNIPaciente").value,
            passwordPaciente: document.querySelector("#passwordPaciente").value,
        }

        try {
            await axios.post(`https://ENDPOINT/`, pacienteNuevo);
            alert("Paciente creado correctamente");

            //Redirigimos al index.html una vez se actualiza la pelicula
            window.location.href = `/front/indexGestion.html`;
        } catch (error) {
            console.error("Error al crear el paciente", error);
        }
    });

});
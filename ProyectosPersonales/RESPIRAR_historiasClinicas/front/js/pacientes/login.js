document.addEventListener("DOMContentLoaded", () => {

    const formulario = document.querySelector("#formLogin");

    formulario.addEventListener("submit", async (p) => {
        p.preventDefault();

        const pacienteBuscar = {
            usuarioDNIPaciente: document.querySelector("#nombreUsuario").value,
            passwordPaciente: document.querySelector("#passwordUsuario").value,
        }

        try {
            const response = await axios.post("https://ENDPOINT/", pacienteBuscar);
            const paciente = response.data;

            localStorage.setItem("idPaciente", paciente.paciente.id);
            
            window.location.href = "/pages/pacientes/verPaciente.html";
            //window.location.href = `/pages/pacientes/verPaciente.html?id=${paciente.paciente.id}`;

        } catch (error) {
            alert("Usuario o contraseña incorrectos. Vuelva a intentarlo")
        }
    });

    const inputPass=document.querySelector("#passwordUsuario");
    const eyePass=document.querySelector("#eye");

    eyePass.addEventListener("click",()=>{
        if(inputPass.type==="password"){
            inputPass.type="text";
            eyePass.classList.remove("fa-eye");
            eyePass.classList.add("fa-eye-slash");
        }else{
            inputPass.type="password"
            eyePass.classList.remove("fa-eye-slash");
            eyePass.classList.add("fa-eye");
        }
    })
});


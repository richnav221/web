window.onload = function() { 
    console.log("prueba")
    let fichas = document.querySelectorAll(".ficha")
    console.log(fichas.length)
    let boton = document.createElement("button")
    boton.textContent ="Mostrar sólo héroes"
    document.body.appendChild(boton)
    boton.addEventListener("mousedown", function(){
        for (let ficha of fichas){
            if (ficha.getAttribute("data-tipo")=="villano"){
                ficha.style.display = "none"
            }
            else {
                ficha.classList.add("resaltado")
            }
        }
    })
    boton.addEventListener("mouseup", function(){
        for (let ficha of fichas){
            if (ficha.getAttribute("data-tipo")=="villano"){
                ficha.style.display = ""
            }
            else {
                ficha.classList.remove("resaltado")
            }
        }
    })

    for(let ficha of fichas){
        ficha.addEventListener("mouseover", function() {
            this.style.backgroundColor="#817f7d85"
        })
        ficha.addEventListener("mouseout", function() {
            this.style.backgroundColor="#5b5a5985"
        })
        let but= document.createElement("button")
        but.textContent=" ⭐Favorito"
        ficha.appendChild(but)
        but.addEventListener("click", function(){
            guardarFavorito(ficha.querySelector(".nombre")).then(function(mensaje) { console.log(mensaje); }).catch(function(error) { console.log(error); })
        })
    }
    let imagenes= document.querySelectorAll(".ficha img")
    for(let imagen of imagenes){
        imagen.classList.add("borde-redondeado")
    }
    let frase= document.createElement("button")
    frase.textContent="frase del dia"
    document.body.appendChild(frase)
    frase.addEventListener("click", function(){
        cargarFraseDelDia(function(frase){
            let parrafo = document.createElement("p")
            parrafo.textContent = frase
            document.body.appendChild(parrafo)
        })
    })
}
function cargarFraseDelDia(callback){
    fetch("https://catfact.ninja/fact").then(function(respuesta) {
            return respuesta.json()
        }).then(function(datos) {
            console.log(datos)
            callback(datos.fact)
        })
}
function guardarFavorito(nombre) {
    return new Promise(function(resolve, reject){
        setTimeout(function(){
            if(nombre)  {
                resolve(nombre+"guardado como favorito")
            }
            else{
                reject("no se pudo guardar: falta el nombre")
            }
        }, 1000)
    })
}

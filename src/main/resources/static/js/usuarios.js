// Call the dataTables jQuery plugin
$(document).ready(function() {

  alert("Hola Mundo")

  cargarUsuarios()

  $('#usuarios').DataTable();
});

function cargarUsuarios(){
  (async () => {
    const request = await fetch('api/usuarios', {   //fetch() conecta java con js
      method: 'GET',
      headers: {
        'Acept': 'application/json',
        'Content-Type': 'application/json'
      },
      // body: JSON.stringify({a: 1, b: 'Textual content'})
    });
    const usuarios = await request.json();

    let listadoHTML= ' ';

    for(let usuario of usuarios){

      let botonEliminar = '<a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

      let usuarioHtml = '<tr> <td>' + usuario.id + '</td> <td>' + usuario.nombre + ' ' + usuario.apellido + '</td> <td>' + usuario.email + '</td> <td>' + usuario.telefono + '</td> <td>' + botonEliminar + '</td> </tr>';

      listadoHTML += usuarioHtml;
    }

    document.querySelector('#usuarios tbody').outerHTML = listadoHTML;
  })();
}
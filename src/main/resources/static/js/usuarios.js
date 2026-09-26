// Call the dataTables jQuery plugin
$(document).ready(function() {

  alert("Hola Mundo")

  cargarUsuarios()

  $('#usuarios').DataTable();
});

function cargarUsuarios(){
  (async () => {
    const request = await fetch('https://httpbin.org/post', {
      method: 'GET',
      headers: {
        'Acept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({a: 1, b: 'Textual content'})
    });
    const usuarios = await request.json();

    console.log(content);
  })();
}
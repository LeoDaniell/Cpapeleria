$(document).ready(function() {
	
	$('#registrarButton').click(function(event) {
	
		var username = $('#username').val();
		var contrasena = $('#contrasena').val();
		var nombre = $('#nombre').val();
		var correo = $('#correo').val();
		var idUsuario = $('#idUsuario').val();
		var idTipoUsuario = $('#idTipoUsuario').val();
		
		var contenido = {"username":username, "contrasena" : contrasena, "nombre" :nombre, "correo" : correo, "idUsuario" :idUsuario, "idTipoUsuario":idTipoUsuario};
		console.log(contenido);
		$.ajax({
			url: 'http://localhost:8080/papeleriaelcompas/regUs',
			type: "POST",
			contentType : "application/json",
			dataType : 'json',
			data: JSON.stringify(contenido),
			success: function(data) {
				var exito = 'success';
				if (exito.localeCompare(data['msg']) == 0){
					
					$('#registrarModal').modal('hide');
					window.location.href = "http://localhost:8080/papeleriaelcompas/cliente/inicio"
				}
				else{
					alert('Datos Incorrectos');
				}
				console.log(exito + ' ' + data['msg']);
			},
			error: function(error){
				console.log( error)
			},
			done:function(e) {
				console.log("DONE");
			}
		});
		
		//$('#registrarModal').modal('hide');
		event.preventDefault();
	});
	
})
		
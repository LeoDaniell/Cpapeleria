$(document).ready(function() {
	
	$('#loginButton').click(function(event) {
	
		var username = $('#username').val();
		var contrasena = $('#contrasena').val();
		
		var datos = {"username":username, "contrasena" : contrasena};
		console.log(datos);
		$.ajax({
			url: 'http://localhost:8080/papeleriaelcompas/loginUs',
			type: "POST",
			contentType : "application/json",
			dataType : 'json',
			data: JSON.stringify(datos),
			success: function(data) {
				var exito = 'success';
				if (exito.localeCompare(data['msg']) == 0){
					
					$('#ingresarModal').modal('hide');
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
		
		//$('#ingresarModal').modal('hide');
		event.preventDefault();
	});
	
})
		
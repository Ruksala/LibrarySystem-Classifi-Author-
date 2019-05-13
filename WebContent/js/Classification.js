$(document).ready(function(){
	
	$(function() {
		$("#classificationform").submit(function(event) {
			event.preventDefault();
			console.log($("#classificationform").serialize());
			$.ajax({
				url : "ClassificationServlet",
				type : 'post',
				data : $("#classificationform").serialize(),
				success : function(data) {
					alert(data)
				}
			})
		})

	})
		
}
)
	
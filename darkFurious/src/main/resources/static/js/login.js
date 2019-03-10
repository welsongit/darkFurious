$(document).ready(function(){
  $("#login").click(function(){
	  $.ajax({
		  url: "checkAccount",
		  cache : false,
		  async: false,
		  type: "POST",
		  data:{
			  "username":$("#username").val(),
			  "password":$("#password").val()
		  },
		  success: function(data){
			  alert(data);
		  }
	  })
  });
});
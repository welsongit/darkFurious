$(document).ready(function(){
  $("#login").click(function(){
	  $.ajax({
		  url: "login/checkAccount",
		  data:{
			  "username":$("#username").val(),
			  "password":$("#password").val()
		  },
		  success:function(data){
			  alert(data);
		  }
	  })
  });
});
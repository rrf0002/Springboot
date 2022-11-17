function eliminar(id){
    swal({
  title: "Are you sure?",
  text: "Once deleted, you will not be able to recover this file!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((willDelete) => {
  if (willDelete) {
      $.ajax({
          url:"/delete/"+id,
          success:function(res){
              console.log(res);
          }
      });
    swal("Poof! Your file has been deleted!", {
      icon: "success",
      
    }).then((willDelete) => {
       if (willDelete) {
           location.href="/listar";
       } 
        
        
    });
  } else {
    swal("Your file is safe!");
  }
});
}
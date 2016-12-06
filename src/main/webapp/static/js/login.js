var credentials = {};
$('.login').submit(function(e){
  console.log("login clicked");
  console.log(e);
    var $inputs = $('.login :input');
    var credentials = {};
    $inputs.each(function() {
        credentials[this.name] = $(this).val();
    });
    console.log(credentials);
  return false;
});

var data = [{"id":1,"heading":"heading 1","text":"text 1","date":1479884909785},{"id":2,"heading":"heading 2","text":"text 2","date":1479884909785},{"id":3,"heading":"heading 3","text":"text 1","date":1479884909785}];
var prototype = $('.event');
var container = $('.container');

function update() {
  $.ajax(
    {
      url: 'http://localhost:8080/events',
      dataType: 'json',
      type: 'get',

      success: function(response){
          data = response;
          sortByDate(data);
          render();
      },
      error: function( jqXhr, textStatus, errorThrown ){
          console.log( errorThrown );
      }
  });
}

function sortByDate(array){
array.sort(function(a, b) {
    a = new Date(a.date);
    b = new Date(b.date);
    return a>b ? -1 : a<b ? 1 : 0;
});
}


function render(){
$.each(data, function(i, d) {
    var p = prototype.clone();
    p.removeClass('hidden');
    p.find('h1').text(d.heading);
    p.find('.text').text(d.text);
    p.find('.title_img').attr('src',d.imagePath);
    p.find('.date').text(d.date);
    p.find('.date').text(new Date(d.date *1000));
    container.append(p);
});
}


$( document ).ready(function(){
console.log("ready");
update();
});

// Show the sidebar
function showSidebar(){
  var $icoMenu = document.querySelector('.ico-menu');
  var $hideMenuArrow = document.querySelector('.hide-menu');
  var $html = document.querySelector('html');

  $icoMenu.addEventListener('click', function(){
    $html.classList.toggle('with-sidebar');
  });

  $hideMenuArrow.addEventListener('click', function(){
    $html.classList.toggle('with-sidebar');
  });
}

// Start the functions
function init(){
  showSidebar();
}

init();
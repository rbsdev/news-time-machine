
/**
 * Monta os elementos HTML da Maquina do tempo
 */
var TimeMachinePage = function (elem) {
	return {
		init: function () {
			this.elements = elem;
			this.bindEvents();
		},

		bindEvents: function () {
			
			this.elements.find('#s').bind('keypress', function (ev) {
				if (ev && ev.keyCode == 13) { 
					doSearch();
					return false;
				}
			});
			
			this.elements.find('#search-submit').bind('click', function () {
				doSearch();
			});
		},
		/**
		 * Função que efetua busca de dados da Time Machine
		 * Faz acesso à serviços da API e monta conteúdo HTML 
		 * que será renderizado em cliente
		 */
		doSearch: function () { 
		
		
			//alert('src');
			
		}
	};
};
 
/**
 * Efetua a busca dos dados de conteúdos
 */
function doSearchFct() {
	showContent(1,"news","noticias","Not&iacute;cia");
	showContent(2,"video","videos","V&iacute;deos");
	showContent(3,"photo","fotos","Fotos");
	showContent(4,"pdf","impressa","M&iacute;dia Impressa");
	showContent(5,"graphic","infograficos","Gr&aacute;ficos");
}


function clearContent() {
	
	$("#contentframe").attr("src","/news-time-machine/loading.html");
}

function showContentDetail( url ) {
	
	$("#contentframe").attr("src","/news-time-machine/loading.html");
	$("#contentframe").attr("src",url);
	$("#contentframe").attr("height",getMyHeight()-135);
	
	$("#modelbtn").click(); 

}

/**
 * Efetua a exibição dos dados na view
 * @param type tipo de dado a ser exibido
 * @param serviceName nome do serviço
 * @param divName nome da div
 * @param label label de exibição
 */
function showContent( type, serviceName, divName, label ) {
	 $.ajax({   
       type: "GET",
       data : $("#form").serialize(),
       cache: false,  
       url: "http://rbsn0827:8080/news-time-machine/api/"+serviceName+"/search?q="+$("#s").val(),   
       success: function(data){
      	   $("#" + divName).html("");
      	   $("#" + divName).append("<h2 class=\"categ-title\">"+label+"</h2>");
      	   if (data != null) {
      		   var output = ""; 
      		   var array = new Array();;
      		   switch (type) {
      		   	case 1: array =	data.news; break;
      		   	case 2: array =	data.videos; break;
      		   	case 3: array =	data.photos; break;
      		   	case 4: array =	data.pdf; break;
      		   	case 5: array =	data.graphic; break;
      		   }
      		   var size = array.length;
      		   if (array.length > 3) {
      			   size = 3;
      		   }
              for(var  i = 0; i < size; i++) {
            	  
            	  var contentDetail = array[i].url;
            	  
            	  if (type == 4) {
            		  contentDetail = "/news-time-machine/pdf/" + array[i].image;
            	  } else if (type == 5) {
            		  //contentDetail = "/news-time-machine/graphic/" + array[i].image;
            		  //alert(contentDetail);
            	  } 
            	  
                output += "<div><a href=\"#\" onclick=\"javascript:showContentDetail('"+contentDetail+"')\"><time class=\"post-time\" datetime=\"" + array[i].date + "\">"+array[i].textdate+"</time><h3>"+  array[i].title  +"</h3></a></div>";
              }
             }
      	   $("#" + divName).append(output);
      	 
       },
       error: function(data){
       }
   });
}

function enterButton() {
		$(document).ready(function() {
			  $(window).keydown(function(event){
			    if(event.keyCode == 13) {
			      event.preventDefault();
			      doSearchFct();
			      return false;
			    }
			  });
			});
}


function getMyHeight() {
	var myWidth = 0, myHeight = 0;
	  if( typeof( window.innerWidth ) == 'number' ) {
	    //Non-IE
	    myWidth = window.innerWidth;
	    myHeight = window.innerHeight;
	  } else if( document.documentElement && ( document.documentElement.clientWidth || document.documentElement.clientHeight ) ) {
	    //IE 6+ in 'standards compliant mode'
	    myWidth = document.documentElement.clientWidth;
	    myHeight = document.documentElement.clientHeight;
	  } else if( document.body && ( document.body.clientWidth || document.body.clientHeight ) ) {
	    //IE 4 compatible
	    myWidth = document.body.clientWidth;
	    myHeight = document.body.clientHeight;
	  }
	 return myHeight;
}

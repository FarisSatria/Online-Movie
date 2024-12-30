package gg.jte.generated.ondemand.include.header;
public final class JtesidebarsearchbarGenerated {
	public static final String JTE_NAME = "include/header/sidebar-searchbar.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,8,11,23,27,27,27,27,27,27};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n<li class=\"relative\">\n  <a href=\"#\" id=\"searchIcon\"\n     class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md\">\n    <i id=\"searchIconSymbol\" class=\"fas fa-search text-2xl\"></i>\n  </a>\n  <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n\n  ");
		jteOutput.writeContent("\n  <div id=\"searchBar\" class=\"absolute overflow-hidden hidden bg-black/60 rounded-lg shadow-2xl py-3\n     border-b-4 border-b-black/30\" style=\"top: -8.78rem; left: -70.4rem; width:87.6vw; height:92vh;\">\n");
		jteOutput.writeContent("\n    <form id=\"searchForm\" class=\"flex p-3 rounded-lg shadow-card bg-gray-50 shadow-card mx-auto w-2/5\" method=\"get\">\n      <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Search...\" class=\"p-2 border border-gray-300 w-full rounded-md focus:outline-none\"/>\n      <div class=\"ml-3 mt-1 w-8\">\n        <button type=\"button\" id=\"searchButton\" class=\"hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg\">\n          <i class=\"fas fa-search text-sky-400 hover:text-yellow-500 text-2xl\"></i>\n        </button>\n        <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n      </div>\n    </form>\n    <div class=\" overflow-scroll p-4 h-full\" style=\"height: calc(91vh - 5rem);\">\n      <div  id=\"movieResults\"  class=\"grid grid-cols-3 gap-4\">\n        ");
		jteOutput.writeContent("\n      </div>\n    </div>\n  </div>\n</li>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}

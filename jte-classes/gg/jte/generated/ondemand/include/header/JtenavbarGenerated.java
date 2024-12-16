package gg.jte.generated.ondemand.include.header;
public final class JtenavbarGenerated {
	public static final String JTE_NAME = "include/header/navbar.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,2,4,12,20,30,37,37,37,37,37,37};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n<div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4\">\n    ");
		jteOutput.writeContent("\n    <ul class=\"space-y-6 text-center\">\n        ");
		jteOutput.writeContent("\n        <li>\n            <a href=\"/\"\n               class=\"block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-card transition duration-200\">\n                <i class=\"fas fa-home text-2xl\"></i>\n            </a>\n            <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n        </li>\n        ");
		jteOutput.writeContent("\n        <li>\n            <a href=\"#\"\n               class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-card transition duration-200\">\n                <i class=\"fas fa-film text-2xl\"></i>\n            </a>\n            <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n        </li>\n        ");
		jteOutput.writeContent("\n        <li>\n            <a href=\"#\"\n               class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-card transition duration-200\">\n                <i class=\"fas fa-search text-2xl\"></i>\n            </a>\n            <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n        </li>\n    </ul>\n\n    ");
		jteOutput.writeContent("\n    <div class=\"text-center mt-auto\">\n        <a href=\"/logout\"\n           class=\"block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 hover:drop-shadow-card transition duration-200\">\n            <i class=\"fas fa-sign-out-alt text-2xl\"></i>\n        </a>\n    </div>\n</div>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}

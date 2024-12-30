package gg.jte.generated.ondemand.include.miscellaneous;
public final class JteratingradioinputGenerated {
	public static final String JTE_NAME = "include/miscellaneous/rating-radio-input.jte";
	public static final int[] JTE_LINE_INFO = {20,20,20,20,20,20,20,20,20,20,20};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<div class=\"flex flex-row-reverse\">\n    <input type=\"radio\" id=\"star5\" name=\"rating\" value=\"10.0\" class=\"hidden peer\" required>\n    <label for=\"star5\"\n           class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></label>\n\n    <input type=\"radio\" id=\"star4\" name=\"rating\" value=\"8.0\" class=\"hidden peer\">\n    <label for=\"star4\"\n           class=\" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></label>\n\n    <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"6.0\" class=\"hidden peer\">\n    <label for=\"star3\"\n           class=\" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></label>\n\n    <input type=\"radio\" id=\"star2\" name=\"rating\" value=\"4.0\" class=\"hidden peer\">\n    <label for=\"star2\"\n           class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></label>\n\n    <input type=\"radio\" id=\"star1\" name=\"rating\" value=\"2.0\" class=\"hidden peer\">\n    <label for=\"star1\"\n           class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></label>\n</div>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}

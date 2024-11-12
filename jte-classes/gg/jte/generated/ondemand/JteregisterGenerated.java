package gg.jte.generated.ondemand;
public final class JteregisterGenerated {
	public static final String JTE_NAME = "register.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,7,7,7,7,16,16,16,53,53,53,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Register</title>\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n    <link rel=\"stylesheet\" href=\"/asset/css/register.css\">\n</head>\n<body>\n<div class=\"container\">\n    <div class=\"screen\">\n        <div class=\"screen__content\">\n            <form class=\"register\" method=\"post\" action=\"/register\">\n                <h2 class=\"register__name\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent("</h2>\n                <div class=\"register__field\">\n                    <i class=\"register__icon fas fa-user\"></i>\n                    <input type=\"text\" name=\"name\" class=\"register__input\" placeholder=\"Name\" required>\n                </div>\n                <div class=\"register__field\">\n                    <i class=\"register__icon fas fa-user\"></i>\n                    <input type=\"text\" name=\"username\" class=\"register__input\" placeholder=\"User name\" required>\n                </div>\n                <div class=\"register__field\">\n                    <i class=\"register__icon fas fa-lock\"></i>\n                    <input type=\"password\" name=\"password\" class=\"register__input\" placeholder=\"Password\" required>\n                </div>\n                <button class=\"button register__submit\">\n                    <span class=\"button__text\">Register Now</span>\n                    <i class=\"button__icon fas fa-chevron-right\"></i>\n                </button>\n            </form>\n            <div class=\"social-login\">\n                <h3>Register via</h3>\n                <div class=\"social-icons\">\n                    <a href=\"#\" class=\"social-login__icon fab fa-instagram\"></a>\n                    <a href=\"#\" class=\"social-login__icon fab fa-facebook\"></a>\n                    <a href=\"#\" class=\"social-login__icon fab fa-twitter\"></a>\n                </div>\n            </div>\n        </div>\n        <div class=\"screen__background\">\n            <span class=\"screen__background__shape screen__background__shape4\"></span>\n            <span class=\"screen__background__shape screen__background__shape3\"></span>\n            <span class=\"screen__background__shape screen__background__shape2\"></span>\n            <span class=\"screen__background__shape screen__background__shape1\"></span>\n        </div>\n    </div>\n</div>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		render(jteOutput, jteHtmlInterceptor, WebName);
	}
}

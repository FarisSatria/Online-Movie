package gg.jte.generated.ondemand;
public final class JteregisterGenerated {
	public static final String JTE_NAME = "register.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,11,11,14,17,23,25,25,25,27,32,37,42,50,58,58,62,62,62,65,65,67,71,71,71,0,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, String userAlreadyExist) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Cinema Eudaemonia | Register</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen flex items-center justify-center\">\n\n<div class=\"w-10/12 h-96 max-w-4xl bg-gray-50 rounded-lg shadow-card flex flex-row\">\n    ");
		jteOutput.writeContent("\n    <div id=\"registerForm\" class=\"p-8 w-full md:w-1/2 text-gray-900\">\n        <h2 class=\"text-4xl text-black font-bold text-center mb-6\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent("</h2>\n        <form class=\"space-y-4\" method=\"post\" action=\"/register\">\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-envelope text-gray-400 mr-3\"></i>\n                <input type=\"text\" name=\"name\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Name\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-user text-gray-400 mr-3\"></i>\n                <input type=\"text\" name=\"username\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Username\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-lock text-gray-400 mr-3\"></i>\n                <input type=\"password\" name=\"password\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Password\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <button class=\"w-full mt-6 py-3 bg-green-600 shadow-card hover:bg-green-500 text-white font-semibold rounded-lg flex items-center justify-center space-x-2 transition\">\n                <span>Register Now</span>\n                <i class=\"fas fa-user-plus\"></i>\n            </button>\n        </form>\n    </div>\n\n    ");
		jteOutput.writeContent("\n    <div id=\"loginPrompt\" class=\"p-8 w-full md:w-1/2 flex flex-col justify-center items-center text-gray-900 border-t md:border-t-0 md:border-l border-gray-400\">\n        <h2 class=\"text-2xl text-black font-semibold mb-4\">Already have an account?</h2>\n        <p class=\"text-gray-400 mb-8 text-center\">Log in to access your account and continue exploring Cinema Eudaemonia!</p>\n        <a href=\"/login\" class=\"px-6 py-3 bg-sky-500 hover:bg-sky-400 text-white font-semibold rounded-lg transition shadow-card\">Log In</a>\n    </div>\n</div>\n\n");
		if (userAlreadyExist != null) {
			jteOutput.writeContent("\n    <div id=\"error-message\" class=\"drop-shadow-md absolute top-5\">\n        <div class=\"bg-red-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center\">Warning!</div>\n        <div class=\"bg-white p-5 rounded-br-lg rounded-bl-lg\">\n            <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(userAlreadyExist);
			jteOutput.writeContent("</p>\n        </div>\n    </div>\n");
		}
		jteOutput.writeContent("\n\n");
		jteOutput.writeContent("\n<script src=\"/asset/js/login.js\"></script>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		String userAlreadyExist = (String)params.get("userAlreadyExist");
		render(jteOutput, jteHtmlInterceptor, WebName, userAlreadyExist);
	}
}

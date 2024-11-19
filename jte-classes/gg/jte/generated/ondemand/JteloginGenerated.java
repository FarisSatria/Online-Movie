package gg.jte.generated.ondemand;
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,7,7,7,7,9,12,15,21,23,23,23,25,30,35,42,53,55,55,55,57,62,67,72,80,83,83,83,89,89,89,94,98,98,98,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Login</title>\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/login.css\">\n</head>\n<body class=\"bg-gray-200 font-mono min-h-screen flex items-center justify-center\">\n\n<div class=\"w-10/12 max-w-4xl bg-gray-50 rounded-lg shadow-lg flex flex-col md:flex-row\">\n    ");
		jteOutput.writeContent("\n    <div id=\"loginForm\" class=\"p-8 w-full md:w-1/2 text-gray-900\">\n        <h2 class=\"text-4xl text-black font-bold text-center mb-6\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent("</h2>\n        <form class=\"space-y-4\" method=\"post\" action=\"/login\">\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-user text-gray-400 mr-3\"></i>\n                <input type=\"text\" name=\"username\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Username\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-lock text-gray-400 mr-3\"></i>\n                <input type=\"password\" name=\"password\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Password\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <button class=\"w-full mt-6 py-3 bg-sky-500 hover:bg-sky-400 text-white font-semibold rounded-lg flex items-center justify-center space-x-2 transition\">\n                <span>Log In Now</span>\n                <i class=\"fas fa-chevron-right\"></i>\n            </button>\n        </form>\n\n        ");
		jteOutput.writeContent("\n        <div class=\"mt-8 text-center\">\n            <h3 class=\"text-sm text-gray-400 mb-4\">Or log in via</h3>\n            <div class=\"flex justify-center space-x-6\">\n                <a href=\"#\" class=\"text-gray-400 hover:text-pink-500 hover:rotate-12 hover:scale-125 hover:drop-shadow-md text-2xl transition\"><i class=\"fab fa-instagram\"></i></a>\n                <a href=\"#\" class=\"text-gray-400 hover:text-blue-600 hover:rotate-12 hover:scale-125 hover:drop-shadow-md text-2xl transition\"><i class=\"fab fa-facebook\"></i></a>\n                <a href=\"#\" class=\"text-gray-400 hover:text-blue-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md text-2xl transition\"><i class=\"fab fa-twitter\"></i></a>\n            </div>\n        </div>\n    </div>\n\n    ");
		jteOutput.writeContent("\n    <div id=\"registerForm\" class=\"p-8 w-full md:w-1/2 hidden text-gray-900\">\n        <h2 class=\"text-4xl text-black font-bold text-center mb-6\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent("</h2>\n        <form class=\"space-y-4\" method=\"post\" action=\"/register\">\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-envelope text-gray-400 mr-3\"></i>\n                <input type=\"text\" name=\"name\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Name\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-user text-gray-400 mr-3\"></i>\n                <input type=\"text\" name=\"username\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Username\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-lock text-gray-400 mr-3\"></i>\n                <input type=\"password\" name=\"password\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Password\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <button class=\"w-full mt-6 py-3 bg-green-600 hover:bg-green-500 text-white font-semibold rounded-lg flex items-center justify-center space-x-2 transition\">\n                <span>Register Now</span>\n                <i class=\"fas fa-user-plus\"></i>\n            </button>\n        </form>\n    </div>\n\n    ");
		jteOutput.writeContent("\n    <div id=\"registerPrompt\" class=\"p-8 w-full md:w-1/2 flex flex-col justify-center items-center text-gray-900 border-t md:border-t-0 md:border-l border-gray-400\">\n        <h2 class=\"text-2xl text-black font-semibold mb-4\">Don’t have an account?</h2>\n        <p class=\"text-gray-400 mb-8 text-center\">Register now to join ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" and enjoy exclusive content!</p>\n        <button onclick=\"toggleView()\" class=\"px-6 py-3 bg-green-500 hover:bg-green-400 text-white font-semibold rounded-lg transition\">Register Now</button>\n    </div>\n\n    <div id=\"loginPrompt\" class=\"p-8 w-full md:w-1/2 flex flex-col justify-center items-center text-gray-900 border-t md:border-t-0 md:border-l border-gray-400 hidden\">\n        <h2 class=\"text-2xl text-black font-semibold mb-4\">Already have an account?</h2>\n        <p class=\"text-gray-400 mb-8 text-center\">Log in to access your account and continue exploring ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent("!</p>\n        <button onclick=\"toggleView()\" class=\"px-6 py-3 bg-sky-500 hover:bg-sky-400 text-white font-semibold rounded-lg transition\">Log In</button>\n    </div>\n</div>\n\n");
		jteOutput.writeContent("\n<script src=\"/asset/js/main.js\"></script>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		render(jteOutput, jteHtmlInterceptor, WebName);
	}
}

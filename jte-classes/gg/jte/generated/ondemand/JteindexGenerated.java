package gg.jte.generated.ondemand;
import java.util.List;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,13,13,13,13,18,20,22,30,38,46,56,67,69,71,71,73,73,73,73,73,73,73,73,73,73,73,73,73,76,76,76,77,77,77,79,79,80,80,82,82,84,84,85,85,89,89,92,94,99,106,110,111,111,114,114,114,114,114,114,114,114,114,114,114,114,114,116,116,116,118,118,119,119,121,121,123,123,124,124,128,128,131,135,136,136,139,139,139,139,139,139,139,139,139,139,139,139,139,141,141,141,143,143,144,144,146,146,148,148,149,149,153,153,163,163,166,166,166,166,166,166,166,166,166,166,166,166,166,168,168,168,169,169,169,172,172,183,183,183,3,4,5,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, List<MovieDTO> popularMovies, List<MovieDTO> topRatedMovies, List<MovieDTO> upcomingMovies) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Homepage</title>\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n</head>\n<body class=\"bg-gray-200 font-sans min-h-screen\">\n");
		jteOutput.writeContent("\n<div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-md flex flex-col justify-between p-4\">\n    ");
		jteOutput.writeContent("\n    <ul class=\"space-y-6 text-center\">\n        ");
		jteOutput.writeContent("\n        <li>\n            <a href=\"#\"\n               class=\"block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n                <i class=\"fas fa-home text-2xl\"></i>\n            </a>\n            <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n        </li>\n        ");
		jteOutput.writeContent("\n        <li>\n            <a href=\"#\"\n               class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n                <i class=\"fas fa-film text-2xl\"></i>\n            </a>\n            <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n        </li>\n        ");
		jteOutput.writeContent("\n        <li>\n            <a href=\"#\"\n               class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n                <i class=\"fas fa-fire text-2xl\"></i>\n            </a>\n            <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n        </li>\n        ");
		jteOutput.writeContent("\n        <li>\n            <a href=\"#\"\n               class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n                <i class=\"fas fa-search text-2xl\"></i>\n            </a>\n            <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n        </li>\n    </ul>\n\n    ");
		jteOutput.writeContent("\n    <div class=\"text-center mt-auto\">\n        <a href=\"/logout\"\n           class=\"block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n            <i class=\"fas fa-sign-out-alt text-2xl\"></i>\n        </a>\n    </div>\n</div>\n\n<div class=\"flex\">\n    <div class=\"flex-initial w-3/5 ml-32 mt-8 \">\n        ");
		jteOutput.writeContent("\n        <div class=\"relative h-1/4 w-full mb-5 rounded-xl overflow-hidden shadow-md\" style=\"height:70vh;\">\n            ");
		jteOutput.writeContent("\n            <div id=\"carousel\" class=\"flex transition-transform duration-500 ease-in-out h-full\">\n                ");
		for (MovieDTO movie : popularMovies) {
			jteOutput.writeContent("\n                    <div class=\"relative\">\n                        <img class=\"w-screen h-full object-fill\" src=\"https://image.tmdb.org/t/p/w780");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"");
			var __jte_html_attribute_0 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_0);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                        <div class=\"absolute left-4 top-1/2 transform rounded-lg bg-white/20 shadow-2xl py-3 px-2 -translate-y-1/2 w-60 text space-y-4\">\n                            <h4 class=\"text-xl font-medium text-white border-sky-400 border-l-4 pl-2 \">#Popular Movies!</h4>\n                            <h3 class=\"text-4xl text-white font-semibold\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                            <p class=\"text-sm text-white h-24 overflow-hidden text-ellipsis\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getOverview());
			jteOutput.writeContent("</p>\n                            <div class=\"flex items-center space-x-1 \">\n                                ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                    ");
				if (i <= movie.getVote_average() / 1.5) {
					jteOutput.writeContent("\n                                        <span class=\"text-yellow-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				} else {
					jteOutput.writeContent("\n                                        <span class=\"text-gray-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </div>\n                ");
		}
		jteOutput.writeContent("\n            </div>\n\n            ");
		jteOutput.writeContent("\n            <div class=\"right-3 bottom-3 p-1 h-1/6 rounded-full shadow-inner w-3/12 absolute flex bg-gray-50\">\n                ");
		jteOutput.writeContent("\n                <button id=\"prev\"\n                        class=\"mr-4 bg-sky-400 hover:bg-sky-500 shadow-md w-1/2 h-full transition duration-300 rounded-full text-white\">\n                    <i class=\"fas fa-chevron-left\"></i>\n                </button>\n                ");
		jteOutput.writeContent("\n                <button id=\"next\"\n                        class=\"bg-sky-400 hover:bg-sky-500 shadow-md w-1/2 h-full transition duration-300 rounded-full text-white\">\n                    <i class=\"fas fa-chevron-right\"></i>\n                </button>\n            </div>\n        </div>\n        ");
		jteOutput.writeContent("\n        <div class=\"w-full mb-5\">\n            <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Popular Movies</h3>\n            <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-5\">\n                ");
		jteOutput.writeContent("\n                ");
		for (MovieDTO movie : popularMovies) {
			jteOutput.writeContent("\n                    <a href=\"/movie/1\" class=\"rounded-lg bg-gray-50 shadow-md overflow-hidden\n                max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md\">\n                        <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"");
			var __jte_html_attribute_1 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_1);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                        <div class=\"p-4\">\n                            <h3 class=\"text-xl text-black font-semibold overflow-hidden text-ellipsis h-6 mb-2\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                            <div class=\"flex items-center mb-4\">\n                                ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                    ");
				if (i <= movie.getVote_average() / 2) {
					jteOutput.writeContent("\n                                        <span class=\"text-yellow-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				} else {
					jteOutput.writeContent("\n                                        <span class=\"text-gray-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </a>\n                ");
		}
		jteOutput.writeContent("\n            </div>\n        </div>\n        ");
		jteOutput.writeContent("\n        <div class=\"w-full mb-5\">\n            <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Top Rated Movies</h3>\n            <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-5\">\n                ");
		jteOutput.writeContent("\n                ");
		for (MovieDTO movie : topRatedMovies) {
			jteOutput.writeContent("\n                    <a href=\"/movie/1\" class=\"rounded-lg bg-gray-50 shadow-md overflow-hidden\n                max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md\">\n                        <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"");
			var __jte_html_attribute_2 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_2);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                        <div class=\"p-4\">\n                            <h3 class=\"text-xl text-black font-semibold overflow-hidden text-ellipsis h-6 mb-2\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                            <div class=\"flex items-center mb-4\">\n                                ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                    ");
				if (i <= movie.getVote_average() / 2) {
					jteOutput.writeContent("\n                                        <span class=\"text-yellow-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				} else {
					jteOutput.writeContent("\n                                        <span class=\"text-gray-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </a>\n                ");
		}
		jteOutput.writeContent("\n            </div>\n        </div>\n    </div>\n    <div class=\"flex-initial\">\n        <div class=\"w-3/12 ml-5 mt-8\">\n            <div class=\"w-96\">\n                <h3 class=\"ml-3 text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4\">Upcoming Movies</h3>\n                <div class=\"overflow-auto p-3 h-screen\">\n                    <div class=\"flex flex-col space-y-6\">\n                        ");
		for (MovieDTO movie : topRatedMovies) {
			jteOutput.writeContent("\n                            <a class=\"bg-gray-50 rounded-xl flex shadow-md overflow-hidden max-w-sm w-full h-40\n                    flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2\">\n                                <img class=\"w-28 object-cover\" src=\"https://image.tmdb.org/t/p/w500");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"");
			var __jte_html_attribute_3 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_3);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                                <div class=\"p-4 h-5/6 overflow-hidden\">\n                                    <h3 class=\"text-xl text-black font-semibold mb-2\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                                    <p class=\"text-sm text-zinc-400 mb-4\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getOverview());
			jteOutput.writeContent("</p>\n                                </div>\n                            </a>\n                        ");
		}
		jteOutput.writeContent("\n                    </div>\n                </div>\n            </div>\n\n        </div>\n\n    </div>\n</div>\n<script src=\"/asset/js/main.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		List<MovieDTO> popularMovies = (List<MovieDTO>)params.get("popularMovies");
		List<MovieDTO> topRatedMovies = (List<MovieDTO>)params.get("topRatedMovies");
		List<MovieDTO> upcomingMovies = (List<MovieDTO>)params.get("upcomingMovies");
		render(jteOutput, jteHtmlInterceptor, WebName, popularMovies, topRatedMovies, upcomingMovies);
	}
}

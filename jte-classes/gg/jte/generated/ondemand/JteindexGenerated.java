package gg.jte.generated.ondemand;
import java.util.List;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,16,16,16,16,25,27,29,37,45,45,48,48,49,56,56,57,64,64,68,70,72,72,74,74,74,74,77,77,77,77,77,77,77,77,77,77,77,77,77,80,80,80,81,81,81,83,83,84,84,86,86,88,88,89,89,92,92,92,92,101,101,104,106,111,118,122,123,123,124,124,124,124,126,126,126,126,127,127,127,127,127,127,127,127,127,130,130,130,132,132,133,133,135,135,137,137,138,138,142,142,145,149,150,150,151,151,151,151,153,153,153,153,154,154,154,154,154,154,154,154,154,157,157,157,159,159,160,160,162,162,164,164,165,165,169,169,180,180,181,181,181,181,184,184,184,184,185,185,185,185,185,185,185,185,185,187,187,187,188,188,188,191,191,198,199,199,204,204,204,3,4,5,6,7,8,9,9,9,9};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, Boolean isLoggedIn, List<MovieDTO> searchMovies, List<MovieDTO> nowPlayingMovies, List<MovieDTO> popularMovies, List<MovieDTO> topRatedMovies, List<MovieDTO> upcomingMovies) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Homepage</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-sky-400 hover:text-yellow-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#popularMovies\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		gg.jte.generated.ondemand.include.header.JtesidebarsearchbarGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n            </ul>\n\n            ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                <div class=\"text-center mt-auto\">\n                    <a href=\"/logout\"\n                       class=\"block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-sign-out-alt text-2xl\"></i>\n                    </a>\n                </div>\n            ");
		} else {
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                <div class=\"text-center mt-auto\">\n                    <a href=\"/login\"\n                       class=\"block text-green-500  hover:text-green-400 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-sign-in-alt text-2xl\"></i>\n                    </a>\n                </div>\n            ");
		}
		jteOutput.writeContent("\n        </div>\n    </div>\n    <div class=\"flex-initial mt-8 space-y-5\" style=\"width:60vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"relative h-1/4 w-full rounded-xl overflow-hidden shadow-card\" style=\"height:70vh;\">\n            ");
		jteOutput.writeContent("\n            <div id=\"carousel\" class=\"flex transition-transform duration-500 ease-in-out h-full\">\n                ");
		for (MovieDTO movie : nowPlayingMovies) {
			jteOutput.writeContent("\n                <div class=\"size-full flex \"\n                     style=\"background-image:url(https://image.tmdb.org/t/p/w1280");
			jteOutput.setContext("div", "style");
			jteOutput.writeUserContent(movie.getBackdrop_path());
			jteOutput.setContext("div", null);
			jteOutput.writeContent(");\">\n                    <div class=\"flex bg-black/60\">\n                        <img class=\"my-auto mx-10 rounded-lg h-5/6\"\n                             src=\"https://image.tmdb.org/t/p/w500");
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
			jteOutput.writeContent(">\n                        <div class=\"space-y-4 p-4 h-5/6 my-auto\">\n                            <h4 class=\"text-xl font-medium text-white border-sky-400 border-l-4 pl-2 \">Now Playing!</h4>\n                            <h3 class=\"text-4xl text-white font-semibold \">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                            <p class=\"text-sm text-zinc-300\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getOverview());
			jteOutput.writeContent("</p>\n                            <div class=\"flex items-center space-x-1\">\n                                ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                    ");
				if (i <= movie.getVote_average() / 2) {
					jteOutput.writeContent("\n                                        <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				} else {
					jteOutput.writeContent("\n                                        <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            </div>\n                            <div class=\"space-x-1 flex\">\n                                <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movie.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\" class=\"p-3 shadow-card bg-sky-400 hover:bg-sky-500 text-white rounded-lg transition duration-300 \">View Now!</a>\n                                <div class=\"p-3 rounded-lg shadow-inner-lg border border-gray-200 bg-gray-100 flex\">\n                                    <p class=\"text-zinc-700 font-semibold\">Quota Left: 5</p>\n                                    <p class=\"text-zinc-700 font-medium\">/50</p>\n                                </div>\n                            </div>\n                        </div>\n                    </div>\n                </div>\n                ");
		}
		jteOutput.writeContent("\n            </div>\n\n            ");
		jteOutput.writeContent("\n            <div class=\"right-3 bottom-3 p-1 h-24 rounded-full shadow-inner-lg w-52 absolute flex bg-gray-50\">\n                ");
		jteOutput.writeContent("\n                <button id=\"prev\"\n                        class=\"mr-4 bg-sky-400 hover:bg-sky-500 shadow-card w-1/2 h-full transition duration-300 rounded-full text-white\">\n                    <i class=\"fas fa-chevron-left\"></i>\n                </button>\n                ");
		jteOutput.writeContent("\n                <button id=\"next\"\n                        class=\"bg-sky-400 hover:bg-sky-500 shadow-card w-1/2 h-full transition duration-300 rounded-full text-white\">\n                    <i class=\"fas fa-chevron-right\"></i>\n                </button>\n            </div>\n        </div>\n        ");
		jteOutput.writeContent("\n        <div class=\"w-full\">\n            <h3 id=\"popularMovies\" class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Popular Movies</h3>\n            <div class=\"flex space-x-4 pb-4 overflow-x-hidden pt-5\">\n                ");
		jteOutput.writeContent("\n                ");
		for (MovieDTO movie : popularMovies) {
			jteOutput.writeContent("\n                    <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movie.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\" class=\"rounded-lg bg-gray-50 shadow-card overflow-hidden\n                max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2\">\n                        <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"\n                            ");
			var __jte_html_attribute_1 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_1);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                        <div class=\"p-4 space-y-2\">\n                            <h3 class=\"text-xl text-black font-semibold\" style=\" display: -webkit-box;\n                            -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                            <div class=\"flex items-center\">\n                                ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                    ");
				if (i <= movie.getVote_average() / 2) {
					jteOutput.writeContent("\n                                        <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				} else {
					jteOutput.writeContent("\n                                        <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </a>\n                ");
		}
		jteOutput.writeContent("\n            </div>\n        </div>\n        ");
		jteOutput.writeContent("\n        <div id=\"top-rated\" class=\"w-full\">\n            <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Top Rated Movies</h3>\n            <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-5\">\n                ");
		jteOutput.writeContent("\n                ");
		for (MovieDTO movie : topRatedMovies) {
			jteOutput.writeContent("\n                    <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movie.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\" class=\"rounded-lg bg-gray-50 shadow-card overflow-hidden\n                max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2\">\n                        <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"\n                            ");
			var __jte_html_attribute_2 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_2);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                        <div class=\"p-4  space-y-2\">\n                            <h3 class=\"text-xl text-black font-semibold\" style=\" display: -webkit-box;\n                            -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                            <div class=\"flex items-center\">\n                                ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                    ");
				if (i <= movie.getVote_average() / 2) {
					jteOutput.writeContent("\n                                        <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				} else {
					jteOutput.writeContent("\n                                        <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </a>\n                ");
		}
		jteOutput.writeContent("\n            </div>\n        </div>\n    </div>\n    <div class=\"flex-initial\" style=\"width:30vw;\">\n        <div class=\"w-3/12 ml-5 mt-8\">\n            <div style=\"width:26.9vw;\">\n                <h3 class=\"ml-3 text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4\">Upcoming\n                    Movies</h3>\n                <div class=\"overflow-auto p-3 h-screen\">\n                    <div class=\"flex flex-col space-y-6\">\n                        ");
		for (MovieDTO movie : topRatedMovies) {
			jteOutput.writeContent("\n                                <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movie.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\" class=\"relative bg-gray-50 rounded-xl flex shadow-card overflow-hidden max-w-sm w-full h-40\n                                flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2\">\n                                    <img class=\"w-28 h-full object-cover\"\n                                         src=\"https://image.tmdb.org/t/p/w185");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"\n                                        ");
			var __jte_html_attribute_3 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_3);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                                    <div class=\"p-4 space-y-1\" style=\"height:90%;\">\n                                        <h3 class=\"text-xl text-black font-semibold\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                                        <div class=\"text-sm text-zinc-400 relative overflow-hidden max-h-24 text-ellipsis\">");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(movie.getOverview());
			jteOutput.writeContent("</div>\n                                    </div>\n                                </a>\n                        ");
		}
		jteOutput.writeContent("\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.footer.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n<script src=\"/asset/js/navbar.js\"></script>\n<script src=\"/asset/js/AJAX-handler.js\"></script>\n<script src=\"/asset/js/carousel.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		Boolean isLoggedIn = (Boolean)params.get("isLoggedIn");
		List<MovieDTO> searchMovies = (List<MovieDTO>)params.get("searchMovies");
		List<MovieDTO> nowPlayingMovies = (List<MovieDTO>)params.get("nowPlayingMovies");
		List<MovieDTO> popularMovies = (List<MovieDTO>)params.get("popularMovies");
		List<MovieDTO> topRatedMovies = (List<MovieDTO>)params.get("topRatedMovies");
		List<MovieDTO> upcomingMovies = (List<MovieDTO>)params.get("upcomingMovies");
		render(jteOutput, jteHtmlInterceptor, WebName, isLoggedIn, searchMovies, nowPlayingMovies, popularMovies, topRatedMovies, upcomingMovies);
	}
}

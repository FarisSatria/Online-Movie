package gg.jte.generated.ondemand;
import java.util.List;
import com.movieonline.Online.Movie.entity.dto.MovieCastDTO;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
public final class JtemoviepageGenerated {
	public static final String JTE_NAME = "movie-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,16,16,16,16,25,27,29,37,45,53,63,73,75,77,77,77,77,80,80,80,80,80,80,80,80,80,80,80,80,80,84,84,84,85,85,85,87,87,88,88,90,90,92,92,93,93,101,106,107,107,110,110,110,110,111,111,111,111,111,111,111,111,111,113,113,113,114,114,114,117,117,122,130,130,131,131,131,131,134,134,134,134,135,135,135,135,135,135,135,135,135,137,137,137,138,138,138,141,141,158,158,158,4,5,6,7,8,9,9,9,9};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, MovieDTO movieDetail, List<MovieCastDTO> movieCast, List<MovieDTO> popularMovies, List<MovieDTO> topRatedMovies, List<MovieDTO> upcomingMovies) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Homepage</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-200 font-avenir min-h-screen shadow-inner-xl\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-md flex flex-col justify-between p-4\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-black hover:text-sky-400 text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n                        <i class=\"fas fa-fire text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n                        <i class=\"fas fa-search text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n            </ul>\n\n            ");
		jteOutput.writeContent("\n            <div class=\"text-center mt-auto\">\n                <a href=\"/logout\"\n                   class=\"block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200\">\n                    <i class=\"fas fa-sign-out-alt text-2xl\"></i>\n                </a>\n            </div>\n        </div>\n    </div>\n    <div class=\"flex-initial mt-8\" style=\"width:87.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"relative h-1/4 w-full mb-5 rounded-xl overflow-hidden shadow-md\" style=\"height:70vh;\">\n            ");
		jteOutput.writeContent("\n            <div id=\"carousel\" class=\"flex transition-transform duration-500 ease-in-out h-full\"\n                 style=\"background-image:url(https://image.tmdb.org/t/p/w1280");
		jteOutput.setContext("div", "style");
		jteOutput.writeUserContent(movieDetail.getBackdrop_path());
		jteOutput.setContext("div", null);
		jteOutput.writeContent(");\">\n                    <div class=\"relative flex bg-black/40\">\n                        <img class=\"my-auto mx-10 rounded-lg h-5/6\"\n                             src=\"https://image.tmdb.org/t/p/w1280");
		jteOutput.setContext("img", "src");
		jteOutput.writeUserContent(movieDetail.getPoster_path());
		jteOutput.setContext("img", null);
		jteOutput.writeContent("\"");
		var __jte_html_attribute_0 = movieDetail.getTitle();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" alt=\"");
			jteOutput.setContext("img", "alt");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\n                        <div class=\"transform text space-y-4 p-4 h-5/6 my-auto\">\n                            <h4 class=\"text-xl font-medium text-white border-sky-400 border-l-4 pl-2 \">#Popular\n                                Movies!</h4>\n                            <h3 class=\"text-4xl text-white font-semibold \">");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("</h3>\n                            <p class=\"text-sm text-zinc-300\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getOverview());
		jteOutput.writeContent("</p>\n                            <div class=\"flex items-center space-x-1 \">\n                                ");
		for (int i = 1; i <= 5; i++) {
			jteOutput.writeContent("\n                                    ");
			if (i <= movieDetail.getVote_average() / 1.5) {
				jteOutput.writeContent("\n                                        <span class=\"text-yellow-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			} else {
				jteOutput.writeContent("\n                                        <span class=\"text-gray-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			}
			jteOutput.writeContent("\n                                ");
		}
		jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </div>\n            </div>\n\n        </div>\n        <div class=\"w-full mb-5 flex\">\n            ");
		jteOutput.writeContent("\n            <div class=\"flex-initial\" style=\"width:59vw;\">\n                <div class=\"overflow-x-scroll\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Top Billed Cast</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-5\">\n                        ");
		jteOutput.writeContent("\n                        ");
		for (MovieCastDTO movie : movieCast) {
			jteOutput.writeContent("\n                            <a class=\"rounded-lg bg-gray-50 shadow-md overflow-hidden\n                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md\">\n                                <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getProfile_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"\n                                    ");
			var __jte_html_attribute_1 = movie.getName();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_1);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                                <div class=\"p-4 space-y-2\">\n                                    <h3 class=\"text-xl text-black font-semibold overflow-hidden text-ellipsis h-6\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getName());
			jteOutput.writeContent("</h3>\n                                    <p class=\"text-sm text-zinc-400\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getCharacter());
			jteOutput.writeContent("</p>\n                                </div>\n                            </a>\n                        ");
		}
		jteOutput.writeContent("\n                    </div>\n                </div>\n            </div>\n\n            ");
		jteOutput.writeContent("\n            <div class=\"flex-initial\" style=\"width:30vw;\">\n                <div class=\"w-3/12 ml-5\">\n                    <div class=\"w-96\">\n                        <h3 class=\"ml-3 text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4\">Upcoming\n                            Movies</h3>\n                        <div class=\"overflow-auto p-3 h-screen\">\n                            <div class=\"flex flex-col space-y-6\">\n                                ");
		for (MovieDTO movie : topRatedMovies) {
			jteOutput.writeContent("\n                                    <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movie.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\" class=\"bg-gray-50 rounded-xl flex shadow-md overflow-hidden max-w-sm w-full h-40\n                    flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2\">\n                                        <img class=\"w-28 object-cover\"\n                                             src=\"https://image.tmdb.org/t/p/w500");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"\n                                            ");
			var __jte_html_attribute_2 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_2);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                                        <div class=\"p-4 overflow-hidden space-y-2\" style=\"height:90%;\">\n                                            <h3 class=\"text-xl text-black font-semibold\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                                            <p class=\"text-sm text-zinc-400\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getOverview());
			jteOutput.writeContent("</p>\n                                        </div>\n                                    </a>\n                                ");
		}
		jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n<div class=\"p-5 text-center text-lg\">\n    <ul>\n        <li><p class=\"font-avenir\">That's the end of the show!</p></li>\n        <li><i class=\"fas fa-film\"></i></li>\n    </ul>\n</div>\n<script src=\"/asset/js/main.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		MovieDTO movieDetail = (MovieDTO)params.get("movieDetail");
		List<MovieCastDTO> movieCast = (List<MovieCastDTO>)params.get("movieCast");
		List<MovieDTO> popularMovies = (List<MovieDTO>)params.get("popularMovies");
		List<MovieDTO> topRatedMovies = (List<MovieDTO>)params.get("topRatedMovies");
		List<MovieDTO> upcomingMovies = (List<MovieDTO>)params.get("upcomingMovies");
		render(jteOutput, jteHtmlInterceptor, WebName, movieDetail, movieCast, popularMovies, topRatedMovies, upcomingMovies);
	}
}

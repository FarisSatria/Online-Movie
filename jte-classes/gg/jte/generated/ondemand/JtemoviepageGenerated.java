package gg.jte.generated.ondemand;
import java.util.List;
import com.movieonline.Online.Movie.entity.dto.MovieCastDTO;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
public final class JtemoviepageGenerated {
	public static final String JTE_NAME = "movie-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,19,19,19,19,28,29,29,32,34,36,36,36,36,39,39,39,39,39,39,39,39,39,39,39,39,39,43,43,43,44,44,44,46,46,47,47,49,49,51,51,52,52,61,65,66,66,69,69,69,69,70,70,70,70,70,70,70,70,70,72,72,72,73,73,73,76,76,79,83,84,84,85,85,85,85,87,87,87,87,88,88,88,88,88,88,88,88,88,90,90,90,92,92,93,93,95,95,97,97,98,98,102,102,107,115,115,115,119,119,119,123,123,123,127,127,127,133,133,135,135,135,137,137,146,147,147,148,149,149,153,153,153,5,6,7,8,9,10,11,12,12,12,12};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, MovieDTO movieDetail, List<MovieCastDTO> movieCast, List<MovieKeywordsDTO> movieKeywords, List<MovieDTO> movieRecommendation, List<MovieDTO> popularMovies, List<MovieDTO> topRatedMovies, List<MovieDTO> upcomingMovies) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Homepage</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-200 font-avenir min-h-screen shadow-inner-xl\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        ");
		gg.jte.generated.ondemand.include.header.JtenavbarGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n    </div>\n    <div class=\"flex-initial mt-8\" style=\"width:87.5vw;\">\n        ");
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
		jteOutput.writeContent(">\n                        <div class=\"transform space-y-4 p-4 h-5/6 my-auto\">\n                            <h4 class=\"text-xl font-medium text-white border-sky-400 border-l-4 pl-2 \">#Popular\n                                Movies!</h4>\n                            <h3 class=\"text-4xl text-white font-semibold \">");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("</h3>\n                            <p class=\"text-sm text-zinc-300\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getOverview());
		jteOutput.writeContent("</p>\n                            <div class=\"flex items-center space-x-1\">\n                                ");
		for (int i = 1; i <= 5; i++) {
			jteOutput.writeContent("\n                                    ");
			if (i <= movieDetail.getVote_average() / 1.5) {
				jteOutput.writeContent("\n                                        <span class=\"text-yellow-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			} else {
				jteOutput.writeContent("\n                                        <span class=\"text-gray-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			}
			jteOutput.writeContent("\n                                ");
		}
		jteOutput.writeContent("\n                            </div>\n                            <button class=\"book-button p-3 bg-sky-400 hover:bg-sky-500 text-white rounded-lg transition duration-300 \">Book Now!</button>\n                        </div>\n                    </div>\n            </div>\n        </div>\n        <div class=\"w-full flex\">\n            <div class=\"flex-initial\" style=\"width:65.1vw;\">\n                ");
		jteOutput.writeContent("\n                <div class=\"overflow-x-scroll mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Top Billed Cast</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-5\">\n                        ");
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
		jteOutput.writeContent("\n                    </div>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div id=\"recommendation\" class=\"overflow-x-scroll mb-5 \">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Recommended For You</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-5\">\n                        ");
		jteOutput.writeContent("\n                        ");
		for (MovieDTO movie : movieRecommendation) {
			jteOutput.writeContent("\n                            <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movie.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"  class=\"rounded-lg bg-gray-50 shadow-md overflow-hidden\n                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md\">\n                                <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"\n                                    ");
			var __jte_html_attribute_2 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_2);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                                <div class=\"p-4 space-y-2\">\n                                    <h3 class=\"text-xl text-black font-semibold overflow-hidden text-ellipsis h-6\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                                    <div class=\"flex items-center\">\n                                        ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                            ");
				if (i <= movie.getVote_average() / 1.5) {
					jteOutput.writeContent("\n                                                <span class=\"text-yellow-400\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				} else {
					jteOutput.writeContent("\n                                                <span class=\"text-gray-400\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				}
				jteOutput.writeContent("\n                                        ");
			}
			jteOutput.writeContent("\n                                    </div>\n                                </div>\n                            </a>\n                        ");
		}
		jteOutput.writeContent("\n                    </div>\n                </div>\n            </div>\n\n            ");
		jteOutput.writeContent("\n            <div class=\"flex-initial\" style=\"width:39;\">\n                <div class=\"ml-6 p-1 w-72\">\n                        <h3 class=\" text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4\">Extra Details</h3>\n                        <div class=\"p-3 h-screen mt-4 mx-auto bg-white rounded-lg shadow-md\">\n                            <div style=\"height:35%;\" class=\"space-y-4\">\n                                <div>\n                                    <p class=\"text-black font-bold\">Status</p>\n                                    <p class=\"text-zinc-700\"> ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getStatus());
		jteOutput.writeContent("</p>\n                                </div>\n                                <div>\n                                    <p class=\"text-black font-bold\">Original Language</p>\n                                    <p class=\"text-zinc-700\"> ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getOriginal_language());
		jteOutput.writeContent("</p>\n                                </div>\n                                <div>\n                                    <p class=\"text-black font-bold\">Budget</p>\n                                    <p class=\"text-zinc-700\">$");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getBudget());
		jteOutput.writeContent("</p>\n                                </div>\n                                <div>\n                                    <p class=\"text-black font-bold\">Revenue</p>\n                                    <p class=\"text-zinc-700\">$");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRevenue());
		jteOutput.writeContent("</p>\n                                </div>\n                            </div>\n                            <p class=\"text-black font-bold\">Keywords</p>\n                            <div class=\" overflow-scroll\" style=\"height:61%;\">\n                                <div class=\"flex flex-wrap items-start h-auto w-auto\">\n                                    ");
		for (MovieKeywordsDTO movie : movieKeywords) {
			jteOutput.writeContent("\n                                        <div class=\"mr-2 mt-2 p-1 rounded-lg border border-gray-200 bg-gray-100\">\n                                            <p class=\"text-zinc-700\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getName());
			jteOutput.writeContent("</p>\n                                        </div>\n                                    ");
		}
		jteOutput.writeContent("\n                                </div>\n                            </div>\n                        </div>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.footer.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.modal.JtebookingGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n<script src=\"/asset/js/modal.js\"></script>\n<script src=\"/asset/js/main.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		MovieDTO movieDetail = (MovieDTO)params.get("movieDetail");
		List<MovieCastDTO> movieCast = (List<MovieCastDTO>)params.get("movieCast");
		List<MovieKeywordsDTO> movieKeywords = (List<MovieKeywordsDTO>)params.get("movieKeywords");
		List<MovieDTO> movieRecommendation = (List<MovieDTO>)params.get("movieRecommendation");
		List<MovieDTO> popularMovies = (List<MovieDTO>)params.get("popularMovies");
		List<MovieDTO> topRatedMovies = (List<MovieDTO>)params.get("topRatedMovies");
		List<MovieDTO> upcomingMovies = (List<MovieDTO>)params.get("upcomingMovies");
		render(jteOutput, jteHtmlInterceptor, WebName, movieDetail, movieCast, movieKeywords, movieRecommendation, popularMovies, topRatedMovies, upcomingMovies);
	}
}

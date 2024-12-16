package gg.jte.generated.ondemand;
import java.util.List;
import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieGenresDTO;
import com.movieonline.Online.Movie.entity.model.UserEntity;
public final class JtemoviepageGenerated {
	public static final String JTE_NAME = "movie-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,6,8,8,8,25,25,25,25,34,36,38,46,54,64,74,76,78,78,78,78,81,81,81,81,81,81,81,81,81,81,81,81,81,83,83,83,85,85,85,86,86,86,87,87,89,89,89,91,91,92,92,92,94,94,94,96,96,97,97,99,99,101,101,102,102,111,115,116,116,119,119,119,119,120,120,120,120,120,120,120,120,120,123,123,123,124,124,124,127,127,135,135,135,135,166,166,170,170,170,170,171,171,171,174,174,175,175,177,177,179,179,180,180,184,184,184,188,188,191,195,196,196,197,197,197,197,199,199,199,199,200,200,200,200,200,200,200,200,200,203,203,203,205,205,206,206,208,208,210,210,211,211,215,215,219,230,230,230,234,234,234,238,238,238,242,242,242,248,248,250,250,250,252,252,261,262,262,263,264,264,268,268,268,8,9,10,11,12,13,14,15,16,17,18,18,18,18};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, MovieDTO movieDetail, MovieGenresDTO movieGenres, MovieAuthorDetailsReviewDTO movieAuthorDetailsReview, List<MovieCastDTO> movieCast, List<MovieKeywordsDTO> movieKeywords, List<MovieReviewsDTO> movieReviews, List<MovieDTO> movieRecommendation, List<MovieDTO> popularMovies, List<MovieDTO> topRatedMovies, List<MovieDTO> upcomingMovies) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Homepage</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-card transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-card transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-card transition duration-200\">\n                        <i class=\"fas fa-search text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n            </ul>\n\n            ");
		jteOutput.writeContent("\n            <div class=\"text-center mt-auto\">\n                <a href=\"/logout\"\n                   class=\"block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 hover:drop-shadow-card transition duration-200\">\n                    <i class=\"fas fa-sign-out-alt text-2xl\"></i>\n                </a>\n            </div>\n        </div>\n    </div>\n    <div class=\"flex-initial mt-8\" style=\"width:87.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"relative h-1/4 w-full mb-5 rounded-xl overflow-hidden shadow-card\" style=\"height:70vh;\">\n            ");
		jteOutput.writeContent("\n            <div id=\"carousel\" class=\"flex transition-transform duration-500 ease-in-out h-full\"\n                 style=\"background-image:url(https://image.tmdb.org/t/p/w1280");
		jteOutput.setContext("div", "style");
		jteOutput.writeUserContent(movieDetail.getBackdrop_path());
		jteOutput.setContext("div", null);
		jteOutput.writeContent(");\">\n                    <div class=\"relative flex bg-black/60\">\n                        <img class=\"my-auto mx-10 rounded-lg h-5/6\"\n                             src=\"https://image.tmdb.org/t/p/w500");
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
		jteOutput.writeContent(">\n                        <div class=\"transform space-y-4 p-4 h-5/6 my-auto\">\n                            <h3 class=\"text-4xl text-white font-semibold \">");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("</h3>\n                            <div class=\"flex space-x-1 flex-warp\">\n                                <p class=\"text-md text-zinc-300 py-1\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getAdultFormatted());
		jteOutput.writeContent("</p>\n                                <p class=\"text-md text-zinc-300 p-1\">• ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRelease_date());
		jteOutput.writeContent("</p>\n                                ");
		for (MovieGenresDTO genre : movieDetail.getGenres()) {
			jteOutput.writeContent("\n                                    <div class=\"p-1 rounded-full shadow-inner-lg border border-gray-200 bg-gray-100\">\n                                        <p class=\"text-zinc-700\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(genre.getName());
			jteOutput.writeContent("</p>\n                                    </div>\n                                ");
		}
		jteOutput.writeContent("\n                                <p class=\"text-md text-zinc-300 p-1\">• ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRuntimeFormatted());
		jteOutput.writeContent("</p>\n                            </div>\n                            <p class=\"text-sm text-zinc-300\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getOverview());
		jteOutput.writeContent("</p>\n                            <div class=\"flex items-center space-x-1\">\n                                ");
		for (int i = 1; i <= 5; i++) {
			jteOutput.writeContent("\n                                    ");
			if (i <= movieDetail.getVote_average() / 2) {
				jteOutput.writeContent("\n                                        <span class=\"text-yellow-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			} else {
				jteOutput.writeContent("\n                                        <span class=\"text-gray-400\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			}
			jteOutput.writeContent("\n                                ");
		}
		jteOutput.writeContent("\n                            </div>\n                            <button class=\"book-button shadow-card p-3 bg-sky-400 hover:bg-sky-500 text-white rounded-lg transition duration-300 \">Book Now!</button>\n                        </div>\n                    </div>\n            </div>\n        </div>\n        <div class=\"w-full flex space-x-5\">\n            <div class=\"flex-initial space-y-5\" style=\"width:65.1vw;\">\n                ");
		jteOutput.writeContent("\n                <div class=\"overflow-x-scroll\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Top Billed Cast</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-4\">\n                        ");
		jteOutput.writeContent("\n                        ");
		for (MovieCastDTO movie : movieCast) {
			jteOutput.writeContent("\n                            <a class=\"rounded-lg bg-gray-50 shadow-card overflow-hidden\n                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 \">\n                                <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
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
			jteOutput.writeContent(">\n                                <div class=\"p-4 space-y-2\">\n                                    <h3 class=\"text-xl text-black font-semibold\" style=\" display: -webkit-box;\n                                    -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getName());
			jteOutput.writeContent("</h3>\n                                    <p class=\"text-sm text-zinc-400\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getCharacter());
			jteOutput.writeContent("</p>\n                                </div>\n                            </a>\n                        ");
		}
		jteOutput.writeContent("\n                    </div>\n                </div>\n                <div class=\"space-y-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Movie Reviews</h3>\n                    <div class=\"p-5 flex w-full\">\n                        <div class=\"border-sky-400 border-l-4 pl-2 h-8\"></div>\n                        <img class=\"size-8 rounded-full bg-gray-500 mr-2\">\n                        <form class=\"w-full\" action=\"/movie/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(movieDetail.getId());
		jteOutput.setContext("form", null);
		jteOutput.writeContent("/feedback\" method=\"post\">\n                            <input class=\"bg-transparent border-b border-zinc-600/50 text-zinc-600 w-full focus:outline-none\" type=\"text\" id=\"review\" name=\"review\" placeholder=\"Add Review\">\n                            <div class=\"flex flex-row-reverse mt-2\">\n                                <button type=\"submit\"\n                                        class=\"bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right ml-auto\">\n                                    Comment\n                                </button>\n                                <input type=\"radio\" id=\"star5\" name=\"rating\" value=\"5\" class=\"hidden peer\">\n                                <label for=\"star5\"\n                                       class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                <input type=\"radio\" id=\"star4\" name=\"rating\" value=\"4\" class=\"hidden peer\">\n                                <label for=\"star4\"\n                                       class=\" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"3\" class=\"hidden peer\">\n                                <label for=\"star3\"\n                                       class=\" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                <input type=\"radio\" id=\"star2\" name=\"rating\" value=\"2\" class=\"hidden peer\">\n                                <label for=\"star2\"\n                                       class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                <input type=\"radio\" id=\"star1\" name=\"rating\" value=\"1\" class=\"hidden peer\">\n                                <label for=\"star1\"\n                                       class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n                            </div>\n                        </form>\n                    </div>\n                    <div class=\"transition-transform duration-500 ease-in-out max-h-96 overflow-y-scroll\n                                p-5 space-y-12\">\n                        ");
		for (MovieReviewsDTO movie : movieReviews) {
			jteOutput.writeContent("\n                            <div class=\"w-full space-y-2\">\n                                <div class=\"flex\">\n                                    <div class=\"border-sky-400 border-l-4 pl-2 h-8\"></div>\n                                    <img class=\"size-8 rounded-full bg-gray-500 mr-2\" src=\"https://image.tmdb.org/t/p/w92");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getAuthor_details().getAvatar_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\">\n                                    <h3 class=\"text-xl font-bold my-auto\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getAuthor());
			jteOutput.writeContent("</h3>\n                                </div>\n                                <div class=\"flex items-center\">\n                                    ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                        ");
				if (i <= movie.getAuthor_details().getRating() / 2) {
					jteOutput.writeContent("\n                                            <span class=\"text-yellow-400\"><i class=\"fas fa-star\"></i></span>\n                                        ");
				} else {
					jteOutput.writeContent("\n                                            <span class=\"text-gray-400\"><i class=\"fas fa-star\"></i></span>\n                                        ");
				}
				jteOutput.writeContent("\n                                    ");
			}
			jteOutput.writeContent("\n                                </div>\n                                <div class=\"overflow-y-auto max-h-full\">\n                                    <p class=\"reviews text-md text-zinc-600\" style=\"display: -webkit-box; -webkit-box-orient: vertical;\n                                    -webkit-line-clamp: 5; overflow: hidden;\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getContent());
			jteOutput.writeContent("</p>\n                                </div>\n                                <button class=\"show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white \">Show More!</button>\n                            </div>\n                        ");
		}
		jteOutput.writeContent("\n                    </div>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div id=\"recommendation\" class=\"overflow-x-scroll\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Recommended For You</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-5\">\n                        ");
		jteOutput.writeContent("\n                        ");
		for (MovieDTO movie : movieRecommendation) {
			jteOutput.writeContent("\n                            <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movie.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"  class=\"rounded-lg bg-gray-50 shadow-card overflow-hidden\n                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 \">\n                                <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
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
			jteOutput.writeContent(">\n                                <div class=\"p-4 space-y-2\">\n                                    <h3 class=\"text-xl text-black font-semibold\" style=\" display: -webkit-box;\n                            -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                                    <div class=\"flex items-center\">\n                                        ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                            ");
				if (i <= movie.getVote_average() / 2) {
					jteOutput.writeContent("\n                                                <span class=\"text-yellow-400\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				} else {
					jteOutput.writeContent("\n                                                <span class=\"text-gray-400\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				}
				jteOutput.writeContent("\n                                        ");
			}
			jteOutput.writeContent("\n                                    </div>\n                                </div>\n                            </a>\n                        ");
		}
		jteOutput.writeContent("\n                    </div>\n                </div>\n            </div>\n            ");
		jteOutput.writeContent("\n            <div class=\"flex-initial\" style=\"width:39%;\">\n                <div class=\"w-full\">\n                    <h3 class=\"text-xl sm:text-2xl lg:text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4\">\n                        Extra Details\n                    </h3>\n                    <div class=\"p-4 mt-4 w-full bg-white rounded-lg shadow-card relative overflow-hidden\">\n                        <div class=\"bg-gradient-to-r from-sky-400 to-blue-500 p-4 px-24 absolute top-0 left-0\" style=\"border-radius: 0 0 30px 0;\"></div>\n                        <div class=\"space-y-4 mt-8\">\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Status</p>\n                                <p class=\"text-zinc-700 ml-3\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getStatus());
		jteOutput.writeContent("</p>\n                            </div>\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Original Language</p>\n                                <p class=\"text-zinc-700 ml-3\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getEnglish_name());
		jteOutput.writeContent("</p>\n                            </div>\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Budget</p>\n                                <p class=\"text-zinc-700 ml-3\">$");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getBudgetFormatted());
		jteOutput.writeContent("</p>\n                            </div>\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Revenue</p>\n                                <p class=\"text-zinc-700 ml-3\">$");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRevenueFormatted());
		jteOutput.writeContent("</p>\n                            </div>\n                        </div>\n                        <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold mt-4\">Keywords</p>\n                        <div class=\"overflow-auto max-h-full\">\n                            <div class=\"ml-3 flex flex-wrap items-start\">\n                                ");
		for (MovieKeywordsDTO movie : movieKeywords) {
			jteOutput.writeContent("\n                                    <div class=\"mr-2 mt-2 p-1 shadow-inner-lg rounded-lg border border-gray-200 bg-gray-100\">\n                                        <p class=\"text-zinc-700\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getName());
			jteOutput.writeContent("</p>\n                                    </div>\n                                ");
		}
		jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n");
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
		MovieGenresDTO movieGenres = (MovieGenresDTO)params.get("movieGenres");
		MovieAuthorDetailsReviewDTO movieAuthorDetailsReview = (MovieAuthorDetailsReviewDTO)params.get("movieAuthorDetailsReview");
		List<MovieCastDTO> movieCast = (List<MovieCastDTO>)params.get("movieCast");
		List<MovieKeywordsDTO> movieKeywords = (List<MovieKeywordsDTO>)params.get("movieKeywords");
		List<MovieReviewsDTO> movieReviews = (List<MovieReviewsDTO>)params.get("movieReviews");
		List<MovieDTO> movieRecommendation = (List<MovieDTO>)params.get("movieRecommendation");
		List<MovieDTO> popularMovies = (List<MovieDTO>)params.get("popularMovies");
		List<MovieDTO> topRatedMovies = (List<MovieDTO>)params.get("topRatedMovies");
		List<MovieDTO> upcomingMovies = (List<MovieDTO>)params.get("upcomingMovies");
		render(jteOutput, jteHtmlInterceptor, WebName, movieDetail, movieGenres, movieAuthorDetailsReview, movieCast, movieKeywords, movieReviews, movieRecommendation, popularMovies, topRatedMovies, upcomingMovies);
	}
}

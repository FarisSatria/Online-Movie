package gg.jte.generated.ondemand;
import java.util.List;
import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieGenresDTO;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
public final class JtemoviepageGenerated {
	public static final String JTE_NAME = "movie-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,6,8,8,8,27,27,27,27,36,38,40,48,56,56,59,59,60,67,67,68,75,75,79,81,83,83,83,83,86,86,86,86,86,86,86,86,86,86,86,86,86,88,88,88,90,90,90,91,91,91,92,92,94,94,94,96,96,97,97,97,99,99,99,101,101,102,102,104,104,106,106,107,107,122,127,166,181,185,186,186,189,189,189,189,190,190,190,190,190,190,190,190,190,193,193,193,194,194,194,197,197,203,203,204,204,209,209,213,213,213,213,244,244,245,245,246,246,251,251,251,254,254,255,255,257,257,259,259,260,260,264,264,264,268,268,269,269,270,270,271,271,275,275,275,275,276,276,276,279,279,280,280,282,282,284,284,285,285,289,289,289,293,293,297,301,302,302,303,303,303,303,305,305,305,305,306,306,306,306,306,306,306,306,306,309,309,309,311,311,312,312,314,314,316,316,317,317,321,321,325,336,336,336,340,340,340,344,344,344,348,348,348,354,354,356,356,356,358,358,367,368,368,374,374,374,8,9,10,11,12,13,14,15,16,17,18,19,20,20,20,20};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, Boolean isLoggedIn, MovieDTO movieDetail, MovieGenresDTO movieGenres, MovieAuthorDetailsReviewDTO movieAuthorDetailsReview, List<FeedBackEntity> movieFeedbacks, List<MovieCastDTO> movieCast, List<MovieKeywordsDTO> movieKeywords, List<MovieReviewsDTO> movieReviews, List<MovieDTO> movieRecommendation, List<MovieDTO> popularMovies, List<MovieDTO> topRatedMovies, List<MovieDTO> upcomingMovies) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Homepage</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		gg.jte.generated.ondemand.include.header.JtesidebarsearchbarGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n            </ul>\n\n            ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                <div class=\"text-center mt-auto\">\n                    <a href=\"/logout\"\n                       class=\"block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200\">\n                        <i class=\"fas fa-sign-out-alt text-2xl\"></i>\n                    </a>\n                </div>\n            ");
		} else {
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                <div class=\"text-center mt-auto\">\n                    <a href=\"/login\"\n                       class=\"block text-green-500  hover:text-green-400 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200\">\n                        <i class=\"fas fa-sign-in-alt text-2xl\"></i>\n                    </a>\n                </div>\n            ");
		}
		jteOutput.writeContent("\n        </div>\n    </div>\n    <div class=\"flex-initial mt-8\" style=\"width:87.5vw;\">\n        ");
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
				jteOutput.writeContent("\n                                        <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			} else {
				jteOutput.writeContent("\n                                        <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			}
			jteOutput.writeContent("\n                                ");
		}
		jteOutput.writeContent("\n                            </div>\n                            <div class=\"flex space-x-2\">\n                                <a id=\"bookNow\" href=\"#bookingSection\" class=\"book-button shadow-card p-3 bg-yellow-400 hover:bg-yellow-500 text-white rounded-lg transition duration-300 \">Book Now!</a>\n                                <div class=\"p-3 rounded-lg shadow-inner-lg border border-gray-200 bg-gray-100 flex\">\n                                    <p class=\"text-zinc-700 font-semibold\">Quota Left: 5</p>\n                                    <p class=\"text-zinc-700 font-medium\">/50</p>\n                                </div>\n                            </div>\n                        </div>\n                    </div>\n            </div>\n        </div>\n        <div class=\"w-full flex space-x-5\">\n            <div class=\"flex-initial\" style=\"width:65.1vw;\">\n                ");
		jteOutput.writeContent("\n                <div id=\"bookingSection\" class=\"w-full hidden mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Booking Section</h3>\n                    <div class=\"main p-6 w-full space-y-4\">\n                        <div class=\"timings flex flex-col items-center w-full space-y-4\">\n                            ");
		jteOutput.writeContent("\n                            <div class=\"dates w-full flex justify-center gap-4\">\n                                <input type=\"radio\" name=\"date\" id=\"d1\" checked class=\"hidden\">\n                                <label for=\"d1\" class=\"dates-item shadow-card shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                                    <div class=\"day text-xs font-semibold\">Friday</div>\n                                    <div class=\"date text-lg font-bold\">12</div>\n                                </label>\n                                <input type=\"radio\" name=\"date\" id=\"d2\" class=\"hidden\">\n                                <label for=\"d2\" class=\"dates-item shadow-card shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                                    <div class=\"day text-xs font-semibold\">Saturday</div>\n                                    <div class=\"date text-lg font-bold\">13</div>\n                                </label>\n                                <input type=\"radio\" name=\"date\" id=\"d3\" class=\"hidden\">\n                                <label for=\"d3\" class=\"dates-item shadow-card shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                                    <div class=\"day text-xs font-semibold\">Sunday</div>\n                                    <div class=\"date text-lg font-bold\">14</div>\n                                </label>\n                                <input type=\"radio\" name=\"date\" id=\"d4\" class=\"hidden\">\n                                <label for=\"d4\" class=\"dates-item shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                                    <div class=\"day text-xs font-semibold\">Monday</div>\n                                    <div class=\"date text-lg font-bold\">15</div>\n                                </label>\n                                <input type=\"radio\" name=\"date\" id=\"d5\" class=\"hidden\">\n                                <label for=\"d5\" class=\"dates-item shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                                    <div class=\"day text-xs font-semibold\">Tuesday</div>\n                                    <div class=\"date text-lg font-bold\">16</div>\n                                </label>\n                                <input type=\"radio\" name=\"date\" id=\"d6\" class=\"hidden\">\n                                <label for=\"d6\" class=\"dates-item shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                                    <div class=\"day text-xs font-semibold\">Wednesday</div>\n                                    <div class=\"date text-lg font-bold\">17</div>\n                                </label>\n                                <input type=\"radio\" name=\"date\" id=\"d7\" class=\"hidden\">\n                                <label for=\"d7\" class=\"dates-item shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                                    <div class=\"day text-xs font-semibold\">Thursday</div>\n                                    <div class=\"date text-lg font-bold\">18</div>\n                                </label>\n                            </div>\n\n                            ");
		jteOutput.writeContent("\n                            <div class=\"times w-full flex justify-center gap-4\">\n                                <input type=\"radio\" name=\"time\" id=\"t1\" checked class=\"hidden\">\n                                <label for=\"t1\" class=\"time text-sm shadow-card w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">11:00</label>\n                                <input type=\"radio\" name=\"time\" id=\"t2\" class=\"hidden\">\n                                <label for=\"t2\" class=\"time text-sm shadow-card w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">14:30</label>\n                                <input type=\"radio\" name=\"time\" id=\"t3\" class=\"hidden\">\n                                <label for=\"t3\" class=\"time text-sm shadow-card w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">18:00</label>\n                                <input type=\"radio\" name=\"time\" id=\"t4\" class=\"hidden\">\n                                <label for=\"t4\" class=\"time text-sm shadow-card w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">21:30</label>\n                            </div>\n                            <a href=\"/movie/{id}/booking\" type=\"button\" class=\"bg-green-500 shadow-card hover:bg-green-400 text-white text-sm py-2 px-6 rounded-md transition duration-300 cursor-pointer shadow-card float-right\">Book</a>\n                        </div>\n                    </div>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div class=\"overflow-x-scroll mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Top Billed Cast</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-4\">\n                        ");
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
		jteOutput.writeContent("\n                    </div>\n                </div>\n                <div class=\"space-y-5 mb-5\">\n                    <div class=\"relative space-y-5 overflow-hidden\">\n                        <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Movie Reviews</h3>\n                        ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                        ");
		} else {
			jteOutput.writeContent("\n                            <div class=\"absolute p-2 w-full h-28  bg-gradient-to-b from-gray-400/30 to-gray-400/70\n                              shadow-md rounded-lg\">\n                                <p class=\"text-center font-bold text-white text-3xl mt-7\"><a href=\"/login\" class=\"text-green-600 hover:text-green-700 drop-shadow-md transition duration-300\">Login</a> To Submit a Review!</p>\n                            </div>\n                        ");
		}
		jteOutput.writeContent("\n                        <div class=\"p-5 flex rounded-lg\">\n                            <div class=\"border-sky-400 border-l-4 pl-2 h-8\"></div>\n                            <img class=\"size-8 rounded-full bg-gray-500 mr-2\">\n                            <form class=\"w-full\" action=\"/movie/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(movieDetail.getId());
		jteOutput.setContext("form", null);
		jteOutput.writeContent("/feedback\" method=\"post\">\n                                <input class=\"bg-transparent border-b border-zinc-600/50 text-zinc-600 w-full focus:outline-none\" type=\"text\" id=\"reviews\" name=\"reviews\" placeholder=\"Add Review\" required=\"required\">\n                                <div class=\"flex flex-row-reverse mt-2\">\n                                    <button type=\"submit\"\n                                            class=\"bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right ml-auto\">\n                                        Comment\n                                    </button>\n                                    <input type=\"radio\" id=\"star5\" name=\"rating\" value=\"10.0\" class=\"hidden peer\">\n                                    <label for=\"star5\"\n                                           class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                    <input type=\"radio\" id=\"star4\" name=\"rating\" value=\"8.0\" class=\"hidden peer\">\n                                    <label for=\"star4\"\n                                           class=\" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                    <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"6.0\" class=\"hidden peer\">\n                                    <label for=\"star3\"\n                                           class=\" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                    <input type=\"radio\" id=\"star2\" name=\"rating\" value=\"4.0\" class=\"hidden peer\">\n                                    <label for=\"star2\"\n                                           class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                    <input type=\"radio\" id=\"star1\" name=\"rating\" value=\"2.0\" class=\"hidden peer\">\n                                    <label for=\"star1\"\n                                           class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n                                </div>\n                            </form>\n                        </div>\n                        <div class=\"transition-transform duration-500 ease-in-out max-h-96 overflow-y-scroll\n                                p-5 space-y-12\">\n                            ");
		if (movieFeedbacks != null) {
			jteOutput.writeContent("\n                                ");
			for (FeedBackEntity feedbacks : movieFeedbacks) {
				jteOutput.writeContent("\n                                    ");
				if (feedbacks.getMovieId() == movieDetail.getId()) {
					jteOutput.writeContent("\n                                        <div class=\"w-full space-y-2\">\n                                            <div class=\"flex\">\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-8\"></div>\n                                                <img class=\"size-8 rounded-full bg-gray-500 mr-2\">\n                                                <h3 class=\"text-xl font-bold my-auto\">");
					jteOutput.setContext("h3", null);
					jteOutput.writeUserContent(feedbacks.getUsername());
					jteOutput.writeContent("</h3>\n                                            </div>\n                                            <div class=\"flex items-center\">\n                                                ");
					for (int i = 1; i <= 5; i++) {
						jteOutput.writeContent("\n                                                    ");
						if (i <= feedbacks.getRating() / 2) {
							jteOutput.writeContent("\n                                                        <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                                    ");
						} else {
							jteOutput.writeContent("\n                                                        <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                                    ");
						}
						jteOutput.writeContent("\n                                                ");
					}
					jteOutput.writeContent("\n                                            </div>\n                                            <div class=\"overflow-y-auto max-h-full\">\n                                                <p class=\"reviews text-md text-zinc-600\" style=\"display: -webkit-box; -webkit-box-orient: vertical;\n                                        -webkit-line-clamp: 5; overflow: hidden;\">");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(feedbacks.getReviews());
					jteOutput.writeContent("</p>\n                                            </div>\n                                            <button class=\"show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white \">Show More!</button>\n                                        </div>\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            ");
		}
		jteOutput.writeContent("\n                            ");
		for (MovieReviewsDTO movie : movieReviews) {
			jteOutput.writeContent("\n                                <div class=\"w-full space-y-2\">\n                                    <div class=\"flex\">\n                                        <div class=\"border-sky-400 border-l-4 pl-2 h-8\"></div>\n                                        <img class=\"size-8 rounded-full bg-gray-500 mr-2\" src=\"https://image.tmdb.org/t/p/w92");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getAuthor_details().getAvatar_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\">\n                                        <h3 class=\"text-xl font-bold my-auto\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getAuthor());
			jteOutput.writeContent("</h3>\n                                    </div>\n                                    <div class=\"flex items-center\">\n                                        ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                            ");
				if (i <= movie.getAuthor_details().getRating() / 2) {
					jteOutput.writeContent("\n                                                <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				} else {
					jteOutput.writeContent("\n                                                <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				}
				jteOutput.writeContent("\n                                        ");
			}
			jteOutput.writeContent("\n                                    </div>\n                                    <div class=\"overflow-y-auto max-h-full\">\n                                        <p class=\"reviews text-md text-zinc-600\" style=\"display: -webkit-box; -webkit-box-orient: vertical;\n                                    -webkit-line-clamp: 5; overflow: hidden;\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getContent());
			jteOutput.writeContent("</p>\n                                    </div>\n                                    <button class=\"show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white \">Show More!</button>\n                                </div>\n                            ");
		}
		jteOutput.writeContent("\n                        </div>\n                    </div>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div id=\"recommendation\" class=\"overflow-x-scroll mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Recommended For You</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-5\">\n                        ");
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
					jteOutput.writeContent("\n                                                <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				} else {
					jteOutput.writeContent("\n                                                <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
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
		jteOutput.writeContent("\n<script src=\"/asset/js/AJAX-handler.js\"></script>\n<script src=\"/asset/js/navbar.js\"></script>\n<script src=\"/asset/js/carousel.js\"></script>\n<script src=\"/asset/js/booking.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		Boolean isLoggedIn = (Boolean)params.get("isLoggedIn");
		MovieDTO movieDetail = (MovieDTO)params.get("movieDetail");
		MovieGenresDTO movieGenres = (MovieGenresDTO)params.get("movieGenres");
		MovieAuthorDetailsReviewDTO movieAuthorDetailsReview = (MovieAuthorDetailsReviewDTO)params.get("movieAuthorDetailsReview");
		List<FeedBackEntity> movieFeedbacks = (List<FeedBackEntity>)params.get("movieFeedbacks");
		List<MovieCastDTO> movieCast = (List<MovieCastDTO>)params.get("movieCast");
		List<MovieKeywordsDTO> movieKeywords = (List<MovieKeywordsDTO>)params.get("movieKeywords");
		List<MovieReviewsDTO> movieReviews = (List<MovieReviewsDTO>)params.get("movieReviews");
		List<MovieDTO> movieRecommendation = (List<MovieDTO>)params.get("movieRecommendation");
		List<MovieDTO> popularMovies = (List<MovieDTO>)params.get("popularMovies");
		List<MovieDTO> topRatedMovies = (List<MovieDTO>)params.get("topRatedMovies");
		List<MovieDTO> upcomingMovies = (List<MovieDTO>)params.get("upcomingMovies");
		render(jteOutput, jteHtmlInterceptor, WebName, isLoggedIn, movieDetail, movieGenres, movieAuthorDetailsReview, movieFeedbacks, movieCast, movieKeywords, movieReviews, movieRecommendation, popularMovies, topRatedMovies, upcomingMovies);
	}
}

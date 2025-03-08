package gg.jte.generated.ondemand;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieGenresDTO;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.entity.model.MovieBookingEntity;
import com.movieonline.Online.Movie.entity.model.UserEntity;
public final class JtemoviepageGenerated {
	public static final String JTE_NAME = "movie-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,6,7,8,9,10,11,13,13,13,40,40,40,40,40,40,40,43,46,49,55,57,59,67,75,85,85,86,88,88,93,93,96,96,97,97,98,98,100,100,100,100,101,101,103,103,104,104,105,105,117,117,118,125,125,129,131,133,133,133,133,136,136,136,136,136,136,136,136,136,136,136,136,136,138,138,138,140,140,140,141,141,141,142,142,144,144,144,146,146,147,147,147,149,149,149,151,151,152,152,154,154,156,156,157,157,160,162,162,162,163,163,163,163,164,164,166,167,168,169,177,179,179,179,181,181,182,182,189,189,196,196,197,197,205,205,210,210,210,210,210,210,210,210,210,210,210,210,210,212,216,220,224,235,245,249,250,250,253,253,253,253,254,254,254,254,254,254,254,254,254,257,257,257,258,258,258,261,261,267,267,268,268,270,270,271,271,272,272,275,275,275,275,276,276,279,279,280,280,281,281,282,282,282,282,284,284,284,286,286,287,287,288,288,288,288,288,288,288,288,288,288,288,288,288,289,289,289,289,291,291,292,292,292,292,292,292,292,292,292,292,292,292,292,293,293,293,293,295,295,296,296,306,306,308,308,309,309,310,310,313,313,313,313,314,314,317,317,318,318,319,319,320,321,321,321,321,322,322,325,325,326,326,337,337,337,337,338,338,341,341,345,346,346,350,350,351,351,352,352,354,354,354,354,355,355,357,357,358,358,359,359,360,360,360,365,365,365,365,371,371,372,372,374,374,376,376,377,377,379,379,381,381,384,384,384,387,387,389,389,390,390,391,391,392,392,393,393,395,395,399,399,400,400,401,401,403,403,403,403,404,404,406,406,407,407,408,408,409,409,409,412,412,413,413,415,415,417,417,418,418,420,420,422,422,425,425,425,428,428,430,430,431,431,432,432,433,433,434,434,438,438,440,440,440,440,441,441,443,443,444,444,444,447,447,448,448,450,450,452,452,453,453,457,457,457,461,461,465,469,470,470,471,471,471,471,473,473,473,473,474,474,474,474,474,474,474,474,474,477,477,477,479,479,480,480,482,482,484,484,485,485,489,489,493,504,504,504,508,508,508,512,512,512,516,516,516,522,522,524,524,524,526,526,536,536,540,540,540,543,543,545,545,549,549,549,552,552,554,555,555,556,557,557,558,566,566,566,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,33,33,33};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, String getUsername, String movieHasBeenBooked, String movieBookingConflict, Boolean isLoggedIn, UserEntity getCurrentUser, Optional<FeedBackEntity> matchingFeedback, MovieDTO movieDetail, MovieGenresDTO movieGenres, MovieAuthorDetailsReviewDTO movieAuthorDetailsReview, MovieBookingEntity getPlayButton, List<MovieBookingEntity> getMovieBooking, List<UserEntity> userList, List<FeedBackEntity> movieFeedbacks, List<MovieCastDTO> movieCast, List<MovieKeywordsDTO> movieKeywords, List<MovieReviewsDTO> movieReviews, List<MovieDTO> movieRecommendation, List<MovieDTO> popularMovies, List<MovieDTO> topRatedMovies, List<MovieDTO> upcomingMovies) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\" class=\"scroll-smooth\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | ");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li class=\"relative\">\n                    <a href=\"/movies/search\" id=\"searchIcon\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md\">\n                        <i id=\"searchIconSymbol\" class=\"fas fa-search text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n            </ul>\n\n            ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                <div class=\"text-center w-full mt-auto relative\">\n                    ");
			if (getCurrentUser != null || getCurrentUser.getIsAdmin() == true) {
				jteOutput.writeContent("\n                        <a href=\"/dashboard\"\n                           class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200 \">\n                            <i class=\"fas fa-desktop text-2xl\"></i>\n                        </a>\n                    ");
			}
			jteOutput.writeContent("\n                    <div class=\"w-full h-px bg-black opacity-20 mb-1\"></div>\n                    <button id=\"userButton\" class=\"block size-8 drop-shadow-lg rounded-full focus:outline-none\">\n                        ");
			for (UserEntity user : userList) {
				jteOutput.writeContent("\n                            ");
				if (user.getUsername().equals(getUsername)) {
					jteOutput.writeContent("\n                                ");
					if (user.getProfilePicturePath() != null) {
						jteOutput.writeContent("\n                                    <img rel=\"icon\" class=\"rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl hover:scale-110 transition duration-200\"\n                                         src=\"/image/");
						jteOutput.setContext("img", "src");
						jteOutput.writeUserContent(user.getId());
						jteOutput.setContext("img", null);
						jteOutput.writeContent("\">\n                                ");
					} else {
						jteOutput.writeContent("\n                                    <img rel=\"icon\" class=\"rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl transition hover:scale-110 duration-200\" src=\"/image/icon/user-icon.png\">\n                                ");
					}
					jteOutput.writeContent("\n                            ");
				}
				jteOutput.writeContent("\n                        ");
			}
			jteOutput.writeContent("\n                    </button>\n\n                    <div id=\"userPanel\" class=\"absolute w-40 -left-1 -top-28 text-left bg-gray-50 rounded-lg shadow-md border border-gray-300 hidden\">\n                        <a href=\"/booking\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 rounded-t-lg cursor-pointer transition duration-300\">Booking</a>\n                        <a href=\"/account\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300\">Account</a>\n                        <div class=\"group\">\n                            <a id=\"openModal\" class=\"block px-4 py-2 text-zinc-700 group-hover:bg-red-600 group-hover:text-white border-t border-t-gray-300 cursor-pointer rounded-b-lg transition duration-300\">Logout</a>\n                            <div class=\"absolute group-hover:border-t-red-600 left-2 -bottom-4 w-0 h-0 border-l-[13px] border-r-[13px] border-l-transparent border-r-transparent border-t-[16px] border-t-gray-50 drop-shadow-md transition duration-300\"></div>\n                        </div>\n                    </div>\n                </div>\n            ");
		} else {
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                <div class=\"text-center mt-auto\">\n                    <a href=\"/login\"\n                       class=\"block text-green-500  hover:text-green-400 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200\">\n                        <i class=\"fas fa-sign-in-alt text-2xl\"></i>\n                    </a>\n                </div>\n            ");
		}
		jteOutput.writeContent("\n        </div>\n    </div>\n    <div class=\"flex-initial mt-8\" style=\"width:87.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"relative w-full mb-5 rounded-xl overflow-hidden shadow-card\" style=\"height:70vh;\">\n            ");
		jteOutput.writeContent("\n            <div id=\"carousel\" class=\"flex transition-transform duration-500 ease-in-out h-full\"\n                 style=\"background-image:url(https://image.tmdb.org/t/p/w1280");
		jteOutput.setContext("div", "style");
		jteOutput.writeUserContent(movieDetail.getBackdrop_path());
		jteOutput.setContext("div", null);
		jteOutput.writeContent(");\">\n                <div class=\"relative flex bg-black/60\">\n                    <img class=\"my-auto mx-10 rounded-lg h-5/6\"\n                         src=\"https://image.tmdb.org/t/p/w500");
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
		jteOutput.writeContent(">\n                    <div class=\"transform space-y-4 p-4 h-5/6 my-auto\">\n                        <h3 class=\"text-4xl text-white font-semibold \">");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("</h3>\n                        <div class=\"flex space-x-1 flex-warp\">\n                            <p class=\"text-md text-zinc-300 py-1\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getAdultFormatted());
		jteOutput.writeContent("</p>\n                            <p class=\"text-md text-zinc-300 p-1\">• ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRelease_date());
		jteOutput.writeContent("</p>\n                            ");
		for (MovieGenresDTO genre : movieDetail.getGenres()) {
			jteOutput.writeContent("\n                                <div class=\"p-1 rounded-full shadow-inner-lg border border-gray-200 bg-gray-100\">\n                                    <p class=\"text-zinc-700\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(genre.getName());
			jteOutput.writeContent("</p>\n                                </div>\n                            ");
		}
		jteOutput.writeContent("\n                            <p class=\"text-md text-zinc-300 p-1\">• ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRuntimeFormatted());
		jteOutput.writeContent("</p>\n                        </div>\n                        <p class=\"text-sm text-zinc-300\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getOverview());
		jteOutput.writeContent("</p>\n                        <div class=\"flex items-center space-x-1\">\n                            ");
		for (int i = 1; i <= 5; i++) {
			jteOutput.writeContent("\n                                ");
			if (i <= movieDetail.getVote_average() / 2) {
				jteOutput.writeContent("\n                                    <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                ");
			} else {
				jteOutput.writeContent("\n                                    <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                ");
			}
			jteOutput.writeContent("\n                            ");
		}
		jteOutput.writeContent("\n                        </div>\n                        <div class=\"flex space-x-2\">\n                            ");
		if (getPlayButton != null && getPlayButton.getDate().equals(LocalDate.now()) &&
                                        LocalTime.now().isAfter(getPlayButton.getTimeSlot().minusSeconds(1)) &&
                                        LocalTime.now().isBefore(getPlayButton.getTimeSlot().plusMinutes(20))) {
			jteOutput.writeContent("\n                                <a href=\"/movie/play/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movieDetail.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\" class=\"shadow-card p-3 bg-sky-500 hover:bg-sky-400 text-white rounded-lg transition duration-300\">Play Now!</a>\n                            ");
		}
		jteOutput.writeContent("\n                            <a id=\"bookNow\" href=\"#scrollToBehaviour\" class=\"book-button shadow-card p-3 bg-yellow-500 hover:bg-yellow-400 text-white rounded-lg transition duration-300 \">Book Now!</a>\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n                        </div>\n                    </div>\n                </div>\n            </div>\n        </div>\n        <div class=\"w-full flex space-x-5\">\n            <div class=\"flex-initial\" style=\"width:65.1vw;\">\n                ");
		jteOutput.writeContent("\n                <div id=\"scrollToBehaviour\" class=\"w-full hidden mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Booking ");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("!</h3>\n                    <div class=\"w-full relative p-5 space-y-4\">\n                        ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                            ");
			if (getMovieBooking.isEmpty()) {
				jteOutput.writeContent("\n                                <a class=\"absolute p-2 top-4 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/40 to-gray-400/60\n                                      shadow-md rounded-lg z-10 justify-center items-center font-bold text-3xl flex space-x-2\">\n                                    <p class=\"text-white\">This movie </p>\n                                    <p class=\"text-red-600 drop-shadow-md transition\"> cannot </p>\n                                    <p class=\"text-white\">be booked!</p>\n                                </a>\n                            ");
			} else if (getPlayButton != null) {
				jteOutput.writeContent("\n                                <a class=\"absolute p-2 top-4 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/40 to-gray-400/60\n                                      shadow-md rounded-lg z-10 justify-center items-center font-bold text-3xl flex space-x-2\">\n                                    <p class=\"text-white\">You have  </p>\n                                    <p class=\"text-green-600 drop-shadow-md\"> booked </p>\n                                    <p class=\"text-white\">this movie!</p>\n                                </a>\n                            ");
			}
			jteOutput.writeContent("\n                        ");
		} else {
			jteOutput.writeContent("\n                            <a href=\"/login\" class=\"absolute p-2 top-4 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/40 to-gray-400/60\n                                      shadow-md hover:shadow-xl rounded-lg z-10 justify-center items-center font-bold text-3xl flex space-x-2 transition duration-300\">\n                                <p class=\"text-green-600 hover:text-green-700 drop-shadow-md transition duration-300\">Login </p>\n                                <p class=\"text-white\"> To Book This Movie!</p>\n\n                                <p class=\"text-white flex drop-shadow-md text-base font-semibold bottom-1 right-2 absolute\">Click it to Login!</p>\n                            </a>\n                        ");
		}
		jteOutput.writeContent("\n                        <div class=\"flex\">\n                            <div class=\"border-sky-400 border-l-4 pl-2 h-6\"></div>\n                            <h2 class=\"text-xl font-bold text-zinc-700\">Pick a Date and Time</h2>\n                        </div>\n                        <form id=\"booking-form\" action=\"/movie/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(movieDetail.getId());
		jteOutput.setContext("form", null);
		jteOutput.writeContent("/booking\" method=\"post\"");
		var __jte_html_attribute_1 = movieDetail.getId();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" data-movie-id=\"");
			jteOutput.setContext("form", "data-movie-id");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("form", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\n                            <div class=\"grid grid-cols-2 gap-4\">\n                                ");
		jteOutput.writeContent("\n                                <div class=\"space-y-2\">\n                                    <label for=\"custom-date\" class=\"block font-medium text-zinc-700\">Date</label>\n                                    <select id=\"custom-date\" name=\"custom-date\" class=\"w-full px-3 py-2 border rounded-md focus:ring-blue-500 focus:border-blue-500 shadow-inner-lg\">\n                                        ");
		jteOutput.writeContent("\n                                    </select>\n                                </div>\n\n                                ");
		jteOutput.writeContent("\n                                <div class=\"space-y-2\">\n                                    <label for=\"custom-time\" class=\"block font-medium text-gray-700\">Time</label>\n                                    <select id=\"custom-time\" name=\"custom-time\" class=\"w-full px-3 py-2 border rounded-md focus:ring-blue-500 focus:border-blue-500 shadow-inner-lg\">\n                                        ");
		jteOutput.writeContent("\n                                    </select>\n                                </div>\n                            </div>\n\n                            <div class=\"flex mt-2\">\n                                <div class=\"py-3 px-4 shadow-inner-lg rounded-full border border-gray-200 bg-gray-100 flex\">\n                                    <p id=\"quota-display\" class=\"text-zinc-700 text-center\">0</p>\n                                    <p class=\"text-zinc-700 text-center font-semibold\">/50 Quota Left</p>\n                                </div>\n\n                                ");
		jteOutput.writeContent("\n                                <button type=\"submit\" class=\"bg-green-500 ml-auto hover:bg-green-600 transition duration-300 rounded-full p-3 shadow-card text-white\">\n                                    Book Now\n                                </button>\n                            </div>\n                        </form>\n\n\n                    </div>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div class=\"overflow-x-scroll mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Top Billed Cast</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-4\">\n                        ");
		jteOutput.writeContent("\n                        ");
		for (MovieCastDTO movie : movieCast) {
			jteOutput.writeContent("\n                            <a class=\"rounded-lg bg-gray-50 shadow-card overflow-hidden\n                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 \">\n                                <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getProfile_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"\n                                    ");
			var __jte_html_attribute_2 = movie.getName();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_2);
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
		jteOutput.writeContent("\n                    </div>\n                </div>\n                <div class=\"space-y-5 mb-5\">\n                    <div class=\"space-y-5 overflow-hidden\">\n                        <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Movie Reviews</h3>\n                        ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                            ");
			if (matchingFeedback.isPresent()) {
				jteOutput.writeContent("\n                                <div id=\"userFeedbackInput\"  class=\"hidden p-5 relative flex rounded-lg\">\n                                    ");
				for (UserEntity user : userList) {
					jteOutput.writeContent("\n                                        ");
					if (user.getUsername().equals(getUsername)) {
						jteOutput.writeContent("\n                                            ");
						if (user.getProfilePicturePath() != null) {
							jteOutput.writeContent("\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                     src=\"/image/");
							jteOutput.setContext("img", "src");
							jteOutput.writeUserContent(user.getId());
							jteOutput.setContext("img", null);
							jteOutput.writeContent("\">\n                                            ");
						} else {
							jteOutput.writeContent("\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                            ");
						}
						jteOutput.writeContent("\n                                        ");
					}
					jteOutput.writeContent("\n                                    ");
				}
				jteOutput.writeContent("\n                                    <form class=\"w-full\" action=\"/movie/");
				jteOutput.setContext("form", "action");
				jteOutput.writeUserContent(movieDetail.getId());
				jteOutput.setContext("form", null);
				jteOutput.writeContent("/feedback\" method=\"post\">\n                                        <input type=\"hidden\" name=\"_method\" value=\"PUT\">\n                                        <textarea class=\"resize-none min-h-8 h-8 max-h-28 bg-transparent border-b border-zinc-600/50 text-zinc-600 w-full focus:outline-none\" id=\"reviews\" name=\"reviews\" placeholder=\"Add Review...\">");
				jteOutput.setContext("textarea", null);
				jteOutput.writeUserContent(matchingFeedback.get().getReviews());
				jteOutput.writeContent("</textarea>\n                                        <div class=\"flex flex-row-reverse float-left mt-2\">\n                                            ");
				for (int i = 5; i >= 1; i--) {
					jteOutput.writeContent("\n                                                ");
					if (i <= matchingFeedback.get().getRating() / 2) {
						jteOutput.writeContent("\n                                                    <input type=\"radio\" id=\"star");
						jteOutput.setContext("input", "id");
						jteOutput.writeUserContent(i);
						jteOutput.setContext("input", null);
						jteOutput.writeContent("\" name=\"rating\"");
						var __jte_html_attribute_3 = i * 2;
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_3);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" class=\"hidden peer\">\n                                                    <label for=\"star");
						jteOutput.setContext("label", "for");
						jteOutput.writeUserContent(i);
						jteOutput.setContext("label", null);
						jteOutput.writeContent("\"\n                                                           class=\"cursor-pointer text-yellow-400 peer-checked:text-orange-400 hover:text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></label>\n                                                ");
					} else {
						jteOutput.writeContent("\n                                                    <input type=\"radio\" id=\"star");
						jteOutput.setContext("input", "id");
						jteOutput.writeUserContent(i);
						jteOutput.setContext("input", null);
						jteOutput.writeContent("\" name=\"rating\"");
						var __jte_html_attribute_4 = 2 * i;
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_4);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" class=\"hidden peer\">\n                                                    <label for=\"star");
						jteOutput.setContext("label", "for");
						jteOutput.writeUserContent(i);
						jteOutput.setContext("label", null);
						jteOutput.writeContent("\"\n                                                           class=\"cursor-pointer text-gray-400 peer-checked:text-orange-400 hover:text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></label>\n                                                ");
					}
					jteOutput.writeContent("\n                                            ");
				}
				jteOutput.writeContent("\n                                        </div>\n                                        <button type=\"button\" id=\"cancelFeedbackButton\" class=\"self-start bg-gray-500 hover:bg-gray-600 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right mt-2 ml-auto\">\n                                            Cancel\n                                        </button>\n                                        <button type=\"submit\" class=\"self-start mr-2 bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right mt-2 ml-auto\">\n                                            Update\n                                        </button>\n                                    </form>\n                                </div>\n                            ");
			} else {
				jteOutput.writeContent("\n                                <div class=\"p-5 relative flex rounded-lg\">\n                                    ");
				for (UserEntity user : userList) {
					jteOutput.writeContent("\n                                        ");
					if (user.getUsername().equals(getUsername)) {
						jteOutput.writeContent("\n                                            ");
						if (user.getProfilePicturePath() != null) {
							jteOutput.writeContent("\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                     src=\"/image/");
							jteOutput.setContext("img", "src");
							jteOutput.writeUserContent(user.getId());
							jteOutput.setContext("img", null);
							jteOutput.writeContent("\">\n                                            ");
						} else {
							jteOutput.writeContent("\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                            ");
						}
						jteOutput.writeContent("\n                                        ");
					}
					jteOutput.writeContent("\n                                    ");
				}
				jteOutput.writeContent("\n                                    ");
				jteOutput.writeContent("\n                                    <form class=\"w-full\" action=\"/movie/");
				jteOutput.setContext("form", "action");
				jteOutput.writeUserContent(movieDetail.getId());
				jteOutput.setContext("form", null);
				jteOutput.writeContent("/feedback\" method=\"post\">\n                                        ");
				gg.jte.generated.ondemand.include.miscellaneous.JteratingradioinputGenerated.render(jteOutput, jteHtmlInterceptor);
				jteOutput.writeContent("\n                                    </form>\n                                </div>\n                            ");
			}
			jteOutput.writeContent("\n                        ");
		} else {
			jteOutput.writeContent("\n                            <div class=\"p-5 relative flex rounded-lg\">\n                                <a href=\"/login\" class=\"absolute p-2 top-0 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/30 to-gray-400/70\n                                      shadow-md hover:shadow-xl rounded-lg z-10 justify-center items-center font-bold text-3xl flex space-x-2 transition duration-300\">\n                                    <p class=\"text-green-600 hover:text-green-700 drop-shadow-md transition duration-300\">Login </p>\n                                    <p class=\"text-white\"> To Submit a Review!</p>\n\n                                    <p class=\"text-white drop-shadow-md text-base font-semibold bottom-1 right-2 absolute\">Click it to Login!</p>\n                                </a>\n                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                <form class=\"w-full\" action=\"/movie/");
			jteOutput.setContext("form", "action");
			jteOutput.writeUserContent(movieDetail.getId());
			jteOutput.setContext("form", null);
			jteOutput.writeContent("/feedback\" method=\"post\">\n                                    ");
			gg.jte.generated.ondemand.include.miscellaneous.JteratingradioinputGenerated.render(jteOutput, jteHtmlInterceptor);
			jteOutput.writeContent("\n                                </form>\n                            </div>\n                        ");
		}
		jteOutput.writeContent("\n\n                        <div class=\"transition-transform duration-500 ease-in-out max-h-96 overflow-y-scroll\n                                px-5 pb-4 space-y-12\">\n                            ");
		jteOutput.writeContent("\n                            ");
		if (matchingFeedback.isPresent()) {
			jteOutput.writeContent("\n                                <div id=\"currentUserFeedback\" class=\"w-full space-y-2\">\n                                    <div class=\"flex\">\n                                        <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                        ");
			for (UserEntity user : userList) {
				jteOutput.writeContent("\n                                            ");
				if (user.getUsername().equals(matchingFeedback.get().getUsername())) {
					jteOutput.writeContent("\n                                                ");
					if (user.getProfilePicturePath() != null) {
						jteOutput.writeContent("\n                                                    <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                         src=\"/image/");
						jteOutput.setContext("img", "src");
						jteOutput.writeUserContent(user.getId());
						jteOutput.setContext("img", null);
						jteOutput.writeContent("\">\n                                                ");
					} else {
						jteOutput.writeContent("\n                                                    <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                                ");
					}
					jteOutput.writeContent("\n                                            ");
				}
				jteOutput.writeContent("\n                                        ");
			}
			jteOutput.writeContent("\n                                        <h3 class=\"text-xl font-bold my-auto\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(matchingFeedback.get().getUsername());
			jteOutput.writeContent("</h3>\n                                        <div class=\"flex ml-auto\">\n                                            <button id=\"updateFeedbackButton\" class=\"self-start mr-2 bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right\">\n                                                Update\n                                            </button>\n                                            <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movieDetail.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("/feedback/delete\" class=\"self-start bg-red-600 hover:bg-red-700 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right\">\n                                                Delete\n                                            </a>\n                                        </div>\n                                    </div>\n                                    <div class=\"flex items-center\">\n                                        ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                            ");
				if (i <= matchingFeedback.get().getRating() / 2) {
					jteOutput.writeContent("\n                                                <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				} else {
					jteOutput.writeContent("\n                                                <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				}
				jteOutput.writeContent("\n                                        ");
			}
			jteOutput.writeContent("\n                                    </div>\n                                    ");
			if (matchingFeedback.get().getReviews().isBlank() || matchingFeedback.get().getReviews().isEmpty()) {
				jteOutput.writeContent("\n\n                                    ");
			} else {
				jteOutput.writeContent("\n                                        <div class=\"overflow-y-auto max-h-full\">\n                                            <p class=\"reviews text-md text-zinc-600\" style=\"display: -webkit-box; -webkit-box-orient: vertical;\n                                                                -webkit-line-clamp: 5; overflow: hidden;\">");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(matchingFeedback.get().getReviews());
				jteOutput.writeContent("</p>\n                                        </div>\n                                        <button class=\"show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white\">Show More!</button>\n                                    ");
			}
			jteOutput.writeContent("\n                                </div>\n                            ");
		}
		jteOutput.writeContent("\n                            ");
		if (movieFeedbacks != null) {
			jteOutput.writeContent("\n                                ");
			for (FeedBackEntity feedbacks : movieFeedbacks) {
				jteOutput.writeContent("\n                                    ");
				if (feedbacks.getMovieId() == movieDetail.getId()) {
					jteOutput.writeContent("\n                                        ");
					if (feedbacks.getIsDeleted() == true || matchingFeedback.isPresent()) {
						jteOutput.writeContent("\n\n                                        ");
					} else {
						jteOutput.writeContent("\n                                            <div class=\"w-full space-y-2\">\n                                                <div class=\"flex\">\n                                                    <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                    ");
						for (UserEntity user : userList) {
							jteOutput.writeContent("\n                                                        ");
							if (user.getUsername().equals(feedbacks.getUsername())) {
								jteOutput.writeContent("\n                                                            ");
								if (user.getProfilePicturePath() != null) {
									jteOutput.writeContent("\n                                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                                     src=\"/image/");
									jteOutput.setContext("img", "src");
									jteOutput.writeUserContent(user.getId());
									jteOutput.setContext("img", null);
									jteOutput.writeContent("\">\n                                                            ");
								} else {
									jteOutput.writeContent("\n                                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                                            ");
								}
								jteOutput.writeContent("\n                                                        ");
							}
							jteOutput.writeContent("\n                                                    ");
						}
						jteOutput.writeContent("\n                                                    <h3 class=\"text-xl font-bold my-auto\">");
						jteOutput.setContext("h3", null);
						jteOutput.writeUserContent(feedbacks.getUsername());
						jteOutput.writeContent("</h3>\n                                                </div>\n                                                <div class=\"flex items-center\">\n                                                    ");
						for (int i = 1; i <= 5; i++) {
							jteOutput.writeContent("\n                                                        ");
							if (i <= feedbacks.getRating() / 2) {
								jteOutput.writeContent("\n                                                            <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                                        ");
							} else {
								jteOutput.writeContent("\n                                                            <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                                        ");
							}
							jteOutput.writeContent("\n                                                    ");
						}
						jteOutput.writeContent("\n                                                </div>\n                                                ");
						if (feedbacks.getReviews().isBlank() || feedbacks.getReviews().isEmpty()) {
							jteOutput.writeContent("\n\n                                                ");
						} else {
							jteOutput.writeContent("\n                                                    <div class=\"overflow-y-auto max-h-full\">\n                                                        <p class=\"reviews text-md text-zinc-600\" style=\"display: -webkit-box; -webkit-box-orient: vertical;\n                                                            -webkit-line-clamp: 5; overflow: hidden;\">");
							jteOutput.setContext("p", null);
							jteOutput.writeUserContent(feedbacks.getReviews());
							jteOutput.writeContent("</p>\n                                                    </div>\n                                                    <button class=\"show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white \">Show More!</button>\n                                                ");
						}
						jteOutput.writeContent("\n                                            </div>\n                                        ");
					}
					jteOutput.writeContent("\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            ");
		}
		jteOutput.writeContent("\n                            ");
		for (MovieReviewsDTO movie : movieReviews) {
			jteOutput.writeContent("\n                                <div class=\"w-full space-y-2\">\n                                    <div class=\"flex\">\n                                        <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                        ");
			if (movie.getAuthor_details().getAvatar_path() != null) {
				jteOutput.writeContent("\n                                            <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                 src=\"https://image.tmdb.org/t/p/w92");
				jteOutput.setContext("img", "src");
				jteOutput.writeUserContent(movie.getAuthor_details().getAvatar_path());
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\">\n                                        ");
			} else {
				jteOutput.writeContent("\n                                            <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                        ");
			}
			jteOutput.writeContent("\n                                        <h3 class=\"text-xl font-bold my-auto\">");
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
			var __jte_html_attribute_5 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_5);
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
		jteOutput.writeContent("\n            <div class=\"flex-initial space-y-5\" style=\"width:39%;\">\n                <div class=\"w-full\">\n                    <h3 class=\"text-xl sm:text-2xl lg:text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4\">\n                        Extra Details\n                    </h3>\n                    <div class=\"p-4 mt-4 w-full bg-gray-50 rounded-lg shadow-card relative overflow-hidden\">\n                        <div class=\"bg-gradient-to-r from-sky-400 to-blue-500 p-4 px-24 absolute top-0 left-0\" style=\"border-radius: 0 0 30px 0;\"></div>\n                        <div class=\"space-y-4 mt-8\">\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Status</p>\n                                <p class=\"text-zinc-700 ml-3\">");
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
		jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n\n");
		if (movieHasBeenBooked != null) {
			jteOutput.writeContent("\n    <div id=\"success-message-booking-valid\" class=\"drop-shadow-md absolute top-5 left-[39vw]\">\n        <div class=\"bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center\">Success!</div>\n        <div class=\"bg-white p-5 rounded-br-lg rounded-bl-lg\">\n            <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movieHasBeenBooked);
			jteOutput.writeContent("</p>\n        </div>\n    </div>\n");
		}
		jteOutput.writeContent("\n\n");
		if (movieBookingConflict != null) {
			jteOutput.writeContent("\n    <div id=\"error-message\" class=\"drop-shadow-md fixed top-5 left-[39vw]\">\n        <div class=\"bg-red-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center\">Warning!</div>\n        <div class=\"bg-white p-5 rounded-br-lg rounded-bl-lg\">\n            <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movieBookingConflict);
			jteOutput.writeContent("</p>\n        </div>\n    </div>\n");
		}
		jteOutput.writeContent("\n\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.footer.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.modal.JtelogoutmodalGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n<script src=\"/asset/js/feedback.js\"></script>\n<script src=\"/asset/js/error-message.js\"></script>\n<script src=\"/asset/js/navbar.js\"></script>\n<script src=\"/asset/js/modal.js\"></script>\n<script src=\"/asset/js/carousel.js\"></script>\n<script src=\"/asset/js/booking.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		String getUsername = (String)params.get("getUsername");
		String movieHasBeenBooked = (String)params.get("movieHasBeenBooked");
		String movieBookingConflict = (String)params.get("movieBookingConflict");
		Boolean isLoggedIn = (Boolean)params.get("isLoggedIn");
		UserEntity getCurrentUser = (UserEntity)params.get("getCurrentUser");
		Optional<FeedBackEntity> matchingFeedback = (Optional<FeedBackEntity>)params.get("matchingFeedback");
		MovieDTO movieDetail = (MovieDTO)params.get("movieDetail");
		MovieGenresDTO movieGenres = (MovieGenresDTO)params.get("movieGenres");
		MovieAuthorDetailsReviewDTO movieAuthorDetailsReview = (MovieAuthorDetailsReviewDTO)params.get("movieAuthorDetailsReview");
		MovieBookingEntity getPlayButton = (MovieBookingEntity)params.get("getPlayButton");
		List<MovieBookingEntity> getMovieBooking = (List<MovieBookingEntity>)params.get("getMovieBooking");
		List<UserEntity> userList = (List<UserEntity>)params.get("userList");
		List<FeedBackEntity> movieFeedbacks = (List<FeedBackEntity>)params.get("movieFeedbacks");
		List<MovieCastDTO> movieCast = (List<MovieCastDTO>)params.get("movieCast");
		List<MovieKeywordsDTO> movieKeywords = (List<MovieKeywordsDTO>)params.get("movieKeywords");
		List<MovieReviewsDTO> movieReviews = (List<MovieReviewsDTO>)params.get("movieReviews");
		List<MovieDTO> movieRecommendation = (List<MovieDTO>)params.get("movieRecommendation");
		List<MovieDTO> popularMovies = (List<MovieDTO>)params.get("popularMovies");
		List<MovieDTO> topRatedMovies = (List<MovieDTO>)params.get("topRatedMovies");
		List<MovieDTO> upcomingMovies = (List<MovieDTO>)params.get("upcomingMovies");
		render(jteOutput, jteHtmlInterceptor, WebName, getUsername, movieHasBeenBooked, movieBookingConflict, isLoggedIn, getCurrentUser, matchingFeedback, movieDetail, movieGenres, movieAuthorDetailsReview, getPlayButton, getMovieBooking, userList, movieFeedbacks, movieCast, movieKeywords, movieReviews, movieRecommendation, popularMovies, topRatedMovies, upcomingMovies);
	}
}

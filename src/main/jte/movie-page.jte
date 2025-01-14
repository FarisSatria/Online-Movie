@import java.util.List
@import java.util.Optional
@import com.movieonline.Online.Movie.entity.dto.*
@import com.movieonline.Online.Movie.entity.dto.MovieDTO
@import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO
@import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO
@import com.movieonline.Online.Movie.entity.dto.MovieGenresDTO
@import com.movieonline.Online.Movie.entity.model.FeedBackEntity
@import com.movieonline.Online.Movie.entity.model.UserEntity

@param String WebName
@param String getUsername
@param Boolean isLoggedIn
@param Optional<FeedBackEntity> matchingFeedback
@param MovieDTO movieDetail
@param MovieGenresDTO movieGenres
@param MovieAuthorDetailsReviewDTO movieAuthorDetailsReview
@param List<UserEntity> userList
@param List<FeedBackEntity> movieFeedbacks
@param List<MovieCastDTO> movieCast
@param List<MovieKeywordsDTO> movieKeywords
@param List<MovieReviewsDTO> movieReviews
@param List<MovieDTO> movieRecommendation
@param List<MovieDTO> popularMovies
@param List<MovieDTO> topRatedMovies
@param List<MovieDTO> upcomingMovies

<!DOCTYPE html>
<html lang="en" class="scroll-smooth">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | ${movieDetail.getTitle()}</title>
    <link rel="icon" href="/image/favicon/eudaemonia.png">

    <!-- Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- Custom Styles -->
    <link rel="stylesheet" href="/asset/css/style.css">
</head>
<body class="bg-gray-100 font-avenir min-h-screen">
<div class="flex">
    <div class="flex-initial" style="width:9.5vw;">
        <!-- Floating Sidebar -->
        <div class="fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20">
            <!-- Top Icons -->
            <ul class="space-y-6 text-center">
                <!-- Icon 1 -->
                <li>
                    <a href="/"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-home text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="#"
                       class="block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-film text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 3 -->
                <li class="relative">
                    <a href="/movies/search" id="searchIcon"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md">
                        <i id="searchIconSymbol" class="fas fa-search text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
            </ul>

            @if(isLoggedIn)
                <!-- User Icon -->
                <div class="text-center w-full mt-auto relative">
                    <div class="w-full h-px bg-black opacity-20 mb-1"></div>
                    <button id="userButton" class="block size-8 drop-shadow-lg rounded-full focus:outline-none">
                        @for(UserEntity user : userList)
                            @if(user.getUsername().equals(getUsername))
                                @if(user.getProfilePicturePath() != null)
                                    <img rel="icon" class="rounded-full mr-2 bg-gray-500 hover:drop-shadow-xl transition duration-200"
                                         src="/image/icon/${user.getProfilePicturePath()}.png">
                                @else
                                    <img rel="icon" class="rounded-full mr-2 bg-gray-500 hover:drop-shadow-xl transition duration-200" src="/image/icon/user-icon.png">
                                @endif
                            @endif
                        @endfor
                    </button>

                    <div id="userPanel" class="absolute w-40 -left-1 -top-36 text-left bg-gray-50 rounded-lg shadow-md border border-gray-300 hidden">
                        <a href="" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 rounded-t-lg cursor-pointer transition duration-300">Booking</a>
                        <a href="" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300">Account</a>
                        <div class="group">
                            <a id="openModal" class="block px-4 py-2 text-zinc-700 group-hover:bg-red-600 group-hover:text-white border-t border-t-gray-300 cursor-pointer rounded-b-lg transition duration-300">Logout</a>
                            <div class="absolute group-hover:border-t-red-600 left-2 -bottom-4 w-0 h-0 border-l-[13px] border-r-[13px] border-l-transparent border-r-transparent border-t-[16px] border-t-gray-50 drop-shadow-md transition duration-300"></div>
                        </div>
                    </div>
                </div>
            @else
                <!-- Login Icon -->
                <div class="text-center mt-auto">
                    <a href="/login"
                       class="block text-green-500  hover:text-green-400 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-sign-in-alt text-2xl"></i>
                    </a>
                </div>
            @endif
        </div>
    </div>
    <div class="flex-initial mt-8" style="width:87.5vw;">
        <!-- Floating, Rounded, Shadow Carousel -->
        <div class="relative h-1/4 w-full mb-5 rounded-xl overflow-hidden shadow-card" style="height:70vh;">
            <!-- Carousel Images -->
            <div id="carousel" class="flex transition-transform duration-500 ease-in-out h-full"
                 style="background-image:url(https://image.tmdb.org/t/p/w1280${movieDetail.getBackdrop_path()});">
                <div class="relative flex bg-black/60">
                    <img class="my-auto mx-10 rounded-lg h-5/6"
                         src="https://image.tmdb.org/t/p/w500${movieDetail.getPoster_path()}" alt="${movieDetail.getTitle()}">
                    <div class="transform space-y-4 p-4 h-5/6 my-auto">
                        <h3 class="text-4xl text-white font-semibold ">${movieDetail.getTitle()}</h3>
                        <div class="flex space-x-1 flex-warp">
                            <p class="text-md text-zinc-300 py-1">${movieDetail.getAdultFormatted()}</p>
                            <p class="text-md text-zinc-300 p-1">• ${movieDetail.getRelease_date()}</p>
                            @for (MovieGenresDTO genre : movieDetail.getGenres())
                                <div class="p-1 rounded-full shadow-inner-lg border border-gray-200 bg-gray-100">
                                    <p class="text-zinc-700">${genre.getName()}</p>
                                </div>
                            @endfor
                            <p class="text-md text-zinc-300 p-1">• ${movieDetail.getRuntimeFormatted()}</p>
                        </div>
                        <p class="text-sm text-zinc-300">${movieDetail.getOverview()}</p>
                        <div class="flex items-center space-x-1">
                            @for (int i = 1; i <= 5; i++)
                                @if (i <= movieDetail.getVote_average() / 2)
                                    <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                @else
                                    <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                @endif
                            @endfor
                        </div>
                        <div class="flex space-x-2">
                            <a id="bookNow" href="#scrollToBehaviour" class="book-button shadow-card p-3 bg-yellow-500 hover:bg-yellow-400 text-white rounded-lg transition duration-300 ">Book Now!</a>
                            <div class="p-3 rounded-lg shadow-inner-lg border border-gray-200 bg-gray-100 flex">
                                <p class="text-zinc-700 font-semibold">Quota Left: 5</p>
                                <p class="text-zinc-700 font-medium">/50</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="w-full flex space-x-5">
            <div class="flex-initial" style="width:65.1vw;">
                <!-- Movie Booking Section -->
                <div id="scrollToBehaviour" class="w-full hidden mb-5">
                    <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Booking ${movieDetail.getTitle()}!</h3>
                    <div class="w-full relative p-5 space-y-4">
                        @if(isLoggedIn)
                        @else
                            <a href="/login" class="absolute p-2 top-4 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/40 to-gray-400/60
                                      shadow-md hover:shadow-xl rounded-lg z-10 justify-center items-center font-bold text-3xl flex space-x-2 transition duration-300">
                                <p class="text-green-600 hover:text-green-700 drop-shadow-md transition duration-300">Login </p>
                                <p class="text-white"> To Submit a Review!</p>

                                <p class="text-white drop-shadow-md text-base font-semibold bottom-1 right-2 absolute">Click it to Login!</p>
                            </a>
                        @endif
                        <div class="flex">
                            <div class="border-sky-400 border-l-4 pl-2 h-6"></div>
                            <h2 class="text-xl font-bold text-zinc-700">Pick a Date and Time</h2>
                        </div>
                        <form action="/movie/${movieDetail.getId()}/booking" method="post">
                            <div class="grid grid-cols-2 gap-4">
                                <!-- Date Dropdown -->
                                <div class="space-y-2">
                                    <label for="custom-date" class="block font-medium text-zinc-700">Date</label>
                                    <select id="custom-date" name="custom-date" class="w-full px-3 py-2 border rounded-md focus:ring-blue-500 focus:border-blue-500 shadow-inner-lg">
                                        <!-- Dynamic options filled with JavaScript -->
                                    </select>
                                </div>

                                <!-- Time Dropdown -->
                                <div class="space-y-2">
                                    <label for="custom-time" class="block font-medium text-gray-700">Time</label>
                                    <select id="custom-time" name="custom-time" class="w-full px-3 py-2 border rounded-md focus:ring-blue-500 focus:border-blue-500 shadow-inner-lg">
                                        <!-- Dynamic options filled with JavaScript -->
                                    </select>
                                </div>
                            </div>

                            <!-- Book Now Button -->
                            <button type="submit" class="bg-green-500 hover:bg-green-400 mt-2 transition duration-300 rounded-full p-3 shadow-card text-white ml-[88%]">Book Now</button>
                        </form>

                    </div>
                </div>
                <!-- Movie Cast Section (Horizontal Scroll) -->
                <div class="overflow-x-scroll mb-5">
                    <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Top Billed Cast</h3>
                    <div class="flex space-x-4 overflow-y-hidden pb-4 pt-4">
                        <!-- Movie Card -->
                        @for (MovieCastDTO movie : movieCast)
                            <a class="rounded-lg bg-gray-50 shadow-card overflow-hidden
                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 ">
                                <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getProfile_path()}"
                                     alt="${movie.getName()}">
                                <div class="p-4 space-y-2">
                                    <h3 class="text-xl text-black font-semibold" style=" display: -webkit-box;
                                    -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;">${movie.getName()}</h3>
                                    <p class="text-sm text-zinc-400">${movie.getCharacter()}</p>
                                </div>
                            </a>
                        @endfor
                    </div>
                </div>
                <div class="space-y-5 mb-5">
                    <div class="space-y-5 overflow-hidden">
                        <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Movie Reviews</h3>
                        @if(isLoggedIn)
                            @if(matchingFeedback.isPresent())
                                <div id="userFeedbackInput"  class="hidden p-5 relative flex rounded-lg">
                                    @for(UserEntity user : userList)
                                        @if(user.getUsername().equals(getUsername))
                                            @if(user.getProfilePicturePath() != null)
                                                <div class="border-sky-400 border-l-4 pl-2 h-10"></div>
                                                <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500"
                                                     src="/image/icon/${user.getProfilePicturePath()}.png">
                                            @else
                                                <div class="border-sky-400 border-l-4 pl-2 h-10"></div>
                                                <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500" src="/image/icon/user-icon.png">
                                            @endif
                                        @endif
                                    @endfor
                                    <form class="w-full" action="/movie/${movieDetail.getId()}/feedback" method="post">
                                        <input type="hidden" name="_method" value="PUT">
                                        <textarea class="resize-none min-h-8 h-8 max-h-28 bg-transparent border-b border-zinc-600/50 text-zinc-600 w-full focus:outline-none" id="reviews" name="reviews" placeholder="Add Review...">${matchingFeedback.get().getReviews()}</textarea>
                                        <div class="flex flex-row-reverse float-left mt-2">
                                            @for (int i = 5; i >= 1; i--)
                                                @if (i <= matchingFeedback.get().getRating() / 2)
                                                    <input type="radio" id="star${i}" name="rating" value="${i * 2}" class="hidden peer">
                                                    <label for="star${i}"
                                                           class="cursor-pointer text-yellow-400 peer-checked:text-orange-400 hover:text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></label>
                                                @else
                                                    <input type="radio" id="star${i}" name="rating" value="${2 * i}" class="hidden peer">
                                                    <label for="star${i}"
                                                           class="cursor-pointer text-gray-400 peer-checked:text-orange-400 hover:text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></label>
                                                @endif
                                            @endfor
                                        </div>
                                        <button type="button" id="cancelFeedbackButton" class="self-start bg-gray-500 hover:bg-gray-600 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right mt-2 ml-auto">
                                            Cancel
                                        </button>
                                        <button type="submit" class="self-start mr-2 bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right mt-2 ml-auto">
                                            Update
                                        </button>
                                    </form>
                                </div>
                            @else
                                <div class="p-5 relative flex rounded-lg">
                                    @for(UserEntity user : userList)
                                        @if(user.getUsername().equals(getUsername))
                                            @if(user.getProfilePicturePath() != null)
                                                <div class="border-sky-400 border-l-4 pl-2 h-10"></div>
                                                <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500"
                                                     src="/image/icon/${user.getProfilePicturePath()}.png">
                                            @else
                                                <div class="border-sky-400 border-l-4 pl-2 h-10"></div>
                                                <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500" src="/image/icon/user-icon.png">
                                            @endif
                                        @endif
                                    @endfor
                                    <!-- User Feedback Form -->
                                    <form class="w-full" action="/movie/${movieDetail.getId()}/feedback" method="post">
                                        @template.include.miscellaneous.rating-radio-input()
                                    </form>
                                </div>
                            @endif
                        @else
                            <div class="p-5 relative flex rounded-lg">
                                <a href="/login" class="absolute p-2 top-0 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/30 to-gray-400/70
                                      shadow-md hover:shadow-xl rounded-lg z-10 justify-center items-center font-bold text-3xl flex space-x-2 transition duration-300">
                                    <p class="text-green-600 hover:text-green-700 drop-shadow-md transition duration-300">Login </p>
                                    <p class="text-white"> To Submit a Review!</p>

                                    <p class="text-white drop-shadow-md text-base font-semibold bottom-1 right-2 absolute">Click it to Login!</p>
                                </a>
                                <div class="border-sky-400 border-l-4 pl-2 h-10"></div>
                                <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500" src="/image/icon/user-icon.png">
                                <form class="w-full" action="/movie/${movieDetail.getId()}/feedback" method="post">
                                    @template.include.miscellaneous.rating-radio-input()
                                </form>
                            </div>
                        @endif

                        <div class="transition-transform duration-500 ease-in-out max-h-96 overflow-y-scroll
                                px-5 pb-4 space-y-12">
                            <!-- User Feedback -->
                            @if(matchingFeedback.isPresent())
                                <div id="currentUserFeedback" class="w-full space-y-2">
                                    <div class="flex">
                                        <div class="border-sky-400 border-l-4 pl-2 h-10"></div>
                                        @for(UserEntity user : userList)
                                            @if(user.getUsername().equals(matchingFeedback.get().getUsername()))
                                                @if(user.getProfilePicturePath() != null)
                                                    <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500"
                                                         src="/image/icon/${user.getProfilePicturePath()}.png">
                                                @else
                                                    <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500" src="/image/icon/user-icon.png">
                                                @endif
                                            @endif
                                        @endfor
                                        <h3 class="text-xl font-bold my-auto">${matchingFeedback.get().getUsername()}</h3>
                                        <div class="flex ml-auto">
                                            <button id="updateFeedbackButton" class="self-start mr-2 bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right">
                                                Update
                                            </button>
                                            <a href="/movie/${movieDetail.getId()}/feedback/delete" class="self-start bg-red-600 hover:bg-red-700 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right">
                                                Delete
                                            </a>
                                        </div>
                                    </div>
                                    <div class="flex items-center">
                                        @for (int i = 1; i <= 5; i++)
                                            @if (i <= matchingFeedback.get().getRating() / 2)
                                                <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @else
                                                <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @endif
                                        @endfor
                                    </div>
                                    @if(matchingFeedback.get().getReviews().isBlank() || matchingFeedback.get().getReviews().isEmpty())

                                    @else
                                        <div class="overflow-y-auto max-h-full">
                                            <p class="reviews text-md text-zinc-600" style="display: -webkit-box; -webkit-box-orient: vertical;
                                                                -webkit-line-clamp: 5; overflow: hidden;">${matchingFeedback.get().getReviews()}</p>
                                        </div>
                                        <button class="show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white ">Show More!</button>
                                    @endif
                                </div>
                            @endif
                            @if(movieFeedbacks != null)
                                @for(FeedBackEntity feedbacks : movieFeedbacks)
                                    @if(feedbacks.getMovieId() == movieDetail.getId())
                                        @if(feedbacks.getIsDeleted() == true || matchingFeedback.isPresent())

                                        @else
                                            <div class="w-full space-y-2">
                                                <div class="flex">
                                                    <div class="border-sky-400 border-l-4 pl-2 h-10"></div>
                                                    @for(UserEntity user : userList)
                                                        @if(user.getUsername().equals(feedbacks.getUsername()))
                                                            @if(user.getProfilePicturePath() != null)
                                                                <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500"
                                                                     src="/image/icon/${user.getProfilePicturePath()}.png">
                                                            @else
                                                                <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500" src="/image/icon/user-icon.png">
                                                            @endif
                                                        @endif
                                                    @endfor
                                                    <h3 class="text-xl font-bold my-auto">${feedbacks.getUsername()}</h3>
                                                </div>
                                                <div class="flex items-center">
                                                    @for (int i = 1; i <= 5; i++)
                                                        @if (i <= feedbacks.getRating() / 2)
                                                            <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                                        @else
                                                            <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                                        @endif
                                                    @endfor
                                                </div>
                                                @if(feedbacks.getReviews().isBlank() || feedbacks.getReviews().isEmpty())

                                                @else
                                                    <div class="overflow-y-auto max-h-full">
                                                        <p class="reviews text-md text-zinc-600" style="display: -webkit-box; -webkit-box-orient: vertical;
                                                            -webkit-line-clamp: 5; overflow: hidden;">${feedbacks.getReviews()}</p>
                                                    </div>
                                                    <button class="show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white ">Show More!</button>
                                                @endif
                                            </div>
                                        @endif
                                    @endif
                                @endfor
                            @endif
                            @for (MovieReviewsDTO movie : movieReviews)
                                <div class="w-full space-y-2">
                                    <div class="flex">
                                        <div class="border-sky-400 border-l-4 pl-2 h-10"></div>
                                        @if(movie.getAuthor_details().getAvatar_path() != null)
                                            <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500"
                                                 src="https://image.tmdb.org/t/p/w92${movie.getAuthor_details().getAvatar_path()}">
                                        @else
                                            <img rel="icon" class="block size-10 rounded-full mr-2 bg-gray-500" src="/image/icon/user-icon.png">
                                        @endif
                                        <h3 class="text-xl font-bold my-auto">${movie.getAuthor()}</h3>
                                    </div>
                                    <div class="flex items-center">
                                        @for (int i = 1; i <= 5; i++)
                                            @if (i <= movie.getAuthor_details().getRating() / 2)
                                                <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @else
                                                <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @endif
                                        @endfor
                                    </div>
                                    <div class="overflow-y-auto max-h-full">
                                        <p class="reviews text-md text-zinc-600" style="display: -webkit-box; -webkit-box-orient: vertical;
                                    -webkit-line-clamp: 5; overflow: hidden;">${movie.getContent()}</p>
                                    </div>
                                    <button class="show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white ">Show More!</button>
                                </div>
                            @endfor
                        </div>
                    </div>
                </div>
                <!-- Movie Recommendation Section (Horizontal Scroll) -->
                <div id="recommendation" class="overflow-x-scroll mb-5">
                    <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Recommended For You</h3>
                    <div class="flex space-x-4 overflow-y-hidden pb-4 pt-5">
                        <!-- Movie Card -->
                        @for (MovieDTO movie : movieRecommendation)
                            <a href="/movie/${movie.getId()}"  class="rounded-lg bg-gray-50 shadow-card overflow-hidden
                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 ">
                                <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getPoster_path()}"
                                     alt="${movie.getTitle()}">
                                <div class="p-4 space-y-2">
                                    <h3 class="text-xl text-black font-semibold" style=" display: -webkit-box;
                            -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;">${movie.getTitle()}</h3>
                                    <div class="flex items-center">
                                        @for (int i = 1; i <= 5; i++)
                                            @if (i <= movie.getVote_average() / 2)
                                                <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @else
                                                <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @endif
                                        @endfor
                                    </div>
                                </div>
                            </a>
                        @endfor
                    </div>
                </div>
            </div>
            <!-- Extra Detail Sections-->
            <div class="flex-initial" style="width:39%;">
                <div class="w-full">
                    <h3 class="text-xl sm:text-2xl lg:text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4">
                        Extra Details
                    </h3>
                    <div class="p-4 mt-4 w-full bg-gray-50 rounded-lg shadow-card relative overflow-hidden">
                        <div class="bg-gradient-to-r from-sky-400 to-blue-500 p-4 px-24 absolute top-0 left-0" style="border-radius: 0 0 30px 0;"></div>
                        <div class="space-y-4 mt-8">
                            <div>
                                <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold">Status</p>
                                <p class="text-zinc-700 ml-3">${movieDetail.getStatus()}</p>
                            </div>
                            <div>
                                <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold">Original Language</p>
                                <p class="text-zinc-700 ml-3">${movieDetail.getEnglish_name()}</p>
                            </div>
                            <div>
                                <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold">Budget</p>
                                <p class="text-zinc-700 ml-3">$${movieDetail.getBudgetFormatted()}</p>
                            </div>
                            <div>
                                <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold">Revenue</p>
                                <p class="text-zinc-700 ml-3">$${movieDetail.getRevenueFormatted()}</p>
                            </div>
                        </div>
                        <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold mt-4">Keywords</p>
                        <div class="overflow-auto max-h-full">
                            <div class="ml-3 flex flex-wrap items-start">
                                @for(MovieKeywordsDTO movie : movieKeywords)
                                    <div class="mr-2 mt-2 p-1 shadow-inner-lg rounded-lg border border-gray-200 bg-gray-100">
                                        <p class="text-zinc-700">${movie.getName()}</p>
                                    </div>
                                @endfor
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Footer -->
@template.include.footer.footer()
<!-- Modal -->
@template.include.modal.logout-modal()
<!-- Custom JavaScript -->
<script src="/asset/js/AJAX-handler.js"></script>
<script src="/asset/js/feedback.js"></script>
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/modal.js"></script>
<script src="/asset/js/carousel.js"></script>
<script src="/asset/js/booking.js"></script>
</body>
</html>
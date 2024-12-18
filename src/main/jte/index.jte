@import java.util.List
@import com.movieonline.Online.Movie.entity.dto.MovieDTO

@param String WebName
@param Boolean isLoggedIn
@param List<MovieDTO> searchMovies
@param List<MovieDTO> nowPlayingMovies
@param List<MovieDTO> popularMovies
@param List<MovieDTO> topRatedMovies
@param List<MovieDTO> upcomingMovies

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Homepage</title>
    <link rel="icon" href="/image/favsicon/eudaemonia.png">
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link rel="stylesheet" href="/asset/css/style.css">
</head>
<body class="bg-gray-100 font-avenir min-h-screen">
<div class="flex">
    <div class="flex-initial" style="width:9.5vw;">
<%--        @template.include.header.navbar()--%>
        <!-- Floating Sidebar -->
        <div class="fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20">
            <!-- Top Icons -->
            <ul class="space-y-6 text-center">
                <!-- Icon 1 -->
                <li>
                    <a href="/"
                       class="block text-sky-400 hover:text-yellow-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-home text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="#"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-film text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 3 with Search Bar Dropdown -->
                <li class="relative">
                    <a href="#" id="searchIcon"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 transition duration-200">
                        <i id="searchIconSymbol" class="fas fa-search text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>

                    <!-- Search bar dropdown -->
                    <div id="searchBar" class="absolute top-0 -right-4 transform -translate-y-5 transition-all duration-500 hidden">
                        <form class="flex p-3 border-b-4 border-r border-r-gray-400/50 border-b-gray-400/60 bg-gray-50 rounded-r-lg" action="/" method="get">
                            <input type="text" id="name" name="name" placeholder="Search..." class="p-2 border border-gray-300 rounded-md w-72 focus:outline-none"/>
                            <div class="ml-3 mt-1">
                                <a href="#"
                                   class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 transition duration-200 w-full">
                                    <i id="searchIconSymbol" class="fas fa-search text-yellow-500 text-2xl"></i>
                                </a>
                                <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                            </div>
                        </form>
                        <div class="overflow-auto p-3 h-screen scrollbar-hidden">
                            <div class="flex flex-col space-y-6">
                                @for (MovieDTO movie : searchMovies)
                                    <a href="/movie/${movie.getId()}" class="relative bg-gray-50 rounded-xl flex shadow-card overflow-hidden max-w-sm w-full h-40
                            flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2">
                                        <img class="w-28 h-full object-cover"
                                             src="https://image.tmdb.org/t/p/w185${movie.getPoster_path()}"
                                             alt="${movie.getTitle()}">
                                        <div class="p-4 space-y-1" style="height:90%;">
                                            <h3 class="text-xl text-black font-semibold">${movie.getTitle()}</h3>
                                            <div class="text-sm text-zinc-400 relative overflow-hidden max-h-24 text-ellipsis">${movie.getOverview()}</div>
                                        </div>
                                    </a>
                                @endfor
                            </div>
                        </div>
                    </div>
                </li>
            </ul>

            @if(isLoggedIn)
                <!-- Logout Icon -->
                <div class="text-center mt-auto">
                    <a href="/logout"
                       class="block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-sign-out-alt text-2xl"></i>
                    </a>
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
    <div class="flex-initial mt-8 space-y-5" style="width:60vw;">
        <!-- Floating, Rounded, Shadow Carousel -->
        <div class="relative h-1/4 w-full rounded-xl overflow-hidden shadow-card" style="height:70vh;">
            <!-- Carousel Images -->
            <div id="carousel" class="flex transition-transform duration-500 ease-in-out h-full">
                @for (MovieDTO movie : nowPlayingMovies)
                <div class="size-full flex "
                     style="background-image:url(https://image.tmdb.org/t/p/w1280${movie.getBackdrop_path()});">
                    <div class="flex bg-black/60">
                        <img class="my-auto mx-10 rounded-lg h-5/6"
                             src="https://image.tmdb.org/t/p/w500${movie.getPoster_path()}" alt="${movie.getTitle()}">
                        <div class="space-y-4 p-4 h-5/6 my-auto">
                            <h4 class="text-xl font-medium text-white border-sky-400 border-l-4 pl-2 ">Now Playing!</h4>
                            <h3 class="text-4xl text-white font-semibold ">${movie.getTitle()}</h3>
                            <p class="text-sm text-zinc-300">${movie.getOverview()}</p>
                            <div class="flex items-center space-x-1">
                                @for (int i = 1; i <= 5; i++)
                                    @if (i <= movie.getVote_average() / 2)
                                        <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                    @else
                                        <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                    @endif
                                @endfor
                            </div>
                            <div class="space-x-1 py-3">
                                <a href="/movie/${movie.getId()}" class="p-4 shadow-card bg-sky-400 hover:bg-sky-500 text-white rounded-lg transition duration-300 ">View Now!</a>
                                <a class="book-button p-4 shadow-card bg-yellow-400 hover:bg-yellow-500 text-white rounded-lg transition cursor-pointer duration-300 ">Book Now!</a>
                            </div>
                        </div>
                    </div>
                </div>
                @endfor
            </div>

            <!-- Navigation Arrows -->
            <div class="right-3 bottom-3 p-1 h-24 rounded-full shadow-inner-lg w-52 absolute flex bg-gray-50">
                <!-- Left Arrow -->
                <button id="prev"
                        class="mr-4 bg-sky-400 hover:bg-sky-500 shadow-card w-1/2 h-full transition duration-300 rounded-full text-white">
                    <i class="fas fa-chevron-left"></i>
                </button>
                <!-- Right Arrow -->
                <button id="next"
                        class="bg-sky-400 hover:bg-sky-500 shadow-card w-1/2 h-full transition duration-300 rounded-full text-white">
                    <i class="fas fa-chevron-right"></i>
                </button>
            </div>
        </div>
        <!-- Popular Movies Section (Horizontal Scroll) -->
        <div class="w-full">
            <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Popular Movies</h3>
            <div class="flex space-x-4 pb-4 overflow-x-hidden pt-5">
                <!-- Movie Card -->
                @for (MovieDTO movie : popularMovies)
                    <a href="/movie/${movie.getId()}" class="rounded-lg bg-gray-50 shadow-card overflow-hidden
                max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2">
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
        <!-- Top Rated Movies Section (Horizontal Scroll) -->
        <div id="top-rated" class="w-full">
            <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Top Rated Movies</h3>
            <div class="flex space-x-4 overflow-y-hidden pb-4 pt-5">
                <!-- Movie Card -->
                @for (MovieDTO movie : topRatedMovies)
                    <a href="/movie/${movie.getId()}" class="rounded-lg bg-gray-50 shadow-card overflow-hidden
                max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2">
                        <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getPoster_path()}"
                             alt="${movie.getTitle()}">
                        <div class="p-4  space-y-2">
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
    <div class="flex-initial" style="width:30vw;">
        <div class="w-3/12 ml-5 mt-8">
            <div class="w-96">
                <h3 class="ml-3 text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4">Upcoming
                    Movies</h3>
                <div class="overflow-auto p-3 h-screen">
                    <div class="flex flex-col space-y-6">
                        @for (MovieDTO movie : topRatedMovies)
                                <a href="/movie/${movie.getId()}" class="relative bg-gray-50 rounded-xl flex shadow-card overflow-hidden max-w-sm w-full h-40
                                flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2">
                                    <img class="w-28 h-full object-cover"
                                         src="https://image.tmdb.org/t/p/w185${movie.getPoster_path()}"
                                         alt="${movie.getTitle()}">
                                    <div class="p-4 space-y-1" style="height:90%;">
                                        <h3 class="text-xl text-black font-semibold">${movie.getTitle()}</h3>
                                        <div class="text-sm text-zinc-400 relative overflow-hidden max-h-24 text-ellipsis">${movie.getOverview()}</div>
                                    </div>
                                </a>
                        @endfor
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Footer -->
@template.include.footer.footer()
<!-- The Modal -->
@template.include.modal.booking()
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/modal.js"></script>
<script src="/asset/js/main.js"></script>
</body>
</html>
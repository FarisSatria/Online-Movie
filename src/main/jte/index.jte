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
<html lang="en" class="scroll-smooth">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Homepage</title>
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
                    <a href="#"
                       class="block text-sky-400 hover:text-yellow-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-home text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="#scrollToBehaviour"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-film text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                @template.include.header.sidebar-searchbar()
            </ul>

            @if(isLoggedIn)
                <!-- User Icon -->
                <div class="text-center mt-auto relative group">
                    <button id="userButton" class="block size-8 drop-shadow-lg hover:drop-shadow-xl transition duration-200 rounded-full focus:outline-none">
                        <img rel="icon" class="rounded-full mr-2 bg-gray-500" src="/image/icon/user-icon.png">
                    </button>

                    <div id="userPanel" class="absolute overflow-hidden -left-4 w-48 bg-white rounded-r-md bg-gray-50 shadow-md border-t border-r border-b border-gray-300 hidden" style="top:-7.8rem;">
                        <a href="" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300">Settings</a>
                        <a href="" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300">Account</a>
                        <a id="openModal" class="block px-4 py-2 text-zinc-700 hover:bg-gradient-to-r from-red-500 to-red-700 hover:text-white border-t border-t-gray-300 cursor-pointer  transition duration-300">Logout</a>
                    </div>
                </div>
            @else
                <!-- Login Icon -->
                <div class="text-center mt-auto">
                    <a href="/login"
                       class="block text-green-500  hover:text-green-400 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
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
                            <div class="space-x-1 flex">
                                <a href="/movie/${movie.getId()}" class="p-3 shadow-card bg-sky-400 hover:bg-sky-500 text-white rounded-lg transition duration-300 ">View Now!</a>
                                <div class="p-3 rounded-lg shadow-inner-lg border border-gray-200 bg-gray-100 flex">
                                    <p class="text-zinc-700 font-semibold">Quota Left: 5</p>
                                    <p class="text-zinc-700 font-medium">/50</p>
                                </div>
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
            <h3 id="scrollToBehaviour" class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Popular Movies</h3>
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
            <div style="width:26.9vw;">
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
<!-- Modal -->
@template.include.modal.logout-modal()
<!-- Custom JavaScript -->
<script src="/asset/js/AJAX-handler.js"></script>
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/modal.js"></script>
<script src="/asset/js/carousel.js"></script>
<script src="/asset/js/booking.js"></script>
</body>
</html>
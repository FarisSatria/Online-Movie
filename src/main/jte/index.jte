@param String WebName

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Homepage</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>
<body class="bg-gray-200 font-sans min-h-screen">
<!-- Floating Sidebar -->
<div class="fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-md flex flex-col justify-between p-4">
    <!-- Top Icons -->
    <ul class="space-y-6 text-center">
        <!-- Icon 1 -->
        <li>
            <a href="#"
               class="block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
                <i class="fas fa-home text-2xl"></i>
            </a>
            <div class="w-full h-px bg-black opacity-20 mt-1"></div>
        </li>
        <!-- Icon 2 -->
        <li>
            <a href="#"
               class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
                <i class="fas fa-film text-2xl"></i>
            </a>
            <div class="w-full h-px bg-black opacity-20 mt-1"></div>
        </li>
        <!-- Icon 3 -->
        <li>
            <a href="#"
               class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
                <i class="fas fa-fire text-2xl"></i>
            </a>
            <div class="w-full h-px bg-black opacity-20 mt-1"></div>
        </li>
        <!-- Icon 4 -->
        <li>
            <a href="#"
               class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
                <i class="fas fa-search text-2xl"></i>
            </a>
            <div class="w-full h-px bg-black opacity-20 mt-1"></div>
        </li>
    </ul>

    <!-- Logout Icon -->
    <div class="text-center mt-auto">
        <a href="/logout"
           class="block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
            <i class="fas fa-sign-out-alt text-2xl"></i>
        </a>
    </div>
</div>

<div class="flex">
    <div class="flex-initial w-3/5 ml-32 mt-8 ">
        <!-- Floating, Rounded, Shadow Carousel -->
        <div class="relative h-1/4 w-full mb-5 rounded-xl overflow-hidden shadow-md" style="height:70vh;">
            <!-- Carousel Images -->
            <div id="carousel" class="flex transition-transform duration-500 ease-in-out h-full">
                <div class="relative">
                    <img class="w-full h-full object-cover rounded-xl" src="image/background/Naruto-Uzumaki.webp"
                         alt="Slide 1">
                    <!-- Movie Details Section -->
                    <div class="absolute left-4 top-1/2 transform -translate-y-1/2 text mix-blend-difference space-y-4">
                        <h4 class="text-2xl text-white border-sky-400 border-l-4 pl-2">#1 Most Popular!</h4>
                        <h3 class="text-6xl text-white font-semibold">Movie Title</h3>
                        <p class="text-md text-white w-72">A brief description of the movie goes here, summarizing the plot
                            or theme of the film.</p>
                        <div class="flex items-center space-x-1">
                            <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                            <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                            <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                            <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                            <span class="text-gray-400"><i class="fas fa-star"></i></span>
                        </div>
                    </div>
                </div>

                <div class="relative">
                    <img class="w-full h-full object-cover rounded-xl" src="image/background/Naruto-Uzumaki.webp"
                         alt="Slide 1">
                    <!-- Movie Details Section -->
                    <div class="absolute left-4 top-1/2 transform -translate-y-1/2 text mix-blend-difference space-y-4">
                        <h4 class="text-2xl text-white border-sky-400 border-l-4 pl-2">#1 Most Popular!</h4>
                        <h3 class="text-6xl text-white font-semibold">Movie Title</h3>
                        <p class="text-md text-white w-72">A brief description of the movie goes here, summarizing the plot
                            or theme of the film.</p>
                        <div class="flex items-center space-x-1">
                            <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                            <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                            <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                            <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                            <span class="text-gray-400"><i class="fas fa-star"></i></span>
                        </div>
                    </div>
                </div>

            </div>

            <!-- Navigation Arrows -->
            <div class="right-3 bottom-3 p-1 h-1/6 rounded-full shadow-inner w-3/12 absolute flex bg-gray-50">
                <!-- Left Arrow -->
                <button id="prev"
                        class="mr-4 bg-sky-400 hover:bg-sky-500 shadow-md w-1/2 h-full transition duration-300 rounded-full text-white">
                    <i class="fas fa-chevron-left"></i>
                </button>
                <!-- Right Arrow -->
                <button id="next"
                        class="bg-sky-400 hover:bg-sky-500 shadow-md w-1/2 h-full transition duration-300 rounded-full text-white">
                    <i class="fas fa-chevron-right"></i>
                </button>
            </div>
        </div>
        <!-- Featured Movies Section (Horizontal Scroll) -->
        <div class="w-full">
            <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Featured Movies</h3>
            <div class="flex space-x-4 overflow-y-hidden pt-5">
                <!-- Movie Card 1 -->
                <a href="/movie/1" class="rounded-lg bg-gray-50 shadow-md overflow-hidden
                max-w-xs w-48 h-80 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md">
                    <img class="w-full h-60 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 1">
                    <div class="p-3">
                        <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                        <div class="flex items-center mb-4">
                  <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-gray-400">
                    <i class="fas fa-star"></i>
                  </span>
                        </div>
                    </div>
                </a>
                <!-- Movie Card 2 -->
                <a href="/movie/1" class="rounded-lg bg-gray-50 shadow-md overflow-hidden
                max-w-xs w-48 h-80 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md">
                    <img class="w-full h-60 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 1">
                    <div class="p-3">
                        <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                        <div class="flex items-center mb-4">
                  <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-gray-400">
                    <i class="fas fa-star"></i>
                  </span>
                        </div>
                    </div>
                </a>
                <!-- Movie Card 3 -->
                <a href="/movie/1" class="rounded-lg bg-gray-50 shadow-md overflow-hidden
                max-w-xs w-48 h-80 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md">
                    <img class="w-full h-60 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 1">
                    <div class="p-3">
                        <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                        <div class="flex items-center mb-4">
                  <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-gray-400">
                    <i class="fas fa-star"></i>
                  </span>
                        </div>
                    </div>
                </a>
                <!-- Movie Card 4 -->
                <a href="/movie/1" class="rounded-lg bg-gray-50 shadow-md overflow-hidden
                max-w-xs w-48 h-80 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md">
                    <img class="w-full h-60 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 1">
                    <div class="p-3">
                        <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                        <div class="flex items-center mb-4">
                  <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-gray-400">
                    <i class="fas fa-star"></i>
                  </span>
                        </div>
                    </div>
                </a>
                <!-- Movie Card 5 -->
                <a href="/movie/1" class="rounded-lg bg-gray-50 shadow-md overflow-hidden
                max-w-xs w-48 h-80 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md">
                    <img class="w-full h-60 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 1">
                    <div class="p-3">
                        <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                        <div class="flex items-center mb-4">
                  <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-gray-400">
                    <i class="fas fa-star"></i>
                  </span>
                        </div>
                    </div>
                </a>
                <!-- Movie Card 6 -->
                <a href="/movie/1" class="rounded-lg bg-gray-50 shadow-md overflow-hidden
                max-w-xs w-48 h-80 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md">
                    <img class="w-full h-60 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 1">
                    <div class="p-3">
                        <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                        <div class="flex items-center mb-4">
                  <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-yellow-400">
                    <i class="fas fa-star"></i>
                  </span>
                            <span class="text-gray-400">
                    <i class="fas fa-star"></i>
                  </span>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </div>
    <div class="flex-initial">
        <div class="w-3/12 mt-8 mr-4">
            <div class="w-96 ml-5">
                <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4">Top Trending
                    Movies</h3>
                <div class="flex flex-col space-y-6">
                    <!-- Movie Card 1 -->
                    <a class="bg-gray-50 rounded-xl flex shadow-md overflow-hidden max-w-sm w-full h-40
                    flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2">
                        <img class="w-full h-full object-cover" src="https://via.placeholder.com/400x600"
                             alt="Featured Movie Poster 1">
                        <div class="p-6">
                            <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                            <p class="text-sm text-zinc-400 mb-4">A high-paced action movie that keeps you at the edge
                                of your seat.</p>
                        </div>
                    </a>
                    <!-- Movie Card 2 -->
                    <a class="bg-gray-50 rounded-xl flex shadow-md overflow-hidden max-w-sm w-full h-40
                    flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2">
                        <img class="w-full h-full object-cover" src="https://via.placeholder.com/400x600"
                             alt="Featured Movie Poster 1">
                        <div class="p-6">
                            <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                            <p class="text-sm text-zinc-400 mb-4">A high-paced action movie that keeps you at the edge
                                of your seat.</p>
                        </div>
                    </a>
                    <!-- Movie Card 3 -->
                    <a class="bg-gray-50 rounded-xl flex shadow-md overflow-hidden max-w-sm w-full h-40
                    flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2">
                        <img class="w-full h-full object-cover" src="https://via.placeholder.com/400x600"
                             alt="Featured Movie Poster 1">
                        <div class="p-6 ">
                            <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                            <p class="text-sm text-zinc-400 mb-4">A high-paced action movie that keeps you at the edge
                                of your seat.</p>
                        </div>
                    </a>
                    <!-- Movie Card 4 -->
                    <a class="bg-gray-50 rounded-xl flex shadow-md overflow-hidden max-w-sm w-full h-40
                    flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2">
                        <img class="w-full h-full object-cover" src="https://via.placeholder.com/400x600"
                             alt="Featured Movie Poster 1">
                        <div class="p-6 ">
                            <h3 class="text-xl text-black font-semibold mb-2">Featured Movie 1</h3>
                            <p class="text-sm text-zinc-400 mb-4">A high-paced action movie that keeps you at the edge
                                of your seat.</p>
                        </div>
                    </a>
                </div>
            </div>

        </div>

    </div>
</div>
<script src="/asset/js/main.js"></script>
</body>
</html>
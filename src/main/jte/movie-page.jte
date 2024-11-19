@param String WebName

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${WebName} | </title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>

<body class="bg-gray-200 font-sans min-h-screen" >
<!-- Floating Sidebar -->
<div class="fixed top-8 left-8 bottom-8 w-16 bg-gray-50 rounded-xl shadow-md flex flex-col justify-between p-4">
    <!-- Top Icons -->
    <ul class="space-y-6 text-center">
        <!-- Icon 1 -->
        <li>
            <a href="#" class="block text-sky-400 hover:text-yellow-400 transition duration-200">
                <i class="fas fa-home text-2xl"></i>
            </a>
            <div class="w-full h-px bg-gray-700 opacity-20 mt-1"></div>
        </li>
        <!-- Icon 2 -->
        <li>
            <a href="#" class="block text-black hover:text-sky-400 transition duration-200">
                <i class="fas fa-film text-2xl"></i>
            </a>
            <div class="w-full h-px bg-gray-700 opacity-20 mt-1"></div>
        </li>
        <!-- Icon 3 -->
        <li>
            <a href="#" class="block text-black hover:text-sky-400 transition duration-200">
                <i class="fas fa-fire text-2xl"></i>
            </a>
            <div class="w-full h-px bg-gray-700 opacity-20 mt-1"></div>
        </li>
        <!-- Icon 4 -->
        <li>
            <a href="#" class="block text-black hover:text-sky-400 transition duration-200">
                <i class="fas fa-search text-2xl"></i>
            </a>
            <div class="w-full h-px bg-gray-700 opacity-20 mt-1"></div>
        </li>
    </ul>

    <!-- Logout Icon -->
    <div class="text-center mt-auto">
        <a href="/logout" class="block text-red-400 hover:text-red-600 transition duration-200">
            <i class="fas fa-sign-out-alt text-2xl"></i>
        </a>
    </div>
</div>


<div class="flex">
    <div class="flex-initial w-full ml-32 mt-8 mr-8">
        <!-- Floating, Rounded, Shadow Carousel -->
        <div class="relative h-full w-full flex mb-5 p-1 rounded-xl shadow-md bg-white" style="height:70vh;">
            <!-- Carousel Images -->
            <div id="carousel" class="transition-transform w-full h-full duration-500 ease-in-out">
                <img class="object-cover rounded-lg h-full w-full" src="https://via.placeholder.com/600x400" alt="Slide 1">
            </div>
            <!-- Movie Details Section -->
            <div class="absolute left-4 top-1/2 transform -translate-y-1/2 text space-y-4">
                <h3 class="text-2xl font-semibold">Movie Title</h3>
                <p class="text-sm">A brief description of the movie goes here, summarizing the plot or theme of the
                    film.</p>
                <div class="flex items-center space-x-1">
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
            <div class="right-3 bottom-3 p-1 h-1/6 rounded-full shadow-inner w-1/6 absolute flex bg-gray-50">
                <!-- Left Arrow -->
                <button id="prev"
                        class="mr-4 bg-blue-600 hover:bg-blue-700 shadow-md w-1/2 h-full bg-opacity-75 transition duration-300 rounded-full text-white">
                    <i class="fas fa-chevron-left"></i>
                </button>
                <!-- Right Arrow -->
                <button id="next"
                        class="bg-blue-600 hover:bg-blue-700 shadow-md w-1/2 h-full bg-opacity-75 transition duration-300 rounded-full text-white">
                    <i class="fas fa-chevron-right"></i>
                </button>
            </div>
        </div>
        <!-- Featured Movies Section (Horizontal Scroll) -->
        <div class="">
            <h3 class="text-3xl text font-semibold mb-4">Featured Movies</h3>
            <div class="flex overflow-x-auto w-full space-x-4" style="height:50vh;">
                <!-- Movie Card 1 -->
                <div class="bg-white rounded-xl shadow-md overflow-hidden max-w-xs w-full flex-shrink-0">
                    <img class="w-full h-56 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 1">
                    <div class="p-6 shadow-inner">
                        <h3 class="text-2xl text font-semibold mb-2">Featured Movie 1</h3>
                        <p class="text-sm text-zinc-400 mb-4">A thrilling adventure that takes you through twists and
                            turns.</p>
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
                </div>
                <!-- Movie Card 2 -->
                <div class="bg-white rounded-xl shadow-md overflow-hidden max-w-xs w-full flex-shrink-0">
                    <img class="w-full h-56 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 2">
                    <div class="p-6 shadow-inner">
                        <h3 class="text-2xl text font-semibold mb-2">Featured Movie 2</h3>
                        <p class="text-sm text-zinc-400 mb-4">An intense drama full of emotional moments and
                            cliffhangers.</p>
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
                </div>
                <!-- Movie Card 3 -->
                <div class="bg-white rounded-xl shadow-md overflow-hidden max-w-xs w-full flex-shrink-0">
                    <img class="w-full h-56 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 3">
                    <div class="p-6 shadow-inner">
                        <h3 class="text-2xl text font-semibold mb-2">Featured Movie 3</h3>
                        <p class="text-sm text-zinc-400 mb-4">A high-paced action movie that keeps you at the edge of
                            your seat.</p>
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
                </div>
                <!-- Movie Card 4 -->
                <div class="bg-white rounded-xl shadow-md overflow-hidden max-w-xs w-full flex-shrink-0">
                    <img class="w-full h-56 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 2">
                    <div class="p-6 shadow-inner">
                        <h3 class="text-2xl text font-semibold mb-2">Featured Movie 2</h3>
                        <p class="text-sm text-zinc-400 mb-4">An intense drama full of emotional moments and
                            cliffhangers.</p>
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
                </div>
                <!-- Movie Card 5 -->
                <div class="bg-white rounded-xl shadow-md overflow-hidden max-w-xs w-full flex-shrink-0">
                    <img class="w-full h-56 object-cover" src="https://via.placeholder.com/400x600"
                         alt="Featured Movie Poster 2">
                    <div class="p-6 shadow-inner">
                        <h3 class="text-2xl text font-semibold mb-2">Featured Movie 2</h3>
                        <p class="text-sm text-zinc-400 mb-4">An intense drama full of emotional moments and
                            cliffhangers.</p>
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
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
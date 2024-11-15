@param String WebName

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> ${WebName} | Login</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        /* Simple transition for the view toggle */
        .transition-opacity {
            transition: opacity 0.5s ease-in-out;
        }

        .hidden {
            display: none;
        }
    </style>
</head>

<body class="bg-gradient-to-r from-gray-800 via-slate-600 to-gray-900 font-mono min-h-screen flex items-center justify-center">

    <div class="w-10/12 max-w-4xl bg-slate-800 rounded-lg shadow-2xl flex">
        <!-- Login Form Section -->
        <div id="loginForm" class="p-8 w-1/2 text-white transition-opacity">
            <h2 class="text-4xl font-bold text-center mb-6">${WebName}</h2>
            <!-- Added POST method and action to login -->
            <form method="post" action="/login" class="space-y-4">
                <!-- Username Input -->
                <div class="flex items-center border-b border-gray-600 py-2">
                    <i class="fas fa-user text-gray-400 mr-3"></i>
                    <input type="text" name="username" class="bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none" placeholder="Username" required>
                </div>
                <!-- Password Input -->
                <div class="flex items-center border-b border-gray-600 py-2">
                    <i class="fas fa-lock text-gray-400 mr-3"></i>
                    <input type="password" name="password" class="bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none" placeholder="Password" required>
                </div>
                <!-- Submit Button -->
                <button class="w-full mt-6 py-3 bg-indigo-600 hover:bg-indigo-500 text-white font-semibold rounded-lg flex items-center justify-center space-x-2 transition duration-200">
                    <span>Log In Now</span>
                    <i class="fas fa-chevron-right"></i>
                </button>
            </form>

            <!-- Social Login Section -->
            <div class="mt-8 text-center">
                <h3 class="text-sm text-gray-400 mb-4">Or log in via</h3>
                <div class="flex justify-center space-x-6">
                    <a href="#" class="text-gray-400 hover:text-pink-500 text-2xl transition-colors"><i class="fab fa-instagram"></i></a>
                    <a href="#" class="text-gray-400 hover:text-blue-600 text-2xl transition-colors"><i class="fab fa-facebook"></i></a>
                    <a href="#" class="text-gray-400 hover:text-blue-400 text-2xl transition-colors"><i class="fab fa-twitter"></i></a>
                </div>
            </div>
        </div>

        <!-- Register Form Section (Initially Hidden) -->
        <div id="registerForm" class="p-8 w-1/2 text-white transition-opacity hidden">
            <h2 class="text-4xl font-bold text-center mb-6">${WebName}</h2>
            <!-- Added POST method and action to register -->
            <form method="post" action="/register" class="space-y-4">
                <!-- Name Input -->
                <div class="flex items-center border-b border-gray-600 py-2">
                    <i class="fas fa-envelope text-gray-400 mr-3"></i>
                    <input type="text" name="name" class="bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none" placeholder="Name" required>
                </div>
                <!-- Username Input -->
                <div class="flex items-center border-b border-gray-600 py-2">
                    <i class="fas fa-user text-gray-400 mr-3"></i>
                    <input type="text" name="username" class="bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none" placeholder="Username" required>
                </div>
                <!-- Password Input -->
                <div class="flex items-center border-b border-gray-600 py-2">
                    <i class="fas fa-lock text-gray-400 mr-3"></i>
                    <input type="password" name="password" class="bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none" placeholder="Password" required>
                </div>
                <!-- Register Button -->
                <button class="w-full mt-6 py-3 bg-green-600 hover:bg-green-500 text-white font-semibold rounded-lg flex items-center justify-center space-x-2 transition duration-200">
                    <span>Register Now</span>
                    <i class="fas fa-user-plus"></i>
                </button>
            </form>
        </div>

        <!-- Register Prompt Section (Initially Visible) -->
        <div id="registerPrompt" class="p-8 w-1/2 flex flex-col justify-center items-center text-white border-l border-gray-700 transition-opacity">
            <h2 class="text-2xl font-semibold mb-4">Don’t have an account?</h2>
            <p class="text-gray-400 mb-8 text-center">Register now to join ${WebName} and enjoy exclusive content!</p>
            <button onclick="toggleView()" class="px-6 py-3 bg-green-500 hover:bg-green-400 text-white font-semibold rounded-lg transition duration-200">
                Register Now
            </button>
        </div>

        <!-- Login Prompt Section (Initially Hidden) -->
        <div id="loginPrompt" class="p-8 w-1/2 flex flex-col justify-center items-center text-white border-l border-gray-700 transition-opacity hidden">
            <h2 class="text-2xl font-semibold mb-4">Already have an account?</h2>
            <p class="text-gray-400 mb-8 text-center">Log in to access your account and continue exploring ${WebName}!</p>
            <button onclick="toggleView()" class="px-6 py-3 bg-indigo-500 hover:bg-indigo-400 text-white font-semibold rounded-lg transition duration-200">
                Log In
            </button>
        </div>
    </div>

    <script src="/asset/js/login-to-register.js"></script>

</body>

</html>

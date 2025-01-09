@param String WebName
@param String userAlreadyExist

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cinema Eudaemonia | Register</title>
    <link rel="icon" href="/image/favicon/eudaemonia.png">

    <!-- Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- Custom Styles -->
    <link rel="stylesheet" href="/asset/css/style.css">
</head>
<body class="bg-gray-100 font-avenir min-h-screen flex items-center justify-center">

<div class="w-10/12 h-96 max-w-4xl bg-gray-50 rounded-lg shadow-card flex flex-row">
    <!-- Register Form Section -->
    <div id="registerForm" class="p-8 w-full md:w-1/2 text-gray-900">
        <h2 class="text-4xl text-black font-bold text-center mb-6">${WebName}</h2>
        <form class="space-y-4" method="post" action="/register">
            <!-- Name Input -->
            <div class="flex items-center border-b border-gray-400 py-2">
                <i class="fas fa-envelope text-gray-400 mr-3"></i>
                <input type="text" name="name" class="w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none" placeholder="Name" required>
            </div>
            <!-- Username Input -->
            <div class="flex items-center border-b border-gray-400 py-2">
                <i class="fas fa-user text-gray-400 mr-3"></i>
                <input type="text" name="username" class="w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none" placeholder="Username" required>
            </div>
            <!-- Password Input -->
            <div class="flex items-center border-b border-gray-400 py-2">
                <i class="fas fa-lock text-gray-400 mr-3"></i>
                <input type="password" name="password" class="w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none" placeholder="Password" required>
            </div>
            <!-- Register Button -->
            <button class="w-full mt-6 py-3 bg-green-600 shadow-card hover:bg-green-500 text-white font-semibold rounded-lg flex items-center justify-center space-x-2 transition">
                <span>Register Now</span>
                <i class="fas fa-user-plus"></i>
            </button>
        </form>
    </div>

    <!-- Prompt Section -->
    <div id="loginPrompt" class="p-8 w-full md:w-1/2 flex flex-col justify-center items-center text-gray-900 border-t md:border-t-0 md:border-l border-gray-400">
        <h2 class="text-2xl text-black font-semibold mb-4">Already have an account?</h2>
        <p class="text-gray-400 mb-8 text-center">Log in to access your account and continue exploring Cinema Eudaemonia!</p>
        <a href="/login" class="px-6 py-3 bg-sky-500 hover:bg-sky-400 text-white font-semibold rounded-lg transition shadow-card">Log In</a>
    </div>
</div>

@if(userAlreadyExist != null)
    <div id="error-message" class="drop-shadow-md absolute top-5">
        <div class="bg-red-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Warning!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${userAlreadyExist}</p>
        </div>
    </div>
@endif

<!-- Custom JavaScript -->
<script src="/asset/js/login.js"></script>
</body>
</html>

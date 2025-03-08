@import com.movieonline.Online.Movie.entity.model.UserEntity
@import java.util.List

@param String WebName
@param String userHasBeenAdded
@param String userAlreadyExist
@param String updateAccountSuccess
@param String deleteUserConflict
@param String deleteUserSuccess
@param String searchFailedResult
@param Long adminCount
@param Long userCount
@param String getUsername
@param List<UserEntity> userList
@param List<UserEntity> searchedUser

<!doctype html>
<html lang="en" class="scroll-smooth">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Dashboard</title>
    <link rel="icon" href="/image/favicon/eudaemonia.png">

    <!-- Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- Custom Styles -->
    <link rel="stylesheet" href="/asset/css/style.css">
</head>
<body class="bg-gray-100">
<div class="flex">
    <div class="flex-initial" style="width:9.5vw;">
        <!-- Floating Sidebar -->
        <div class="fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20">
            <!-- Top Icons -->
            <ul class="space-y-6 text-center">
                <!-- Icon 1 -->
                <li>
                    <a href="/dashboard"
                       class="block text-black hover:text-sky-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-desktop text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="/dashboard/booking"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-book text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 3 -->
                <li>
                    <a href="#"
                       class="block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-users text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
            </ul>


            <!-- User Icon -->
            <div class="text-center w-full mt-auto relative">
                <a href="/"
                   class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200 ">
                    <i class="fas fa-home text-2xl"></i>
                </a>
                <div class="w-full h-px bg-black opacity-20 mb-1"></div>
                <button id="userButton" class="block size-8 drop-shadow-lg rounded-full focus:outline-none">
                    @for(UserEntity user : userList)
                        @if(user.getUsername().equals(getUsername))
                            @if(user.getProfilePicturePath() != null)
                                <img rel="icon" class="rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl hover:scale-110 transition duration-200"
                                     src="/image/${user.getId()}">
                            @else
                                <img rel="icon" class="rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl hover:scale-110 transition duration-200" src="/image/icon/user-icon.png">
                            @endif
                        @endif
                    @endfor
                </button>

                <div id="userPanel" class="absolute w-40 -left-1 -top-28 text-left bg-gray-50 rounded-lg shadow-md border border-gray-300 hidden">
                    <a href="/booking" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 rounded-t-lg cursor-pointer transition duration-300">Booking</a>
                    <a href="/account" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300">Account</a>
                    <div class="group">
                        <a id="openModal" class="block px-4 py-2 text-zinc-700 group-hover:bg-red-600 group-hover:text-white border-t border-t-gray-300 cursor-pointer rounded-b-lg transition duration-300">Logout</a>
                        <div class="absolute group-hover:border-t-red-600 left-2 -bottom-4 w-0 h-0 border-l-[13px] border-r-[13px] border-l-transparent border-r-transparent border-t-[16px] border-t-gray-50 drop-shadow-md transition duration-300"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="flex-initial mt-8 space-y-5" style="width:88vw;">
        <div class="flex mb-4">
            <h1 class="text-3xl font-semibold"><i class="fas fa-users mr-2"></i>User Management</h1>
            <div class="ml-auto flex">
                <form action="/api/search/user" method="get" class="flex">
                    <input type="text" name="username" placeholder="Search Username..."
                           class="px-4 py-2 text-gray-800 shadow-inner-lg rounded-lg focus:outline-none bg-gray-50 focus:ring-2 focus:ring-blue-400"/>
                    <div class="ml-3 mt-1 w-8">
                        @if(searchedUser == null)
                            <button type="submit" class="hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg">
                                <i class="fas fa-search text-sky-400 hover:text-yellow-500 text-2xl text-center"></i>
                            </button>
                        @else
                            <a href="/dashboard/users" class="hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg">
                                <i class="ml-1.5 fas fa-times text-red-600 hover:text-red-700 text-2xl text-center"></i>
                            </a>
                        @endif
                        <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                    </div>
                </form>
                <button id="addUserButton"
                        class="bg-green-500 hover:bg-green-600 active:bg-green-500 transition duration-300 rounded-lg p-2 px-3 ml-2 shadow-card text-white">
                    Add User
                </button>
            </div>
        </div>

        <!-- Add User section-->
        <div id="addUserSection" class="fixed hidden -inset-8 bg-black bg-opacity-50 flex justify-center items-center z-50">
            <!-- Form Container -->
            <div class="bg-gray-50 p-6 rounded-lg shadow-card w-96 relative">
                <!-- Close Button -->
                <button id="closeModal" class="absolute top-3 right-3 text-red-600 hover:text-red-700">
                    <i class="fas fa-times text-xl"></i>
                </button>

                <h2 class="text-2xl font-semibold text-gray-800 mb-4">Add User</h2>

                <form method="post" action="/register" enctype="multipart/form-data">

                    <!-- Name Input -->
                    <div class="mb-3">
                        <label class="block text-gray-700">Name:</label>
                        <input type="text" name="name" placeholder="Add Name..."
                               class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none" required>
                    </div>

                    <!-- Username Input -->
                    <div class="mb-3">
                        <label class="block text-gray-700">Username:</label>
                        <input type="text" name="username" placeholder="Add Username..."
                               class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none" required>
                    </div>

                    <!-- Password Input -->
                    <div class="mb-3">
                        <label class="block text-gray-700">Password:</label>
                        <input type="password" name="password" id="password" placeholder="Add Password..."
                               class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none" required>
                    </div>

                    <!-- Role Input -->
                    <div class="mb-3">
                        <label class="block text-gray-700">Role:</label>
                        <select id="user-role" name="isAdmin" class="w-full px-4 py-2 border bg-white rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none">
                            <option value="true">Admin</option>
                            <option value="false">User</option>
                        </select>
                    </div>

                    <!-- Profile Picture Upload -->
                    <div class="mb-3">
                        <label class="block text-gray-700">Profile Picture:</label>
                        <input type="file" name="profilePicture" accept="image/*"
                               class="w-full px-1 py-1 rounded-lg">
                    </div>

                    <!-- Buttons -->
                    <div class="flex justify-end space-x-2 mt-4">
                        <button type="button" id="cancelUpdate"
                                class="px-4 py-2 bg-red-600 text-white rounded-lg shadow-card hover:bg-red-700 transition duration-300 ">
                            Cancel
                        </button>
                        <button type="submit" id="submitUpdate"
                                class="px-4 py-2 bg-sky-400 text-white rounded-lg shadow-card hover:bg-sky-500 transition duration-300 ">
                            Save
                        </button>
                    </div>
                </form>
            </div>
        </div>

        <div>
            <table class="min-w-full table-auto bg-gray-50 shadow-inner-lg rounded-lg overflow-hidden">
                <thead>
                <tr class="w-full bg-gradient-to-r from-sky-400 to-blue-500 shadow-md border-b border-gray-300">
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">ID</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Name</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Username</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Profile Picture Path</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">User Role</th>
                    <th class="py-3 text-left text-gray-100 font-medium">Action</th>
                </tr>
                </thead>

                <tbody>
                @if(searchedUser != null)
                    @for(UserEntity user: searchedUser)
                        <tr class="hover:bg-gray-100 border-b border-gray-100">
                            <td class="py-4 px-6 text-gray-700">${user.getId()}</td>
                            <td class="py-4 px-6 text-gray-700">${user.getName()}</td>
                            <td class="py-4 px-6 text-gray-700">${user.getUsername()}</td>
                            @if(user.getProfilePicturePath() != null)
                                <td class="py-4 px-6 text-gray-700">
                                    <img rel="icon" class="rounded-full mr-2 size-10 bg-gray-500"
                                         src="/image/${user.getId()}">
                                </td>
                            @else
                                <td class="py-4 px-6 text-gray-700">
                                    <img rel="icon" class="rounded-full mr-2 size-10 bg-gray-500"
                                         src="/image/icon/user-icon.png">
                                </td>
                            @endif
                            @if(user.getIsAdmin() == true)
                                <td class="py-4 px-6 text-gray-700">Admin</td>
                            @else
                                <td class="py-4 px-6 text-gray-700">User</td>
                            @endif
                            <td class="py-4">
                                <button class="bg-orange-500 hover:bg-orange-400 active:bg-orange-500 transition duration-300 rounded-full p-2 px-5 shadow-card text-white">Edit</button>
                                <a href="/api/user/${user.getId()}/delete" class="bg-red-600 hover:bg-red-700 active:bg-red-600 transition duration-300 rounded-full p-2 px-3 shadow-card text-white">Delete</a>
                            </td>
                        </tr>
                    @endfor
                @else
                    @for(UserEntity users : userList)
                        <!-- Update User section-->
                        <div id="updateUserSection-${users.getId()}" class="fixed hidden -inset-8 bg-black bg-opacity-50 flex justify-center items-center z-50">
                            <!-- Form Container -->
                            <div class="bg-gray-50 p-6 rounded-lg shadow-card w-96 relative">
                                <!-- Close Button -->
                                <button onclick="document.getElementById('updateUserSection-${users.getId()}').classList.toggle('hidden')" class="absolute top-3 right-3 text-red-600 hover:text-red-700">
                                    <i class="fas fa-times text-xl"></i>
                                </button>

                                <h2 class="text-2xl font-semibold text-gray-800 mb-4">Update User</h2>

                                <form method="post" action="/api/user/update" enctype="multipart/form-data">
                                    <!-- Hidden Original Username -->
                                    <input type="text" name="originalUsername" value="${users.getUsername()}"
                                           class="hidden">

                                    <!-- Name Input -->
                                    <div class="mb-3">
                                        <label class="block text-gray-700">Name:</label>
                                        <input type="text" name="name" value="${users.getName()}"
                                               class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none">
                                    </div>

                                    <!-- Username Input -->
                                    <div class="mb-3">
                                        <label class="block text-gray-700">Username:</label>
                                        <input type="text" name="username" value="${users.getUsername()}"
                                               class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none">
                                    </div>

                                    <!-- Role Input -->
                                    <div class="mb-3">
                                        <label class="block text-gray-700">Role:</label>
                                        <select id="user-role" name="isAdmin" class="w-full px-4 py-2 border bg-white rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none">
                                            @if(users.getIsAdmin() == false)
                                                <option value="false">User</option>
                                                <option value="true">Admin</option>
                                            @else
                                                <option value="true">Admin</option>
                                                <option value="false">User</option>
                                            @endif
                                        </select>
                                    </div>

                                    <!-- Profile Picture Upload -->
                                    <div class="mb-3">
                                        <label class="block text-gray-700">Profile Picture:</label>
                                        <input type="file" name="profilePicture" accept="image/*"
                                               class="w-full px-1 py-1 rounded-lg">
                                    </div>

                                    <!-- Buttons -->
                                    <div class="flex justify-end space-x-2 mt-4">
                                        <button type="button" onclick="document.getElementById('updateUserSection-${users.getId()}').classList.toggle('hidden')"
                                                class="px-4 py-2 bg-red-600 text-white rounded-lg shadow-card hover:bg-red-700 transition duration-300 ">
                                            Cancel
                                        </button>
                                        <button type="submit" id="submitUpdate"
                                                class="px-4 py-2 bg-sky-400 text-white rounded-lg shadow-card hover:bg-sky-500 transition duration-300 ">
                                            Save
                                        </button>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <tr class="hover:bg-gray-100 border-b border-gray-100">
                            <td class="py-4 px-6 text-gray-700">${users.getId()}</td>
                            <td class="py-4 px-6 text-gray-700">${users.getName()}</td>
                            <td class="py-4 px-6 text-gray-700">${users.getUsername()}</td>
                            @if(users.getProfilePicturePath() != null)
                                <td class="py-4 px-6 text-gray-700">
                                    <img rel="icon" class="rounded-full mr-2 size-10 bg-gray-500"
                                         src="/image/${users.getId()}">
                                </td>
                            @else
                                <td class="py-4 px-6 text-gray-700">
                                    <img rel="icon" class="rounded-full mr-2 size-10 bg-gray-500"
                                         src="/image/icon/user-icon.png">
                                </td>
                            @endif
                            @if(users.getIsAdmin() == true)
                                <td class="py-4 px-6 text-gray-700">Admin</td>
                            @else
                                <td class="py-4 px-6 text-gray-700">User</td>
                            @endif
                            <td class="py-4">
                                <button onclick="document.getElementById('updateUserSection-${users.getId()}').classList.toggle('hidden')"
                                        class="bg-orange-500 hover:bg-orange-400 active:bg-orange-500 transition duration-300 rounded-full p-2 px-5 shadow-card text-white">Edit</button>
                                <a href="/api/user/${users.getId()}/delete" class="bg-red-600 hover:bg-red-700 active:bg-red-600 transition duration-300 rounded-full p-2 px-3 shadow-card text-white">Delete</a>
                            </td>
                        </tr>
                        <script>
                            document.getElementById("updateUserSection-${users.getId()}").addEventListener("click", function (event) {
                                if (event.target === this) {
                                    this.classList.add("hidden");
                                }
                            });
                        </script>
                    @endfor
                @endif
                </tbody>
            </table>
        </div>
    </div>
</div>

@if(deleteUserSuccess != null)
    <div id="success-message-delete-valid" class="drop-shadow-md absolute top-5 left-[39vw]">
        <div class="bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Success!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${deleteUserSuccess}</p>
        </div>
    </div>
@endif

@if(deleteUserConflict != null)
    <div id="error-message-delete-invalid" class="drop-shadow-md fixed top-5 left-[40vw]">
        <div class="bg-red-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Warning!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${deleteUserConflict}</p>
        </div>
    </div>
@endif

@if(userAlreadyExist != null)
    <div id="error-message-add-invalid" class="drop-shadow-md fixed top-5 left-[45vw]">
        <div class="bg-red-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Warning!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${userAlreadyExist}</p>
        </div>
    </div>
@endif

@if(userHasBeenAdded != null)
    <div id="success-message-add-valid" class="drop-shadow-md fixed top-5 left-[40vw]">
        <div class="bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Success!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${userHasBeenAdded}</p>
        </div>
    </div>
@endif

@if(updateAccountSuccess != null)
    <div id="success-message-update-valid" class="drop-shadow-md absolute top-5 left-[39vw]">
        <div class="bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Success!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${updateAccountSuccess}</p>
        </div>
    </div>
@endif

<!-- Modal -->
@template.include.modal.logout-modal()
<!-- Custom JavaScript -->
<script>
    const addUserButton = document.getElementById('addUserButton');
    const addUserSection = document.getElementById('addUserSection');

    addUserButton.addEventListener('click', () => {
        addUserSection.classList.toggle('hidden');
    });

     document.getElementById("closeModal").addEventListener("click", function () {
        document.getElementById("addUserSection").classList.add("hidden");
    });

    document.getElementById("cancelUpdate").addEventListener("click", function () {
        document.getElementById("addUserSection").classList.add("hidden");
    });

    document.getElementById("addUserSection").addEventListener("click", function (event) {
        if (event.target === this) {
            this.classList.add("hidden");
        }
    });
</script>
<script src="/asset/js/error-message.js"></script>
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/modal.js"></script>
</body>
</html>
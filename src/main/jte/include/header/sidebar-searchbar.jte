<!-- Icon 3 with Search Bar Dropdown -->
<li class="relative">
  <a href="#" id="searchIcon"
     class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md">
    <i id="searchIconSymbol" class="fas fa-search text-2xl"></i>
  </a>
  <div class="w-full h-px bg-black opacity-20 mt-1"></div>

  <!-- Search bar dropdown -->
  <div id="searchBar" class="absolute overflow-hidden hidden bg-black/60 rounded-lg shadow-2xl py-3
     border-b-4 border-b-black/30" style="top: -8.78rem; left: -70.4rem; width:87.6vw; height:92vh;">
<%--    <div class="bg-gradient-to-r from-sky-400 to-blue-500 absolute top-0 left-0" style="width:24vw; height:6vh;border-radius: 0 0 30px 0;"></div>--%>
    <form id="searchForm" class="flex p-3 rounded-lg shadow-card bg-gray-50 shadow-card mx-auto w-2/5" method="get">
      <input type="text" id="name" name="name" placeholder="Search..." class="p-2 border border-gray-300 w-full rounded-md focus:outline-none"/>
      <div class="ml-3 mt-1 w-8">
        <button type="button" id="searchButton" class="hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg">
          <i class="fas fa-search text-sky-400 hover:text-yellow-400 text-2xl"></i>
        </button>
        <div class="w-full h-px bg-black opacity-20 mt-1"></div>
      </div>
    </form>
    <div class=" overflow-scroll p-4 h-full" style="height: calc(91vh - 5rem);">
      <div  id="movieResults"  class="grid grid-cols-3 gap-4">
        <!-- Movies Results will appear in here -->
      </div>
    </div>
  </div>
</li>
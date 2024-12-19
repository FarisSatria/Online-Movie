document.getElementById('searchIcon').addEventListener('click', function (event) {
    event.preventDefault(); // Prevent default behavior
    const searchBar = document.getElementById('searchBar');
    const searchIconSymbol = document.getElementById('searchIconSymbol');

    // Toggle the visibility of the search bar
    searchBar.classList.toggle('hidden');
    searchBar.classList.toggle('translate-x-full');

    // Toggle the icon
    if (searchIconSymbol.classList.contains('fa-search')) {
        searchIconSymbol.classList.remove('fa-search');
        searchIconSymbol.classList.remove('text-black');
        searchIconSymbol.classList.add('fa-question');
        searchIconSymbol.classList.add('text-yellow-400');
        searchIconSymbol.classList.add('hover:text-sky-400');
    } else {
        searchIconSymbol.classList.remove('fa-question');
        searchIconSymbol.classList.add('fa-search');
        searchIconSymbol.classList.remove('fa-question');
        searchIconSymbol.classList.remove('text-yellow-400');
        searchIconSymbol.classList.remove('hover:text-sky-400');
    }
});

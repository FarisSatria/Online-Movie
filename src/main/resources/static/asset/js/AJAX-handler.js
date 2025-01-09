const searchButton = document.getElementById('searchButton');
const resetButton = document.getElementById('resetButton');
const searchForm = document.getElementById('searchForm');
const resultsContainer = document.getElementById('movieResults');

function performSearch() {
    const formData = new FormData(searchForm);
    const name = formData.get('name');

    resultsContainer.innerHTML = '';

    fetch(`/api/search/movies?name=${encodeURIComponent(name)}`, {
        method: "GET"
    })
        .then(response => response.json())
        .then(data => {
            if (data.length === 0) {
                resultsContainer.innerHTML = '<p class="relative bg-gray-50 rounded-xl flex shadow-card overflow-hidden max-w-sm w-full text-center text-2xl font-semibold p-4 flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2">No Results Found</p>';
            } else {
                data.forEach(movie => {
                    const movieHTML = `
                        <a href="/movie/${movie.id}" class="relative border-l-sky-400 border-l-4 pl-2 border-b border-b-zinc-600/10 flex overflow-hidden w-full w-full h-40 flex-shrink-0 transition-transform transform hover:scale-95 hover:rotate-1">
                            <img class="w-28 h-full object-cover" src="https://image.tmdb.org/t/p/w185${movie.poster_path}" alt="${movie.title}">
                            <div class="p-4 space-y-1" style="height:90%;">
                                <h3 class="text-xl text-black font-semibold">${movie.title}</h3>
                                <div class="flex space-x-1 flex-warp">
                                    <p class="text-md text-zinc-400 py-1">${movie.adultFormatted}</p>
                                    <p class="text-md text-zinc-400 p-1">• ${movie.release_date}</p>
                                </div>
                                <div class="text-sm text-zinc-500 relative overflow-hidden max-h-24 text-ellipsis">${movie.overview}</div>
                            </div>
                        </a>
                    `;
                    resultsContainer.innerHTML += movieHTML;
                });
            }
        })
        .catch(error => {
            console.error('Error fetching movies:', error);
            resultsContainer.innerHTML = '<p class="relative bg-gray-50 rounded-xl flex shadow-card overflow-hidden max-w-sm w-full text-center text-2xl font-semibold p-4 flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2">Error occurred while fetching results</p>';
    });
    searchButton.classList.add('hidden');
    resetButton.classList.remove('hidden');
}

searchButton.addEventListener('click', performSearch);

searchForm.addEventListener('keydown', function(event) {
    if (event.key === 'Enter') {
        event.preventDefault();
        performSearch();
    }
});

resetButton.addEventListener('click', function (event) {

    searchButton.classList.remove('hidden');
    resetButton.classList.add('hidden');
    resultsContainer.innerHTML = '';
});


document.getElementById('bookNow').addEventListener('click', function (event) {
    const bookingSection = document.getElementById('scrollToBehaviour');

    bookingSection.classList.toggle('hidden');

});


const customDateSelect = document.getElementById('custom-date');
const customTimeSelect = document.getElementById('custom-time');

function formatDate(date) {
    const options = { weekday: 'long', day: 'numeric' };
    return date.toLocaleDateString('en-US', options);
}

const today = new Date();
for (let i = 0; i < 7; i++) {
    const futureDate = new Date();
    futureDate.setDate(today.getDate() + i);
    const option = document.createElement('option');
    option.value = futureDate.toISOString().split('T')[0];
    option.textContent = formatDate(futureDate);
    customDateSelect.appendChild(option);
}

function populateTimeDropdown() {
    const startTime = 9;
    const endTime = 18;
    const interval = 2;
    const currentDate = today.toISOString().split('T')[0];

    customTimeSelect.innerHTML = '';

    const selectedDate = customDateSelect.value;

    const now = new Date();

    for (let hour = startTime; hour <= endTime; hour += interval) {
        const time = new Date();
        time.setHours(hour, 0, 0, 0);

        if (selectedDate === currentDate && time < now) {
            continue;
        }

        const option = document.createElement('option');
        const timeString = time.toLocaleTimeString('en-US', { hour: '2-digit', minute: '2-digit', hour12: true });
        option.value = time.toISOString().split('T')[1].substring(0, 5);
        option.textContent = timeString;
        customTimeSelect.appendChild(option);
    }
}

populateTimeDropdown();

customDateSelect.addEventListener('change', populateTimeDropdown);
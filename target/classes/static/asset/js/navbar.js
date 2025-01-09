document.getElementById('userButton').addEventListener('click', function (event) {
    event.preventDefault();
    const userPanel = document.getElementById('userPanel');

    userPanel.classList.toggle('hidden');

    userPanel.addEventListener('click', () => {
        userPanel.classList.toggle('hidden');
    });
});


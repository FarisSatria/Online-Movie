const modal = document.getElementById('logoutModal');
const openModal = document.getElementById('openModal');
const cancelButton = document.getElementById('cancelButton');
const logoutButton = document.getElementById('logoutButton');

openModal.addEventListener('click', () => {
    modal.classList.remove('hidden');
});

cancelButton.addEventListener('click', () => {
    modal.classList.add('hidden');
});

modal.addEventListener('click', () => {
    modal.classList.add('hidden');
});
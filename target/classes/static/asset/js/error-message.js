window.addEventListener('DOMContentLoaded', (event) => {
    const errorMessageElement = document.getElementById('error-message');

   if (errorMessageElement) {
       setTimeout(() => {
           errorMessageElement.style.transition = 'opacity 0.5s';
           errorMessageElement.style.opacity = 0;

           setTimeout(() => {
               errorMessageElement.classList.add('hidden');
           }, 500);
       }, 1500);
   }

});
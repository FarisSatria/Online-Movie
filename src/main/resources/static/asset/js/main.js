        // JavaScript to toggle between login and register views
        function toggleView() {
        	const loginForm = document.getElementById('loginForm');
        	const registerForm = document.getElementById('registerForm');
        	const registerPrompt = document.getElementById('registerPrompt');
        	const loginPrompt = document.getElementById('loginPrompt');

        	// Toggle visibility between login and register sections
        	loginForm.classList.toggle('hidden');
        	registerForm.classList.toggle('hidden');
        	registerPrompt.classList.toggle('hidden');
        	loginPrompt.classList.toggle('hidden');
        }


       const prevButton = document.getElementById('prev');
       const nextButton = document.getElementById('next');
       const carousel = document.getElementById('carousel');
       const slides = carousel.children;
       let currentSlide = 0;

       // Only run if there are slides
       if (slides.length > 0) {
           // Set the carousel width based on the number of slides
           carousel.style.width = `${slides.length * 100}%`;

           const nextSlide = () => {
               currentSlide = (currentSlide + 1) % slides.length;
               updateCarousel();
           };

           const prevSlide = () => {
               currentSlide = (currentSlide - 1 + slides.length) % slides.length;
               updateCarousel();
           };

           const updateCarousel = () => {
               const slideWidth = 100 / slides.length; // Calculate the width of each slide
               carousel.style.transform = `translateX(-${currentSlide * slideWidth}%)`;
           };

           nextButton.addEventListener('click', nextSlide);
           prevButton.addEventListener('click', prevSlide);
       } else {
           // Hide buttons if no slides
           prevButton.style.display = 'none';
           nextButton.style.display = 'none';
       }

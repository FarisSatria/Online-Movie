  const animateShape4 = document.querySelector('.screen__background__shape1');
  const startAnimationLink = document.getElementById('animateStart');

  startAnimationLink.addEventListener('click', function(event) {
    event.preventDefault();

    animateShape4.style.animation = 'login_to_register 2s ease-in-out forwards';
  });

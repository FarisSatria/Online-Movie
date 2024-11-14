  const animateShape4 = document.querySelector('.screen__background__shape1');
  const animateRegister = document.querySelector('.register')
  const startAnimationLink = document.getElementById('animateStart');

  startAnimationLink.addEventListener('click', function(event) {
    event.preventDefault();

    animateShape4.style.animation = 'login_to_register_1 2s ease-in-out forwards';
    animateRegister.style.animation = 'login_to_register_2 2s ease-in-out forwards'
  });

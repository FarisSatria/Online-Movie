@param String WebName

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>${WebName} | Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="/asset/css/style.css">
</head>
<body class="bg-dark">
<nav class="navbar navbar-expand-lg navbar-dark py-3 position-fixed top-0 w-100 backdrop-blur shadow"
     style="z-index:1050">
    <div class="container-fluid">
        <div class="container">
            <div class="row">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mb-2 mb-lg-0 col">
                        <a class="navbar-brand fs-5" href="#">${WebName}</a>
                    </ul>
                    <ul class="navbar-nav mb-2 mb-lg-0 col">
                        <li class="nav-item">
                            <a class="nav-link active fs-7" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link fs-7" href="#">Movies</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link fs-7" href="#">Trending</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle fs-7" href="#" id="navbarDropdown" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Genre
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item fs-7" href="#">Action</a></li>
                                <li><a class="dropdown-item fs-7" href="#">Another action</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item fs-7" href="#">Something else here</a></li>
                            </ul>
                        </li>
                    </ul>
                    <div class="navbar-nav mb-2 mb-lg-0 col ml-5">
                        <form class="d-flex">
                            <input class="form-control ms-5 me-2" type="search" placeholder="Search"
                                   aria-label="Search">
                            <button class="btn btn-outline-light" type="submit">Search</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</nav>
<div class="d-flex">
    <div id="carouselExampleCaptions" class="carousel slide rounded ms-4 overflow-hidden" data-bs-ride="carousel"
         style="z-index:1; height: 75vh; width: 70vw; margin-top:10vh; border-radius:50px;">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
                    aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                    aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                    aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner h-100">
            <div class="carousel-item active h-100">
                <img src="/image/background/l-lawliet-5120x2880-23817.jpg" class="d-block w-100 h-100"
                     alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>First slide label</h5>
                    <p>Some representative placeholder content for the first slide.</p>
                </div>
            </div>
            <div class="carousel-item h-100">
                <img src="/image/background/Kakegurui.jpg" class="d-block w-100 h-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Second slide label</h5>
                    <p>Some representative placeholder content for the second slide.</p>
                </div>
            </div>
            <div class="carousel-item h-100">
                <img src="/image/background/opm.jpeg" class="d-block w-100 h-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Third slide label</h5>
                    <p>Some representative placeholder content for the third slide.</p>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
                data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
                data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
    <div class="" style="width:30vw; margin-top:10vh;">
        <div class="ms-5 w-75">
            <h3 class=" text-white ">Top Trending!</h3>
            <div class="card mb-2">
                <img class="rounded shadow card-img-top" src="/image/background/kiki.jpg">
                <div class="card-body">
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's content.</p>
                </div>
            </div>
            <div class="card mb-2">
                <img class="rounded shadow card-img-top" src="/image/background/kiki.jpg">
                <div class="card-body">
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's content.</p>
                </div>
            </div>
            <div class="card mb-2">
                <img class="rounded shadow card-img-top" src="/image/background/kiki.jpg">
                <div class="card-body">
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's content.</p>
                </div>
            </div>
            <div class="card mb-2">
                <img class="rounded shadow card-img-top" src="/image/background/kiki.jpg">
                <div class="card-body">
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's content.</p>
                </div>
            </div>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>

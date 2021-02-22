<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  
    <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
    integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    
      <!-- Bootstap jQuery Library -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
    
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
    crossorigin="anonymous"></script>
    
  <link rel="stylesheet" href="resources/css/style.css">
  
  <link rel="icon" href="resources/image/favicon.ico" type="image/x-icon">
  
   <!-- Font Awesome -->
  <script src="https://kit.fontawesome.com/12a453b66f.js" crossorigin="anonymous"></script>

  <!-- Google Fonts -->
  <link rel="preconnect" href="https://fonts.gstatic.com">
  <link
    href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap"
    rel="stylesheet">
  
  <script src="resources/js/hotel-search.js"></script>
  
  <title>HOTEL-RESERVATION</title>
  
</head>
<body>

<header>

<h1>Hotel Reservation System</h1>

</header>

<section id="content">

<div class="row">
<div class="col-lg-4 align-content-center">
<div class="search-box">
 <div class="title"> <h2>Search Hotel</h2> </div>
 <form action="#">
 <div class="form-group">
    <label for="select-city"> City </label>
    <select class="form-control" id="select-city">
    <option> -- Select City -- </option>
    </select>
  </div>
  
   <div class="form-group">
    <label for="select-hotel"> Hotel </label>
    <select class="form-control" id="select-hotel">
    <option> -- Select Hotel -- </option>
    </select>
  </div>
  
  <div class="form-group">
    <label for="select-hotel"> Date </label>
    <input type="date" class="form-control" id="select-hotel">
  </div>
  
  <button class="btn btn-primary text-light btn-lg mt-3" type="submit"> Check Availability </button>
  
 </form>
</div>
</div>
</div>

</section>

<footer>


    <i class="fab fa-twitter custom-ico"></i> <i class="fab fa-facebook-f custom-ico"></i> <i class="fab fa-instagram custom-ico"></i> <i
      class="fas fa-envelope-square custom-ico"></i>

    <p class="copy-right">© Copyright 2021 Hotel Reservation</p>

</footer>
  
</body>
</html>
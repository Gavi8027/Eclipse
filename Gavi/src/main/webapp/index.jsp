<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    
 </head>


<body>

      <nav class="navbar navbar-Light bg-dark"> 
     <div class="container-fluid">
      <span class="navbar-brand mb-0 h1">
       
               <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="50" height="30">
          
      </div>
      </nav>
      
      <h1> getting data from Gavi</h1>
      
      <form action="sending">
<h6>Gmail :${kalisu}</h6>
<input type="submit" value="Gmail">
</form>
<form action="mb">
<h6>Mobile number :${nbr}</h6>
<input type="submit" value="MobileNUmber">
</form>
<form action="guritiniCheete">
<h6>Aadhar :${aadhar}</h6>
<input type="submit" value="Aadhar">
</form>
<form action="shata">
<h6>Age :${Vayasu}</h6>
<input type="submit" value="Age">
</form>
<form action="birth">
<h6>DateOfBirth :${tariku}</h6>
<input type="submit" value="Dob">
</form>
<form action="pagara">
<h6>Desired Salary :${payment}</h6>
<input type="submit" value="Salary">
</form>

<form action="dosta">
<h2>Dispaly friends</h2>
<input type="submit" value="dosta">
<ul>
<c:forEach items="${friends}" var="ski">
<li>${ski}</li> 
</c:forEach>
</ul>
</form>

<form action="koushyla">
<h2>Dispaly Skills</h2>
<input type="submit" value="skiils">
<ul>
<c:forEach items="${skills}" var="fri">
<li>${fri}</li> 
</c:forEach>
</ul>
</form>

<form action="stala">
<h2>Dispaly Places</h2>
<input type="submit" value="Places">
<ul>
<c:forEach items="${wonder}" var="places">
<li>${places}</li> 
</c:forEach>
</ul>
</form>


<form action="vidye" method="get">
<h6>Education</h6>
<input type="submit" value="click"/></br>
<label>SchoolName: ${education.schoolName }</label></br>
<label> puClgName: ${education.puClgName}</label></br>
<label>degreeClgName : ${education.degreeClgName }</label></br>
<label> sslcPercentage: ${education.sslcPercentage}</label></br>
<label>puPercentage : ${education.puPercentage}</label></br>
<label> degreePercentage: ${education.degreePercentage }</label></br>
<label> schoolLocation : ${education.schoolLocation}</label></br>
<label> clgLocation: ${education.clgLocation}</label></br>
<label> degreeLocation: ${education.degreeLocation }</label></br>
<label>schoolRank  : ${education.schoolRank}</label></br>

</form>

<form action="kutumba">
<h6>Family Details :${family}</h6>
<input type="submit" value="click"/></br>
<label> Fname: ${dto.Fname }</label></br>
<label>Mname : ${dto.Mname }</label></br>
<label> BrotherName: ${dto.BrotherName }</label></br>
<label>UncleName : ${dto.UncleName }</label></br>
<label>AuntyName : ${dto.AuntyName }</label></br>
<label>Bname : ${dto.Bname }</label></br>
<label>noOfChildrens : ${dto.noOfChildrens }</label></br>
<label>sonInLwa : ${dto.sonInLwa }</label></br>
<label>sisterInLaw : ${dto.sisterInLaw }</label></br>
<label>Sname : ${dto.Sname }</label></br>
</form>

<form action="duravani">
<h6>Mobile Details </h6>
<input type="submit" value="click"/></br>
<label>Name : ${mobile.name }</label></br>
<label>CompanyName : ${mobile.companyName }</label></br>
<label>Color : ${mobile.color }</label></br>
<label>Price : ${mobile.price }</label></br>
<label>Ram : ${mobile.ram }</label></br>
</form>

<form action="wine">
<h6>Beverge Details </h6>
<input type="submit" value="click"/></br>
<label> Brand: ${beverages.brand }</label></br>
<label>Name : ${beverages.name }</label></br>
<label>Color : ${beverages.color }</label></br>
<label>Flevour : ${beverages.flevour }</label></br>
<label>NotGoodForHealth : ${beverages.notGoodForHealth }</label></br>
<label> GoodForHealth: ${beverages.goodForHealth }</label></br>
<label> Rating: ${beverages.rating }</label></br>
<label> Price: ${beverages.price }</label></br>
</form>

<form action="snacks">
<h6>Chats Details : ${beverges}</h6>
<input type="submit" value="click"/></br>
<label>name : ${chat.name }</label></br>
<label>fromState : ${chat.price }</label></br>
<label>cook : ${chat.sweet }</label></br>
<label> hotel: ${chat.color }</label></br>
<label>area : ${chat.flevour }</label></br>
<label> mainIngredient: ${chat.tasty }</label></br>
<label> taste: ${chat.rating }</label></br>
<label> worthy: ${chat.notGood }</label></br>
<label> ratings: ${chat.combination }</label></br>
<label>wantAgain : ${chat.kaara }</label></br>

      </form>
  



</body>
</html>
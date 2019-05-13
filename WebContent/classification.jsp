<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="fragment/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="col-md-9">

<button class="btn btn-success" type="submit" style="float:right"  data-toggle="modal" data-target="#exampleModal">Add New</button>


</br>
<table class="table">
  <thead class="thead-light">
    <tr>
      <th scope="col">Classification_ID</th>
      <th scope="col">Sub Classification Name</th>
   
      <th scope="col">Description</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">001</th>
      <td>maths</td>
      <td>dynamic</td>

       <td><button class="btn btn-primary" type="submit">edit</button>
       <button class="btn btn-danger" type="submit">delete</button>
       </td>
      
    </tr>
    <tr>
      <th scope="row">002</th>
      <td>maths</td>
      <td>vector</td>

       <td><button class="btn btn-primary" type="submit">edit</button>
        <button class="btn btn-danger" type="submit">delete</button></td>
    </tr>
    <tr>
      <th scope="row">003</th>
      <td>maths</td>
      <td>modelling</td>
 
       <td><button class="btn btn-primary" type="submit">edit</button>
        <button class="btn btn-danger" type="submit">delete</button></td>
    </tr>
  </tbody>
</table>




</div>
</div>

</div>


<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Add New Book</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form id= "classificationform">
  <div class="form-group">
    <label for="exampleInputEmail1">Classification Id</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Id">
    <small id="emailHelp" class="form-text text-muted">hii... let's move on Classification Name...</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Classification Name</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="Enter Name">
  </div>
 
  
</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-success">Submit</button>
      </div>
    </div>
  </div>
</div>

<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
 
</body>
</html>
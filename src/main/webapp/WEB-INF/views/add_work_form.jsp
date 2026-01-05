<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>


<style>

html, body {
    height: 100%;
    margin: 0;
    padding: 0;
    background: url('<c:url value="/images/BG3.jpg" />')
                no-repeat center center fixed !important;
    background-size: cover !important;
}

.container {
    background: rgba(0,0,0,0.25) !important;
    backdrop-filter: blur(8px);
    border-radius: 16px;
    padding: 30px;
    border: 1px solid rgba(255,255,255,0.18);
}

.table-dark { background-color: rgba(0,0,0,0.45) !important; }
.table thead th { background-color: rgba(0,0,0,0.6) !important; }
.table td { background-color: rgba(0,0,0,0.25) !important; }

legend {
    color: #e50914; /* Netflix red */
    font-weight: bold;
    text-shadow:
        0 0 3px rgba(229, 9, 20, 0.6),
        0 0 6px rgba(229, 9, 20, 0.4);
    letter-spacing: 0.5px;
}

label {
    color: white !important;
}


</style>


</head>
<body>

<div class="d-flex justify-content-center align-items-center min-vh-100">
  <form action="handleWorks" method="post" novalidate style="width:320px;">
    <fieldset class="border rounded p-3">
      <legend class="fw-bold px-2">Work Details</legend>

      <div class="mb-3">
        <label for="work" class="form-label">Work</label>
        <input type="text" id="work" name="work" class="form-control" placeholder="Work Title" required>
      </div>

      <div class="mb-3">
        <label for="description" class="form-label">Description</label>
        <textarea id="description" name="description" rows="3" class="form-control" placeholder="Write the work details" required></textarea>
      </div>

      <div class="mb-3">
        <label for="date" class="form-label">Date</label>
        <input type="date" id="date" name="date" class="form-control" required>
      </div>

      <div class="mb-3">
        <label for="startTime" class="form-label">Start Time</label>
        <input type="time" id="startTime" name="startTime" class="form-control" required>
      </div>

      <div class="mb-3">
        <label for="endTime" class="form-label">End Time</label>
        <input type="time" id="endTime" name="endTime" class="form-control" required>
      </div>

      <div class="d-flex justify-content-between">
        <a href="${pageContext.request.contextPath }/" class="btn btn-secondary">Back</a>
        <button type="submit" class="btn btn-primary">Save</button>
      </div>

    </fieldset>
  </form>
</div>

</body>
</html>

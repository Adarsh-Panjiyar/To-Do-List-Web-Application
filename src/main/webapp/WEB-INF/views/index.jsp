<html>

<%@ include file="/WEB-INF/views/base.jsp" %>

<style>

html, body {
    height: 100%;
    margin: 0;
    padding: 0;
    background: url('<c:url value="/images/BG2.jpg" />')
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

h2.text-center {
    color: #e50914; /* Netflix red */
    font-weight: bold;
    text-shadow:
        0 0 3px rgba(229, 9, 20, 0.6),
        0 0 6px rgba(229, 9, 20, 0.4);
    letter-spacing: 1px;
}


</style>

<body>

<div class="container mt-5">

    <h2 class="text-center mb-4">TO-DOS</h2>

    <table class="table table-dark table-striped table-bordered text-center align-middle">
        <thead>
            <tr>
                <th>ID</th>
                <th>Work</th>
                <th>Description</th>
                <th>Date</th>
                <th>Start Time</th>
                <th>End Time</th>
                <th>Actions</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="item" items="${works}">
                <tr>
                    <td>WORK_${item.id}</td>
                    <td>${item.work}</td>
                    <td>${item.description}</td>
                    <td>${item.date}</td>
                    <td>${item.startTime}</td>
                    <td>${item.endTime}</td>
                    <td>
                        <a href="delete/${item.id}">
                            <i class="fa-solid fa-trash-can text-danger" style="font-size:25px;"></i>
                        </a>
                        <a href="update/${item.id}">
                            <i class="fa-regular fa-pen-to-square" style="font-size:25px;"></i>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <div class="text-center mt-3">
        <a href="./add-work" class="btn btn-success">Add Task</a>
    </div>

</div>

</body>
</html>

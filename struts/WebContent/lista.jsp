<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
	Lista de contatos:<br/>
	<c:forEach var="contato" items="${contatos}">
		${contato.id} - ${contato.nome}  (<a href="removeContato.do?contato.id=${contato.id}">remover</a>) <br/>
	</c:forEach>
</body>
</html>

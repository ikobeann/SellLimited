<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	
</script>
</head>
<body>

<form action="member/memberIns.sf" method="POST">
	<button>회원가입</button>
</form>

<form action="member/login.sf" method="POST">
	<button>로그인</button>
	<%-- <%= request.getAttribute("mem_name") %> --%>
</form>

<form action="member/memberUpd.sf" method="POST">
	<button>수정</button>
</form>

<form action="member/memberDel.sf" method="get">
	<button>삭제</button>
</form>

<form action="member/memberList.sf?mem_id=test" method="get">
	<button>리스트</button>
</form>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
	* {box-sizing: border-box}
	body {font-family: "Lato", sans-serif;}
	
	/* Style the tab */
	.tab {
	  float: left;
	  border: 1px solid #ccc;
	  background-color: #f1f1f1;
	  width: 15%;
	  height: 1000px;
	}
	
	/* Style the buttons inside the tab */
	.tab button {
	  display: block;
	  background-color: inherit;
	  color: black;
	  padding: 22px 16px;
	  width: 100%;
	  border: none;
	  outline: none;
	  text-align: left;
	  cursor: pointer;
	  transition: 0.3s;
	  font-size: 17px;
	}
	
	/* Change background color of buttons on hover */
	.tab button:hover {
	  background-color: #ddd;
	}
	
	/* Create an active/current "tab button" class */
	.tab button.active {
	  background-color: #ccc;
	}
	
	/* Style the tab content */
	.tabcontent {
	  float: left;
	  padding: 0px 12px;
	  border: 1px solid #ccc;
	  width: 85%;
	  border-left: none;
	  height: 1000px;
	}
</style>
</head>
<body>
<!-- MyPage-Header-->
	<div class="container">
		<div class="row">
			<div class="col">
				<img src="index.gif" class="rounded" width="428" height="160">
			</div>
			<div class="col" style="align-content: right">
				<nav class="navbar navbar-expand-sm bg-light navbar-light">
				  <ul class="navbar-nav">
				    <li class="nav-item active">
				      <a class="nav-link" href="#">로그아웃</a>
				    </li>
				    <li class="nav-item">
				      <a class="nav-link" href="#">배송정보</a>
				    </li>
				    <li class="nav-item">
				      <a class="nav-link" href="#">충전하기</a>
				    </li>
				    <li class="nav-item">
				      <a class="nav-link" href="main.jsp">시작화면</a>
				    </li>
				  </ul>
				</nav>
			</div>
		</div>
	</div>
<!-- /MyPage-Header-->
<!-- MyPage-Body -->
	<div class="container-fluid">
		<div class="row">
		<!-- 배너 삽입 column -->
			<div class="col-sm-1">
			</div>
			<div class="col-sm-10">
				<div class="tab">
				  <button class="tablinks" onclick="openCity(event, 'memberUpdate')">회원 정보 수정</button>
				  <button class="tablinks" onclick="openCity(event, 'insertProducts')">회원 상품 등록</button>
				  <button class="tablinks" onclick="openCity(event, 'memberAccount')">회원 계좌 정보</button>
				  <button class="tablinks" onclick="openCity(event, 'joinSeeds')" id="defaultOpen">참여 시드 정보</button>
				  <button class="tablinks" onclick="openCity(event, 'winningProducts')">낙찰 상품 조회</button>
				  <button class="tablinks" onclick="openCity(event, 'deliveryService')">상품 배송 정보</button>
				  <button class="tablinks" onclick="openCity(event, 'customerService')">고객 센터 문의</button>
				</div>
				<div id="memberUpdate" class="tabcontent">
					<h1>memberUpdate.jsp</h1>
				</div>
				<div id="insertProducts" class="tabcontent">
					<%@include file="myProductInsert.jsp"%>
				</div>
				<div id="memberAccount" class="tabcontent">
					<h1>memberAccount.jsp</h1>
				</div>
				<div id="joinSeeds" class="tabcontent">
					<h1>joinSeeds.jsp</h1>
				</div>
				<div id="winningProducts" class="tabcontent">
					<h1>winningProducts.jsp</h1>
				</div>
				<div id="deliveryService" class="tabcontent">
					<h1>deliveryService.jsp</h1>
				</div>
				<div id="customerService" class="tabcontent">
<!--  -->
					<div class="container-fluid">
						<!-- Nav tabs -->
						<ul class="nav nav-tabs" role="tablist">
							<li class="nav-item">
								<a class="nav-link" data-toggle="tab" href="#noticeBoard">공지사항</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" data-toggle="tab" href="#FAQ">자주 묻는 질문</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" data-toggle="tab" href="#messageBoard">게시판</a>
							</li>
						</ul>
						<!-- Tab panes -->
						<div class="tab-content">
							<div id="noticeBoard" class="container tab-pane fade">
							
							</div>
							<div id="FAQ" class="container tab-pane fade">
							
							</div>
							<div id="messageBoard" class="container tab-pane fade">
								<jsp:include page="CS_board.jsp" flush="false"/>
							</div>
						</div>
					</div>
<!--  -->
				</div>
			</div>
		<!-- 배너 삽입 column-->
			<div class="col-sm-1">
			</div>
		</div>
	</div>
<!-- /MyPage-Body -->
<!-- MyPage-Footer -->
	<div class="container">	
	</div>
<!-- /MyPage-Footer -->
<script>
	function openCity(evt, cityName) {
	  var i, tabcontent, tablinks;
	  tabcontent = document.getElementsByClassName("tabcontent");
	  for (i = 0; i < tabcontent.length; i++) {
	    tabcontent[i].style.display = "none";
	  }
	  tablinks = document.getElementsByClassName("tablinks");
	  for (i = 0; i < tablinks.length; i++) {
	    tablinks[i].className = tablinks[i].className.replace(" active", "");
	  }
	  document.getElementById(cityName).style.display = "block";
	  evt.currentTarget.className += " active";
	}
	
	// Get the element with id="defaultOpen" and click on it
	document.getElementById("defaultOpen").click();
</script>
</body>
</html>
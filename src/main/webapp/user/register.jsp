<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="zh"><head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>注册</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()+"/css/bootstrap.min.css"%>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()+"/css/demo.css"%>" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand">项目风险管理系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="<%=request.getContextPath()+"/user/login.jsp"%>">登录</a></li>
            <li><a href="<%=request.getContextPath()+"/user/register.jsp"%>">注册</a></li>
          </ul>
          
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">

        
        <div class="col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4 main">
          <h2 class="sub-header">注册</h2>

          <s:form role="form" action="register" method="post">
            <div class="form-group">
              <input type="email" class="form-control" id="exampleInputEmail1" name="username" placeholder="用户名">
            </div>
            <div class="form-group">
              <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="密码">
            </div>
            <div class="form-group">
              <input type="password" class="form-control" id="exampleInputPassword1" name="passwordTwo" placeholder="确认密码">
            </div>
            <button type="submit" class="btn btn-block btn-default submit-button">注册</button>
          </s:form>

          

        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="<%=request.getContextPath()+"/js/bootstrap.min.js"%>"></script>
  


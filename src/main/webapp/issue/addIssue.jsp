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

    <title>新建风险</title>

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
                <li><a href="#"><%=session.getAttribute("user")%></a></li>
            <li><s:a href="logout.action">退出登录</s:a></li>
            </ul>

        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">

        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
            <li><s:a href="my.action"><span class="glyphicon glyphicon-dashboard"></span> 我的工作台</s:a></li>
            <li><s:a href="summary.action"><span class="glyphicon glyphicon-stats"></span> 风险概述</s:a></li>
            <li><s:a href="all.action"><span class="glyphicon glyphicon-th-list"></span> 风险列表</s:a></li>
            <li class="active"><a href="<%=request.getContextPath()+"/issue/addIssue.jsp"%>" ><span class="glyphicon glyphicon-pencil"></span> 新建风险</a></li>
            </ul>
        </div>

        <div class="container main">
            <div class="row clearfix">
                <div class="col-md-10 column col-md-offset-2">
                    <s:form class="form-horizontal" role="form" action="create" method="post">
                        <h2 class="sub-header">新建风险</h2>
                        <div class="form-group">
                            <label for="issue_content" class="col-sm-2 control-label">项目</label>
                            <div class="col-sm-8">
                                <input class="form-control" name="project" id="issue_content" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="discription" class="col-sm-2 control-label">风险内容</label>
                            <div class="col-sm-8">
                                <textarea class="form-control" name="content" id="discription" rows="4"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">可能性</label>
                            <div class="col-sm-4">
                                <select name="possibility" class="form-control">
                                    <option value="高">高</option>
                                    <option value="中">中</option>
                                    <option value="低">低</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">影响程度</label>
                            <div class="col-sm-4">
                                <select name="seriousness" class="form-control">
                                    <option value="高">高</option>
                                    <option value="中">中</option>
                                    <option value="低">低</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="trigger" class="col-sm-2 control-label">阈值</label>
                            <div class="col-sm-4">
                                <input class="form-control" name="triggerY" id="trigger" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="follower" class="col-sm-2 control-label">跟踪者</label>
                            <div class="col-sm-4">
                                <input class="form-control" name="tracker" id="follower" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-primary" style="float:right">创建</button>
                            </div>
                        </div>
                    </s:form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="<%=request.getContextPath()+"/js/bootstrap.min.js"%>"></script>



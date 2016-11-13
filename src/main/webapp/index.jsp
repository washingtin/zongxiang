<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html style="overflow-x:auto;overflow-y:auto;">
<head>
    <meta charset="UTF-8">
    <title>Basic Layout - jQuery EasyUI Demo</title>
    <meta name="author" content="http://www.jeenet.com/"/>
    <meta name="renderer" content="webkit"><meta http-equiv="X-UA-Compatible" content="IE=8,IE=9,IE=10" />
    <meta http-equiv="Expires" content="0"><meta http-equiv="Cache-Control" content="no-cache"><meta http-equiv="Cache-Control" content="no-store">
    <c:set var="ctxStatic" value="/static/"/>

    <link href="/static/jquery-easyui-1.5/themes/default/easyui.css" type="text/css" rel="stylesheet" />
    <link href="/static/jquery-easyui-1.5/themes/icon.css" type="text/css" rel="stylesheet" />
    <link href="/static/jquery-easyui-1.5/demo/demo.css" type="text/css" rel="stylesheet" />
    <script src="/static/jquery-easyui-1.5/jquery.min.js" type="text/javascript"></script>
    <script src="/static/jquery-easyui-1.5/jquery.easyui.min.js" type="text/javascript"></script>

</head>
<body>
<h2>Basic Layout</h2>
<p>The layout contains north,south,west,east and center regions.</p>
<div style="margin:20px 0;"></div>
<div class="easyui-layout" style="width:700px;height:350px;">
    <div data-options="region:'north'" style="height:50px"></div>
    <div data-options="region:'south',split:true" style="height:50px;"></div>
    <div data-options="region:'west',split:true" title="菜单栏" style="width:100px;">
        <div class="easyui-accordion" data-options="fit:true,border:false">
            <div title="Title1" style="padding:10px;">
                content1
            </div>
            <div title="Title2" data-options="selected:true" style="padding:10px;">
                content2
            </div>
            <div title="Title3" style="padding:10px">
                content3
            </div>
        </div>
    </div>
    <div data-options="region:'center',title:'内容区',iconCls:'icon-ok'">
        <table class="easyui-datagrid"
               data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
            <thead>
            <tr>
                <th data-options="field:'itemid'" width="80">Item ID</th>
                <th data-options="field:'productid'" width="100">Product ID</th>
                <th data-options="field:'listprice',align:'right'" width="80">List Price</th>
                <th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
                <th data-options="field:'attr1'" width="150">Attribute</th>
                <th data-options="field:'status',align:'center'" width="60">Status</th>
            </tr>
            </thead>
        </table>
    </div>
</div>

</body>
</html>

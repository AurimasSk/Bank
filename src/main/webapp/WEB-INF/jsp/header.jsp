<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
	   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	   <link rel="stylesheet" href="template/css/screen.css" type="text/css" media="screen" title="default" />
	   <title>Headeris</title>
	   
	   <style>
			.title {
				color: #FFFFFF;
			}
		</style>
	</head>
	
	<body>
		
		<!-- Start: page-top-outer -->
		<div id="page-top-outer">    
		
			<!-- Start: page-top -->
			<div id="page-top">
			
				<!-- start logo -->
				<div id="logo" class="title">
					<a href=""><h1 class="title">Taupyklė</h1></a>
				</div>
				<!-- end logo -->
				
<!-- 				 start top-search
				<div id="top-search">
					<table border="0" cellpadding="0" cellspacing="0">
					<tr>
					<td><input type="text" value="Search" onblur="if (this.value=='') { this.value='Search'; }" onfocus="if (this.value=='Search') { this.value=''; }" class="top-search-inp" /></td>
					<td>
					<select  class="styledselect">
						<option value=""> All</option>
						<option value=""> Products</option>
						<option value=""> Categories</option>
						<option value="">Clients</option>
						<option value="">News</option>
					</select> 
					</td>
					<td>
					<input type="image" src="images/shared/top_search_btn.gif"  />
					</td>
					</tr>
					</table>
				</div> -->
			 	<!--  end top-search -->
			 	<div class="clear"></div>
			
			</div>
			<!-- End: page-top -->
		
		</div>
		<!-- End: page-top-outer -->
		
		<div class="clear">&nbsp;</div>
		
		<div id="menu">
			<jsp:include page="menu.jsp"/>
		</div>
		
	</body>
</html>
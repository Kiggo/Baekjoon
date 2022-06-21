<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
https://map.kakao.com/?itemId=9913121
<div id="map" style="width:500px;height:400px;"></div>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=205d2bb79b4a30e7954cec890e8a340b&libraries=services,clusterer,drawing"></script>

<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(36.3388857, 127.3930745),
			level: 3
		};

		var map = new kakao.maps.Map(container, options);
		var markerPosition = new kakao.maps.LatLng(36.3388857, 127.3930745);
		
		var marker = new kakao.maps.Marker({
			position: markerPosition
		});
		
		marker.setMap(map);
	</script>
</body>
</html>

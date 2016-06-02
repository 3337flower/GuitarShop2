/**
 * 
 */
function search(){
	var builder=$("#builder").val();
	var type=$("#type").val();
	var backWood=$("#backWood").val();
	var topWood=$("#topWood").val();
	var numStrings=$("#numStrings").val();
	var model=$("#model").val();
	$.getJSON("../search",{Builder:builder,Type:type,BackWood:backWood,TopWood:topWood,numStrings:numStrings,Model:model}, function(json) {
		var html="";
			for(var i=0;i<json.length;i++){
				html+="<tr><td>"+json[i].serialNumber+"</td><td>"+json[i].builder+"</td><td>"+json[i].model+"</td><td>"+json[i].type+"</td>";
				html+="<td>"+json[i].numStrings+"</td><td>"+json[i].topwood+"</td><td>"+json[i].backwood+"</td><td>"+json[i].price+"</td></tr>";
			}
			alert(html);
		$("#guitarsearch").append(html);
	});
}
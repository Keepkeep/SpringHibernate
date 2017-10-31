/**
 * 
 */
var app = angular.module('myApp', []);
app.controller('formCtrl', function($scope,$http) {
    $scope.dlyz=function(){
        console.log($scope.name)
    	 $http({
    	        method: 'POST',
    	        url: 'http://localhost:8080/xmu/denglu.sw',
    	        data:{userName:$scope.name,userPwd:$scope.pwd}
    //	        headers: { 'Content-Type': 'application/x-www-form-urlencoded' }
    	    }).then(function successCallback(response) {
    	    	console.log('成功');
    	            $scope.names = response.data.result;
    	    	console.log($scope.names);
    	    	if($scope.names=="NO"){
    	    	 	console.log('!');
    	    	}else if ($scope.names!=null&&$scope.names!="NO") {
    	    		console.log("Y "+$scope.names);
    	   		//window.location.href = "index.html?name="+$scope.names;
    	    	//	$.post("index.html", { name: "John", time: "2pm" } );
				}
    	    	
    	        }, function errorCallback(response) {
    	            // 请求失败执行代码
    	    });
    };
//    $scope.dlyz();
});
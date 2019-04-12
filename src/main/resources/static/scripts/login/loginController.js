ims.controller("loginController", ['$scope', '$log', 'RestService','$location', function ($scope, $log, RestService, $location) {

    var init = function () {
        $scope.test = 'app started';
        $log.log($scope.test);
    };

    init();

    $scope.authenticateUser = function () {
        $log.log("strating athentication process");

        $scope.user = {
            "username": $scope.username,
            "password": $scope.password
        };
        RestService.authenticateUser($scope.user).then(
            function successCallback(response) {
                if (response.status == 200) {
                    $log.log("a");
                    $location.path('/dashboard');
                    $log.log("a");
                } else {
                    $log.log("Success" + response);
                }
            },
            function errorCallback(response) {
                $log.log("Error");
            }
        );

    }

}]);
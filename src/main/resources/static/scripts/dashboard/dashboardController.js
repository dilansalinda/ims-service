ims.controller("dashboardController", ['$scope', '$log', 'RestService', function ($scope, $log, RestService) {

    var init = function () {

        $scope.test = 'app started';
        $log.log($scope.test);

        // RestService.getAllUsers().then(
        //     function successCallback(response) {
        //         $log.log("Success" + response);
        //     },
        //     function errorCallback(response) {
        //         $log.log("Error");
        //     }
        // );
    };

    init();

    // $scope.authenticateUser = function () {
    //     $log.log("strating athentication process");

    //     $scope.user = {
    //         "username": $scope.username,
    //         "password": $scope.password
    //     };
    //     RestService.authenticateUser($scope.user).then(
    //         function successCallback(response) {
    //             if (response.status == 200) {
    //                 $log.log("Success" + response);
    //             } else {
    //                 $log.log("Success" + response);
    //             }
    //         },
    //         function errorCallback(response) {
    //             $log.log("Error");
    //         }
    //     );

    // }

}]);
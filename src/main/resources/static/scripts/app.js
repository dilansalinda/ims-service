var ims = angular.module('ims-web', ['ngRoute']).

config(['$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {

    $routeProvider.
    when('/dashboard', {templateUrl: 'views/dashboard.html',   controller: dashboardController}).
    when('/phones/:phoneId', {templateUrl: 'partials/phone-detail.html', controller: PhoneDetailCtrl}).
    otherwise({redirectTo: '/'});

    $locationProvider.html5Mode(true);

}]);
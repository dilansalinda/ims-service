ims.config(function($routeProvider) {

    $routeProvider.when("/", {
      templateUrl : "/index.html",
      controller: "loginController"
    }).when("/dashboard", {
      templateUrl : "/dashboard.html"
    });

    // $stateProvider
    // .state('login', {
    //   url : '/login',
    //   templateUrl : '/login.html',
    //   controller : '/scripts/login/loginController.js'
    // })
    // .state('dashboard', {
    //   url : '/dashboard',
    //   templateUrl : '/dashboard.html',
    //   controller : '/scripts/dashboard/dashboardController.js'
    // });
});
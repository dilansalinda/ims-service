ims.factory("RestService", function ($http) {
    var service = {};
    var hostName = "http://localhost:8090/";
    var urlBase = "api/";

//     var auth =
//         $base64.encode("dilan:123"),
//         headers = {
//             "Authorization": "Basic " + "ZGlsYW46MTIz"
//         };

    service.authenticateUser = function (user) {
        return $http ({
            method:'POST',
            url:hostName + urlBase + "login",
            headers : { 'Content-Type' : 'application/json' },
            data: {user}
        })
    };

    // service.getAllUsers = function () {
    //     return $http.get(hostName + urlBase + "alluser");
    // };

    return service;
});
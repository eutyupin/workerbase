(function () {
    angular
        .module('worker', ['ngRoute'])
        .config(config);

    function config($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'welcome/welcome.html',
                controller: 'welcomeController'
            })
            .when('/emploees', {
                templateUrl: 'emploees/emploees.html',
                controller: 'emploeesController'
            })
            .when('/positions', {
                templateUrl: 'positions/positions.html',
                controller: 'positionsController'
            })
            .when('/orders', {
                templateUrl: 'orders/orders.html',
                controller: 'ordersController'
            })
            .otherwise({
                redirectTo: '/'
            });
    }
})();
angular.module('worker').controller('indexController', function ($rootScope, $scope, $http, $location) {
});
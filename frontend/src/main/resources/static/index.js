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
            .when('/employees', {
                templateUrl: 'employees/employees.html',
                controller: 'employeesController'
            })
            .when('/positions', {
                templateUrl: 'positions/positions.html',
                controller: 'positionsController'
            })
            .when('/personalcards', {
                templateUrl: 'personalcards/personalcards.html',
                controller: 'personalcardsController'
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
angular.module('worker').controller('emploeesController', function ($scope, $http) {
    $scope.loadProducts = function () {
        $http.get('http://localhost:5555/core/api/v1/products')
            .then(function (response) {
                $scope.products = response.data;
            });
    };

    // $scope.loadProducts();
});
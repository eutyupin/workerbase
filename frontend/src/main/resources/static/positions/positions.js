angular.module('worker').controller('positionsController', function ($scope, $http, $localStorage) {

    $scope.loadCart = function () {
        $http.get('http://localhost:5555/cart/api/v1/cart/' + $localStorage.marchMarketGuestCartId)
            .then(function (response) {
                $scope.cart = response.data;
            });
    };
});
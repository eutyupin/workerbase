angular.module('worker').controller('personalcardsController', function ($scope, $http) {
    $scope.loadCards = function () {
        $http.get('http://localhost:8189/worker-back/api/employees')
            .then(function (response) {
                alert('OK')
                // $scope.cards = response.data;
            });
    };
    $scope.loadCards();
});
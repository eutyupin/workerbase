angular.module('worker').controller('personalcardsController', function ($scope, $http) {
    $scope.loadCards = function () {
        $http.get('http://localhost:8189/worker-back/api/employees')
            .then(function (response) {
                $scope.personalCardsList = response.data;
            });
    };

    $scope.loadCards();
});
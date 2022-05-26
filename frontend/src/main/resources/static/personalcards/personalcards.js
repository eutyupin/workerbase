angular.module('worker').controller('personalcardsController', function ($scope, $http) {
    $scope.loadCards = function () {
        $http.get('http://localhost:9999/worker-back/api/personalcards')
            .then(function (response) {
                $scope.personalCardsList = response.data;
            });
    };

    $scope.loadCards();
});
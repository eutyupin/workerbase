angular.module('worker').controller('positionsController', function ($scope, $http) {

    $scope.loadPositions = function () {
        $http.get('http://localhost::9999/worker-back/api/positions')
            .then(function (response) {
                $scope.positionsList = response.data;
            });
    };
    $scope.loadPositions();
});
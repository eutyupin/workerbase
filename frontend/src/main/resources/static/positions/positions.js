angular.module('worker').controller('positionsController', function ($scope, $http) {

    $scope.loadPositions = function () {
        $http.get('http://localhost:8189/worker-back/api/positions')
            .then(function (response) {
                $scope.positionsList = response.data;
            });
    };

    $scope.loadCategories = function () {
        $http.get('http://localhost:8189/worker-back/api/categories')
            .then(function (response) {
                $scope.categoriesList = response.data;
            });
    };

    $scope.deletePosition = function (id) {
        $http.delete('http://localhost:8189/worker-back/api/positions/' + id)
            .then(function (response) {
                $scope.loadPositions();
            });
    }
    $scope.createNewPosition = function () {
        $http.post('http://localhost:8189/worker-back/api/positions', $scope.newPosition)
            .then(function (responce) {
                $scope.loadPositions();
                $scope.newPositionCategory.title = '';
                $scope.newPositionTitle.title = '';
            });
    }

    $scope.loadPositions();
    $scope.loadCategories();
});
angular.module('worker').controller('emploeesController', function ($scope, $http) {
    $scope.loadEmploees = function () {
        $http.get('http://localhost:9999/worker-back/api/emploees')
            .then(function (response) {
                $scope.emploeeList = response.data;
            });
    };

    $scope.loadEmploees();
});
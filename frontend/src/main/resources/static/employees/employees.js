angular.module('worker').controller('employeesController', function ($scope, $http) {
    $scope.loadEmployees = function () {
        $http.get('http://localhost:8189/worker-back/api/employees')
            .then(function (response) {
                $scope.employeeList = response.data;
            });
    };
    $scope.loadEmployees();
});
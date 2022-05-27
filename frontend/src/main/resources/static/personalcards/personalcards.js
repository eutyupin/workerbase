angular.module('worker').controller('personalcardsController', function ($scope, $http) {
    $scope.loadCards = function () {
        $http.get('http://localhost:8189/worker-back/api/employees')
            .then(function (response) {
                $scope.cardsList = response.data;
            });
    };

    $scope.loadPositions = function () {
        $http.get('http://localhost:8189/worker-back/api/positions')
            .then(function (response) {
                $scope.positionsList = response.data;
            });
    };

    $scope.loadGenders = function () {
        $http.get('http://localhost:8189/worker-back/api/genders')
            .then(function (response) {
                $scope.gendersList = response.data;
            });
    };

    $scope.deleteEmployee = function (id) {
        $http.delete('http://localhost:8189/worker-back/api/employees/' + id)
            .then(function (response) {
                $scope.loadCards();
            });
    }

    $scope.createNewEmployee = function () {
        alert($scope.newEmployee.fio);
        $http.post('http://localhost:8189/worker-back/api/employees', $scope.newEmployee)
            .then(function (responce) {
                $scope.loadCards();
                $scope.newEmployeeFio.title = '';
                $scope.newEmployeeAge.value= null;
                $scope.newEmployeePosition.value= '';
                $scope.newEmployeeGender.value= '';
                $scope.newEmployeeAddress.value= '';
            });
    }


    $scope.loadCards();
    $scope.loadGenders();
    $scope.loadPositions();
});
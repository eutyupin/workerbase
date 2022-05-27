angular.module('worker').controller('categoriesController', function ($scope, $http) {

    $scope.loadCategories = function () {
        $http.get('http://localhost:8189/worker-back/api/categories')
            .then(function (response) {
                $scope.categoriesList = response.data;
            });
    };

    $scope.deleteCategory = function (id) {
        $http.delete('http://localhost:8189/worker-back/api/categories/' + id)
            .then(function (response) {
                $scope.loadCategories();
            });
    }

    $scope.createNewCategory = function () {
        $http.post('http://localhost:8189/worker-back/api/categories', $scope.newCategory)
            .then(function (responce) {
                $scope.loadCategories();
                $scope.newCategory.title = '';
                $scope.newCategoryTitle.title.clear;
            });
    }

    $scope.loadCategories();
});
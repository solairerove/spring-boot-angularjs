'use strict';

woodstock.controller('ModelListController', ['$scope', '$location', '$routeParams', 'ModelService',
    function ($scope, $location, $routeParams, ModelService) {
        ModelService.query(function (data) {
            $scope.models = data;
        })
    }
]);

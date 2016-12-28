'use strict';

woodstock.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'app/components/model/model-list.html',
            controller: 'ModelListController'
        })
        .otherwise({
            template: '<h1>Fuck off!!!</h1>'
        });
}]);

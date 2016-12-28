'use strict';

woodstock.factory('ModelService', ['$resource', function ($resource) {
    return $resource('/api/models');
}]);

'use strict';

/**
 * The root BookUnityApp module.
 *
 * @type {BookUnityApp|*|{}}
 */
var BookUnityApp = BookUnityApp || {};

/**
 * @ngdoc module
 * @name BookUnityControllers
 *
 * @description
 * Angular module for controllers.
 *
 */
BookUnityApp.controllers = angular.module('bookUnityControllers', ['ui.bootstrap']);

/**
 * @ngdoc controller
 * @name RootCtrl
 *
 * @description
 * The root controller having a scope of the body element and methods used in the application wide
 * such as user authentications.
 *
 */
BookUnityApp.controllers.controller('RootCtrl', function ($scope, $location, oauth2Provider) {

    /**
     * Returns if the viewLocation is the currently viewed page.
     *
     * @param viewLocation
     * @returns {boolean} true if viewLocation is the currently viewed page. Returns false otherwise.
     */
    $scope.isActive = function (viewLocation) {
        return viewLocation === $location.path();
    };

});


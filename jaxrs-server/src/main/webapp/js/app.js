'use strict';

/**
 * @ngdoc object
 * @name BookUnityApp
 * @requires $routeProvider
 * @requires bookUnityControllers
 * @requires ui.bootstrap
 *
 * @description
 * Root app, which routes and specifies the partial html and controller depending on the url requested.
 *
 */
var app = angular.module('BookUnityApp',
    ['bookUnityControllers', 'ngRoute', 'ui.bootstrap']).
    config(['$routeProvider',
        function ($routeProvider) {
            $routeProvider.
                when('/catalog', {
                    templateUrl: '/partials/catalogPage.html',
                    //controller: 'CatalogCtrl'
                }).
                when('/about', {
                    templateUrl: '/partials/aboutPage.html',
                    //controller: 'AboutCtrl'
                }).
                when('/signin', {
                    templateUrl: '/partials/signinPage.html',
                    //controller: 'SigninCtrl'
                }).
                when('/signup', {
                    templateUrl: '/partials/signupPage.html',
                    //controller: 'SignupCtrl'
                }).
                when('/setup', {
                    templateUrl: '/partials/setAccountPage.html',
                    //controller: 'SetAccountCtrl'
                }).
                when('/dashboard', {
                    templateUrl: '/partials/accountPage.html',
                    //controller: 'DashboardCtrl'
                }).
                when('/myBooks', {
                    templateUrl: '/partials/myBooksPage.html',
                    //controller: 'myBooksCtrl'
                }).
                when('/addBook', {
                    templateUrl: '/partials/addBook.html',
                    //controller: 'myBooksCtrl'
                }).
                when('/profile', {
                    templateUrl: '/partials/profilePage.html',
                    //controller: 'ProfileCtrl'
                }).
                when('/', {
                    templateUrl: '/partials/homePage.html'
                }).
                otherwise({
                    redirectTo: '/'
                });
        }]);
/**
 * @ngdoc constant
 * @name HTTP_ERRORS
 *
 * @description
 * Holds the constants that represent HTTP error codes.
 *
 */
app.constant('HTTP_ERRORS', {
    'UNAUTHORIZED': 401
});

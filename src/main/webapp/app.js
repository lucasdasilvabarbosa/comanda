var appComanda = angular.module('app',
    ['ngNewRouter',
     'ngMaterial',
     'ngAria',
     'ngAnimate',
     'app.login']);

appComanda.controller('appController', ['$scope','$http', "$router",appController]);

function appController($scope,$http,$router) {
    $router.config([
        {path: '/', redirectTo: '/home'},
        {path: '/', components:'home'},
        {path: '/login', components: 'login'}
    ])
}




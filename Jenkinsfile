pipeline {
    agent any
    stages {
        stage ('Inicio') {
            steps {
                bat 'echo inicio'
            }
        }

        stage ('Executando testes JUnit 5') {
            steps {
                bat 'mvn clean test'
                bat 'xcopy allure-report\\history allure-results /E /Q /Y'
            }
            post {
                always {
                     bat script: 'xcopy allure-report\\history allure-results /E /Q /Y', label: 'Copy Allure History to Results'
                     allure([
                     includeProperties: false,
                     jdk: '',
                     properties: [],
                     reportBuildPolicy: 'ALWAYS',
                     results: [[path: 'allure-results']],

                     ])
                }
            }
        }
    }
}

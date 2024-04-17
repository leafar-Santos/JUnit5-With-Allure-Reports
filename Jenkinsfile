pipeline {
    agent any
    stages {
        stage('Inicio') {
            steps {
                bat 'echo inicio'
            }
        }
        stage('Executando testes JUnit 5') {
            steps {
                bat 'mvn clean test'
            }
            post {
                always {
                allure ([
                includeProperties: false,
                jdk: '',
                results: [[path: 'allure-results']]]),
                clean:true
                }
            }
        }
    }
}

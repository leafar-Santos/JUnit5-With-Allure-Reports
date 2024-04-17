pipeline {
    agent any
    stages{
        stage ('Inicio'){
            steps{
                bat 'echo inicio'
            }
        }
        stage ('Executando testes JUnit 5'){
            steps{
             bat 'mvn clean test'
            }
        }
        stage('Allure Reports') {
            steps{
            allure includeProperties:
                   false,
                   jdk: '',
                   results: [[path: 'build/allure-results']]
            }
        }
        stage ('Fim'){
                    steps{
                    bat 'echo fim'
                    }
                }
    }
}
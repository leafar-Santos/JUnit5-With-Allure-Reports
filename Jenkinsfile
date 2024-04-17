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
        stage('Generate Allure Report') {
                    steps {
                        script {
                                allure([
                                    includeProperties: false,
                                    jdk: '',
                                    properties: [],
                                    reportBuildPolicy: 'ALWAYS',
                                    results: [[path: 'allure-results']]
                                ])
                        }
                    }

        stage ('Fim'){
                    steps{
                    bat 'echo fim'
                    }
                }
    }
}
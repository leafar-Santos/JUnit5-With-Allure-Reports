pipeline {
    agent any
    stages {
        stage ('Inicio') {
            steps {
                sh'echo inicio'
            }
        }

        stage ('Executando testes JUnit 5') {
            steps {
                bat 'mvn clean install'

            }
            post {
                always {
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

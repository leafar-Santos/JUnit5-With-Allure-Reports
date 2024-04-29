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
                bat 'mvn clean install'

            }
            post {
                always {
                     allure([
                     includeProperties: false,
                     jdk: '',
                     properties: [],
                     reportBuildPolicy: 'ALWAYS',
                     results: [[path: 'allure-results']]
                     ])
                }
            }
        }
        stage('Performance-test') {
            steps {
                // Aqui você executa o segundo job
                script {
                    // Executar o Job2
                    build job: 'Pipeline_Performance'
                }
            }
        }
    }
}
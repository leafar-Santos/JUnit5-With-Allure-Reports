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
            }
            post {
                always {
                    // Limpar a pasta de resultados antigos
                    bat 'rm -rf allure-results'
                    // Gerar o relatório do Allure
                    allure([
                        includeProperties: false,
                        jdk: '',
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'allure-results']]
                    ])
                }
            }
        }
    }
}

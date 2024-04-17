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
                    // Gerar relatório Allure e atualizar Trends de execução de teste
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/allure-results']]
                    ])
                    // Arquivar e substituir histórico de tendência do Allure
                    artifacts: 'allure-report/history-trend.json'
                }
            }
        }
    }
}

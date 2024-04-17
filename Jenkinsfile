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
                    // Gerar relatório Allure
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/allure-results']]
                    ])
                    // Copiar a pasta 'history' para 'allure-results' para atualizar a tendência
                    script {
                        bat 'xcopy /s /e allure-report\\history allure-results\\history'
                    }
                }
            }
        }
    }
}

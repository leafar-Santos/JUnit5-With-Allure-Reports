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
                // Gerar relatório Allure com a opção --clean
                bat 'allure generate allure-results --clean -o allure-report'
                // Copiar a pasta 'history' para 'allure-results' para atualizar a tendência
                bat 'xcopy /s /e allure-report\\history allure-results\\history'
            }
            post {
                always {
                    // Arquivar relatório Allure
                    archiveArtifacts artifacts: 'allure-report'
                }
            }
        }
    }
}

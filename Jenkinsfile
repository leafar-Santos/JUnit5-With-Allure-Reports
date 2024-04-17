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
                    // Gerar relatório Allure com a opção --clean
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/allure-results']],
                        clean: true
                    ])
                    // Publicar resultados do Allure
                    publishHTML(target: [allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: 'target/allure-report', reportFiles: 'index.html'], reportName: 'Allure Test Report')
                }
            }
        }
    }
}

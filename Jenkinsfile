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
                    // Excluir a pasta 'allure-reports' antes de gerar o relatório
                
                    bat 'rmdir /S /Q allure-reports'

                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        report: 'allure-report',
                        results: [[path:'allure-results']]
                    ])
                }
            }
        }
    }
}

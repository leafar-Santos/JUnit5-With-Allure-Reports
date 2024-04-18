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
                    // Excluir a pasta 'allure-report' antes de gerar o relatório
                    bat 'rmdir /S /Q allure-report'

                    // Gerar o relatório Allure
                    bat 'allure generate allure-results --clean'

                    // Incluir os resultados dos testes no relatório Allure
                    allure includeProperties: false,
                          jdk: '',
                          results: [[path: 'allure-results']]
                }
            }
        }
    }
}

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

                // Copiar a pasta 'history' para dentro de 'allure-results'
                bat 'xcopy /E /I target\\allure-report\\history allure-results\\history'
            }
            post {
                always {
                    // Excluir a pasta 'allure-report' antes de gerar o relatório
                    bat 'rmdir /S /Q target\\allure-report'

                    // Gerar o relatório Allure
                    bat 'allure generate allure-results --clean -o target\\allure-report'

                    // Incluir os resultados dos testes no relatório Allure
                    allure([
                        includeProperties: false,
                        jdk: '',
                        results: [[path: 'allure-results']]
                    ])
                }
            }
        }
    }
}

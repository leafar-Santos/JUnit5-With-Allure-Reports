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
                    // Remover resultados antigos do Allure
                    deleteDir(dir: 'allure-results')

                    // Gerar relatório Allure
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

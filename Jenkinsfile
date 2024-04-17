pipeline {
    agent any
    stages {
        stage ('Inicio') {
            steps {
                bat 'echo inicio'
            }
        }
        stage ("Executando testes JUnit 5") {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    // Garantir que o relatório anterior seja removido
                    cleanWs()
                }
            }
        }
        stage('Gerando report') {
            steps {
                // Gerar o relatório do Allure
                bat 'allure generate --clean -o allure-report allure-results'
            }
        }
    }
}

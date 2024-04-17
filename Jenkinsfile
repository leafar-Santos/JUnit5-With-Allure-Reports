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
                // Limpar a pasta de resultados antigos
                bat 'rm -rf allure-results'
                // Executar os testes
                bat 'mvn test'
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

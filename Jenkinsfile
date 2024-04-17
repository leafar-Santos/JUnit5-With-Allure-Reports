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
                // Copiar resultados antigos do Allure para um diretório temporário
                sh 'cp -r allure-results allure-results-temp || :'
                bat 'mvn clean test'
            }
            post {
                always {
                    // Remover resultados antigos do Allure
                    deleteDir()

                    // Copiar resultados da execução atual de volta para o diretório allure-results
                    sh 'mv allure-results-temp allure-results'
                }
            }
        }
    }
    post {
        always {
            // Esperar até que os resultados dos testes estejam disponíveis
            waitForQualityGate abortPipeline: true

            // Gerar relatório Allure
            allure([
                includeProperties: false,
                jdk: '',
                results: [[path: 'allure-results']]
            ])
        }
    }
}

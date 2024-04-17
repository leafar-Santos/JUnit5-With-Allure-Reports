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
                bat 'robocopy allure-results allure-results-temp /e /xf *.* || exit 0'
                bat 'mvn clean test'
            }
            post {
                always {
                    // Remover resultados antigos do Allure
                    deleteDir()

                    // Copiar resultados da execução atual de volta para o diretório allure-results
                    bat 'robocopy allure-results-temp allure-results /e || exit 0'
                }
            }
        }
    }
    post {
        always {
            // Listar arquivos na pasta allure-results para verificar se os resultados dos testes foram gerados corretamente
            bat 'dir allure-results'

            // Gerar relatório Allure
            allure([
                includeProperties: false,
                jdk: '',
                results: [[path: 'allure-results']]
            ])

            // Publicar relatório Allure como um artefato
            archiveArtifacts 'allure-report/**'
        }
    }
}

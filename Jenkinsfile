pipeline {
    agent any
    stages {
        stage ('Inicio') {
            steps {
                bat 'echo inicio'
            }
        }

        stage ('Limpar resultados antigos') {
            steps {
                bat 'mvn clean'
            }
        }

        stage ('Executando testes JUnit 5') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    script {
                        // Copiar a pasta history para allure-results
                        bat 'xcopy /s /e "allure-report\\history" "allure-results\\history"'

                        // Excluir a pasta allure-report
                        bat 'rmdir /s /q allure-report'

                        // Gerar o relatório do Allure novamente
                        allure([
                            includeProperties: false,
                            jdk: '',
                            properties: [],
                            reportBuildPolicy: 'ALWAYS',
                            results: [[path: 'target/allure-results']]
                        ])
                    }
                }
            }
        }
    }
}

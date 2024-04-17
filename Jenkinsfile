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
                //bat 'mvn clean'
                bat 'rmdir /s /q allure-report'
                bat 'xcopy /s /e /i /y "allure-report//history" "allure-results//history"'

            }
        }

        stage ('Executando testes JUnit 5') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    script {
                        // Gerar o relatório do Allure
                        allure([
                            clean:true,
                            includeProperties: false,
                            jdk: '',
                            properties: [],
                            reportBuildPolicy: 'ALWAYS',
                            results: [[path: 'allure-results']]
                        ])

                    }
                }
            }
        }
    }
}

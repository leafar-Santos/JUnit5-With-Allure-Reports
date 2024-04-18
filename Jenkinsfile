pipeline {
    agent any
    stages{
        stage ('Inicio'){
            steps{
                bat 'echo inicio'
            }
        }

        stage ('Executando testes JUnit 5'){
           steps{
              bat 'mvn clean test'
           }
        post{
            always{ allure([
                 clean:true,
                 includeProperties: false,
                 jdk: '',
                 properties:[],
                 reportBuildPolicy: 'ALWAYS',
                 results: [[path: 'allure-results']]
            ])

                }
            }
        }
    }
}
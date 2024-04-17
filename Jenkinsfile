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
             bat 'mvn clean install'
            }
        }
        stage ('Fim'){
            steps{
                bat 'echo fim'
            }
        }
    }
}
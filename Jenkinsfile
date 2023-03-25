pipeline {
    environment{
        imageName = ""
    }
    agent any

    stages {
        stage('Git Pull stage') {
            steps {
                // Get some code from a GitHub repository
                git url:'https://github.com/Ganesh-Malladi/SPE_miniproject',
                    branch:"main"
            }
        }
        stage('Maven Test'){
            steps{
                script{
                    sh 'mvn test'
                    

                } 
            }
        }
        stage('Maven Build'){
            steps{
                script{
                    sh 'mvn clean install'
                    
                } 
            }
        }
        stage('Docker Build Image')
        {
            steps{
                script{
                    imageName = docker.build "ganeshmalladi/spe_miniproject:latest"
                }
            }
        }
        stage('Push Docker Image')
        {
            steps{
                script{
                    docker.withRegistry("", 'docker_credentials' ){
                        imageName.push()
                    }
                }
            }
        }
        stage('Ansible pull docker image')
        {
            steps{
                sh "/usr/bin/pip3 install docker"
                sh "ansible-playbook p2.yml -i inventory"
                // ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'calculator-playbook.yml', sudoUser: null
            }
        }
    }
}
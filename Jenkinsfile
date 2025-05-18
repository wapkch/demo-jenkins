pipeline {
    agent any
    stages{
        stage('Pull Git Demo') {
            steps{
				//拉取代码，这里也是可以使用凭据的，为了方便没贴出来
            	git branch: 'main', credentialsId: '10917354-2e7b-4e22-baa8-77488aba3bbc', url: 'https://github.com/wapkch/demo-jenkins.git'
            }
        }

        stage('Build') {
            steps {
                // 使用Maven构建项目
                sh 'mvn clean compile'
                echo '构建完成'
            }
        }
   }
}
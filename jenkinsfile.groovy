node{
  cleanWs()
  try{
    stage('PremiereEtape'){
      sh "echo 'Hello World !!'"
      sh "ls -al"
      sh " cd .. "
      
      sh "ls -al"
    }
    stage ('DeuxiemeEtape'){
      sh "echo 'Hello World 2 !!'"
    }
  }
  finally{
    
  }
}

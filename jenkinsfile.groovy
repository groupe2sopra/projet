node{
  cleanWs()
  try{
    stage('PremiereEtape'){
      sh "echo 'Hello World !!'"
      sh " cd .. "
      
      sh "ls"
    }
    stage ('DeuxiemeEtape'){
      sh "echo 'Hello World 2 !!'"
    }
  }
  finally{
    
  }
}

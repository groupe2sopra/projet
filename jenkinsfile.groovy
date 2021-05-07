node{
  try{
    stage('PremiereEtape'){
      sh "echo 'Hello World !!'"
      sh "ls -al"
      sh "pwd"
      
    }
  }
  finally{
    
  }
}

node{
  try{
    stage('PremiereEtape'){
      sh "echo 'Hello World !!'"
      sh "ls -al"
      sh "pwd"
      sh " cd .."
      sh " ls -al"
      sh " pwd"
      
    }
  }
  finally{
    
  }
}

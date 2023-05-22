package modeles;

public class authentificationBean {



		private String login;
		private String password;

		public authentificationBean (){
			login="";
			password="";
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean authentifier(String login,String password){
			if((login.equals("nawres")&&(password.equals("nawres")))){
				return true;
			}else{
				return false;
			}
		}
	}
	



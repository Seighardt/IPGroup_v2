package IP_assignment;

public class beans {
		private boolean loggedIn = false;
	
		public void TestBean (boolean loggedIn) { 
			setLoggedIn(loggedIn);
			return;
		}

    public boolean getLoggedIn () {
        return this.loggedIn;
    }

    public void setLoggedIn (boolean fn) {
    this.loggedIn = fn;
    }
}

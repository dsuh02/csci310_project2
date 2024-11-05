class AuthenticationManager
{
    private String currentUserId; 

    public boolean login(String email,String password, String userName){
        return false;
    }

    public boolean register(String email, String password, String username){
        return false;
    }

    public boolean logout(){
        return false;
    }

    public String getCurrentUser(){
        return currentUserId;
    }

    public boolean isLoggedIn(String userId){
        return false;
    }

}
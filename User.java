class User{
    private String email;
    private String password;
    private String userName;
    private String userId;

    public User(String email, String password, String username,String userId){
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.userId = userId;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserId(){
        return userId;
    }
}
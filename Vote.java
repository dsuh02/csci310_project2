class Vote{
    private String voteId;
    private String userId;
    private String eventId;
    private boolean voteType;

    public void setVoteId(String voteId){
        this.voteId = voteId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setEventId(String eventId){
        this.eventId = eventId;
    }

    public void setVoteType(boolean voteType){
        this.voteType = voteType;
    }
    public String getVoteId(){
        return voteId;
    }

    public String getUserId(){
        return userId;
    }

    public String getEventId(){
        return eventId;
    }

    public boolean getVoteType(){
        return voteType;
    }

}
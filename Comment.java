class Comment{
    private String text;
    private String userId;
    private String eventId;

    public void setText(String text){
        this.text = text;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setEventId(String eventId){
        this.eventId = eventId;
    }
    public String getText(){
        return text;
    }

    public String getUserId(){
        return userId;
    }

    public String getEventId(){
        return eventId;
    }

}
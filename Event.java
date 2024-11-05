class Event{

    private String eventId;
    private String title;
    private String description;
    private Location location;
    private Date date;
    private Time time;
    private String createdBy;
    private List<Vote> votes;
    private List<String> confirmedByUserIds;
    private List<String> flaggedByUserIds;

    public void setEventId(String eventId){
        this.eventId = eventId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setLocation(Location location){
        this.location = location;
    }
    
    public void setDate(Date date){
        this.date = date;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    public void setVote(List<Vote> votes){
        this.votes = votes;
    }

    public void setConfirmedByUserIds(List<String> confirmedByUserIds){
        this.confirmedByUserIds = confirmedByUserIds;
    }

    public void setFlaggedByUserIds(List<String> flaggedByUserIds){
        this.flaggedByUserIds = flaggedByUserIds;
    }

    public String getEventId(){
        return eventId;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public Location getLocation(){
        return location;
    }
    
    public Date getDate(){
        return date;
    }

    public Time getTime(){
        return time;
    }

    public String getCreatedBy(){
        return createdBy;
    }

    public List<Vote> getVote(){
        return votes;
    }

    public List<String> getConfirmedByUserIds(){
        return confirmedByUserIds;
    }

    public List<String> getFlaggedByUserIds(){
        return flaggedByUserIds;
    }
}
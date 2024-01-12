public class ErrorLog {

    private String machineId;
    private String description;
 
    /** Precondition: message is a valid Error log entry */
    public ErrorLog(String message){
        machineId = message.substring(0,message.indexOf(":"));
        description = message.substring(message.indexOf(":")+1);
    }
 
    /** Returns true if the description in this error log entry
     * contains keyword; false otherwise.
     */
    public boolean containsKey(String keyword)
          {    	/* implemented in part b */   }
 
    public String getMachineId() { return machineId;}
    public String getDescription() { return description; }
 }
 
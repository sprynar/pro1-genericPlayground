package pro1.Task3;

public class SecretStore
{
    String secret;
    Object owner;
    public SecretStore(String secret, Object owner) {
        this.secret = secret;
    }

    public void sendBackToOwner(){
        String ownerEmail = Integer.toString(owner.hashCode()); // Determine email of authorized owner
        sendTo(ownerEmail);
    }

    private String sendTo(String email) {
        return  "SENDING SECRET TO "+email;
    }
}
public class TikTokVideo {


    private String username;
    private String caption;
    private double length;
    private int numLikes;


    public TikTokVideo(String aUserName, String aCaption, double aLength, int aNumLikes){
        username = aUserName;
        caption = aCaption;
        length = aLength;
        numLikes = aNumLikes;
    }

    /**
     * Returns the username
     * @return The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the caption
     * @return The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Returns the length
     * @return The length
     */
    public double getLength() {
        return length;
    }

    /**
     * Returns the number of likes
     * @return The number of likes
     */
    public int getNumLikes() {
        return numLikes;
    }

    /**
     * Sets the username
     * @param username The new username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the caption
     * @param caption The new caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Sets the length
     * @param length The new length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Sets the number of likes
     * @param numLikes The new number of likes
     */
    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }
}

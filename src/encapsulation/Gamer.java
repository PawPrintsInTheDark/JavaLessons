package encapsulation;

public class Gamer {
    private String nickname;
    private Boolean isActive;

    public String getNickname() {
        return nickname;
    }

    public Boolean getActive() {
        return isActive;
    }


    public Gamer(String nickname, Boolean isActive) {
        this.nickname = nickname;
        this.isActive = isActive;
    }
}

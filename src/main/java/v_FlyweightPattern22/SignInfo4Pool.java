package v_FlyweightPattern22;

public class SignInfo4Pool extends SignInfo{
    // 考试科目与考试地点作为key
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

package test09;

import java.io.Serializable;

public class Account implements Serializable {
    private String webName;
    private String account;
    private String passWord;

    public Account(String webName, String account, String passWord) {
        this.webName = webName;
        this.account = account;
        this.passWord = passWord;
    }

    public Account() {
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Account{" +
                "webName='" + webName + '\'' +
                ", account='" + account + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}

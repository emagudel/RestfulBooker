package com.certificacion.qa.api.data;

public enum Data {
    STANDARD_DATA_API(
            "admin",
            "password123",
            "password123fklñgdjklñsdfñl"
    );

    private final String username;
    private final String password;
    private final String passwordFailed;


    Data(
            String username,
            String password,
            String passwordFailed
    ) {
        this.username = username;
        this.password = password;
        this.passwordFailed = passwordFailed;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordFailed() {
        return passwordFailed;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

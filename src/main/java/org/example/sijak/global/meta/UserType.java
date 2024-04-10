package org.example.sijak.global.meta;

public enum UserType {
    BUYER("buyer"),
    SELLER("seller");

    private final String type;

    UserType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


}

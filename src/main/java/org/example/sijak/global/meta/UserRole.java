package org.example.sijak.global.meta;

public enum UserRole {
    USER(Authority.USER),
    ADMIN(Authority.ADMIN);
    private final String authority;

    UserRole(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return this.authority;
    }

    public static class Authority {
        public static final String USER = "USER";
        public static final String ADMIN = "ADMIN";
    }

}

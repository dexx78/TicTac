public enum Players {
    ONE(1L),
    TWO(2L);

    private final Long id;

    Players(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

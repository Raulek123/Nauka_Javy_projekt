package Kolekcje.SprytneSortowanie;

public enum SortOption {
    TITLE ("Title"),
    YEAR ("Year"),
    RATING ("Rating");

    private String description;

    SortOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

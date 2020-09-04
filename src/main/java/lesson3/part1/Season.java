package lesson3.part1;

public enum Season {
    WINTER(100), AUTUMN(50), SPRING(88), SUMMER(14);

    int daysCount;

    Season(int daysCount) {
        this.daysCount = daysCount;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }
}

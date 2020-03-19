package List.扑克牌;

public class Card {
    public int rank;//大小
    public String suit;//花色

    @Override
    public String toString() {
        return String.format("[%s %d]",suit,rank);
    }
}

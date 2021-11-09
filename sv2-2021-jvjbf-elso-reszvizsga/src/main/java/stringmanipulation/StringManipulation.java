package stringmanipulation;

public class StringManipulation {

    private final StringBuilder sb;

    public StringManipulation() {
        sb = new StringBuilder();
    }

    public String everyEvenCharacter(String s) {
        boolean isEvenIndex = true;
        sb.delete(0, sb.length());

        for (Character character : s.toCharArray()) {
            if (isEvenIndex) {
                sb.append(character.toString());
            }
            isEvenIndex = !isEvenIndex;
        }
        return sb.toString();
    }
}
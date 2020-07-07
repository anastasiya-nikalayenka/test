package HomeWork3.obj.dto;

public class Color {
    final int RED=1;
    final int ORANGE=2;
    final int YELLOW=3;
    final int GREEN=4;
    final int BLUE=5;
    final int INDIGO=6;
    final int VIOLET=7;
    private String name;
    private int number;

    public int getNumber() {
        return number;}

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        switch(number) {
            case RED: name="�������"; break;
            case ORANGE: name="���������"; break;
            case YELLOW: name="������"; break;
            case GREEN: name="�������"; break;
            case BLUE: name="�������"; break;
            case INDIGO: name="�����"; break;
            case VIOLET: name="����������"; break;
            default: name="����������"; break;
        }
        return name;}

    public void setName(String name) {
        this.name = name;
    }

}

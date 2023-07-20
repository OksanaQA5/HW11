package HW8;

public class Compendium {
    private String ФИО_студента;
    private String Название_предмета;
    private int Количество_страниц;
    private int Год_выпуска;
    private String Цвет_обложки;
    private String Название_заведения;

    public Compendium(String ФИО_студента, String Название_предмета, int Количество_страниц, int Год_выпуска, String Цвет_обложки, String Название_заведения) {
        this.ФИО_студента = ФИО_студента;
        this.Название_предмета = Название_предмета;
        this.Количество_страниц = Количество_страниц;
        this.Год_выпуска = Год_выпуска;
        this.Цвет_обложки = Цвет_обложки;
        this.Название_заведения = Название_заведения;
    }

    public String getФИО_студента() {
        return ФИО_студента;
    }

    public void setФИО_студента(String ФИО_студента) {
        this.ФИО_студента = ФИО_студента;
    }

    public String getНазвание_предмета() {
        return Название_предмета;
    }

    public void setНазвание_предмета(String Название_предмета) {
        this.Название_предмета = Название_предмета;
    }

    public int getКоличество_страниц() {
        return Количество_страниц;
    }

    public void setКоличество_страниц(int Количество_страниц) {
        this.Количество_страниц = Количество_страниц;
    }

    public int getГод_выпуска() {
        return Год_выпуска;
    }

    public void setГод_выпуска(int Год_выпуска) {
        this.Год_выпуска = Год_выпуска;
    }

    public String getЦвет_обложки() {
        return Цвет_обложки;
    }

    public void setЦвет_обложки(String Цвет_обложки) {
        this.Цвет_обложки = Цвет_обложки;
    }

    public String getНазвание_заведения() {
        return Название_заведения;
    }

    public void setНазвание_заведения(String Название_заведения) {
        this.Название_заведения = Название_заведения;
    }

    public static void main(String[] args) {
        Compendium compendium = new Compendium("Цимбал Микола Сергійович", "Програмувавння та автоматизація", 50, 2023, "Синий", "Черкаський Політехнічний Університет");
        System.out.println("ФИО студента: " + compendium.getФИО_студента());
        System.out.println("Название предмета: " + compendium.getНазвание_предмета());
        System.out.println("Количество страниц: " + compendium.getКоличество_страниц());
        System.out.println("Год выпуска: " + compendium.getГод_выпуска());
        System.out.println("Цвет обложки: " + compendium.getЦвет_обложки());
        System.out.println("Название заведения: " + compendium.getНазвание_заведения());
    }
}

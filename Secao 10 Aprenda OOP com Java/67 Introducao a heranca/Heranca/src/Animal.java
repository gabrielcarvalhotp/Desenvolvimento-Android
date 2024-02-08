public class Animal {
    private String name;
    private String color;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void run() {
        System.out.println("Animal correndo!");
    }

    public void stop() {
        System.out.println("Aninal parando de correr");
    }

    public void animalDescription() {
        System.out.println("Nome:" + this.name + ", cor: " + this.color + " e tamanho: " + this.size + "cm");
    }
}

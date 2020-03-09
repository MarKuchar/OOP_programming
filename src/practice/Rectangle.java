package practice;

class Rectangle {
    private int height;
    private int width;
    private String color;

    public Rectangle(int height, int width, String color) {
    setHeight(height);
    setWidth(width);
    setColor(color);
    }

    public void setHeight(int h) {
        if (h <= 1) {
            this.height = 1;
        }
        else {
            this.height = h;
        }
    }
    public void setWidth(int w) {
        if (w <= 1) {
            this.width = 1;
        }
        else {
            this.width = w;
        }
    }
    public void setColor(String color) {
        if (Character.isUpperCase(color.charAt(0)) && color.length() < 20 ) {
            this.color = color;
        }
        else {
            this.color = "Blue";
        }
    }

    public int getHeight() {
        return height;
    }
    public String getColor() {
        return color;
    }
    public int getWidth() {
        return width;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println(color.charAt(0));
            }
            System.out.println("\n");
        }
    }
}


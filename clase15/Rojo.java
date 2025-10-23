package clase15;

import javafx.scene.paint.Color;

public class Rojo implements Estado {
    @Override
    public Estado cambiarEstado() {
        return new Verde();
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
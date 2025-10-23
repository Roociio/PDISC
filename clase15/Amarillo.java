package clase15;

import javafx.scene.paint.Color;

public class Amarillo implements Estado {
    @Override
    public Estado cambiarEstado() {
        return new Rojo();
    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }
}
package clase15;

import javafx.scene.paint.Color;

public class Verde implements Estado {
    @Override
    public Estado cambiarEstado() {
        return new Amarillo();
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
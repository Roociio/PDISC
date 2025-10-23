package clase15;

import javafx.scene.paint.Color;

public interface Estado {
    Estado cambiarEstado();
    Color getColor();
}
package pattern.controller;

import javafx.scene.layout.HBox;
import pattern.composite.GraphicalComponent;

public class RootController {
	public HBox anchor;
	
	public void init(GraphicalComponent... list) {
		anchor.getChildren().addAll(list);
	}
}

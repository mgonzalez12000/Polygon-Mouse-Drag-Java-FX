package PolygonLab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PolygonLab1 extends Application {
	//Create private Polygon
	private Polygon newPolygon ;

    @Override
    public void start(Stage primaryStage) {
    	//Create pane
        Pane root = new Pane();
        //Set pane size
        root.setMinSize(450,450);
        root.setMaxSize(800, 800);
        //Mouse clicks
        root.setOnMouseClicked( (e)-> {
        	//If user does a left click
        	if (e.getButton()== MouseButton.PRIMARY) {
        		//If there is no polygon create new polygon
        		if (newPolygon == null) {
        			//Creates new polygon
        			newPolygon = new Polygon();
        			//Set the stroke color for the polygon
        			newPolygon.setStroke(Color.BLUE);
        			//Set the fill color for the polygon
        			newPolygon.setFill(Color.BLUE);
        			//GetChildren
        			root.getChildren().add(newPolygon);
        		}
        		//If mouse is clicked, get both the x and y coordinate 
        		newPolygon.getPoints().addAll(e.getX(), e.getY());
        	}
        		else {
        			newPolygon = null;
        		}
        	});
        
        //EXTRA CREDIT
        //Make new polygon while dragging mouse 
        root.setOnMouseDragged((e) -> {
        	//If user does a left click
        	if (e.getButton()== MouseButton.PRIMARY) {
        		//If there is no polygon create new polygon
        		if (newPolygon == null) {
        			//Creates new polygon
        			newPolygon = new Polygon();
        			//Set the stroke color for the polygon
        			newPolygon.setStroke(Color.BLUE);
        			//Set the fill color for the polygon
        			newPolygon.setFill(Color.BLUE);
        			//GetChildren
        			root.getChildren().add(newPolygon);
        		}
        		//If mouse is clicked, get both the x and y coordinate 
        		newPolygon.getPoints().addAll(e.getX(), e.getY());
        	}
        		else {
        			newPolygon = null;
        		}
        });
        
        //EXTRA CREDIT for key events
//        root.setOnKeyPressed((e) -> {
//        	switch (e.getCode()) {
//        	case B: newPolygon.setFill(Color.BLACK); break;
//        	case G: newPolygon.setFill(Color.GREEN); break;
//			default:
//				break;
//        	
//        	}
//        });
        
        //Create new scene
        Scene scene = new Scene(root, 450, 450);
        
        //Bind the scene's width and height
        root.scaleXProperty().bind( scene.widthProperty().divide(450));
        root.scaleYProperty().bind( scene.heightProperty().divide(450));
        
        //Create title of page
        primaryStage.setTitle("Polygon Lab");
        //Add the scene to the stage
        primaryStage.setScene(scene);
        //Show the contents of the stage 
        primaryStage.show();
    }
    //Launch program
    public static void main(String[] args) {
        launch(args);
    }
}
    

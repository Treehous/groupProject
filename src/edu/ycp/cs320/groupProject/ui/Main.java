/*package edu.ycp.cs320.groupProject.ui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import edu.ycp.cs320.groupProject.controller.StageController;
import edu.ycp.cs320.groupProject.model.StageModel;

public class Main {
public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				StageView view = new StageView();
				
				StageController controller = new StageController();
				
				StageModel model = new StageModel();
				
				view.setModel(model);
				view.setController(controller);
				
				JFrame frame = new JFrame("p4ng");
				frame.setContentPane(view);
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
*/
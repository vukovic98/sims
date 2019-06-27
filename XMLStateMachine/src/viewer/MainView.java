package viewer;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;

public class MainView extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3018696746928226635L;


	private InfoPanel pnlInfo;
	private ButtonPanel pnlButtons;
	private FieldPanel pnlFields;
	
	public MainView() {
		
        setLayout(new GridBagLayout());
		
		pnlInfo = new InfoPanel();
		pnlButtons = new ButtonPanel();
		pnlFields = new FieldPanel();	
		
		add(pnlInfo, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.FIRST_LINE_START, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(pnlButtons, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.FIRST_LINE_END, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 25));
		
		
		add(pnlFields, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.PAGE_END, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
	}
	
}
package br.com.fiap.design;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Design {

	protected Shell shell;
	private Text txtTexto;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Design window = new Design();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(454, 192);
		shell.setText("SWT Application");
		
		Button btnNice = new Button(shell, SWT.NONE);
		btnNice.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			MessageDialog.openInformation(null, "wts", txtTexto.getText());
			}
		});
		btnNice.setFont(SWTResourceManager.getFont("Segoe UI Semilight", 9, SWT.ITALIC));
		btnNice.setBounds(179, 94, 75, 25);
		btnNice.setText("Nice");
		
		txtTexto = new Text(shell, SWT.BORDER);
		txtTexto.setBounds(179, 43, 76, 21);
		
		Label lblDigiteOCdigo = new Label(shell, SWT.NONE);
		lblDigiteOCdigo.setBounds(70, 10, 163, 15);
		lblDigiteOCdigo.setText("Digite o c\u00F3digo do produto:");

	}
}

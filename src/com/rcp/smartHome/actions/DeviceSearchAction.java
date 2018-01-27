package com.rcp.smartHome.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import yjsmartregister.Activator;

/**
 * �豸��ѯ����
 * @author Administrator
 *
 */
public class DeviceSearchAction extends Action implements IWorkbenchAction {
	
	public static final String ID = DeviceSearchAction.class.getName();
	
	private IWorkbenchWindow window;
	
	public DeviceSearchAction(IWorkbenchWindow window, String label,String image){
		this.window = window;
		setText(label);
		setImageDescriptor(Activator.getImageDescriptor(image));
		setId(ID);
	}
	
	public void run() {
		MessageDialog.openInformation(window.getShell(), "�豸��ѯ", "�豸��ѯ������!");
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}

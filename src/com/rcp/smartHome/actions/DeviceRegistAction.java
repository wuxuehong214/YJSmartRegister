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
 * 设备注册响应
 * @author Administrator
 *
 */
public class DeviceRegistAction extends Action implements IWorkbenchAction {
	
	public static final String ID = DeviceRegistAction.class.getName();
	
	private IWorkbenchWindow window;
	
	public DeviceRegistAction(IWorkbenchWindow window, String label,String image){
		this.window = window;
		setText(label);
		setImageDescriptor(Activator.getImageDescriptor(image));
		setId(ID);
	}
	
	public void run() {
		MessageDialog.openInformation(window.getShell(), "设备注册", "设备注册待开发!");
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}

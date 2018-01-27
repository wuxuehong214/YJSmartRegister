package yjsmartregister;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.rcp.smartHome.actions.DeviceRegistAction;
import com.rcp.smartHome.actions.DeviceSearchAction;
import com.rcp.smartHome.resources.IimageKeys;
import com.rcp.smartHome.resources.Messages;


/**
 * Action����
 * ���ڴ������е�action��Ӧ���
 * @author wuxuehong
 *
 */
public abstract class ApplicationActionFactory extends ActionFactory {

	protected ApplicationActionFactory(String actionId) {
		super(actionId);
	}
	
	/**
	 * �豸ע����Ӧ
	 */
	public static final ActionFactory DEVICE_REGIST = new ActionFactory(DeviceRegistAction.ID){
		public IWorkbenchAction create(IWorkbenchWindow window) {
			if(window == null){
				throw new IllegalArgumentException();
			}
			IWorkbenchAction action = new DeviceRegistAction(window,Messages.DEVICE_REGIST,IimageKeys.DEVICE_REGIST);
			return action;
		}
	};
	
	/**
	 * �豸��ѯ��Ӧ
	 */
	public static final ActionFactory DEVICE_SEARCH = new ActionFactory(DeviceSearchAction.ID){
		public IWorkbenchAction create(IWorkbenchWindow window) {
			if(window == null){
				throw new IllegalArgumentException();
			}
			IWorkbenchAction action = new DeviceSearchAction(window,Messages.DEVICE_SEARCH,IimageKeys.DEVICE_SEARCH);
			return action;
		}
	};

}

package yjsmartregister;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

import com.rcp.smartHome.actions.DeviceRegistAction;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	
	
	private IWorkbenchAction deviceRegistAction;//�豸ע��
	private IWorkbenchAction deviceSearchAction; //�豸����

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    /**
     * action��ʼ��
     */
    protected void makeActions(IWorkbenchWindow window) {
    	deviceRegistAction = ApplicationActionFactory.DEVICE_REGIST.create(window);
    	register(deviceRegistAction);
    	deviceSearchAction = ApplicationActionFactory.DEVICE_SEARCH.create(window);
    	register(deviceSearchAction);
    }
    
    /**
     * �˵�����ʼ��
     */
    protected void fillMenuBar(IMenuManager menuBar) {
    	
    	MenuManager deviceMenu = new MenuManager("�豸��Ϣ����(D)", "device");
    	menuBar.add(deviceMenu);
    	deviceMenu.add(deviceRegistAction);
    	deviceMenu.add(deviceSearchAction);
    	
    	MenuManager statisticMenu = new MenuManager("����ͳ��(S)", "stastics");
		menuBar.add(statisticMenu);
		statisticMenu.add(deviceRegistAction);
		
		MenuManager sysMenu = new MenuManager("ϵͳ����(C)", "system");
		menuBar.add(sysMenu);
		sysMenu.add(deviceRegistAction);
		
		MenuManager helpMenu = new MenuManager("����(H)", IWorkbenchActionConstants.M_HELP);
		menuBar.add(helpMenu);
		helpMenu.add(deviceRegistAction);
    }
    
    /**
	 * ��������ʼ��
	 */
	protected void fillCoolBar(ICoolBarManager coolBar) {
		try{
			//�豸����
			IToolBarManager toolbar = new ToolBarManager(coolBar.getStyle());
			coolBar.add(toolbar);
			toolbar.add(deviceRegistAction);
			
			//����ͳ��
			IToolBarManager toolbar2 = new ToolBarManager(coolBar.getStyle());
			coolBar.add(toolbar2);
			toolbar2.add(deviceRegistAction);
			
			//ϵͳ����
			IToolBarManager toolbar3 = new ToolBarManager(coolBar.getStyle());
			coolBar.add(toolbar3);
			toolbar3.add(deviceRegistAction);
			
			//����
			IToolBarManager toolbar4 = new ToolBarManager(coolBar.getStyle());
			coolBar.add(toolbar4);
			toolbar4.add(deviceRegistAction);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}

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
	
	
	private IWorkbenchAction deviceRegistAction;//设备注册
	private IWorkbenchAction deviceSearchAction; //设备搜索

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    /**
     * action初始化
     */
    protected void makeActions(IWorkbenchWindow window) {
    	deviceRegistAction = ApplicationActionFactory.DEVICE_REGIST.create(window);
    	register(deviceRegistAction);
    	deviceSearchAction = ApplicationActionFactory.DEVICE_SEARCH.create(window);
    	register(deviceSearchAction);
    }
    
    /**
     * 菜单栏初始化
     */
    protected void fillMenuBar(IMenuManager menuBar) {
    	
    	MenuManager deviceMenu = new MenuManager("设备信息管理(D)", "device");
    	menuBar.add(deviceMenu);
    	deviceMenu.add(deviceRegistAction);
    	deviceMenu.add(deviceSearchAction);
    	
    	MenuManager statisticMenu = new MenuManager("报表统计(S)", "stastics");
		menuBar.add(statisticMenu);
		statisticMenu.add(deviceRegistAction);
		
		MenuManager sysMenu = new MenuManager("系统管理(C)", "system");
		menuBar.add(sysMenu);
		sysMenu.add(deviceRegistAction);
		
		MenuManager helpMenu = new MenuManager("帮助(H)", IWorkbenchActionConstants.M_HELP);
		menuBar.add(helpMenu);
		helpMenu.add(deviceRegistAction);
    }
    
    /**
	 * 工具栏初始化
	 */
	protected void fillCoolBar(ICoolBarManager coolBar) {
		try{
			//设备管理
			IToolBarManager toolbar = new ToolBarManager(coolBar.getStyle());
			coolBar.add(toolbar);
			toolbar.add(deviceRegistAction);
			
			//报表统计
			IToolBarManager toolbar2 = new ToolBarManager(coolBar.getStyle());
			coolBar.add(toolbar2);
			toolbar2.add(deviceRegistAction);
			
			//系统管理
			IToolBarManager toolbar3 = new ToolBarManager(coolBar.getStyle());
			coolBar.add(toolbar3);
			toolbar3.add(deviceRegistAction);
			
			//帮助
			IToolBarManager toolbar4 = new ToolBarManager(coolBar.getStyle());
			coolBar.add(toolbar4);
			toolbar4.add(deviceRegistAction);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}

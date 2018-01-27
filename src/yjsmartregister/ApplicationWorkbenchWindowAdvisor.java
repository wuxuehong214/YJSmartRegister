package yjsmartregister;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.internal.util.PrefUtil;

import com.rcp.smartHome.resources.Messages;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }
    
    public void preWindowOpen() {
    	IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setInitialSize(new Point(1100, 750));
        //菜单栏可见
        configurer.setShowMenuBar(true);
        //工具栏可见
        configurer.setShowCoolBar(true);
        //设置状态栏可见
        configurer.setShowStatusLine(true);
        //设置工作进度可见
        configurer.setShowProgressIndicator(true);
        //设置快速试图可见
        configurer.setShowFastViewBars(true);
        IPreferenceStore preStore = PrefUtil.getAPIPreferenceStore();
        preStore.setValue(IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS, false);
        configurer.setTitle(Messages.SOFT_NAME);
    }
}

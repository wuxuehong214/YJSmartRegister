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
        //�˵����ɼ�
        configurer.setShowMenuBar(true);
        //�������ɼ�
        configurer.setShowCoolBar(true);
        //����״̬���ɼ�
        configurer.setShowStatusLine(true);
        //���ù������ȿɼ�
        configurer.setShowProgressIndicator(true);
        //���ÿ�����ͼ�ɼ�
        configurer.setShowFastViewBars(true);
        IPreferenceStore preStore = PrefUtil.getAPIPreferenceStore();
        preStore.setValue(IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS, false);
        configurer.setTitle(Messages.SOFT_NAME);
    }
}

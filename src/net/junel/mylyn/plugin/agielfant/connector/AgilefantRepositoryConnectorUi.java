package net.junel.mylyn.plugin.agielfant.connector;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipse.mylyn.tasks.core.ITaskMapping;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.AbstractRepositoryConnectorUi;
import org.eclipse.mylyn.tasks.ui.wizards.ITaskRepositoryPage;

public class AgilefantRepositoryConnectorUi extends
		AbstractRepositoryConnectorUi {

	public AgilefantRepositoryConnectorUi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getConnectorKind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITaskRepositoryPage getSettingsPage(TaskRepository taskRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWizard getQueryWizard(TaskRepository taskRepository,
			IRepositoryQuery queryToEdit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWizard getNewTaskWizard(TaskRepository taskRepository,
			ITaskMapping selection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasSearchPage() {
		// TODO Auto-generated method stub
		return false;
	}

}

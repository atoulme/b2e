package b2e.nature;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;

public class BuildrClasspathContainer implements IClasspathContainer, Serializable {

	private static final long serialVersionUID = -5468412686584809163L;

	private IJavaProject project;

	public BuildrClasspathContainer(IJavaProject project) {
		this.project = project;
	}

	public String getDescription() {
		return "Buildr dependencies";
	}

	public int getKind() {
		return IClasspathContainer.K_APPLICATION;
	}

	public synchronized IClasspathEntry[] getClasspathEntries() {
		List<IClasspathEntry> entries = new ArrayList<>();
		
		return entries.toArray(new IClasspathEntry[entries.size()]);
	}

	public IPath getPath() {
		return new Path("b2e.BUILDR_CONTAINER/dependencies");
	}

}

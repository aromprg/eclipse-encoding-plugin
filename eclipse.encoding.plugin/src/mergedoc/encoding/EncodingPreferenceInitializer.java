package mergedoc.encoding;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @author Shinji Kashihara
 */
public class EncodingPreferenceInitializer extends AbstractPreferenceInitializer {
	
	public static interface PreferenceKey {
		String PREF_AUTODETECT_CHANGE = "PREF_AUTODETECT_CHANGE";
		String PREF_AUTODETECT_WARN = "PREF_AUTODETECT_WARN";
		String PREF_DISABLE_DANGER_OPERATION = "PREF_DISABLE_DANGER_OPERATION";
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceKey.PREF_AUTODETECT_WARN, true);
		store.setDefault(PreferenceKey.PREF_DISABLE_DANGER_OPERATION, true);
	}
}
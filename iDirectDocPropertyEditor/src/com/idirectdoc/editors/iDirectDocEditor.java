package com.idirectdoc.editors;
import java.util.Locale;
import com.ibm.ecm.extension.Plugin;

public class iDirectDocEditor extends Plugin {

	@Override
	public String getId() {
		return "iDirectDocEditor";
	}

	@Override
	public String getName(Locale arg0) {
		return "ICM iDirectDoc Custom Editor plug-in";
	}

	@Override
	public String getVersion() {
		return "1.0.2";
	}

	@Override
	public String getScript() {
		return "iDirectDocEditor.js";
	}

	@Override
	public String getDojoModule() {
		// TODO Auto-generated method stub
		return "iDirectDocEditorDojo";
	}
	
	@Override
	public String getConfigurationDijitClass() {
		return "iDirectDocEditorDojo.ConfigurationPane";
	}

}

package de.tum.ais.xml.plcopen;

public final class XMLLiterals {

	public final static String XMLNS = "http://www.w3.org/1999/xhtml";

	public final class FileHeader {
		public final static String COMPANY_NAME = "AIS-TUM";
		public final static String COMPANY_URL = "https://www.ais.mw.tum.de/startseite/";
		public final static String PRODUCT_VERSION = "v.0.1";
		public final static String PRODUCT_RELEASE = "Beta";
	}

	public final class ContentHeader {
		public final static String NAME = "autoMFM.project";
		public final static String VERSION = XMLLiterals.FileHeader.PRODUCT_VERSION;
		public final static String ORGANIZATION = XMLLiterals.FileHeader.COMPANY_NAME;
	}

	public final class PouTypes {
		public final static String FUNCTIONBLOCK = "functionBlock";
		public final static String PROGRAM = "program";
	}

	public final class DataNames {
		public final static String POU = "http://www.3s-software.com/plcopenxml/pou";
		public final static String PROJECT_INFORMATION = "http://www.3s-software.com/plcopenxml/projectinformation";
		public final static String APPLICATION = "http://www.3s-software.com/plcopenxml/application";
		public final static String OBJECT_ID = "http://www.3s-software.com/plcopenxml/objectid";
		public final static String TASK_SETTINGS = "http://www.3s-software.com/plcopenxml/tasksettings";
		public final static String INTERFACE_PLAINTEXT = "http://www.3s-software.com/plcopenxml/interfaceasplaintext";
		public final static String PROPERTY = "http://www.3s-software.com/plcopenxml/property";
		public final static String IMPLEMENTATION = "implementation";
		public final static String DISCARD = "discard";
		public final static String PROJECT_STRUCTURE = "http://www.3s-software.com/plcopenxml/projectstructure";
		public final static String METHOD = "http://www.3s-software.com/plcopenxml/method";
		public final static String DATATYPE = "http://www.3s-software.com/plcopenxml/datatype";
	}

	public final class SimpleLiterals {
		public final static String VAR = "VAR";
		public final static String END = "END";
		public final static String END_VAR = "END_VAR";
		public final static String INPUT = "INPUT";
		public final static String OUTPUT = "OUTPUT";
		public final static String IN_OUT = "IN_OUT";
		public final static String FB = "FUNCTION_BLOCK";
		public final static String MAIN = "MAIN";
		public final static String INTERVAL = "PT0S";
		public final static String PRIORITY = "20";
		public final static String KindOfTask = "Cyclic";
		public final static String DEFAULT_INTERVAL = "1000";
		public final static String INTERVAL_UNIT = "us";
		public final static String TIME_UNIT = "ms";
		public final static String APPLICATION = "Application";

	}

	public final class Text {
		public final static String REFERENCE_TO = "REFERENCE TO REFERENCE TO ";
	}

	public final class IDs {
		public final static String TASK_ID = "plctask_ID";
		public final static String APPLICATION_ID = "application-id";

	}
}

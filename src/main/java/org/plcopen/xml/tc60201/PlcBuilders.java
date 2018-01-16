package org.plcopen.xml.tc60201;

import org.plcopen.xml.tc60201.AddData.Data;

/**
 * Builder classes
 * 
 * @author Matthias
 *
 */
public class PlcBuilders {

	/**
	 * Data Builder class
	 * 
	 * @author Matthias
	 *
	 */
	public static class DataBuilder {
		private Data data = new Data();

		public DataBuilder setName(String name) {
			data.setName(name);
			return this;
		}

		public DataBuilder setHandleUnknown(String handle) {
			data.setHandleUnknown(handle);
			return this;
		}

		public DataBuilder setId(String id) {
			data.setId(id);
			return this;
		}

		public Data build() {
			return data;
		}
	}
}

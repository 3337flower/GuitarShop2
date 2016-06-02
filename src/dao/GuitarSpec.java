package dao;

public class GuitarSpec {
		public Builder builder;
		public String model;
		public Type type;
		public Wood backWood;
		public Wood topWood;
		public int numStrings;

		public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
			this.builder = builder;
			this.model = model;
			this.type = type;
			this.numStrings = numStrings;
			this.backWood = backWood;
			this.topWood = topWood;
		}

		public Builder getBuilder() {
			return builder;
		}

		public void setBuilder(Builder builder) {
			this.builder = builder;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Type getType() {
			return type;
		}

		public void setType(Type type) {
			this.type = type;
		}

		public Wood getBackWood() {
			return backWood;
		}

		public void setBackWood(Wood backWood) {
			this.backWood = backWood;
		}

		public Wood getTopWood() {
			return topWood;
		}

		public void setTopWood(Wood topWood) {
			this.topWood = topWood;
		}

		public int getnumStrings() {
			return numStrings;
		}

		public void setnumStrings(int numStrings) {
			this.numStrings = numStrings;
		}

		public boolean isMatched(GuitarSpec spec){
			if(builder!=spec.getBuilder()){
				return false;
			}else if(type!=spec.getType()){
				return false;
			}else if(backWood!=spec.getBackWood()){
				return false;
			}else if(topWood!=spec.getTopWood()){
				return false;
			}else if(numStrings!=spec.getnumStrings()){
				return false;
			}else if((model!=null)&&(!model.equals(""))&&(!model.toUpperCase().equals(spec.getModel().toUpperCase()))){
				return false;
			}else{
				return true;
			}
		}
	}

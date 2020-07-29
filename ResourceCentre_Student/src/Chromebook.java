
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		output += "Asset tag : " + super.getAssetTag() + ", Description : " + super.getDescription() + 
		        ", Optical Zoom : " + os ;
		return output;
	}
}



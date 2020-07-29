
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		output += "Asset tag : " + super.getAssetTag() + ", Description : " + super.getDescription() + 
		        ", Optical Zoom : " + opticalZoom ;
		return output;
	}
}


package fuck996.entityPaser;

public class NullDataParser implements EntityParser{
	
	public static NullDataParser instance() {
		return new NullDataParser();
	}

	@Override
	public Object parser() {
		return null;
	}

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public EntityParser createParser(String str) {
		return instance();
	}

}

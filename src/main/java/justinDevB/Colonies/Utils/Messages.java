package justinDevB.Colonies.Utils;

import de.leonhard.storage.Yaml;

public class Messages {
	private static Yaml messages = Settings.getMessages();
	public static final String FILE_SAVE_ERROR = messages.getString("Errors.file_save");
	public static final String CHUNK_CLAIMED_ERROR = messages.getString("Errors.chunk_already_claimed");
	
}
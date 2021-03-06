package justinDevB.Colonies.Exceptions;

import justinDevB.Colonies.Utils.Messages;

public class FileSaveException extends ColonyException  {
	
	/**
	 * Error that is thrown when a file fails to save
	 */
	private static final long serialVersionUID = 241143361216136349L;

	public FileSaveException() {
		super(Messages.FILE_SAVE_ERROR);
	}
	
	public FileSaveException(String message) {
		super(message);
	}

}

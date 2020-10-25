package justinDevB.Colonies.Commands;

import justinDevB.Colonies.Colonies;
import justinDevB.Colonies.Utils.Messages;
import justinDevB.Colonies.Citizen.Rank;
import justinDevB.Colonies.ClaimManager;

import justinDevB.mondocommand.dynmaic.Sub;
import justinDevB.mondocommand.CallInfo;

import net.md_5.bungee.api.ChatColor;

public class Commands {

	private final Colonies townyx;

	public Commands(Colonies tX) {
		this.townyx = tX;
	}

	@Sub(rank = Rank.ADMIN, description = "test commands", allowConsole = true)
	public void test(CallInfo call) {
		call.reply(Messages.FILE_SAVE_ERROR);
	}

	@Sub(rank = Rank.ADMIN, description = "Info command", allowConsole = true)
	public void info(CallInfo call) {
		call.reply(ChatColor.GREEN + "Mode: " + ChatColor.GOLD + townyx.getMode());
	}
	
	@Sub(rank = Rank.ADMIN, description = "Check if singleton is loaded, allowConsole = true")
	public void testCall(CallInfo call) {
		ClaimManager.getInstance().testFunction();
	}
}
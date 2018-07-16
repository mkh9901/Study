package core;

import util.Util;

public class BlockChainStarter_save {
	public static void main(String[] args) {
		int nonce = 0;
		while (true) {
			if (Util.getHash(nonce + "").substring(0, 6).equals("000000")) {
				System.out.println("Á¤´ä : " + nonce);
				break;
			}
			nonce++;
		}
	}
}

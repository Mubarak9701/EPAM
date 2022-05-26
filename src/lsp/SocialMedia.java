package lsp;

public abstract class SocialMedia {
	
	//supports facebook,insagram,whatsapp
	public abstract void chatWithFriend();
	
	//supports facebook,insagram
	public abstract void publishPost(String post);
	
	//supports facebook,insagram,whatsapp
	public abstract void sendPhotoVideo();
	
	//supports facebook,whatsapp
	public abstract void groupCalling(String[] users);
	
}

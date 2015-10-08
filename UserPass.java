import javax.swing.JOptionPane;
public class UserPass {
	public static void main(String[]args){
			String level[] = {"Admin","Staff","Student"};
					int tries = 0;
							boolean part2 = false;
									String Pass[] = {"Pass1","Pass2","Pass3"};
											String UN[] = {"User1","User2","User3"};
													String attempt = "";
															String PassAttempt = "";
																	String Tester="";
																			int i1 = 0;
																					boolean passtry = false;
																							while (tries < 3 && part2 == false){
																										attempt = JOptionPane.showInputDialog(null,"Enter your username.");
																													if (attempt.equals(UN[0])){
																																	passtry=true;
																																					i1=0;
																																								}else if (attempt.equals(UN[1])){
																																												passtry=true;
																																																i1=1;
																																																			}else if (attempt.equals(UN[2])){
																																																							passtry=true;
																																																											i1=2;
																																																														}else{
																																																																		tries++;
																																																																						i1=4;
																																																																									}
																																																																												if (i1<4){
																																																																																PassAttempt = JOptionPane.showInputDialog(null,"Enter your Password.");
																																																																																				if (PassAttempt.equals(Pass[i1])){
																																																																																									part2=true;
																																																																																													}else{
																																																																																																		tries++;
																																																																																																						}
																																																																																																									}
																																																																																																											}
																																																																																																													if (tries >= 3){
																																																																																																																JOptionPane.showMessageDialog(null, "Contact your administrator.");
																																																																																																																			System.exit(0);
																																																																																																																					}	
																																																																																																																							if (part2=true){
																																																																																																																										while (Tester != level[i1]){
																																																																																																																														Tester = (String) JOptionPane.showInputDialog(null, "Choose your account type.","String",0, null, level, level[0]);
																																																																																																																																	}
																																																																																																																																				switch (i1){
																																																																																																																																							case 0: JOptionPane.showMessageDialog(null, "Welcome Admin.");
																																																																																																																																										break;
																																																																																																																																													case 1: JOptionPane.showMessageDialog(null, "Welcome Staff.");
																																																																																																																																																break;
																																																																																																																																																			case 2: JOptionPane.showMessageDialog(null, "Welcome Student.");
																																																																																																																																																						break;
																																																																																																																																																									}
																																																																																																																																																											}else{
																																																																																																																																																														System.exit(0);
																																																																																																																																																																}
																																																																																																																																																																	}
																																																																																																																																																																	}

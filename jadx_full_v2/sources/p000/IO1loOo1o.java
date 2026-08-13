            package p000;

            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.dao.ConversationDao;
            import com.google.ai.edge.gallery.data.local.dao.MessageDao;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IO1loOo1o {
                public ConversationDao I00000oIO;
                public MessageDao I00000oOI;

                public static Object I0001Ioi1lo(IO1loOo1o iO1loOo1o, String str, String str2, String str3, long j, String str4, Oll0io oll0io, int i) {
/* 3 */             if ((i & 16) != 0) {
/* 5 */                 j = 0;
                    }
/* 22 */            return iO1loOo1o.I0000oI00(str, str2, str3, j, (i & 32) != 0 ? null : str4, oll0io);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(String str, String str2, String str3, String str4, IOoilo iOoilo) throws Throwable {
                    IO1li0I0iOOo iO1li0I0iOOo;
/* 7 */             if (iOoilo instanceof IO1li0I0iOOo) {
/* 10 */                iO1li0I0iOOo = (IO1li0I0iOOo) iOoilo;
/* 12 */                int i = iO1li0I0iOOo.I00iio;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    iO1li0I0iOOo.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    iO1li0I0iOOo = new IO1li0I0iOOo(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = iO1li0I0iOOo.I00iiI;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = iO1li0I0iOOo.I00iio;
/* 36 */            if (i2 != 0) {
/* 38 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 40 */                Conversation conversation = iO1li0I0iOOo.I00iOIl;
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
/* 45 */                return conversation;
                    }
/* 53 */            lIoii1l01l0i.I00000oOI(obj);
/* 76 */            Conversation conversation2 = new Conversation(null, str, str2, str3, 0L, 0L, 0, str4, 113, null);
/* 79 */            ConversationDao conversationDao = this.I00000oIO;
/* 81 */            iO1li0I0iOOo.I00iOIl = conversation2;
/* 83 */            iO1li0I0iOOo.I00iio = 1;
                    return conversationDao.insert(conversation2, iO1li0I0iOOo) == ii0111o ? ii0111o : conversation2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
                
                    if (r9 == r2) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
                
                    if (r0.deleteAll(r1) == r2) goto L29;
                 */
                /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0073 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(IOoilo iOoilo) throws Throwable {
                    IO1llI00iI iO1llI00iI;
                    int i;
                    Iterator it;
/* 1 */             ConversationDao conversationDao = this.I00000oIO;
/* 5 */             if (iOoilo instanceof IO1llI00iI) {
/* 8 */                 iO1llI00iI = (IO1llI00iI) iOoilo;
/* 10 */                int i2 = iO1llI00iI.I00ilI0I1;
/* 16 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 19 */                    iO1llI00iI.I00ilI0I1 = i2 - Integer.MIN_VALUE;
                        } else {
/* 24 */                    iO1llI00iI = new IO1llI00iI(this, iOoilo);
                        }
                    }
/* 27 */            Object allConversationsSync = iO1llI00iI.I00iiO;
/* 29 */            Object obj = Ii0111o.I00iOIl;
/* 31 */            int i3 = iO1llI00iI.I00ilI0I1;
/* 37 */            if (i3 == 0) {
/* 67 */                lIoii1l01l0i.I00000oOI(allConversationsSync);
/* 70 */                iO1llI00iI.I00ilI0I1 = 1;
/* 72 */                allConversationsSync = conversationDao.getAllConversationsSync(iO1llI00iI);
                    } else {
/* 39 */                if (i3 != 1) {
/* 41 */                    if (i3 != 2) {
/* 43 */                        if (i3 == 3) {
/* 45 */                            lIoii1l01l0i.I00000oOI(allConversationsSync);
/* 127 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 51 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 36 */                        return null;
                            }
/* 55 */                    i = iO1llI00iI.I00iiI;
/* 57 */                    it = iO1llI00iI.I00iOIl;
/* 59 */                    lIoii1l01l0i.I00000oOI(allConversationsSync);
                            while (true) {
/* 91 */                        if (it.hasNext()) {
/* 116 */                           iO1llI00iI.I00iOIl = null;
/* 118 */                           iO1llI00iI.I00ilI0I1 = 3;
                                } else {
/* 99 */                            String id = ((Conversation) it.next()).getId();
/* 103 */                           iO1llI00iI.I00iOIl = it;
/* 105 */                           iO1llI00iI.I00iiI = i;
/* 107 */                           iO1llI00iI.I00ilI0I1 = 2;
/* 113 */                           if (I0000O(id, iO1llI00iI) == obj) {
                                        break;
                                    }
                                }
                            }
/* 126 */                   return obj;
                        }
/* 63 */                lIoii1l01l0i.I00000oOI(allConversationsSync);
                    }
/* 85 */            i = 0;
/* 81 */            it = ((Iterable) allConversationsSync).iterator();
                    while (true) {
/* 91 */                if (it.hasNext()) {
                        }
                    }
/* 126 */           return obj;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (r6.delete(r7, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(Conversation conversation, IOoilo iOoilo) throws Throwable {
                    IO1lli iO1lli;
/* 3 */             if (iOoilo instanceof IO1lli) {
/* 6 */                 iO1lli = (IO1lli) iOoilo;
/* 8 */                 int i = iO1lli.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO1lli.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO1lli = new IO1lli(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = iO1lli.I00iiI;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = iO1lli.I00iio;
/* 34 */            if (i2 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(obj);
/* 59 */                String id = conversation.getId();
/* 63 */                iO1lli.I00iOIl = conversation;
/* 65 */                iO1lli.I00iio = 1;
/* 71 */                if (I0000O(id, iO1lli) != obj2) {
                        }
/* 86 */                return obj2;
                    }
/* 36 */            if (i2 != 1) {
/* 38 */                if (i2 == 2) {
/* 40 */                    lIoii1l01l0i.I00000oOI(obj);
/* 87 */                    return OoiIlOl1iI.I00000oIO;
                        }
/* 46 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 50 */            conversation = iO1lli.I00iOIl;
/* 52 */            lIoii1l01l0i.I00000oOI(obj);
/* 74 */            ConversationDao conversationDao = this.I00000oIO;
/* 76 */            iO1lli.I00iOIl = null;
/* 78 */            iO1lli.I00iio = 2;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(String str, IOoilo iOoilo) throws Throwable {
                    IO1lliIlOiI iO1lliIlOiI;
/* 3 */             if (iOoilo instanceof IO1lliIlOiI) {
/* 6 */                 iO1lliIlOiI = (IO1lliIlOiI) iOoilo;
/* 8 */                 int i = iO1lliIlOiI.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO1lliIlOiI.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO1lliIlOiI = new IO1lliIlOiI(this, iOoilo);
                        }
                    }
/* 25 */            Object messagesForConversationSync = iO1lliIlOiI.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iO1lliIlOiI.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(messagesForConversationSync);
/* 50 */                MessageDao messageDao = this.I00000oOI;
/* 52 */                iO1lliIlOiI.I00iiO = 1;
/* 54 */                messagesForConversationSync = messageDao.getMessagesForConversationSync(str, iO1lliIlOiI);
/* 58 */                if (messagesForConversationSync == ii0111o) {
/* 60 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(messagesForConversationSync);
                    }
/* 65 */            ArrayList arrayList = new ArrayList();
/* 68 */            Iterator it = ((Iterable) messagesForConversationSync).iterator();
/* 76 */            while (it.hasNext()) {
/* 84 */                String imagePaths = ((Message) it.next()).getImagePaths();
/* 88 */                if (imagePaths != null) {
/* 90 */                    arrayList.add(imagePaths);
                        }
                    }
/* 96 */            ArrayList arrayList2 = new ArrayList();
/* 99 */            Iterator it2 = arrayList.iterator();
/* 107 */           while (it2.hasNext()) {
/* 128 */               IOOii0O10Io0.I00100l0(arrayList2, OlOoOIi0o.I00IoIO0lI((String) it2.next(), new String[]{","}, 6));
                    }
/* 134 */           ArrayList arrayList3 = new ArrayList();
/* 137 */           Iterator it3 = arrayList2.iterator();
/* 145 */           while (it3.hasNext()) {
/* 147 */               Object next = it3.next();
/* 158 */               if (!OlOoOIi0o.I001l0I00((String) next)) {
/* 160 */                   arrayList3.add(next);
                        }
                    }
/* 164 */           Iterator it4 = arrayList3.iterator();
/* 172 */           while (it4.hasNext()) {
                        try {
/* 185 */                   lO11O1Oio.I0000Il00O(new File((String) it4.next()));
                        } catch (Exception e) {
/* 194 */                   Log.w("ChatImageStore", "Failed to delete chat image", e);
                        }
                    }
/* 198 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(String str, String str2, String str3, long j, String str4, IOoilo iOoilo) throws Throwable {
                    IO1lliOi iO1lliOi;
                    Message message;
                    String str5;
                    String str6;
                    long j2;
                    String str7;
                    String str8;
                    long j3;
                    String str9;
                    Message message2;
                    Conversation conversation;
                    String title;
/* 5 */             ConversationDao conversationDao = this.I00000oIO;
/* 9 */             if (iOoilo instanceof IO1lliOi) {
/* 12 */                iO1lliOi = (IO1lliOi) iOoilo;
/* 14 */                int i = iO1lliOi.I00ioIO;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    iO1lliOi.I00ioIO = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    iO1lliOi = new IO1lliOi(this, iOoilo);
                        }
                    }
/* 31 */            Object obj = iO1lliOi.I00ilO0;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = iO1lliOi.I00ioIO;
/* 41 */            if (i2 == 0) {
/* 91 */                lIoii1l01l0i.I00000oOI(obj);
/* 115 */               message = new Message(null, str, str2, str3, 0L, 0, j, str4, 17, null);
/* 118 */               MessageDao messageDao = this.I00000oOI;
/* 122 */               iO1lliOi.I00iOIl = str;
/* 126 */               iO1lliOi.I00iiI = str2;
/* 128 */               str5 = str3;
/* 130 */               iO1lliOi.I00iiO = str5;
/* 132 */               iO1lliOi.I00iio = message;
/* 136 */               iO1lliOi.I00ilI0I1 = j;
/* 138 */               iO1lliOi.I00ioIO = 1;
/* 144 */               if (messageDao.insert(message, iO1lliOi) != ii0111o) {
/* 148 */                   str6 = str;
/* 149 */                   j2 = j;
/* 150 */                   str7 = str2;
                        }
/* 266 */               return ii0111o;
                    }
/* 43 */            if (i2 != 1) {
/* 45 */                if (i2 != 2) {
/* 47 */                    if (i2 != 3) {
/* 57 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 40 */                        return null;
                            }
/* 49 */                    Message message3 = iO1lliOi.I00iio;
/* 51 */                    lIoii1l01l0i.I00000oOI(obj);
/* 54 */                    return message3;
                        }
/* 61 */                j3 = iO1lliOi.I00ilI0I1;
/* 63 */                message2 = iO1lliOi.I00iio;
/* 65 */                str8 = iO1lliOi.I00iiO;
/* 67 */                str9 = iO1lliOi.I00iiI;
/* 69 */                lIoii1l01l0i.I00000oOI(obj);
/* 179 */               conversation = (Conversation) obj;
/* 181 */               if (conversation != null) {
/* 183 */                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 191 */                   int messageCount = conversation.getMessageCount() + 1;
/* 197 */                   if (conversation.getMessageCount() == 0 && O0000Ioio00.I0000O(str9, "user")) {
/* 209 */                       title = OlOoOIi0o.I00OIl(50, str8);
/* 217 */                       if (str8.length() > 50) {
/* 221 */                           title = title.concat("…");
                                }
                            } else {
/* 227 */                       title = conversation.getTitle();
                            }
/* 244 */                   Conversation conversationCopy$default = Conversation.copy$default(conversation, null, title, null, null, 0L, jCurrentTimeMillis, messageCount, null, 157, null);
/* 248 */                   iO1lliOi.I00iOIl = null;
/* 250 */                   iO1lliOi.I00iiI = null;
/* 252 */                   iO1lliOi.I00iiO = null;
/* 254 */                   iO1lliOi.I00iio = message2;
/* 256 */                   iO1lliOi.I00ilI0I1 = j3;
/* 258 */                   iO1lliOi.I00ioIO = 3;
/* 264 */                   if (conversationDao.update(conversationCopy$default, iO1lliOi) == ii0111o) {
/* 266 */                       return ii0111o;
                            }
                        }
/* 685 */               return message2;
                    }
/* 74 */            long j4 = iO1lliOi.I00ilI0I1;
/* 76 */            Message message4 = iO1lliOi.I00iio;
/* 78 */            String str10 = iO1lliOi.I00iiO;
/* 80 */            str7 = iO1lliOi.I00iiI;
/* 82 */            str6 = iO1lliOi.I00iOIl;
/* 84 */            lIoii1l01l0i.I00000oOI(obj);
/* 87 */            message = message4;
/* 88 */            j2 = j4;
/* 89 */            str5 = str10;
/* 151 */           iO1lliOi.I00iOIl = null;
/* 153 */           iO1lliOi.I00iiI = str7;
/* 155 */           iO1lliOi.I00iiO = str5;
/* 157 */           iO1lliOi.I00iio = message;
/* 159 */           iO1lliOi.I00ilI0I1 = j2;
/* 161 */           iO1lliOi.I00ioIO = 2;
/* 163 */           Object conversationById = conversationDao.getConversationById(str6, iO1lliOi);
/* 167 */           if (conversationById != ii0111o) {
/* 172 */               obj = conversationById;
/* 173 */               str8 = str5;
/* 174 */               j3 = j2;
/* 176 */               str9 = str7;
/* 177 */               message2 = message;
/* 179 */               conversation = (Conversation) obj;
/* 181 */               if (conversation != null) {
                        }
/* 685 */               return message2;
                    }
/* 266 */           return ii0111o;
                }
            }

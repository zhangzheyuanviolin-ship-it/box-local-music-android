            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import com.google.ai.edge.gallery.customtasks.agentchat.McpToolSet;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.MessageDao;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.ai.edge.litertlm.ToolSet;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
/* 21 */    public final class I0iOlI010ii extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public final Object I00ioIO;
                public final Object I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0iOlI010ii(OoIO11oiiiil ooIO11oiiiil, Context context, int i, O1oIOiI11o0 o1oIOiI11o0, OoIIOoO ooIIOoO, OoI1lOl ooI1lOl, OoI1lOl ooI1lOl2, IOoil1iiIilo iOoil1iiIilo) {
/* 19 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 4;
/* 4 */             this.I00iio = ooIO11oiiiil;
/* 6 */             this.I00ilI0I1 = context;
/* 8 */             this.I00iiO = i;
/* 10 */            this.I00ilO0 = o1oIOiI11o0;
/* 12 */            this.I00io1l = ooIIOoO;
/* 14 */            this.I00ioIO = ooI1lOl;
/* 16 */            this.I00l0I0l0lO1 = ooI1lOl2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:128:0x045c, code lost:
                
                    if (r6.I00000oOI(r25, r18) != r4) goto L130;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x01ed, code lost:
                
                    if (r0.I00000oOI(r25, r16) == r4) goto L129;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0372 A[Catch: Exception -> 0x036f, TryCatch #1 {Exception -> 0x036f, blocks: (B:117:0x03fd, B:103:0x0363, B:107:0x0372, B:108:0x0381, B:110:0x0387, B:112:0x038f, B:113:0x0393), top: B:138:0x0023 }] */
                /* JADX WARN: Removed duplicated region for block: B:125:0x043d  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x0440  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x0211 A[EXC_TOP_SPLITTER, PHI: r5 r8 r17
                  0x0211: PHI (r5v26 int) = (r5v14 int), (r5v27 int) binds: [B:76:0x020c, B:70:0x01c4] A[DONT_GENERATE, DONT_INLINE]
                  0x0211: PHI (r8v21 IOIo001i1o) = (r8v11 IOIo001i1o), (r8v22 IOIo001i1o) binds: [B:76:0x020c, B:70:0x01c4] A[DONT_GENERATE, DONT_INLINE]
                  0x0211: PHI (r17v9 java.lang.String) = (r17v5 java.lang.String), (r17v10 java.lang.String) binds: [B:76:0x020c, B:70:0x01c4] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x01c6  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x026b  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x026d A[Catch: Exception -> 0x041a, PHI: r5 r8 r16 r17
                  0x026d: PHI (r5v31 int) = (r5v26 int), (r5v32 int) binds: [B:80:0x0269, B:21:0x0080] A[DONT_GENERATE, DONT_INLINE]
                  0x026d: PHI (r8v29 IOIo001i1o) = (r8v21 IOIo001i1o), (r8v31 IOIo001i1o) binds: [B:80:0x0269, B:21:0x0080] A[DONT_GENERATE, DONT_INLINE]
                  0x026d: PHI (r16v11 java.lang.Object) = (r16v8 java.lang.Object), (r16v12 java.lang.Object) binds: [B:80:0x0269, B:21:0x0080] A[DONT_GENERATE, DONT_INLINE]
                  0x026d: PHI (r17v14 java.lang.String) = (r17v9 java.lang.String), (r17v15 java.lang.String) binds: [B:80:0x0269, B:21:0x0080] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {Exception -> 0x041a, blocks: (B:82:0x026d, B:79:0x021e), top: B:139:0x021e }] */
                /* JADX WARN: Removed duplicated region for block: B:86:0x029a  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x029c A[Catch: Exception -> 0x02c7, PHI: r0 r5 r16 r17 r18
                  0x029c: PHI (r0v37 java.lang.Object) = (r0v36 java.lang.Object), (r0v52 java.lang.Object) binds: [B:85:0x0298, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]
                  0x029c: PHI (r5v33 int) = (r5v31 int), (r5v34 int) binds: [B:85:0x0298, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]
                  0x029c: PHI (r16v13 java.lang.Object) = (r16v11 java.lang.Object), (r16v14 java.lang.Object) binds: [B:85:0x0298, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]
                  0x029c: PHI (r17v16 java.lang.String) = (r17v14 java.lang.String), (r17v17 java.lang.String) binds: [B:85:0x0298, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]
                  0x029c: PHI (r18v4 java.lang.String) = (r18v3 java.lang.String), (r18v7 java.lang.String) binds: [B:85:0x0298, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {Exception -> 0x02c7, blocks: (B:101:0x0352, B:87:0x029c, B:90:0x02aa, B:91:0x02b5, B:93:0x02bb, B:95:0x02c3, B:98:0x02ce, B:84:0x0278), top: B:141:0x0278 }] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x02aa A[Catch: Exception -> 0x02c7, TRY_ENTER, TryCatch #4 {Exception -> 0x02c7, blocks: (B:101:0x0352, B:87:0x029c, B:90:0x02aa, B:91:0x02b5, B:93:0x02bb, B:95:0x02c3, B:98:0x02ce, B:84:0x0278), top: B:141:0x0278 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I00000oIO(Object obj) throws Throwable {
                    String str;
                    Object next;
                    Object next2;
                    IOIo001i1o iOIo001i1o;
                    I1O0IlI1 i1O0IlI1;
                    IOIo001i1o iOIo001i1o2;
                    Object objI0010o;
                    IO1010 io1010;
                    Ol0oI0 ol0oI0;
                    Object obj2;
                    String str2;
                    Object objI000II;
                    boolean zI0000O;
                    String str3;
                    String str4;
                    String strI00000oIO;
/* 5 */             String str5 = (String) this.I00ioIO;
/* 9 */             String str6 = (String) this.I00io1l;
/* 13 */            McpToolSet mcpToolSet = (McpToolSet) this.I00l0I0l0lO1;
/* 15 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 17 */            int i = this.I00iiO;
/* 19 */            String str7 = "Unknown error";
/* 27 */            String str8 = "failed";
/* 35 */            Object obj3 = null;
                    try {
                        try {
                        } catch (Exception e) {
/* 880 */                   e = e;
                        }
                    } catch (Exception e2) {
/* 77 */                e = e2;
/* 19 */                str = "Unknown error";
                    }
                    switch (i) {
                        case 0:
/* 180 */                   lIoii1l01l0i.I00000oOI(obj);
/* 201 */                   Iterator it = ((O1i1IIoO1IIl) mcpToolSet.getMcpManagerViewModel().I0000oI00.I00iOIl.getValue()).I00000oIO.iterator();
                            while (true) {
/* 209 */                       if (it.hasNext()) {
/* 211 */                           next = it.next();
/* 220 */                           Iool1IOO1o0i iool1IOO1o0iI001IO000 = ((O1i1Ooo0ll) next).I00000oIO.I001IO000();
/* 228 */                           if (!iool1IOO1o0iI001IO000.isEmpty()) {
/* 233 */                               Iterator<E> it2 = iool1IOO1o0iI001IO000.iterator();
/* 241 */                               while (it2.hasNext()) {
/* 249 */                                   Iterator it3 = it;
/* 259 */                                   if (!O0000Ioio00.I0000O(((O1iI0OiI) it2.next()).I001IO000(), str6)) {
/* 262 */                                       it = it3;
                                            }
                                        }
                                    }
/* 265 */                           it = it;
                                } else {
/* 268 */                           next = null;
                                }
                            }
/* 269 */                   O1i1Ooo0ll o1i1Ooo0ll = (O1i1Ooo0ll) next;
/* 271 */                   if (o1i1Ooo0ll == null) {
/* 279 */                       Log.w("AGMcpToolSet", "MCP tool not found: ".concat(str6));
/* 1 */                         mcpToolSet.logMcpExecution(false, "tool_not_found");
/* 304 */                       return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", "Tool not found"), new OIoi0IIoi("status", "failed"));
                            }
/* 309 */                   IOIo001i1o iOIo001i1o3 = o1i1Ooo0ll.I00000oOI;
/* 311 */                   if (iOIo001i1o3 == null) {
/* 1 */                         mcpToolSet.logMcpExecution(false, "client_not_initialized");
/* 335 */                       return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", "Client not initialized"), new OIoi0IIoi("status", "failed"));
                            }
/* 346 */                   Iterator<E> it4 = o1i1Ooo0ll.I00000oIO.I001IO000().iterator();
                            while (true) {
/* 354 */                       if (it4.hasNext()) {
/* 356 */                           next2 = it4.next();
/* 364 */                           str = str7;
/* 374 */                           if (!O0000Ioio00.I0000O(((O1iI0OiI) next2).I001IO000(), str6)) {
/* 377 */                               str7 = str;
                                    }
                                } else {
/* 380 */                           str = str7;
/* 382 */                           next2 = null;
                                }
                            }
/* 383 */                   O1iI0OiI o1iI0OiI = (O1iI0OiI) next2;
/* 392 */                   int iI0010I0i = o1iI0OiI != null ? o1iI0OiI.I0010I0i() : 0;
/* 393 */                   if (iI0010I0i != 0) {
/* 527 */                       i = iI0010I0i;
/* 528 */                       iOIo001i1o = iOIo001i1o3;
/* 1 */                         io1010 = mcpToolSet._actionChannel;
/* 538 */                       StringBuilder sb = new StringBuilder();
/* 27 */                        obj2 = "failed";
/* 545 */                       sb.append("Calling MCP tool \"");
/* 548 */                       sb.append(str6);
/* 551 */                       sb.append("\"");
/* 599 */                       ol0oI0 = new Ol0oI0(sb.toString(), "Call MCP tool: \"" + str6 + "\"", 16, true, "- Input: " + str5);
/* 604 */                       this.I00iio = iOIo001i1o;
/* 607 */                       this.I00ilI0I1 = null;
/* 609 */                       this.I00iiI = i;
/* 612 */                       this.I00iiO = 4;
/* 618 */                       if (io1010.I00000oOI(this, ol0oI0) == ii0111o) {
                                }
/* 1119 */                      return ii0111o;
                            }
/* 397 */                   i1O0IlI1 = new I1O0IlI1(str6, str5);
/* 1 */                     IO1010 io10102 = mcpToolSet._actionChannel;
/* 404 */                   this.I00iio = iOIo001i1o3;
/* 406 */                   this.I00ilI0I1 = i1O0IlI1;
/* 408 */                   this.I00iiI = iI0010I0i;
/* 413 */                   this.I00iiO = 1;
/* 419 */                   if (io10102.I00000oOI(this, i1O0IlI1) != ii0111o) {
/* 423 */                       i = iI0010I0i;
/* 424 */                       iOIo001i1o2 = iOIo001i1o3;
/* 426 */                       IOi10loi iOi10loi = i1O0IlI1.I0000Il00O;
/* 428 */                       this.I00iio = iOIo001i1o2;
/* 431 */                       this.I00ilI0I1 = null;
/* 433 */                       this.I00iiI = i;
/* 436 */                       this.I00iiO = 2;
/* 438 */                       objI0010o = iOi10loi.I0010o(this);
/* 442 */                       Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 444 */                       if (objI0010o != ii0111o) {
/* 448 */                           iOIo001i1o = iOIo001i1o2;
/* 453 */                           if (((OO0l0IioO1) objI0010o) != OO0l0IioO1.I00iOIl) {
/* 1 */                                 IO1010 io10103 = mcpToolSet._actionChannel;
/* 475 */                               Ol0oI0 ol0oI02 = new Ol0oI0(IlIi0I0.I000lI("Permission denied for MCP tool \"", str6, "\""), (String) null, 28, false, (String) null);
/* 481 */                               this.I00iio = null;
/* 483 */                               this.I00ilI0I1 = null;
/* 485 */                               this.I00iiI = i;
/* 488 */                               this.I00iiO = 3;
                                        break;
                                    } else {
                                        try {
/* 1 */                                     io1010 = mcpToolSet._actionChannel;
/* 538 */                                   StringBuilder sb2 = new StringBuilder();
/* 27 */                                    obj2 = "failed";
                                        } catch (Exception e3) {
/* 1056 */                                  e = e3;
/* 27 */                                    obj3 = "failed";
/* 33 */                                    str8 = "status";
/* 1061 */                                  Log.e("AGMcpToolSet", "Error calling MCP tool", e);
/* 1 */                                     IO1010 io10104 = mcpToolSet._actionChannel;
/* 1072 */                                  String strI000lI = IlIi0I0.I000lI("Error calling MCP tool \"", str6, "\"");
/* 1076 */                                  String strI000lI2 = IlIi0I0.I000lI("Call MCP tool \"", str6, "\" failed");
/* 1080 */                                  String message = e.getMessage();
/* 1095 */                                  Ol0oI0 ol0oI03 = new Ol0oI0(strI000lI, strI000lI2, 16, false, message == null ? str : message);
/* 1101 */                                  this.I00iio = null;
/* 1103 */                                  this.I00ilI0I1 = e;
/* 1105 */                                  this.I00ilO0 = null;
/* 1107 */                                  this.I00iiI = i;
/* 1111 */                                  this.I00iiO = 8;
                                            break;
                                        }
                                        try {
/* 545 */                                   sb2.append("Calling MCP tool \"");
/* 548 */                                   sb2.append(str6);
/* 551 */                                   sb2.append("\"");
/* 599 */                                   ol0oI0 = new Ol0oI0(sb2.toString(), "Call MCP tool: \"" + str6 + "\"", 16, true, "- Input: " + str5);
/* 604 */                                   this.I00iio = iOIo001i1o;
/* 607 */                                   this.I00ilI0I1 = null;
/* 609 */                                   this.I00iiI = i;
/* 612 */                                   this.I00iiO = 4;
/* 618 */                                   if (io1010.I00000oOI(this, ol0oI0) == ii0111o) {
/* 626 */                                       O011Ol o011Ol = O011OoiO1.I0000O;
/* 628 */                                       o011Ol.getClass();
/* 33 */                                        str2 = "status";
                                                try {
/* 648 */                                           IIiIOO0O00i iIiIOO0O00i = new IIiIOO0O00i(new IIiIi10iloI(str6, O01O1110.I0000O((O01O0o1iI) o011Ol.I00000oOI(O01O1i1i.I00000oIO, str5))));
/* 652 */                                           this.I00iio = null;
/* 654 */                                           this.I00iiI = i;
/* 657 */                                           this.I00iiO = 5;
/* 659 */                                           int i2 = IOIo001i1o.I0010I0i;
/* 661 */                                           objI000II = iOIo001i1o.I000II(iIiIOO0O00i, this);
/* 665 */                                           if (objI000II == ii0111o) {
/* 669 */                                               IIiIoI1ii1 iIiIoI1ii1 = (IIiIoI1ii1) objI000II;
/* 675 */                                               zI0000O = O0000Ioio00.I0000O(iIiIoI1ii1.I00000oOI, Boolean.TRUE);
/* 679 */                                               List list = iIiIoI1ii1.I00000oIO;
/* 681 */                                               if (!zI0000O) {
/* 687 */                                                   ArrayList arrayList = new ArrayList();
/* 698 */                                                   for (Object obj4 : list) {
/* 706 */                                                       if (obj4 instanceof OloiioiOI1) {
/* 708 */                                                           arrayList.add(obj4);
                                                                }
                                                            }
/* 744 */                                                   strI00000oIO = l1IO1o0l0.I00000oIO(IOOi0Ool1i.I00IlilI0i0i(arrayList, "\n", null, null, new O0o01OIl(20), 30), "tool error");
/* 773 */                                                   Log.e("AGMcpToolSet", "MCP tool \"" + str6 + "\" failed: " + strI00000oIO);
/* 1 */                                                     IO1010 io10105 = mcpToolSet._actionChannel;
/* 826 */                                                   Ol0oI0 ol0oI04 = new Ol0oI0("Failed to call MCP tool \"" + str6 + "\"", "Call MCP tool \"" + str6 + "\" failed", 16, false, strI00000oIO);
/* 832 */                                                   this.I00iio = null;
/* 834 */                                                   this.I00ilI0I1 = null;
/* 836 */                                                   this.I00ilO0 = strI00000oIO;
/* 838 */                                                   this.I00iiI = i;
/* 841 */                                                   this.I00iiO = 6;
/* 847 */                                                   if (io10105.I00000oOI(this, ol0oI04) == ii0111o) {
                                                            }
/* 1 */                                                     mcpToolSet.logMcpExecution(false, "tool_error");
/* 875 */                                                   return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", strI00000oIO), new OIoi0IIoi(str2, obj2));
                                                        }
/* 885 */                                               str3 = str2;
/* 891 */                                               ArrayList arrayList2 = new ArrayList();
/* 902 */                                               for (Object obj5 : list) {
/* 910 */                                                   if (obj5 instanceof OloiioiOI1) {
/* 912 */                                                       arrayList2.add(obj5);
                                                            }
                                                        }
/* 941 */                                               String strI00000oIO2 = l1IO1o0l0.I00000oIO(IOOi0Ool1i.I00IlilI0i0i(arrayList2, "\n", null, null, new O0o01OIl(21), 30), "tool result");
/* 1 */                                                 IO1010 io10106 = mcpToolSet._actionChannel;
/* 995 */                                               Ol0oI0 ol0oI05 = new Ol0oI0("Succeeded calling MCP tool \"" + str6 + "\"", "Call MCP tool \"" + str6 + "\" succeeded", 16, true, strI00000oIO2);
/* 1003 */                                              this.I00iio = null;
/* 1005 */                                              this.I00ilI0I1 = null;
/* 1007 */                                              this.I00ilO0 = strI00000oIO2;
/* 1009 */                                              this.I00iiI = i;
/* 1012 */                                              this.I00iiO = 7;
/* 1018 */                                              if (io10106.I00000oOI(this, ol0oI05) != ii0111o) {
/* 1021 */                                                  str4 = strI00000oIO2;
/* 1 */                                                     mcpToolSet.logMcpExecution(true, "");
/* 1046 */                                                  return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", str4), new OIoi0IIoi(str3, "succeeded"));
                                                        }
                                                    }
                                                } catch (Exception e4) {
/* 712 */                                           e = e4;
/* 713 */                                           obj3 = obj2;
/* 715 */                                           str8 = str2;
/* 1061 */                                          Log.e("AGMcpToolSet", "Error calling MCP tool", e);
/* 1 */                                             IO1010 io101042 = mcpToolSet._actionChannel;
/* 1072 */                                          String strI000lI3 = IlIi0I0.I000lI("Error calling MCP tool \"", str6, "\"");
/* 1076 */                                          String strI000lI22 = IlIi0I0.I000lI("Call MCP tool \"", str6, "\" failed");
/* 1080 */                                          String message2 = e.getMessage();
/* 1095 */                                          Ol0oI0 ol0oI032 = new Ol0oI0(strI000lI3, strI000lI22, 16, false, message2 == null ? str : message2);
/* 1101 */                                          this.I00iio = null;
/* 1103 */                                          this.I00ilI0I1 = e;
/* 1105 */                                          this.I00ilO0 = null;
/* 1107 */                                          this.I00iiI = i;
/* 1111 */                                          this.I00iiO = 8;
                                                }
                                            }
                                        } catch (Exception e5) {
/* 1051 */                                  e = e5;
/* 33 */                                    str8 = "status";
/* 1053 */                                  obj3 = obj2;
/* 1061 */                                  Log.e("AGMcpToolSet", "Error calling MCP tool", e);
/* 1 */                                     IO1010 io1010422 = mcpToolSet._actionChannel;
/* 1072 */                                  String strI000lI32 = IlIi0I0.I000lI("Error calling MCP tool \"", str6, "\"");
/* 1076 */                                  String strI000lI222 = IlIi0I0.I000lI("Call MCP tool \"", str6, "\" failed");
/* 1080 */                                  String message22 = e.getMessage();
/* 1095 */                                  Ol0oI0 ol0oI0322 = new Ol0oI0(strI000lI32, strI000lI222, 16, false, message22 == null ? str : message22);
/* 1101 */                                  this.I00iio = null;
/* 1103 */                                  this.I00ilI0I1 = e;
/* 1105 */                                  this.I00ilO0 = null;
/* 1107 */                                  this.I00iiI = i;
/* 1111 */                                  this.I00iiO = 8;
                                        }
                                    }
                                }
                            }
/* 1119 */                  return ii0111o;
                        case 1:
/* 163 */                   i = this.I00iiI;
/* 167 */                   i1O0IlI1 = (I1O0IlI1) this.I00ilI0I1;
/* 171 */                   iOIo001i1o2 = (IOIo001i1o) this.I00iio;
/* 173 */                   lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    str = "Unknown error";
/* 426 */                   IOi10loi iOi10loi2 = i1O0IlI1.I0000Il00O;
/* 428 */                   this.I00iio = iOIo001i1o2;
/* 431 */                   this.I00ilI0I1 = null;
/* 433 */                   this.I00iiI = i;
/* 436 */                   this.I00iiO = 2;
/* 438 */                   objI0010o = iOi10loi2.I0010o(this);
/* 442 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 444 */                   if (objI0010o != ii0111o) {
                            }
/* 1119 */                  return ii0111o;
                        case 2:
/* 144 */                   i = this.I00iiI;
/* 152 */                   iOIo001i1o = (IOIo001i1o) this.I00iio;
/* 154 */                   lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    str = "Unknown error";
/* 159 */                   objI0010o = obj;
/* 453 */                   if (((OO0l0IioO1) objI0010o) != OO0l0IioO1.I00iOIl) {
                            }
/* 1119 */                  return ii0111o;
                        case 3:
/* 139 */                   lIoii1l01l0i.I00000oOI(obj);
/* 1 */                     mcpToolSet.logMcpExecution(false, "permission_denied");
/* 520 */                   return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", "Permission denied by user"), new OIoi0IIoi("status", "failed"));
                        case 4:
/* 120 */                   i = this.I00iiI;
/* 124 */                   iOIo001i1o = (IOIo001i1o) this.I00iio;
/* 126 */                   lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    str = "Unknown error";
/* 27 */                    obj2 = "failed";
/* 626 */                   O011Ol o011Ol2 = O011OoiO1.I0000O;
/* 628 */                   o011Ol2.getClass();
/* 33 */                    str2 = "status";
/* 648 */                   IIiIOO0O00i iIiIOO0O00i2 = new IIiIOO0O00i(new IIiIi10iloI(str6, O01O1110.I0000O((O01O0o1iI) o011Ol2.I00000oOI(O01O1i1i.I00000oIO, str5))));
/* 652 */                   this.I00iio = null;
/* 654 */                   this.I00iiI = i;
/* 657 */                   this.I00iiO = 5;
/* 659 */                   int i22 = IOIo001i1o.I0010I0i;
/* 661 */                   objI000II = iOIo001i1o.I000II(iIiIOO0O00i2, this);
/* 665 */                   if (objI000II == ii0111o) {
                            }
/* 1119 */                  return ii0111o;
                        case 5:
/* 105 */                   i = this.I00iiI;
/* 107 */                   lIoii1l01l0i.I00000oOI(obj);
/* 110 */                   objI000II = obj;
/* 19 */                    str = "Unknown error";
/* 27 */                    obj2 = "failed";
/* 33 */                    str2 = "status";
/* 669 */                   IIiIoI1ii1 iIiIoI1ii12 = (IIiIoI1ii1) objI000II;
/* 675 */                   zI0000O = O0000Ioio00.I0000O(iIiIoI1ii12.I00000oOI, Boolean.TRUE);
/* 679 */                   List list2 = iIiIoI1ii12.I00000oIO;
/* 681 */                   if (!zI0000O) {
                            }
/* 1119 */                  return ii0111o;
                        case 6:
/* 84 */                    i = this.I00iiI;
/* 88 */                    strI00000oIO = (String) this.I00ilO0;
/* 94 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    str = "Unknown error";
/* 27 */                    obj2 = "failed";
/* 33 */                    str2 = "status";
/* 1 */                     mcpToolSet.logMcpExecution(false, "tool_error");
/* 875 */                   return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", strI00000oIO), new OIoi0IIoi(str2, obj2));
                        case 7:
/* 58 */                    int i3 = this.I00iiI;
/* 62 */                    str4 = (String) this.I00ilO0;
/* 68 */                    lIoii1l01l0i.I00000oOI(obj);
/* 33 */                    str3 = "status";
/* 1 */                     mcpToolSet.logMcpExecution(true, "");
/* 1046 */                  return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", str4), new OIoi0IIoi(str3, "succeeded"));
                        case 8:
/* 47 */                    e = (Exception) this.I00ilI0I1;
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    str = "Unknown error";
/* 27 */                    obj3 = "failed";
/* 33 */                    str8 = "status";
/* 1 */                     mcpToolSet.logMcpExecution(false, "exception");
/* 1126 */                  String message3 = e.getMessage();
/* 1150 */                  return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", message3 == null ? str : message3), new OIoi0IIoi(str8, obj3));
                        default:
/* 41 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                    }
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00l0I0l0lO1;
/* 5 */             Object obj3 = this.I00ioIO;
                    switch (i) {
                        case 0:
/* 126 */                   return new I0iOlI010ii((AgentTools) obj2, (String) this.I00io1l, (String) obj3, iOoil1iiIilo, 0);
                        case 1:
/* 107 */                   return new I0iOlI010ii((BoxChatDatabase) this.I00iio, (Conversation) this.I00ilI0I1, (Ol1o0O0O0) this.I00ilO0, (IlooOlI) this.I00io1l, (OI10i0Il) obj3, (OI10i0Il) obj2, iOoil1iiIilo);
                        case 2:
/* 73 */                    return new I0iOlI010ii((McpToolSet) obj2, (String) this.I00io1l, (String) obj3, iOoil1iiIilo, 2);
                        case 3:
/* 52 */                    I0iOlI010ii i0iOlI010ii = new I0iOlI010ii((OilIlo) obj3, (O1oIOiI11o0) obj2, iOoil1iiIilo);
/* 55 */                    i0iOlI010ii.I00ilI0I1 = obj;
/* 57 */                    return i0iOlI010ii;
                        default:
/* 41 */                    return new I0iOlI010ii((OoIO11oiiiil) this.I00iio, (Context) this.I00ilI0I1, this.I00iiO, (O1oIOiI11o0) this.I00ilO0, (OoIIOoO) this.I00io1l, (OoI1lOl) obj3, (OoI1lOl) obj2, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((I0iOlI010ii) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:134:0x03c2, code lost:
                
                    if (r0 != r11) goto L136;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:208:0x05bd, code lost:
                
                    if (r0.I00000oOI(r29, r22) == r8) goto L265;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:264:0x0834, code lost:
                
                    if (r2.I00000oOI(r29, r23) != r8) goto L266;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00fb, code lost:
                
                    if (r0.I000iOII(r1, r2, r3, r4, r9, r6, r29) == r11) goto L27;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:130:0x03ad  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x03d9  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x0590 A[PHI: r5 r6 r9 r22
                  0x0590: PHI (r5v38 IOIo001i1o) = (r5v34 IOIo001i1o), (r5v40 IOIo001i1o) binds: [B:203:0x058c, B:162:0x046a] A[DONT_GENERATE, DONT_INLINE]
                  0x0590: PHI (r6v22 int) = (r6v18 int), (r6v24 int) binds: [B:203:0x058c, B:162:0x046a] A[DONT_GENERATE, DONT_INLINE]
                  0x0590: PHI (r9v22 java.lang.Object) = (r9v18 java.lang.Object), (r9v29 java.lang.Object) binds: [B:203:0x058c, B:162:0x046a] A[DONT_GENERATE, DONT_INLINE]
                  0x0590: PHI (r22v15 java.lang.String) = (r22v12 java.lang.String), (r22v17 java.lang.String) binds: [B:203:0x058c, B:162:0x046a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:207:0x0596  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x05dd  */
                /* JADX WARN: Removed duplicated region for block: B:217:0x0641  */
                /* JADX WARN: Removed duplicated region for block: B:218:0x0643 A[Catch: Exception -> 0x07f2, PHI: r6 r9 r19 r22
                  0x0643: PHI (r6v25 IOIo001i1o) = (r6v20 IOIo001i1o), (r6v27 IOIo001i1o) binds: [B:216:0x063f, B:160:0x045b] A[DONT_GENERATE, DONT_INLINE]
                  0x0643: PHI (r9v32 int) = (r9v21 int), (r9v33 int) binds: [B:216:0x063f, B:160:0x045b] A[DONT_GENERATE, DONT_INLINE]
                  0x0643: PHI (r19v2 java.lang.Object) = (r19v0 java.lang.Object), (r19v3 java.lang.Object) binds: [B:216:0x063f, B:160:0x045b] A[DONT_GENERATE, DONT_INLINE]
                  0x0643: PHI (r22v19 java.lang.String) = (r22v14 java.lang.String), (r22v20 java.lang.String) binds: [B:216:0x063f, B:160:0x045b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #9 {Exception -> 0x07f2, blocks: (B:218:0x0643, B:215:0x05f4), top: B:287:0x05f4 }] */
                /* JADX WARN: Removed duplicated region for block: B:222:0x0670  */
                /* JADX WARN: Removed duplicated region for block: B:223:0x0672 A[Catch: Exception -> 0x069d, PHI: r0 r9 r18 r19 r22
                  0x0672: PHI (r0v35 java.lang.Object) = (r0v34 java.lang.Object), (r0v50 java.lang.Object) binds: [B:221:0x066e, B:157:0x0448] A[DONT_GENERATE, DONT_INLINE]
                  0x0672: PHI (r9v34 int) = (r9v32 int), (r9v35 int) binds: [B:221:0x066e, B:157:0x0448] A[DONT_GENERATE, DONT_INLINE]
                  0x0672: PHI (r18v1 java.lang.Object) = (r18v0 java.lang.Object), (r18v2 java.lang.Object) binds: [B:221:0x066e, B:157:0x0448] A[DONT_GENERATE, DONT_INLINE]
                  0x0672: PHI (r19v4 java.lang.Object) = (r19v2 java.lang.Object), (r19v5 java.lang.Object) binds: [B:221:0x066e, B:157:0x0448] A[DONT_GENERATE, DONT_INLINE]
                  0x0672: PHI (r22v21 java.lang.String) = (r22v19 java.lang.String), (r22v22 java.lang.String) binds: [B:221:0x066e, B:157:0x0448] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x069d, blocks: (B:238:0x0728, B:223:0x0672, B:226:0x0680, B:227:0x068b, B:229:0x0691, B:231:0x0699, B:235:0x06a4, B:220:0x064e), top: B:272:0x064e }] */
                /* JADX WARN: Removed duplicated region for block: B:226:0x0680 A[Catch: Exception -> 0x069d, TRY_ENTER, TryCatch #0 {Exception -> 0x069d, blocks: (B:238:0x0728, B:223:0x0672, B:226:0x0680, B:227:0x068b, B:229:0x0691, B:231:0x0699, B:235:0x06a4, B:220:0x064e), top: B:272:0x064e }] */
                /* JADX WARN: Removed duplicated region for block: B:243:0x0749 A[Catch: Exception -> 0x0746, TryCatch #6 {Exception -> 0x0746, blocks: (B:253:0x07d4, B:240:0x0739, B:243:0x0749, B:244:0x0758, B:246:0x075e, B:248:0x0766, B:249:0x076a), top: B:280:0x03fc }] */
                /* JADX WARN: Removed duplicated region for block: B:261:0x0815  */
                /* JADX WARN: Removed duplicated region for block: B:262:0x0818  */
                /* JADX WARN: Removed duplicated region for block: B:283:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0264  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x027e  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x02af  */
                /* JADX WARN: Type inference failed for: r0v134, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r5v23, types: [boolean] */
                /* JADX WARN: Type inference failed for: r6v0 */
                /* JADX WARN: Type inference failed for: r6v3 */
                /* JADX WARN: Type inference failed for: r6v32 */
                /* JADX WARN: Type inference failed for: r6v67 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x03c2 -> B:136:0x03c6). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object obj2;
                    String str;
                    Object obj3;
                    Object next;
                    Object next2;
                    IOIo001i1o iOIo001i1o;
                    IOIo001i1o iOIo001i1o2;
                    I1O0IlI1 i1O0IlI1;
                    int i;
                    Object objI0010o;
                    IO1010 io1010;
                    Ol0oI0 ol0oI0;
                    Object obj4;
                    Object obj5;
                    Object objI000II;
                    boolean zI0000O;
                    Object obj6;
                    String str2;
                    String strI00000oIO;
                    int iIntValue;
                    Object objI00000oIO;
                    Object messagesForConversationSync;
                    Object objI00000oIO2;
                    OilIlo oilIlo;
                    OI1I0OoOl oI1I0OoOl;
                    OOo0ooi oOo0ooi;
                    Oil1lO oil1lO;
                    OI11ol oI11ol;
                    Object objI0000oI00;
                    Object objI0000oI002;
/* 11 */            Object obj7 = null;
/* 11 */            int i2 = 0;
/* 12 */            ?? r6 = 1;
/* 14 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 995 */                   String str3 = (String) this.I00ioIO;
/* 1011 */                  String str4 = (String) this.I00io1l;
/* 1015 */                  AgentTools agentTools = (AgentTools) this.I00l0I0l0lO1;
/* 1017 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1019 */                  int i3 = this.I00iiO;
                            try {
                                try {
                                } catch (Exception e) {
/* 1064 */                          e = e;
/* 1005 */                          obj2 = "status";
/* 989 */                           str = "Unknown error";
                                }
                            } catch (Exception e2) {
/* 1863 */                      e = e2;
                            }
                            switch (i3) {
                                case 0:
/* 1168 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1189 */                          Iterator it = ((O1i1IIoO1IIl) agentTools.getMcpManagerViewModel().I0000oI00.I00iOIl.getValue()).I00000oIO.iterator();
                                    while (true) {
/* 1197 */                              if (it.hasNext()) {
/* 1199 */                                  next = it.next();
/* 1208 */                                  Iool1IOO1o0i iool1IOO1o0iI001IO000 = ((O1i1Ooo0ll) next).I00000oIO.I001IO000();
/* 1216 */                                  if (!iool1IOO1o0iI001IO000.isEmpty()) {
/* 1221 */                                      Iterator it2 = iool1IOO1o0iI001IO000.iterator();
/* 1229 */                                      while (it2.hasNext()) {
/* 1237 */                                          Iterator it3 = it;
/* 1247 */                                          if (!O0000Ioio00.I0000O(((O1iI0OiI) it2.next()).I001IO000(), str4)) {
/* 1250 */                                              it = it3;
                                                    }
                                                }
                                            }
/* 1253 */                                  it = it;
                                        } else {
/* 1256 */                                  next = null;
                                        }
                                    }
/* 1257 */                          O1i1Ooo0ll o1i1Ooo0ll = (O1i1Ooo0ll) next;
/* 1259 */                          if (o1i1Ooo0ll == null) {
/* 1267 */                              Log.w("AGAgentTools", "MCP server or tool not found for: ".concat(str4));
/* 1 */                                 agentTools.logMcpExecution(false, "tool_not_found");
/* 1 */                                 return agentTools.guardMissingEntityWithSkillFallback(str4, "Tool");
                                    }
/* 1285 */                          IOIo001i1o iOIo001i1o3 = o1i1Ooo0ll.I00000oOI;
/* 1287 */                          if (iOIo001i1o3 == null) {
/* 1 */                                 agentTools.logMcpExecution(false, "client_not_initialized");
/* 1310 */                              return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", "Client not initialized"), new OIoi0IIoi("status", "failed"));
                                    }
/* 1322 */                          Iterator it4 = o1i1Ooo0ll.I00000oIO.I001IO000().iterator();
                                    while (true) {
/* 1330 */                              if (it4.hasNext()) {
/* 1332 */                                  next2 = it4.next();
/* 1340 */                                  Iterator it5 = it4;
/* 1350 */                                  if (!O0000Ioio00.I0000O(((O1iI0OiI) next2).I001IO000(), str4)) {
/* 1353 */                                      it4 = it5;
                                            }
                                        } else {
/* 1356 */                                  next2 = null;
                                        }
                                    }
/* 1357 */                          O1iI0OiI o1iI0OiI = (O1iI0OiI) next2;
/* 1366 */                          int iI0010I0i = o1iI0OiI != null ? o1iI0OiI.I0010I0i() : 0;
/* 1367 */                          if (iI0010I0i != 0) {
/* 989 */                               str = "Unknown error";
/* 1509 */                              iOIo001i1o = iOIo001i1o3;
/* 1510 */                              i3 = iI0010I0i;
/* 1 */                                 io1010 = agentTools._actionChannel;
/* 1520 */                              StringBuilder sb = new StringBuilder();
/* 1005 */                              obj4 = "status";
/* 1527 */                              sb.append("Calling MCP tool \"");
/* 1530 */                              sb.append(str4);
/* 1533 */                              sb.append("\"");
/* 1581 */                              ol0oI0 = new Ol0oI0(sb.toString(), "Call MCP tool: \"" + str4 + "\"", 16, true, "- Input: " + str3);
/* 1586 */                              this.I00iio = iOIo001i1o;
/* 1589 */                              this.I00ilI0I1 = null;
/* 1591 */                              this.I00iiI = i3;
/* 1594 */                              this.I00iiO = 4;
/* 1600 */                              if (io1010.I00000oOI(this, ol0oI0) == ii0111o) {
                                        }
/* 2103 */                              return ii0111o;
                                    }
/* 1371 */                          I1O0IlI1 i1O0IlI12 = new I1O0IlI1(str4, str3);
/* 989 */                           str = "Unknown error";
/* 1 */                             IO1010 io10102 = agentTools._actionChannel;
/* 1380 */                          this.I00iio = iOIo001i1o3;
/* 1382 */                          this.I00ilI0I1 = i1O0IlI12;
/* 1384 */                          this.I00iiI = iI0010I0i;
/* 1386 */                          int i4 = iI0010I0i;
/* 1389 */                          this.I00iiO = 1;
/* 1395 */                          if (io10102.I00000oOI(this, i1O0IlI12) != ii0111o) {
/* 1399 */                              iOIo001i1o2 = iOIo001i1o3;
/* 1400 */                              i1O0IlI1 = i1O0IlI12;
/* 1401 */                              i = i4;
/* 1403 */                              IOi10loi iOi10loi = i1O0IlI1.I0000Il00O;
/* 1405 */                              this.I00iio = iOIo001i1o2;
/* 1408 */                              this.I00ilI0I1 = null;
/* 1410 */                              this.I00iiI = i;
/* 1413 */                              this.I00iiO = 2;
/* 1415 */                              objI0010o = iOi10loi.I0010o(this);
/* 1419 */                              Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1421 */                              if (objI0010o != ii0111o) {
/* 1429 */                                  if (((OO0l0IioO1) objI0010o) != OO0l0IioO1.I00iOIl) {
/* 1 */                                         IO1010 io10103 = agentTools._actionChannel;
/* 1451 */                                      Ol0oI0 ol0oI02 = new Ol0oI0(IlIi0I0.I000lI("Permission denied for MCP tool \"", str4, "\""), (String) null, 28, false, (String) null);
/* 1457 */                                      this.I00iio = null;
/* 1459 */                                      this.I00ilI0I1 = null;
/* 1461 */                                      this.I00iiI = i;
/* 1464 */                                      this.I00iiO = 3;
                                                break;
                                            } else {
/* 1502 */                                      i3 = i;
/* 1503 */                                      iOIo001i1o = iOIo001i1o2;
                                                try {
/* 1 */                                             io1010 = agentTools._actionChannel;
/* 1520 */                                          StringBuilder sb2 = new StringBuilder();
/* 1005 */                                          obj4 = "status";
                                                } catch (Exception e3) {
/* 2039 */                                          e = e3;
/* 1005 */                                          obj2 = "status";
/* 1001 */                                          obj7 = "failed";
                                                    r6 = obj2;
/* 2045 */                                          Log.e("AGAgentTools", "Error calling MCP tool", e);
/* 1 */                                             IO1010 io10104 = agentTools._actionChannel;
/* 2056 */                                          String strI000lI = IlIi0I0.I000lI("Error calling MCP tool \"", str4, "\"");
/* 2060 */                                          String strI000lI2 = IlIi0I0.I000lI("Call MCP tool \"", str4, "\" failed");
/* 2064 */                                          String message = e.getMessage();
/* 2079 */                                          Ol0oI0 ol0oI03 = new Ol0oI0(strI000lI, strI000lI2, 16, false, message == null ? str : message);
/* 2085 */                                          this.I00iio = null;
/* 2087 */                                          this.I00ilI0I1 = e;
/* 2089 */                                          this.I00ilO0 = null;
/* 2091 */                                          this.I00iiI = i3;
/* 2095 */                                          this.I00iiO = 8;
                                                    obj3 = r6;
                                                    break;
                                                }
                                                try {
/* 1527 */                                          sb2.append("Calling MCP tool \"");
/* 1530 */                                          sb2.append(str4);
/* 1533 */                                          sb2.append("\"");
/* 1581 */                                          ol0oI0 = new Ol0oI0(sb2.toString(), "Call MCP tool: \"" + str4 + "\"", 16, true, "- Input: " + str3);
/* 1586 */                                          this.I00iio = iOIo001i1o;
/* 1589 */                                          this.I00ilI0I1 = null;
/* 1591 */                                          this.I00iiI = i3;
/* 1594 */                                          this.I00iiO = 4;
/* 1600 */                                          if (io1010.I00000oOI(this, ol0oI0) == ii0111o) {
/* 1608 */                                              O011Ol o011Ol = O011OoiO1.I0000O;
/* 1610 */                                              o011Ol.getClass();
/* 1001 */                                              obj5 = "failed";
                                                        try {
/* 1630 */                                                  IIiIOO0O00i iIiIOO0O00i = new IIiIOO0O00i(new IIiIi10iloI(str4, O01O1110.I0000O((O01O0o1iI) o011Ol.I00000oOI(O01O1i1i.I00000oIO, str3))));
/* 1634 */                                                  this.I00iio = null;
/* 1636 */                                                  this.I00iiI = i3;
/* 1639 */                                                  this.I00iiO = 5;
/* 1641 */                                                  int i5 = IOIo001i1o.I0010I0i;
/* 1643 */                                                  objI000II = iOIo001i1o.I000II(iIiIOO0O00i, this);
/* 1647 */                                                  if (objI000II == ii0111o) {
/* 1651 */                                                      IIiIoI1ii1 iIiIoI1ii1 = (IIiIoI1ii1) objI000II;
/* 1657 */                                                      zI0000O = O0000Ioio00.I0000O(iIiIoI1ii1.I00000oOI, Boolean.TRUE);
/* 1661 */                                                      List list = iIiIoI1ii1.I00000oIO;
/* 1663 */                                                      if (!zI0000O) {
/* 1669 */                                                          ArrayList arrayList = new ArrayList();
/* 1680 */                                                          for (Object obj8 : list) {
/* 1688 */                                                              if (obj8 instanceof OloiioiOI1) {
/* 1690 */                                                                  arrayList.add(obj8);
                                                                        }
                                                                    }
/* 1726 */                                                          strI00000oIO = iOIi01l.I00000oIO(IOOi0Ool1i.I00IlilI0i0i(arrayList, "\n", null, null, new I01OoIoio00O(10), 30), "tool error");
/* 1755 */                                                          Log.e("AGAgentTools", "MCP tool \"" + str4 + "\" failed: " + strI00000oIO);
/* 1 */                                                             IO1010 io10105 = agentTools._actionChannel;
/* 1808 */                                                          Ol0oI0 ol0oI04 = new Ol0oI0("Failed to call MCP tool \"" + str4 + "\"", "Call MCP tool \"" + str4 + "\" failed", 16, false, strI00000oIO);
/* 1814 */                                                          this.I00iio = null;
/* 1816 */                                                          this.I00ilI0I1 = null;
/* 1818 */                                                          this.I00ilO0 = strI00000oIO;
/* 1820 */                                                          this.I00iiI = i3;
/* 1823 */                                                          this.I00iiO = 6;
/* 1829 */                                                          if (io10105.I00000oOI(this, ol0oI04) == ii0111o) {
                                                                    }
/* 1 */                                                             agentTools.logMcpExecution(false, "tool_error");
/* 1857 */                                                          return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", strI00000oIO), new OIoi0IIoi(obj4, obj5));
                                                                }
/* 1868 */                                                      obj6 = obj4;
/* 1874 */                                                      ArrayList arrayList2 = new ArrayList();
/* 1885 */                                                      for (Object obj9 : list) {
/* 1893 */                                                          if (obj9 instanceof OloiioiOI1) {
/* 1895 */                                                              arrayList2.add(obj9);
                                                                    }
                                                                }
/* 1924 */                                                      String strI00000oIO2 = iOIi01l.I00000oIO(IOOi0Ool1i.I00IlilI0i0i(arrayList2, "\n", null, null, new I01OoIoio00O(11), 30), "tool result");
/* 1 */                                                         IO1010 io10106 = agentTools._actionChannel;
/* 1978 */                                                      Ol0oI0 ol0oI05 = new Ol0oI0("Succeeded calling MCP tool \"" + str4 + "\"", "Call MCP tool \"" + str4 + "\" succeeded", 16, true, strI00000oIO2);
/* 1986 */                                                      this.I00iio = null;
/* 1988 */                                                      this.I00ilI0I1 = null;
/* 1990 */                                                      this.I00ilO0 = strI00000oIO2;
/* 1992 */                                                      this.I00iiI = i3;
/* 1995 */                                                      this.I00iiO = 7;
/* 2001 */                                                      if (io10106.I00000oOI(this, ol0oI05) != ii0111o) {
/* 2004 */                                                          str2 = strI00000oIO2;
/* 1 */                                                             agentTools.logMcpExecution(true, "");
/* 2029 */                                                          return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", str2), new OIoi0IIoi(obj6, "succeeded"));
                                                                }
                                                            }
                                                        } catch (Exception e4) {
/* 1694 */                                                  e = e4;
/* 1695 */                                                  obj7 = obj5;
/* 1697 */                                                  r6 = obj4;
/* 2045 */                                                  Log.e("AGAgentTools", "Error calling MCP tool", e);
/* 1 */                                                     IO1010 io101042 = agentTools._actionChannel;
/* 2056 */                                                  String strI000lI3 = IlIi0I0.I000lI("Error calling MCP tool \"", str4, "\"");
/* 2060 */                                                  String strI000lI22 = IlIi0I0.I000lI("Call MCP tool \"", str4, "\" failed");
/* 2064 */                                                  String message2 = e.getMessage();
/* 2079 */                                                  Ol0oI0 ol0oI032 = new Ol0oI0(strI000lI3, strI000lI22, 16, false, message2 == null ? str : message2);
/* 2085 */                                                  this.I00iio = null;
/* 2087 */                                                  this.I00ilI0I1 = e;
/* 2089 */                                                  this.I00ilO0 = null;
/* 2091 */                                                  this.I00iiI = i3;
/* 2095 */                                                  this.I00iiO = 8;
                                                            obj3 = r6;
                                                        }
                                                    }
                                                } catch (Exception e5) {
/* 2035 */                                          e = e5;
/* 1001 */                                          obj7 = "failed";
/* 1697 */                                          r6 = obj4;
/* 2045 */                                          Log.e("AGAgentTools", "Error calling MCP tool", e);
/* 1 */                                             IO1010 io1010422 = agentTools._actionChannel;
/* 2056 */                                          String strI000lI32 = IlIi0I0.I000lI("Error calling MCP tool \"", str4, "\"");
/* 2060 */                                          String strI000lI222 = IlIi0I0.I000lI("Call MCP tool \"", str4, "\" failed");
/* 2064 */                                          String message22 = e.getMessage();
/* 2079 */                                          Ol0oI0 ol0oI0322 = new Ol0oI0(strI000lI32, strI000lI222, 16, false, message22 == null ? str : message22);
/* 2085 */                                          this.I00iio = null;
/* 2087 */                                          this.I00ilI0I1 = e;
/* 2089 */                                          this.I00ilO0 = null;
/* 2091 */                                          this.I00iiI = i3;
/* 2095 */                                          this.I00iiO = 8;
                                                    obj3 = r6;
                                                }
                                            }
                                        }
                                    }
/* 2103 */                          return ii0111o;
                                case 1:
/* 1151 */                          i = this.I00iiI;
/* 1155 */                          i1O0IlI1 = (I1O0IlI1) this.I00ilI0I1;
/* 1159 */                          iOIo001i1o2 = (IOIo001i1o) this.I00iio;
/* 1161 */                          lIoii1l01l0i.I00000oOI(obj);
/* 989 */                           str = "Unknown error";
/* 1403 */                          IOi10loi iOi10loi2 = i1O0IlI1.I0000Il00O;
/* 1405 */                          this.I00iio = iOIo001i1o2;
/* 1408 */                          this.I00ilI0I1 = null;
/* 1410 */                          this.I00iiI = i;
/* 1413 */                          this.I00iiO = 2;
/* 1415 */                          objI0010o = iOi10loi2.I0010o(this);
/* 1419 */                          Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 1421 */                          if (objI0010o != ii0111o) {
                                    }
/* 2103 */                          return ii0111o;
                                case 2:
/* 1131 */                          i = this.I00iiI;
/* 1139 */                          IOIo001i1o iOIo001i1o4 = (IOIo001i1o) this.I00iio;
/* 1141 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1144 */                          iOIo001i1o2 = iOIo001i1o4;
/* 989 */                           str = "Unknown error";
/* 1147 */                          objI0010o = obj;
/* 1429 */                          if (((OO0l0IioO1) objI0010o) != OO0l0IioO1.I00iOIl) {
                                    }
                                    break;
                                case 3:
/* 1126 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1 */                             agentTools.logMcpExecution(false, "permission_denied");
/* 1496 */                          return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", "Permission denied by user"), new OIoi0IIoi("status", "failed"));
                                case 4:
/* 1107 */                          i3 = this.I00iiI;
/* 1111 */                          iOIo001i1o = (IOIo001i1o) this.I00iio;
/* 1113 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1005 */                          obj4 = "status";
/* 989 */                           str = "Unknown error";
/* 1608 */                          O011Ol o011Ol2 = O011OoiO1.I0000O;
/* 1610 */                          o011Ol2.getClass();
/* 1001 */                          obj5 = "failed";
/* 1630 */                          IIiIOO0O00i iIiIOO0O00i2 = new IIiIOO0O00i(new IIiIi10iloI(str4, O01O1110.I0000O((O01O0o1iI) o011Ol2.I00000oOI(O01O1i1i.I00000oIO, str3))));
/* 1634 */                          this.I00iio = null;
/* 1636 */                          this.I00iiI = i3;
/* 1639 */                          this.I00iiO = 5;
/* 1641 */                          int i52 = IOIo001i1o.I0010I0i;
/* 1643 */                          objI000II = iOIo001i1o.I000II(iIiIOO0O00i2, this);
/* 1647 */                          if (objI000II == ii0111o) {
                                    }
/* 2103 */                          return ii0111o;
                                case 5:
/* 1092 */                          i3 = this.I00iiI;
/* 1094 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1097 */                          objI000II = obj;
/* 1005 */                          obj4 = "status";
/* 989 */                           str = "Unknown error";
/* 1001 */                          obj5 = "failed";
/* 1651 */                          IIiIoI1ii1 iIiIoI1ii12 = (IIiIoI1ii1) objI000II;
/* 1657 */                          zI0000O = O0000Ioio00.I0000O(iIiIoI1ii12.I00000oOI, Boolean.TRUE);
/* 1661 */                          List list2 = iIiIoI1ii12.I00000oIO;
/* 1663 */                          if (!zI0000O) {
                                    }
/* 2103 */                          return ii0111o;
                                case 6:
/* 1071 */                          i3 = this.I00iiI;
/* 1075 */                          strI00000oIO = (String) this.I00ilO0;
/* 1081 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1005 */                          obj4 = "status";
/* 989 */                           str = "Unknown error";
/* 1001 */                          obj5 = "failed";
/* 1 */                             agentTools.logMcpExecution(false, "tool_error");
/* 1857 */                          return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", strI00000oIO), new OIoi0IIoi(obj4, obj5));
                                case 7:
/* 1045 */                          int i6 = this.I00iiI;
/* 1049 */                          str2 = (String) this.I00ilO0;
/* 1055 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1005 */                          obj6 = "status";
/* 1 */                             agentTools.logMcpExecution(true, "");
/* 2029 */                          return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", str2), new OIoi0IIoi(obj6, "succeeded"));
                                case 8:
/* 1034 */                          e = (Exception) this.I00ilI0I1;
/* 1036 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1005 */                          obj3 = "status";
/* 989 */                           str = "Unknown error";
/* 1001 */                          obj7 = "failed";
/* 1 */                             agentTools.logMcpExecution(false, "exception");
/* 2111 */                          String message3 = e.getMessage();
/* 2135 */                          return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", message3 == null ? str : message3), new OIoi0IIoi(obj3, obj7));
                                default:
/* 1026 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1029 */                          return null;
                            }
                        case 1:
/* 745 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00l0I0l0lO1;
/* 750 */                   IlooOlI ilooOlI = (IlooOlI) this.I00io1l;
/* 752 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 754 */                   int i7 = this.I00iiO;
                            try {
                            } catch (Exception e6) {
/* 926 */                       IIlIOloOOO.I001iOo1i0O("chat checkStatus: ", e6.getMessage(), "GeminiNanoHub");
/* 929 */                       iIntValue = 0;
                            }
/* 756 */                   if (i7 == 0) {
/* 803 */                       lIoii1l01l0i.I00000oOI(obj);
/* 810 */                       MessageDao messageDaoI001i1O0Ol = ((BoxChatDatabase) this.I00iio).I001i1O0Ol();
/* 818 */                       String id = ((Conversation) this.I00ilI0I1).getId();
/* 822 */                       this.I00iiO = 1;
/* 824 */                       messagesForConversationSync = messageDaoI001i1O0Ol.getMessagesForConversationSync(id, this);
/* 828 */                       if (messagesForConversationSync != ii0111o3) {
                                }
/* 965 */                       return ii0111o3;
                            }
/* 758 */                   if (i7 == 1) {
/* 797 */                       lIoii1l01l0i.I00000oOI(obj);
/* 800 */                       messagesForConversationSync = obj;
                            } else if (i7 == 2) {
/* 787 */                       lIoii1l01l0i.I00000oOI(obj);
/* 790 */                       objI00000oIO2 = obj;
/* 913 */                       iIntValue = ((Number) objI00000oIO2).intValue();
/* 932 */                       Integer num = new Integer(iIntValue);
/* 935 */                       List list3 = Iloo0ilo.I00000oIO;
/* 937 */                       oI10i0Il.setValue(num);
/* 940 */                       if (iIntValue != 2) {
                                }
                            } else {
/* 762 */                       if (i7 != 3) {
/* 764 */                           if (i7 != 4) {
/* 775 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
                                    try {
/* 766 */                               lIoii1l01l0i.I00000oOI(obj);
/* 769 */                               objI00000oIO = obj;
                                    } catch (Exception unused) {
/* 974 */                               iIntValue = 0;
                                    }
/* 969 */                           iIntValue = ((Number) objI00000oIO).intValue();
/* 977 */                           Integer num2 = new Integer(iIntValue);
/* 980 */                           List list4 = Iloo0ilo.I00000oIO;
/* 982 */                           oI10i0Il.setValue(num2);
/* 940 */                           if (iIntValue != 2) {
/* 986 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 942 */                           this.I00iiI = iIntValue;
/* 944 */                           this.I00iiO = 3;
/* 952 */                           if (il0l1o1l.I00000oOI(5000L, this) != ii0111o3) {
/* 955 */                               this.I00iiI = iIntValue;
/* 957 */                               this.I00iiO = 4;
/* 959 */                               objI00000oIO = ilooOlI.I00000oIO(this);
                                        break;
                                    }
/* 965 */                           return ii0111o3;
                                }
/* 780 */                       iIntValue = this.I00iiI;
/* 782 */                       lIoii1l01l0i.I00000oOI(obj);
/* 955 */                       this.I00iiI = iIntValue;
/* 957 */                       this.I00iiO = 4;
/* 959 */                       objI00000oIO = ilooOlI.I00000oIO(this);
                            }
/* 836 */                   Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00ilO0;
/* 832 */                   List<Message> list5 = (List) messagesForConversationSync;
/* 846 */                   ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list5, 10));
/* 857 */                   for (Message message4 : list5) {
/* 884 */                       arrayList3.add(new OI1O0o0(message4.getContent(), O0000Ioio00.I0000O(message4.getRole(), "user")));
                            }
/* 888 */                   ol1o0O0O0.addAll(arrayList3);
/* 893 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ioIO;
/* 895 */                   List list6 = Iloo0ilo.I00000oIO;
/* 899 */                   oI10i0Il2.setValue(Boolean.FALSE);
/* 902 */                   this.I00iiO = 2;
/* 904 */                   objI00000oIO2 = ilooOlI.I00000oIO(this);
/* 908 */                   if (objI00000oIO2 == ii0111o3) {
/* 965 */                       return ii0111o3;
                            }
/* 913 */                   iIntValue = ((Number) objI00000oIO2).intValue();
/* 932 */                   Integer num3 = new Integer(iIntValue);
/* 935 */                   List list32 = Iloo0ilo.I00000oIO;
/* 937 */                   oI10i0Il.setValue(num3);
/* 940 */                   if (iIntValue != 2) {
                            }
                        case 2:
/* 737 */                   return I00000oIO(obj);
                        case 3:
/* 306 */                   Ii0110 ii0110 = (Ii0110) this.I00ilI0I1;
/* 308 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 310 */                   int i8 = this.I00iiO;
/* 312 */                   if (i8 == 0) {
/* 372 */                       lIoii1l01l0i.I00000oOI(obj);
/* 379 */                       OlIl0i olIl0i = ((OilIlo) this.I00ioIO).I0000O;
/* 381 */                       if (olIl0i != null) {
/* 383 */                           this.I00ilI0I1 = ii0110;
/* 385 */                           this.I00iiO = 1;
/* 391 */                           if (olIl0i.I001l0I00(this) != ii0111o4) {
                                    }
/* 611 */                           return ii0111o4;
                                }
                            } else {
/* 314 */                       if (i8 != 1) {
/* 316 */                           if (i8 == 2) {
/* 364 */                               lIoii1l01l0i.I00000oOI(obj);
/* 417 */                               oilIlo = (OilIlo) this.I00ioIO;
/* 419 */                               oilIlo.I0000oI00 = null;
/* 423 */                               OOo0ooi oOo0ooi2 = new OOo0ooi();
                                        synchronized (oilIlo.I0001Ioi1lo) {
/* 439 */                                   oOo0ooi2.I00iOIl = liI0oli01O0.I00000oIO(OilIlo.I000OOo1O(oilIlo.I0001Ioi1lo));
/* 443 */                                   oilIlo.I0001Ioi1lo.clear();
                                        }
/* 452 */                               if (((float[]) oOo0ooi2.I00iOIl).length == 0) {
/* 458 */                                   OlO0OIIl1 olO0OIIl1 = ((OilIlo) this.I00ioIO).I00000oOI;
/* 489 */                                   olO0OIIl1.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl1.getValue(), false, false, "", null, null, false, false, false, false, "No audio recorded", 505));
/* 492 */                                   return OoiIlOl1iI.I00000oIO;
                                        }
/* 500 */                               Object obj10 = ((O1oIOiI11o0) this.I00l0I0l0lO1).I00IlilI0i0i;
/* 509 */                               Oil1lO oil1lO2 = obj10 instanceof Oil1lO ? (Oil1lO) obj10 : null;
/* 512 */                               OilIlo oilIlo2 = (OilIlo) this.I00ioIO;
/* 514 */                               if (oil1lO2 == null) {
/* 516 */                                   OlO0OIIl1 olO0OIIl12 = oilIlo2.I00000oOI;
/* 547 */                                   olO0OIIl12.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl12.getValue(), false, false, "", null, null, false, false, false, false, "Model not loaded", 505));
/* 550 */                                   return OoiIlOl1iI.I00000oIO;
                                        }
/* 554 */                               oI1I0OoOl = oilIlo2.I000II;
/* 556 */                               this.I00ilI0I1 = null;
/* 558 */                               this.I00iio = oOo0ooi2;
/* 560 */                               this.I00ilO0 = oil1lO2;
/* 562 */                               this.I00io1l = oI1I0OoOl;
/* 564 */                               this.I00iiI = 0;
/* 566 */                               this.I00iiO = 3;
/* 572 */                               if (oI1I0OoOl.I00000oIO(this) != ii0111o4) {
/* 575 */                                   oOo0ooi = oOo0ooi2;
/* 576 */                                   oil1lO = oil1lO2;
/* 579 */                                   float[] fArr = (float[]) oOo0ooi.I00iOIl;
/* 581 */                                   this.I00ilI0I1 = null;
/* 583 */                                   this.I00iio = null;
/* 585 */                                   this.I00ilO0 = null;
/* 587 */                                   this.I00io1l = oI1I0OoOl;
/* 589 */                                   this.I00iiI = i2;
/* 591 */                                   this.I00iiO = 4;
/* 593 */                                   oil1lO.getClass();
/* 605 */                                   objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new O00lOIIO(oil1lO, fArr, iOoil1iiIilo, 27), this);
/* 609 */                                   if (objI0000oI00 != ii0111o4) {
                                            }
                                        }
/* 611 */                               return ii0111o4;
                                    }
/* 318 */                           if (i8 != 3) {
/* 320 */                               if (i8 != 4) {
/* 339 */                                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                    return null;
                                        }
/* 325 */                               oI11ol = (OI11ol) this.I00io1l;
                                        try {
/* 327 */                                   lIoii1l01l0i.I00000oOI(obj);
/* 330 */                                   objI0000oI00 = obj;
/* 614 */                                   Oil1oo000i oil1oo000i = (Oil1oo000i) objI0000oI00;
/* 616 */                                   oI11ol.I00000oOI(null);
/* 623 */                                   OlO0OIIl1 olO0OIIl13 = ((OilIlo) this.I00ioIO).I00000oOI;
/* 627 */                                   int length = oil1oo000i.I00000oIO.length();
/* 635 */                                   OlO0OIIl1 olO0OIIl14 = ((OilIlo) this.I00ioIO).I00000oOI;
/* 713 */                                   OilIl00O1o oilIl00O1oI00000oIO = length <= 0 ? OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl14.getValue(), false, false, "", IOOi0Ool1i.I00OI1(((OilIl00O1o) ((OilIlo) this.I00ioIO).I00000oOI.getValue()).I0000O, oil1oo000i), null, false, false, false, false, null, 497) : OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl14.getValue(), false, false, "", null, null, false, false, false, false, "Could not transcribe audio", 505);
/* 717 */                                   olO0OIIl13.getClass();
/* 720 */                                   olO0OIIl13.I000lI(null, oilIl00O1oI00000oIO);
/* 723 */                                   return OoiIlOl1iI.I00000oIO;
                                        } catch (Throwable th) {
/* 334 */                                   th = th;
/* 730 */                                   oI11ol.I00000oOI(null);
/* 733 */                                   throw th;
                                        }
                                    }
/* 344 */                           i2 = this.I00iiI;
/* 348 */                           ?? r0 = (OI11ol) this.I00io1l;
/* 352 */                           oil1lO = (Oil1lO) this.I00ilO0;
/* 356 */                           oOo0ooi = (OOo0ooi) this.I00iio;
/* 358 */                           lIoii1l01l0i.I00000oOI(obj);
/* 361 */                           oI1I0OoOl = r0;
                                    try {
/* 579 */                               float[] fArr2 = (float[]) oOo0ooi.I00iOIl;
/* 581 */                               this.I00ilI0I1 = null;
/* 583 */                               this.I00iio = null;
/* 585 */                               this.I00ilO0 = null;
/* 587 */                               this.I00io1l = oI1I0OoOl;
/* 589 */                               this.I00iiI = i2;
/* 591 */                               this.I00iiO = 4;
/* 593 */                               oil1lO.getClass();
/* 605 */                               objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new O00lOIIO(oil1lO, fArr2, iOoil1iiIilo, 27), this);
/* 609 */                               if (objI0000oI00 != ii0111o4) {
/* 613 */                                   oI11ol = oI1I0OoOl;
/* 614 */                                   Oil1oo000i oil1oo000i2 = (Oil1oo000i) objI0000oI00;
/* 616 */                                   oI11ol.I00000oOI(null);
/* 623 */                                   OlO0OIIl1 olO0OIIl132 = ((OilIlo) this.I00ioIO).I00000oOI;
/* 627 */                                   int length2 = oil1oo000i2.I00000oIO.length();
/* 635 */                                   OlO0OIIl1 olO0OIIl142 = ((OilIlo) this.I00ioIO).I00000oOI;
/* 713 */                                   if (length2 <= 0) {
                                            }
/* 717 */                                   olO0OIIl132.getClass();
/* 720 */                                   olO0OIIl132.I000lI(null, oilIl00O1oI00000oIO);
/* 723 */                                   return OoiIlOl1iI.I00000oIO;
                                        }
/* 611 */                               return ii0111o4;
                                    } catch (Throwable th2) {
/* 728 */                               th = th2;
/* 726 */                               oI11ol = oI1I0OoOl;
/* 730 */                               oI11ol.I00000oOI(null);
/* 733 */                               throw th;
                                    }
                                }
/* 368 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 399 */                   OlIl0i olIl0i2 = ((OilIlo) this.I00ioIO).I0000oI00;
/* 401 */                   if (olIl0i2 != null) {
/* 403 */                       this.I00ilI0I1 = ii0110;
/* 405 */                       this.I00iiO = 2;
/* 411 */                       if (l01oO1iOo.I0000Il00O(olIl0i2, this) != ii0111o4) {
                                }
/* 611 */                       return ii0111o4;
                            }
/* 417 */                   oilIlo = (OilIlo) this.I00ioIO;
/* 419 */                   oilIlo.I0000oI00 = null;
/* 423 */                   OOo0ooi oOo0ooi22 = new OOo0ooi();
                            synchronized (oilIlo.I0001Ioi1lo) {
                            }
                        default:
/* 18 */                    OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 22 */                    OoIO11oiiiil ooIO11oiiiil = (OoIO11oiiiil) this.I00iio;
/* 24 */                    OlO0OIIl1 olO0OIIl15 = ooIO11oiiiil.I00000oOI;
/* 26 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 28 */                    int i9 = this.I00iiI;
/* 30 */                    if (i9 == 0) {
/* 55 */                        lIoii1l01l0i.I00000oOI(obj);
/* 58 */                        II1iIoli iI1iIoli = ooIO11oiiiil.I0000O;
/* 63 */                        Context context = (Context) this.I00ilI0I1;
/* 65 */                        this.I00iiI = 1;
/* 67 */                        iI1iIoli.getClass();
/* 70 */                        IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 85 */                        objI0000oI002 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new II1iIl0Ililo(iI1iIoli, context, 15000, 1500, null), this);
/* 89 */                        if (objI0000oI002 != ii0111o5) {
                                }
/* 254 */                       return ii0111o5;
                            }
/* 32 */                    if (i9 != 1) {
/* 34 */                        if (i9 == 2) {
/* 36 */                            lIoii1l01l0i.I00000oOI(obj);
/* 39 */                            return ooiIlOl1iI;
                                }
/* 44 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 52 */                    objI0000oI002 = obj;
/* 93 */                    float[] fArr3 = (float[]) objI0000oI002;
/* 99 */                    if (this.I00iiO == ooIO11oiiiil.I000O01llI0) {
/* 102 */                       if (fArr3 != null && fArr3.length >= 4000) {
/* 112 */                           int length3 = fArr3.length * 2;
/* 115 */                           byte[] bArr = new byte[length3 + 44];
/* 119 */                           OoIO11oiiiil.I000lI(bArr, 0, "RIFF");
/* 124 */                           OoIO11oiiiil.I000oI1ioi(bArr, 4, length3 + 36);
/* 129 */                           OoIO11oiiiil.I000lI(bArr, 8, "WAVE");
/* 136 */                           OoIO11oiiiil.I000lI(bArr, 12, "fmt ");
/* 141 */                           OoIO11oiiiil.I000oI1ioi(bArr, 16, 16);
/* 146 */                           OoIO11oiiiil.I000o00OoI0I(bArr, 20, 1);
/* 151 */                           OoIO11oiiiil.I000o00OoI0I(bArr, 22, 1);
/* 158 */                           OoIO11oiiiil.I000oI1ioi(bArr, 24, WhisperEngine.SAMPLE_RATE);
/* 165 */                           OoIO11oiiiil.I000oI1ioi(bArr, 28, 32000);
/* 170 */                           OoIO11oiiiil.I000o00OoI0I(bArr, 32, 2);
/* 175 */                           OoIO11oiiiil.I000o00OoI0I(bArr, 34, 16);
/* 182 */                           OoIO11oiiiil.I000lI(bArr, 36, "data");
/* 187 */                           OoIO11oiiiil.I000oI1ioi(bArr, 40, length3);
/* 191 */                           int i10 = 44;
/* 193 */                           for (float f : fArr3) {
/* 209 */                               int iI00000oOI = (int) (lIiioliIlo.I00000oOI(f, -1.0f, 1.0f) * 32767.0f);
/* 213 */                               bArr[i10] = (byte) (iI00000oOI & 255);
/* 221 */                               bArr[i10 + 1] = (byte) ((iI00000oOI >> 8) & 255);
/* 223 */                               i10 += 2;
                                    }
/* 229 */                           O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilO0;
/* 233 */                           OoIIOoO ooIIOoO = (OoIIOoO) this.I00io1l;
/* 237 */                           OoI1lOl ooI1lOl = (OoI1lOl) this.I00ioIO;
/* 241 */                           OoI1lOl ooI1lOl2 = (OoI1lOl) this.I00l0I0l0lO1;
/* 243 */                           int i11 = this.I00iiO;
/* 245 */                           this.I00iiI = 2;
                                    break;
                                } else {
/* 298 */                           olO0OIIl15.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl15.getValue(), null, null, OoII00OiO.I00iOIl, null, null, ((OoIIo0oOI1) olO0OIIl15.getValue()).I000II ? "Didn't catch that — auto mode stopped." : "Didn't catch that — tap and speak again.", false, false, 211));
                                }
                            }
/* 39 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 22 */        public I0iOlI010ii(OilIlo oilIlo, O1oIOiI11o0 o1oIOiI11o0, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 3;
/* 23 */            this.I00ioIO = oilIlo;
                    this.I00l0I0l0lO1 = o1oIOiI11o0;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 23 */        public I0iOlI010ii(BoxChatDatabase boxChatDatabase, Conversation conversation, Ol1o0O0O0 ol1o0O0O0, IlooOlI ilooOlI, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 1;
/* 24 */            this.I00iio = boxChatDatabase;
                    this.I00ilI0I1 = conversation;
                    this.I00ilO0 = ol1o0O0O0;
                    this.I00io1l = ilooOlI;
                    this.I00ioIO = oI10i0Il;
                    this.I00l0I0l0lO1 = oI10i0Il2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 24 */        public I0iOlI010ii(ToolSet toolSet, String str, String str2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 25 */            this.I00iOIl = i;
                    this.I00l0I0l0lO1 = toolSet;
                    this.I00io1l = str;
                    this.I00ioIO = str2;
                }
            }

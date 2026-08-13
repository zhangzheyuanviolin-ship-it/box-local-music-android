            package p000;

            import android.util.Log;
            import com.google.ai.edge.gallery.common.CallJsSkillResult;
            import com.google.ai.edge.gallery.common.CallJsSkillResultImage;
            import com.google.ai.edge.gallery.common.CallJsSkillResultWebview;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import p000.OI011oo1;
            
            public final class I0iOio0io extends Oll0io implements IlliIl1l11O {
                public Ol0ioI1iI I00iOIl;
                public String I00iiI;
                public String I00iiO;
                public I0i1Io I00iio;
                public int I00ilI0I1;
                public Object I00ilO0;
                public final String I00io1l;
                public final String I00ioIO;
                public final String I00l0I0l0lO1;
                public final AgentTools I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0iOio0io(String str, String str2, String str3, AgentTools agentTools, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00io1l = str;
/* 3 */             this.I00ioIO = str2;
/* 5 */             this.I00l0I0l0lO1 = str3;
/* 7 */             this.I00l0OO0IO = agentTools;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            I0iOio0io i0iOio0io = new I0iOio0io(this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, iOoil1iiIilo);
/* 15 */            i0iOio0io.I00ilO0 = obj;
/* 37 */            return i0iOio0io;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((I0iOio0io) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:23:0x00f3, code lost:
                
                    if (r1.I00000oOI(r26, r14) == r2) goto L67;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x019b, code lost:
                
                    if (r3 != r2) goto L45;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0285, code lost:
                
                    if (r0 != r2) goto L68;
                 */
                /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0205  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x024e  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x026f  */
                /* JADX WARN: Type inference failed for: r8v1 */
                /* JADX WARN: Type inference failed for: r8v11, types: [Ol0ioI1iI, java.lang.String] */
                /* JADX WARN: Type inference failed for: r8v12 */
                /* JADX WARN: Type inference failed for: r8v13, types: [I0i1Io, Ol0ioI1iI, java.lang.String] */
                /* JADX WARN: Type inference failed for: r8v14 */
                /* JADX WARN: Type inference failed for: r8v18 */
                /* JADX WARN: Type inference failed for: r8v19 */
                /* JADX WARN: Type inference failed for: r8v21 */
                /* JADX WARN: Type inference failed for: r8v4 */
                /* JADX WARN: Type inference failed for: r8v5 */
                /* JADX WARN: Type inference failed for: r8v6, types: [I0i1Io, java.lang.String] */
                /* JADX WARN: Type inference failed for: r8v7 */
                /* JADX WARN: Type inference failed for: r8v8, types: [I0i1Io, Ol0ioI1iI] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    Object obj5;
                    AgentTools agentTools;
                    ?? r8;
                    Ol0ioI1iI ol0ioI1iI;
                    String str;
                    ?? r82;
                    Ol0ioI1iI ol0ioI1iI2;
                    I1O01ol i1O01ol;
                    Object objI0010o;
                    String strI000O01llI0;
                    IOoil1iiIilo iOoil1iiIilo;
                    String str2;
                    int iD;
                    ?? r83;
                    String string;
                    IIiI1II iIiI1II;
                    IO1010 io1010;
                    IIiI1II iIiI1II2;
                    ?? r84;
                    Object objI0010o2;
                    Object obj6;
                    Object objI00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) this.I00ilO0;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i = this.I00ilI0I1;
/* 11 */            String str3 = this.I00l0I0l0lO1;
/* 27 */            String str4 = this.I00ioIO;
/* 29 */            String str5 = this.I00io1l;
/* 31 */            AgentTools agentTools2 = this.I00l0OO0IO;
                    switch (i) {
                        case 0:
/* 146 */                   lIoii1l01l0i.I00000oOI(obj);
/* 157 */                   Iterator it = agentTools2.getSkillManagerViewModel().I000OiO().iterator();
                            while (true) {
/* 165 */                       if (it.hasNext()) {
/* 167 */                           Object next = it.next();
/* 175 */                           Iterator it2 = it;
/* 185 */                           obj2 = next;
/* 195 */                           if (!O0000Ioio00.I0000O(((Ol0ioI1iI) next).I001i1O0Ol(), OlOoOIi0o.I00OIo(str5).toString())) {
/* 198 */                               it = it2;
                                    }
                                } else {
/* 201 */                           obj2 = null;
                                }
                            }
/* 205 */                   Ol0ioI1iI ol0ioI1iI3 = (Ol0ioI1iI) obj2;
/* 208 */                   if (ol0ioI1iI3 != null) {
/* 279 */                       if (ol0ioI1iI3.I001i1lo1io()) {
/* 285 */                           Ii1liIllli0 ii1liIllli0 = agentTools2.getSkillManagerViewModel().I00000oOI;
/* 287 */                           agentTools = agentTools2;
/* 289 */                           String strConcat = "skill___".concat(str5);
/* 293 */                           ii1liIllli0.getClass();
/* 15 */                            obj3 = "failed";
/* 17 */                            obj4 = "error";
/* 25 */                            obj5 = "status";
/* 315 */                           String str6 = (String) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1lI0OO(ii1liIllli0, strConcat, null, 1));
/* 317 */                           if (str6 == null || str6.length() == 0) {
/* 332 */                               String strI001iOo1i0O = ol0ioI1iI3.I001iOo1i0O();
/* 340 */                               if (strI001iOo1i0O.length() == 0) {
/* 342 */                                   strI001iOo1i0O = "The JS script needs a secret (API key / token) to proceed:";
                                        }
/* 348 */                               IOi10loi iOi10loi = new IOi10loi();
/* 351 */                               I0i1O01o001[] i0i1O01o001Arr = I0i1O01o001.I00iOIl;
/* 353 */                               I1O01ol i1O01ol2 = new I1O01ol();
/* 356 */                               i1O01ol2.I00000oIO = strI001iOo1i0O;
/* 358 */                               i1O01ol2.I00000oOI = iOi10loi;
/* 360 */                               VarHandle.storeStoreFence();
/* 1 */                                 IO1010 io10102 = agentTools._actionChannel;
/* 367 */                               this.I00ilO0 = ii0110;
/* 369 */                               this.I00iOIl = ol0ioI1iI3;
/* 371 */                               r82 = 0;
/* 372 */                               this.I00iiI = null;
/* 374 */                               this.I00iiO = null;
/* 376 */                               this.I00iio = i1O01ol2;
/* 379 */                               this.I00ilI0I1 = 2;
/* 385 */                               if (io10102.I00000oOI(this, i1O01ol2) != ii0111o) {
/* 389 */                                   ol0ioI1iI2 = ol0ioI1iI3;
/* 390 */                                   i1O01ol = i1O01ol2;
/* 391 */                                   IOi10loi iOi10loi2 = i1O01ol.I00000oOI;
/* 393 */                                   this.I00ilO0 = ii0110;
/* 395 */                                   this.I00iOIl = ol0ioI1iI2;
/* 397 */                                   this.I00iiI = r82;
/* 399 */                                   this.I00iiO = r82;
/* 401 */                                   this.I00iio = r82;
/* 404 */                                   this.I00ilI0I1 = 3;
/* 406 */                                   objI0010o = iOi10loi2.I0010o(this);
/* 410 */                                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
                                            iOoil1iiIilo = r82;
                                            break;
                                        }
                                    } else {
/* 326 */                               ol0ioI1iI = ol0ioI1iI3;
/* 328 */                               str = str6;
/* 329 */                               r8 = 0;
                                    }
                                } else {
/* 15 */                            obj3 = "failed";
/* 17 */                            obj4 = "error";
/* 25 */                            obj5 = "status";
/* 495 */                           agentTools = agentTools2;
/* 497 */                           r8 = 0;
/* 498 */                           ol0ioI1iI = ol0ioI1iI3;
/* 21 */                            str = "";
                                }
/* 505 */                       strI000O01llI0 = agentTools.getSkillManagerViewModel().I000O01llI0(str5, str4);
/* 509 */                       if (strI000O01llI0 == null) {
/* 1 */                             IO1010 io10103 = agentTools._actionChannel;
/* 554 */                           Ol0oI0 ol0oI0 = new Ol0oI0(Oi010OO0.I001IO000("Calling JS script \"", str5, "/", str4, "\""), true, Oi010OO0.I001IO000("Call JS script: \"", str5, "/", str4, "\""), IIl001iO0Io.I000oI1ioi("- URL: ", OlOolloIIOl0.I000iOII(strI000O01llI0, "https://appassets.androidplatform.net", ""), "\n- Data: ", str3), ol0ioI1iI);
/* 557 */                           this.I00ilO0 = ii0110;
/* 559 */                           this.I00iOIl = r8;
/* 561 */                           this.I00iiI = str;
/* 563 */                           this.I00iiO = strI000O01llI0;
/* 565 */                           this.I00iio = r8;
/* 568 */                           this.I00ilI0I1 = 4;
                                    r83 = r8;
/* 574 */                           if (io10103.I00000oOI(this, ol0oI0) != ii0111o) {
/* 581 */                               string = OlOoOIi0o.I00OIo(str3).toString();
/* 589 */                               if (string.length() == 0) {
/* 591 */                                   string = "{}";
                                        }
/* 597 */                               iIiI1II = new IIiI1II(8, strI000O01llI0, string, str);
/* 1 */                                 io1010 = agentTools._actionChannel;
/* 604 */                               this.I00ilO0 = ii0110;
/* 606 */                               this.I00iOIl = r83;
/* 608 */                               this.I00iiI = r83;
/* 610 */                               this.I00iiO = r83;
/* 612 */                               this.I00iio = iIiI1II;
/* 615 */                               this.I00ilI0I1 = 5;
/* 621 */                               if (io1010.I00000oOI(this, iIiI1II) != ii0111o) {
/* 624 */                                   iIiI1II2 = iIiI1II;
                                            r84 = r83;
/* 625 */                                   IOi10loi iOi10loi3 = iIiI1II2.I0000O;
/* 627 */                                   this.I00ilO0 = ii0110;
/* 629 */                                   this.I00iOIl = r84;
/* 631 */                                   this.I00iiI = r84;
/* 633 */                                   this.I00iiO = r84;
/* 635 */                                   this.I00iio = r84;
/* 638 */                                   this.I00ilI0I1 = 6;
/* 640 */                                   objI0010o2 = iOi10loi3.I0010o(this);
/* 644 */                                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
                                            obj6 = r84;
                                            break;
                                        }
                                    }
                                } else {
/* 513 */                           return Collections.singletonMap("result", "JS Skill URL not set properly or skill not found");
                                }
                            } else {
/* 1 */                         IO1010 io10104 = agentTools2._actionChannel;
/* 230 */                       Ol0oI0 ol0oI02 = new Ol0oI0(IlIi0I0.I000lI("Failed to call skill \"", str4, "\""), (String) null, 28, false, (String) null);
/* 234 */                       this.I00ilO0 = null;
/* 236 */                       this.I00iOIl = null;
/* 238 */                       this.I00ilI0I1 = 1;
                                break;
                            }
/* 648 */                   return ii0111o;
                        case 1:
/* 142 */                   lIoii1l01l0i.I00000oOI(obj);
/* 270 */                   return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", IlIi0I0.I000lI("Skill \"", str4, "\" not found")), new OIoi0IIoi("status", "failed"));
                        case 2:
/* 124 */                   i1O01ol = (I1O01ol) this.I00iio;
/* 126 */                   ol0ioI1iI2 = this.I00iOIl;
/* 128 */                   lIoii1l01l0i.I00000oOI(obj);
/* 15 */                    obj3 = "failed";
/* 17 */                    obj4 = "error";
/* 25 */                    obj5 = "status";
/* 137 */                   agentTools = agentTools2;
/* 139 */                   r82 = 0;
/* 391 */                   IOi10loi iOi10loi22 = i1O01ol.I00000oOI;
/* 393 */                   this.I00ilO0 = ii0110;
/* 395 */                   this.I00iOIl = ol0ioI1iI2;
/* 397 */                   this.I00iiI = r82;
/* 399 */                   this.I00iiO = r82;
/* 401 */                   this.I00iio = r82;
/* 404 */                   this.I00ilI0I1 = 3;
/* 406 */                   objI0010o = iOi10loi22.I0010o(this);
/* 410 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
                            iOoil1iiIilo = r82;
                            break;
                        case 3:
/* 103 */                   Ol0ioI1iI ol0ioI1iI4 = this.I00iOIl;
/* 105 */                   lIoii1l01l0i.I00000oOI(obj);
/* 108 */                   ol0ioI1iI2 = ol0ioI1iI4;
/* 15 */                    obj3 = "failed";
/* 17 */                    obj4 = "error";
/* 25 */                    obj5 = "status";
/* 115 */                   agentTools = agentTools2;
/* 117 */                   iOoil1iiIilo = null;
/* 118 */                   objI0010o = obj;
/* 418 */                   String str7 = (String) objI0010o;
/* 426 */                   if (str7.length() > 0) {
/* 432 */                       Ii1liIllli0 ii1liIllli02 = agentTools.getSkillManagerViewModel().I00000oOI;
/* 434 */                       String strConcat2 = "skill___".concat(str5);
/* 438 */                       ii1liIllli02.getClass();
/* 449 */                       I00oIiI10 i00oIiI10 = new I00oIiI10(ii1liIllli02, strConcat2, str7, iOoil1iiIilo, 28);
/* 452 */                       str2 = str7;
/* 454 */                       iOi1IOoIO0l.I00000oOI(i00oIiI10);
/* 469 */                       iD = Log.d("AGAgentTools", "Got Secret from ask info dialog: ".concat(str2.substring(0, 3)));
                            } else {
/* 474 */                       str2 = str7;
/* 478 */                       iD = Log.d("AGAgentTools", "The ask info dialog got cancelled. No secret.");
                            }
/* 482 */                   iOi100.I00000oIO(iD);
/* 485 */                   str = str2;
/* 486 */                   ol0ioI1iI = ol0ioI1iI2;
                            r8 = iOoil1iiIilo;
/* 505 */                   strI000O01llI0 = agentTools.getSkillManagerViewModel().I000O01llI0(str5, str4);
/* 509 */                   if (strI000O01llI0 == null) {
                            }
                            break;
                        case 4:
/* 81 */                    strI000O01llI0 = this.I00iiO;
/* 83 */                    str = this.I00iiI;
/* 85 */                    lIoii1l01l0i.I00000oOI(obj);
/* 15 */                    obj3 = "failed";
/* 17 */                    obj4 = "error";
/* 25 */                    obj5 = "status";
/* 94 */                    agentTools = agentTools2;
/* 96 */                    r83 = 0;
/* 581 */                   string = OlOoOIi0o.I00OIo(str3).toString();
/* 589 */                   if (string.length() == 0) {
                            }
/* 597 */                   iIiI1II = new IIiI1II(8, strI000O01llI0, string, str);
/* 1 */                     io1010 = agentTools._actionChannel;
/* 604 */                   this.I00ilO0 = ii0110;
/* 606 */                   this.I00iOIl = r83;
/* 608 */                   this.I00iiI = r83;
/* 610 */                   this.I00iiO = r83;
/* 612 */                   this.I00iio = iIiI1II;
/* 615 */                   this.I00ilI0I1 = 5;
/* 621 */                   if (io1010.I00000oOI(this, iIiI1II) != ii0111o) {
                            }
/* 648 */                   return ii0111o;
                        case 5:
/* 65 */                    iIiI1II2 = (IIiI1II) this.I00iio;
/* 67 */                    lIoii1l01l0i.I00000oOI(obj);
/* 15 */                    obj3 = "failed";
/* 17 */                    obj4 = "error";
/* 25 */                    obj5 = "status";
/* 76 */                    agentTools = agentTools2;
/* 78 */                    r84 = 0;
/* 625 */                   IOi10loi iOi10loi32 = iIiI1II2.I0000O;
/* 627 */                   this.I00ilO0 = ii0110;
/* 629 */                   this.I00iOIl = r84;
/* 631 */                   this.I00iiI = r84;
/* 633 */                   this.I00iiO = r84;
/* 635 */                   this.I00iio = r84;
/* 638 */                   this.I00ilI0I1 = 6;
/* 640 */                   objI0010o2 = iOi10loi32.I0010o(this);
/* 644 */                   Ii0111o ii0111o32 = Ii0111o.I00iOIl;
                            obj6 = r84;
                            break;
                        case 6:
/* 47 */                    lIoii1l01l0i.I00000oOI(obj);
/* 50 */                    objI0010o2 = obj;
/* 15 */                    obj3 = "failed";
/* 17 */                    obj4 = "error";
/* 25 */                    obj5 = "status";
/* 58 */                    agentTools = agentTools2;
/* 60 */                    obj6 = null;
/* 650 */                   String str8 = (String) objI0010o2;
                            try {
/* 675 */                       objI00000oIO = (CallJsSkillResult) new OI011oo1.I0000Il00O().build().adapter(CallJsSkillResult.class).failOnUnknown().fromJson(str8);
                            } catch (Throwable th) {
/* 680 */                       objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                            }
/* 677 */                   Object obj7 = objI00000oIO;
/* 687 */                   if (obj7 instanceof Oi10Ii1i1lo) {
/* 689 */                       obj7 = obj6;
                            }
/* 690 */                   CallJsSkillResult callJsSkillResult = (CallJsSkillResult) obj7;
/* 699 */                   Object error = callJsSkillResult != null ? callJsSkillResult.getError() : obj6;
/* 702 */                   if (callJsSkillResult == null || (callJsSkillResult.getResult() == null && callJsSkillResult.getWebview() == null && callJsSkillResult.getImage() == null)) {
/* 846 */                       return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", str8), new OIoi0IIoi(obj5, "succeeded"));
                            }
/* 726 */                   if (error != null) {
/* 748 */                       return O1Oii0O0loo.I0000O(new OIoi0IIoi(obj4, error), new OIoi0IIoi(obj5, obj3));
                            }
/* 753 */                   Object obj8 = obj5;
/* 755 */                   CallJsSkillResultImage image = callJsSkillResult.getImage();
/* 759 */                   CallJsSkillResultWebview webview = callJsSkillResult.getWebview();
/* 763 */                   AgentTools agentTools3 = agentTools;
/* 765 */                   if (image != null) {
/* 767 */                       agentTools3.setResultImageToShow(image);
                            }
/* 770 */                   if (webview != null) {
/* 772 */                       Ol0o1OiOIIIl skillManagerViewModel = agentTools3.getSkillManagerViewModel();
/* 776 */                       String url = webview.getUrl();
/* 780 */                       if (url == null) {
/* 21 */                            url = "";
                                }
/* 799 */                       agentTools3.setResultWebviewToShow(CallJsSkillResultWebview.copy$default(webview, skillManagerViewModel.I000OOo1O(str5, url), null, null, 6, null));
                            }
/* 802 */                   callJsSkillResult.getResult();
/* 805 */                   String result = callJsSkillResult.getResult();
/* 827 */                   return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", result != null ? result : ""), new OIoi0IIoi(obj8, "succeeded"));
                        default:
/* 38 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 41 */                    return null;
                    }
                }
            }

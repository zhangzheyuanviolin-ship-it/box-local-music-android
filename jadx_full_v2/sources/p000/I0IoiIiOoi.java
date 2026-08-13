            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 11 */    public final class I0IoiIiOoi implements Function1 {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public OI10i0Il I00iiO;

                public I0IoiIiOoi(OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2) {
/* 3 */             this.I00iOIl = 8;
/* 8 */             this.I00iiI = oI10i0Il;
/* 10 */            this.I00iiO = oI10i0Il2;
                }

                @Override
                public final Object invoke(Object obj) {
                    OOio00 oOio00;
                    OOio00 oOio002;
                    String str;
/* 1 */             int i = this.I00iOIl;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 417 */                   OI10i0Il oI10i0Il = this.I00iiI;
/* 419 */                   OI10i0Il oI10i0Il2 = this.I00iiO;
/* 421 */                   String str2 = (String) obj;
/* 427 */                   if (!I0O0l00olII.I00000oOI(oI10i0Il)) {
/* 444 */                       oI10i0Il.setValue(Boolean.valueOf(!O0000Ioio00.I0000O((String) oI10i0Il2.getValue(), str2)));
                            }
/* 447 */                   oI10i0Il2.setValue(str2);
                            break;
                        case 1:
/* 383 */                   OI10i0Il oI10i0Il3 = this.I00iiI;
/* 385 */                   OI10i0Il oI10i0Il4 = this.I00iiO;
/* 387 */                   String str3 = (String) obj;
/* 393 */                   if (!I0O0l00olII.I00000oOI(oI10i0Il3)) {
/* 410 */                       oI10i0Il3.setValue(Boolean.valueOf(!O0000Ioio00.I0000O((String) oI10i0Il4.getValue(), str3)));
                            }
/* 413 */                   oI10i0Il4.setValue(str3);
                            break;
                        case 2:
/* 349 */                   OI10i0Il oI10i0Il5 = this.I00iiI;
/* 351 */                   OI10i0Il oI10i0Il6 = this.I00iiO;
/* 353 */                   String str4 = (String) obj;
/* 359 */                   if (!I0O0l00olII.I00000oOI(oI10i0Il5)) {
/* 376 */                       oI10i0Il5.setValue(Boolean.valueOf(!O0000Ioio00.I0000O((String) oI10i0Il6.getValue(), str4)));
                            }
/* 379 */                   oI10i0Il6.setValue(str4);
                            break;
                        case 3:
/* 324 */                   OI10i0Il oI10i0Il7 = this.I00iiI;
/* 326 */                   OI10i0Il oI10i0Il8 = this.I00iiO;
/* 330 */                   oI10i0Il7.setValue((String) obj);
/* 343 */                   if (((String) oI10i0Il8.getValue()).length() > 0) {
/* 345 */                       oI10i0Il8.setValue("");
                                break;
                            }
                            break;
                        case 4:
/* 299 */                   OI10i0Il oI10i0Il9 = this.I00iiI;
/* 301 */                   OI10i0Il oI10i0Il10 = this.I00iiO;
/* 305 */                   oI10i0Il9.setValue((String) obj);
/* 318 */                   if (((String) oI10i0Il10.getValue()).length() > 0) {
/* 320 */                       oI10i0Il10.setValue("");
                                break;
                            }
                            break;
                        case 5:
/* 274 */                   OI10i0Il oI10i0Il11 = this.I00iiI;
/* 276 */                   OI10i0Il oI10i0Il12 = this.I00iiO;
/* 280 */                   oI10i0Il11.setValue((String) obj);
/* 293 */                   if (((String) oI10i0Il12.getValue()).length() > 0) {
/* 295 */                       oI10i0Il12.setValue("");
                                break;
                            }
                            break;
                        case 6:
/* 253 */                   OI10i0Il oI10i0Il13 = this.I00iiI;
/* 255 */                   OI10i0Il oI10i0Il14 = this.I00iiO;
/* 257 */                   Boolean bool = (Boolean) obj;
/* 259 */                   boolean zBooleanValue = bool.booleanValue();
/* 263 */                   oI10i0Il13.setValue(bool);
/* 266 */                   if (zBooleanValue) {
/* 270 */                       oI10i0Il14.setValue(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 7:
/* 230 */                   OI10i0Il oI10i0Il15 = this.I00iiI;
/* 232 */                   OI10i0Il oI10i0Il16 = this.I00iiO;
/* 234 */                   Integer num = (Integer) obj;
/* 236 */                   int iIntValue = num.intValue();
/* 240 */                   List list = Iloo0ilo.I00000oIO;
/* 242 */                   oI10i0Il15.setValue(num);
/* 245 */                   if (iIntValue == 1) {
/* 249 */                       oI10i0Il16.setValue("Download failed. Connect to WiFi and try again.");
                                break;
                            }
                            break;
                        case 8:
/* 208 */                   OI10i0Il oI10i0Il17 = this.I00iiI;
/* 210 */                   OI10i0Il oI10i0Il18 = this.I00iiO;
/* 218 */                   if (((Boolean) obj).booleanValue()) {
/* 221 */                       l1O0o1.I0000Il00O(oI10i0Il17, false);
/* 226 */                       oI10i0Il18.setValue(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 9:
/* 193 */                   OI10i0Il oI10i0Il19 = this.I00iiI;
/* 195 */                   OI10i0Il oI10i0Il20 = this.I00iiO;
/* 199 */                   oI10i0Il19.setValue((String) obj);
/* 204 */                   oI10i0Il20.setValue(Boolean.TRUE);
                            break;
                        case 10:
/* 62 */                    OI10i0Il oI10i0Il21 = this.I00iiI;
/* 64 */                    OI10i0Il oI10i0Il22 = this.I00iiO;
/* 66 */                    O0lolo o0lolo = (O0lolo) obj;
/* 72 */                    List list2 = (List) oI10i0Il21.getValue();
/* 77 */                    OOii01Ioi1 oOii01Ioi1 = new OOii01Ioi1(6);
/* 80 */                    int size = list2.size();
/* 88 */                    I01i01OoI i01i01OoI = new I01i01OoI(23);
/* 91 */                    i01i01OoI.I00iiI = oOii01Ioi1;
/* 93 */                    i01i01OoI.I00iiO = list2;
/* 95 */                    VarHandle.storeStoreFence();
/* 102 */                   I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(24);
/* 105 */                   i0O11IOOo0OI.I00iiI = list2;
/* 107 */                   VarHandle.storeStoreFence();
/* 113 */                   IO1O0O io1o0o = new IO1O0O(3);
/* 116 */                   io1o0o.I00iiI = list2;
/* 118 */                   VarHandle.storeStoreFence();
/* 129 */                   o0lolo.I0000oI00(size, i01i01OoI, i0O11IOOo0OI, new IOii1l(802480018, io1o0o, true));
/* 142 */                   if (((Boolean) oI10i0Il22.getValue()).booleanValue() && (oOio00 = (OOio00) IOOi0Ool1i.I00IoIO0lI((List) oI10i0Il21.getValue())) != null && !oOio00.I00000oOI && (oOio002 = (OOio00) IOOi0Ool1i.I00IoIO0lI((List) oI10i0Il21.getValue())) != null && (str = oOio002.I0000Il00O) != null && str.length() == 0) {
/* 189 */                       O0lolo.I0000O(o0lolo, null, i1oIli1o0ilo.I000II, 3);
                                break;
                            }
                            break;
                        default:
/* 11 */                    OI10i0Il oI10i0Il23 = this.I00iiI;
/* 13 */                    OI10i0Il oI10i0Il24 = this.I00iiO;
/* 15 */                    IliI0101O0Oi iliI0101O0Oi = (IliI0101O0Oi) obj;
/* 31 */                    if (((Boolean) oI10i0Il23.getValue()).booleanValue() != iliI0101O0Oi.I00000oOI()) {
/* 41 */                        oI10i0Il23.setValue(Boolean.valueOf(iliI0101O0Oi.I00000oOI()));
/* 54 */                        if (((Boolean) oI10i0Il23.getValue()).booleanValue()) {
/* 58 */                            oI10i0Il24.setValue(Boolean.FALSE);
                                    break;
                                }
                            }
                            break;
                    }
/* 61 */            return ooiIlOl1iI;
                }

/* 12 */        public I0IoiIiOoi(int i) {
/* 13 */            this.I00iOIl = i;
                }
            }

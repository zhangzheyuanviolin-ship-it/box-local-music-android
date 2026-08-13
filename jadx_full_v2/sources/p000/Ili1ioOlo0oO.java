            package p000;

            import android.os.Trace;
            import android.view.KeyEvent;
            import android.view.View;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class Ili1ioOlo0oO implements Ili1iIl {
                public I0lio1O01i01 I00000oIO;
                public I0lio1O01i01 I00000oOI;
                public IliIO10oO0 I0000Il00O;
                public Ili1O0oO00o I0000O;
                public Ili1io1Il I0000oI00;
                public OI0llilll I0001Ioi1lo;
                public OI0oiiIO0 I000II;
                public IliIO10oO0 I000O01llI0;

                public final boolean I00000oOI(boolean z) {
                    IIlOoolol0ll iIlOoolol0ll;
/* 6 */             if (I000II() != null) {
/* 10 */                IliIO10oO0 iliIO10oO0I000II = I000II();
/* 15 */                I000OiO(null);
/* 18 */                if (iliIO10oO0I000II != null) {
/* 24 */                    iliIO10oO0I000II.I010l1ol111(IliI0101O0Oi.I00iOIl, IliI0101O0Oi.I00iiO);
/* 31 */                    if (!iliIO10oO0I000II.I00iOIl.I00lll10) {
/* 35 */                        IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                            }
/* 40 */                    O1ooOo o1ooOo = iliIO10oO0I000II.I00iOIl.I00ilI0I1;
/* 42 */                    O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0I000II);
/* 46 */                    while (o0iiOioolIiI000O01llI0 != null) {
/* 58 */                        if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 60 */                            while (o1ooOo != null) {
/* 66 */                                if ((o1ooOo.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 68 */                                    O1ooOo o1ooOoI0000Il00O = o1ooOo;
/* 69 */                                    OI110O0 oi110o0 = null;
/* 70 */                                    while (o1ooOoI0000Il00O != null) {
/* 74 */                                        if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 82 */                                            ((IliIO10oO0) o1ooOoI0000Il00O).I010l1ol111(IliI0101O0Oi.I00iiI, IliI0101O0Oi.I00iiO);
                                                } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 101 */                                           int i = 0;
/* 102 */                                           for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 108 */                                               if ((o1ooOo2.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 110 */                                                   i++;
/* 112 */                                                   if (i == 1) {
/* 114 */                                                       o1ooOoI0000Il00O = o1ooOo2;
                                                            } else {
/* 116 */                                                       if (oi110o0 == null) {
/* 124 */                                                           oi110o0 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 127 */                                                       if (o1ooOoI0000Il00O != null) {
/* 129 */                                                           oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 132 */                                                           o1ooOoI0000Il00O = null;
                                                                }
/* 133 */                                                       oi110o0.I00000oOI(o1ooOo2);
                                                            }
                                                        }
                                                    }
/* 139 */                                           if (i == 1) {
                                                    }
                                                }
/* 142 */                                       o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                            }
                                        }
/* 147 */                               o1ooOo = o1ooOo.I00ilI0I1;
                                    }
                                }
/* 150 */                       o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 165 */                       o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                            }
                        }
                    }
/* 5 */             return true;
                }

                public final boolean I0000Il00O(int i, boolean z, boolean z2) {
                    int iOrdinal;
/* 1 */             boolean z3 = true;
/* 2 */             if (z || (iOrdinal = iliI01iIl.I00000oIO(this.I0000Il00O, i).ordinal()) == 0) {
/* 32 */                I00000oOI(z);
                    } else {
/* 17 */                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
/* 26 */                    I000II.I00000oIO();
/* 16 */                    return false;
                        }
/* 30 */                z3 = false;
                    }
/* 39 */            if (z3 && z2) {
/* 43 */                I0000O();
                    }
/* 98 */            return z3;
                }

                public final void I0000O() {
/* 1 */             I0lio1O01i01 i0lio1O01i01 = this.I00000oIO;
/* 7 */             if (i0lio1O01i01.isFocused() || i0lio1O01i01.hasFocus()) {
/* 35 */                i0lio1O01i01.clearFocus();
                    } else if (i0lio1O01i01.hasFocus()) {
/* 22 */                View viewFindFocus = i0lio1O01i01.findFocus();
/* 26 */                if (viewFindFocus != null) {
/* 28 */                    viewFindFocus.clearFocus();
                        }
/* 31 */                i0lio1O01i01.clearFocus();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x00e3 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
                /* JADX WARN: Type inference failed for: r0v20, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r0v21 */
                /* JADX WARN: Type inference failed for: r0v22 */
                /* JADX WARN: Type inference failed for: r0v23 */
                /* JADX WARN: Type inference failed for: r0v24, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r0v28 */
                /* JADX WARN: Type inference failed for: r0v29 */
                /* JADX WARN: Type inference failed for: r0v30 */
                /* JADX WARN: Type inference failed for: r0v31 */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r0v7 */
                /* JADX WARN: Type inference failed for: r12v24, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r12v25, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r12v29, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r12v30, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r12v34, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r12v35 */
                /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v37 */
                /* JADX WARN: Type inference failed for: r12v38 */
                /* JADX WARN: Type inference failed for: r12v39 */
                /* JADX WARN: Type inference failed for: r12v40 */
                /* JADX WARN: Type inference failed for: r12v43, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r12v44 */
                /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v46 */
                /* JADX WARN: Type inference failed for: r12v47 */
                /* JADX WARN: Type inference failed for: r12v48 */
                /* JADX WARN: Type inference failed for: r12v49 */
                /* JADX WARN: Type inference failed for: r12v64 */
                /* JADX WARN: Type inference failed for: r12v65 */
                /* JADX WARN: Type inference failed for: r12v66 */
                /* JADX WARN: Type inference failed for: r12v67 */
                /* JADX WARN: Type inference failed for: r14v1 */
                /* JADX WARN: Type inference failed for: r14v10, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r14v12 */
                /* JADX WARN: Type inference failed for: r14v13 */
                /* JADX WARN: Type inference failed for: r14v14 */
                /* JADX WARN: Type inference failed for: r14v15 */
                /* JADX WARN: Type inference failed for: r14v2 */
                /* JADX WARN: Type inference failed for: r14v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r14v7 */
                /* JADX WARN: Type inference failed for: r14v8 */
                /* JADX WARN: Type inference failed for: r14v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000oI00(KeyEvent keyEvent, IllOOo00lI illOOo00lI) {
                    IiIill0O0li1 iiIill0O0li1;
                    O1ooOo o1ooOo;
                    IIlOoolol0ll iIlOoolol0ll;
                    IiIill0O0li1 iiIill0O0li12;
                    IIlOoolol0ll iIlOoolol0ll2;
                    int size;
                    IIlOoolol0ll iIlOoolol0ll3;
                    boolean z;
/* 1 */             IliIO10oO0 iliIO10oO0 = this.I0000Il00O;
/* 5 */             Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
                    try {
/* 13 */                if (this.I0000O.I0000oI00) {
/* 19 */                    System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
/* 12 */                    return false;
                        }
/* 30 */                if (!I000iOII(keyEvent)) {
/* 12 */                    return false;
                        }
/* 36 */                IliIO10oO0 iliIO10oO0I00000oIO = iliI1i0.I00000oIO(iliIO10oO0);
/* 46 */                if (iliIO10oO0I00000oIO != null) {
/* 52 */                    if (!iliIO10oO0I00000oIO.I00iOIl.I00lll10) {
/* 56 */                        IolioOO1.I0000Il00O("visitLocalDescendants called on an unattached node");
                            }
/* 59 */                    O1ooOo o1ooOo2 = iliIO10oO0I00000oIO.I00iOIl;
/* 65 */                    if ((o1ooOo2.I00iio & 9216) != 0) {
/* 69 */                        o1ooOo = null;
/* 70 */                        for (O1ooOo o1ooOo3 = o1ooOo2.I00ilO0; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilO0) {
/* 72 */                            int i = o1ooOo3.I00iiO;
/* 76 */                            if ((i & 9216) != 0) {
/* 80 */                                if ((i & Barcode.FORMAT_UPC_E) != 0) {
                                            break;
                                        }
/* 83 */                                o1ooOo = o1ooOo3;
                                    }
                                }
                            } else {
/* 87 */                        o1ooOo = null;
                            }
/* 88 */                    if (o1ooOo == null) {
                            }
                        } else if (iliIO10oO0I00000oIO == null) {
/* 232 */                   if (!iliIO10oO0.I00iOIl.I00lll10) {
/* 234 */                       IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                            }
/* 239 */                   O1ooOo o1ooOo4 = iliIO10oO0.I00iOIl.I00ilI0I1;
/* 241 */                   O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0);
                            loop15: while (true) {
/* 245 */                       if (o0iiOioolIiI000O01llI0 == null) {
/* 355 */                           iiIill0O0li1 = null;
                                    break;
                                }
/* 257 */                       if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 8192) != 0) {
/* 259 */                           while (o1ooOo4 != null) {
/* 265 */                               if ((o1ooOo4.I00iiO & 8192) != 0) {
/* 267 */                                   O1ooOo o1ooOoI0000Il00O = o1ooOo4;
/* 268 */                                   OI110O0 oi110o0 = null;
/* 269 */                                   while (o1ooOoI0000Il00O != null) {
/* 273 */                                       if (o1ooOoI0000Il00O instanceof O0O1ll1l1o10) {
                                                    iiIill0O0li1 = o1ooOoI0000Il00O;
                                                    break loop15;
                                                }
/* 280 */                                       if ((o1ooOoI0000Il00O.I00iiO & 8192) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 289 */                                           O1ooOo o1ooOo5 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0;
/* 291 */                                           int i2 = 0;
                                                    o1ooOoI0000Il00O = o1ooOoI0000Il00O;
                                                    oi110o0 = oi110o0;
/* 292 */                                           while (o1ooOo5 != null) {
/* 298 */                                               if ((o1ooOo5.I00iiO & 8192) != 0) {
/* 300 */                                                   i2++;
                                                            oi110o0 = oi110o0;
/* 302 */                                                   if (i2 == 1) {
/* 304 */                                                       o1ooOoI0000Il00O = o1ooOo5;
                                                            } else {
/* 306 */                                                       if (oi110o0 == null) {
/* 312 */                                                           oi110o0 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 315 */                                                       if (o1ooOoI0000Il00O != null) {
/* 317 */                                                           oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 320 */                                                           o1ooOoI0000Il00O = null;
                                                                }
/* 321 */                                                       oi110o0.I00000oOI(o1ooOo5);
                                                            }
                                                        }
/* 324 */                                               o1ooOo5 = o1ooOo5.I00ilO0;
                                                        o1ooOoI0000Il00O = o1ooOoI0000Il00O;
                                                        oi110o0 = oi110o0;
                                                    }
/* 327 */                                           if (i2 == 1) {
                                                    }
                                                }
/* 330 */                                       o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                            }
                                        }
/* 335 */                               o1ooOo4 = o1ooOo4.I00ilI0I1;
                                    }
                                }
/* 338 */                       o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 353 */                       o1ooOo4 = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                            }
/* 356 */                   IiIill0O0li1 iiIill0O0li13 = (O0O1ll1l1o10) iiIill0O0li1;
/* 365 */                   o1ooOo = iiIill0O0li13 != null ? ((O1ooOo) iiIill0O0li13).I00iOIl : null;
                        } else {
/* 96 */                    if (!iliIO10oO0I00000oIO.I00iOIl.I00lll10) {
/* 98 */                        IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                            }
/* 101 */                   O1ooOo o1ooOo6 = iliIO10oO0I00000oIO.I00iOIl;
/* 103 */                   O0iiOioolIi o0iiOioolIiI000O01llI02 = il0lI1i1olii.I000O01llI0(iliIO10oO0I00000oIO);
                            loop11: while (true) {
/* 107 */                       if (o0iiOioolIiI000O01llI02 == null) {
/* 217 */                           iiIill0O0li12 = null;
                                    break;
                                }
/* 119 */                       if ((((O1ooOo) o0iiOioolIiI000O01llI02.I010101Oo1lO.I00io1l).I00iio & 8192) != 0) {
/* 121 */                           while (o1ooOo6 != null) {
/* 127 */                               if ((o1ooOo6.I00iiO & 8192) != 0) {
/* 129 */                                   OI110O0 oi110o02 = null;
/* 130 */                                   O1ooOo o1ooOoI0000Il00O2 = o1ooOo6;
/* 131 */                                   while (o1ooOoI0000Il00O2 != null) {
/* 135 */                                       if (o1ooOoI0000Il00O2 instanceof O0O1ll1l1o10) {
                                                    iiIill0O0li12 = o1ooOoI0000Il00O2;
                                                    break loop11;
                                                }
/* 142 */                                       if ((o1ooOoI0000Il00O2.I00iiO & 8192) != 0 && (o1ooOoI0000Il00O2 instanceof IiIioO0ol1oI)) {
/* 151 */                                           O1ooOo o1ooOo7 = ((IiIioO0ol1oI) o1ooOoI0000Il00O2).I00o0l1o1o0;
/* 153 */                                           int i3 = 0;
                                                    o1ooOoI0000Il00O2 = o1ooOoI0000Il00O2;
                                                    oi110o02 = oi110o02;
/* 154 */                                           while (o1ooOo7 != null) {
/* 160 */                                               if ((o1ooOo7.I00iiO & 8192) != 0) {
/* 162 */                                                   i3++;
                                                            oi110o02 = oi110o02;
/* 164 */                                                   if (i3 == 1) {
/* 166 */                                                       o1ooOoI0000Il00O2 = o1ooOo7;
                                                            } else {
/* 168 */                                                       if (oi110o02 == null) {
/* 174 */                                                           oi110o02 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 177 */                                                       if (o1ooOoI0000Il00O2 != null) {
/* 179 */                                                           oi110o02.I00000oOI(o1ooOoI0000Il00O2);
/* 182 */                                                           o1ooOoI0000Il00O2 = null;
                                                                }
/* 183 */                                                       oi110o02.I00000oOI(o1ooOo7);
                                                            }
                                                        }
/* 186 */                                               o1ooOo7 = o1ooOo7.I00ilO0;
                                                        o1ooOoI0000Il00O2 = o1ooOoI0000Il00O2;
                                                        oi110o02 = oi110o02;
                                                    }
/* 189 */                                           if (i3 == 1) {
                                                    }
                                                }
/* 192 */                                       o1ooOoI0000Il00O2 = il0lI1i1olii.I0000Il00O(oi110o02);
                                            }
                                        }
/* 197 */                               o1ooOo6 = o1ooOo6.I00ilI0I1;
                                    }
                                }
/* 200 */                       o0iiOioolIiI000O01llI02 = o0iiOioolIiI000O01llI02.I001IO000();
/* 215 */                       o1ooOo6 = (o0iiOioolIiI000O01llI02 == null || (iIlOoolol0ll2 = o0iiOioolIiI000O01llI02.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll2.I00ilO0;
                            }
/* 218 */                   IiIill0O0li1 iiIill0O0li14 = (O0O1ll1l1o10) iiIill0O0li12;
/* 220 */                   if (iiIill0O0li14 != null) {
/* 224 */                       o1ooOo = ((O1ooOo) iiIill0O0li14).I00iOIl;
                            }
                        }
/* 366 */               if (o1ooOo != null) {
/* 372 */                   if (!o1ooOo.I00iOIl.I00lll10) {
/* 374 */                       IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                            }
/* 379 */                   O1ooOo o1ooOo8 = o1ooOo.I00iOIl.I00ilI0I1;
/* 381 */                   O0iiOioolIi o0iiOioolIiI000O01llI03 = il0lI1i1olii.I000O01llI0(o1ooOo);
/* 385 */                   ArrayList arrayList = null;
/* 386 */                   while (o0iiOioolIiI000O01llI03 != null) {
/* 398 */                       if ((((O1ooOo) o0iiOioolIiI000O01llI03.I010101Oo1lO.I00io1l).I00iio & 8192) != 0) {
/* 400 */                           while (o1ooOo8 != null) {
/* 406 */                               if ((o1ooOo8.I00iiO & 8192) != 0) {
/* 408 */                                   O1ooOo o1ooOoI0000Il00O3 = o1ooOo8;
/* 409 */                                   OI110O0 oi110o03 = null;
/* 410 */                                   while (o1ooOoI0000Il00O3 != null) {
/* 414 */                                       if (o1ooOoI0000Il00O3 instanceof O0O1ll1l1o10) {
/* 416 */                                           if (arrayList == null) {
/* 420 */                                               arrayList = new ArrayList();
                                                    }
/* 423 */                                           arrayList.add(o1ooOoI0000Il00O3);
/* 426 */                                           z = false;
                                                } else {
/* 428 */                                           z = true;
                                                }
/* 429 */                                       if (z && (o1ooOoI0000Il00O3.I00iiO & 8192) != 0 && (o1ooOoI0000Il00O3 instanceof IiIioO0ol1oI)) {
/* 446 */                                           int i4 = 0;
/* 447 */                                           for (O1ooOo o1ooOo9 = ((IiIioO0ol1oI) o1ooOoI0000Il00O3).I00o0l1o1o0; o1ooOo9 != null; o1ooOo9 = o1ooOo9.I00ilO0) {
/* 453 */                                               if ((o1ooOo9.I00iiO & 8192) != 0) {
/* 455 */                                                   i4++;
/* 457 */                                                   if (i4 == 1) {
/* 459 */                                                       o1ooOoI0000Il00O3 = o1ooOo9;
                                                            } else {
/* 461 */                                                       if (oi110o03 == null) {
/* 467 */                                                           oi110o03 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 470 */                                                       if (o1ooOoI0000Il00O3 != null) {
/* 472 */                                                           oi110o03.I00000oOI(o1ooOoI0000Il00O3);
/* 475 */                                                           o1ooOoI0000Il00O3 = null;
                                                                }
/* 476 */                                                       oi110o03.I00000oOI(o1ooOo9);
                                                            }
                                                        }
                                                    }
/* 482 */                                           if (i4 == 1) {
                                                    }
                                                }
/* 485 */                                       o1ooOoI0000Il00O3 = il0lI1i1olii.I0000Il00O(oi110o03);
                                            }
                                        }
/* 490 */                               o1ooOo8 = o1ooOo8.I00ilI0I1;
                                    }
                                }
/* 493 */                       o0iiOioolIiI000O01llI03 = o0iiOioolIiI000O01llI03.I001IO000();
/* 508 */                       o1ooOo8 = (o0iiOioolIiI000O01llI03 == null || (iIlOoolol0ll3 = o0iiOioolIiI000O01llI03.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll3.I00ilO0;
                            }
/* 510 */                   if (arrayList != null && arrayList.size() - 1 >= 0) {
                                while (true) {
                                    int i5 = size - 1;
/* 532 */                           if (((O0O1ll1l1o10) arrayList.get(size)).I000OOo1O(keyEvent)) {
/* 45 */                                return true;
                                    }
/* 538 */                           if (i5 < 0) {
                                        break;
                                    }
/* 541 */                           size = i5;
                                }
                            }
/* 543 */                   IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOo.I00iOIl;
/* 545 */                   ?? oi110o04 = 0;
/* 546 */                   while (iiIioO0ol1oII0000Il00O != 0) {
/* 550 */                       if (iiIioO0ol1oII0000Il00O instanceof O0O1ll1l1o10) {
/* 558 */                           if (((O0O1ll1l1o10) iiIioO0ol1oII0000Il00O).I000OOo1O(keyEvent)) {
/* 45 */                                return true;
                                    }
                                } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 8192) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 577 */                           O1ooOo o1ooOo10 = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 579 */                           int i6 = 0;
                                    oi110o04 = oi110o04;
                                    iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
/* 580 */                           while (o1ooOo10 != null) {
/* 586 */                               if ((o1ooOo10.I00iiO & 8192) != 0) {
/* 588 */                                   i6++;
                                            oi110o04 = oi110o04;
/* 590 */                                   if (i6 == 1) {
/* 592 */                                       iiIioO0ol1oII0000Il00O = o1ooOo10;
                                            } else {
/* 594 */                                       if (oi110o04 == 0) {
/* 600 */                                           oi110o04 = new OI110O0(new O1ooOo[16]);
                                                }
/* 603 */                                       if (iiIioO0ol1oII0000Il00O != 0) {
/* 605 */                                           oi110o04.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 608 */                                           iiIioO0ol1oII0000Il00O = 0;
                                                }
/* 609 */                                       oi110o04.I00000oOI(o1ooOo10);
                                            }
                                        }
/* 612 */                               o1ooOo10 = o1ooOo10.I00ilO0;
                                        oi110o04 = oi110o04;
                                        iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                    }
/* 615 */                           if (i6 == 1) {
                                    }
                                }
/* 618 */                       iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o04);
                            }
/* 633 */                   if (((Boolean) illOOo00lI.invoke()).booleanValue()) {
/* 45 */                        return true;
                            }
/* 639 */                   IiIioO0ol1oI iiIioO0ol1oII0000Il00O2 = o1ooOo.I00iOIl;
/* 641 */                   ?? oi110o05 = 0;
/* 642 */                   while (iiIioO0ol1oII0000Il00O2 != 0) {
/* 646 */                       if (iiIioO0ol1oII0000Il00O2 instanceof O0O1ll1l1o10) {
/* 654 */                           if (((O0O1ll1l1o10) iiIioO0ol1oII0000Il00O2).I00II0oii1o(keyEvent)) {
/* 45 */                                return true;
                                    }
                                } else if ((iiIioO0ol1oII0000Il00O2.I00iiO & 8192) != 0 && (iiIioO0ol1oII0000Il00O2 instanceof IiIioO0ol1oI)) {
/* 673 */                           O1ooOo o1ooOo11 = iiIioO0ol1oII0000Il00O2.I00o0l1o1o0;
/* 675 */                           int i7 = 0;
                                    iiIioO0ol1oII0000Il00O2 = iiIioO0ol1oII0000Il00O2;
                                    oi110o05 = oi110o05;
/* 676 */                           while (o1ooOo11 != null) {
/* 682 */                               if ((o1ooOo11.I00iiO & 8192) != 0) {
/* 684 */                                   i7++;
                                            oi110o05 = oi110o05;
/* 686 */                                   if (i7 == 1) {
/* 688 */                                       iiIioO0ol1oII0000Il00O2 = o1ooOo11;
                                            } else {
/* 690 */                                       if (oi110o05 == 0) {
/* 696 */                                           oi110o05 = new OI110O0(new O1ooOo[16]);
                                                }
/* 699 */                                       if (iiIioO0ol1oII0000Il00O2 != 0) {
/* 701 */                                           oi110o05.I00000oOI(iiIioO0ol1oII0000Il00O2);
/* 704 */                                           iiIioO0ol1oII0000Il00O2 = 0;
                                                }
/* 705 */                                       oi110o05.I00000oOI(o1ooOo11);
                                            }
                                        }
/* 708 */                               o1ooOo11 = o1ooOo11.I00ilO0;
                                        iiIioO0ol1oII0000Il00O2 = iiIioO0ol1oII0000Il00O2;
                                        oi110o05 = oi110o05;
                                    }
/* 711 */                           if (i7 == 1) {
                                    }
                                }
/* 714 */                       iiIioO0ol1oII0000Il00O2 = il0lI1i1olii.I0000Il00O(oi110o05);
                            }
/* 719 */                   if (arrayList != null) {
/* 721 */                       int size2 = arrayList.size();
/* 726 */                       for (int i8 = 0; i8 < size2; i8++) {
/* 738 */                           if (((O0O1ll1l1o10) arrayList.get(i8)).I00II0oii1o(keyEvent)) {
/* 45 */                                return true;
                                    }
                                }
                            }
                        }
/* 12 */                return false;
                    } finally {
/* 752 */               Trace.endSection();
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:231:0x011f, code lost:
                
                    continue;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Boolean I0001Ioi1lo(int i, OOo0IO oOo0IO, Function1 function1) {
                    boolean zI00000oIO;
                    IliIO10oO0 iliIO10oO0;
                    IIlOoolol0ll iIlOoolol0ll;
/* 9 */             I0lio1O01i01 i0lio1O01i01 = this.I00000oOI;
/* 11 */            IliIO10oO0 iliIO10oO02 = this.I0000Il00O;
/* 13 */            IliIO10oO0 iliIO10oO0I00000oIO = iliI1i0.I00000oIO(iliIO10oO02);
/* 17 */            int i2 = 4;
/* 22 */            boolean zBooleanValue = false;
/* 27 */            if (iliIO10oO0I00000oIO != null) {
/* 29 */                O0iOOoiioO layoutDirection = i0lio1O01i01.getLayoutDirection();
/* 33 */                Ili1l01O ili1l01OI010lI0oi = iliIO10oO0I00000oIO.I010lI0oi();
/* 37 */                Ili1lII ili1lII = ili1l01OI010lI0oi.I000O01llI0;
/* 39 */                Ili1lII ili1lII2 = ili1l01OI010lI0oi.I000OOo1O;
/* 41 */                if (i == 1) {
/* 43 */                    ili1lII = ili1l01OI010lI0oi.I00000oOI;
                        } else if (i == 2) {
/* 49 */                    ili1lII = ili1l01OI010lI0oi.I0000Il00O;
                        } else if (i == 5) {
/* 55 */                    ili1lII = ili1l01OI010lI0oi.I0000O;
                        } else if (i == 6) {
/* 61 */                    ili1lII = ili1l01OI010lI0oi.I0000oI00;
                        } else if (i == 3) {
/* 67 */                    int iOrdinal = layoutDirection.ordinal();
/* 71 */                    if (iOrdinal != 0) {
/* 73 */                        if (iOrdinal != 1) {
/* 77 */                            I000II.I00000oIO();
/* 24 */                            return null;
                                }
/* 75 */                        ili1lII = ili1lII2;
                            }
/* 83 */                    if (ili1lII == Ili1lII.I00000oOI) {
/* 85 */                        ili1lII = null;
                            }
/* 87 */                    if (ili1lII == null) {
/* 89 */                        ili1lII = ili1l01OI010lI0oi.I0001Ioi1lo;
                            }
                        } else if (i == 4) {
/* 94 */                    int iOrdinal2 = layoutDirection.ordinal();
/* 98 */                    if (iOrdinal2 == 0) {
/* 107 */                       ili1lII = ili1lII2;
                            } else if (iOrdinal2 != 1) {
/* 103 */                       I000II.I00000oIO();
/* 24 */                        return null;
                            }
/* 110 */                   if (ili1lII == Ili1lII.I00000oOI) {
/* 112 */                       ili1lII = null;
                            }
/* 114 */                   if (ili1lII == null) {
/* 116 */                       ili1lII = ili1l01OI010lI0oi.I000II;
                            }
                        } else {
/* 120 */                   if (i != 7 && i != 8) {
/* 429 */                       I000II.I001IO000("invalid FocusDirection");
/* 24 */                        return null;
                            }
/* 129 */                   IIoOi1IoOO iIoOi1IoOO = new IIoOi1IoOO(i);
/* 142 */                   Ili1ioOlo0oO ili1ioOlo0oO = (Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0I00000oIO)).getFocusOwner();
/* 144 */                   IliIO10oO0 iliIO10oO0I000II = ili1ioOlo0oO.I000II();
/* 148 */                   if (i == 7) {
/* 152 */                       ili1l01OI010lI0oi.I000OiO.invoke(iIoOi1IoOO);
                            } else {
/* 158 */                       ili1l01OI010lI0oi.I000iOII.invoke(iIoOi1IoOO);
                            }
/* 177 */                   ili1lII = iIoOi1IoOO.I00000oOI ? Ili1lII.I0000Il00O : iliIO10oO0I000II != ili1ioOlo0oO.I000II() ? Ili1lII.I0000O : Ili1lII.I00000oOI;
                        }
/* 179 */               Ili1lII ili1lII3 = Ili1lII.I0000Il00O;
/* 185 */               if (!O0000Ioio00.I0000O(ili1lII, ili1lII3)) {
/* 195 */                   if (O0000Ioio00.I0000O(ili1lII, Ili1lII.I0000O)) {
/* 197 */                       IliIO10oO0 iliIO10oO0I00000oIO2 = iliI1i0.I00000oIO(iliIO10oO02);
/* 201 */                       if (iliIO10oO0I00000oIO2 != null) {
/* 207 */                           return (Boolean) function1.invoke(iliIO10oO0I00000oIO2);
                                }
                            } else {
/* 210 */                       Ili1lII ili1lII4 = Ili1lII.I00000oOI;
/* 216 */                       if (!O0000Ioio00.I0000O(ili1lII, ili1lII4)) {
/* 220 */                           if (ili1lII == ili1lII4) {
/* 423 */                               I000II.I001IO000("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
/* 24 */                                return null;
                                    }
/* 222 */                           if (ili1lII == ili1lII3) {
/* 419 */                               I000II.I001IO000("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
/* 24 */                                return null;
                                    }
/* 224 */                           OI110O0 oi110o0 = ili1lII.I00000oIO;
/* 226 */                           int i3 = oi110o0.I00iiO;
/* 228 */                           if (i3 == 0) {
/* 234 */                               System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                                    } else {
/* 239 */                               Object[] objArr = oi110o0.I00iOIl;
/* 243 */                               boolean z = false;
/* 244 */                               for (int i4 = 0; i4 < i3; i4++) {
/* 248 */                                   IiIill0O0li1 iiIill0O0li1 = (Ili1oii1llI) objArr[i4];
/* 257 */                                   if (!((O1ooOo) iiIill0O0li1).I00iOIl.I00lll10) {
/* 261 */                                       IolioOO1.I0000Il00O("visitChildren called on an unattached node");
                                            }
/* 270 */                                   OI110O0 oi110o02 = new OI110O0(new O1ooOo[16]);
/* 275 */                                   O1ooOo o1ooOo = ((O1ooOo) iiIill0O0li1).I00iOIl;
/* 277 */                                   O1ooOo o1ooOo2 = o1ooOo.I00ilO0;
/* 279 */                                   if (o1ooOo2 == null) {
/* 281 */                                       il0lI1i1olii.I00000oIO(oi110o02, o1ooOo);
                                            } else {
/* 285 */                                       oi110o02.I00000oOI(o1ooOo2);
                                            }
                                            while (true) {
/* 288 */                                       int i5 = oi110o02.I00iiO;
/* 290 */                                       if (i5 != 0) {
/* 298 */                                           O1ooOo o1ooOoI0000Il00O = (O1ooOo) oi110o02.I000l1(i5 - 1);
/* 304 */                                           if ((o1ooOoI0000Il00O.I00iio & Barcode.FORMAT_UPC_E) == 0) {
/* 306 */                                               il0lI1i1olii.I00000oIO(oi110o02, o1ooOoI0000Il00O);
                                                    } else {
                                                        while (true) {
/* 310 */                                                   if (o1ooOoI0000Il00O == null) {
                                                                break;
                                                            }
/* 316 */                                                   if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 318 */                                                       OI110O0 oi110o03 = null;
/* 320 */                                                       while (o1ooOoI0000Il00O != null) {
/* 324 */                                                           if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 338 */                                                               if (((Boolean) function1.invoke((IliIO10oO0) o1ooOoI0000Il00O)).booleanValue()) {
/* 340 */                                                                   z = true;
                                                                            break;
                                                                        }
                                                                    } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 357 */                                                               int i6 = 0;
/* 359 */                                                               for (O1ooOo o1ooOo3 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilO0) {
/* 365 */                                                                   if ((o1ooOo3.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 367 */                                                                       i6++;
/* 369 */                                                                       if (i6 == 1) {
/* 371 */                                                                           o1ooOoI0000Il00O = o1ooOo3;
                                                                                } else {
/* 373 */                                                                           if (oi110o03 == null) {
/* 381 */                                                                               oi110o03 = new OI110O0(new O1ooOo[16]);
                                                                                    }
/* 384 */                                                                           if (o1ooOoI0000Il00O != null) {
/* 386 */                                                                               oi110o03.I00000oOI(o1ooOoI0000Il00O);
/* 389 */                                                                               o1ooOoI0000Il00O = null;
                                                                                    }
/* 391 */                                                                           oi110o03.I00000oOI(o1ooOo3);
                                                                                }
                                                                            }
                                                                        }
/* 397 */                                                               if (i6 == 1) {
                                                                        }
                                                                    }
/* 400 */                                                           o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o03);
                                                                }
                                                            } else {
/* 405 */                                                       o1ooOoI0000Il00O = o1ooOoI0000Il00O.I00ilO0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
/* 412 */                               zBooleanValue = z;
                                    }
/* 414 */                           return Boolean.valueOf(zBooleanValue);
                                }
                            }
                        }
/* 24 */                return null;
                    }
/* 433 */           iliIO10oO0I00000oIO = null;
/* 435 */           O0iOOoiioO layoutDirection2 = i0lio1O01i01.getLayoutDirection();
/* 443 */           I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(19);
/* 446 */           i01oIoOI01l.I00iiI = iliIO10oO0I00000oIO;
/* 448 */           i01oIoOI01l.I00iio = this;
/* 450 */           i01oIoOI01l.I00iiO = function1;
/* 452 */           VarHandle.storeStoreFence();
/* 455 */           if (i == 1 || i == 2) {
/* 460 */               if (i == 1) {
/* 462 */                   zI00000oIO = l1l0oo0l.I00000oOI(iliIO10oO02, i01oIoOI01l);
                        } else {
/* 467 */                   if (i != 2) {
/* 480 */                       I000II.I001IO000("This function should only be used for 1-D focus search");
/* 24 */                        return null;
                            }
/* 469 */                   zI00000oIO = l1l0oo0l.I00000oIO(iliIO10oO02, i01oIoOI01l);
                        }
/* 473 */               return Boolean.valueOf(zI00000oIO);
                    }
/* 484 */           if (i == 3 || i == 4 || i == 5 || i == 6) {
/* 497 */               return lOoOol0.I000iOII(i, i01oIoOI01l, iliIO10oO02, oOo0IO);
                    }
/* 503 */           if (i == 7) {
/* 505 */               int iOrdinal3 = layoutDirection2.ordinal();
/* 509 */               if (iOrdinal3 != 0) {
/* 511 */                   if (iOrdinal3 != 1) {
/* 515 */                       I000II.I00000oIO();
/* 24 */                        return null;
                            }
/* 513 */                   i2 = 3;
                        }
/* 519 */               IliIO10oO0 iliIO10oO0I00000oIO3 = iliI1i0.I00000oIO(iliIO10oO02);
/* 523 */               if (iliIO10oO0I00000oIO3 != null) {
/* 525 */                   return lOoOol0.I000iOII(i2, i01oIoOI01l, iliIO10oO0I00000oIO3, oOo0IO);
                        }
/* 24 */                return null;
                    }
/* 533 */           if (i != 8) {
/* 1638 */              throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(Ili0i1il0l0l.I00000oOI(i)).toString());
                    }
/* 535 */           IliIO10oO0 iliIO10oO0I00000oIO4 = iliI1i0.I00000oIO(iliIO10oO02);
/* 539 */           if (iliIO10oO0I00000oIO4 == null) {
/* 704 */               iliIO10oO0 = null;
                    } else {
/* 545 */               if (!iliIO10oO0I00000oIO4.I00iOIl.I00lll10) {
/* 549 */                   IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                        }
/* 554 */               O1ooOo o1ooOo4 = iliIO10oO0I00000oIO4.I00iOIl.I00ilI0I1;
/* 556 */               O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0I00000oIO4);
/* 560 */               loop5: while (o0iiOioolIiI000O01llI0 != null) {
/* 572 */                   if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 574 */                       while (o1ooOo4 != null) {
/* 580 */                           if ((o1ooOo4.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 582 */                               O1ooOo o1ooOoI0000Il00O2 = o1ooOo4;
/* 583 */                               OI110O0 oi110o04 = null;
/* 585 */                               while (o1ooOoI0000Il00O2 != null) {
/* 589 */                                   if (o1ooOoI0000Il00O2 instanceof IliIO10oO0) {
/* 591 */                                       IliIO10oO0 iliIO10oO03 = (IliIO10oO0) o1ooOoI0000Il00O2;
/* 599 */                                       if (iliIO10oO03.I010lI0oi().I00000oIO) {
/* 601 */                                           iliIO10oO0 = iliIO10oO03;
                                                    break loop5;
                                                }
                                            } else if ((o1ooOoI0000Il00O2.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O2 instanceof IiIioO0ol1oI)) {
/* 622 */                                       int i7 = 0;
/* 624 */                                       for (O1ooOo o1ooOo5 = ((IiIioO0ol1oI) o1ooOoI0000Il00O2).I00o0l1o1o0; o1ooOo5 != null; o1ooOo5 = o1ooOo5.I00ilO0) {
/* 630 */                                           if ((o1ooOo5.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 632 */                                               i7++;
/* 634 */                                               if (i7 == 1) {
/* 636 */                                                   o1ooOoI0000Il00O2 = o1ooOo5;
                                                        } else {
/* 640 */                                                   if (oi110o04 == null) {
/* 648 */                                                       oi110o04 = new OI110O0(new O1ooOo[16]);
                                                            }
/* 654 */                                                   if (o1ooOoI0000Il00O2 != null) {
/* 656 */                                                       oi110o04.I00000oOI(o1ooOoI0000Il00O2);
/* 659 */                                                       o1ooOoI0000Il00O2 = null;
                                                            }
/* 661 */                                                   oi110o04.I00000oOI(o1ooOo5);
                                                        }
                                                    }
                                                }
/* 669 */                                       if (i7 != 1) {
/* 672 */                                           o1ooOoI0000Il00O2 = il0lI1i1olii.I0000Il00O(oi110o04);
                                                }
                                            }
/* 672 */                                   o1ooOoI0000Il00O2 = il0lI1i1olii.I0000Il00O(oi110o04);
                                        }
                                    }
/* 679 */                           o1ooOo4 = o1ooOo4.I00ilI0I1;
                                }
                            }
/* 684 */                   o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 700 */                   o1ooOo4 = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                        }
/* 704 */               iliIO10oO0 = null;
                    }
/* 706 */           if (iliIO10oO0 != null && iliIO10oO0 != iliIO10oO02) {
/* 716 */               zBooleanValue = ((Boolean) i01oIoOI01l.invoke(iliIO10oO0)).booleanValue();
                    }
/* 720 */           return Boolean.valueOf(zBooleanValue);
                }

                public final IliIO10oO0 I000II() {
/* 1 */             IliIO10oO0 iliIO10oO0 = this.I000O01llI0;
/* 3 */             if (iliIO10oO0 == null || !iliIO10oO0.I00lll10) {
/* 11 */                return null;
                    }
/* 10 */            return iliIO10oO0;
                }

                public final boolean I000O01llI0(int i, boolean z) {
/* 1 */             I0lio1O01i01 i0lio1O01i01 = this.I00000oIO;
/* 3 */             IliIO10oO0 iliIO10oO0I000II = I000II();
/* 7 */             int i2 = 1;
/* 8 */             if (iliIO10oO0I000II == null || !iliIO10oO0I000II.I00o0iI0io1 || !i0lio1O01i01.I00111O(i)) {
/* 24 */                OOo0ooi oOo0ooi = new OOo0ooi();
/* 29 */                oOo0ooi.I00iOIl = Boolean.FALSE;
/* 31 */                IliIO10oO0 iliIO10oO0I000II2 = I000II();
/* 35 */                OOo0IO embeddedViewFocusRect = i0lio1O01i01.getEmbeddedViewFocusRect();
/* 41 */                II1lIIolo iI1lIIolo = new II1lIIolo(i2);
/* 44 */                iI1lIIolo.I00iiO = oOo0ooi;
/* 46 */                iI1lIIolo.I00iiI = i;
/* 48 */                VarHandle.storeStoreFence();
/* 51 */                Boolean boolI0001Ioi1lo = I0001Ioi1lo(i, embeddedViewFocusRect, iI1lIIolo);
/* 61 */                if (!O0000Ioio00.I0000O(boolI0001Ioi1lo, Boolean.TRUE) || iliIO10oO0I000II2 == I000II()) {
/* 71 */                    if (boolI0001Ioi1lo != null && oOo0ooi.I00iOIl != null) {
/* 82 */                        if (!boolI0001Ioi1lo.booleanValue() || !((Boolean) oOo0ooi.I00iOIl).booleanValue()) {
/* 95 */                            if ((i == 1 || i == 2) && z && I0000Il00O(i, false, false)) {
/* 112 */                               I0li00iII1I i0li00iII1I = new I0li00iII1I(3);
/* 115 */                               i0li00iII1I.I00iiI = i;
/* 117 */                               VarHandle.storeStoreFence();
/* 121 */                               Boolean boolI0001Ioi1lo2 = I0001Ioi1lo(i, null, i0li00iII1I);
/* 133 */                               if (boolI0001Ioi1lo2 != null ? boolI0001Ioi1lo2.booleanValue() : false) {
                                        }
                                    }
                                }
                            }
/* 70 */                    return false;
                        }
                    }
/* 7 */             return true;
                }

                public final boolean I000OOo1O(int i) {
/* 6 */             if (!I0000Il00O(i, false, false)) {
/* 1 */                 return false;
                    }
/* 12 */            I0li00iII1I i0li00iII1I = new I0li00iII1I(2);
/* 15 */            i0li00iII1I.I00iiI = i;
/* 17 */            VarHandle.storeStoreFence();
/* 21 */            Boolean boolI0001Ioi1lo = I0001Ioi1lo(i, null, i0li00iII1I);
/* 27 */            boolean zBooleanValue = boolI0001Ioi1lo != null ? boolI0001Ioi1lo.booleanValue() : false;
/* 31 */            if (!zBooleanValue) {
/* 33 */                I0000O();
                    }
/* 77 */            return zBooleanValue;
                }

                public final void I000OiO(IliIO10oO0 iliIO10oO0) {
/* 1 */             IliIO10oO0 iliIO10oO02 = this.I000O01llI0;
/* 3 */             this.I000O01llI0 = iliIO10oO0;
/* 5 */             OI0oiiIO0 oI0oiiIO0 = this.I000II;
/* 7 */             Object[] objArr = oI0oiiIO0.I00000oIO;
/* 9 */             int i = oI0oiiIO0.I00000oOI;
/* 12 */            for (int i2 = 0; i2 < i; i2++) {
/* 18 */                ((Ili1i0IO1I0l) objArr[i2]).I00000oIO(iliIO10oO02, iliIO10oO0);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
                
                    r36 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
                
                    if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r36) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
                
                    r3 = r0.I00000oOI(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
                
                    if (r0.I0000oI00 != 0) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
                
                    if (((r0.I00000oIO[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
                
                    r33 = true;
                    r38 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x00c8, code lost:
                
                    r3 = r0.I0000Il00O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00ca, code lost:
                
                    if (r3 <= r4) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
                
                    if (java.lang.Long.compareUnsigned(r0.I0000O * 32, r3 * 25) > 0) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
                
                    r3 = r0.I00000oIO;
                    r7 = r0.I0000Il00O;
                    r12 = r0.I00000oOI;
                    r13 = (r7 + 7) >> 3;
                    r14 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
                
                    if (r14 >= r13) goto L93;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
                
                    r8 = r3[r14] & (-9187201950435737472L);
                    r3[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
                    r14 = r14 + 1;
                    r4 = r4;
                    r5 = r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0106, code lost:
                
                    r15 = r4;
                    r32 = r5;
                    r38 = 128;
                    r4 = r3.length;
                    r5 = r4 - 1;
                    r4 = r4 - 2;
                    r13 = 72057594037927935L;
                    r3[r4] = (r3[r4] & 72057594037927935L) | (-72057594037927936L);
                    r3[r5] = r3[0];
                    r4 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0124, code lost:
                
                    if (r4 == r7) goto L95;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0126, code lost:
                
                    r5 = r4 >> 3;
                    r16 = (r4 & 7) << 3;
                    r8 = (r3[r5] >> r16) & 255;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0134, code lost:
                
                    if (r8 != 128) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0136, code lost:
                
                    r4 = r4 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x013b, code lost:
                
                    if (r8 == 254) goto L94;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x013e, code lost:
                
                    r8 = java.lang.Long.hashCode(r12[r4]) * r31;
                    r9 = (r8 ^ (r8 << 16)) >>> 7;
                    r17 = r0.I00000oOI(r9);
                    r9 = r9 & r7;
                    r22 = r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x015e, code lost:
                
                    if ((((r17 - r9) & r7) / 8) != (((r4 - r9) & r7) / r15)) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x0160, code lost:
                
                    r33 = r6;
                    r21 = r7;
                    r3[r5] = ((~(255 << r16)) & r3[r5]) | ((r8 & 127) << r16);
                    r3[r3.length - 1] = (r3[0] & r22) | Long.MIN_VALUE;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x017d, code lost:
                
                    r4 = r4 + 1;
                    r7 = r21;
                    r13 = r22;
                    r6 = r33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0186, code lost:
                
                    r33 = r6;
                    r21 = r7;
                    r6 = r17 >> 3;
                    r13 = r3[r6];
                    r7 = (r17 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0198, code lost:
                
                    if (((r13 >> r7) & 255) != 128) goto L44;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x019a, code lost:
                
                    r34 = r4;
                    r3[r6] = ((~(255 << r7)) & r13) | ((r8 & 127) << r7);
                    r3[r5] = (r3[r5] & (~(255 << r16))) | (128 << r16);
                    r12[r17] = r12[r34];
                    r12[r34] = r36;
                    r4 = r34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x01be, code lost:
                
                    r34 = r4;
                    r3[r6] = ((r8 & 127) << r7) | ((~(255 << r7)) & r13);
                    r4 = r12[r17];
                    r12[r17] = r12[r34];
                    r12[r34] = r4;
                    r4 = r34 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x01d5, code lost:
                
                    r3[r3.length - 1] = (r3[0] & r22) | Long.MIN_VALUE;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x01e1, code lost:
                
                    r33 = r6;
                    r0.I0000oI00 = p000.OiO10oio.I00000oIO(r0.I0000Il00O) - r0.I0000O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x01f2, code lost:
                
                    r32 = r5;
                    r33 = true;
                    r38 = 128;
                    r3 = p000.OiO10oio.I00000oOI(r0.I0000Il00O);
                    r4 = r0.I00000oIO;
                    r5 = r0.I00000oOI;
                    r6 = r0.I0000Il00O;
                    r0.I0000Il00O(r3);
                    r3 = r0.I00000oIO;
                    r7 = r0.I00000oOI;
                    r8 = r0.I0000Il00O;
                    r9 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x020f, code lost:
                
                    if (r9 >= r6) goto L101;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x021e, code lost:
                
                    if (((r4[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L53;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0220, code lost:
                
                    r12 = r5[r9];
                    r14 = java.lang.Long.hashCode(r12) * r31;
                    r14 = r14 ^ (r14 << 16);
                    r15 = r0.I00000oOI(r14 >>> 7);
                    r17 = r3;
                    r16 = r4;
                    r3 = r14 & 127;
                    r14 = r15 >> 3;
                    r18 = (r15 & 7) << 3;
                    r3 = (r17[r14] & (~(255 << r18))) | (r3 << r18);
                    r17[r14] = r3;
                    r17[(((r15 - 7) & r8) + (r8 & 7)) >> 3] = r3;
                    r7[r15] = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x025b, code lost:
                
                    r17 = r3;
                    r16 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x025f, code lost:
                
                    r9 = r9 + 1;
                    r4 = r16;
                    r3 = r17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0266, code lost:
                
                    r3 = r0.I00000oOI(r32);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x026a, code lost:
                
                    r32 = r3;
                    r0.I0000O++;
                    r3 = r0.I0000oI00;
                    r4 = r0.I00000oIO;
                    r5 = r32 >> 3;
                    r6 = r4[r5];
                    r8 = (r32 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0284, code lost:
                
                    if (((r6 >> r8) & 255) != r38) goto L59;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0286, code lost:
                
                    r20 = r33 ? 1 : 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x0288, code lost:
                
                    r0.I0000oI00 = r3 - r20;
                    r3 = r0.I0000Il00O;
                    r6 = (r6 & (~(255 << r8))) | (r10 << r8);
                    r4[r5] = r6;
                    r4[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x032d, code lost:
                
                    if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L86;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x032f, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000iOII(KeyEvent keyEvent) {
                    int iNumberOfTrailingZeros;
                    long j;
                    boolean z;
                    int iNumberOfTrailingZeros2;
/* 3 */             long jI00000oIO = l0iloO.I00000oIO(keyEvent);
/* 7 */             int iI00000oOI = l0iloO.I00000oOI(keyEvent);
/* 11 */            int i = -862048943;
/* 14 */            long j2 = 0;
/* 25 */            int i2 = 8;
/* 27 */            int i3 = 0;
/* 32 */            boolean z2 = true;
/* 36 */            if (iI00000oOI == 2) {
/* 38 */                OI0llilll oI0llilll = this.I0001Ioi1lo;
/* 40 */                if (oI0llilll == null) {
/* 44 */                    oI0llilll = new OI0llilll(3);
/* 47 */                    this.I0001Ioi1lo = oI0llilll;
                        }
/* 49 */                OI0llilll oI0llilll2 = oI0llilll;
/* 54 */                int iHashCode = Long.hashCode(jI00000oIO) * (-862048943);
/* 57 */                int i4 = iHashCode ^ (iHashCode << 16);
/* 61 */                int i5 = i4 >>> 7;
/* 63 */                int i6 = i4 & 127;
/* 67 */                int i7 = oI0llilll2.I0000Il00O;
/* 69 */                int i8 = i5 & i7;
/* 71 */                int i9 = 0;
                        loop0: while (true) {
/* 75 */                    long[] jArr = oI0llilll2.I00000oIO;
/* 77 */                    int i10 = i8 >> 3;
/* 81 */                    int i11 = i;
/* 83 */                    int i12 = (i8 & 7) << 3;
/* 103 */                   long j3 = (jArr[i10] >>> i12) | ((jArr[i10 + 1] << (64 - i12)) & ((-i12) >> 63));
                            long j4 = i6;
/* 115 */                   long j5 = j3 ^ (j4 * 72340172838076673L);
/* 122 */                   long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                            while (true) {
/* 126 */                       if (j6 == j2) {
                                    break;
                                }
/* 136 */                       iNumberOfTrailingZeros2 = (i8 + (Long.numberOfTrailingZeros(j6) >> 3)) & i7;
/* 138 */                       long j7 = j2;
/* 146 */                       if (oI0llilll2.I00000oOI[iNumberOfTrailingZeros2] == jI00000oIO) {
/* 148 */                           z = true;
                                    break loop0;
                                }
/* 154 */                       j6 &= j6 - 1;
/* 155 */                       j2 = j7;
                            }
/* 683 */                   i9 += 8;
/* 687 */                   i8 = (i8 + i9) & i7;
/* 689 */                   i2 = i2;
/* 690 */                   i = i11;
/* 692 */                   j2 = j;
                        }
/* 676 */               oI0llilll2.I00000oOI[iNumberOfTrailingZeros2] = jI00000oIO;
/* 678 */               return z;
                    }
/* 713 */           if (iI00000oOI != 1) {
/* 32 */                return true;
                    }
/* 715 */           OI0llilll oI0llilll3 = this.I0001Ioi1lo;
/* 717 */           if (oI0llilll3 == null || !oI0llilll3.I00000oIO(jI00000oIO)) {
/* 27 */                return false;
                    }
/* 725 */           OI0llilll oI0llilll4 = this.I0001Ioi1lo;
/* 727 */           if (oI0llilll4 != null) {
/* 733 */               int iHashCode2 = Long.hashCode(jI00000oIO) * (-862048943);
/* 737 */               int i13 = iHashCode2 ^ (iHashCode2 << 16);
/* 738 */               int i14 = i13 & 127;
/* 740 */               int i15 = oI0llilll4.I0000Il00O;
/* 742 */               int i16 = i13 >>> 7;
                        loop5: while (true) {
/* 744 */                   int i17 = i16 & i15;
/* 745 */                   long[] jArr2 = oI0llilll4.I00000oIO;
/* 747 */                   int i18 = i17 >> 3;
/* 751 */                   int i19 = (i17 & 7) << 3;
/* 770 */                   long j8 = ((jArr2[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr2[i18] >>> i19);
/* 774 */                   long j9 = (i14 * 72340172838076673L) ^ j8;
/* 779 */                   long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                            while (true) {
/* 783 */                       if (j10 == 0) {
                                    break;
                                }
/* 792 */                       iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i17) & i15;
/* 799 */                       if (oI0llilll4.I00000oOI[iNumberOfTrailingZeros] == jI00000oIO) {
                                    break loop5;
                                }
/* 804 */                       j10 &= j10 - 1;
                            }
/* 868 */                   i3 += 8;
/* 870 */                   i16 = i17 + i3;
                        }
/* 817 */               if (iNumberOfTrailingZeros >= 0) {
                            oI0llilll4.I0000O--;
/* 827 */                   long[] jArr3 = oI0llilll4.I00000oIO;
/* 829 */                   int i20 = oI0llilll4.I0000Il00O;
/* 831 */                   int i21 = iNumberOfTrailingZeros >> 3;
/* 835 */                   int i22 = (iNumberOfTrailingZeros & 7) << 3;
/* 845 */                   long j11 = (jArr3[i21] & (~(255 << i22))) | (254 << i22);
/* 847 */                   jArr3[i21] = j11;
/* 858 */                   jArr3[(((iNumberOfTrailingZeros - 7) & i20) + (i20 & 7)) >> 3] = j11;
/* 860 */                   return true;
                        }
                    }
/* 863 */           return true;
                }
            }

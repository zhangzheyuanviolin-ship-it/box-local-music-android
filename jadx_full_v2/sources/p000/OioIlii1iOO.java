            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OioIlii1iOO {
                public static final List I00000oIO = IOOi1I.I000O01llI0(Oo0oOoIo0ol.THEME_AUTO, Oo0oOoIo0ol.THEME_LIGHT, Oo0oOoIo0ol.THEME_DARK);

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r0v6 */
                public static final void I00000oIO(Context context, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
                    O1ooIo101ll o1ooIo101ll;
                    II0O000iIl iI0O000iIl;
                    IOioOOi0I iOioOOi0I;
                    IOioOOi0I iOioOOi0I2;
                    IOioOOi0I iOioOOi0I3;
                    IOioOOi0I iOioOOi0I4;
                    Iloi111 iloi111;
                    ?? r0;
                    boolean z;
                    IloI0lOlll1 iloI0lOlll13;
                    IloI0lOlll1 iloI0lOlll14;
                    OI10i0Il oI10i0Il;
                    OI10i0Il oI10i0Il2;
                    OI10i0Il oI10i0Il3;
                    Object obj;
                    IOO0o0I1l iOO0o0I1l;
                    OI10i0Il oI10i0Il4;
                    OI10i0Il oI10i0Il5;
                    OI10i0Il oI10i0Il6;
                    OI10i0Il oI10i0Il7;
                    Ill0oOi0 ill0oOi0;
                    IloI0lOlll1 iloI0lOlll15;
                    OI10i0Il oI10i0Il8;
                    Object obj2;
                    Iloi111 iloi1112;
                    boolean z2;
                    IoiOolO1iOo ioiOolO1iOoI0000O;
/* 3 */             IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 5 */             II0O000iIl iI0O000iIl2 = i1O01oOIoI0I.I00lli11;
/* 10 */            iloI0lOlll16.I00i0O(288897502);
/* 23 */            int i2 = i | (iloI0lOlll16.I000OOo1O(context) ? 4 : 2);
/* 39 */            if (iloI0lOlll16.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 41 */                boolean zI000II = iloI0lOlll16.I000II(context);
/* 45 */                Object objI00O0i0ii = iloI0lOlll16.I00O0i0ii();
/* 49 */                IOO0o0I1l iOO0o0I1l2 = IOl11li.I00000oIO;
/* 51 */                if (zI000II || objI00O0i0ii == iOO0o0I1l2) {
/* 55 */                    Context baseContext = context;
/* 58 */                    while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof Ill0oOi0)) {
/* 66 */                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            }
/* 79 */                    objI00O0i0ii = baseContext instanceof Ill0oOi0 ? (Ill0oOi0) baseContext : null;
/* 81 */                    iloI0lOlll16.I00iio(objI00O0i0ii);
                        }
/* 84 */                Ill0oOi0 ill0oOi02 = (Ill0oOi0) objI00O0i0ii;
/* 86 */                Object objI00O0i0ii2 = iloI0lOlll16.I00O0i0ii();
/* 90 */                if (objI00O0i0ii2 == iOO0o0I1l2) {
/* 92 */                    OlO0OIIl1 olO0OIIl1 = II0Oi0iIol0i.I00000oIO;
/* 110 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Boolean.valueOf(context.getSharedPreferences("box_db_enc", 0).getBoolean("enabled", false)));
/* 114 */                   iloI0lOlll16.I00iio(objI00O0i0ii2);
                        }
/* 117 */               OI10i0Il oI10i0Il9 = (OI10i0Il) objI00O0i0ii2;
/* 119 */               Object objI00O0i0ii3 = iloI0lOlll16.I00O0i0ii();
/* 125 */               if (objI00O0i0ii3 == iOO0o0I1l2) {
/* 145 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO(((Boolean) oI10i0Il9.getValue()).booleanValue() ? II0Oi0iIol0i.I0000O() : "");
/* 149 */                   iloI0lOlll16.I00iio(objI00O0i0ii3);
                        }
/* 152 */               OI10i0Il oI10i0Il10 = (OI10i0Il) objI00O0i0ii3;
/* 154 */               Object objI00O0i0ii4 = iloI0lOlll16.I00O0i0ii();
/* 158 */               if (objI00O0i0ii4 == iOO0o0I1l2) {
/* 162 */                   objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 166 */                   iloI0lOlll16.I00iio(objI00O0i0ii4);
                        }
/* 169 */               OI10i0Il oI10i0Il11 = (OI10i0Il) objI00O0i0ii4;
/* 171 */               Object objI00O0i0ii5 = iloI0lOlll16.I00O0i0ii();
/* 175 */               if (objI00O0i0ii5 == iOO0o0I1l2) {
/* 179 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 183 */                   iloI0lOlll16.I00iio(objI00O0i0ii5);
                        }
/* 186 */               OI10i0Il oI10i0Il12 = (OI10i0Il) objI00O0i0ii5;
/* 188 */               Object objI00O0i0ii6 = iloI0lOlll16.I00O0i0ii();
/* 192 */               if (objI00O0i0ii6 == iOO0o0I1l2) {
/* 194 */                   objI00O0i0ii6 = lOO00IiI0li.I00000oIO("");
/* 198 */                   iloI0lOlll16.I00iio(objI00O0i0ii6);
                        }
/* 201 */               OI10i0Il oI10i0Il13 = (OI10i0Il) objI00O0i0ii6;
/* 203 */               O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 207 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll2, 1.0f);
/* 211 */               Object objI00O0i0ii7 = iloI0lOlll16.I00O0i0ii();
/* 215 */               if (objI00O0i0ii7 == iOO0o0I1l2) {
/* 220 */                   objI00O0i0ii7 = new OiioI1Io0o(6);
/* 223 */                   iloI0lOlll16.I00iio(objI00O0i0ii7);
                        }
/* 228 */               O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI0000oI00, true, (Function1) objI00O0i0ii7);
/* 236 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll16, 0);
/* 244 */               int iHashCode = Long.hashCode(iloI0lOlll16.I00OI1);
/* 248 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll16.I000lI();
/* 252 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll16, o1ooiI111iI00000oOI);
/* 258 */               IOl0oi0lOl1.I000lI.getClass();
/* 261 */               iloI0lOlll16.I00i0oil();
/* 264 */               boolean z3 = iloI0lOlll16.I00O10llo;
/* 268 */               Iloi111 iloi1113 = O0iiOioolIi.I01101IOlO;
/* 270 */               if (z3) {
/* 272 */                   iloI0lOlll16.I000l1(iloi1113);
                        } else {
/* 276 */                   iloI0lOlll16.I00io1l();
                        }
/* 279 */               IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00io1l;
/* 281 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll16, iOOlo1O01OI00000oIO);
/* 284 */               IOioOOi0I iOioOOi0I6 = lolOiIoiillI.I00ilO0;
/* 286 */               li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll16, oO0lO0l0I000lI);
/* 289 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 293 */               IOioOOi0I iOioOOi0I7 = lolOiIoiillI.I00ioIO;
/* 295 */               li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll16, numValueOf);
/* 298 */               li01Ooiio01.I00000oOI(iloI0lOlll16);
/* 301 */               IOioOOi0I iOioOOi0I8 = lolOiIoiillI.I00ilI0I1;
/* 303 */               li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll16, o1ooiI111iI0000Il00O);
/* 429 */               Oo0i1oIIoOO.I00000oOI("Biometric database encryption", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(liIoOiiO1Oi.I000OOo1O(iloI0lOlll16).I000OOo1O, 0L, 0L, IlilIIiIiO.I00l0I0l0lO1, null, 0L, 0L, null, 16777211), iloI0lOlll1, 6, 0, 131070);
/* 452 */               Oo0i1oIIoOO.I00000oOI("Protect the database key with biometrics. If your biometrics change, you may lose access to chat history.", null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000l1, iloI0lOlll1, 6, 0, 131066);
/* 455 */               IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 467 */               if (!((Boolean) oI10i0Il9.getValue()).booleanValue() || ((String) oI10i0Il10.getValue()).length() <= 0) {
/* 1146 */                  o1ooIo101ll = o1ooIo101ll2;
/* 1148 */                  iI0O000iIl = iI0O000iIl2;
/* 1150 */                  iOioOOi0I = iOioOOi0I5;
/* 1152 */                  iOioOOi0I2 = iOioOOi0I6;
/* 1154 */                  iOioOOi0I3 = iOioOOi0I7;
/* 1156 */                  iOioOOi0I4 = iOioOOi0I8;
/* 1158 */                  iloi111 = iloi1113;
/* 1160 */                  r0 = 0;
/* 1161 */                  z = true;
/* 1165 */                  iloI0lOlll17.I00i01iIIliI(-1368636594);
/* 1168 */                  iloI0lOlll17.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll17;
                        } else {
/* 484 */                   iloI0lOlll17.I00i01iIIliI(-1369286230);
/* 493 */                   lOO1OIO00.I00000oIO(iloI0lOlll17, Ol0iOOO0.I000II(o1ooIo101ll2, 4.0f));
/* 502 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, iI0O000iIl2, iloI0lOlll17, 48);
/* 508 */                   int iHashCode2 = Long.hashCode(iloI0lOlll17.I00OI1);
/* 512 */                   OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll17.I000lI();
/* 516 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll17, o1ooIo101ll2);
/* 520 */                   iloI0lOlll17.I00i0oil();
/* 525 */                   if (iloI0lOlll17.I00O10llo) {
/* 527 */                       iloi1112 = iloi1113;
/* 529 */                       iloI0lOlll17.I000l1(iloi1112);
                            } else {
/* 535 */                       iloi1112 = iloi1113;
/* 537 */                       iloI0lOlll17.I00io1l();
                            }
/* 541 */                   li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll17, oiI1iiIl1Oi0I00000oIO);
/* 546 */                   li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll17, oO0lO0l0I000lI2);
/* 551 */                   IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll17, iOioOOi0I7, iloI0lOlll17);
/* 556 */                   li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll17, o1ooiI111iI0000Il00O2);
/* 571 */                   if (O0000Ioio00.I0000O((String) oI10i0Il10.getValue(), "StrongBox")) {
/* 573 */                       ioiOolO1iOoI0000O = lO11Io0ol.I00000oIO;
/* 575 */                       if (ioiOolO1iOoI0000O != null) {
/* 577 */                           z2 = false;
                                } else {
/* 600 */                           IoiOo1iI ioiOo1iI = new IoiOo1iI("Rounded.Security", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 603 */                           int i3 = Ooo1iOO.I00000oIO;
/* 609 */                           OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 623 */                           OO0Ii1 oO0Ii1I000lI = Oi010OO0.I000lI(11.19f, 1.36f, -7.0f, 3.11f);
/* 643 */                           oO0Ii1I000lI.I0000O(3.47f, 4.79f, 3.0f, 5.51f, 3.0f, 6.3f);
/* 650 */                           oO0Ii1I000lI.I000o00OoI0I(11.0f);
/* 668 */                           oO0Ii1I000lI.I0000oI00(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
/* 684 */                           oO0Ii1I000lI.I0000oI00(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
/* 690 */                           oO0Ii1I000lI.I000o00OoI0I(6.3f);
/* 710 */                           oO0Ii1I000lI.I0000oI00(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
/* 716 */                           oO0Ii1I000lI.I000OOo1O(-7.0f, -3.11f);
/* 736 */                           oO0Ii1I000lI.I0000oI00(-0.51f, -0.23f, -1.11f, -0.23f, -1.62f, 0.0f);
/* 739 */                           oO0Ii1I000lI.I0000Il00O();
/* 747 */                           oO0Ii1I000lI.I000OiO(12.0f, 11.99f);
/* 752 */                           oO0Ii1I000lI.I000II(7.0f);
/* 772 */                           oO0Ii1I000lI.I0000oI00(-0.53f, 4.12f, -3.28f, 7.79f, -7.0f, 8.94f);
/* 775 */                           oO0Ii1I000lI.I000o00OoI0I(12.0f);
/* 780 */                           oO0Ii1I000lI.I0001Ioi1lo(5.0f);
/* 783 */                           oO0Ii1I000lI.I000o00OoI0I(6.3f);
/* 786 */                           oO0Ii1I000lI.I000OOo1O(7.0f, -3.11f);
/* 792 */                           oO0Ii1I000lI.I000oI1ioi(8.8f);
/* 795 */                           oO0Ii1I000lI.I0000Il00O();
/* 800 */                           z2 = false;
/* 801 */                           IoiOo1iI.I00000oOI(ioiOo1iI, oO0Ii1I000lI.I00000oIO, 0, olI00IIlOO);
/* 804 */                           ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 808 */                           lO11Io0ol.I00000oIO = ioiOolO1iOoI0000O;
                                }
                            } else {
/* 812 */                       z2 = false;
/* 813 */                       ioiOolO1iOoI0000O = lOIIO01i01.I00000oIO;
/* 815 */                       if (ioiOolO1iOoI0000O == null) {
/* 839 */                           IoiOo1iI ioiOo1iI2 = new IoiOo1iI("Rounded.Shield", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 842 */                           int i4 = Ooo1iOO.I00000oIO;
/* 848 */                           OlI00IIlOO olI00IIlOO2 = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 861 */                           OO0Ii1 oO0Ii1I000lI2 = Oi010OO0.I000lI(11.3f, 2.26f, -6.0f, 2.25f);
/* 881 */                           oO0Ii1I000lI2.I0000O(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
/* 889 */                           oO0Ii1I000lI2.I000oI1ioi(4.7f);
/* 908 */                           oO0Ii1I000lI2.I0000oI00(0.0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f);
/* 928 */                           oO0Ii1I000lI2.I0000oI00(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0.0f);
/* 948 */                           oO0Ii1I000lI2.I0000oI00(4.3f, -1.38f, 7.43f, -5.91f, 7.43f, -10.75f);
/* 954 */                           oO0Ii1I000lI2.I000oI1ioi(-4.7f);
/* 974 */                           oO0Ii1I000lI2.I0000oI00(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
/* 979 */                           oO0Ii1I000lI2.I000OOo1O(-6.0f, -2.25f);
/* 998 */                           oO0Ii1I000lI2.I0000O(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f);
/* 1001 */                          oO0Ii1I000lI2.I0000Il00O();
/* 1006 */                          IoiOo1iI.I00000oOI(ioiOo1iI2, oO0Ii1I000lI2.I00000oIO, 0, olI00IIlOO2);
/* 1009 */                          ioiOolO1iOoI0000O = ioiOo1iI2.I0000O();
/* 1013 */                          lOIIO01i01.I00000oIO = ioiOolO1iOoI0000O;
                                }
                            }
/* 1043 */                  IoOoiI1II00i.I00000oIO(ioiOolO1iOoI0000O, null, iO01II.I000OiO(o1ooIo101ll2, 0.0f, 0.0f, 4.0f, 0.0f, 11), liIoOiiO1Oi.I000O01llI0(iloI0lOlll17).I00000oIO, iloI0lOlll17, 432, 0);
/* 1115 */                  o1ooIo101ll = o1ooIo101ll2;
/* 1117 */                  iloi111 = iloi1112;
/* 1119 */                  iOioOOi0I3 = iOioOOi0I7;
/* 1121 */                  boolean z4 = z2;
/* 1123 */                  iI0O000iIl = iI0O000iIl2;
/* 1125 */                  iOioOOi0I = iOioOOi0I5;
/* 1127 */                  iOioOOi0I2 = iOioOOi0I6;
/* 1129 */                  iOioOOi0I4 = iOioOOi0I8;
/* 1133 */                  Oo0i1oIIoOO.I00000oOI(IIl001iO0Io.I000o00OoI0I("Protected by ", (String) oI10i0Il10.getValue()), null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00000oIO, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000l1, iloI0lOlll1, 0, 0, 131066);
/* 1136 */                  IloI0lOlll1 iloI0lOlll18 = iloI0lOlll1;
/* 1138 */                  z = true;
/* 1139 */                  iloI0lOlll18.I0010I0i(true);
/* 1142 */                  iloI0lOlll18.I0010I0i(z4);
                            r0 = z4;
                            iloI0lOlll13 = iloI0lOlll18;
                        }
/* 1181 */              if (((String) oI10i0Il13.getValue()).length() > 0) {
/* 1186 */                  iloI0lOlll13.I00i01iIIliI(-1368579926);
/* 1246 */                  Oo0i1oIIoOO.I00000oOI((String) oI10i0Il13.getValue(), null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I001i1O0Ol, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000l1, iloI0lOlll1, 0, 0, 131066);
/* 1249 */                  IloI0lOlll1 iloI0lOlll19 = iloI0lOlll1;
/* 1251 */                  iloI0lOlll19.I0010I0i(r0);
                            iloI0lOlll14 = iloI0lOlll19;
                        } else {
/* 1262 */                  iloI0lOlll13.I00i01iIIliI(-1368412402);
/* 1265 */                  iloI0lOlll13.I0010I0i(r0);
                            iloI0lOlll14 = iloI0lOlll13;
                        }
/* 1280 */              O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
/* 1290 */              OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, iI0O000iIl, iloI0lOlll14, 54);
/* 1296 */              int iHashCode3 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 1300 */              OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll14.I000lI();
/* 1304 */              O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI000OiO);
/* 1308 */              iloI0lOlll14.I00i0oil();
/* 1313 */              if (iloI0lOlll14.I00O10llo) {
/* 1317 */                  iloI0lOlll14.I000l1(iloi111);
                        } else {
/* 1323 */                  iloI0lOlll14.I00io1l();
                        }
/* 1327 */              li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO2);
/* 1332 */              li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI3);
/* 1337 */              IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 1342 */              li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O3);
/* 1403 */              Oo0i1oIIoOO.I00000oOI(((Boolean) oI10i0Il9.getValue()).booleanValue() ? "Enabled" : "Disabled", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll14).I000iOII, iloI0lOlll1, 0, 0, 131070);
/* 1406 */              IloI0lOlll1 iloI0lOlll110 = iloI0lOlll1;
/* 1414 */              boolean zBooleanValue = ((Boolean) oI10i0Il9.getValue()).booleanValue();
/* 1418 */              Object objI00O0i0ii8 = iloI0lOlll110.I00O0i0ii();
/* 1424 */              if (objI00O0i0ii8 == iOO0o0I1l2) {
/* 1429 */                  Io0IOO01iIO1 io0IOO01iIO1 = new Io0IOO01iIO1(2);
/* 1432 */                  oI10i0Il = oI10i0Il13;
/* 1434 */                  io0IOO01iIO1.I00iiI = oI10i0Il;
/* 1436 */                  oI10i0Il2 = oI10i0Il11;
/* 1438 */                  io0IOO01iIO1.I00iiO = oI10i0Il2;
/* 1440 */                  oI10i0Il3 = oI10i0Il12;
/* 1442 */                  io0IOO01iIO1.I00iio = oI10i0Il3;
/* 1444 */                  VarHandle.storeStoreFence();
/* 1447 */                  iloI0lOlll110.I00iio(io0IOO01iIO1);
                            obj = io0IOO01iIO1;
                        } else {
/* 1451 */                  oI10i0Il = oI10i0Il13;
/* 1453 */                  oI10i0Il2 = oI10i0Il11;
/* 1455 */                  oI10i0Il3 = oI10i0Il12;
                            obj = objI00O0i0ii8;
                        }
/* 1466 */              OllI1oooIo1o.I00000oIO(zBooleanValue, (Function1) obj, null, false, null, iloI0lOlll110, 48, 124);
/* 1470 */              iloI0lOlll110.I0010I0i(true);
/* 1473 */              iloI0lOlll110.I0010I0i(true);
/* 1486 */              if (((Boolean) oI10i0Il2.getValue()).booleanValue()) {
/* 1491 */                  iloI0lOlll110.I00i01iIIliI(-565926220);
/* 1494 */                  Object objI00O0i0ii9 = iloI0lOlll110.I00O0i0ii();
                            Object obj3 = objI00O0i0ii9;
/* 1498 */                  if (objI00O0i0ii9 == iOO0o0I1l2) {
/* 1504 */                      OI1oil oI1oil = new OI1oil(14);
/* 1507 */                      oI1oil.I00iiI = oI10i0Il2;
/* 1509 */                      VarHandle.storeStoreFence();
/* 1512 */                      iloI0lOlll110.I00iio(oI1oil);
                                obj3 = oI1oil;
                            }
/* 1519 */                  OioI0iIlIii oioI0iIlIii = new OioI0iIlIii(r0);
/* 1524 */                  oioI0iIlIii.I00iiI = ill0oOi02;
/* 1528 */                  oioI0iIlIii.I00iiO = context;
/* 1530 */                  oioI0iIlIii.I00iio = oI10i0Il2;
/* 1534 */                  oioI0iIlIii.I00ilI0I1 = oI10i0Il9;
/* 1538 */                  oioI0iIlIii.I00ilO0 = oI10i0Il10;
/* 1540 */                  oioI0iIlIii.I00io1l = oI10i0Il;
/* 1542 */                  VarHandle.storeStoreFence();
/* 1548 */                  IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1508854129, oioI0iIlIii, iloI0lOlll110);
/* 1556 */                  IloIlOOIi iloIlOOIi = new IloIlOOIi(24);
/* 1559 */                  iloIlOOIi.I00iiI = oI10i0Il2;
/* 1561 */                  VarHandle.storeStoreFence();
/* 1608 */                  ill0oOi0 = ill0oOi02;
/* 1610 */                  iOO0o0I1l = iOO0o0I1l2;
/* 1612 */                  oI10i0Il6 = oI10i0Il10;
/* 1614 */                  oI10i0Il4 = oI10i0Il;
/* 1616 */                  oI10i0Il7 = oI10i0Il9;
/* 1618 */                  oI10i0Il5 = oI10i0Il3;
/* 1622 */                  iOIil10l.I00000oIO((IllOOo00lI) obj3, iOii1lI00000oOI, null, iiioOl1O.I00000oOI(-108586321, iloIlOOIi, iloI0lOlll110), null, iII11Ii.I001IO000, iII11Ii.I001i1O0Ol, null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1772598, 16276);
/* 1625 */                  IloI0lOlll1 iloI0lOlll111 = iloI0lOlll1;
/* 1627 */                  iloI0lOlll111.I0010I0i(r0);
                            iloI0lOlll15 = iloI0lOlll111;
                        } else {
/* 1631 */                  iOO0o0I1l = iOO0o0I1l2;
/* 1633 */                  oI10i0Il4 = oI10i0Il;
/* 1635 */                  oI10i0Il5 = oI10i0Il3;
/* 1637 */                  oI10i0Il6 = oI10i0Il10;
/* 1639 */                  oI10i0Il7 = oI10i0Il9;
/* 1641 */                  ill0oOi0 = ill0oOi02;
/* 1646 */                  iloI0lOlll110.I00i01iIIliI(-564280988);
/* 1649 */                  iloI0lOlll110.I0010I0i(r0);
                            iloI0lOlll15 = iloI0lOlll110;
                        }
/* 1662 */              if (((Boolean) oI10i0Il5.getValue()).booleanValue()) {
/* 1667 */                  iloI0lOlll15.I00i01iIIliI(-564206092);
/* 1670 */                  Object objI00O0i0ii10 = iloI0lOlll15.I00O0i0ii();
/* 1676 */                  if (objI00O0i0ii10 == iOO0o0I1l) {
/* 1682 */                      OI1oil oI1oil2 = new OI1oil(15);
/* 1685 */                      oI10i0Il8 = oI10i0Il5;
/* 1687 */                      oI1oil2.I00iiI = oI10i0Il8;
/* 1689 */                      VarHandle.storeStoreFence();
/* 1692 */                      iloI0lOlll15.I00iio(oI1oil2);
                                obj2 = oI1oil2;
                            } else {
/* 1696 */                      oI10i0Il8 = oI10i0Il5;
                                obj2 = objI00O0i0ii10;
                            }
/* 1703 */                  OioI0iIlIii oioI0iIlIii2 = new OioI0iIlIii(1);
/* 1708 */                  oioI0iIlIii2.I00iiI = ill0oOi0;
/* 1712 */                  oioI0iIlIii2.I00iiO = context;
/* 1714 */                  oioI0iIlIii2.I00iio = oI10i0Il8;
/* 1718 */                  oioI0iIlIii2.I00ilI0I1 = oI10i0Il7;
/* 1722 */                  oioI0iIlIii2.I00ilO0 = oI10i0Il6;
/* 1726 */                  oioI0iIlIii2.I00io1l = oI10i0Il4;
/* 1728 */                  VarHandle.storeStoreFence();
/* 1734 */                  IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-524553368, oioI0iIlIii2, iloI0lOlll15);
/* 1742 */                  IloIlOOIi iloIlOOIi2 = new IloIlOOIi(25);
/* 1745 */                  iloIlOOIi2.I00iiI = oI10i0Il8;
/* 1747 */                  VarHandle.storeStoreFence();
/* 1781 */                  iOIil10l.I00000oIO((IllOOo00lI) obj2, iOii1lI00000oOI2, null, iiioOl1O.I00000oOI(-106664666, iloIlOOIi2, iloI0lOlll15), null, iII11Ii.I001l0I00, iII11Ii.I001lIiIIo1O, null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1772598, 16276);
/* 1784 */                  IloI0lOlll1 iloI0lOlll112 = iloI0lOlll1;
/* 1786 */                  iloI0lOlll112.I0010I0i(r0);
                            iloI0lOlll12 = iloI0lOlll112;
                        } else {
/* 1793 */                  iloI0lOlll15.I00i01iIIliI(-562776124);
/* 1796 */                  iloI0lOlll15.I0010I0i(r0);
                            iloI0lOlll12 = iloI0lOlll15;
                        }
                    } else {
/* 1800 */              iloI0lOlll16.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll16;
                    }
/* 1803 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1807 */          if (oOloioIlI001IO000 != null) {
/* 1813 */              O1IIii o1IIii = new O1IIii(24);
/* 1818 */              o1IIii.I00iiI = context;
/* 1820 */              VarHandle.storeStoreFence();
/* 1823 */              oOloioIlI001IO000.I0000O = o1IIii;
                    }
                }

                public static final void I00000oOI(String str, boolean z, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
/* 5 */             IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 10 */            iloI0lOlll13.I00i0O(521939096);
/* 24 */            int i2 = i | (iloI0lOlll13.I000O01llI0(z) ? 32 : 16);
/* 42 */            if (iloI0lOlll13.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 58 */                O1ooiI111i o1ooiI111iI00000oIO = ii0OOOOo0i.I00000oIO(Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f), OiI11O1i1.I00000oOI(12.0f));
/* 62 */                Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
                        Object obj = objI00O0i0ii;
/* 68 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 74 */                    I0O1OI i0o1oi = new I0O1OI(20);
/* 77 */                    i0o1oi.I00iiI = illOOo00lI;
/* 79 */                    VarHandle.storeStoreFence();
/* 82 */                    iloI0lOlll13.I00iio(i0o1oi);
                            obj = i0o1oi;
                        }
/* 97 */                O1ooiI111i o1ooiI111iI000O01llI0 = iO01II.I000O01llI0(i1Ioo1o0.I00000oOI(o1ooiI111iI00000oIO, false, null, (IllOOo00lI) obj, 15), 0.0f, 10.0f, 1);
/* 107 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, i1O01oOIoI0I.I00lli11, iloI0lOlll13, 54);
/* 113 */               int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 117 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 121 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000O01llI0);
/* 127 */               IOl0oi0lOl1.I000lI.getClass();
/* 130 */               iloI0lOlll13.I00i0oil();
/* 135 */               if (iloI0lOlll13.I00O10llo) {
/* 139 */                   iloI0lOlll13.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 143 */                   iloI0lOlll13.I00io1l();
                        }
/* 148 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 153 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 162 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 165 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 170 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 173 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 270 */               Oo0i1oIIoOO.I00000oOI(str, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I00000oIO, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oOI.I000O01llI0, 0L, 0L, IlilIIiIiO.I00l0OO0IO, null, 0L, 0L, null, 16777211), iloI0lOlll1, 6, 0, 131066);
/* 273 */               IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 301 */               IoOoiI1II00i.I00000oIO(z ? ilIloO011I1.I00000oIO() : ilIo1O.I00000oIO(), null, null, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oIO.I00000oIO, iloI0lOlll14, 48, 4);
/* 304 */               iloI0lOlll14.I0010I0i(true);
                        iloI0lOlll12 = iloI0lOlll14;
                    } else {
/* 308 */               iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 311 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 315 */           if (oOloioIlI001IO000 != null) {
/* 320 */               Il1i1O1iI il1i1O1iI = new Il1i1O1iI(6);
/* 325 */               il1i1O1iI.I00iio = str;
/* 329 */               il1i1O1iI.I00iiI = z;
/* 333 */               il1i1O1iI.I00iiO = illOOo00lI;
/* 335 */               VarHandle.storeStoreFence();
/* 338 */               oOloioIlI001IO000.I0000O = il1i1O1iI;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v23 */
                /* JADX WARN: Type inference failed for: r3v24, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r3v25 */
                public static final void I0000Il00O(Oo0oOoIo0ol oo0oOoIo0ol, O1ol100o0O o1ol100o0O, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    IloI0lOlll1 iloI0lOlll12;
                    IOO0o0I1l iOO0o0I1l;
                    boolean z;
                    IOO0o0I1l iOO0o0I1l2;
                    OI10i0Il oI10i0Il;
                    boolean z2;
                    IloI0lOlll1 iloI0lOlll13;
                    OI10i0Il oI10i0Il2;
                    Object obj;
                    ?? r3;
                    Object obj2;
/* 5 */             IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 12 */            iloI0lOlll14.I00i0O(-643478013);
/* 17 */            if ((i & 6) == 0) {
/* 32 */                i2 = (iloI0lOlll14.I0000oI00(oo0oOoIo0ol.I00000oIO()) ? 4 : 2) | i;
                    } else {
/* 34 */                i2 = i;
                    }
/* 37 */            if ((i & 48) == 0) {
/* 50 */                i2 |= iloI0lOlll14.I000OOo1O(o1ol100o0O) ? 32 : 16;
                    }
/* 53 */            if ((i & 384) == 0) {
/* 66 */                i2 |= iloI0lOlll14.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 82 */            if (iloI0lOlll14.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 84 */                Object objI00O0i0ii = iloI0lOlll14.I00O0i0ii();
/* 88 */                IOO0o0I1l iOO0o0I1l3 = IOl11li.I00000oIO;
/* 90 */                if (objI00O0i0ii == iOO0o0I1l3) {
/* 92 */                    objI00O0i0ii = lOO00IiI0li.I00000oIO(oo0oOoIo0ol);
/* 96 */                    iloI0lOlll14.I00iio(objI00O0i0ii);
                        }
/* 99 */                OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii;
/* 101 */               Object objI00O0i0ii2 = iloI0lOlll14.I00O0i0ii();
/* 105 */               if (objI00O0i0ii2 == iOO0o0I1l3) {
/* 107 */                   objI00O0i0ii2 = l001l0.I00000oIO();
/* 111 */                   iloI0lOlll14.I00iio(objI00O0i0ii2);
                        }
/* 114 */               OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii2;
/* 116 */               Object objI00O0i0ii3 = iloI0lOlll14.I00O0i0ii();
/* 120 */               if (objI00O0i0ii3 == iOO0o0I1l3) {
/* 124 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 128 */                   iloI0lOlll14.I00iio(objI00O0i0ii3);
                        }
/* 132 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii3;
/* 134 */               Object objI00O0i0ii4 = iloI0lOlll14.I00O0i0ii();
/* 138 */               if (objI00O0i0ii4 == iOO0o0I1l3) {
/* 142 */                   objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 146 */                   iloI0lOlll14.I00iio(objI00O0i0ii4);
                        }
/* 150 */               OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii4;
/* 152 */               Object objI00O0i0ii5 = iloI0lOlll14.I00O0i0ii();
/* 156 */               if (objI00O0i0ii5 == iOO0o0I1l3) {
/* 160 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 164 */                   iloI0lOlll14.I00iio(objI00O0i0ii5);
                        }
/* 168 */               OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii5;
/* 170 */               Object objI00O0i0ii6 = iloI0lOlll14.I00O0i0ii();
/* 174 */               if (objI00O0i0ii6 == iOO0o0I1l3) {
/* 177 */                   objI00O0i0ii6 = lOO00IiI0li.I00000oIO(null);
/* 181 */                   iloI0lOlll14.I00iio(objI00O0i0ii6);
                        }
/* 184 */               OI10i0Il oI10i0Il7 = (OI10i0Il) objI00O0i0ii6;
/* 186 */               Object objI00O0i0ii7 = iloI0lOlll14.I00O0i0ii();
/* 190 */               if (objI00O0i0ii7 == iOO0o0I1l3) {
/* 194 */                   objI00O0i0ii7 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 198 */                   iloI0lOlll14.I00iio(objI00O0i0ii7);
                        }
/* 201 */               OI10i0Il oI10i0Il8 = (OI10i0Il) objI00O0i0ii7;
/* 203 */               Object objI00O0i0ii8 = iloI0lOlll14.I00O0i0ii();
/* 207 */               if (objI00O0i0ii8 == iOO0o0I1l3) {
/* 209 */                   objI00O0i0ii8 = iIO0iiOiOl0l.I000II(iloI0lOlll14);
/* 213 */                   iloI0lOlll14.I00iio(objI00O0i0ii8);
                        }
/* 216 */               Ii0110 ii0110 = (Ii0110) objI00O0i0ii8;
/* 218 */               Object objI00O0i0ii9 = iloI0lOlll14.I00O0i0ii();
/* 222 */               if (objI00O0i0ii9 == iOO0o0I1l3) {
/* 226 */                   objI00O0i0ii9 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 230 */                   iloI0lOlll14.I00iio(objI00O0i0ii9);
                        }
/* 233 */               OI10i0Il oI10i0Il9 = (OI10i0Il) objI00O0i0ii9;
/* 235 */               Object objI00O0i0ii10 = iloI0lOlll14.I00O0i0ii();
/* 239 */               if (objI00O0i0ii10 == iOO0o0I1l3) {
/* 243 */                   objI00O0i0ii10 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 247 */                   iloI0lOlll14.I00iio(objI00O0i0ii10);
                        }
/* 250 */               OI10i0Il oI10i0Il10 = (OI10i0Il) objI00O0i0ii10;
/* 252 */               int i3 = i2;
/* 254 */               Object objI00O0i0ii11 = iloI0lOlll14.I00O0i0ii();
/* 258 */               if (objI00O0i0ii11 == iOO0o0I1l3) {
/* 262 */                   objI00O0i0ii11 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 266 */                   iloI0lOlll14.I00iio(objI00O0i0ii11);
                        }
/* 269 */               OI10i0Il oI10i0Il11 = (OI10i0Il) objI00O0i0ii11;
/* 271 */               Object objI00O0i0ii12 = iloI0lOlll14.I00O0i0ii();
/* 275 */               if (objI00O0i0ii12 == iOO0o0I1l3) {
/* 279 */                   objI00O0i0ii12 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 283 */                   iloI0lOlll14.I00iio(objI00O0i0ii12);
                        }
/* 286 */               OI10i0Il oI10i0Il12 = (OI10i0Il) objI00O0i0ii12;
/* 290 */               Object objI00O0i0ii13 = iloI0lOlll14.I00O0i0ii();
/* 294 */               if (objI00O0i0ii13 == iOO0o0I1l3) {
/* 298 */                   objI00O0i0ii13 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 302 */                   iloI0lOlll14.I00iio(objI00O0i0ii13);
                        }
/* 305 */               OI10i0Il oI10i0Il13 = (OI10i0Il) objI00O0i0ii13;
/* 307 */               Object objI00O0i0ii14 = iloI0lOlll14.I00O0i0ii();
/* 311 */               if (objI00O0i0ii14 == iOO0o0I1l3) {
/* 315 */                   objI00O0i0ii14 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 319 */                   iloI0lOlll14.I00iio(objI00O0i0ii14);
                        }
/* 322 */               OI10i0Il oI10i0Il14 = (OI10i0Il) objI00O0i0ii14;
/* 326 */               Object objI00O0i0ii15 = iloI0lOlll14.I00O0i0ii();
/* 330 */               if (objI00O0i0ii15 == iOO0o0I1l3) {
/* 334 */                   objI00O0i0ii15 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 338 */                   iloI0lOlll14.I00iio(objI00O0i0ii15);
                        }
/* 341 */               OI10i0Il oI10i0Il15 = (OI10i0Il) objI00O0i0ii15;
/* 345 */               Object objI00O0i0ii16 = iloI0lOlll14.I00O0i0ii();
/* 349 */               if (objI00O0i0ii16 == iOO0o0I1l3) {
/* 353 */                   objI00O0i0ii16 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 357 */                   iloI0lOlll14.I00iio(objI00O0i0ii16);
                        }
/* 360 */               OI10i0Il oI10i0Il16 = (OI10i0Il) objI00O0i0ii16;
/* 364 */               Object objI00O0i0ii17 = iloI0lOlll14.I00O0i0ii();
/* 368 */               if (objI00O0i0ii17 == iOO0o0I1l3) {
/* 372 */                   objI00O0i0ii17 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 376 */                   iloI0lOlll14.I00iio(objI00O0i0ii17);
                        }
/* 386 */               Iii0io0OooO iii0io0OooO = new Iii0io0OooO(3);
/* 391 */               OioII0o oioII0o = new OioII0o();
/* 394 */               oioII0o.I00iOIl = oI0lOIiOIOOo;
/* 396 */               oioII0o.I00iiI = oI10i0Il9;
/* 398 */               oioII0o.I00iiO = o1ol100o0O;
/* 400 */               oioII0o.I00iio = oI10i0Il3;
/* 402 */               oioII0o.I00ilI0I1 = oI10i0Il10;
/* 404 */               oioII0o.I00ilO0 = oI10i0Il11;
/* 406 */               oioII0o.I00io1l = oI10i0Il6;
/* 408 */               oioII0o.I00ioIO = oI10i0Il5;
/* 410 */               oioII0o.I00l0I0l0lO1 = oI10i0Il12;
/* 412 */               oioII0o.I00l0OO0IO = oI10i0Il14;
/* 414 */               oioII0o.I00li1OI = oI10i0Il15;
/* 416 */               oioII0o.I00ll1 = oI10i0Il13;
/* 418 */               oioII0o.I00lli11 = oI10i0Il16;
/* 420 */               oioII0o.I00lll10 = (OI10i0Il) objI00O0i0ii17;
/* 424 */               oioII0o.I00o0iI0io1 = oI10i0Il7;
/* 428 */               oioII0o.I00o0l1o1o0 = ii0110;
/* 432 */               oioII0o.I00o101lO = oI10i0Il8;
/* 436 */               oioII0o.I00oI0i = illOOo00lI;
/* 438 */               VarHandle.storeStoreFence();
/* 457 */               IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 460 */               iOIlI11IO.I00000oIO(illOOo00lI, iii0io0OooO, iiioOl1O.I00000oOI(1131126362, oioII0o, iloI0lOlll1), iloI0lOlll15, ((i3 >> 6) & 14) | 432, 0);
/* 473 */               if (((Boolean) oI10i0Il4.getValue()).booleanValue()) {
/* 478 */                   iloI0lOlll15.I00i01iIIliI(-1330802288);
/* 481 */                   Object objI00O0i0ii18 = iloI0lOlll15.I00O0i0ii();
/* 485 */                   iOO0o0I1l = iOO0o0I1l3;
/* 487 */                   if (objI00O0i0ii18 == iOO0o0I1l) {
/* 491 */                       r3 = 0;
/* 492 */                       OioIO1o1 oioIO1o1 = new OioIO1o1(0);
/* 497 */                       oioIO1o1.I00iiI = oI10i0Il4;
/* 499 */                       VarHandle.storeStoreFence();
/* 502 */                       iloI0lOlll15.I00iio(oioIO1o1);
                                obj2 = oioIO1o1;
                            } else {
/* 506 */                       r3 = 0;
                                obj2 = objI00O0i0ii18;
                            }
/* 511 */                   z = true;
/* 512 */                   iOO0oo0lIIO.I00000oIO(54, r3, (IllOOo00lI) obj2, iloI0lOlll15, true);
/* 515 */                   iloI0lOlll15.I0010I0i(r3);
                        } else {
/* 519 */                   iOO0o0I1l = iOO0o0I1l3;
/* 522 */                   z = true;
/* 526 */                   iloI0lOlll15.I00i01iIIliI(-1330726369);
/* 529 */                   iloI0lOlll15.I0010I0i(false);
                        }
/* 542 */               if (((Boolean) oI10i0Il5.getValue()).booleanValue()) {
/* 547 */                   iloI0lOlll15.I00i01iIIliI(-1330671623);
/* 556 */                   Context context = (Context) iloI0lOlll15.I000iOII(I0lloOI0oio.I00000oOI);
/* 558 */                   Object objI00O0i0ii19 = iloI0lOlll15.I00O0i0ii();
                            Object obj3 = objI00O0i0ii19;
/* 562 */                   if (objI00O0i0ii19 == iOO0o0I1l) {
/* 567 */                       OioIO1o1 oioIO1o12 = new OioIO1o1(5);
/* 570 */                       oioIO1o12.I00iiI = oI10i0Il5;
/* 572 */                       VarHandle.storeStoreFence();
/* 575 */                       iloI0lOlll15.I00iio(oioIO1o12);
                                obj3 = oioIO1o12;
                            }
/* 582 */                   int i4 = 0;
/* 583 */                   OioIi1IOiI oioIi1IOiI = new OioIi1IOiI(i4);
/* 586 */                   oioIi1IOiI.I00iiI = context;
/* 588 */                   oioIi1IOiI.I00iiO = oI10i0Il5;
/* 590 */                   VarHandle.storeStoreFence();
/* 596 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-320505587, oioIi1IOiI, iloI0lOlll15);
/* 602 */                   OioIilOIOO1 oioIilOIOO1 = new OioIilOIOO1(i4);
/* 605 */                   oioIilOIOO1.I00iiI = oI10i0Il5;
/* 607 */                   VarHandle.storeStoreFence();
/* 655 */                   oI10i0Il = oI10i0Il6;
/* 657 */                   z2 = false;
/* 659 */                   iOO0o0I1l2 = iOO0o0I1l;
/* 663 */                   iOIil10l.I00000oIO((IllOOo00lI) obj3, iOii1lI00000oOI, null, iiioOl1O.I00000oOI(-931774645, oioIilOIOO1, iloI0lOlll15), null, iII11Ii.I000o00OoI0I, iII11Ii.I000oI1ioi, null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1772598, 16276);
/* 666 */                   IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 668 */                   iloI0lOlll16.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll16;
                        } else {
/* 672 */                   iOO0o0I1l2 = iOO0o0I1l;
/* 674 */                   oI10i0Il = oI10i0Il6;
/* 676 */                   z2 = false;
/* 680 */                   iloI0lOlll15.I00i01iIIliI(-1329804801);
/* 683 */                   iloI0lOlll15.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll15;
                        }
/* 696 */               if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 701 */                   iloI0lOlll13.I00i01iIIliI(-1329745157);
/* 710 */                   Context context2 = (Context) iloI0lOlll13.I000iOII(I0lloOI0oio.I00000oOI);
/* 712 */                   Object objI00O0i0ii20 = iloI0lOlll13.I00O0i0ii();
/* 718 */                   if (objI00O0i0ii20 == iOO0o0I1l2) {
/* 724 */                       OioIO1o1 oioIO1o13 = new OioIO1o1(18);
/* 727 */                       oI10i0Il2 = oI10i0Il;
/* 729 */                       oioIO1o13.I00iiI = oI10i0Il2;
/* 731 */                       VarHandle.storeStoreFence();
/* 734 */                       iloI0lOlll13.I00iio(oioIO1o13);
                                obj = oioIO1o13;
                            } else {
/* 738 */                       oI10i0Il2 = oI10i0Il;
                                obj = objI00O0i0ii20;
                            }
/* 744 */                   int i5 = 1;
/* 745 */                   OioIi1IOiI oioIi1IOiI2 = new OioIi1IOiI(i5);
/* 748 */                   oioIi1IOiI2.I00iiI = context2;
/* 750 */                   oioIi1IOiI2.I00iiO = oI10i0Il2;
/* 752 */                   VarHandle.storeStoreFence();
/* 758 */                   IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(1473679758, oioIi1IOiI2, iloI0lOlll13);
/* 764 */                   OioIilOIOO1 oioIilOIOO12 = new OioIilOIOO1(i5);
/* 767 */                   oioIilOIOO12.I00iiI = oI10i0Il2;
/* 769 */                   VarHandle.storeStoreFence();
/* 809 */                   iOIil10l.I00000oIO((IllOOo00lI) obj, iOii1lI00000oOI2, null, iiioOl1O.I00000oOI(862410700, oioIilOIOO12, iloI0lOlll13), null, iII11Ii.I0010I0i, iII11Ii.I0010o, null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1772598, 16276);
/* 812 */                   IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 814 */                   iloI0lOlll17.I0010I0i(z2);
                            iloI0lOlll12 = iloI0lOlll17;
                        } else {
/* 821 */                   iloI0lOlll13.I00i01iIIliI(-1329064769);
/* 824 */                   iloI0lOlll13.I0010I0i(z2);
                            iloI0lOlll12 = iloI0lOlll13;
                        }
                    } else {
/* 828 */               iloI0lOlll14.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 831 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 835 */           if (oOloioIlI001IO000 != null) {
/* 841 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(19);
/* 846 */               i0IliiililIo.I00iiO = oo0oOoIo0ol;
/* 850 */               i0IliiililIo.I00ilI0I1 = o1ol100o0O;
/* 854 */               i0IliiililIo.I00iio = illOOo00lI;
/* 858 */               i0IliiililIo.I00iiI = i;
/* 860 */               VarHandle.storeStoreFence();
/* 863 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                public static final boolean I0000O(OI10i0Il oI10i0Il) {
/* 7 */             return ((Boolean) oI10i0Il.getValue()).booleanValue();
                }

                public static final boolean I0000oI00(OI10i0Il oI10i0Il) {
/* 7 */             return ((Boolean) oI10i0Il.getValue()).booleanValue();
                }
            }

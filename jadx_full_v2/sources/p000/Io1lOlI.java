            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.regex.Pattern;
            
/* 7 */     public final class Io1lOlI {
                public static final Io1lOlI I0000Il00O;
                public static final Io1lOlI I0000O;
                public static final Io1lOlI I0000oI00;
                public static final Io1lOlI I0001Ioi1lo;
                public static final Io1lOlI I000II;
                public static final Io1lOlI I000O01llI0;
                public static final Io1lOlI I000OOo1O;
                public final int I00000oIO;
                public String I00000oOI;

                static {
/* 5 */             int i = 0;
/* 9 */             I0000Il00O = new Io1lOlI("TINK", i);
/* 18 */            I0000O = new Io1lOlI("CRUNCHY", i);
/* 27 */            I0000oI00 = new Io1lOlI("LEGACY", i);
/* 36 */            I0001Ioi1lo = new Io1lOlI("NO_PREFIX", i);
/* 42 */            int i2 = 1;
/* 46 */            I000II = new Io1lOlI("TINK", i2);
/* 55 */            I000O01llI0 = new Io1lOlI("CRUNCHY", i2);
/* 64 */            I000OOo1O = new Io1lOlI("NO_PREFIX", i2);
                }

                public Io1lOlI(String str, int i) {
/* 1 */             this.I00000oIO = i;
/* 3 */             this.I00000oOI = str;
                }

                public OI1iiIoI0OOi I00000oIO() {
/* 3 */             String str = this.I00000oOI;
/* 5 */             OI1iiIoI0OOi oI1iiIoI0OOi = new OI1iiIoI0OOi();
/* 8 */             oI1iiIoI0OOi.I00000oIO = str;
/* 12 */            ArrayList arrayList = new ArrayList();
/* 15 */            oI1iiIoI0OOi.I00000oOI = arrayList;
/* 19 */            boolean z = false;
/* 19 */            z = false;
/* 20 */            OI1i1I oI1i1I = new OI1i1I(z ? 1 : 0);
/* 23 */            oI1i1I.I00iiI = oI1iiIoI0OOi;
/* 25 */            VarHandle.storeStoreFence();
/* 33 */            oI1iiIoI0OOi.I0000O = new OllO00oiil(oI1i1I);
/* 38 */            OI1i1I oI1i1I2 = new OI1i1I(1);
/* 41 */            oI1i1I2.I00iiI = oI1iiIoI0OOi;
/* 43 */            VarHandle.storeStoreFence();
/* 51 */            oI1iiIoI0OOi.I0000oI00 = new OllO00oiil(oI1i1I2);
/* 53 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 58 */            OI1i1I oI1i1I3 = new OI1i1I(2);
/* 61 */            oI1i1I3.I00iiI = oI1iiIoI0OOi;
/* 63 */            VarHandle.storeStoreFence();
/* 70 */            oI1iiIoI0OOi.I0001Ioi1lo = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oI1i1I3);
/* 74 */            int i = 3;
/* 75 */            OI1i1I oI1i1I4 = new OI1i1I(i);
/* 78 */            oI1i1I4.I00iiI = oI1iiIoI0OOi;
/* 80 */            VarHandle.storeStoreFence();
/* 87 */            oI1iiIoI0OOi.I000O01llI0 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oI1i1I4);
/* 92 */            OI1i1I oI1i1I5 = new OI1i1I(4);
/* 95 */            oI1i1I5.I00iiI = oI1iiIoI0OOi;
/* 97 */            VarHandle.storeStoreFence();
/* 104 */           oI1iiIoI0OOi.I000OOo1O = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oI1i1I5);
/* 109 */           OI1i1I oI1i1I6 = new OI1i1I(5);
/* 112 */           oI1i1I6.I00iiI = oI1iiIoI0OOi;
/* 114 */           VarHandle.storeStoreFence();
/* 121 */           oI1iiIoI0OOi.I000OiO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oI1i1I6);
/* 126 */           OI1i1I oI1i1I7 = new OI1i1I(6);
/* 129 */           oI1i1I7.I00iiI = oI1iiIoI0OOi;
/* 131 */           VarHandle.storeStoreFence();
/* 139 */           oI1iiIoI0OOi.I000iOII = new OllO00oiil(oI1i1I7);
/* 143 */           O1olloI0OlO o1olloI0OlO = new O1olloI0OlO(i);
/* 146 */           VarHandle.storeStoreFence();
/* 151 */           new OllO00oiil(o1olloI0OlO);
/* 158 */           StringBuilder sb = new StringBuilder("^");
/* 173 */           if (!OI1iiIoI0OOi.I000lI.I00iOIl.matcher(str).find()) {
/* 183 */               sb.append(OI1iiIoI0OOi.I000oI1ioi.I00iOIl.pattern());
                    }
/* 196 */           O1OlOOioiI o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(Pattern.compile("(\\?|#|$)").matcher(str), 0, str);
/* 200 */           if (o1OlOOioiII00000oIO != null) {
/* 212 */               OI1iiIoI0OOi.I00000oIO(str.substring(0, o1OlOOioiII00000oIO.I00000oOI().I00iOIl), arrayList, sb);
/* 227 */               if (!OI1iiIoI0OOi.I00100l0.I00iOIl.matcher(sb).find() && !OI1iiIoI0OOi.I00100o1O0lo.I00iOIl.matcher(sb).find()) {
/* 243 */                   z = true;
                        }
/* 244 */               oI1iiIoI0OOi.I000l1 = z;
/* 248 */               sb.append("($|(\\?(.)*)|(#(.)*))");
                    }
/* 259 */           oI1iiIoI0OOi.I0000Il00O = OI1iiIoI0OOi.I0001Ioi1lo(sb.toString());
/* 261 */           VarHandle.storeStoreFence();
/* 743 */           return oI1iiIoI0OOi;
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 0:
/* 14 */                    return this.I00000oOI;
                        case 1:
/* 11 */                    return this.I00000oOI;
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 8 */         public Io1lOlI() {
/* 9 */             this.I00000oIO = 2;
                }
            }

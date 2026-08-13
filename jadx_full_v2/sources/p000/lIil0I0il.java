            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class lIil0I0il {
                public static final String I00000oIO(OI1IlOlol oI1IlOlol, int i) {
/* 1 */             String strI00000oIO = oI1IlOlol.I00000oIO(i);
                    return oI1IlOlol.I00000oOI(i) ? ".".concat(strI00000oIO) : strI00000oIO;
                }

                public static final O0OiOolO0i I00000oOI(OOOi000ooO oOOi000ooO, OI1IlOlol oI1IlOlol) {
/* 3 */             String strI00000oIO = I00000oIO(oI1IlOlol, oOOi000ooO.I00iiO);
/* 7 */             List<OOOOlOoi0> list = oOOi000ooO.I00iio;
/* 13 */            ArrayList arrayList = new ArrayList();
/* 24 */            for (OOOOlOoi0 oOOOlOoi0 : list) {
/* 34 */                O0OoI01Oo000 o0OoI01Oo000I0000Il00O = I0000Il00O(oOOOlOoi0.I00iio, oI1IlOlol);
/* 52 */                OIoi0IIoi oIoi0IIoi = o0OoI01Oo000I0000Il00O != null ? new OIoi0IIoi(oI1IlOlol.getString(oOOOlOoi0.I00iiO), o0OoI01Oo000I0000Il00O) : null;
/* 53 */                if (oIoi0IIoi != null) {
/* 55 */                    arrayList.add(oIoi0IIoi);
                        }
                    }
/* 59 */            Map mapI000OiO = O1Oii0O0loo.I000OiO(arrayList);
/* 65 */            O0OiOolO0i o0OiOolO0i = new O0OiOolO0i();
/* 68 */            o0OiOolO0i.I00000oIO = strI00000oIO;
/* 70 */            o0OiOolO0i.I00000oOI = mapI000OiO;
/* 72 */            VarHandle.storeStoreFence();
/* 89 */            return o0OiOolO0i;
                }

                public static final O0OoI01Oo000 I0000Il00O(OOOOlIoIlOi oOOOlIoIlOi, OI1IlOlol oI1IlOlol) {
/* 9 */             boolean zBooleanValue = IlO1il.I00Iooi00oi.I0000oI00(oOOOlIoIlOi.I00lli11).booleanValue();
/* 13 */            OOOOil0 oOOOil0 = oOOOlIoIlOi.I00iiO;
/* 18 */            if (zBooleanValue) {
/* 29 */                int i = oOOOil0 != null ? OOlOI1110.I00000oIO[oOOOil0.ordinal()] : -1;
/* 31 */                if (i == 1) {
/* 98 */                    O0Ololi1 o0Ololi1 = new O0Ololi1();
/* 101 */                   o0Ololi1.I00000oIO = (byte) oOOOlIoIlOi.I00iio;
/* 103 */                   VarHandle.storeStoreFence();
/* 106 */                   return o0Ololi1;
                        }
/* 34 */                if (i == 2) {
/* 83 */                    O0Oo1iool o0Oo1iool = new O0Oo1iool();
/* 86 */                    o0Oo1iool.I00000oIO = (short) oOOOlIoIlOi.I00iio;
/* 88 */                    VarHandle.storeStoreFence();
/* 91 */                    return o0Oo1iool;
                        }
/* 37 */                if (i == 3) {
/* 67 */                    int i2 = (int) oOOOlIoIlOi.I00iio;
/* 68 */                    O0Oo0l01OOO o0Oo0l01OOO = new O0Oo0l01OOO();
/* 71 */                    o0Oo0l01OOO.I00000oIO = i2;
/* 73 */                    VarHandle.storeStoreFence();
/* 76 */                    return o0Oo0l01OOO;
                        }
/* 40 */                if (i != 4) {
/* 59 */                    OIiilo1Ool0o.I00100l0("Cannot read value of unsigned type: ", oOOOlIoIlOi.I00iiO);
/* 15 */                    return null;
                        }
/* 44 */                long j = oOOOlIoIlOi.I00iio;
/* 46 */                O0Oo111 o0Oo111 = new O0Oo111();
/* 49 */                o0Oo111.I00000oIO = j;
/* 51 */                VarHandle.storeStoreFence();
/* 54 */                return o0Oo111;
                    }
                    switch (oOOOil0 != null ? OOlOI1110.I00000oIO[oOOOil0.ordinal()] : -1) {
                        case -1:
/* 15 */                    return null;
                        case 0:
                        default:
/* 122 */                   I000II.I00000oIO();
/* 15 */                    return null;
                        case 1:
/* 429 */                   O0Oiolo0i1 o0Oiolo0i1 = new O0Oiolo0i1();
/* 432 */                   o0Oiolo0i1.I00000oIO = (byte) oOOOlIoIlOi.I00iio;
/* 434 */                   VarHandle.storeStoreFence();
/* 437 */                   return o0Oiolo0i1;
                        case 2:
/* 414 */                   O0OllOO o0OllOO = new O0OllOO();
/* 417 */                   o0OllOO.I00000oIO = (short) oOOOlIoIlOi.I00iio;
/* 419 */                   VarHandle.storeStoreFence();
/* 422 */                   return o0OllOO;
                        case 3:
/* 398 */                   int i3 = (int) oOOOlIoIlOi.I00iio;
/* 399 */                   O0Ol1lIlOiii o0Ol1lIlOiii = new O0Ol1lIlOiii();
/* 402 */                   o0Ol1lIlOiii.I00000oIO = i3;
/* 404 */                   VarHandle.storeStoreFence();
/* 407 */                   return o0Ol1lIlOiii;
                        case 4:
/* 383 */                   long j2 = oOOOlIoIlOi.I00iio;
/* 385 */                   O0Oll0i o0Oll0i = new O0Oll0i();
/* 388 */                   o0Oll0i.I00000oIO = j2;
/* 390 */                   VarHandle.storeStoreFence();
/* 393 */                   return o0Oll0i;
                        case 5:
/* 372 */                   O0Ol001oIo10 o0Ol001oIo10 = new O0Ol001oIo10();
/* 375 */                   o0Ol001oIo10.I00000oIO = (char) oOOOlIoIlOi.I00iio;
/* 377 */                   VarHandle.storeStoreFence();
/* 380 */                   return o0Ol001oIo10;
                        case 6:
/* 355 */                   float f = oOOOlIoIlOi.I00ilI0I1;
/* 357 */                   O0Ol0i o0Ol0i = new O0Ol0i();
/* 360 */                   o0Ol0i.I00000oIO = f;
/* 362 */                   VarHandle.storeStoreFence();
/* 365 */                   return o0Ol0i;
                        case 7:
/* 342 */                   double d = oOOOlIoIlOi.I00ilO0;
/* 344 */                   O0Ol01OI1II o0Ol01OI1II = new O0Ol01OI1II();
/* 347 */                   o0Ol01OI1II.I00000oIO = d;
/* 349 */                   VarHandle.storeStoreFence();
/* 352 */                   return o0Ol01OI1II;
                        case 8:
/* 327 */                   boolean z = oOOOlIoIlOi.I00iio != 0;
/* 331 */                   O0OiolI0 o0OiolI0 = new O0OiolI0();
/* 334 */                   o0OiolI0.I00000oIO = z;
/* 336 */                   VarHandle.storeStoreFence();
/* 339 */                   return o0OiolI0;
                        case 9:
/* 306 */                   String string = oI1IlOlol.getString(oOOOlIoIlOi.I00io1l);
/* 310 */                   O0Olo0ili o0Olo0ili = new O0Olo0ili();
/* 313 */                   o0Olo0ili.I00000oIO = string;
/* 315 */                   VarHandle.storeStoreFence();
/* 318 */                   return o0Olo0ili;
                        case 10:
/* 216 */                   String strI00000oIO = I00000oIO(oI1IlOlol, oOOOlIoIlOi.I00ioIO);
/* 220 */                   int i4 = oOOOlIoIlOi.I00ll1;
/* 222 */                   if (i4 == 0) {
/* 226 */                       O0OlO01OiiI o0OlO01OiiI = new O0OlO01OiiI();
/* 229 */                       o0OlO01OiiI.I00000oIO = strI00000oIO;
/* 231 */                       VarHandle.storeStoreFence();
/* 234 */                       return o0OlO01OiiI;
                            }
/* 237 */                   O0Oil1 o0Oil1 = new O0Oil1();
/* 240 */                   o0Oil1.I00000oIO = strI00000oIO;
/* 242 */                   o0Oil1.I00000oOI = i4;
/* 244 */                   if (i4 <= 0) {
/* 298 */                       I000II.I000iOII("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
/* 15 */                        return null;
                            }
/* 250 */                   StringBuilder sb = new StringBuilder("ArrayKClassValue(");
/* 254 */                   for (int i5 = 0; i5 < i4; i5++) {
/* 258 */                       sb.append("kotlin/Array<");
                            }
/* 266 */                   sb.append(o0Oil1.I00000oIO);
/* 269 */                   int i6 = o0Oil1.I00000oOI;
/* 271 */                   for (int i7 = 0; i7 < i6; i7++) {
/* 275 */                       sb.append(">");
                            }
/* 283 */                   sb.append(")");
/* 290 */                   o0Oil1.I0000Il00O = sb.toString();
/* 292 */                   VarHandle.storeStoreFence();
/* 295 */                   return o0Oil1;
                        case 11:
/* 193 */                   String strI00000oIO2 = I00000oIO(oI1IlOlol, oOOOlIoIlOi.I00ioIO);
/* 199 */                   String string2 = oI1IlOlol.getString(oOOOlIoIlOi.I00l0I0l0lO1);
/* 203 */                   O0Ol0O o0Ol0O = new O0Ol0O();
/* 206 */                   o0Ol0O.I00000oIO = strI00000oIO2;
/* 208 */                   o0Ol0O.I00000oOI = string2;
/* 210 */                   VarHandle.storeStoreFence();
/* 213 */                   return o0Ol0O;
                        case 12:
/* 176 */                   O0OiOolO0i o0OiOolO0iI00000oOI = I00000oOI(oOOOlIoIlOi.I00l0OO0IO, oI1IlOlol);
/* 180 */                   O0Oil0i o0Oil0i = new O0Oil0i();
/* 183 */                   o0Oil0i.I00000oIO = o0OiOolO0iI00000oOI;
/* 185 */                   VarHandle.storeStoreFence();
/* 188 */                   return o0Oil0i;
                        case 13:
/* 126 */                   List list = oOOOlIoIlOi.I00li1OI;
/* 132 */                   ArrayList arrayList = new ArrayList();
/* 135 */                   Iterator it = list.iterator();
/* 143 */                   while (it.hasNext()) {
/* 151 */                       O0OoI01Oo000 o0OoI01Oo000I0000Il00O = I0000Il00O((OOOOlIoIlOi) it.next(), oI1IlOlol);
/* 155 */                       if (o0OoI01Oo000I0000Il00O != null) {
/* 157 */                           arrayList.add(o0OoI01Oo000I0000Il00O);
                                }
                            }
/* 163 */                   O0OiliII1IlO o0OiliII1IlO = new O0OiliII1IlO();
/* 166 */                   o0OiliII1IlO.I00000oIO = arrayList;
/* 168 */                   VarHandle.storeStoreFence();
/* 171 */                   return o0OiliII1IlO;
                    }
                }
            }

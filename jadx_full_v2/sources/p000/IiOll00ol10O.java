            package p000;

            import java.io.ByteArrayInputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IiOll00ol10O implements Function1 {
                public final int I00iOIl;
                public IiOlooi I00iiI;

                public IiOll00ol10O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    I11IlOOO i11IlOOO;
                    IiOiOloo0 iiOiOloo0;
                    OOi001oo1OOI oOi001oo1OOII00100l0;
                    OOi001oo1OOI oOi001oo1OOII00100l02;
/* 3 */             int i = this.I00iOIl;
/* 5 */             List listI000lI = Il01100l.I00iOIl;
/* 9 */             IiOlooi iiOlooi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 398 */                   OI1Iio0ii1 oI1Iio0ii1 = (OI1Iio0ii1) obj;
/* 400 */                   LinkedHashMap linkedHashMap = iiOlooi.I00000oIO;
/* 402 */                   O0II0llIl o0II0llIl = OOOll1o0.I00oliIiO01i;
/* 404 */                   IiOo0lO1 iiOo0lO1 = iiOlooi.I000OOo1O;
/* 410 */                   byte[] bArr = (byte[]) linkedHashMap.get(oI1Iio0ii1);
/* 412 */                   if (bArr != null) {
/* 428 */                       listI000lI = OilO1oiooiII.I000lI(OilO1oiooiII.I000OOo1O(new II01oIlIII(o0II0llIl, new ByteArrayInputStream(bArr), iiOo0lO1)));
                            }
/* 443 */                   ArrayList arrayList = new ArrayList(listI000lI.size());
/* 446 */                   Iterator it = listI000lI.iterator();
/* 454 */                   while (it.hasNext()) {
/* 468 */                       IiOoI01 iiOoI01I0001Ioi1lo = ((O1iiIOlO) iiOo0lO1.I00000oOI.I00l0OO0IO).I0001Ioi1lo((OOOll1o0) it.next());
/* 476 */                       if (!iiOo0lO1.I0010I0i(iiOoI01I0001Ioi1lo)) {
/* 479 */                           iiOoI01I0001Ioi1lo = null;
                                }
/* 480 */                       if (iiOoI01I0001Ioi1lo != null) {
/* 482 */                           arrayList.add(iiOoI01I0001Ioi1lo);
                                }
                            }
/* 486 */                   iiOo0lO1.I000OiO(oI1Iio0ii1, arrayList);
/* 489 */                   return iiIiiol0.I00000oOI(arrayList);
                        case 1:
/* 308 */                   OI1Iio0ii1 oI1Iio0ii12 = (OI1Iio0ii1) obj;
/* 310 */                   LinkedHashMap linkedHashMap2 = iiOlooi.I00000oOI;
/* 312 */                   O0II0llIl o0II0llIl2 = OOOo0i11Ol.I0100o111I;
/* 314 */                   IiOo0lO1 iiOo0lO12 = iiOlooi.I000OOo1O;
/* 320 */                   byte[] bArr2 = (byte[]) linkedHashMap2.get(oI1Iio0ii12);
/* 322 */                   if (bArr2 != null) {
/* 338 */                       listI000lI = OilO1oiooiII.I000lI(OilO1oiooiII.I000OOo1O(new II01oIlIII(o0II0llIl2, new ByteArrayInputStream(bArr2), iiOo0lO12)));
                            }
/* 353 */                   ArrayList arrayList2 = new ArrayList(listI000lI.size());
/* 356 */                   Iterator it2 = listI000lI.iterator();
/* 364 */                   while (it2.hasNext()) {
/* 382 */                       arrayList2.add(((O1iiIOlO) iiOo0lO12.I00000oOI.I00l0OO0IO).I000II((OOOo0i11Ol) it2.next(), false));
                            }
/* 386 */                   iiOo0lO12.I000iOII(oI1Iio0ii12, arrayList2);
/* 389 */                   return iiIiiol0.I00000oOI(arrayList2);
                        default:
/* 20 */                    IiOili0lOO1 iiOili0lOO1 = iiOlooi.I000OOo1O.I00000oOI;
/* 28 */                    byte[] bArr3 = (byte[]) iiOlooi.I0000Il00O.get((OI1Iio0ii1) obj);
/* 30 */                    if (bArr3 == null) {
/* 8 */                         return null;
                            }
/* 54 */                    OOi0IOIIOO oOi0IOIIOO = (OOi0IOIIOO) OOi0IOIIOO.I00o101lO.I00000oIO(new ByteArrayInputStream(bArr3), (Il1lll0iI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I000oI1ioi);
/* 56 */                    if (oOi0IOIIOO == null) {
/* 8 */                         return null;
                            }
/* 62 */                    O1iiIOlO o1iiIOlO = (O1iiIOlO) iiOili0lOO1.I00l0OO0IO;
/* 64 */                    IiOili0lOO1 iiOili0lOO12 = o1iiIOlO.I00000oIO;
/* 68 */                    OI1IlOlol oI1IlOlol = (OI1IlOlol) iiOili0lOO12.I00iiO;
/* 73 */                    Oi0Oooi oi0Oooi = (Oi0Oooi) iiOili0lOO12.I00ilI0I1;
/* 75 */                    List list = oOi0IOIIOO.I00li1OI;
/* 87 */                    ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list, 10));
/* 90 */                    Iterator it3 = list.iterator();
/* 98 */                    while (it3.hasNext()) {
/* 112 */                       arrayList3.add(o1iiIOlO.I00000oOI.I00lli11((OOOi000ooO) it3.next(), oI1IlOlol));
                            }
/* 120 */                   if (arrayList3.isEmpty()) {
/* 122 */                       i11IlOOO = i1i0olI.I00iiO;
                            } else {
/* 128 */                       I11Io0oil0i0 i11Io0oil0i0 = new I11Io0oil0i0();
/* 131 */                       i11Io0oil0i0.I00iiI = arrayList3;
/* 133 */                       VarHandle.storeStoreFence();
                                i11IlOOO = i11Io0oil0i0;
                            }
/* 124 */                   I11IlOOO i11IlOOO2 = i11IlOOO;
/* 145 */                   OOi110 oOi110 = (OOi110) IlO1il.I0000O.I0000oI00(oOi0IOIIOO.I00iio);
                            switch (oOi110 == null ? -1 : OOi1Ol0o.I00000oOI[oOi110.ordinal()]) {
                                case 1:
/* 181 */                           iiOiOloo0 = IiOiioI.I0000O;
                                    break;
                                case 2:
/* 178 */                           iiOiOloo0 = IiOiioI.I00000oIO;
                                    break;
                                case 3:
/* 175 */                           iiOiOloo0 = IiOiioI.I00000oOI;
                                    break;
                                case 4:
/* 172 */                           iiOiOloo0 = IiOiioI.I0000Il00O;
                                    break;
                                case 5:
/* 169 */                           iiOiOloo0 = IiOiioI.I0000oI00;
                                    break;
                                case 6:
/* 166 */                           iiOiOloo0 = IiOiioI.I0001Ioi1lo;
                                    break;
                                default:
/* 162 */                           iiOiOloo0 = IiOiioI.I00000oIO;
                                    break;
                            }
/* 221 */                   IiOoI0oI iiOoI0oI = new IiOoI0oI((O1I0OloI) ((Ii10lIo0l1) iiOili0lOO12.I00iiI).I00000oIO, (Ii1Ool1) iiOili0lOO12.I00iio, i11IlOOO2, l1iI1lOO.I00000oOI(oI1IlOlol, oOi0IOIIOO.I00ilI0I1), iiOiOloo0, oOi0IOIIOO, (OI1IlOlol) iiOili0lOO12.I00iiO, oi0Oooi, (OooO111lO1OI) iiOili0lOO12.I00ilO0, (IiOlIoIo) iiOili0lOO12.I00ioIO);
/* 232 */                   IOiOol0 iOiOol0 = (IOiOol0) iiOili0lOO12.I00000oIO(iiOoI0oI, oOi0IOIIOO.I00ilO0, (OI1IlOlol) iiOili0lOO12.I00iiO, (Oi0Oooi) iiOili0lOO12.I00ilI0I1, (OooO111lO1OI) iiOili0lOO12.I00ilO0, (II0O0I00oOi) iiOili0lOO12.I00io1l).I00l0I0l0lO1;
/* 234 */                   List listI0010o = iOiOol0.I0010o();
/* 238 */                   int i2 = oOi0IOIIOO.I00iiO;
/* 243 */                   if ((i2 & 4) == 4) {
/* 245 */                       oOi001oo1OOII00100l0 = oOi0IOIIOO.I00io1l;
                            } else {
/* 251 */                       if ((i2 & 8) != 8) {
/* 302 */                           I000II.I001IO000("No underlyingType in ProtoBuf.TypeAlias");
/* 8 */                             return null;
                                }
/* 255 */                       oOi001oo1OOII00100l0 = oi0Oooi.I00100l0(oOi0IOIIOO.I00ioIO);
                            }
/* 259 */                   Ol0O0iI0l0O ol0O0iI0l0OI00IOO = iOiOol0.I00IOO(oOi001oo1OOII00100l0, false);
/* 263 */                   int i3 = oOi0IOIIOO.I00iiO;
/* 269 */                   if ((i3 & 16) == 16) {
/* 271 */                       oOi001oo1OOII00100l02 = oOi0IOIIOO.I00l0I0l0lO1;
                            } else {
/* 277 */                       if ((i3 & 32) != 32) {
/* 296 */                           I000II.I001IO000("No expandedType in ProtoBuf.TypeAlias");
/* 8 */                             return null;
                                }
/* 281 */                       oOi001oo1OOII00100l02 = oi0Oooi.I00100l0(oOi0IOIIOO.I00l0OO0IO);
                            }
/* 289 */                   iiOoI0oI.I010l1O(listI0010o, ol0O0iI0l0OI00IOO, iOiOol0.I00IOO(oOi001oo1OOII00100l02, false));
/* 292 */                   return iiOoI0oI;
                    }
                }
            }

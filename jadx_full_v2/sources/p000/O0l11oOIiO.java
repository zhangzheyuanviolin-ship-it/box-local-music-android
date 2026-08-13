            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class O0l11oOIiO implements IllOOo00lI {
                public final int I00iOIl;
                public O0l1OOlI0OiO I00iiI;

                public O0l11oOIiO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 4 */             O0l1OOlI0OiO o0l1OOlI0OiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 219 */                   return OOo1Io0I0.I00000oIO(((IOIO10iOi1) l0O00Ol.I00000oIO(o0l1OOlI0OiO.I00000oOI.I00000oIO)).I001l0I00()).I00000oIO();
                        case 1:
/* 66 */                    Ill0IO ill0IOI0010o = o0l1OOlI0OiO.I0010o();
/* 70 */                    OOo1O1i oOo1O1i = o0l1OOlI0OiO.I00000oOI;
/* 72 */                    o01l1ioOo0 o01l1iooo0 = o0l1OOlI0OiO.I00000oIO;
/* 74 */                    if (ill0IOI0010o == null) {
/* 86 */                        return Il0ooiloI.I00000oOI(Il0ooO1IO.I0100i, oOo1O1i.toString());
                            }
/* 93 */                    I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) o01l1iooo0.I00iOIl;
/* 99 */                    O0i1lI0o1io o0i1lI0o1io = ((OI0011) i0l1OOl1l10.I000O01llI0).I00iio;
/* 101 */                   String str = O00oO0liO11.I00000oIO;
/* 103 */                   IOIOill iOIOillI000II = O00oO0liO11.I000II(ill0IOI0010o);
/* 118 */                   OI000ilOol oI000ilOolI000OiO = iOIOillI000II != null ? o0i1lI0o1io.I000OiO(iOIOillI000II.I00000oIO()) : null;
/* 119 */                   if (oI000ilOolI000OiO == null) {
/* 135 */                       OOo1oliI oOo1oliI = new OOo1oliI(((IOIO10iOi1) l0O00Ol.I00000oIO(oOo1O1i.I00000oIO)).I001l0I00());
/* 144 */                       IIOOoll iIOOoll = (IIOOoll) ((O1OIll00i) i0l1OOl1l10.I0001Ioi1lo).I00iiI;
/* 146 */                       if (iIOOoll == null) {
/* 192 */                           O0000Ioio00.I000OOo1O("resolver");
/* 195 */                           throw null;
                                }
/* 148 */                       oI000ilOolI000OiO = iIOOoll.I00Ol1ll1(oOo1oliI);
/* 152 */                       if (oI000ilOolI000OiO == null) {
/* 185 */                           oI000ilOolI000OiO = ilOOOOloO.I0000Il00O((OI0011) i0l1OOl1l10.I000O01llI0, new IOIOill(ill0IOI0010o.I00000oOI(), ill0IOI0010o.I00000oIO.I000II()), (o01l1ioOo0) ((IiOlOOll) i0l1OOl1l10.I0000O).I0000Il00O().I000iOII);
                                }
                            }
/* 196 */                   return oI000ilOolI000OiO.I00Ol10();
                        default:
/* 11 */                    ArrayList arrayListI00000oOI = o0l1OOlI0OiO.I00000oOI.I00000oOI();
/* 17 */                    ArrayList arrayList = new ArrayList();
/* 20 */                    Iterator it = arrayListI00000oOI.iterator();
/* 28 */                    while (it.hasNext()) {
/* 34 */                        OOo1OIIIO oOo1OIIIO = (OOo1OIIIO) it.next();
/* 36 */                        OI1Iio0ii1 oI1Iio0ii1 = oOo1OIIIO.I00000oIO;
/* 38 */                        if (oI1Iio0ii1 == null) {
/* 40 */                            oI1Iio0ii1 = O0I01I.I00000oOI;
                                }
/* 42 */                        IOo0i1 iOo0i1I00000oIO = o0l1OOlI0OiO.I00000oIO(oOo1OIIIO);
/* 54 */                        OIoi0IIoi oIoi0IIoi = iOo0i1I00000oIO != null ? new OIoi0IIoi(oI1Iio0ii1, iOo0i1I00000oIO) : null;
/* 55 */                        if (oIoi0IIoi != null) {
/* 57 */                            arrayList.add(oIoi0IIoi);
                                }
                            }
/* 61 */                    return O1Oii0O0loo.I000OiO(arrayList);
                    }
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class l101loO1o0oO {
                /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-709502251);
/* 22 */            if (iloI0lOlll1.I00OIl(i & 1, (i & 3) != 2)) {
/* 24 */                OOiIOoiOO oOiIOoiOO = OiIl0oI.I00000oIO;
/* 30 */                Object obj = (OiIiol10) iloI0lOlll1.I000iOII(oOiIOoiOO);
/* 32 */                Object objI00000oIO = lO0OOOO0.I00000oIO(iloI0lOlll1);
/* 36 */                Object[] objArr = {obj};
/* 44 */                IiI01lI iiI01lI = new IiI01lI(13);
/* 51 */                IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(23);
/* 54 */                iiioilIl1Il.I00iiI = obj;
/* 56 */                iiioilIl1Il.I00iiO = objI00000oIO;
/* 58 */                VarHandle.storeStoreFence();
/* 61 */                IoloOio0I ioloOio0II00000oIO = OiIoloOl0.I00000oIO(iiI01lI, iiioilIl1Il);
/* 73 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj) | iloI0lOlll1.I000OOo1O(objI00000oIO);
/* 74 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 78 */                if (!zI000OOo1O) {
                            Object obj2 = objI00O0i0ii;
/* 82 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 88 */                        IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(28);
/* 91 */                        iO1Io1IOOOIi.I00iiI = obj;
/* 93 */                        iO1Io1IOOOIi.I00iiO = objI00000oIO;
/* 95 */                        VarHandle.storeStoreFence();
/* 98 */                        iloI0lOlll1.I00iio(iO1Io1IOOOIi);
                                obj2 = iO1Io1IOOOIi;
                            }
/* 107 */                   Object obj3 = (O0o0oil1l1o) lIo1lO.I0000Il00O(objArr, ioloOio0II00000oIO, (IllOOo00lI) obj2, iloI0lOlll1, 0);
/* 109 */                   OOiIo1lll oOiIo1lllI00000oIO = oOiIOoiOO.I00000oIO(obj3);
/* 117 */                   Ilo0lI ilo0lI = new Ilo0lI(14);
/* 120 */                   ilo0lI.I00iiI = iOii1l;
/* 122 */                   ilo0lI.I00iiO = obj3;
/* 124 */                   VarHandle.storeStoreFence();
/* 136 */                   iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(-412824043, ilo0lI, iloI0lOlll1), iloI0lOlll1, 56);
                        }
                    } else {
/* 140 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 143 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 147 */           if (oOloioIlI001IO000 != null) {
/* 152 */               IoOo1I0o1 ioOo1I0o1 = new IoOo1I0o1(5);
/* 155 */               ioOo1I0o1.I00iiI = iOii1l;
/* 157 */               VarHandle.storeStoreFence();
/* 160 */               oOloioIlI001IO000.I0000O = ioOo1I0o1;
                    }
                }
            }

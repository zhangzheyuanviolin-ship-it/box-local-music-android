            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public abstract class ill0illOI1i {
                /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(OI1o1o1iO1l oI1o1o1iO1l, O1ol100o0O o1ol100o0O, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(619396692);
/* 20 */            int i3 = i | 2 | (iloI0lOlll1.I000OOo1O(o1ol100o0O) ? 32 : 16);
/* 38 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 40 */                iloI0lOlll1.I00Ol00();
/* 44 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 68 */                    Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 70 */                    Object[] objArrCopyOf = Arrays.copyOf(new OII1Il1IlOO[0], 0);
/* 78 */                    IiI01lI iiI01lI = new IiI01lI(19);
/* 85 */                    O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(24);
/* 88 */                    o0l0IlolloIO.I00iiI = context;
/* 90 */                    VarHandle.storeStoreFence();
/* 93 */                    IoloOio0I ioloOio0II00000oIO = OiIoloOl0.I00000oIO(iiI01lI, o0l0IlolloIO);
/* 97 */                    boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(context);
/* 101 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 105 */                   if (!zI000OOo1O) {
                                Object obj = objI00O0i0ii;
/* 109 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 115 */                           I000OOo1O i000OOo1O = new I000OOo1O(9);
/* 118 */                           i000OOo1O.I00iiI = context;
/* 120 */                           VarHandle.storeStoreFence();
/* 123 */                           iloI0lOlll1.I00iio(i000OOo1O);
                                    obj = i000OOo1O;
                                }
/* 131 */                       iloI0lOlll12 = iloI0lOlll1;
/* 136 */                       oI1o1o1iO1l = (OI1o1o1iO1l) lIo1lO.I0000O(objArrCopyOf, ioloOio0II00000oIO, (IllOOo00lI) obj, iloI0lOlll12, 0, 4);
/* 138 */                       i2 = i3 & (-15);
                            }
                        } else {
/* 53 */                    iloI0lOlll1.I00OilO00Il();
/* 56 */                    i2 = i3 & (-15);
/* 58 */                    iloI0lOlll12 = iloI0lOlll1;
                        }
/* 140 */               iloI0lOlll12.I0010o();
/* 148 */               Ilo1IoOo.I00000oOI(oI1o1o1iO1l, null, o1ol100o0O, iloI0lOlll12, (i2 << 3) & 896);
                    } else {
/* 152 */               iloI0lOlll12 = iloI0lOlll1;
/* 153 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 156 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 160 */           if (oOloioIlI001IO000 != null) {
/* 164 */               Ilo0lI ilo0lI = new Ilo0lI(0);
/* 167 */               ilo0lI.I00iiI = oI1o1o1iO1l;
/* 169 */               ilo0lI.I00iiO = o1ol100o0O;
/* 171 */               VarHandle.storeStoreFence();
/* 174 */               oOloioIlI001IO000.I0000O = ilo0lI;
                    }
                }
            }

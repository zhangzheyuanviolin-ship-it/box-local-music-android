            package p000;

            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iioii1oiO01i {
                /* JADX WARN: Removed duplicated region for block: B:200:0x04a8  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x04d6  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x04e0  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x0503  */
                /* JADX WARN: Removed duplicated region for block: B:212:0x050c  */
                /* JADX WARN: Removed duplicated region for block: B:217:0x0527 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:221:0x052e  */
                /* JADX WARN: Removed duplicated region for block: B:224:0x0545  */
                /* JADX WARN: Removed duplicated region for block: B:227:0x0550  */
                /* JADX WARN: Removed duplicated region for block: B:228:0x055b  */
                /* JADX WARN: Removed duplicated region for block: B:231:0x0567  */
                /* JADX WARN: Removed duplicated region for block: B:237:0x057a  */
                /* JADX WARN: Removed duplicated region for block: B:240:0x0589  */
                /* JADX WARN: Removed duplicated region for block: B:243:0x0598  */
                /* JADX WARN: Removed duplicated region for block: B:246:0x05a7  */
                /* JADX WARN: Removed duplicated region for block: B:247:0x0632  */
                /* JADX WARN: Removed duplicated region for block: B:250:0x06b3  */
                /* JADX WARN: Removed duplicated region for block: B:251:0x06b5  */
                /* JADX WARN: Removed duplicated region for block: B:254:0x06c2  */
                /* JADX WARN: Removed duplicated region for block: B:255:0x06c4  */
                /* JADX WARN: Removed duplicated region for block: B:258:0x06d8  */
                /* JADX WARN: Removed duplicated region for block: B:259:0x06db  */
                /* JADX WARN: Removed duplicated region for block: B:262:0x06e9  */
                /* JADX WARN: Removed duplicated region for block: B:266:0x06f5  */
                /* JADX WARN: Removed duplicated region for block: B:269:0x06ff A[PHI: r14 r36
                  0x06ff: PHI (r14v42 IoiiO1O1) = (r14v10 IoiiO1O1), (r14v43 IoiiO1O1) binds: [B:268:0x06fd, B:265:0x06f2] A[DONT_GENERATE, DONT_INLINE]
                  0x06ff: PHI (r36v3 int) = (r36v1 int), (r36v4 int) binds: [B:268:0x06fd, B:265:0x06f2] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:270:0x0701  */
                /* JADX WARN: Removed duplicated region for block: B:273:0x071e A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:276:0x0724  */
                /* JADX WARN: Removed duplicated region for block: B:282:0x0764  */
                /* JADX WARN: Removed duplicated region for block: B:289:0x0795  */
                /* JADX WARN: Removed duplicated region for block: B:292:0x079d  */
                /* JADX WARN: Removed duplicated region for block: B:295:0x07a6 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:298:0x07ac  */
                /* JADX WARN: Removed duplicated region for block: B:301:0x0804  */
                /* JADX WARN: Removed duplicated region for block: B:304:0x0859  */
                /* JADX WARN: Removed duplicated region for block: B:305:0x085b  */
                /* JADX WARN: Removed duplicated region for block: B:308:0x086e  */
                /* JADX WARN: Removed duplicated region for block: B:309:0x0870  */
                /* JADX WARN: Removed duplicated region for block: B:313:0x087f  */
                /* JADX WARN: Removed duplicated region for block: B:325:0x08f7  */
                /* JADX WARN: Removed duplicated region for block: B:327:0x08fa  */
                /* JADX WARN: Removed duplicated region for block: B:328:0x0913  */
                /* JADX WARN: Removed duplicated region for block: B:332:0x0924  */
                /* JADX WARN: Removed duplicated region for block: B:335:0x0948  */
                /* JADX WARN: Removed duplicated region for block: B:336:0x094a  */
                /* JADX WARN: Removed duplicated region for block: B:347:0x096a A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:348:0x096c  */
                /* JADX WARN: Removed duplicated region for block: B:351:0x098a  */
                /* JADX WARN: Removed duplicated region for block: B:352:0x098c  */
                /* JADX WARN: Removed duplicated region for block: B:358:0x09c1  */
                /* JADX WARN: Removed duplicated region for block: B:363:0x09e6  */
                /* JADX WARN: Removed duplicated region for block: B:366:0x09fa  */
                /* JADX WARN: Removed duplicated region for block: B:370:0x0a1d  */
                /* JADX WARN: Removed duplicated region for block: B:373:0x0a41  */
                /* JADX WARN: Removed duplicated region for block: B:377:0x0a57  */
                /* JADX WARN: Removed duplicated region for block: B:388:0x0b2a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Oo0OI01Il oo0OI01Il, Function1 function1, O1ooiI111i o1ooiI111i, Oo0lloOiiIOI oo0lloOiiIOI, OoooioIi0I ooooioIi0I, Function1 function12, OI0lOIiOIOOo oI0lOIiOIOOo, III11l1I iII11l1I, boolean z, int i, int i2, IoiiO1O1 ioiiO1O1, O0OO00i o0OO00i, boolean z2, boolean z3, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i3, int i4) {
                    int i5;
                    int i6;
                    O1ooiI111i o1ooiI111i2;
                    Function1 function13;
                    boolean z4;
                    Oo0OI01Il oo0OI01Il2;
                    Oo0lloOiiIOI oo0lloOiiIOI2;
                    OoooioIi0I ooooioIi0I2;
                    IloI0lOlll1 iloI0lOlll12;
                    IOO0o0I1l iOO0o0I1l;
                    I1111OO10i i1111OO10i;
                    Ili1lII ili1lII;
                    Oo0Oo0 oo0Oo0;
                    Ili1iIl ili1iIl;
                    i00Ii11100lo i00ii11100lo;
                    Oo0I110i oo0I110i;
                    boolean z5;
                    int i7;
                    int i8;
                    Oo0lloOiiIOI oo0lloOiiIOI3;
                    IliO0o11i01 iliO0o11i01;
                    OIOlOI oIOlOI;
                    IiIooOOOI iiIooOOOI;
                    O111ol0lilll o111ol0lilll;
                    IiIooOOOI iiIooOOOI2;
                    Oo0lI00l oo0lI00l;
                    String str;
                    I1111OO10i i1111OO10i2;
                    boolean z6;
                    boolean z7;
                    Oo0OI01Il oo0OI01IlI00000oIO;
                    Object objI00O0i0ii;
                    IOO0o0I1l iOO0o0I1l2;
                    IloI0lOlll1 iloI0lOlll13;
                    Object obj;
                    OoiI0IO0oiI ooiI0IO0oiI;
                    Object objI00O0i0ii2;
                    Object objI00O0i0ii3;
                    Object objI00O0i0ii4;
                    IiIooOOOI iiIooOOOI3;
                    long j;
                    Object obj2;
                    int i9;
                    IoiiO1O1 ioiiO1O12;
                    int i10;
                    boolean zI000OOo1O;
                    boolean z8;
                    Object obj3;
                    OI10i0Il oI10i0IlI00000oOI;
                    OI10i0Il oI10i0Il;
                    boolean z9;
                    boolean z10;
                    Object objI00O0i0ii5;
                    O0oIlOolIO o0oIlOolIO;
                    i00Ii11100lo i00ii11100lo2;
                    boolean zI000OOo1O2;
                    Object obj4;
                    O1ooiI111i o1ooiI111iI00000oIO;
                    boolean zI000OOo1O3;
                    Object obj5;
                    boolean zI000OOo1O4;
                    Object obj6;
                    boolean z11;
                    boolean zBooleanValue;
                    boolean zI000O01llI0;
                    Object obj7;
                    O1ooiI111i o1ooiI111iI0000O;
                    Object olI00IIlOO;
                    long j2;
                    long jI00000oOI;
                    boolean zI000OOo1O5;
                    Object obj8;
                    boolean z12;
                    O1ooiI111i o1ooiI111i3;
                    OI0lOIiOIOOo oI0lOIiOIOOo2 = oI0lOIiOIOOo;
                    boolean z13 = z;
                    int i11 = i;
                    IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 1 */             iloI0lOlll14.I00i0O(31062401);
                    if ((i3 & 6) == 0) {
                        i5 = i3 | (iloI0lOlll14.I000II(oo0OI01Il) ? 4 : 2);
                    } else {
                        i5 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i5 |= iloI0lOlll14.I000OOo1O(function1) ? 32 : 16;
                    }
                    int i12 = i3 & 384;
                    int i13 = Barcode.FORMAT_ITF;
                    if (i12 == 0) {
                        i5 |= iloI0lOlll14.I000II(o1ooiI111i) ? 256 : 128;
                    }
                    int i14 = i3 & 3072;
                    int i15 = Barcode.FORMAT_UPC_E;
                    if (i14 == 0) {
                        i5 |= iloI0lOlll14.I000II(oo0lloOiiIOI) ? Barcode.FORMAT_PDF417 : 1024;
                    }
                    if ((i3 & 24576) == 0) {
                        i5 |= iloI0lOlll14.I000II(ooooioIi0I) ? 16384 : 8192;
                    }
                    if ((i3 & 196608) == 0) {
                        i5 |= iloI0lOlll14.I000OOo1O(function12) ? 131072 : 65536;
                    }
                    if ((i3 & 1572864) == 0) {
                        i5 |= iloI0lOlll14.I000II(oI0lOIiOIOOo2) ? 1048576 : 524288;
                    }
                    if ((i3 & 12582912) == 0) {
                        i5 |= iloI0lOlll14.I000II(iII11l1I) ? 8388608 : 4194304;
                    }
                    if ((i3 & 100663296) == 0) {
                        i5 |= iloI0lOlll14.I000O01llI0(z13) ? 67108864 : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        i5 |= iloI0lOlll14.I0000oI00(i11) ? 536870912 : 268435456;
                    }
                    if ((i4 & 6) == 0) {
                        i6 = i4 | (iloI0lOlll14.I0000oI00(i2) ? 4 : 2);
                    } else {
                        i6 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        i6 |= iloI0lOlll14.I000II(ioiiO1O1) ? 32 : 16;
                    }
                    if ((i4 & 384) == 0) {
                        if (iloI0lOlll14.I000II(o0OO00i)) {
                            i13 = 256;
                        }
                        i6 |= i13;
                    }
                    if ((i4 & 3072) == 0) {
                        if (iloI0lOlll14.I000O01llI0(z2)) {
                            i15 = Barcode.FORMAT_PDF417;
                        }
                        i6 |= i15;
                    }
                    if ((i4 & 24576) == 0) {
                        i6 |= iloI0lOlll14.I000O01llI0(z3) ? 16384 : 8192;
                    }
                    if ((i4 & 196608) == 0) {
                        i6 |= iloI0lOlll14.I000OOo1O(iOii1l) ? 131072 : 65536;
                    }
                    int i16 = i6 | 1572864;
                    if (iloI0lOlll14.I00OIl(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i16) == 599186) ? false : true)) {
                        iloI0lOlll14.I00Ol00();
                        if ((i3 & 1) != 0 && !iloI0lOlll14.I001lloI()) {
/* 2 */                     iloI0lOlll14.I00OilO00Il();
                        }
                        iloI0lOlll14.I0010o();
/* 3 */                 Object objI00O0i0ii6 = iloI0lOlll14.I00O0i0ii();
/* 4 */                 IOO0o0I1l iOO0o0I1l3 = IOl11li.I00000oIO;
                        Object obj9 = objI00O0i0ii6;
                        if (objI00O0i0ii6 == iOO0o0I1l3) {
/* 5 */                     Ili1lII ili1lII2 = new Ili1lII();
/* 6 */                     iloI0lOlll14.I00iio(ili1lII2);
                            obj9 = ili1lII2;
                        }
/* 7 */                 Ili1lII ili1lII3 = (Ili1lII) obj9;
/* 8 */                 Object objI00O0i0ii7 = iloI0lOlll14.I00O0i0ii();
                        Object obj10 = objI00O0i0ii7;
                        if (objI00O0i0ii7 == iOO0o0I1l3) {
/* 9 */                     O0oIi0i o0oIi0i = O0oIi1.I00000oIO;
/* 11 */                    I0oOiiOi0l i0oOiiOi0l = new I0oOiiOi0l();
/* 12 */                    iloI0lOlll14.I00iio(i0oOiiOi0l);
                            obj10 = i0oOiiOi0l;
                        }
/* 13 */                I0oOiiOi0l i0oOiiOi0l2 = (I0oOiiOi0l) obj10;
/* 14 */                Object objI00O0i0ii8 = iloI0lOlll14.I00O0i0ii();
                        Object obj11 = objI00O0i0ii8;
                        if (objI00O0i0ii8 == iOO0o0I1l3) {
/* 15 */                    Oo0Oo0 oo0Oo02 = new Oo0Oo0(i0oOiiOi0l2);
/* 16 */                    iloI0lOlll14.I00iio(oo0Oo02);
                            obj11 = oo0Oo02;
                        }
/* 17 */                Oo0Oo0 oo0Oo03 = (Oo0Oo0) obj11;
/* 20 */                IiIooOOOI iiIooOOOI4 = (IiIooOOOI) iloI0lOlll14.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 23 */                IliO0o11i01 iliO0o11i012 = (IliO0o11i01) iloI0lOlll14.I000iOII(IOlO0o100i1i.I000iOII);
/* 26 */                long j3 = ((Oo0lOii10o10) iloI0lOlll14.I000iOII(Oo0lOio.I00000oIO)).I00000oOI;
/* 29 */                Ili1iIl ili1iIl2 = (Ili1iIl) iloI0lOlll14.I000iOII(IOlO0o100i1i.I000OOo1O);
/* 32 */                i00Ii11100lo i00ii11100lo3 = (i00Ii11100lo) iloI0lOlll14.I000iOII(IOlO0o100i1i.I001IIilI0O);
/* 35 */                Ol1oolo ol1oolo = (Ol1oolo) iloI0lOlll14.I000iOII(IOlO0o100i1i.I00100o1O0lo);
/* 37 */                OIilII oIilII = (i11 == 1 && !z13 && ioiiO1O1.I00000oIO) ? OIilII.I00iiI : OIilII.I00iOIl;
/* 38 */                iloI0lOlll14.I00i01iIIliI(-213744626);
                        Object[] objArr = {oIilII};
/* 39 */                IoloOio0I ioloOio0I = Oo0I110i.I000II;
/* 40 */                boolean zI0000oI00 = iloI0lOlll14.I0000oI00(oIilII.ordinal());
/* 41 */                Object objI00O0i0ii9 = iloI0lOlll14.I00O0i0ii();
                        int i17 = 25;
                        Object obj12 = objI00O0i0ii9;
                        if (zI0000oI00 || objI00O0i0ii9 == iOO0o0I1l3) {
/* 42 */                    I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(i17);
                            i0OIOO00l0O.I00iiI = oIilII;
                            VarHandle.storeStoreFence();
/* 43 */                    iloI0lOlll14.I00iio(i0OIOO00l0O);
                            obj12 = i0OIOO00l0O;
                        }
/* 44 */                Oo0I110i oo0I110i2 = (Oo0I110i) lIo1lO.I0000Il00O(objArr, ioloOio0I, (IllOOo00lI) obj12, iloI0lOlll14, 0);
/* 45 */                iloI0lOlll14.I0010I0i(false);
/* 47 */                if (((OIilII) oo0I110i2.I0001Ioi1lo.getValue()) != oIilII) {
/* 52 */                    throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(oIilII == OIilII.I00iOIl ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
                        }
                        int i18 = i5 & 14;
                        boolean z14 = ((i5 & 57344) == 16384) | (i18 == 4);
/* 53 */                Object objI00O0i0ii10 = iloI0lOlll14.I00O0i0ii();
                        if (z14 || objI00O0i0ii10 == iOO0o0I1l3) {
/* 55 */                    OoI0llll ooI0llllI00000oIO = Oolo0ioool.I00000oIO(ooooioIi0I, oo0OI01Il.I00000oIO);
                            OIOlOI oIOlOI2 = ooI0llllI00000oIO.I00000oOI;
/* 56 */                    Oo0lI00l oo0lI00l2 = oo0OI01Il.I0000Il00O;
                            if (oo0lI00l2 != null) {
/* 57 */                        long j4 = oo0lI00l2.I00000oIO;
/* 58 */                        int i19 = Oo0lI00l.I0000Il00O;
                                int iI000o00OoI0I = oIOlOI2.I000o00OoI0I((int) (j4 >> 32));
/* 59 */                        int iI000o00OoI0I2 = oIOlOI2.I000o00OoI0I((int) (j4 & 4294967295L));
/* 60 */                        int iMin = Math.min(iI000o00OoI0I, iI000o00OoI0I2);
/* 61 */                        int iMax = Math.max(iI000o00OoI0I, iI000o00OoI0I2);
/* 64 */                        I11110OIl i11110OIl = new I11110OIl(ooI0llllI00000oIO.I00000oIO);
/* 66 */                        i11110OIl.I00000oIO(new OlIIi1oIIOlo(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, OlooIOI0O.I0000Il00O, null, 61439), iMin, iMax);
/* 68 */                        objI00O0i0ii10 = new OoI0llll(i11110OIl.I000OiO(), oIOlOI2);
                            } else {
                                objI00O0i0ii10 = ooI0llllI00000oIO;
                            }
/* 69 */                    iloI0lOlll14.I00iio(objI00O0i0ii10);
                        }
/* 70 */                OoI0llll ooI0llll = (OoI0llll) objI00O0i0ii10;
/* 71 */                I1111OO10i i1111OO10i3 = ooI0llll.I00000oIO;
/* 72 */                OIOlOI oIOlOI3 = ooI0llll.I00000oOI;
/* 73 */                OOloioIl oOloioIlI001lllioOl = iloI0lOlll14.I001lllioOl();
                        if (oOloioIlI001lllioOl == null) {
/* 424 */                   I000II.I001IO000("no recompose scope found");
                            return;
                        }
                        oOloioIlI001lllioOl.I00000oOI |= 1;
/* 76 */                boolean zI000II = iloI0lOlll14.I000II(ol1oolo);
/* 77 */                Object objI00O0i0ii11 = iloI0lOlll14.I00O0i0ii();
/* 78 */                Il01100l il01100l = Il01100l.I00iOIl;
                        if (zI000II || objI00O0i0ii11 == iOO0o0I1l3) {
                            iOO0o0I1l = iOO0o0I1l3;
                            i1111OO10i = i1111OO10i3;
                            ili1lII = ili1lII3;
                            oo0Oo0 = oo0Oo03;
                            ili1iIl = ili1iIl2;
                            i00ii11100lo = i00ii11100lo3;
                            oo0I110i = oo0I110i2;
                            z5 = z;
                            i7 = i16;
                            i8 = i18;
                            oo0lloOiiIOI3 = oo0lloOiiIOI;
/* 81 */                    O111ol0lilll o111ol0lilll2 = new O111ol0lilll(i1111OO10i, iiIooOOOI4, iliO0o11i012, oo0lloOiiIOI3, il01100l, z5);
/* 82 */                    O0oIlOolIO o0oIlOolIO2 = new O0oIlOolIO();
/* 83 */                    o0oIlOolIO2.I00000oIO = o111ol0lilll2;
/* 84 */                    o0oIlOolIO2.I00000oOI = oOloioIlI001lllioOl;
/* 85 */                    o0oIlOolIO2.I0000Il00O = ol1oolo;
/* 87 */                    I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(10);
/* 89 */                    I1111OO10i i1111OO10i4 = I111IiO.I00000oIO;
                            iliO0o11i01 = iliO0o11i012;
/* 90 */                    long j5 = Oo0lI00l.I00000oOI;
                            oIOlOI = oIOlOI3;
/* 91 */                    Oo0OI01Il oo0OI01Il3 = new Oo0OI01Il(i1111OO10i4, j5, (Oo0lI00l) null);
/* 92 */                    i1I0i0Ilo1Oi.I00iiI = oo0OI01Il3;
/* 96 */                    i1I0i0Ilo1Oi.I00iiO = new Oo0olliOi1(i1111OO10i4, oo0OI01Il3.I00000oOI);
/* 97 */                    o0oIlOolIO2.I0000O = i1I0i0Ilo1Oi;
/* 98 */                    Boolean bool = Boolean.FALSE;
/* 100 */                   o0oIlOolIO2.I0001Ioi1lo = lOO00IiI0li.I00000oIO(bool);
/* 103 */                   o0oIlOolIO2.I000II = lOO00IiI0li.I00000oIO(Iil1010O.I00000oIO(0.0f));
/* 105 */                   o0oIlOolIO2.I000OOo1O = lOO00IiI0li.I00000oIO(null);
/* 108 */                   o0oIlOolIO2.I000iOII = lOO00IiI0li.I00000oIO(Io11Oo11oO.I00iOIl);
/* 110 */                   o0oIlOolIO2.I000l1 = lOO00IiI0li.I00000oIO(bool);
/* 112 */                   o0oIlOolIO2.I000lI = lOO00IiI0li.I00000oIO(bool);
/* 114 */                   o0oIlOolIO2.I000o00OoI0I = lOO00IiI0li.I00000oIO(bool);
/* 116 */                   o0oIlOolIO2.I000oI1ioi = lOO00IiI0li.I00000oIO(bool);
/* 117 */                   o0oIlOolIO2.I00100l0 = true;
/* 120 */                   o0oIlOolIO2.I00100o1O0lo = lOO00IiI0li.I00000oIO(Boolean.TRUE);
/* 122 */                   O0OO00O0O0 o0oo00o0o0 = new O0OO00O0O0();
                            o0oo00o0o0.I00000oIO = ol1oolo;
/* 123 */                   VarHandle.storeStoreFence();
                            o0oIlOolIO2.I0010I0i = o0oo00o0o0;
/* 125 */                   o0oIlOolIO2.I0010o = lOO00IiI0li.I00000oIO(bool);
/* 127 */                   o0oIlOolIO2.I00111O = lOO00IiI0li.I00000oIO(bool);
                            int i20 = 2;
/* 128 */                   o0oIlOolIO2.I001IIilI0O = new O0o01OIl(i20);
/* 129 */                   IOooI1o iOooI1o = new IOooI1o(1);
                            iOooI1o.I00iiI = o0oIlOolIO2;
                            VarHandle.storeStoreFence();
                            o0oIlOolIO2.I001IO000 = iOooI1o;
/* 130 */                   IOooI1o iOooI1o2 = new IOooI1o(i20);
                            iOooI1o2.I00iiI = o0oIlOolIO2;
                            VarHandle.storeStoreFence();
                            o0oIlOolIO2.I001i1O0Ol = iOooI1o2;
/* 131 */                   IOooI1o iOooI1o3 = new IOooI1o(3);
                            iOooI1o3.I00iiI = o0oIlOolIO2;
                            VarHandle.storeStoreFence();
                            o0oIlOolIO2.I001i1lo1io = iOooI1o3;
/* 132 */                   o0oIlOolIO2.I001iOo1i0O = iOIlil0Il1i.I00000oIO();
/* 134 */                   o0oIlOolIO2.I001l0I00 = IOOiio0i.I000o00OoI0I;
/* 137 */                   o0oIlOolIO2.I001lIiIIo1O = lOO00IiI0li.I00000oIO(Oo0lI00l.I00000oIO(j5));
/* 140 */                   o0oIlOolIO2.I001lllioOl = lOO00IiI0li.I00000oIO(Oo0lI00l.I00000oIO(j5));
/* 141 */                   VarHandle.storeStoreFence();
/* 142 */                   iloI0lOlll1.I00iio(o0oIlOolIO2);
                            objI00O0i0ii11 = o0oIlOolIO2;
                        } else {
                            oo0lloOiiIOI3 = oo0lloOiiIOI;
                            z5 = z;
                            iOO0o0I1l = iOO0o0I1l3;
                            i1111OO10i = i1111OO10i3;
                            ili1lII = ili1lII3;
                            oo0Oo0 = oo0Oo03;
                            iliO0o11i01 = iliO0o11i012;
                            ili1iIl = ili1iIl2;
                            i00ii11100lo = i00ii11100lo3;
                            oo0I110i = oo0I110i2;
                            i7 = i16;
                            oIOlOI = oIOlOI3;
                            i8 = i18;
                        }
/* 143 */               O0oIlOolIO o0oIlOolIO3 = (O0oIlOolIO) objI00O0i0ii11;
/* 144 */               I1111OO10i i1111OO10i5 = oo0OI01Il.I00000oIO;
                        long j6 = oo0OI01Il.I00000oOI;
/* 145 */               o0oIlOolIO3.I001IIilI0O = function1;
                        IOooI1o iOooI1o4 = o0oIlOolIO3.I001IO000;
/* 146 */               o0oIlOolIO3.I001l0I00 = j3;
/* 147 */               O0OO00O0O0 o0oo00o0o02 = o0oIlOolIO3.I0010I0i;
/* 148 */               o0oo00o0o02.I00000oOI = o0OO00i;
                        Ili1iIl ili1iIl3 = ili1iIl;
/* 149 */               o0oo00o0o02.I0000Il00O = ili1iIl3;
/* 150 */               o0oIlOolIO3.I000OiO = i1111OO10i5;
/* 151 */               O111ol0lilll o111ol0lilll3 = o0oIlOolIO3.I00000oIO;
/* 153 */               if (O0000Ioio00.I0000O((I1111OO10i) o111ol0lilll3.I00iiI, i1111OO10i) && O0000Ioio00.I0000O((Oo0lloOiiIOI) o111ol0lilll3.I00iiO, oo0lloOiiIOI3) && o111ol0lilll3.I00iOIl == z5) {
                            iiIooOOOI = iiIooOOOI4;
/* 158 */                   if (O0000Ioio00.I0000O((IiIooOOOI) o111ol0lilll3.I00iio, iiIooOOOI) && O0000Ioio00.I0000O((List) o111ol0lilll3.I00ilO0, il01100l)) {
/* 161 */                       IliO0o11i01 iliO0o11i013 = (IliO0o11i01) o111ol0lilll3.I00ilI0I1;
                                IliO0o11i01 iliO0o11i014 = iliO0o11i01;
                                if (iliO0o11i013 != iliO0o11i014) {
                                    iliO0o11i01 = iliO0o11i014;
                                } else {
                                    iiIooOOOI2 = iiIooOOOI;
                                    o111ol0lilll = o111ol0lilll3;
/* 164 */                           if (o0oIlOolIO3.I00000oIO != o111ol0lilll) {
                                        o0oIlOolIO3.I00100l0 = true;
                                    }
/* 165 */                           o0oIlOolIO3.I00000oIO = o111ol0lilll;
/* 166 */                           I1I0i0Ilo1Oi i1I0i0Ilo1Oi2 = o0oIlOolIO3.I0000O;
/* 167 */                           Oo0i01111o oo0i01111o = o0oIlOolIO3.I0000oI00;
/* 168 */                           i1I0i0Ilo1Oi2.getClass();
/* 169 */                           oo0lI00l = oo0OI01Il.I0000Il00O;
/* 170 */                           boolean zI0000O = O0000Ioio00.I0000O(oo0lI00l, ((Oo0olliOi1) i1I0i0Ilo1Oi2.I00iiO).I0000Il00O());
/* 173 */                           str = ((Oo0OI01Il) i1I0i0Ilo1Oi2.I00iiI).I00000oIO.I00iiI;
/* 174 */                           i1111OO10i2 = oo0OI01Il.I00000oIO;
/* 176 */                           if (O0000Ioio00.I0000O(str, i1111OO10i2.I00iiI)) {
/* 179 */                               i1I0i0Ilo1Oi2.I00iiO = new Oo0olliOi1(i1111OO10i2, j6);
                                        z6 = true;
                                    } else if (Oo0lI00l.I0000Il00O(((Oo0OI01Il) i1I0i0Ilo1Oi2.I00iiI).I00000oOI, j6)) {
                                        z6 = false;
                                    } else {
/* 183 */                               ((Oo0olliOi1) i1I0i0Ilo1Oi2.I00iiO).I0001Ioi1lo(Oo0lI00l.I000II(j6), Oo0lI00l.I0001Ioi1lo(j6));
                                        z6 = false;
                                        z7 = true;
                                        if (oo0lI00l == null) {
/* 184 */                                   Oo0olliOi1 oo0olliOi1 = (Oo0olliOi1) i1I0i0Ilo1Oi2.I00iiO;
/* 185 */                                   oo0olliOi1.I0000O = -1;
/* 186 */                                   oo0olliOi1.I0000oI00 = -1;
                                        } else {
/* 187 */                                   long j7 = oo0lI00l.I00000oIO;
/* 188 */                                   if (!Oo0lI00l.I0000O(j7)) {
/* 189 */                                       ((Oo0olliOi1) i1I0i0Ilo1Oi2.I00iiO).I0000oI00(Oo0lI00l.I000II(j7), Oo0lI00l.I0001Ioi1lo(j7));
                                            }
                                        }
                                        if (z6 || !(z7 || zI0000O)) {
/* 190 */                                   Oo0olliOi1 oo0olliOi12 = (Oo0olliOi1) i1I0i0Ilo1Oi2.I00iiO;
/* 191 */                                   oo0olliOi12.I0000O = -1;
/* 192 */                                   oo0olliOi12.I0000oI00 = -1;
/* 193 */                                   oo0OI01IlI00000oIO = Oo0OI01Il.I00000oIO(oo0OI01Il, null, 0L, 3);
                                        } else {
                                            oo0OI01IlI00000oIO = oo0OI01Il;
                                        }
/* 194 */                               Oo0OI01Il oo0OI01Il4 = (Oo0OI01Il) i1I0i0Ilo1Oi2.I00iiI;
/* 195 */                               i1I0i0Ilo1Oi2.I00iiI = oo0OI01IlI00000oIO;
                                        if (oo0i01111o != null) {
/* 196 */                                   oo0i01111o.I00000oIO(oo0OI01Il4, oo0OI01IlI00000oIO);
                                        }
/* 197 */                               objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                        iOO0o0I1l2 = iOO0o0I1l;
                                        if (objI00O0i0ii != iOO0o0I1l2) {
/* 199 */                                   OoiI0IO0oiI ooiI0IO0oiI2 = new OoiI0IO0oiI();
                                            IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 200 */                                   iloI0lOlll15.I00iio(ooiI0IO0oiI2);
                                            obj = ooiI0IO0oiI2;
                                            iloI0lOlll13 = iloI0lOlll15;
                                        } else {
                                            iloI0lOlll13 = iloI0lOlll1;
                                            obj = objI00O0i0ii;
                                        }
/* 201 */                               ooiI0IO0oiI = (OoiI0IO0oiI) obj;
/* 202 */                               long jCurrentTimeMillis = System.currentTimeMillis();
/* 203 */                               if (ooiI0IO0oiI.I0000oI00) {
/* 205 */                                   ooiI0IO0oiI.I0000O = Long.valueOf(jCurrentTimeMillis);
/* 206 */                                   ooiI0IO0oiI.I00000oIO(oo0OI01Il);
/* 207 */                                   objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
                                            Object obj13 = objI00O0i0ii2;
                                            if (objI00O0i0ii2 == iOO0o0I1l2) {
/* 208 */                                       Ii0110 ii0110I000II = iIO0iiOiOl0l.I000II(iloI0lOlll13);
/* 209 */                                       iloI0lOlll13.I00iio(ii0110I000II);
                                                obj13 = ii0110I000II;
                                            }
/* 210 */                                   Ii0110 ii0110 = (Ii0110) obj13;
/* 211 */                                   objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                            Object obj14 = objI00O0i0ii3;
                                            if (objI00O0i0ii3 == iOO0o0I1l2) {
/* 212 */                                       III0Ii iII0IiI00000oIO = i1IlOlo1.I00000oIO();
/* 213 */                                       iloI0lOlll13.I00iio(iII0IiI00000oIO);
                                                obj14 = iII0IiI00000oIO;
                                            }
/* 214 */                                   III0Ii iII0Ii = (III0Ii) obj14;
/* 215 */                                   objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                            if (objI00O0i0ii4 != iOO0o0I1l2) {
/* 217 */                                       Oo0IOoOi01 oo0IOoOi01 = new Oo0IOoOi01();
                                                oo0IOoOi01.I00000oIO = ooiI0IO0oiI;
/* 219 */                                       oo0IOoOi01.I00000oOI = Oolo0ioool.I00000oIO;
/* 220 */                                       oo0IOoOi01.I0000Il00O = new Oo011oIOO1(2);
                                                iiIooOOOI3 = iiIooOOOI2;
                                                j = j6;
/* 223 */                                       oo0IOoOi01.I0000oI00 = lOO00IiI0li.I00000oIO(new Oo0OI01Il(7, 0L, (String) null));
/* 225 */                                       oo0IOoOi01.I0001Ioi1lo = lolIo0.I00l0I0l0lO1;
/* 226 */                                       Boolean bool2 = Boolean.TRUE;
/* 228 */                                       oo0IOoOi01.I000lI = lOO00IiI0li.I00000oIO(bool2);
/* 230 */                                       oo0IOoOi01.I000o00OoI0I = lOO00IiI0li.I00000oIO(bool2);
/* 231 */                                       oo0IOoOi01.I000oI1ioi = 0L;
/* 232 */                                       oo0IOoOi01.I00100o1O0lo = 0L;
/* 234 */                                       oo0IOoOi01.I0010I0i = lOO00IiI0li.I00000oIO(null);
/* 236 */                                       oo0IOoOi01.I0010o = lOO00IiI0li.I00000oIO(null);
/* 237 */                                       oo0IOoOi01.I00111O = -1;
/* 238 */                                       oo0IOoOi01.I001IIilI0O = new Oo0OI01Il(7, 0L, (String) null);
/* 241 */                                       oo0IOoOi01.I001i1lo1io = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 244 */                                       oo0IOoOi01.I001iOo1i0O = new IIlio101Io();
/* 246 */                                       Oo0IOOIl0 oo0IOOIl0 = new Oo0IOOIl0();
/* 247 */                                       oo0IOOIl0.I0000O = oo0IOoOi01;
/* 248 */                                       oo0IOOIl0.I00000oIO = true;
/* 250 */                                       oo0IOOIl0.I0000Il00O = loIOiIO1O1.I00io1l;
/* 251 */                                       VarHandle.storeStoreFence();
                                                oo0IOoOi01.I001l0I00 = oo0IOOIl0;
/* 253 */                                       Oo0IOII oo0IOII = new Oo0IOII();
/* 254 */                                       oo0IOII.I0000Il00O = oo0IOoOi01;
/* 255 */                                       oo0IOII.I00000oIO = true;
/* 256 */                                       VarHandle.storeStoreFence();
                                                oo0IOoOi01.I001lIiIIo1O = oo0IOII;
/* 257 */                                       VarHandle.storeStoreFence();
/* 258 */                                       iloI0lOlll13.I00iio(oo0IOoOi01);
                                                obj2 = oo0IOoOi01;
                                            } else {
                                                iiIooOOOI3 = iiIooOOOI2;
                                                j = j6;
                                                obj2 = objI00O0i0ii4;
                                            }
/* 259 */                                   Oo0IOoOi01 oo0IOoOi012 = (Oo0IOoOi01) obj2;
                                            OIOlOI oIOlOI4 = oIOlOI;
/* 260 */                                   oo0IOoOi012.I00000oOI = oIOlOI4;
/* 261 */                                   oo0IOoOi012.I0001Ioi1lo = ooooioIi0I;
/* 262 */                                   oo0IOoOi012.I0000Il00O = iOooI1o4;
/* 263 */                                   oo0IOoOi012.I0000O = o0oIlOolIO3;
/* 264 */                                   oo0IOoOi012.I0000oI00.setValue(oo0OI01Il);
/* 265 */                                   oo0IOoOi012.I001i1O0Ol = Oo0lI00l.I00000oIO(j);
/* 268 */                                   oo0IOoOi012.I000O01llI0 = (IOO0IOIll) iloI0lOlll13.I000iOII(IOlO0o100i1i.I0001Ioi1lo);
/* 269 */                                   oo0IOoOi012.I000OOo1O = ii0110;
/* 274 */                                   oo0IOoOi012.I000iOII = (Io1I0l) iloI0lOlll13.I000iOII(IOlO0o100i1i.I000l1);
                                            Ili1lII ili1lII4 = ili1lII;
/* 275 */                                   oo0IOoOi012.I000l1 = ili1lII4;
                                            boolean z15 = !z3;
/* 277 */                                   oo0IOoOi012.I000lI.setValue(Boolean.valueOf(z15));
/* 279 */                                   oo0IOoOi012.I000o00OoI0I.setValue(Boolean.valueOf(z2));
/* 280 */                                   iloI0lOlll13.I00i01iIIliI(1966756105);
/* 285 */                                   oo0IOoOi012.I000OiO = OO1O1IIoi.I00000oOI(OiiOIo1.I00iOIl, oo0lloOiiIOI3.I00000oIO.I000iOII, iloI0lOlll13, 6);
/* 286 */                                   iloI0lOlll13.I0010I0i(false);
/* 287 */                                   o0oIlOolIO3.I00000oOI();
                                            int i21 = i7;
                                            int i22 = i21 & 7168;
/* 288 */                                   boolean zI000OOo1O6 = iloI0lOlll13.I000OOo1O(o0oIlOolIO3) | (i22 != 2048);
                                            boolean z16 = (i21 & 57344) != 16384;
                                            Oo0Oo0 oo0Oo04 = oo0Oo0;
                                            boolean zI000OOo1O7 = zI000OOo1O6 | z16 | iloI0lOlll13.I000OOo1O(oo0Oo04);
                                            int i23 = i8;
                                            boolean z17 = zI000OOo1O7 | (i23 != 4);
                                            i9 = (i21 & 112) ^ 48;
                                            if (i9 <= 32) {
                                                ioiiO1O12 = ioiiO1O1;
                                                if (iloI0lOlll13.I000II(ioiiO1O12)) {
                                                    i10 = i23;
                                                }
                                                zI000OOo1O = z17 | z | iloI0lOlll13.I000OOo1O(oIOlOI4) | iloI0lOlll13.I000OOo1O(ii0110) | iloI0lOlll13.I000OOo1O(iII0Ii) | iloI0lOlll13.I000OOo1O(oo0IOoOi012);
/* 289 */                                       Object objI00O0i0ii12 = iloI0lOlll13.I00O0i0ii();
                                                if (zI000OOo1O || objI00O0i0ii12 == iOO0o0I1l2) {
/* 290 */                                           IOooi01 iOooi01 = new IOooi01();
                                                    iOooi01.I00iOIl = o0oIlOolIO3;
                                                    z8 = z2;
                                                    iOooi01.I00iiI = z8;
                                                    iOooi01.I00iiO = z3;
                                                    iOooi01.I00iio = oo0Oo04;
                                                    iOooi01.I00ilI0I1 = oo0OI01Il;
                                                    iOooi01.I00ilO0 = ioiiO1O12;
                                                    iOooi01.I00io1l = oIOlOI4;
                                                    iOooi01.I00ioIO = oo0IOoOi012;
                                                    iOooi01.I00l0I0l0lO1 = ii0110;
                                                    iOooi01.I00l0OO0IO = iII0Ii;
                                                    VarHandle.storeStoreFence();
/* 291 */                                           iloI0lOlll13.I00iio(iOooi01);
                                                    obj3 = iOooi01;
                                                } else {
                                                    z8 = z2;
                                                    obj3 = objI00O0i0ii12;
                                                }
/* 293 */                                       O1ooiI111i o1ooiI111iI00000oIO2 = O1ooIo101ll.I00000oIO;
/* 295 */                                       O1ooiI111i o1ooiI111iI00000oIO3 = iIllIIO1IIO.I00000oIO(iIlilo.I00000oIO(iIll0I00Ol0.I00000oIO(o1ooiI111iI00000oIO2, ili1lII4), (Function1) obj3), z8, oI0lOIiOIOOo);
/* 297 */                                       oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(Boolean.valueOf((z8 || z3) ? false : true), iloI0lOlll13);
/* 298 */                                       boolean zI000II2 = iloI0lOlll13.I000II(oI10i0IlI00000oOI) | iloI0lOlll13.I000OOo1O(o0oIlOolIO3) | iloI0lOlll13.I000OOo1O(oo0Oo04) | iloI0lOlll13.I000OOo1O(oo0IOoOi012);
                                                if (i9 > 32 || !iloI0lOlll13.I000II(ioiiO1O12)) {
                                                    oI10i0Il = oI10i0IlI00000oOI;
                                                    if ((i21 & 48) != 32) {
                                                        z9 = false;
                                                    }
                                                    z10 = zI000II2 | z9;
/* 299 */                                           objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
                                                    if (z10 || objI00O0i0ii5 == iOO0o0I1l2) {
/* 300 */                                               objI00O0i0ii5 = new I000oI1ioi(o0oIlOolIO3, oI10i0Il, oo0Oo04, oo0IOoOi012, ioiiO1O12, null, 5);
                                                        o0oIlOolIO = o0oIlOolIO3;
/* 301 */                                               iloI0lOlll13.I00iio(objI00O0i0ii5);
                                                    } else {
                                                        o0oIlOolIO = o0oIlOolIO3;
                                                    }
/* 302 */                                           iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii5, iloI0lOlll13, OoiIlOl1iI.I00000oIO);
/* 303 */                                           IOooI1o iOooI1o5 = new IOooI1o(4);
                                                    iOooI1o5.I00iiI = o0oIlOolIO;
                                                    VarHandle.storeStoreFence();
/* 305 */                                           I0o1Oi0IO1 i0o1Oi0IO1 = new I0o1Oi0IO1(5);
                                                    i0o1Oi0IO1.I00000oOI = iOooI1o5;
/* 306 */                                           VarHandle.storeStoreFence();
/* 304 */                                           O1ooiI111i o1ooiI111iI00000oIO4 = Oll10I.I00000oIO(o1ooiI111iI00000oIO2, 8675309, i0o1Oi0IO1);
/* 307 */                                           Oo01ooIIoO oo01ooIIoO = new Oo01ooIIoO();
                                                    oo01ooIIoO.I00iOIl = o0oIlOolIO;
                                                    oo01ooIIoO.I00iiI = ili1lII4;
                                                    oo01ooIIoO.I00iiO = z3;
                                                    oo01ooIIoO.I00iio = z8;
                                                    oo01ooIIoO.I00ilI0I1 = oo0IOoOi012;
                                                    oo01ooIIoO.I00ilO0 = oIOlOI4;
                                                    VarHandle.storeStoreFence();
                                                    if (z8) {
/* 308 */                                               I0illI1iI i0illI1iI = new I0illI1iI(19);
                                                        i0illI1iI.I00iiI = oo01ooIIoO;
                                                        i0illI1iI.I00iiO = oI0lOIiOIOOo;
                                                        VarHandle.storeStoreFence();
                                                        o1ooiI111iI00000oIO4 = iilOllOlO1.I00000oIO(o1ooiI111iI00000oIO4, i0illI1iI);
                                                    }
/* 309 */                                           Oo0IOII oo0IOII2 = oo0IOoOi012.I001lIiIIo1O;
/* 310 */                                           Oo0IOOIl0 oo0IOOIl02 = oo0IOoOi012.I001l0I00;
/* 312 */                                           I0o1Oi0IO1 i0o1Oi0IO12 = new I0o1Oi0IO1(10);
                                                    i0o1Oi0IO12.I00000oOI = oo0IOoOi012;
/* 313 */                                           VarHandle.storeStoreFence();
/* 314 */                                           O1ooiI111i o1ooiI111iI0000O2 = o1ooiI111iI00000oIO4.I0000O(new Oll0l0IOO0o(oo0IOII2, oo0IOOIl02, i0o1Oi0IO12, 4));
/* 315 */                                           OO1iIiOoO0.I00000oIO.getClass();
/* 317 */                                           O1ooiI111i o1ooiI111iI00000oIO5 = lI1iiO11I.I00000oIO(o1ooiI111iI0000O2, iO0OI01loOo.I00000oOI);
/* 318 */                                           I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(12);
                                                    i01oIoOI01l.I00iiI = o0oIlOolIO;
                                                    i01oIoOI01l.I00iiO = oo0OI01Il;
                                                    i01oIoOI01l.I00iio = oIOlOI4;
                                                    VarHandle.storeStoreFence();
                                                    O1ooiI111i o1ooiI111iI00000oIO6 = iIO01l11OlO.I00000oIO(o1ooiI111iI00000oIO2, i01oIoOI01l);
                                                    i00ii11100lo2 = i00ii11100lo;
                                                    int i24 = i10;
                                                    zI000OOo1O2 = iloI0lOlll13.I000OOo1O(o0oIlOolIO) | (i22 != 2048) | iloI0lOlll13.I000II(i00ii11100lo2) | iloI0lOlll13.I000OOo1O(oo0IOoOi012) | (i24 != 4) | iloI0lOlll13.I000OOo1O(oIOlOI4);
/* 320 */                                           Object objI00O0i0ii13 = iloI0lOlll13.I00O0i0ii();
                                                    obj4 = objI00O0i0ii13;
                                                    if (!zI000OOo1O2 || objI00O0i0ii13 == iOO0o0I1l2) {
/* 321 */                                               IOooiI iOooiI = new IOooiI();
                                                        iOooiI.I00iOIl = o0oIlOolIO;
                                                        iOooiI.I00iiI = z8;
                                                        iOooiI.I00iiO = i00ii11100lo2;
                                                        iOooiI.I00iio = oo0IOoOi012;
                                                        iOooiI.I00ilI0I1 = oo0OI01Il;
                                                        iOooiI.I00ilO0 = oIOlOI4;
                                                        VarHandle.storeStoreFence();
/* 322 */                                               iloI0lOlll13.I00iio(iOooiI);
                                                        obj4 = iOooiI;
                                                    }
/* 323 */                                           O1ooiI111i o1ooiI111iI00000oIO7 = iO010ilOIO.I00000oIO(o1ooiI111iI00000oIO2, (Function1) obj4);
/* 326 */                                           IOooo1 iOooo1 = new IOooo1();
/* 327 */                                           iOooo1.I00000oIO = ooI0llll;
/* 328 */                                           iOooo1.I00000oOI = oo0OI01Il;
/* 329 */                                           iOooo1.I0000Il00O = o0oIlOolIO;
/* 330 */                                           iOooo1.I0000O = z3;
/* 331 */                                           iOooo1.I0000oI00 = z8;
/* 332 */                                           iOooo1.I0001Ioi1lo = ooooioIi0I instanceof OO0I1Oli;
/* 333 */                                           iOooo1.I000II = oIOlOI4;
/* 334 */                                           iOooo1.I000O01llI0 = oo0IOoOi012;
/* 335 */                                           iOooo1.I000OOo1O = ioiiO1O1;
/* 336 */                                           iOooo1.I000OiO = ili1lII4;
/* 337 */                                           VarHandle.storeStoreFence();
/* 338 */                                           if (!z8 && !z3 && ((O0oI1IIioO0) i00ii11100lo2).I00000oOI() && Oo0lI00l.I0000O(((Oo0lI00l) o0oIlOolIO.I001lIiIIo1O.getValue()).I00000oIO) && Oo0lI00l.I0000O(((Oo0lI00l) o0oIlOolIO.I001lllioOl.getValue()).I00000oIO)) {
                                                        o1ooiI111iI00000oIO = o1ooiI111iI00000oIO2;
                                                    } else {
/* 347 */                                               IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(21);
                                                        iO1oIiIi1O01.I00iiO = iII11l1I;
                                                        iO1oIiIi1O01.I00iio = o0oIlOolIO;
                                                        iO1oIiIi1O01.I00iiI = oo0OI01Il;
                                                        iO1oIiIi1O01.I00ilI0I1 = oIOlOI4;
                                                        VarHandle.storeStoreFence();
                                                        o1ooiI111iI00000oIO = iilOllOlO1.I00000oIO(o1ooiI111iI00000oIO2, iO1oIiIi1O01);
                                                    }
/* 348 */                                           zI000OOo1O3 = iloI0lOlll13.I000OOo1O(oo0IOoOi012);
/* 349 */                                           Object objI00O0i0ii14 = iloI0lOlll13.I00O0i0ii();
                                                    obj5 = objI00O0i0ii14;
                                                    if (!zI000OOo1O3 || objI00O0i0ii14 == iOO0o0I1l2) {
/* 350 */                                               IOooiliO0l iOooiliO0l = new IOooiliO0l(0);
                                                        iOooiliO0l.I00iiI = oo0IOoOi012;
                                                        VarHandle.storeStoreFence();
/* 351 */                                               iloI0lOlll13.I00iio(iOooiliO0l);
                                                        obj5 = iOooiliO0l;
                                                    }
/* 352 */                                           iIO0iiOiOl0l.I00000oOI(oo0IOoOi012, (Function1) obj5, iloI0lOlll13);
/* 353 */                                           zI000OOo1O4 = iloI0lOlll13.I000OOo1O(o0oIlOolIO) | iloI0lOlll13.I000OOo1O(oo0Oo04) | (i24 != 4) | ((i9 <= 32 && iloI0lOlll13.I000II(ioiiO1O1)) || (i21 & 48) == 32);
/* 354 */                                           Object objI00O0i0ii15 = iloI0lOlll13.I00O0i0ii();
                                                    obj6 = objI00O0i0ii15;
                                                    if (zI000OOo1O4 || objI00O0i0ii15 == iOO0o0I1l2) {
/* 355 */                                               I0O1IO i0o1io = new I0O1IO(5);
                                                        i0o1io.I00iiI = o0oIlOolIO;
                                                        i0o1io.I00iiO = oo0Oo04;
                                                        i0o1io.I00iio = oo0OI01Il;
                                                        i0o1io.I00ilI0I1 = ioiiO1O1;
                                                        VarHandle.storeStoreFence();
/* 356 */                                               iloI0lOlll13.I00iio(i0o1io);
                                                        obj6 = i0o1io;
                                                    }
/* 357 */                                           iIO0iiOiOl0l.I00000oOI(ioiiO1O1, (Function1) obj6, iloI0lOlll13);
                                                    boolean z18 = i != 1;
/* 358 */                                           int i25 = ioiiO1O1.I0000oI00;
/* 359 */                                           Oo01Ioo1ilO oo01Ioo1ilO = new Oo01Ioo1ilO();
                                                    oo01Ioo1ilO.I00iOIl = o0oIlOolIO;
                                                    oo01Ioo1ilO.I00iiI = oo0IOoOi012;
                                                    oo01Ioo1ilO.I00iiO = oo0OI01Il;
                                                    O1ooiI111i o1ooiI111i4 = o1ooiI111iI00000oIO;
                                                    oo01Ioo1ilO.I00iio = z15;
                                                    oo01Ioo1ilO.I00ilI0I1 = z18;
                                                    oo01Ioo1ilO.I00ilO0 = oIOlOI4;
                                                    oo01Ioo1ilO.I00io1l = ooiI0IO0oiI;
                                                    oo01Ioo1ilO.I00ioIO = iOooI1o4;
                                                    oo01Ioo1ilO.I00l0I0l0lO1 = i25;
                                                    VarHandle.storeStoreFence();
                                                    O1ooiI111i o1ooiI111iI00000oIO8 = iilOllOlO1.I00000oIO(o1ooiI111iI00000oIO2, oo01Ioo1ilO);
/* 360 */                                           int i26 = ioiiO1O1.I0000O;
                                                    z11 = (i26 == 7 || i26 == 8) ? false : true;
/* 361 */                                           zBooleanValue = ((Boolean) oI10i0Il.getValue()).booleanValue();
/* 362 */                                           zI000O01llI0 = iloI0lOlll13.I000O01llI0(z11) | iloI0lOlll13.I000OOo1O(i0oOiiOi0l2);
/* 363 */                                           Object objI00O0i0ii16 = iloI0lOlll13.I00O0i0ii();
                                                    obj7 = objI00O0i0ii16;
                                                    if (!zI000O01llI0 || objI00O0i0ii16 == iOO0o0I1l2) {
/* 364 */                                               IOool10Il0 iOool10Il0 = new IOool10Il0(0);
                                                        iOool10Il0.I00iiI = z11;
                                                        iOool10Il0.I00iiO = i0oOiiOi0l2;
                                                        VarHandle.storeStoreFence();
/* 365 */                                               iloI0lOlll13.I00iio(iOool10Il0);
                                                        obj7 = iOool10Il0;
                                                    }
/* 366 */                                           IllOOo00lI illOOo00lI = (IllOOo00lI) obj7;
                                                    if (zBooleanValue) {
                                                        o1ooiI111iI0000O = o1ooiI111iI00000oIO2;
                                                    } else {
                                                        if (z11) {
/* 368 */                                                   Oli1Oo1l00i oli1Oo1l00i = new Oli1Oo1l00i();
/* 369 */                                                   oli1Oo1l00i.I00000oIO = iO1I0llIoi.I00000oIO;
/* 370 */                                                   oli1Oo1l00i.I00000oOI = iO10lIIill0.I00000oIO;
/* 371 */                                                   VarHandle.storeStoreFence();
                                                            o1ooiI111i3 = oli1Oo1l00i;
                                                        } else {
                                                            o1ooiI111i3 = o1ooiI111iI00000oIO2;
                                                        }
/* 373 */                                               Oli110il1 oli110il1 = new Oli110il1();
/* 374 */                                               oli110il1.I00000oIO = illOOo00lI;
/* 375 */                                               VarHandle.storeStoreFence();
                                                        o1ooiI111iI0000O = o1ooiI111i3.I0000O(oli110il1);
                                                    }
/* 377 */                                           olI00IIlOO = (III11l1I) iloI0lOlll13.I000iOII(I1lOOO0Oo.I00000oIO);
/* 380 */                                           j2 = ((IOOiio0i) iloI0lOlll13.I000iOII(I1lOOO0Oo.I00000oOI)).I00000oIO;
/* 381 */                                           jI00000oOI = iiO01ll11o1l.I00000oOI(1308617531);
/* 382 */                                           int i27 = IOOiio0i.I000oI1ioi;
/* 383 */                                           if (!Ooi0i1.I00000oOI(j2, jI00000oOI)) {
/* 385 */                                               olI00IIlOO = new OlI00IIlOO(j2);
                                                    }
/* 386 */                                           zI000OOo1O5 = iloI0lOlll13.I000OOo1O(o0oIlOolIO) | iloI0lOlll13.I000II(olI00IIlOO);
/* 387 */                                           Object objI00O0i0ii17 = iloI0lOlll13.I00O0i0ii();
                                                    obj8 = objI00O0i0ii17;
                                                    if (!zI000OOo1O5 || objI00O0i0ii17 == iOO0o0I1l2) {
/* 388 */                                               I00o101lO i00o101lO = new I00o101lO(26);
                                                        i00o101lO.I00iiI = o0oIlOolIO;
                                                        i00o101lO.I00iiO = olI00IIlOO;
                                                        VarHandle.storeStoreFence();
/* 389 */                                               iloI0lOlll13.I00iio(i00o101lO);
                                                        obj8 = i00o101lO;
                                                    }
/* 390 */                                           O1ooiI111i o1ooiI111iI0000Il00O = iIO01l11OlO.I0000Il00O(o1ooiI111iI00000oIO2, (Function1) obj8);
                                                    o1ooiI111i2 = o1ooiI111i;
/* 391 */                                           O1ooiI111i o1ooiI111iI0000O3 = o1ooiI111i2.I0000O(o1ooiI111iI0000Il00O);
/* 393 */                                           O0oI1iIl o0oI1iIl = new O0oI1iIl();
/* 394 */                                           o0oI1iIl.I00000oIO = i0oOiiOi0l2;
/* 395 */                                           o0oI1iIl.I00000oOI = o0oIlOolIO;
/* 396 */                                           o0oI1iIl.I0000Il00O = oo0IOoOi012;
/* 397 */                                           VarHandle.storeStoreFence();
/* 400 */                                           O1ooiI111i o1ooiI111iI0000O4 = o1ooiI111iI0000O3.I0000O(o0oI1iIl).I0000O(o1ooiI111iI0000O).I0000O(o1ooiI111iI00000oIO3);
/* 402 */                                           I01i01OoI i01i01OoI = new I01i01OoI(27);
                                                    i01i01OoI.I00iiI = ili1iIl3;
                                                    i01i01OoI.I00iiO = o0oIlOolIO;
/* 403 */                                           VarHandle.storeStoreFence();
                                                    O1ooiI111i o1ooiI111iI00000oOI = iIoI0lOo.I00000oOI(o1ooiI111iI0000O4, i01i01OoI);
/* 405 */                                           I01i01OoI i01i01OoI2 = new I01i01OoI(11);
                                                    i01i01OoI2.I00iiI = o0oIlOolIO;
                                                    i01i01OoI2.I00iiO = oo0IOoOi012;
/* 406 */                                           VarHandle.storeStoreFence();
/* 407 */                                           O1ooiI111i o1ooiI111iI0000O5 = iIoI0lOo.I00000oOI(o1ooiI111iI00000oOI, i01i01OoI2).I0000O(o1ooiI111iI00000oIO8);
/* 408 */                                           Io1olo0 io1olo0 = new Io1olo0(5);
                                                    Oo0I110i oo0I110i3 = oo0I110i;
                                                    io1olo0.I00iiO = oo0I110i3;
                                                    io1olo0.I00iiI = z8;
                                                    oI0lOIiOIOOo2 = oI0lOIiOIOOo;
                                                    io1olo0.I00iio = oI0lOIiOIOOo2;
                                                    VarHandle.storeStoreFence();
/* 410 */                                           IOl11II iOl11II = new IOl11II();
/* 411 */                                           iOl11II.I00000oIO = io1olo0;
/* 412 */                                           VarHandle.storeStoreFence();
/* 414 */                                           O1ooiI111i o1ooiI111iI0000O6 = o1ooiI111iI0000O5.I0000O(iOl11II).I0000O(o1ooiI111iI00000oIO5).I0000O(iOooo1);
                                                    z12 = false;
                                                    z12 = false;
                                                    z12 = false;
                                                    z12 = false;
/* 415 */                                           IOooI1o iOooI1o6 = new IOooI1o(false ? 1 : 0);
                                                    iOooI1o6.I00iiI = o0oIlOolIO;
                                                    VarHandle.storeStoreFence();
                                                    O1ooiI111i o1ooiI111iI00000oIO9 = iO010ilOIO.I00000oIO(o1ooiI111iI0000O6, iOooI1o6);
/* 416 */                                           Oo00iIooiI oo00iIooiI = new Oo00iIooiI(1);
                                                    oo00iIooiI.I00iiI = oo0IOoOi012;
                                                    oo00iIooiI.I00iiO = ii0110;
                                                    VarHandle.storeStoreFence();
                                                    O1ooiI111i o1ooiI111iI00000oIO10 = iO1I00OOol.I00000oIO(o1ooiI111iI00000oIO9, oo00iIooiI);
/* 417 */                                           if (z8 && o0oIlOolIO.I00000oOI() && ((Boolean) o0oIlOolIO.I00100o1O0lo.getValue()).booleanValue() && ((O0oI1IIioO0) i00ii11100lo2).I00000oOI()) {
                                                        z12 = true;
                                                    }
                                                    if (z12) {
/* 421 */                                               Oil0IoooOio oil0IoooOio = O1O1oI1OI.I00000oIO;
/* 422 */                                               I0iII1i10I i0iII1i10I = new I0iII1i10I(25);
                                                        i0iII1i10I.I00iiI = oo0IOoOi012;
                                                        VarHandle.storeStoreFence();
                                                        o1ooiI111iI00000oIO2 = iilOllOlO1.I00000oIO(o1ooiI111iI00000oIO2, i0iII1i10I);
                                                    }
/* 423 */                                           IOooO0lli1o iOooO0lli1o = new IOooO0lli1o();
                                                    iOooO0lli1o.I00iOIl = iOii1l;
                                                    oo0lloOiiIOI2 = oo0lloOiiIOI;
                                                    iOooO0lli1o.I00iiI = oo0lloOiiIOI2;
                                                    iOooO0lli1o.I00iiO = o0oIlOolIO;
                                                    iOooO0lli1o.I00iio = i2;
                                                    i11 = i;
                                                    iOooO0lli1o.I00ilI0I1 = i11;
                                                    z13 = z;
                                                    iOooO0lli1o.I00ilO0 = z13;
                                                    iOooO0lli1o.I00io1l = oo0I110i3;
                                                    oo0OI01Il2 = oo0OI01Il;
                                                    iOooO0lli1o.I00ioIO = oo0OI01Il2;
                                                    ooooioIi0I2 = ooooioIi0I;
                                                    iOooO0lli1o.I00l0I0l0lO1 = ooooioIi0I2;
                                                    iOooO0lli1o.I00l0OO0IO = o1ooiI111i4;
                                                    iOooO0lli1o.I00li1OI = o1ooiI111iI00000oIO6;
                                                    iOooO0lli1o.I00ll1 = o1ooiI111iI00000oIO7;
                                                    iOooO0lli1o.I00lli11 = o1ooiI111iI00000oIO2;
                                                    iOooO0lli1o.I00lll10 = iII0Ii;
                                                    iOooO0lli1o.I00o0iI0io1 = oo0IOoOi012;
                                                    iOooO0lli1o.I00o0l1o1o0 = z12;
                                                    z4 = z3;
                                                    iOooO0lli1o.I00o101lO = z4;
                                                    iOooO0lli1o.I00oI0i = i00ii11100lo2;
                                                    iOooO0lli1o.I00oII = ii0110;
                                                    function13 = function12;
                                                    iOooO0lli1o.I00oIiI10 = function13;
                                                    iOooO0lli1o.I00oO101o = oIOlOI4;
                                                    iOooO0lli1o.I00oOio10iI1 = iiIooOOOI3;
                                                    VarHandle.storeStoreFence();
                                                    I00000oOI(o1ooiI111iI00000oIO10, oo0IOoOi012, iiioOl1O.I00000oOI(-814563849, iOooO0lli1o, iloI0lOlll13), iloI0lOlll13, 384);
                                                    iloI0lOlll12 = iloI0lOlll13;
                                                } else {
                                                    oI10i0Il = oI10i0IlI00000oOI;
                                                }
                                                z9 = true;
                                                z10 = zI000II2 | z9;
/* 299 */                                       objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
                                                if (z10) {
/* 300 */                                           objI00O0i0ii5 = new I000oI1ioi(o0oIlOolIO3, oI10i0Il, oo0Oo04, oo0IOoOi012, ioiiO1O12, null, 5);
                                                    o0oIlOolIO = o0oIlOolIO3;
/* 301 */                                           iloI0lOlll13.I00iio(objI00O0i0ii5);
/* 302 */                                           iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii5, iloI0lOlll13, OoiIlOl1iI.I00000oIO);
/* 303 */                                           IOooI1o iOooI1o52 = new IOooI1o(4);
                                                    iOooI1o52.I00iiI = o0oIlOolIO;
                                                    VarHandle.storeStoreFence();
/* 305 */                                           I0o1Oi0IO1 i0o1Oi0IO13 = new I0o1Oi0IO1(5);
                                                    i0o1Oi0IO13.I00000oOI = iOooI1o52;
/* 306 */                                           VarHandle.storeStoreFence();
/* 304 */                                           O1ooiI111i o1ooiI111iI00000oIO42 = Oll10I.I00000oIO(o1ooiI111iI00000oIO2, 8675309, i0o1Oi0IO13);
/* 307 */                                           Oo01ooIIoO oo01ooIIoO2 = new Oo01ooIIoO();
                                                    oo01ooIIoO2.I00iOIl = o0oIlOolIO;
                                                    oo01ooIIoO2.I00iiI = ili1lII4;
                                                    oo01ooIIoO2.I00iiO = z3;
                                                    oo01ooIIoO2.I00iio = z8;
                                                    oo01ooIIoO2.I00ilI0I1 = oo0IOoOi012;
                                                    oo01ooIIoO2.I00ilO0 = oIOlOI4;
                                                    VarHandle.storeStoreFence();
                                                    if (z8) {
                                                    }
/* 309 */                                           Oo0IOII oo0IOII22 = oo0IOoOi012.I001lIiIIo1O;
/* 310 */                                           Oo0IOOIl0 oo0IOOIl022 = oo0IOoOi012.I001l0I00;
/* 312 */                                           I0o1Oi0IO1 i0o1Oi0IO122 = new I0o1Oi0IO1(10);
                                                    i0o1Oi0IO122.I00000oOI = oo0IOoOi012;
/* 313 */                                           VarHandle.storeStoreFence();
/* 314 */                                           O1ooiI111i o1ooiI111iI0000O22 = o1ooiI111iI00000oIO42.I0000O(new Oll0l0IOO0o(oo0IOII22, oo0IOOIl022, i0o1Oi0IO122, 4));
/* 315 */                                           OO1iIiOoO0.I00000oIO.getClass();
/* 317 */                                           O1ooiI111i o1ooiI111iI00000oIO52 = lI1iiO11I.I00000oIO(o1ooiI111iI0000O22, iO0OI01loOo.I00000oOI);
/* 318 */                                           I01oIoOI01l i01oIoOI01l2 = new I01oIoOI01l(12);
                                                    i01oIoOI01l2.I00iiI = o0oIlOolIO;
                                                    i01oIoOI01l2.I00iiO = oo0OI01Il;
                                                    i01oIoOI01l2.I00iio = oIOlOI4;
                                                    VarHandle.storeStoreFence();
                                                    O1ooiI111i o1ooiI111iI00000oIO62 = iIO01l11OlO.I00000oIO(o1ooiI111iI00000oIO2, i01oIoOI01l2);
                                                    i00ii11100lo2 = i00ii11100lo;
                                                    int i242 = i10;
                                                    zI000OOo1O2 = iloI0lOlll13.I000OOo1O(o0oIlOolIO) | (i22 != 2048) | iloI0lOlll13.I000II(i00ii11100lo2) | iloI0lOlll13.I000OOo1O(oo0IOoOi012) | (i242 != 4) | iloI0lOlll13.I000OOo1O(oIOlOI4);
/* 320 */                                           Object objI00O0i0ii132 = iloI0lOlll13.I00O0i0ii();
                                                    obj4 = objI00O0i0ii132;
                                                    if (!zI000OOo1O2) {
/* 321 */                                               IOooiI iOooiI2 = new IOooiI();
                                                        iOooiI2.I00iOIl = o0oIlOolIO;
                                                        iOooiI2.I00iiI = z8;
                                                        iOooiI2.I00iiO = i00ii11100lo2;
                                                        iOooiI2.I00iio = oo0IOoOi012;
                                                        iOooiI2.I00ilI0I1 = oo0OI01Il;
                                                        iOooiI2.I00ilO0 = oIOlOI4;
                                                        VarHandle.storeStoreFence();
/* 322 */                                               iloI0lOlll13.I00iio(iOooiI2);
                                                        obj4 = iOooiI2;
/* 323 */                                               O1ooiI111i o1ooiI111iI00000oIO72 = iO010ilOIO.I00000oIO(o1ooiI111iI00000oIO2, (Function1) obj4);
/* 326 */                                               IOooo1 iOooo12 = new IOooo1();
/* 327 */                                               iOooo12.I00000oIO = ooI0llll;
/* 328 */                                               iOooo12.I00000oOI = oo0OI01Il;
/* 329 */                                               iOooo12.I0000Il00O = o0oIlOolIO;
/* 330 */                                               iOooo12.I0000O = z3;
/* 331 */                                               iOooo12.I0000oI00 = z8;
/* 332 */                                               iOooo12.I0001Ioi1lo = ooooioIi0I instanceof OO0I1Oli;
/* 333 */                                               iOooo12.I000II = oIOlOI4;
/* 334 */                                               iOooo12.I000O01llI0 = oo0IOoOi012;
/* 335 */                                               iOooo12.I000OOo1O = ioiiO1O1;
/* 336 */                                               iOooo12.I000OiO = ili1lII4;
/* 337 */                                               VarHandle.storeStoreFence();
                                                        if (z8) {
/* 338 */                                                   if (!z8 && !z3 && ((O0oI1IIioO0) i00ii11100lo2).I00000oOI() && Oo0lI00l.I0000O(((Oo0lI00l) o0oIlOolIO.I001lIiIIo1O.getValue()).I00000oIO) && Oo0lI00l.I0000O(((Oo0lI00l) o0oIlOolIO.I001lllioOl.getValue()).I00000oIO)) {
                                                            }
/* 348 */                                                   zI000OOo1O3 = iloI0lOlll13.I000OOo1O(oo0IOoOi012);
/* 349 */                                                   Object objI00O0i0ii142 = iloI0lOlll13.I00O0i0ii();
                                                            obj5 = objI00O0i0ii142;
                                                            if (!zI000OOo1O3) {
/* 350 */                                                       IOooiliO0l iOooiliO0l2 = new IOooiliO0l(0);
                                                                iOooiliO0l2.I00iiI = oo0IOoOi012;
                                                                VarHandle.storeStoreFence();
/* 351 */                                                       iloI0lOlll13.I00iio(iOooiliO0l2);
                                                                obj5 = iOooiliO0l2;
/* 352 */                                                       iIO0iiOiOl0l.I00000oOI(oo0IOoOi012, (Function1) obj5, iloI0lOlll13);
                                                                if (i9 <= 32) {
/* 353 */                                                           zI000OOo1O4 = iloI0lOlll13.I000OOo1O(o0oIlOolIO) | iloI0lOlll13.I000OOo1O(oo0Oo04) | (i242 != 4) | ((i9 <= 32 && iloI0lOlll13.I000II(ioiiO1O1)) || (i21 & 48) == 32);
/* 354 */                                                           Object objI00O0i0ii152 = iloI0lOlll13.I00O0i0ii();
                                                                    obj6 = objI00O0i0ii152;
                                                                    if (zI000OOo1O4) {
/* 355 */                                                               I0O1IO i0o1io2 = new I0O1IO(5);
                                                                        i0o1io2.I00iiI = o0oIlOolIO;
                                                                        i0o1io2.I00iiO = oo0Oo04;
                                                                        i0o1io2.I00iio = oo0OI01Il;
                                                                        i0o1io2.I00ilI0I1 = ioiiO1O1;
                                                                        VarHandle.storeStoreFence();
/* 356 */                                                               iloI0lOlll13.I00iio(i0o1io2);
                                                                        obj6 = i0o1io2;
/* 357 */                                                               iIO0iiOiOl0l.I00000oOI(ioiiO1O1, (Function1) obj6, iloI0lOlll13);
                                                                        if (i != 1) {
                                                                        }
/* 358 */                                                               int i252 = ioiiO1O1.I0000oI00;
/* 359 */                                                               Oo01Ioo1ilO oo01Ioo1ilO2 = new Oo01Ioo1ilO();
                                                                        oo01Ioo1ilO2.I00iOIl = o0oIlOolIO;
                                                                        oo01Ioo1ilO2.I00iiI = oo0IOoOi012;
                                                                        oo01Ioo1ilO2.I00iiO = oo0OI01Il;
                                                                        O1ooiI111i o1ooiI111i42 = o1ooiI111iI00000oIO;
                                                                        oo01Ioo1ilO2.I00iio = z15;
                                                                        oo01Ioo1ilO2.I00ilI0I1 = z18;
                                                                        oo01Ioo1ilO2.I00ilO0 = oIOlOI4;
                                                                        oo01Ioo1ilO2.I00io1l = ooiI0IO0oiI;
                                                                        oo01Ioo1ilO2.I00ioIO = iOooI1o4;
                                                                        oo01Ioo1ilO2.I00l0I0l0lO1 = i252;
                                                                        VarHandle.storeStoreFence();
                                                                        O1ooiI111i o1ooiI111iI00000oIO82 = iilOllOlO1.I00000oIO(o1ooiI111iI00000oIO2, oo01Ioo1ilO2);
/* 360 */                                                               int i262 = ioiiO1O1.I0000O;
                                                                        if (i262 == 7) {
/* 361 */                                                                   zBooleanValue = ((Boolean) oI10i0Il.getValue()).booleanValue();
/* 362 */                                                                   zI000O01llI0 = iloI0lOlll13.I000O01llI0(z11) | iloI0lOlll13.I000OOo1O(i0oOiiOi0l2);
/* 363 */                                                                   Object objI00O0i0ii162 = iloI0lOlll13.I00O0i0ii();
                                                                            obj7 = objI00O0i0ii162;
                                                                            if (!zI000O01llI0) {
/* 364 */                                                                       IOool10Il0 iOool10Il02 = new IOool10Il0(0);
                                                                                iOool10Il02.I00iiI = z11;
                                                                                iOool10Il02.I00iiO = i0oOiiOi0l2;
                                                                                VarHandle.storeStoreFence();
/* 365 */                                                                       iloI0lOlll13.I00iio(iOool10Il02);
                                                                                obj7 = iOool10Il02;
/* 366 */                                                                       IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj7;
                                                                                if (zBooleanValue) {
                                                                                }
/* 377 */                                                                       olI00IIlOO = (III11l1I) iloI0lOlll13.I000iOII(I1lOOO0Oo.I00000oIO);
/* 380 */                                                                       j2 = ((IOOiio0i) iloI0lOlll13.I000iOII(I1lOOO0Oo.I00000oOI)).I00000oIO;
/* 381 */                                                                       jI00000oOI = iiO01ll11o1l.I00000oOI(1308617531);
/* 382 */                                                                       int i272 = IOOiio0i.I000oI1ioi;
/* 383 */                                                                       if (!Ooi0i1.I00000oOI(j2, jI00000oOI)) {
                                                                                }
/* 386 */                                                                       zI000OOo1O5 = iloI0lOlll13.I000OOo1O(o0oIlOolIO) | iloI0lOlll13.I000II(olI00IIlOO);
/* 387 */                                                                       Object objI00O0i0ii172 = iloI0lOlll13.I00O0i0ii();
                                                                                obj8 = objI00O0i0ii172;
                                                                                if (!zI000OOo1O5) {
/* 388 */                                                                           I00o101lO i00o101lO2 = new I00o101lO(26);
                                                                                    i00o101lO2.I00iiI = o0oIlOolIO;
                                                                                    i00o101lO2.I00iiO = olI00IIlOO;
                                                                                    VarHandle.storeStoreFence();
/* 389 */                                                                           iloI0lOlll13.I00iio(i00o101lO2);
                                                                                    obj8 = i00o101lO2;
/* 390 */                                                                           O1ooiI111i o1ooiI111iI0000Il00O2 = iIO01l11OlO.I0000Il00O(o1ooiI111iI00000oIO2, (Function1) obj8);
                                                                                    o1ooiI111i2 = o1ooiI111i;
/* 391 */                                                                           O1ooiI111i o1ooiI111iI0000O32 = o1ooiI111i2.I0000O(o1ooiI111iI0000Il00O2);
/* 393 */                                                                           O0oI1iIl o0oI1iIl2 = new O0oI1iIl();
/* 394 */                                                                           o0oI1iIl2.I00000oIO = i0oOiiOi0l2;
/* 395 */                                                                           o0oI1iIl2.I00000oOI = o0oIlOolIO;
/* 396 */                                                                           o0oI1iIl2.I0000Il00O = oo0IOoOi012;
/* 397 */                                                                           VarHandle.storeStoreFence();
/* 400 */                                                                           O1ooiI111i o1ooiI111iI0000O42 = o1ooiI111iI0000O32.I0000O(o0oI1iIl2).I0000O(o1ooiI111iI0000O).I0000O(o1ooiI111iI00000oIO3);
/* 402 */                                                                           I01i01OoI i01i01OoI3 = new I01i01OoI(27);
                                                                                    i01i01OoI3.I00iiI = ili1iIl3;
                                                                                    i01i01OoI3.I00iiO = o0oIlOolIO;
/* 403 */                                                                           VarHandle.storeStoreFence();
                                                                                    O1ooiI111i o1ooiI111iI00000oOI2 = iIoI0lOo.I00000oOI(o1ooiI111iI0000O42, i01i01OoI3);
/* 405 */                                                                           I01i01OoI i01i01OoI22 = new I01i01OoI(11);
                                                                                    i01i01OoI22.I00iiI = o0oIlOolIO;
                                                                                    i01i01OoI22.I00iiO = oo0IOoOi012;
/* 406 */                                                                           VarHandle.storeStoreFence();
/* 407 */                                                                           O1ooiI111i o1ooiI111iI0000O52 = iIoI0lOo.I00000oOI(o1ooiI111iI00000oOI2, i01i01OoI22).I0000O(o1ooiI111iI00000oIO82);
/* 408 */                                                                           Io1olo0 io1olo02 = new Io1olo0(5);
                                                                                    Oo0I110i oo0I110i32 = oo0I110i;
                                                                                    io1olo02.I00iiO = oo0I110i32;
                                                                                    io1olo02.I00iiI = z8;
                                                                                    oI0lOIiOIOOo2 = oI0lOIiOIOOo;
                                                                                    io1olo02.I00iio = oI0lOIiOIOOo2;
                                                                                    VarHandle.storeStoreFence();
/* 410 */                                                                           IOl11II iOl11II2 = new IOl11II();
/* 411 */                                                                           iOl11II2.I00000oIO = io1olo02;
/* 412 */                                                                           VarHandle.storeStoreFence();
/* 414 */                                                                           O1ooiI111i o1ooiI111iI0000O62 = o1ooiI111iI0000O52.I0000O(iOl11II2).I0000O(o1ooiI111iI00000oIO52).I0000O(iOooo12);
                                                                                    z12 = false;
                                                                                    z12 = false;
                                                                                    z12 = false;
                                                                                    z12 = false;
/* 415 */                                                                           IOooI1o iOooI1o62 = new IOooI1o(false ? 1 : 0);
                                                                                    iOooI1o62.I00iiI = o0oIlOolIO;
                                                                                    VarHandle.storeStoreFence();
                                                                                    O1ooiI111i o1ooiI111iI00000oIO92 = iO010ilOIO.I00000oIO(o1ooiI111iI0000O62, iOooI1o62);
/* 416 */                                                                           Oo00iIooiI oo00iIooiI2 = new Oo00iIooiI(1);
                                                                                    oo00iIooiI2.I00iiI = oo0IOoOi012;
                                                                                    oo00iIooiI2.I00iiO = ii0110;
                                                                                    VarHandle.storeStoreFence();
                                                                                    O1ooiI111i o1ooiI111iI00000oIO102 = iO1I00OOol.I00000oIO(o1ooiI111iI00000oIO92, oo00iIooiI2);
                                                                                    if (z8) {
                                                                                        z12 = true;
                                                                                    }
                                                                                    if (z12) {
                                                                                    }
/* 423 */                                                                           IOooO0lli1o iOooO0lli1o2 = new IOooO0lli1o();
                                                                                    iOooO0lli1o2.I00iOIl = iOii1l;
                                                                                    oo0lloOiiIOI2 = oo0lloOiiIOI;
                                                                                    iOooO0lli1o2.I00iiI = oo0lloOiiIOI2;
                                                                                    iOooO0lli1o2.I00iiO = o0oIlOolIO;
                                                                                    iOooO0lli1o2.I00iio = i2;
                                                                                    i11 = i;
                                                                                    iOooO0lli1o2.I00ilI0I1 = i11;
                                                                                    z13 = z;
                                                                                    iOooO0lli1o2.I00ilO0 = z13;
                                                                                    iOooO0lli1o2.I00io1l = oo0I110i32;
                                                                                    oo0OI01Il2 = oo0OI01Il;
                                                                                    iOooO0lli1o2.I00ioIO = oo0OI01Il2;
                                                                                    ooooioIi0I2 = ooooioIi0I;
                                                                                    iOooO0lli1o2.I00l0I0l0lO1 = ooooioIi0I2;
                                                                                    iOooO0lli1o2.I00l0OO0IO = o1ooiI111i42;
                                                                                    iOooO0lli1o2.I00li1OI = o1ooiI111iI00000oIO62;
                                                                                    iOooO0lli1o2.I00ll1 = o1ooiI111iI00000oIO72;
                                                                                    iOooO0lli1o2.I00lli11 = o1ooiI111iI00000oIO2;
                                                                                    iOooO0lli1o2.I00lll10 = iII0Ii;
                                                                                    iOooO0lli1o2.I00o0iI0io1 = oo0IOoOi012;
                                                                                    iOooO0lli1o2.I00o0l1o1o0 = z12;
                                                                                    z4 = z3;
                                                                                    iOooO0lli1o2.I00o101lO = z4;
                                                                                    iOooO0lli1o2.I00oI0i = i00ii11100lo2;
                                                                                    iOooO0lli1o2.I00oII = ii0110;
                                                                                    function13 = function12;
                                                                                    iOooO0lli1o2.I00oIiI10 = function13;
                                                                                    iOooO0lli1o2.I00oO101o = oIOlOI4;
                                                                                    iOooO0lli1o2.I00oOio10iI1 = iiIooOOOI3;
                                                                                    VarHandle.storeStoreFence();
                                                                                    I00000oOI(o1ooiI111iI00000oIO102, oo0IOoOi012, iiioOl1O.I00000oOI(-814563849, iOooO0lli1o2, iloI0lOlll13), iloI0lOlll13, 384);
                                                                                    iloI0lOlll12 = iloI0lOlll13;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
/* 353 */                                                           zI000OOo1O4 = iloI0lOlll13.I000OOo1O(o0oIlOolIO) | iloI0lOlll13.I000OOo1O(oo0Oo04) | (i242 != 4) | ((i9 <= 32 && iloI0lOlll13.I000II(ioiiO1O1)) || (i21 & 48) == 32);
/* 354 */                                                           Object objI00O0i0ii1522 = iloI0lOlll13.I00O0i0ii();
                                                                    obj6 = objI00O0i0ii1522;
                                                                    if (zI000OOo1O4) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                ioiiO1O12 = ioiiO1O1;
                                            }
                                            i10 = i23;
                                            boolean z19 = (i21 & 48) != 32;
                                            zI000OOo1O = z17 | z19 | iloI0lOlll13.I000OOo1O(oIOlOI4) | iloI0lOlll13.I000OOo1O(ii0110) | iloI0lOlll13.I000OOo1O(iII0Ii) | iloI0lOlll13.I000OOo1O(oo0IOoOi012);
/* 289 */                                   Object objI00O0i0ii122 = iloI0lOlll13.I00O0i0ii();
                                            if (zI000OOo1O) {
/* 290 */                                       IOooi01 iOooi012 = new IOooi01();
                                                iOooi012.I00iOIl = o0oIlOolIO3;
                                                z8 = z2;
                                                iOooi012.I00iiI = z8;
                                                iOooi012.I00iiO = z3;
                                                iOooi012.I00iio = oo0Oo04;
                                                iOooi012.I00ilI0I1 = oo0OI01Il;
                                                iOooi012.I00ilO0 = ioiiO1O12;
                                                iOooi012.I00io1l = oIOlOI4;
                                                iOooi012.I00ioIO = oo0IOoOi012;
                                                iOooi012.I00l0I0l0lO1 = ii0110;
                                                iOooi012.I00l0OO0IO = iII0Ii;
                                                VarHandle.storeStoreFence();
/* 291 */                                       iloI0lOlll13.I00iio(iOooi012);
                                                obj3 = iOooi012;
/* 293 */                                       O1ooiI111i o1ooiI111iI00000oIO22 = O1ooIo101ll.I00000oIO;
/* 295 */                                       O1ooiI111i o1ooiI111iI00000oIO32 = iIllIIO1IIO.I00000oIO(iIlilo.I00000oIO(iIll0I00Ol0.I00000oIO(o1ooiI111iI00000oIO22, ili1lII4), (Function1) obj3), z8, oI0lOIiOIOOo);
                                                if (z8) {
/* 297 */                                           oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(Boolean.valueOf((z8 || z3) ? false : true), iloI0lOlll13);
/* 298 */                                           boolean zI000II22 = iloI0lOlll13.I000II(oI10i0IlI00000oOI) | iloI0lOlll13.I000OOo1O(o0oIlOolIO3) | iloI0lOlll13.I000OOo1O(oo0Oo04) | iloI0lOlll13.I000OOo1O(oo0IOoOi012);
                                                    if (i9 > 32) {
                                                        oI10i0Il = oI10i0IlI00000oOI;
                                                        if ((i21 & 48) != 32) {
                                                            z9 = true;
                                                        }
                                                        z10 = zI000II22 | z9;
/* 299 */                                               objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
                                                        if (z10) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
/* 204 */                                   Long l = ooiI0IO0oiI.I0000O;
                                            if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                                            }
/* 207 */                                   objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
                                            Object obj132 = objI00O0i0ii2;
                                            if (objI00O0i0ii2 == iOO0o0I1l2) {
                                            }
/* 210 */                                   Ii0110 ii01102 = (Ii0110) obj132;
/* 211 */                                   objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                            Object obj142 = objI00O0i0ii3;
                                            if (objI00O0i0ii3 == iOO0o0I1l2) {
                                            }
/* 214 */                                   III0Ii iII0Ii2 = (III0Ii) obj142;
/* 215 */                                   objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                            if (objI00O0i0ii4 != iOO0o0I1l2) {
                                            }
/* 259 */                                   Oo0IOoOi01 oo0IOoOi0122 = (Oo0IOoOi01) obj2;
                                            OIOlOI oIOlOI42 = oIOlOI;
/* 260 */                                   oo0IOoOi0122.I00000oOI = oIOlOI42;
/* 261 */                                   oo0IOoOi0122.I0001Ioi1lo = ooooioIi0I;
/* 262 */                                   oo0IOoOi0122.I0000Il00O = iOooI1o4;
/* 263 */                                   oo0IOoOi0122.I0000O = o0oIlOolIO3;
/* 264 */                                   oo0IOoOi0122.I0000oI00.setValue(oo0OI01Il);
/* 265 */                                   oo0IOoOi0122.I001i1O0Ol = Oo0lI00l.I00000oIO(j);
/* 268 */                                   oo0IOoOi0122.I000O01llI0 = (IOO0IOIll) iloI0lOlll13.I000iOII(IOlO0o100i1i.I0001Ioi1lo);
/* 269 */                                   oo0IOoOi0122.I000OOo1O = ii01102;
/* 274 */                                   oo0IOoOi0122.I000iOII = (Io1I0l) iloI0lOlll13.I000iOII(IOlO0o100i1i.I000l1);
                                            Ili1lII ili1lII42 = ili1lII;
/* 275 */                                   oo0IOoOi0122.I000l1 = ili1lII42;
                                            boolean z152 = !z3;
/* 277 */                                   oo0IOoOi0122.I000lI.setValue(Boolean.valueOf(z152));
/* 279 */                                   oo0IOoOi0122.I000o00OoI0I.setValue(Boolean.valueOf(z2));
/* 280 */                                   iloI0lOlll13.I00i01iIIliI(1966756105);
/* 285 */                                   oo0IOoOi0122.I000OiO = OO1O1IIoi.I00000oOI(OiiOIo1.I00iOIl, oo0lloOiiIOI3.I00000oIO.I000iOII, iloI0lOlll13, 6);
/* 286 */                                   iloI0lOlll13.I0010I0i(false);
/* 287 */                                   o0oIlOolIO3.I00000oOI();
                                            int i212 = i7;
                                            int i222 = i212 & 7168;
/* 288 */                                   boolean zI000OOo1O62 = iloI0lOlll13.I000OOo1O(o0oIlOolIO3) | (i222 != 2048);
                                            if ((i212 & 57344) != 16384) {
                                            }
                                            Oo0Oo0 oo0Oo042 = oo0Oo0;
                                            boolean zI000OOo1O72 = zI000OOo1O62 | z16 | iloI0lOlll13.I000OOo1O(oo0Oo042);
                                            int i232 = i8;
                                            boolean z172 = zI000OOo1O72 | (i232 != 4);
                                            i9 = (i212 & 112) ^ 48;
                                            if (i9 <= 32) {
                                            }
                                            i10 = i232;
                                            if ((i212 & 48) != 32) {
                                            }
                                            zI000OOo1O = z172 | z19 | iloI0lOlll13.I000OOo1O(oIOlOI42) | iloI0lOlll13.I000OOo1O(ii01102) | iloI0lOlll13.I000OOo1O(iII0Ii2) | iloI0lOlll13.I000OOo1O(oo0IOoOi0122);
/* 289 */                                   Object objI00O0i0ii1222 = iloI0lOlll13.I00O0i0ii();
                                            if (zI000OOo1O) {
                                            }
                                        }
                                    }
                                    z7 = false;
                                    if (oo0lI00l == null) {
                                    }
                                    if (z6) {
/* 190 */                               Oo0olliOi1 oo0olliOi122 = (Oo0olliOi1) i1I0i0Ilo1Oi2.I00iiO;
/* 191 */                               oo0olliOi122.I0000O = -1;
/* 192 */                               oo0olliOi122.I0000oI00 = -1;
/* 193 */                               oo0OI01IlI00000oIO = Oo0OI01Il.I00000oIO(oo0OI01Il, null, 0L, 3);
/* 194 */                               Oo0OI01Il oo0OI01Il42 = (Oo0OI01Il) i1I0i0Ilo1Oi2.I00iiI;
/* 195 */                               i1I0i0Ilo1Oi2.I00iiI = oo0OI01IlI00000oIO;
                                        if (oo0i01111o != null) {
                                        }
/* 197 */                               objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                        iOO0o0I1l2 = iOO0o0I1l;
                                        if (objI00O0i0ii != iOO0o0I1l2) {
                                        }
/* 201 */                               ooiI0IO0oiI = (OoiI0IO0oiI) obj;
/* 202 */                               long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 203 */                               if (ooiI0IO0oiI.I0000oI00) {
                                        }
                                    }
                                }
                            }
                        } else {
                            iiIooOOOI = iiIooOOOI4;
                        }
                        iiIooOOOI2 = iiIooOOOI;
/* 163 */               o111ol0lilll = new O111ol0lilll(i1111OO10i, iiIooOOOI2, iliO0o11i01, oo0lloOiiIOI3, il01100l, z5);
/* 164 */               if (o0oIlOolIO3.I00000oIO != o111ol0lilll) {
                        }
/* 165 */               o0oIlOolIO3.I00000oIO = o111ol0lilll;
/* 166 */               I1I0i0Ilo1Oi i1I0i0Ilo1Oi22 = o0oIlOolIO3.I0000O;
/* 167 */               Oo0i01111o oo0i01111o2 = o0oIlOolIO3.I0000oI00;
/* 168 */               i1I0i0Ilo1Oi22.getClass();
/* 169 */               oo0lI00l = oo0OI01Il.I0000Il00O;
/* 170 */               boolean zI0000O2 = O0000Ioio00.I0000O(oo0lI00l, ((Oo0olliOi1) i1I0i0Ilo1Oi22.I00iiO).I0000Il00O());
/* 173 */               str = ((Oo0OI01Il) i1I0i0Ilo1Oi22.I00iiI).I00000oIO.I00iiI;
/* 174 */               i1111OO10i2 = oo0OI01Il.I00000oIO;
/* 176 */               if (O0000Ioio00.I0000O(str, i1111OO10i2.I00iiI)) {
                        }
                        z7 = false;
                        if (oo0lI00l == null) {
                        }
                        if (z6) {
                        }
                    } else {
                        o1ooiI111i2 = o1ooiI111i;
                        function13 = function12;
                        z4 = z3;
                        oo0OI01Il2 = oo0OI01Il;
                        oo0lloOiiIOI2 = oo0lloOiiIOI;
                        ooooioIi0I2 = ooooioIi0I;
/* 425 */               iloI0lOlll14.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 426 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        IOooOilIlI iOooOilIlI = new IOooOilIlI();
                        iOooOilIlI.I00iOIl = oo0OI01Il2;
                        iOooOilIlI.I00iiI = function1;
                        iOooOilIlI.I00iiO = o1ooiI111i2;
                        iOooOilIlI.I00iio = oo0lloOiiIOI2;
                        iOooOilIlI.I00ilI0I1 = ooooioIi0I2;
                        iOooOilIlI.I00ilO0 = function13;
                        iOooOilIlI.I00io1l = oI0lOIiOIOOo2;
                        iOooOilIlI.I00ioIO = iII11l1I;
                        iOooOilIlI.I00l0I0l0lO1 = z13;
                        iOooOilIlI.I00l0OO0IO = i11;
                        iOooOilIlI.I00li1OI = i2;
                        iOooOilIlI.I00ll1 = ioiiO1O1;
                        iOooOilIlI.I00lli11 = o0OO00i;
                        iOooOilIlI.I00lll10 = z2;
                        iOooOilIlI.I00o0iI0io1 = z4;
                        iOooOilIlI.I00o0l1o1o0 = iOii1l;
                        iOooOilIlI.I00o101lO = i3;
                        iOooOilIlI.I00oI0i = i4;
                        VarHandle.storeStoreFence();
/* 427 */               oOloioIlI001IO000.I0000O = iOooOilIlI;
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, Oo0IOoOi01 oo0IOoOi01, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(2036174316);
/* 28 */            int i2 = i | (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(oo0IOoOi01) ? 32 : 16);
/* 45 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 49 */                O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, true);
/* 55 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 59 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 63 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i);
/* 69 */                IOl0oi0lOl1.I000lI.getClass();
/* 72 */                iloI0lOlll1.I00i0oil();
/* 77 */                if (iloI0lOlll1.I00O10llo) {
/* 81 */                    iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 85 */                    iloI0lOlll1.I00io1l();
                        }
/* 90 */                li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 95 */                li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 104 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 107 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 112 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 119 */               iioO1o.I00000oOI(oo0IOoOi01, iOii1l, iloI0lOlll1, (i2 >> 3) & 126);
/* 122 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 126 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 129 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 133 */           if (oOloioIlI001IO000 != null) {
/* 138 */               I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(7);
/* 141 */               i01oi1lIIO.I00iiI = o1ooiI111i;
/* 143 */               i01oi1lIIO.I00iiO = oo0IOoOi01;
/* 145 */               i01oi1lIIO.I00iio = iOii1l;
/* 147 */               VarHandle.storeStoreFence();
/* 150 */               oOloioIlI001IO000.I0000O = i01oi1lIIO;
                    }
                }

                public static final void I0000Il00O(Oo0IOoOi01 oo0IOoOi01, boolean z, IloI0lOlll1 iloI0lOlll1, int i) {
                    Oo0il0olo1l oo0il0olo1lI0000O;
/* 4 */             iloI0lOlll1.I00i0O(626339208);
/* 29 */            int i2 = i | (iloI0lOlll1.I000OOo1O(oo0IOoOi01) ? 4 : 2) | (iloI0lOlll1.I000O01llI0(z) ? 32 : 16);
/* 47 */            if (!iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 343 */               iloI0lOlll1.I00OilO00Il();
                    } else if (z) {
/* 54 */                iloI0lOlll1.I00i01iIIliI(1530097388);
/* 57 */                O0oIlOolIO o0oIlOolIO = oo0IOoOi01.I0000O;
/* 59 */                Oo0iil0o0oI oo0iil0o0oI = null;
/* 60 */                if (o0oIlOolIO != null && (oo0il0olo1lI0000O = o0oIlOolIO.I0000O()) != null) {
/* 68 */                    Oo0iil0o0oI oo0iil0o0oI2 = oo0il0olo1lI0000O.I00000oIO;
/* 70 */                    O0oIlOolIO o0oIlOolIO2 = oo0IOoOi01.I0000O;
/* 78 */                    if (!(o0oIlOolIO2 != null ? o0oIlOolIO2.I00100l0 : true)) {
/* 80 */                        oo0iil0o0oI = oo0iil0o0oI2;
                            }
                        }
/* 81 */                if (oo0iil0o0oI == null) {
/* 86 */                    iloI0lOlll1.I00i01iIIliI(1530097387);
/* 89 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
/* 94 */                    iloI0lOlll1.I00i01iIIliI(1530097388);
/* 107 */                   if (Oo0lI00l.I0000O(oo0IOoOi01.I000l1().I00000oOI)) {
/* 261 */                       iloI0lOlll1.I00i01iIIliI(2110860558);
/* 264 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 112 */                       iloI0lOlll1.I00i01iIIliI(2109807302);
/* 126 */                       int iI000o00OoI0I = oo0IOoOi01.I00000oOI.I000o00OoI0I((int) (oo0IOoOi01.I000l1().I00000oOI >> 32));
/* 145 */                       int iI000o00OoI0I2 = oo0IOoOi01.I00000oOI.I000o00OoI0I((int) (oo0IOoOi01.I000l1().I00000oOI & 4294967295L));
/* 149 */                       Oi0il01O01IO oi0il01O01IOI00000oIO = oo0iil0o0oI.I00000oIO(iI000o00OoI0I);
/* 158 */                       Oi0il01O01IO oi0il01O01IOI00000oIO2 = oo0iil0o0oI.I00000oIO(Math.max(iI000o00OoI0I2 - 1, 0));
/* 162 */                       O0oIlOolIO o0oIlOolIO3 = oo0IOoOi01.I0000O;
/* 164 */                       if (o0oIlOolIO3 == null || !((Boolean) o0oIlOolIO3.I000lI.getValue()).booleanValue()) {
/* 202 */                           iloI0lOlll1.I00i01iIIliI(2110490542);
/* 205 */                           iloI0lOlll1.I0010I0i(false);
                                } else {
/* 183 */                           iloI0lOlll1.I00i01iIIliI(2110225306);
/* 192 */                           lOl1iI1i.I00000oIO(true, oi0il01O01IOI00000oIO, oo0IOoOi01, iloI0lOlll1, ((i2 << 6) & 896) | 6);
/* 195 */                           iloI0lOlll1.I0010I0i(false);
                                }
/* 208 */                       O0oIlOolIO o0oIlOolIO4 = oo0IOoOi01.I0000O;
/* 210 */                       if (o0oIlOolIO4 == null || !((Boolean) o0oIlOolIO4.I000o00OoI0I.getValue()).booleanValue()) {
/* 248 */                           iloI0lOlll1.I00i01iIIliI(2110838734);
/* 251 */                           iloI0lOlll1.I0010I0i(false);
                                } else {
/* 229 */                           iloI0lOlll1.I00i01iIIliI(2110574459);
/* 238 */                           lOl1iI1i.I00000oIO(false, oi0il01O01IOI00000oIO2, oo0IOoOi01, iloI0lOlll1, ((i2 << 6) & 896) | 6);
/* 241 */                           iloI0lOlll1.I0010I0i(false);
                                }
/* 254 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 267 */                   O0oIlOolIO o0oIlOolIO5 = oo0IOoOi01.I0000O;
/* 269 */                   if (o0oIlOolIO5 != null) {
/* 271 */                       OIooliIO0 oIooliIO0 = o0oIlOolIO5.I000l1;
/* 291 */                       if (!O0000Ioio00.I0000O(oo0IOoOi01.I001IIilI0O.I00000oIO.I00iiI, oo0IOoOi01.I000l1().I00000oIO.I00iiI)) {
/* 295 */                           oIooliIO0.setValue(Boolean.FALSE);
                                }
/* 302 */                       if (o0oIlOolIO5.I00000oOI()) {
/* 314 */                           if (((Boolean) oIooliIO0.getValue()).booleanValue()) {
/* 316 */                               oo0IOoOi01.I0010o();
                                    } else {
/* 320 */                               oo0IOoOi01.I000lI();
                                    }
                                }
                            }
/* 323 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 326 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 333 */               iloI0lOlll1.I00i01iIIliI(1989076778);
/* 336 */               iloI0lOlll1.I0010I0i(false);
/* 339 */               oo0IOoOi01.I000lI();
                    }
/* 346 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 350 */           if (oOloioIlI001IO000 != null) {
/* 355 */               I1IIol00oIo0 i1IIol00oIo0 = new I1IIol00oIo0(3);
/* 358 */               i1IIol00oIo0.I00iiO = oo0IOoOi01;
/* 360 */               i1IIol00oIo0.I00iiI = z;
/* 362 */               VarHandle.storeStoreFence();
/* 365 */               oOloioIlI001IO000.I0000O = i1IIol00oIo0;
                    }
                }

                public static final void I0000O(Oo0IOoOi01 oo0IOoOi01, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
                    I1111OO10i i1111OO10iI000iOII;
/* 4 */             iloI0lOlll1.I00i0O(-1436003720);
/* 17 */            int i2 = i | (iloI0lOlll1.I000OOo1O(oo0IOoOi01) ? 4 : 2);
/* 21 */            int i3 = 0;
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 34 */                O0oIlOolIO o0oIlOolIO = oo0IOoOi01.I0000O;
/* 36 */                if (o0oIlOolIO == null || !((Boolean) o0oIlOolIO.I000oI1ioi.getValue()).booleanValue() || (i1111OO10iI000iOII = oo0IOoOi01.I000iOII()) == null || i1111OO10iI000iOII.I00iiI.length() <= 0) {
/* 299 */                   iloI0lOlll12 = iloI0lOlll1;
/* 303 */                   iloI0lOlll12.I00i01iIIliI(-2111042550);
/* 306 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 69 */                    iloI0lOlll1.I00i01iIIliI(-2112351432);
/* 72 */                    boolean zI000II = iloI0lOlll1.I000II(oo0IOoOi01);
/* 76 */                    Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 80 */                    Object obj = IOl11li.I00000oIO;
                            Object obj2 = objI00O0i0ii;
/* 82 */                    if (zI000II || objI00O0i0ii == obj) {
/* 88 */                        Oo0IIoOI oo0IIoOI = new Oo0IIoOI();
/* 91 */                        oo0IIoOI.I00000oIO = oo0IOoOi01;
/* 93 */                        VarHandle.storeStoreFence();
/* 96 */                        iloI0lOlll1.I00iio(oo0IIoOI);
                                obj2 = oo0IIoOI;
                            }
/* 99 */                    Object obj3 = (OlooOo) obj2;
/* 107 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 109 */                   OIOlOI oIOlOI = oo0IOoOi01.I00000oOI;
/* 115 */                   long j = oo0IOoOi01.I000l1().I00000oOI;
/* 117 */                   int i4 = Oo0lI00l.I0000Il00O;
/* 123 */                   int iI000o00OoI0I = oIOlOI.I000o00OoI0I((int) (j >> 32));
/* 127 */                   O0oIlOolIO o0oIlOolIO2 = oo0IOoOi01.I0000O;
/* 137 */                   Oo0iil0o0oI oo0iil0o0oI = (o0oIlOolIO2 != null ? o0oIlOolIO2.I0000O() : null).I00000oIO;
/* 153 */                   OOo0IO oOo0IOI0000Il00O = oo0iil0o0oI.I0000Il00O(lIiioliIlo.I0000Il00O(iI000o00OoI0I, 0, oo0iil0o0oI.I00000oIO.I00000oIO.I00iiI.length()));
/* 187 */                   long jFloatToRawIntBits = (Float.floatToRawIntBits((iiIooOOOI.I00i0ilIl0i(2.0f) / 2.0f) + oOo0IOI0000Il00O.I00000oIO) << 32) | (Float.floatToRawIntBits(oOo0IOI0000Il00O.I0000O) & 4294967295L);
/* 188 */                   boolean zI0001Ioi1lo = iloI0lOlll1.I0001Ioi1lo(jFloatToRawIntBits);
/* 192 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                            Object obj4 = objI00O0i0ii2;
/* 196 */                   if (zI0001Ioi1lo || objI00O0i0ii2 == obj) {
/* 202 */                       IOoolO iOoolO = new IOoolO();
/* 205 */                       iOoolO.I00iOIl = jFloatToRawIntBits;
/* 207 */                       VarHandle.storeStoreFence();
/* 210 */                       iloI0lOlll1.I00iio(iOoolO);
                                obj4 = iOoolO;
                            }
/* 214 */                   OIOlil0i oIOlil0i = (OIOlil0i) obj4;
/* 224 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj3) | iloI0lOlll1.I000OOo1O(oo0IOoOi01);
/* 225 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                            Object obj5 = objI00O0i0ii3;
/* 229 */                   if (zI000OOo1O || objI00O0i0ii3 == obj) {
/* 235 */                       IOooo0i iOooo0i = new IOooo0i(i3);
/* 238 */                       iOooo0i.I00000oOI = obj3;
/* 240 */                       iOooo0i.I0000Il00O = oo0IOoOi01;
/* 242 */                       VarHandle.storeStoreFence();
/* 245 */                       iloI0lOlll1.I00iio(iOooo0i);
                                obj5 = iOooo0i;
                            }
/* 252 */                   O1ooiI111i o1ooiI111iI00000oIO = Oll10I.I00000oIO(O1ooIo101ll.I00000oIO, obj3, (PointerInputEventHandler) obj5);
/* 256 */                   boolean zI0001Ioi1lo2 = iloI0lOlll1.I0001Ioi1lo(jFloatToRawIntBits);
/* 260 */                   Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                            Object obj6 = objI00O0i0ii4;
/* 264 */                   if (zI0001Ioi1lo2 || objI00O0i0ii4 == obj) {
/* 271 */                       I0o0iioo0IO i0o0iioo0IO = new I0o0iioo0IO(3);
/* 274 */                       i0o0iioo0IO.I00iiI = jFloatToRawIntBits;
/* 276 */                       VarHandle.storeStoreFence();
/* 279 */                       iloI0lOlll1.I00iio(i0o0iioo0IO);
                                obj6 = i0o0iioo0IO;
                            }
/* 291 */                   iloI0lOlll12 = iloI0lOlll1;
/* 292 */                   I0o0ioOO.I00000oIO(oIOlil0i, OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oIO, false, (Function1) obj6), 0L, iloI0lOlll12, 0);
/* 295 */                   iloI0lOlll12.I0010I0i(false);
                        }
                    } else {
/* 310 */               iloI0lOlll12 = iloI0lOlll1;
/* 311 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 314 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 318 */           if (oOloioIlI001IO000 != null) {
/* 324 */               I00oooO i00oooO = new I00oooO(14);
/* 327 */               i00oooO.I00iiI = oo0IOoOi01;
/* 329 */               VarHandle.storeStoreFence();
/* 332 */               oOloioIlI001IO000.I0000O = i00oooO;
                    }
                }

                public static final void I0000oI00(O0oIlOolIO o0oIlOolIO) {
/* 1 */             Oo0i01111o oo0i01111o = o0oIlOolIO.I0000oI00;
/* 4 */             if (oo0i01111o != null) {
/* 21 */                o0oIlOolIO.I001IO000.invoke(Oo0OI01Il.I00000oIO((Oo0OI01Il) o0oIlOolIO.I0000O.I00iiI, null, 0L, 3));
/* 24 */                Oo0Oo0 oo0Oo0 = oo0i01111o.I00000oIO;
/* 32 */                if (oo0Oo0.I00000oOI.compareAndSet(oo0i01111o, null)) {
/* 36 */                    oo0Oo0.I00000oIO.I0000O();
                        }
                    }
/* 39 */            o0oIlOolIO.I0000oI00 = null;
                }

                public static final void I0001Ioi1lo(O0oIlOolIO o0oIlOolIO, Oo0OI01Il oo0OI01Il, OIOlOI oIOlOI) {
/* 1 */             Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 13 */            Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 15 */            Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                    try {
/* 19 */                Oo0il0olo1l oo0il0olo1lI0000O = o0oIlOolIO.I0000O();
/* 23 */                if (oo0il0olo1lI0000O == null) {
/* 28 */                    return;
                        }
/* 29 */                Oo0i01111o oo0i01111o = o0oIlOolIO.I0000oI00;
/* 31 */                if (oo0i01111o == null) {
/* 36 */                    return;
                        }
/* 37 */                O0iOOo0Ii o0iOOo0IiI0000Il00O = o0oIlOolIO.I0000Il00O();
/* 41 */                if (o0iOOo0IiI0000Il00O == null) {
/* 46 */                    return;
                        }
/* 57 */                lOl0i1o.I00000oIO(oo0OI01Il, o0oIlOolIO.I00000oIO, oo0il0olo1lI0000O.I00000oIO, o0iOOo0IiI0000Il00O, oo0i01111o, o0oIlOolIO.I00000oOI(), oIOlOI);
                    } finally {
/* 66 */                iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
                    }
                }

                public static final void I000II(Oo0Oo0 oo0Oo0, O0oIlOolIO o0oIlOolIO, Oo0OI01Il oo0OI01Il, IoiiO1O1 ioiiO1O1, OIOlOI oIOlOI) {
/* 1 */             I1I0i0Ilo1Oi i1I0i0Ilo1Oi = o0oIlOolIO.I0000O;
/* 3 */             IOooI1o iOooI1o = o0oIlOolIO.I001IO000;
/* 5 */             IOooI1o iOooI1o2 = o0oIlOolIO.I001i1O0Ol;
/* 9 */             OOo0ooi oOo0ooi = new OOo0ooi();
/* 16 */            O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(14);
/* 19 */            o11IOOoiI10i.I00iiI = i1I0i0Ilo1Oi;
/* 21 */            o11IOOoiI10i.I00iiO = iOooI1o;
/* 23 */            o11IOOoiI10i.I00iio = oOo0ooi;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            OO1OOi oO1OOi = oo0Oo0.I00000oIO;
/* 30 */            oO1OOi.I0000Il00O(oo0OI01Il, ioiiO1O1, o11IOOoiI10i, iOooI1o2);
/* 35 */            Oo0i01111o oo0i01111o = new Oo0i01111o(oo0Oo0, oO1OOi);
/* 40 */            oo0Oo0.I00000oOI.set(oo0i01111o);
/* 43 */            oOo0ooi.I00iOIl = oo0i01111o;
/* 45 */            o0oIlOolIO.I0000oI00 = oo0i01111o;
/* 47 */            I0001Ioi1lo(o0oIlOolIO, oo0OI01Il, oIOlOI);
                }
            }

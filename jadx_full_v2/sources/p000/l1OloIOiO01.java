            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1OloIOiO01 {
                /* JADX WARN: Removed duplicated region for block: B:113:0x01b8  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x01bb  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x01cc  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x01f0  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x01f9  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x0202  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0205  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x020d A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:138:0x020f  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x027e  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x02b3  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x02c7  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x02e4  */
                /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, Ol010000lo00 ol010000lo00, float f, boolean z, OioOIi1o0I oioOIi1o0I, long j, long j2, long j3, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2, O1oI0oOoi o1oI0oOoi, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2, int i3) {
                    int i4;
                    O1ooiI111i o1ooiI111i2;
                    Ol010000lo00 ol010000lo002;
                    long jI0000oI00;
                    int i5;
                    int i6;
                    int i7;
                    float f2;
                    boolean z2;
                    long j4;
                    IlliIl1l11O illiIl1l11O3;
                    O1oI0oOoi o1oI0oOoi2;
                    O1ooiI111i o1ooiI111i3;
                    long j5;
                    OioOIi1o0I oioOIi1o0I2;
                    long j6;
                    IlliIl1l11O illiIl1l11O4;
                    OOloioIl oOloioIlI001IO000;
                    Ol010000lo00 ol010000lo00I00000oOI;
                    O1oI0oOoi o1oI0oOoi3;
                    long j7;
                    IlliIl1l11O illiIl1l11O5;
                    IlliIl1l11O illiIl1l11O6;
                    int i8;
                    OioOIi1o0I oioOIi1o0I3;
                    long j8;
                    IlliIl1l11O illiIl1l11O7;
                    boolean z3;
                    boolean zI000OOo1O;
                    IlliIl1l11O illiIl1l11O8;
                    Object obj;
                    int i9;
                    boolean z4;
                    boolean zI000OOo1O2;
                    Object obj2;
                    int i10;
/* 1 */             iloI0lOlll1.I00i0O(1904798512);
                    if ((i & 6) == 0) {
                        i4 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
                        i4 = i;
                    }
                    int i11 = i3 & 2;
                    if (i11 == 0) {
                        if ((i & 48) == 0) {
                            o1ooiI111i2 = o1ooiI111i;
                            i4 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
                        if ((i & 384) != 0) {
                            if ((i3 & 4) == 0) {
                                ol010000lo002 = ol010000lo00;
                                if (iloI0lOlll1.I000II(ol010000lo002)) {
                                    i10 = Barcode.FORMAT_QR_CODE;
                                }
                                i4 |= i10;
                            } else {
                                ol010000lo002 = ol010000lo00;
                            }
                            i10 = Barcode.FORMAT_ITF;
                            i4 |= i10;
                        } else {
                            ol010000lo002 = ol010000lo00;
                        }
                        int i12 = i4 | 27648;
                        if ((196608 & i) == 0) {
                            i12 = 93184 | i4;
                        }
                        if ((1572864 & i) != 0) {
                            jI0000oI00 = j;
                            i12 |= ((i3 & 64) == 0 && iloI0lOlll1.I0001Ioi1lo(jI0000oI00)) ? 1048576 : 524288;
                        } else {
                            jI0000oI00 = j;
                        }
                        if ((12582912 & i) == 0) {
                            i12 |= 4194304;
                        }
                        i5 = 100663296 | i12;
                        if ((i & 805306368) == 0) {
                            i5 = 369098752 | i12;
                        }
                        i6 = i3 & Barcode.FORMAT_UPC_E;
                        if (i6 == 0) {
                            i7 = 3078;
                        } else if ((i2 & 6) == 0) {
                            i7 = i2 | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 4 : 2);
                        } else {
                            i7 = i2;
                        }
                        boolean z5 = true;
                        if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 306783379) == 306783378 || ((i7 | 400) & 1171) != 1170)) {
/* 48 */                    iloI0lOlll1.I00OilO00Il();
                            f2 = f;
                            z2 = z;
                            j4 = j3;
                            illiIl1l11O3 = illiIl1l11O;
                            o1oI0oOoi2 = o1oI0oOoi;
                            o1ooiI111i3 = o1ooiI111i2;
                            j5 = jI0000oI00;
                            oioOIi1o0I2 = oioOIi1o0I;
                            j6 = j2;
                            illiIl1l11O4 = illiIl1l11O2;
                        } else {
                            iloI0lOlll1.I00Ol00();
                            if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 3 */                         o1ooiI111i3 = i11 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
                                if ((i3 & 4) != 0) {
/* 4 */                             Ol010l0o0O ol010l0o0O = Ol010l0o0O.I00iOIl;
                                    ol010000lo00I00000oOI = Ol00iioo.I00000oOI(iloI0lOlll1);
                                    i5 &= -897;
                                } else {
                                    ol010000lo00I00000oOI = ol010000lo002;
                                }
/* 5 */                         float f3 = II1Il0I.I00000oOI;
/* 6 */                         II1Il0I iI1Il0I = II1Il0I.I00000oIO;
/* 8 */                         OioOIi1o0I oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(Ol00IO.I00000oOI, iloI0lOlll1);
                                int i13 = i5 & (-458753);
                                if ((i3 & 64) != 0) {
/* 10 */                            jI0000oI00 = IOOl0iiliOl.I0000oI00(Ol00IO.I00000oIO, iloI0lOlll1);
                                    i13 = i5 & (-4128769);
                                }
/* 11 */                        long jI00000oOI = IOOl0iiliOl.I00000oOI(jI0000oI00, iloI0lOlll1);
                                Ol010000lo00 ol010000lo003 = ol010000lo00I00000oOI;
/* 13 */                        long jI0000Il00O = IOOiio0i.I0000Il00O(0.32f, IOOl0iiliOl.I0000oI00(OiOi0Oo.I00000oIO, iloI0lOlll1));
                                int i14 = i13 & (-1908408321);
/* 14 */                        IlliIl1l11O illiIl1l11O9 = i6 != 0 ? i1ilI1Oiio.I00000oIO : illiIl1l11O;
/* 15 */                        IiI01lI iiI01lI = new IiI01lI(17);
/* 17 */                        O1oI0oOoi o1oI0oOoi4 = new O1oI0oOoi();
/* 18 */                        Oii0IOl oii0IOl = Oii0IOl.I00iOIl;
                                o1oI0oOoi3 = o1oI0oOoi4;
                                j7 = jI0000Il00O;
                                f2 = f3;
                                illiIl1l11O5 = iiI01lI;
                                illiIl1l11O6 = illiIl1l11O9;
                                ol010000lo002 = ol010000lo003;
                                i8 = i14;
                                oioOIi1o0I3 = oioOIi1o0II00000oOI;
                                z2 = true;
                                j8 = jI00000oOI;
                            } else {
/* 2 */                         iloI0lOlll1.I00OilO00Il();
                                if ((i3 & 4) != 0) {
                                    i5 &= -897;
                                }
                                int i15 = i5 & (-458753);
                                if ((i3 & 64) != 0) {
                                    i15 = i5 & (-4128769);
                                }
                                z2 = z;
                                oioOIi1o0I3 = oioOIi1o0I;
                                j7 = j3;
                                illiIl1l11O5 = illiIl1l11O2;
                                o1oI0oOoi3 = o1oI0oOoi;
                                i8 = i15 & (-1908408321);
                                o1ooiI111i3 = o1ooiI111i2;
                                f2 = f;
                                j8 = j2;
                                illiIl1l11O6 = illiIl1l11O;
                            }
/* 19 */                    iloI0lOlll1.I0010o();
/* 20 */                    Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                            long j9 = jI0000oI00;
/* 21 */                    Object obj3 = IOl11li.I00000oIO;
                            if (objI00O0i0ii == obj3) {
/* 22 */                        objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 23 */                        iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 24 */                    Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
                            int i16 = (i8 & 896) ^ 384;
                            OioOIi1o0I oioOIi1o0I4 = oioOIi1o0I3;
/* 25 */                    if (i16 <= 256 || !iloI0lOlll1.I000II(ol010000lo002)) {
                                illiIl1l11O7 = illiIl1l11O5;
                                if ((i8 & 384) != 256) {
                                    z3 = false;
                                }
                                int i17 = i8 & 14;
                                zI000OOo1O = z3 | iloI0lOlll1.I000OOo1O(ii0110) | (i17 != 4);
/* 26 */                        Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                if (!zI000OOo1O || objI00O0i0ii2 == obj3) {
                                    illiIl1l11O8 = illiIl1l11O6;
/* 27 */                            I0O1111oo i0O1111oo = new I0O1111oo(5);
                                    i0O1111oo.I00iiI = ol010000lo002;
                                    i0O1111oo.I00iio = ii0110;
                                    i0O1111oo.I00iiO = illOOo00lI;
                                    VarHandle.storeStoreFence();
/* 28 */                            iloI0lOlll1.I00iio(i0O1111oo);
                                    obj = i0O1111oo;
                                } else {
                                    illiIl1l11O8 = illiIl1l11O6;
                                    obj = objI00O0i0ii2;
                                }
/* 29 */                        IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj;
/* 30 */                        if (i16 > 256 || !iloI0lOlll1.I000II(ol010000lo002)) {
                                    i9 = i16;
                                    if ((i8 & 384) != 256) {
                                        z4 = false;
                                    }
                                    zI000OOo1O2 = (i17 == 4) | z4 | iloI0lOlll1.I000OOo1O(ii0110);
/* 31 */                            Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                                    obj2 = objI00O0i0ii3;
                                    if (zI000OOo1O2 || objI00O0i0ii3 == obj3) {
/* 32 */                                I0O1111oo i0O1111oo2 = new I0O1111oo(6);
                                        i0O1111oo2.I00iiI = ol010000lo002;
                                        i0O1111oo2.I00iio = ii0110;
                                        i0O1111oo2.I00iiO = illOOo00lI;
                                        VarHandle.storeStoreFence();
/* 33 */                                iloI0lOlll1.I00iio(i0O1111oo2);
                                        obj2 = i0O1111oo2;
                                    }
/* 35 */                            O1o1o0OoliI o1o1o0OoliI = new O1o1o0OoliI();
                                    o1o1o0OoliI.I00iOIl = ol010000lo002;
                                    o1o1o0OoliI.I00iiI = o1oI0oOoi3;
                                    o1o1o0OoliI.I00iiO = illOOo00lI2;
                                    o1o1o0OoliI.I00iio = j7;
                                    o1o1o0OoliI.I00ilI0I1 = o1ooiI111i3;
                                    o1o1o0OoliI.I00ilO0 = illOOo00lI;
                                    o1o1o0OoliI.I00io1l = f2;
                                    o1o1o0OoliI.I00ioIO = z2;
                                    IlliIl1l11O illiIl1l11O10 = illiIl1l11O8;
                                    o1o1o0OoliI.I00l0I0l0lO1 = illiIl1l11O10;
                                    IlliIl1l11O illiIl1l11O11 = illiIl1l11O7;
                                    o1o1o0OoliI.I00l0OO0IO = illiIl1l11O11;
                                    oioOIi1o0I2 = oioOIi1o0I4;
                                    o1o1o0OoliI.I00li1OI = oioOIi1o0I2;
                                    long j10 = j7;
                                    o1o1o0OoliI.I00ll1 = j9;
                                    o1o1o0OoliI.I00lli11 = j8;
                                    O1oI0oOoi o1oI0oOoi5 = o1oI0oOoi3;
                                    o1o1o0OoliI.I00lll10 = iOii1l;
                                    VarHandle.storeStoreFence();
/* 36 */                            l1Oloi1o.I00000oIO((IllOOo00lI) obj2, j8, o1oI0oOoi5, iiioOl1O.I00000oOI(-1328793519, o1o1o0OoliI, iloI0lOlll1), iloI0lOlll1, 3456);
/* 38 */                            if (ol010000lo002.I0000oI00.I0000Il00O().I0000Il00O(Ol010l0o0O.I00iiI)) {
/* 46 */                                iloI0lOlll1.I00i01iIIliI(748241522);
/* 47 */                                iloI0lOlll1.I0010I0i(false);
                                    } else {
/* 39 */                                iloI0lOlll1.I00i01iIIliI(748180018);
/* 40 */                                if ((i9 <= 256 || !iloI0lOlll1.I000II(ol010000lo002)) && (i8 & 384) != 256) {
                                            z5 = false;
                                        }
/* 41 */                                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                                        if (z5 || objI00O0i0ii4 == obj3) {
/* 42 */                                    objI00O0i0ii4 = new II1OIi(ol010000lo002, null, 7);
/* 43 */                                    iloI0lOlll1.I00iio(objI00O0i0ii4);
                                        }
/* 44 */                                iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii4, iloI0lOlll1, ol010000lo002);
/* 45 */                                iloI0lOlll1.I0010I0i(false);
                                    }
                                    illiIl1l11O4 = illiIl1l11O11;
                                    o1oI0oOoi2 = o1oI0oOoi5;
                                    illiIl1l11O3 = illiIl1l11O10;
                                    j5 = j9;
                                    j4 = j10;
                                    j6 = j8;
                                } else {
                                    i9 = i16;
                                }
                                z4 = true;
                                zI000OOo1O2 = (i17 == 4) | z4 | iloI0lOlll1.I000OOo1O(ii0110);
/* 31 */                        Object objI00O0i0ii32 = iloI0lOlll1.I00O0i0ii();
                                obj2 = objI00O0i0ii32;
                                if (zI000OOo1O2) {
/* 32 */                            I0O1111oo i0O1111oo22 = new I0O1111oo(6);
                                    i0O1111oo22.I00iiI = ol010000lo002;
                                    i0O1111oo22.I00iio = ii0110;
                                    i0O1111oo22.I00iiO = illOOo00lI;
                                    VarHandle.storeStoreFence();
/* 33 */                            iloI0lOlll1.I00iio(i0O1111oo22);
                                    obj2 = i0O1111oo22;
/* 35 */                            O1o1o0OoliI o1o1o0OoliI2 = new O1o1o0OoliI();
                                    o1o1o0OoliI2.I00iOIl = ol010000lo002;
                                    o1o1o0OoliI2.I00iiI = o1oI0oOoi3;
                                    o1o1o0OoliI2.I00iiO = illOOo00lI2;
                                    o1o1o0OoliI2.I00iio = j7;
                                    o1o1o0OoliI2.I00ilI0I1 = o1ooiI111i3;
                                    o1o1o0OoliI2.I00ilO0 = illOOo00lI;
                                    o1o1o0OoliI2.I00io1l = f2;
                                    o1o1o0OoliI2.I00ioIO = z2;
                                    IlliIl1l11O illiIl1l11O102 = illiIl1l11O8;
                                    o1o1o0OoliI2.I00l0I0l0lO1 = illiIl1l11O102;
                                    IlliIl1l11O illiIl1l11O112 = illiIl1l11O7;
                                    o1o1o0OoliI2.I00l0OO0IO = illiIl1l11O112;
                                    oioOIi1o0I2 = oioOIi1o0I4;
                                    o1o1o0OoliI2.I00li1OI = oioOIi1o0I2;
                                    long j102 = j7;
                                    o1o1o0OoliI2.I00ll1 = j9;
                                    o1o1o0OoliI2.I00lli11 = j8;
                                    O1oI0oOoi o1oI0oOoi52 = o1oI0oOoi3;
                                    o1o1o0OoliI2.I00lll10 = iOii1l;
                                    VarHandle.storeStoreFence();
/* 36 */                            l1Oloi1o.I00000oIO((IllOOo00lI) obj2, j8, o1oI0oOoi52, iiioOl1O.I00000oOI(-1328793519, o1o1o0OoliI2, iloI0lOlll1), iloI0lOlll1, 3456);
/* 38 */                            if (ol010000lo002.I0000oI00.I0000Il00O().I0000Il00O(Ol010l0o0O.I00iiI)) {
                                    }
                                    illiIl1l11O4 = illiIl1l11O112;
                                    o1oI0oOoi2 = o1oI0oOoi52;
                                    illiIl1l11O3 = illiIl1l11O102;
                                    j5 = j9;
                                    j4 = j102;
                                    j6 = j8;
                                }
                            } else {
                                illiIl1l11O7 = illiIl1l11O5;
                            }
                            z3 = true;
                            int i172 = i8 & 14;
                            zI000OOo1O = z3 | iloI0lOlll1.I000OOo1O(ii0110) | (i172 != 4);
/* 26 */                    Object objI00O0i0ii22 = iloI0lOlll1.I00O0i0ii();
                            if (zI000OOo1O) {
                                illiIl1l11O8 = illiIl1l11O6;
/* 27 */                        I0O1111oo i0O1111oo3 = new I0O1111oo(5);
                                i0O1111oo3.I00iiI = ol010000lo002;
                                i0O1111oo3.I00iio = ii0110;
                                i0O1111oo3.I00iiO = illOOo00lI;
                                VarHandle.storeStoreFence();
/* 28 */                        iloI0lOlll1.I00iio(i0O1111oo3);
                                obj = i0O1111oo3;
/* 29 */                        IllOOo00lI illOOo00lI22 = (IllOOo00lI) obj;
                                if (i16 > 256) {
                                    i9 = i16;
                                    if ((i8 & 384) != 256) {
                                        z4 = true;
                                    }
                                    zI000OOo1O2 = (i172 == 4) | z4 | iloI0lOlll1.I000OOo1O(ii0110);
/* 31 */                            Object objI00O0i0ii322 = iloI0lOlll1.I00O0i0ii();
                                    obj2 = objI00O0i0ii322;
                                    if (zI000OOo1O2) {
                                    }
                                }
                            }
                        }
/* 49 */                oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                        if (oOloioIlI001IO000 == null) {
                            O1oI0IIOOO1 o1oI0IIOOO1 = new O1oI0IIOOO1();
                            o1oI0IIOOO1.I00iOIl = illOOo00lI;
                            o1oI0IIOOO1.I00iiI = o1ooiI111i3;
                            o1oI0IIOOO1.I00iiO = ol010000lo002;
                            o1oI0IIOOO1.I00iio = f2;
                            o1oI0IIOOO1.I00ilI0I1 = z2;
                            o1oI0IIOOO1.I00ilO0 = oioOIi1o0I2;
                            o1oI0IIOOO1.I00io1l = j5;
                            o1oI0IIOOO1.I00ioIO = j6;
                            o1oI0IIOOO1.I00l0I0l0lO1 = j4;
                            o1oI0IIOOO1.I00l0OO0IO = illiIl1l11O3;
                            o1oI0IIOOO1.I00li1OI = illiIl1l11O4;
                            o1oI0IIOOO1.I00ll1 = o1oI0oOoi2;
                            o1oI0IIOOO1.I00lli11 = iOii1l;
                            o1oI0IIOOO1.I00lll10 = i;
                            o1oI0IIOOO1.I00o0iI0io1 = i2;
                            o1oI0IIOOO1.I00o0l1o1o0 = i3;
                            VarHandle.storeStoreFence();
/* 50 */                    oOloioIlI001IO000.I0000O = o1oI0IIOOO1;
                            return;
                        }
                        return;
                    }
                    i4 |= 48;
                    o1ooiI111i2 = o1ooiI111i;
                    if ((i & 384) != 0) {
                    }
                    int i122 = i4 | 27648;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) != 0) {
                    }
                    if ((12582912 & i) == 0) {
                    }
                    i5 = 100663296 | i122;
                    if ((i & 805306368) == 0) {
                    }
                    i6 = i3 & Barcode.FORMAT_UPC_E;
                    if (i6 == 0) {
                    }
                    boolean z52 = true;
                    if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 306783379) == 306783378 || ((i7 | 400) & 1171) != 1170)) {
                    }
/* 49 */            oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final Ol010000lo00 I00000oOI(int i, int i2, IloI0lOlll1 iloI0lOlll1) {
/* 3 */             boolean z = (i2 & 1) == 0;
/* 6 */             Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 12 */            if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 17 */                objI00O0i0ii = new O1o0i0Ol0Oo0(4);
/* 20 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 23 */            Function1 function1 = (Function1) objI00O0i0ii;
/* 25 */            Ol010l0o0O ol010l0o0O = Ol010l0o0O.I00iOIl;
/* 57 */            return Ol00iioo.I0000Il00O(z ? I1IoiO1l.I00IlilI0i0i(new Ol010l0o0O[]{ol010l0o0O, Ol010l0o0O.I00iiI}) : I1IoiO1l.I00IlilI0i0i(new Ol010l0o0O[]{ol010l0o0O, Ol010l0o0O.I00iiO, Ol010l0o0O.I00iiI}), function1, iloI0lOlll1, 196992, 24);
                }
            }

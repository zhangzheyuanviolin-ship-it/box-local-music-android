            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class O1iiIOlO {
                public final IiOili0lOO1 I00000oIO;
                public final IIlio101Io I00000oOI;

                public O1iiIOlO(IiOili0lOO1 iiOili0lOO1) {
/* 4 */             this.I00000oIO = iiOili0lOO1;
/* 10 */            Ii10lIo0l1 ii10lIo0l1 = (Ii10lIo0l1) iiOili0lOO1.I00iiI;
/* 24 */            this.I00000oOI = new IIlio101Io(3, (OI0010oo1o) ii10lIo0l1.I00000oOI, (o01l1ioOo0) ii10lIo0l1.I000iOII);
                }

                public final O0OIoll1 I00000oIO(Ii1Ool1 ii1Ool1) {
/* 3 */             if (!(ii1Ool1 instanceof OIo0il)) {
/* 39 */                if (ii1Ool1 instanceof IiOlI10iOI) {
/* 43 */                    return ((IiOlI10iOI) ii1Ool1).I00oO101o;
                        }
/* 46 */                return null;
                    }
/* 11 */            Ill0IO ill0IO = ((OIo0l0) ((OIo0il) ii1Ool1)).I00ilI0I1;
/* 13 */            IiOili0lOO1 iiOili0lOO1 = this.I00000oIO;
/* 28 */            OOi1I10o oOi1I10o = new OOi1I10o((OI1IlOlol) iiOili0lOO1.I00iiO, (Oi0Oooi) iiOili0lOO1.I00ilI0I1, (IiOlIoIo) iiOili0lOO1.I00ioIO, 2);
/* 31 */            oOi1I10o.I0000oI00 = ill0IO;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            return oOi1I10o;
                }

                public final ArrayList I00000oOI(List list, List list2, I01Ilioliio i01Ilioliio, int i) {
                    I11IlOOO oIIo0Oi1;
/* 3 */             IiOili0lOO1 iiOili0lOO1 = this.I00000oIO;
/* 9 */             IIiIoIl11IO iIiIoIl11IO = (IIiIoIl11IO) ((Ii1Ool1) iiOili0lOO1.I00iio);
/* 15 */            O0OIoll1 o0OIoll1I00000oIO = I00000oIO(iIiIoIl11IO.I000lI());
/* 25 */            ArrayList arrayList = new ArrayList();
/* 32 */            int i2 = 0;
/* 37 */            for (Object obj : list) {
/* 43 */                int i3 = i2 + 1;
/* 45 */                if (i2 < 0) {
/* 148 */                   IOOi1I.I000lI();
/* 151 */                   throw null;
                        }
/* 47 */                OOi001oo1OOI oOi001oo1OOI = (OOi001oo1OOI) obj;
/* 55 */                OOi0iiO0iOi oOi0iiO0iOi = (OOi0iiO0iOi) IOOi0Ool1i.I00II0oii1o(i2, list2);
/* 57 */                int i4 = 1;
/* 68 */                int i5 = (oOi0iiO0iOi == null || (oOi0iiO0iOi.I00iiO & 1) != 1) ? 0 : oOi0iiO0iOi.I00iio;
/* 69 */                if (o0OIoll1I00000oIO == null || !IlO1il.I0000Il00O.I0000oI00(i5).booleanValue()) {
/* 125 */                   oIIo0Oi1 = i1i0olI.I00iiO;
                        } else {
/* 91 */                    O1I0OloI o1I0OloI = (O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO;
/* 95 */                    O1iiIO1OOi o1iiIO1OOi = new O1iiIO1OOi(i4);
/* 98 */                    o1iiIO1OOi.I00iiI = this;
/* 100 */                   o1iiIO1OOi.I00iiO = o0OIoll1I00000oIO;
/* 104 */                   o1iiIO1OOi.I00iio = i01Ilioliio;
/* 108 */                   o1iiIO1OOi.I00ilI0I1 = i;
/* 110 */                   o1iiIO1OOi.I00ilO0 = i2;
/* 112 */                   o1iiIO1OOi.I00io1l = oOi0iiO0iOi;
/* 114 */                   VarHandle.storeStoreFence();
/* 117 */                   oIIo0Oi1 = new OIIo0Oi1(o1I0OloI, o1iiIO1OOi);
                        }
/* 136 */               O0ioOi0Oo1ii o0ioOi0Oo1iiI00000oOI = il0ol10l.I00000oOI(iIiIoIl11IO, ((IOiOol0) iiOili0lOO1.I00l0I0l0lO1).I00Io1lO(oOi001oo1OOI), null, oIIo0Oi1, i2);
/* 140 */               if (o0ioOi0Oo1iiI00000oOI != null) {
/* 142 */                   arrayList.add(o0ioOi0Oo1iiI00000oOI);
                        }
/* 145 */               i2 = i3;
                    }
/* 483 */           return arrayList;
                }

                public final I11IlOOO I0000Il00O(I01Ilioliio i01Ilioliio, int i, int i2) {
/* 11 */            if (!IlO1il.I0000Il00O.I0000oI00(i).booleanValue()) {
/* 13 */                return i1i0olI.I00iiO;
                    }
/* 26 */            O1I0OloI o1I0OloI = (O1I0OloI) ((Ii10lIo0l1) this.I00000oIO.I00iiI).I00000oIO;
/* 31 */            O1ii1lo o1ii1lo = new O1ii1lo(0);
/* 34 */            o1ii1lo.I00iiI = this;
/* 36 */            o1ii1lo.I00iiO = i01Ilioliio;
/* 38 */            o1ii1lo.I00iio = i2;
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            return new OIIo0Oi1(o1I0OloI, o1ii1lo);
                }

                public final I11IlOOO I0000O(OOOo0i11Ol oOOo0i11Ol, boolean z) {
/* 13 */            if (!IlO1il.I0000Il00O.I0000oI00(oOOo0i11Ol.I00iio).booleanValue()) {
/* 15 */                return i1i0olI.I00iiO;
                    }
/* 28 */            O1I0OloI o1I0OloI = (O1I0OloI) ((Ii10lIo0l1) this.I00000oIO.I00iiI).I00000oIO;
/* 32 */            O1iiII1 o1iiII1 = new O1iiII1();
/* 35 */            o1iiII1.I00iOIl = this;
/* 37 */            o1iiII1.I00iiI = z;
/* 39 */            o1iiII1.I00iiO = oOOo0i11Ol;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            return new OIIo0Oi1(o1I0OloI, o1iiII1);
                }

                public final IiOl00I1 I0000oI00(OOOiIOiii oOOiIOiii, boolean z) {
                    IiOiOloo0 iiOiOloo0;
/* 1 */             IiOili0lOO1 iiOili0lOO1 = this.I00000oIO;
/* 7 */             OI000ilOol oI000ilOol = (OI000ilOol) ((Ii1Ool1) iiOili0lOO1.I00iio);
/* 45 */            IiOl00I1 iiOl00I1 = new IiOl00I1(oI000ilOol, null, I0000Il00O(oOOiIOiii, oOOiIOiii.I00iio, 1), z, 1, oOOiIOiii, (OI1IlOlol) iiOili0lOO1.I00iiO, (Oi0Oooi) iiOili0lOO1.I00ilI0I1, (OooO111lO1OI) iiOili0lOO1.I00ilO0, (IiOlIoIo) iiOili0lOO1.I00ioIO, null);
/* 60 */            List listI000O01llI0 = ((O1iiIOlO) iiOili0lOO1.I00000oIO(iiOl00I1, Il01100l.I00iOIl, (OI1IlOlol) iiOili0lOO1.I00iiO, (Oi0Oooi) iiOili0lOO1.I00ilI0I1, (OooO111lO1OI) iiOili0lOO1.I00ilO0, (II0O0I00oOi) iiOili0lOO1.I00io1l).I00l0OO0IO).I000O01llI0(oOOiIOiii.I00ilI0I1, oOOiIOiii, 1);
/* 72 */            OOi110 oOi110 = (OOi110) IlO1il.I0000O.I0000oI00(oOOiIOiii.I00iio);
                    switch (oOi110 == null ? -1 : OOi1Ol0o.I00000oOI[oOi110.ordinal()]) {
                        case 1:
/* 107 */                   iiOiOloo0 = IiOiioI.I0000O;
                            break;
                        case 2:
/* 104 */                   iiOiOloo0 = IiOiioI.I00000oIO;
                            break;
                        case 3:
/* 101 */                   iiOiOloo0 = IiOiioI.I00000oOI;
                            break;
                        case 4:
/* 98 */                    iiOiOloo0 = IiOiioI.I0000Il00O;
                            break;
                        case 5:
/* 95 */                    iiOiOloo0 = IiOiioI.I0000oI00;
                            break;
                        case 6:
/* 92 */                    iiOiOloo0 = IiOiioI.I0001Ioi1lo;
                            break;
                        default:
/* 89 */                    iiOiOloo0 = IiOiioI.I00000oIO;
                            break;
                    }
/* 109 */           iiOl00I1.I011IO1I11OI(listI000O01llI0, iiOiOloo0);
/* 116 */           iiOl00I1.I01101olii(oI000ilOol.I00Ol10());
/* 123 */           iiOl00I1.I00oI0i = oI000ilOol.I00IO1();
/* 138 */           iiOl00I1.I00oOio10iI1 = !IlO1il.I000oI1ioi.I0000oI00(oOOiIOiii.I00iio).booleanValue();
/* 38 */            return iiOl00I1;
                }

                public final IiOoI01 I0001Ioi1lo(OOOll1o0 oOOll1o0) {
                    int i;
                    I11IlOOO iiOillIi;
                    O0iIl1 o0iIl1I00Io1lO;
/* 5 */             IiOili0lOO1 iiOili0lOO1 = this.I00000oIO;
/* 9 */             OI1IlOlol oI1IlOlol = (OI1IlOlol) iiOili0lOO1.I00iiO;
/* 14 */            Oi0Oooi oi0Oooi = (Oi0Oooi) iiOili0lOO1.I00ilI0I1;
/* 18 */            int i2 = 1;
/* 20 */            if ((oOOll1o0.I00iiO & 1) == 1) {
/* 22 */                i = oOOll1o0.I00iio;
                    } else {
/* 26 */                int i3 = oOOll1o0.I00ilI0I1;
/* 34 */                i = ((i3 >> 8) << 6) + (i3 & 63);
                    }
/* 24 */            int i4 = i;
/* 36 */            I11IlOOO i11IlOOOI0000Il00O = I0000Il00O(oOOll1o0, i4, 1);
/* 40 */            int i5 = oOOll1o0.I00iiO;
/* 46 */            if ((i5 & 32) == 32 || (i5 & 64) == 64) {
/* 62 */                O1I0OloI o1I0OloI = (O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO;
/* 66 */                O1ii1lo o1ii1lo = new O1ii1lo(i2);
/* 69 */                o1ii1lo.I00iiI = this;
/* 71 */                o1ii1lo.I00iiO = oOOll1o0;
/* 73 */                o1ii1lo.I00iio = 1;
/* 75 */                VarHandle.storeStoreFence();
/* 78 */                iiOillIi = new IiOillIi(o1I0OloI, o1ii1lo);
                    } else {
/* 83 */                iiOillIi = i1i0olI.I00iiO;
                    }
/* 81 */            I11IlOOO i11IlOOO = iiOillIi;
/* 158 */           IiOoI01 iiOoI01 = new IiOoI01((Ii1Ool1) iiOili0lOO1.I00iio, null, i11IlOOOI0000Il00O, l1iI1lOO.I00000oOI(oI1IlOlol, oOOll1o0.I00ilO0), lIOOiO01I0l.I00000oOI((OOOllliIoIOl) IlO1il.I00100l0.I0000oI00(i4)), oOOll1o0, (OI1IlOlol) iiOili0lOO1.I00iiO, oi0Oooi, IiOiOOIo.I000II((Ii1Ool1) iiOili0lOO1.I00iio).I00000oIO(l1iI1lOO.I00000oOI(oI1IlOlol, oOOll1o0.I00ilO0)).equals(Oll0iIil0.I00000oIO) ? OooO111lO1OI.I00000oOI : (OooO111lO1OI) iiOili0lOO1.I00ilO0, (IiOlIoIo) iiOili0lOO1.I00ioIO, null);
/* 24 */            IiOili0lOO1 iiOili0lOO1I00000oIO = iiOili0lOO1.I00000oIO(iiOoI01, oOOll1o0.I00l0I0l0lO1, (OI1IlOlol) iiOili0lOO1.I00iiO, (Oi0Oooi) iiOili0lOO1.I00ilI0I1, (OooO111lO1OI) iiOili0lOO1.I00ilO0, (II0O0I00oOi) iiOili0lOO1.I00io1l);
/* 169 */           O1iiIOlO o1iiIOlO = (O1iiIOlO) iiOili0lOO1I00000oIO.I00l0OO0IO;
/* 173 */           IOiOol0 iOiOol0 = (IOiOol0) iiOili0lOO1I00000oIO.I00l0I0l0lO1;
/* 175 */           OOi001oo1OOI oOi001oo1OOII0000oI00 = lIOOli.I0000oI00(oOOll1o0, oi0Oooi);
/* 195 */           O0ioOi0Oo1ii o0ioOi0Oo1iiI000O01llI0 = (oOi001oo1OOII0000oI00 == null || (o0iIl1I00Io1lO = iOiOol0.I00Io1lO(oOi001oo1OOII0000oI00)) == null) ? null : il0ol10l.I000O01llI0(iiOoI01, o0iIl1I00Io1lO, i11IlOOO);
/* 199 */           Ii1Ool1 ii1Ool1 = (Ii1Ool1) iiOili0lOO1.I00iio;
/* 208 */           OI000ilOol oI000ilOol = ii1Ool1 instanceof OI000ilOol ? (OI000ilOol) ii1Ool1 : null;
/* 273 */           iiOoI01.I011IO1I11OI(o0ioOi0Oo1iiI000O01llI0, oI000ilOol != null ? oI000ilOol.I00iiI() : null, o1iiIOlO.I00000oOI(lIOOli.I00000oOI(oOOll1o0, oi0Oooi), oOOll1o0.I00o0iI0io1, oOOll1o0, 1), iOiOol0.I0010o(), o1iiIOlO.I000O01llI0(oOOll1o0.I00o0l1o1o0, oOOll1o0, 1), iOiOol0.I00Io1lO(lIOOli.I000II(oOOll1o0, oi0Oooi)), o0iOli.I000l1((OOOlloIl1Oio) IlO1il.I0000oI00.I0000oI00(i4)), lIOOiO01I0l.I00000oIO((OOi110) IlO1il.I0000O.I0000oI00(i4)), Il011I1OiO0I.I00iOIl);
/* 286 */           iiOoI01.I00lli11 = IlO1il.I00100o1O0lo.I0000oI00(i4).booleanValue();
/* 298 */           iiOoI01.I00lll10 = IlO1il.I0010I0i.I0000oI00(i4).booleanValue();
/* 310 */           iiOoI01.I00o0iI0io1 = IlO1il.I001IIilI0O.I0000oI00(i4).booleanValue();
/* 322 */           iiOoI01.I00o0l1o1o0 = IlO1il.I0010o.I0000oI00(i4).booleanValue();
/* 334 */           iiOoI01.I00o101lO = IlO1il.I00111O.I0000oI00(i4).booleanValue();
/* 346 */           iiOoI01.I00oO101o = IlO1il.I001IO000.I0000oI00(i4).booleanValue();
/* 358 */           iiOoI01.I00oI0i = IlO1il.I001i1O0Ol.I0000oI00(i4).booleanValue();
/* 371 */           iiOoI01.I00oOio10iI1 = !IlO1il.I001i1lo1io.I0000oI00(i4).booleanValue();
/* 381 */           ((iolOOiI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I000l1).getClass();
/* 966 */           return iiOoI01;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:27:0x015d  */
                /* JADX WARN: Type inference failed for: r0v14 */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r0v7, types: [OI000ilOol] */
                /* JADX WARN: Type inference failed for: r14v4 */
                /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r14v6 */
                /* JADX WARN: Type inference failed for: r35v0, types: [O1iiIOlO, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v12, types: [I11Io0oil0i0] */
                /* JADX WARN: Type inference failed for: r6v7, types: [I11IlOOO] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IiOo1oO101oi I000II(OOOo0i11Ol oOOo0i11Ol, boolean z) {
                    int i;
                    I11IiIloOo i11IiIloOo;
                    ?? r14;
                    I11IlOOO iiOillIi;
                    IiOo1oO101oi iiOo1oO101oi;
                    OOOOI1ioIo oOOOI1ioIoI0000Il00O;
                    O1I01I0o o1I01I0o;
                    OOOOOO0O oooooo0oI0000O;
                    O0iIl1 o0iIl1I00Io1lO;
/* 5 */             I11IiIloOo i11IiIloOo2 = i1i0olI.I00iiO;
/* 7 */             IiOili0lOO1 iiOili0lOO1 = this.I00000oIO;
/* 11 */            OI1IlOlol oI1IlOlol = (OI1IlOlol) iiOili0lOO1.I00iiO;
/* 17 */            Oi0Oooi oi0Oooi = (Oi0Oooi) iiOili0lOO1.I00ilI0I1;
/* 25 */            if ((oOOo0i11Ol.I00iiO & 1) == 1) {
/* 27 */                i = oOOo0i11Ol.I00iio;
                    } else {
/* 30 */                int i2 = oOOo0i11Ol.I00ilI0I1;
/* 38 */                i = ((i2 >> 8) << 6) + (i2 & 63);
                    }
/* 39 */            if (z) {
/* 41 */                List list = oOOo0i11Ol.I00oO101o;
/* 53 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 56 */                Iterator it = list.iterator();
/* 64 */                while (it.hasNext()) {
/* 78 */                    arrayList.add(this.I00000oOI.I00lli11((OOOi000ooO) it.next(), oI1IlOlol));
                        }
/* 86 */                if (arrayList.isEmpty()) {
/* 88 */                    i11IiIloOo = i11IiIloOo2;
                        } else {
/* 93 */                    ?? i11Io0oil0i0 = new I11Io0oil0i0();
/* 96 */                    i11Io0oil0i0.I00iiI = arrayList;
/* 98 */                    VarHandle.storeStoreFence();
                            i11IiIloOo = i11Io0oil0i0;
                        }
                    } else {
/* 102 */               i11IiIloOo = null;
                    }
/* 107 */           Ii1Ool1 ii1Ool1 = (Ii1Ool1) iiOili0lOO1.I00iio;
                    I11IiIloOo i11IiIloOoI0000Il00O = i11IiIloOo;
/* 109 */           if (i11IiIloOo == null) {
/* 112 */               i11IiIloOoI0000Il00O = I0000Il00O(oOOo0i11Ol, i, 2);
                    }
/* 116 */           IlO1i010 ilO1i010 = IlO1il.I0000oI00;
/* 124 */           O1oIIloii0 o1oIIloii0I000l1 = o0iOli.I000l1((OOOlloIl1Oio) ilO1i010.I0000oI00(i));
/* 128 */           IlO1i010 ilO1i0102 = IlO1il.I0000O;
/* 240 */           int i3 = i;
/* 275 */           IiOo1oO101oi iiOo1oO101oi2 = new IiOo1oO101oi(ii1Ool1, null, i11IiIloOoI0000Il00O, o1oIIloii0I000l1, lIOOiO01I0l.I00000oIO((OOi110) ilO1i0102.I0000oI00(i)), IlO1il.I001iOo1i0O.I0000oI00(i).booleanValue(), l1iI1lOO.I00000oOI(oI1IlOlol, oOOo0i11Ol.I00ilO0), lIOOiO01I0l.I00000oOI((OOOllliIoIOl) IlO1il.I00100l0.I0000oI00(i)), IlO1il.I001lloI.I0000oI00(i).booleanValue(), IlO1il.I001lllioOl.I0000oI00(i).booleanValue(), IlO1il.I00II0oii1o.I0000oI00(i).booleanValue(), IlO1il.I00IO1.I0000oI00(i).booleanValue(), IlO1il.I00IO1oi11O.I0000oI00(i).booleanValue(), oOOo0i11Ol, (OI1IlOlol) iiOili0lOO1.I00iiO, oi0Oooi, (OooO111lO1OI) iiOili0lOO1.I00ilO0, (IiOlIoIo) iiOili0lOO1.I00ioIO);
/* 24 */            IiOili0lOO1 iiOili0lOO1I00000oIO = iiOili0lOO1.I00000oIO(iiOo1oO101oi2, oOOo0i11Ol.I00l0I0l0lO1, (OI1IlOlol) iiOili0lOO1.I00iiO, (Oi0Oooi) iiOili0lOO1.I00ilI0I1, (OooO111lO1OI) iiOili0lOO1.I00ilO0, (II0O0I00oOi) iiOili0lOO1.I00io1l);
/* 288 */           IOiOol0 iOiOol0 = (IOiOol0) iiOili0lOO1I00000oIO.I00l0I0l0lO1;
/* 298 */           boolean zBooleanValue = IlO1il.I001l0I00.I0000oI00(i3).booleanValue();
/* 303 */           if (zBooleanValue) {
/* 305 */               int i4 = oOOo0i11Ol.I00iiO;
/* 311 */               if ((i4 & 32) == 32 || (i4 & 64) == 64) {
/* 327 */                   O1I0OloI o1I0OloI = (O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO;
/* 331 */                   r14 = 1;
/* 332 */                   O1ii1lo o1ii1lo = new O1ii1lo(true ? 1 : 0);
/* 337 */                   o1ii1lo.I00iiI = this;
/* 339 */                   o1ii1lo.I00iiO = oOOo0i11Ol;
/* 341 */                   o1ii1lo.I00iio = 3;
/* 343 */                   VarHandle.storeStoreFence();
/* 346 */                   iiOillIi = new IiOillIi(o1I0OloI, o1ii1lo);
                        } else {
/* 350 */                   r14 = 1;
/* 353 */                   iiOillIi = i11IiIloOo2;
                        }
                    }
/* 359 */           O0iIl1 o0iIl1I00Io1lO2 = iOiOol0.I00Io1lO(lIOOli.I000O01llI0(oOOo0i11Ol, oi0Oooi));
/* 363 */           List listI0010o = iOiOol0.I0010o();
/* 369 */           Ii1Ool1 ii1Ool12 = (Ii1Ool1) iiOili0lOO1.I00iio;
/* 378 */           OI000ilOol oI000ilOol = ii1Ool12 instanceof OI000ilOol ? (OI000ilOol) ii1Ool12 : null;
/* 387 */           O0ioOi0Oo1ii o0ioOi0Oo1iiI00iiI = oI000ilOol != null ? oI000ilOol.I00iiI() : null;
/* 388 */           OOi001oo1OOI oOi001oo1OOII0001Ioi1lo = lIOOli.I0001Ioi1lo(oOOo0i11Ol, oi0Oooi);
/* 424 */           iiOo1oO101oi2.I01101IOlO(o0iIl1I00Io1lO2, listI0010o, o0ioOi0Oo1iiI00iiI, (oOi001oo1OOII0001Ioi1lo == null || (o0iIl1I00Io1lO = iOiOol0.I00Io1lO(oOi001oo1OOII0001Ioi1lo)) == null) ? null : il0ol10l.I000O01llI0(iiOo1oO101oi2, o0iIl1I00Io1lO, iiOillIi), ((O1iiIOlO) iiOili0lOO1I00000oIO.I00l0OO0IO).I00000oOI(lIOOli.I0000Il00O(oOOo0i11Ol, oi0Oooi), oOOo0i11Ol.I00o0iI0io1, oOOo0i11Ol, 3));
/* 455 */           int iI00000oOI = IlO1il.I00000oOI(IlO1il.I0000Il00O.I0000oI00(i3).booleanValue(), (OOi110) ilO1i0102.I0000oI00(i3), (OOOlloIl1Oio) ilO1i010.I0000oI00(i3));
/* 459 */           iOloo0O0O ioloo0o0o = OlI1o0ooI.I00IO1;
/* 461 */           if (zBooleanValue) {
/* 473 */               int i5 = (oOOo0i11Ol.I00iiO & Barcode.FORMAT_QR_CODE) == 256 ? oOOo0i11Ol.I00o101lO : iI00000oOI;
/* 480 */               boolean zBooleanValue2 = IlO1il.I00Io1lO.I0000oI00(i5).booleanValue();
/* 490 */               boolean zBooleanValue3 = IlO1il.I00Io1o110i.I0000oI00(i5).booleanValue();
/* 500 */               boolean zBooleanValue4 = IlO1il.I00IoIO0lI.I0000oI00(i5).booleanValue();
/* 504 */               I11IlOOO i11IlOOOI0000Il00O = I0000Il00O(oOOo0i11Ol, i5, 3);
/* 508 */               if (zBooleanValue2) {
/* 540 */                   OOOOI1ioIo oOOOI1ioIo = new OOOOI1ioIo(iiOo1oO101oi2, i11IlOOOI0000Il00O, o0iOli.I000l1((OOOlloIl1Oio) ilO1i010.I0000oI00(i5)), lIOOiO01I0l.I00000oIO((OOi110) ilO1i0102.I0000oI00(i5)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, iiOo1oO101oi2.I000oI1ioi(), null, ioloo0o0o);
/* 543 */                   iiOo1oO101oi = iiOo1oO101oi2;
/* 545 */                   oOOOI1ioIoI0000Il00O = oOOOI1ioIo;
                        } else {
/* 548 */                   iiOo1oO101oi = iiOo1oO101oi2;
/* 552 */                   oOOOI1ioIoI0000Il00O = il0ol10l.I0000Il00O(iiOo1oO101oi, i11IlOOOI0000Il00O);
                        }
/* 560 */               oOOOI1ioIoI0000Il00O.I010l10O(iiOo1oO101oi.I0001Ioi1lo());
                    } else {
/* 564 */               iiOo1oO101oi = iiOo1oO101oi2;
/* 566 */               oOOOI1ioIoI0000Il00O = null;
                    }
/* 577 */           if (IlO1il.I001lIiIIo1O.I0000oI00(i3).booleanValue()) {
/* 584 */               if ((oOOo0i11Ol.I00iiO & Barcode.FORMAT_UPC_A) == 512) {
/* 586 */                   iI00000oOI = oOOo0i11Ol.I00oI0i;
                        }
/* 594 */               boolean zBooleanValue5 = IlO1il.I00Io1lO.I0000oI00(iI00000oOI).booleanValue();
/* 604 */               boolean zBooleanValue6 = IlO1il.I00Io1o110i.I0000oI00(iI00000oOI).booleanValue();
/* 614 */               boolean zBooleanValue7 = IlO1il.I00IoIO0lI.I0000oI00(iI00000oOI).booleanValue();
/* 619 */               I11IlOOO i11IlOOOI0000Il00O2 = I0000Il00O(oOOo0i11Ol, iI00000oOI, 4);
/* 623 */               if (zBooleanValue5) {
/* 657 */                   oooooo0oI0000O = new OOOOOO0O(iiOo1oO101oi, i11IlOOOI0000Il00O2, o0iOli.I000l1((OOOlloIl1Oio) ilO1i010.I0000oI00(iI00000oOI)), lIOOiO01I0l.I00000oIO((OOi110) ilO1i0102.I0000oI00(iI00000oOI)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, iiOo1oO101oi.I000oI1ioi(), null, ioloo0o0o);
/* 686 */                   Ooo00oi0O ooo00oi0O = (Ooo00oi0O) IOOi0Ool1i.I00OilO00Il(((O1iiIOlO) iiOili0lOO1I00000oIO.I00000oIO(oooooo0oI0000O, Il01100l.I00iOIl, (OI1IlOlol) iiOili0lOO1I00000oIO.I00iiO, (Oi0Oooi) iiOili0lOO1I00000oIO.I00ilI0I1, (OooO111lO1OI) iiOili0lOO1I00000oIO.I00ilO0, (II0O0I00oOi) iiOili0lOO1I00000oIO.I00io1l).I00l0OO0IO).I000O01llI0(Collections.singletonList(oOOo0i11Ol.I00o0l1o1o0), oOOo0i11Ol, 4));
/* 688 */                   if (ooo00oi0O == null) {
/* 694 */                       OOOOOO0O.I00l0I0l0lO1(6);
/* 698 */                       throw null;
                            }
/* 690 */                   oooooo0oI0000O.I00lli11 = ooo00oi0O;
/* 692 */                   o1I01I0o = null;
                        } else {
/* 701 */                   o1I01I0o = null;
/* 702 */                   oooooo0oI0000O = il0ol10l.I0000O(iiOo1oO101oi, i11IlOOOI0000Il00O2);
                        }
                    } else {
/* 707 */               o1I01I0o = null;
/* 708 */               oooooo0oI0000O = null;
                    }
/* 719 */           int i6 = 0;
/* 720 */           if (IlO1il.I00II0Ol1O0l.I0000oI00(i3).booleanValue()) {
/* 724 */               O1ii1lI1 o1ii1lI1 = new O1ii1lI1(i6);
/* 727 */               o1ii1lI1.I00iiI = this;
/* 729 */               o1ii1lI1.I00iiO = oOOo0i11Ol;
/* 731 */               o1ii1lI1.I00iio = iiOo1oO101oi;
/* 733 */               VarHandle.storeStoreFence();
/* 736 */               iiOo1oO101oi.I010o0o0oO(o1I01I0o, o1ii1lI1);
                    }
/* 741 */           Ii1Ool1 ii1Ool13 = (Ii1Ool1) iiOili0lOO1.I00iio;
/* 750 */           ?? r0 = ii1Ool13 instanceof OI000ilOol ? (OI000ilOol) ii1Ool13 : o1I01I0o;
/* 761 */           if ((r0 != 0 ? r0.I00II0oii1o() : o1I01I0o) == IOIOllO1oli.I00ilI0I1) {
/* 765 */               O1ii1lI1 o1ii1lI12 = new O1ii1lI1(r14);
/* 768 */               o1ii1lI12.I00iiI = this;
/* 770 */               o1ii1lI12.I00iiO = oOOo0i11Ol;
/* 772 */               o1ii1lI12.I00iio = iiOo1oO101oi;
/* 774 */               VarHandle.storeStoreFence();
/* 777 */               iiOo1oO101oi.I010o0o0oO(o1I01I0o, o1ii1lI12);
                    }
/* 798 */           iiOo1oO101oi.I010l1ol111(oOOOI1ioIoI0000Il00O, oooooo0oI0000O, new IlIO01Iil(I0000O(oOOo0i11Ol, false)), new IlIO01Iil(I0000O(oOOo0i11Ol, r14)));
/* 2988 */          return iiOo1oO101oi;
                }

                public final List I000O01llI0(List list, I01Ilioliio i01Ilioliio, int i) {
                    ArrayList arrayList;
                    I11IlOOO oIIo0Oi1;
/* 1 */             O1iiIOlO o1iiIOlO = this;
/* 3 */             IiOili0lOO1 iiOili0lOO1 = o1iiIOlO.I00000oIO;
/* 7 */             Oi0Oooi oi0Oooi = (Oi0Oooi) iiOili0lOO1.I00ilI0I1;
/* 11 */            IOiOol0 iOiOol0 = (IOiOol0) iiOili0lOO1.I00l0I0l0lO1;
/* 18 */            IIiIoIl11IO iIiIoIl11IO = (IIiIoIl11IO) ((Ii1Ool1) iiOili0lOO1.I00iio);
/* 24 */            O0OIoll1 o0OIoll1I00000oIO = o1iiIOlO.I00000oIO(iIiIoIl11IO.I000lI());
/* 30 */            List list2 = list;
/* 40 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 47 */            int i2 = 0;
/* 48 */            int i3 = 0;
/* 53 */            for (Object obj : list2) {
/* 59 */                int i4 = i3 + 1;
/* 61 */                if (i3 < 0) {
/* 263 */                   IOOi1I.I000lI();
/* 266 */                   throw null;
                        }
/* 63 */                OOi0iiO0iOi oOi0iiO0iOi = (OOi0iiO0iOi) obj;
/* 74 */                int i5 = (oOi0iiO0iOi.I00iiO & 1) == 1 ? oOi0iiO0iOi.I00iio : i2;
/* 75 */                if (o0OIoll1I00000oIO == null || !IlO1il.I0000Il00O.I0000oI00(i5).booleanValue()) {
/* 131 */                   arrayList = arrayList2;
/* 135 */                   oIIo0Oi1 = i1i0olI.I00iiO;
                        } else {
/* 97 */                    O1I0OloI o1I0OloI = (O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO;
/* 101 */                   O1iiIO1OOi o1iiIO1OOi = new O1iiIO1OOi(i2);
/* 104 */                   o1iiIO1OOi.I00iiI = o1iiIOlO;
/* 106 */                   o1iiIO1OOi.I00iiO = o0OIoll1I00000oIO;
/* 110 */                   o1iiIO1OOi.I00iio = i01Ilioliio;
/* 112 */                   arrayList = arrayList2;
/* 116 */                   o1iiIO1OOi.I00ilI0I1 = i;
/* 118 */                   o1iiIO1OOi.I00ilO0 = i3;
/* 120 */                   o1iiIO1OOi.I00io1l = oOi0iiO0iOi;
/* 122 */                   VarHandle.storeStoreFence();
/* 125 */                   oIIo0Oi1 = new OIIo0Oi1(o1I0OloI, o1iiIO1OOi);
                        }
/* 143 */               OI1Iio0ii1 oI1Iio0ii1I00000oOI = l1iI1lOO.I00000oOI((OI1IlOlol) iiOili0lOO1.I00iiO, oOi0iiO0iOi.I00ilI0I1);
/* 151 */               O0iIl1 o0iIl1I00Io1lO = iOiOol0.I00Io1lO(lIOOli.I000OiO(oOi0iiO0iOi, oi0Oooi));
/* 161 */               boolean zBooleanValue = IlO1il.I00IOO.I0000oI00(i5).booleanValue();
/* 173 */               boolean zBooleanValue2 = IlO1il.I00IioO0OiOi.I0000oI00(i5).booleanValue();
/* 183 */               boolean zBooleanValue3 = IlO1il.I00IlilI0i0i.I0000oI00(i5).booleanValue();
/* 187 */               int i6 = oOi0iiO0iOi.I00iiO;
/* 193 */               IiOili0lOO1 iiOili0lOO12 = iiOili0lOO1;
/* 215 */               OOi001oo1OOI oOi001oo1OOII00100l0 = (i6 & 16) == 16 ? oOi0iiO0iOi.I00ioIO : (i6 & 32) == 32 ? oi0Oooi.I00100l0(oOi0iiO0iOi.I00l0I0l0lO1) : null;
/* 227 */               O0iIl1 o0iIl1I00Io1lO2 = oOi001oo1OOII00100l0 != null ? iOiOol0.I00Io1lO(oOi001oo1OOII00100l0) : null;
/* 243 */               ArrayList arrayList3 = arrayList;
/* 248 */               arrayList3.add(new Ooo00oi0O(iIiIoIl11IO, null, i3, oIIo0Oi1, oI1Iio0ii1I00000oOI, o0iIl1I00Io1lO, zBooleanValue, zBooleanValue2, zBooleanValue3, o0iIl1I00Io1lO2, OlI1o0ooI.I00IO1));
/* 251 */               arrayList2 = arrayList3;
/* 252 */               i2 = 0;
/* 253 */               i3 = i4;
/* 255 */               iiOili0lOO1 = iiOili0lOO12;
/* 257 */               o1iiIOlO = this;
                    }
/* 268 */           return IOOi0Ool1i.I00iIi0i1o(arrayList2);
                }
            }

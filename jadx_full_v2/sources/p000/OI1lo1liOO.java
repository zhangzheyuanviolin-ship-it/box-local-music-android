            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public class OI1lo1liOO extends OI1ilOI1ioo0 implements Iterable, O0IlIoi {
                public static final int I00io1l = 0;
                public final I0oiil10Ili I00ilO0;

                public OI1lo1liOO(OI1o1io oI1o1io) {
/* 1 */             super(oI1o1io);
/* 7 */             I0oiil10Ili i0oiil10Ili = new I0oiil10Ili(5);
/* 10 */            i0oiil10Ili.I00iiO = this;
/* 18 */            i0oiil10Ili.I00iio = new OlIIioolI(0);
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            this.I00ilO0 = i0oiil10Ili;
                }

                @Override
                public final OI1il00IOO I000OiO(IOO000ilo iOO000ilo) {
/* 1 */             OI1il00IOO oI1il00IOOI000OiO = super.I000OiO(iOO000ilo);
/* 5 */             I0oiil10Ili i0oiil10Ili = this.I00ilO0;
/* 12 */            return i0oiil10Ili.I000oI1ioi(oI1il00IOOI000OiO, iOO000ilo, false, (OI1lo1liOO) i0oiil10Ili.I00iiO);
                }

                public final OI1il00IOO I000iOII(IOO000ilo iOO000ilo, OI1ilOI1ioo0 oI1ilOI1ioo0) {
/* 8 */             return this.I00ilO0.I000oI1ioi(super.I000OiO(iOO000ilo), iOO000ilo, true, oI1ilOI1ioo0);
                }

                public final OI1il00IOO I000lI(String str, boolean z, OI1ilOI1ioo0 oI1ilOI1ioo0) {
                    OI1il00IOO oI1il00IOOI000lI;
/* 5 */             OI1lo1liOO oI1lo1liOO = (OI1lo1liOO) this.I00ilO0.I00iiO;
/* 9 */             OI1il00IOO oI1il00IOOI001lllioOl = oI1lo1liOO.I00iiI.I001lllioOl(str);
/* 15 */            ArrayList arrayList = new ArrayList();
/* 18 */            Iterator it = oI1lo1liOO.iterator();
                    while (true) {
/* 23 */                OI1o11OI oI1o11OI = (OI1o11OI) it;
/* 30 */                if (!oI1o11OI.hasNext()) {
                            break;
                        }
/* 36 */                OI1ilOI1ioo0 oI1ilOI1ioo02 = (OI1ilOI1ioo0) oI1o11OI.next();
/* 59 */                oI1il00IOOI000lI = O0000Ioio00.I0000O(oI1ilOI1ioo02, oI1ilOI1ioo0) ? null : oI1ilOI1ioo02 instanceof OI1lo1liOO ? ((OI1lo1liOO) oI1ilOI1ioo02).I000lI(str, false, oI1lo1liOO) : oI1ilOI1ioo02.I00iiI.I001lllioOl(str);
/* 63 */                if (oI1il00IOOI000lI != null) {
/* 65 */                    arrayList.add(oI1il00IOOI000lI);
                        }
                    }
/* 73 */            OI1il00IOO oI1il00IOO = (OI1il00IOO) IOOi0Ool1i.I00IoO0(arrayList);
/* 75 */            OI1lo1liOO oI1lo1liOO2 = oI1lo1liOO.I00iiO;
/* 77 */            if (oI1lo1liOO2 != null && z && !oI1lo1liOO2.equals(oI1ilOI1ioo0)) {
/* 88 */                oI1il00IOOI000lI = oI1lo1liOO2.I000lI(str, true, oI1lo1liOO);
                    }
/* 104 */           return (OI1il00IOO) IOOi0Ool1i.I00IoO0(I1IoiO1l.I001IIilI0O(new OI1il00IOO[]{oI1il00IOOI001lllioOl, oI1il00IOO, oI1il00IOOI000lI}));
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 106 */               return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof OI1lo1liOO) || !super.equals(obj)) {
/* 108 */               return false;
                    }
/* 17 */            I0oiil10Ili i0oiil10Ili = this.I00ilO0;
/* 23 */            int iI0000O = ((OlIIioolI) i0oiil10Ili.I00iio).I0000O();
/* 29 */            I0oiil10Ili i0oiil10Ili2 = ((OI1lo1liOO) obj).I00ilO0;
/* 39 */            if (iI0000O != ((OlIIioolI) i0oiil10Ili2.I00iio).I0000O() || i0oiil10Ili.I00iiI != i0oiil10Ili2.I00iiI) {
/* 108 */               return false;
                    }
/* 49 */            OlIIioolI olIIioolI = (OlIIioolI) i0oiil10Ili.I00iio;
/* 54 */            I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(3);
/* 57 */            i01I0Iioooo0.I00iiO = olIIioolI;
/* 59 */            VarHandle.storeStoreFence();
/* 68 */            Iterator it = ((IOo0i10) OilO1oiooiII.I0000Il00O(i01I0Iioooo0)).iterator();
/* 76 */            while (it.hasNext()) {
/* 82 */                OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) it.next();
/* 86 */                OlIIioolI olIIioolI2 = (OlIIioolI) i0oiil10Ili2.I00iio;
/* 90 */                int i = oI1ilOI1ioo0.I00iiI.I00000oOI;
/* 92 */                olIIioolI2.getClass();
/* 103 */               if (!oI1ilOI1ioo0.equals(iO10Oii01l.I00000oIO(olIIioolI2, i))) {
/* 108 */                   return false;
                        }
                    }
/* 106 */           return true;
                }

                @Override
                public final int hashCode() {
/* 1 */             I0oiil10Ili i0oiil10Ili = this.I00ilO0;
/* 3 */             int iI00000oOI = i0oiil10Ili.I00iiI;
/* 7 */             OlIIioolI olIIioolI = (OlIIioolI) i0oiil10Ili.I00iio;
/* 9 */             int iI0000O = olIIioolI.I0000O();
/* 14 */            for (int i = 0; i < iI0000O; i++) {
/* 35 */                iI00000oOI = (((iI00000oOI * 31) + olIIioolI.I00000oOI(i)) * 31) + ((OI1ilOI1ioo0) olIIioolI.I0000oI00(i)).hashCode();
                    }
/* 55 */            return iI00000oOI;
                }

                @Override
                public final Iterator iterator() {
/* 1 */             I0oiil10Ili i0oiil10Ili = this.I00ilO0;
/* 3 */             i0oiil10Ili.getClass();
/* 8 */             OI1o11OI oI1o11OI = new OI1o11OI();
/* 11 */            oI1o11OI.I00iiO = i0oiil10Ili;
/* 14 */            oI1o11OI.I00iOIl = -1;
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            return oI1o11OI;
                }

                @Override
                public final String toString() {
/* 7 */             StringBuilder sb = new StringBuilder(super.toString());
/* 10 */            I0oiil10Ili i0oiil10Ili = this.I00ilO0;
/* 14 */            String str = (String) i0oiil10Ili.I00ilO0;
/* 16 */            i0oiil10Ili.getClass();
/* 34 */            OI1ilOI1ioo0 oI1ilOI1ioo0I000O01llI0 = (str == null || OlOoOIi0o.I001l0I00(str)) ? null : i0oiil10Ili.I000O01llI0(str, true);
/* 35 */            if (oI1ilOI1ioo0I000O01llI0 == null) {
/* 39 */                oI1ilOI1ioo0I000O01llI0 = i0oiil10Ili.I000II(i0oiil10Ili.I00iiI);
                    }
/* 45 */            sb.append(" startDestination=");
/* 48 */            if (oI1ilOI1ioo0I000O01llI0 == null) {
/* 52 */                String str2 = (String) i0oiil10Ili.I00ilO0;
/* 54 */                if (str2 != null) {
/* 56 */                    sb.append(str2);
                        } else {
/* 62 */                    String str3 = (String) i0oiil10Ili.I00ilI0I1;
/* 64 */                    if (str3 != null) {
/* 66 */                        sb.append(str3);
                            } else {
/* 90 */                        sb.append("0x" + Integer.toHexString(i0oiil10Ili.I00iiI));
                            }
                        }
                    } else {
/* 96 */                sb.append("{");
/* 103 */               sb.append(oI1ilOI1ioo0I000O01llI0.toString());
/* 108 */               sb.append("}");
                    }
/* 111 */           return sb.toString();
                }
            }

            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Ilo0Oil implements Io00l010I {
                public static final Ilo0Oil I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Ilo0Oil ilo0Oil = new Ilo0Oil();
/* 6 */             I00000oIO = ilo0Oil;
/* 14 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.ktor.util.date.GMTDate", ilo0Oil, 9);
/* 20 */            oO1Ol1i.I000OiO("seconds", false);
/* 25 */            oO1Ol1i.I000OiO("minutes", false);
/* 30 */            oO1Ol1i.I000OiO("hours", false);
/* 35 */            oO1Ol1i.I000OiO("dayOfWeek", false);
/* 40 */            oO1Ol1i.I000OiO("dayOfMonth", false);
/* 45 */            oO1Ol1i.I000OiO("dayOfYear", false);
/* 50 */            oO1Ol1i.I000OiO("month", false);
/* 55 */            oO1Ol1i.I000OiO("year", false);
/* 60 */            oO1Ol1i.I000OiO("timestamp", false);
/* 63 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Ilo0Ooi.I00l0OO0IO;
/* 7 */             IooOIlOIIO iooOIlOIIO = IooOIlOIIO.I00000oIO;
/* 5 */             return new O0O01001OOII[]{iooOIlOIIO, iooOIlOIIO, iooOIlOIIO, o0ioIllo0i1Arr[3].getValue(), iooOIlOIIO, iooOIlOIIO, o0ioIllo0i1Arr[6].getValue(), iooOIlOIIO, O1IOi1i.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Ilo0Ooi.I00l0OO0IO;
/* 11 */            long jI00II0Ol1O0l = 0;
/* 15 */            OI010IlI oI010IlI = null;
/* 16 */            boolean z = true;
/* 17 */            int i = 0;
/* 18 */            int iI0010I0i = 0;
/* 19 */            int iI0010I0i2 = 0;
/* 20 */            int iI0010I0i3 = 0;
/* 21 */            i0010oOIlI i0010ooili = null;
/* 22 */            int iI0010I0i4 = 0;
/* 23 */            int iI0010I0i5 = 0;
/* 24 */            int iI0010I0i6 = 0;
/* 26 */            while (z) {
/* 28 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
                        switch (iI000II) {
                            case -1:
/* 139 */                       z = false;
                                break;
                            case 0:
/* 130 */                       iI0010I0i = iOl1ii1loOI00000oOI.I0010I0i(oilOloI, 0);
/* 134 */                       i |= 1;
                                break;
                            case 1:
/* 121 */                       iI0010I0i2 = iOl1ii1loOI00000oOI.I0010I0i(oilOloI, 1);
/* 125 */                       i |= 2;
                                break;
                            case 2:
/* 113 */                       iI0010I0i3 = iOl1ii1loOI00000oOI.I0010I0i(oilOloI, 2);
/* 117 */                       i |= 4;
                                break;
                            case 3:
/* 107 */                       i0010ooili = (i0010oOIlI) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 3, (O0O01001OOII) o0ioIllo0i1Arr[3].getValue(), i0010ooili);
/* 109 */                       i |= 8;
                                break;
                            case 4:
/* 86 */                        iI0010I0i4 = iOl1ii1loOI00000oOI.I0010I0i(oilOloI, 4);
/* 90 */                        i |= 16;
                                break;
                            case 5:
/* 78 */                        iI0010I0i5 = iOl1ii1loOI00000oOI.I0010I0i(oilOloI, 5);
/* 82 */                        i |= 32;
                                break;
                            case 6:
/* 72 */                        oI010IlI = (OI010IlI) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 6, (O0O01001OOII) o0ioIllo0i1Arr[6].getValue(), oI010IlI);
/* 74 */                        i |= 64;
                                break;
                            case 7:
/* 49 */                        iI0010I0i6 = iOl1ii1loOI00000oOI.I0010I0i(oilOloI, 7);
/* 53 */                        i |= Barcode.FORMAT_ITF;
                                break;
                            case 8:
/* 41 */                        jI00II0Ol1O0l = iOl1ii1loOI00000oOI.I00II0Ol1O0l(oilOloI, 8);
/* 45 */                        i |= Barcode.FORMAT_QR_CODE;
                                break;
                            default:
/* 35 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 13 */                        return null;
                        }
                    }
/* 141 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 150 */           if (511 != (i & 511)) {
/* 178 */               lI1IIO.I00000oIO(i, 511, descriptor);
/* 181 */               throw null;
                    }
/* 152 */           Ilo0Ooi ilo0Ooi = new Ilo0Ooi();
/* 155 */           ilo0Ooi.I00iOIl = iI0010I0i;
/* 157 */           ilo0Ooi.I00iiI = iI0010I0i2;
/* 159 */           ilo0Ooi.I00iiO = iI0010I0i3;
/* 161 */           ilo0Ooi.I00iio = i0010ooili;
/* 163 */           ilo0Ooi.I00ilI0I1 = iI0010I0i4;
/* 165 */           ilo0Ooi.I00ilO0 = iI0010I0i5;
/* 167 */           ilo0Ooi.I00io1l = oI010IlI;
/* 171 */           ilo0Ooi.I00ioIO = iI0010I0i6;
/* 173 */           ilo0Ooi.I00l0I0l0lO1 = jI00II0Ol1O0l;
/* 175 */           return ilo0Ooi;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Ilo0Ooi ilo0Ooi = (Ilo0Ooi) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Ilo0Ooi.I00l0OO0IO;
/* 14 */            iOl1l0o0i1I0I00000oOI.I00111O(0, ilo0Ooi.I00iOIl, oilOloI);
/* 20 */            iOl1l0o0i1I0I00000oOI.I00111O(1, ilo0Ooi.I00iiI, oilOloI);
/* 26 */            iOl1l0o0i1I0I00000oOI.I00111O(2, ilo0Ooi.I00iiO, oilOloI);
/* 40 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 3, (O0O01001OOII) o0ioIllo0i1Arr[3].getValue(), ilo0Ooi.I00iio);
/* 46 */            iOl1l0o0i1I0I00000oOI.I00111O(4, ilo0Ooi.I00ilI0I1, oilOloI);
/* 52 */            iOl1l0o0i1I0I00000oOI.I00111O(5, ilo0Ooi.I00ilO0, oilOloI);
/* 66 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 6, (O0O01001OOII) o0ioIllo0i1Arr[6].getValue(), ilo0Ooi.I00io1l);
/* 72 */            iOl1l0o0i1I0I00000oOI.I00111O(7, ilo0Ooi.I00ioIO, oilOloI);
/* 79 */            iOl1l0o0i1I0I00000oOI.I000O01llI0(oilOloI, 8, ilo0Ooi.I00l0I0l0lO1);
/* 82 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

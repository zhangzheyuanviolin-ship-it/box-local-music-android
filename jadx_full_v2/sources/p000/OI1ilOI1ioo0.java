            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public abstract class OI1ilOI1ioo0 {
                public static final int I00ilI0I1 = 0;
                public final String I00iOIl;
                public final I11l01l I00iiI;
                public OI1lo1liOO I00iiO;
                public final OlIIioolI I00iio;

                static {
/* 3 */             new LinkedHashMap();
                }

                public OI1ilOI1ioo0(OII1Il1IlOO oII1Il1IlOO) {
/* 1 */             LinkedHashMap linkedHashMap = OII1IlOi0.I00000oOI;
/* 14 */            this.I00iOIl = l1iOoIO.I00000oIO(oII1Il1IlOO.getClass());
/* 19 */            I11l01l i11l01l = new I11l01l(2);
/* 22 */            i11l01l.I0000Il00O = this;
/* 29 */            i11l01l.I0000O = new ArrayList();
/* 36 */            i11l01l.I0000oI00 = new LinkedHashMap();
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            this.I00iiI = i11l01l;
/* 49 */            this.I00iio = new OlIIioolI(0);
                }

                public final Bundle I00000oOI(Bundle bundle) {
                    Object obj;
/* 5 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00iiI.I0000oI00;
/* 8 */             if (bundle == null && linkedHashMap.isEmpty()) {
/* 7 */                 return null;
                    }
/* 26 */            Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 42 */            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 54 */                String str = (String) entry.getKey();
/* 60 */                OI1Oi1 oI1Oi1 = (OI1Oi1) entry.getValue();
/* 64 */                if (oI1Oi1.I0000Il00O && (obj = oI1Oi1.I0000O) != null) {
/* 72 */                    oI1Oi1.I00000oIO.I0000oI00(bundleI00000oIO, str, obj);
                        }
                    }
/* 76 */            if (bundle != null) {
/* 78 */                bundleI00000oIO.putAll(bundle);
/* 93 */                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
/* 105 */                   String str2 = (String) entry2.getKey();
/* 111 */                   OI1Oi1 oI1Oi12 = (OI1Oi1) entry2.getValue();
/* 113 */                   oI1Oi12.getClass();
/* 116 */                   OII0I1ii oII0I1ii = oI1Oi12.I00000oIO;
/* 120 */                   if (oI1Oi12.I00000oOI || !bundleI00000oIO.containsKey(str2) || !lO0i1o0ii.I00000oOI(str2, bundleI00000oIO)) {
                                try {
/* 134 */                           oII0I1ii.I00000oIO(str2, bundleI00000oIO);
                                } catch (IllegalStateException unused) {
                                }
                            }
/* 152 */                   IoOOl0iOl1io.I00111O(IIlIOloOOO.I001IIilI0O("Wrong argument type for '", str2, "' in argument savedState. "), oII0I1ii.I00000oOI(), " expected.");
/* 7 */                     return null;
                        }
                    }
/* 168 */           return bundleI00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int[] I0000O(OI1ilOI1ioo0 oI1ilOI1ioo0) {
/* 3 */             I1Il0loi i1Il0loi = new I1Il0loi();
                    while (true) {
/* 6 */                 I11l01l i11l01l = this.I00iiI;
/* 8 */                 OI1lo1liOO oI1lo1liOO = this.I00iiO;
/* 16 */                if ((oI1ilOI1ioo0 != null ? oI1ilOI1ioo0.I00iiO : null) != null) {
/* 28 */                    if (oI1ilOI1ioo0.I00iiO.I00ilO0.I000II(i11l01l.I00000oOI) != this) {
/* 34 */                        if (oI1lo1liOO == null || oI1lo1liOO.I00ilO0.I00iiI != i11l01l.I00000oOI) {
/* 44 */                            i1Il0loi.addFirst(this);
                                }
/* 51 */                        if (O0000Ioio00.I0000O(oI1lo1liOO, oI1ilOI1ioo0) || oI1lo1liOO == null) {
                                    break;
                                }
/* 106 */                       this = oI1lo1liOO;
                            } else {
/* 30 */                        i1Il0loi.addFirst(this);
                                break;
                            }
                        }
                    }
/* 56 */            List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(i1Il0loi);
/* 70 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00iIi0i1o, 10));
/* 73 */            Iterator it = listI00iIi0i1o.iterator();
/* 81 */            while (it.hasNext()) {
/* 97 */                arrayList.add(Integer.valueOf(((OI1ilOI1ioo0) it.next()).I00iiI.I00000oOI));
                    }
/* 101 */           return IOOi0Ool1i.I00iIO(arrayList);
                }

                public final Map I000OOo1O() {
/* 7 */             return O1Oii0O0loo.I000iOII((LinkedHashMap) this.I00iiI.I0000oI00);
                }

                public OI1il00IOO I000OiO(IOO000ilo iOO000ilo) {
                    OOoiliiIoloI oOoiliiIoloI;
                    O1OlOOioiI o1OlOOioiII0000Il00O;
/* 5 */             I11l01l i11l01l = this.I00iiI;
/* 9 */             LinkedHashMap linkedHashMap = (LinkedHashMap) i11l01l.I0000oI00;
/* 13 */            String str = (String) iOO000ilo.I00iiO;
/* 17 */            ArrayList arrayList = (ArrayList) i11l01l.I0000O;
/* 24 */            if (arrayList.isEmpty()) {
/* 23 */                return null;
                    }
/* 27 */            Iterator it = arrayList.iterator();
/* 31 */            OI1il00IOO oI1il00IOO = null;
/* 36 */            while (it.hasNext()) {
/* 42 */                OI1iiIoI0OOi oI1iiIoI0OOi = (OI1iiIoI0OOi) it.next();
/* 46 */                Uri uri = (Uri) iOO000ilo.I00iiI;
/* 48 */                OllO00oiil ollO00oiil = oI1iiIoI0OOi.I0000O;
/* 50 */                OllO00oiil ollO00oiil2 = oI1iiIoI0OOi.I0000O;
/* 82 */                if (((OOoiliiIoloI) ollO00oiil.getValue()) == null ? true : uri == null ? false : ((OOoiliiIoloI) ollO00oiil2.getValue()).I0000O(uri.toString())) {
/* 92 */                    Bundle bundleI0000Il00O = uri != null ? oI1iiIoI0OOi.I0000Il00O(uri, linkedHashMap) : null;
/* 124 */                   int size = uri != null ? IOOi0Ool1i.I00IO1oi11O(uri.getPathSegments(), Uri.parse(oI1iiIoI0OOi.I00000oIO).getPathSegments()).size() : 0;
/* 137 */                   boolean z = str != null && str.equals(null);
/* 139 */                   if (bundleI0000Il00O == null) {
/* 141 */                       if (z) {
/* 152 */                           Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 156 */                           if (uri != null && (oOoiliiIoloI = (OOoiliiIoloI) ollO00oiil2.getValue()) != null && (o1OlOOioiII0000Il00O = oOoiliiIoloI.I0000Il00O(uri.toString())) != null) {
/* 178 */                               oI1iiIoI0OOi.I0000O(o1OlOOioiII0000Il00O, bundleI00000oIO, linkedHashMap);
/* 193 */                               if (((Boolean) oI1iiIoI0OOi.I0000oI00.getValue()).booleanValue()) {
/* 195 */                                   oI1iiIoI0OOi.I0000oI00(uri, bundleI00000oIO, linkedHashMap);
                                        }
                                    }
/* 200 */                           OI1iIi011i oI1iIi011i = new OI1iIi011i(1);
/* 203 */                           oI1iIi011i.I00iiI = bundleI00000oIO;
/* 205 */                           VarHandle.storeStoreFence();
/* 216 */                           if (l1iIIII1.I00000oIO(linkedHashMap, oI1iIi011i).isEmpty()) {
                                    }
                                }
                            }
/* 231 */                   OI1il00IOO oI1il00IOO2 = new OI1il00IOO((OI1ilOI1ioo0) i11l01l.I0000Il00O, bundleI0000Il00O, oI1iiIoI0OOi.I000l1, size, z, -1);
/* 234 */                   if (oI1il00IOO == null || oI1il00IOO2.compareTo(oI1il00IOO) > 0) {
/* 242 */                       oI1il00IOO = oI1il00IOO2;
                            }
                        }
                    }
/* 437 */           return oI1il00IOO;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean equals(Object obj) {
                    boolean z;
                    boolean z2;
/* 2 */             if (this != obj) {
/* 7 */                 if (obj != null && (obj instanceof OI1ilOI1ioo0)) {
/* 15 */                    I11l01l i11l01l = this.I00iiI;
/* 19 */                    ArrayList arrayList = (ArrayList) i11l01l.I0000O;
/* 21 */                    OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) obj;
/* 23 */                    OlIIioolI olIIioolI = oI1ilOI1ioo0.I00iio;
/* 25 */                    I11l01l i11l01l2 = oI1ilOI1ioo0.I00iiI;
/* 31 */                    boolean zI0000O = O0000Ioio00.I0000O(arrayList, (ArrayList) i11l01l2.I0000O);
/* 35 */                    OlIIioolI olIIioolI2 = this.I00iio;
/* 45 */                    if (olIIioolI2.I0000O() == olIIioolI.I0000O()) {
/* 49 */                        OlIIlI olIIlI = new OlIIlI();
/* 52 */                        olIIlI.I00iiI = olIIioolI2;
/* 54 */                        VarHandle.storeStoreFence();
/* 63 */                        Iterator it = ((IOo0i10) OilO1oiooiII.I0000Il00O(olIIlI)).iterator();
/* 71 */                        while (it.hasNext()) {
/* 79 */                            int iIntValue = ((Number) it.next()).intValue();
/* 95 */                            if (!O0000Ioio00.I0000O(iO10Oii01l.I00000oIO(olIIioolI2, iIntValue), iO10Oii01l.I00000oIO(olIIioolI, iIntValue))) {
                                    }
                                }
/* 98 */                        z = true;
/* 117 */                       if (I000OOo1O().size() == oI1ilOI1ioo0.I000OOo1O().size()) {
/* 145 */                           for (Map.Entry entry : (Iterable) IOOi0Ool1i.I001IO000(I000OOo1O().entrySet()).I00000oOI) {
/* 165 */                               if (!oI1ilOI1ioo0.I000OOo1O().containsKey(entry.getKey()) || !O0000Ioio00.I0000O(oI1ilOI1ioo0.I000OOo1O().get(entry.getKey()), entry.getValue())) {
                                        }
                                    }
/* 190 */                           z2 = true;
/* 197 */                           if (i11l01l.I00000oOI == i11l01l2.I00000oOI || !O0000Ioio00.I0000O((String) i11l01l.I0001Ioi1lo, (String) i11l01l2.I0001Ioi1lo) || !zI0000O || !z || !z2) {
                                    }
                                }
/* 192 */                       z2 = false;
/* 197 */                       if (i11l01l.I00000oOI == i11l01l2.I00000oOI) {
                                }
                            }
/* 100 */                   z = false;
/* 117 */                   if (I000OOo1O().size() == oI1ilOI1ioo0.I000OOo1O().size()) {
                            }
/* 192 */                   z2 = false;
/* 197 */                   if (i11l01l.I00000oOI == i11l01l2.I00000oOI) {
                            }
                        }
/* 6 */                 return false;
                    }
/* 1 */             return true;
                }

                public int hashCode() {
/* 1 */             I11l01l i11l01l = this.I00iiI;
/* 7 */             int i = i11l01l.I00000oOI * 31;
/* 10 */            String str = (String) i11l01l.I0001Ioi1lo;
/* 21 */            int iHashCode = i + (str != null ? str.hashCode() : 0);
/* 26 */            Iterator it = ((ArrayList) i11l01l.I0000O).iterator();
/* 34 */            while (it.hasNext()) {
/* 51 */                iHashCode = (((OI1iiIoI0OOi) it.next()).I00000oIO.hashCode() + (iHashCode * 31)) * 961;
                    }
/* 54 */            OlIIioolI olIIioolI = this.I00iio;
/* 65 */            if (olIIioolI.I0000O() > 0) {
/* 122 */               olIIioolI.I0000oI00(0).getClass();
/* 125 */               OIiilo1Ool0o.I00000oIO();
/* 12 */                return 0;
                    }
/* 85 */            for (String str2 : I000OOo1O().keySet()) {
/* 95 */                int iI000O01llI0 = Oi010OO0.I000O01llI0(iHashCode * 31, 31, str2);
/* 103 */               Object obj = I000OOo1O().get(str2);
/* 115 */               iHashCode = iI000O01llI0 + (obj != null ? obj.hashCode() : 0);
                    }
/* 117 */           return iHashCode;
                }

                public String toString() {
/* 11 */            StringBuilder sb = new StringBuilder(getClass().getSimpleName());
/* 16 */            sb.append("(0x");
/* 19 */            I11l01l i11l01l = this.I00iiI;
/* 21 */            i11l01l.getClass();
/* 30 */            sb.append(Integer.toHexString(i11l01l.I00000oOI));
/* 35 */            sb.append(")");
/* 40 */            String str = (String) i11l01l.I0001Ioi1lo;
/* 42 */            if (str != null && !OlOoOIi0o.I001l0I00(str)) {
/* 53 */                sb.append(" route=");
/* 60 */                sb.append((String) i11l01l.I0001Ioi1lo);
                    }
/* 63 */            return sb.toString();
                }
            }

            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class OI1o0olI extends OI1ioI1OI1 {
                public OII1IlOi0 I0001Ioi1lo;
                public String I000II;
                public ArrayList I000O01llI0;

                public final OI1lo1liOO I0000Il00O() {
                    int iHashCode;
/* 5 */             OI1lo1liOO oI1lo1liOO = (OI1lo1liOO) super.I00000oIO();
/* 7 */             ArrayList arrayList = this.I000O01llI0;
/* 9 */             I0oiil10Ili i0oiil10Ili = oI1lo1liOO.I00ilO0;
/* 11 */            i0oiil10Ili.getClass();
/* 14 */            Iterator it = arrayList.iterator();
/* 23 */            while (it.hasNext()) {
/* 29 */                OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) it.next();
/* 31 */                if (oI1ilOI1ioo0 != null) {
/* 36 */                    OlIIioolI olIIioolI = (OlIIioolI) i0oiil10Ili.I00iio;
/* 40 */                    OI1lo1liOO oI1lo1liOO2 = (OI1lo1liOO) i0oiil10Ili.I00iiO;
/* 42 */                    I11l01l i11l01l = oI1lo1liOO2.I00iiI;
/* 44 */                    I11l01l i11l01l2 = oI1ilOI1ioo0.I00iiI;
/* 46 */                    int i = i11l01l2.I00000oOI;
/* 50 */                    String str = (String) i11l01l2.I0001Ioi1lo;
/* 52 */                    if (i == 0 && str == null) {
/* 59 */                        I000II.I000iOII("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
/* 22 */                        return null;
                            }
/* 65 */                    String str2 = (String) i11l01l.I0001Ioi1lo;
/* 69 */                    if (str2 != null && O0000Ioio00.I0000O(str, str2)) {
/* 80 */                        OIiilo1Ool0o.I000OOo1O("Destination ", oI1ilOI1ioo0, " cannot have the same route as graph ", oI1lo1liOO2);
/* 22 */                        return null;
                            }
/* 86 */                    if (i == i11l01l.I00000oOI) {
/* 124 */                       OIiilo1Ool0o.I000OOo1O("Destination ", oI1ilOI1ioo0, " cannot have the same id as graph ", oI1lo1liOO2);
/* 22 */                        return null;
                            }
/* 88 */                    olIIioolI.getClass();
/* 95 */                    OI1ilOI1ioo0 oI1ilOI1ioo02 = (OI1ilOI1ioo0) iO10Oii01l.I00000oIO(olIIioolI, i);
/* 97 */                    if (oI1ilOI1ioo02 == oI1ilOI1ioo0) {
                                continue;
                            } else {
/* 102 */                       if (oI1ilOI1ioo0.I00iiO != null) {
/* 118 */                           I000II.I001IO000("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
/* 22 */                            return null;
                                }
/* 104 */                       if (oI1ilOI1ioo02 != null) {
/* 106 */                           oI1ilOI1ioo02.I00iiO = null;
                                }
/* 108 */                       oI1ilOI1ioo0.I00iiO = oI1lo1liOO2;
/* 112 */                       olIIioolI.I0000Il00O(i11l01l2.I00000oOI, oI1ilOI1ioo0);
                            }
                        }
                    }
/* 128 */           String str3 = this.I000II;
/* 130 */           if (str3 == null) {
/* 134 */               if (this.I00000oOI != null) {
/* 138 */                   I000II.I001IO000("You must set a start destination route");
/* 22 */                    return null;
                        }
/* 144 */               I000II.I001IO000("You must set a start destination id");
/* 22 */                return null;
                    }
/* 150 */           OI1lo1liOO oI1lo1liOO3 = (OI1lo1liOO) i0oiil10Ili.I00iiO;
/* 152 */           if (str3 != null) {
/* 166 */               if (str3.equals((String) oI1lo1liOO3.I00iiI.I0001Ioi1lo)) {
/* 201 */                   OIiilo1Ool0o.I000OOo1O("Start destination ", str3, " cannot use the same route as the graph ", oI1lo1liOO3);
                        } else if (OlOoOIi0o.I001l0I00(str3)) {
/* 193 */                   I000II.I000iOII("Cannot have an empty start destination route");
                        } else {
/* 174 */                   int i2 = OI1ilOI1ioo0.I00ilI0I1;
/* 182 */                   iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
                        }
/* 245 */               return oI1lo1liOO;
                    }
/* 154 */           iHashCode = 0;
/* 186 */           i0oiil10Ili.I00iiI = iHashCode;
/* 188 */           i0oiil10Ili.I00ilO0 = str3;
/* 245 */           return oI1lo1liOO;
                }
            }

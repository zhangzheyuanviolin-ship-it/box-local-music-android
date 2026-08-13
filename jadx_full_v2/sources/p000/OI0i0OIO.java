            package p000;

            import java.util.Arrays;
            import kotlin.jvm.functions.Function1;
            
            public final class OI0i0OIO {
                public OI10I1IoI0Ol I00000oIO;

                public static final void I00000oIO(OI10I1IoI0Ol oI10I1IoI0Ol, Object obj, Object obj2) {
/* 1 */             int iI0001Ioi1lo = oI10I1IoI0Ol.I0001Ioi1lo(obj);
/* 9 */             boolean z = iI0001Ioi1lo < 0;
/* 16 */            Object obj3 = z ? null : oI10I1IoI0Ol.I0000Il00O[iI0001Ioi1lo];
/* 18 */            if (obj3 != null) {
/* 23 */                if (obj3 instanceof OI0oiiIO0) {
/* 25 */                    OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) obj3;
/* 27 */                    oI0oiiIO0.I00000oOI(obj2);
/* 30 */                    obj2 = oI0oiiIO0;
                        } else {
/* 32 */                    Object[] objArr = OIOi1o0101.I00000oIO;
/* 37 */                    OI0oiiIO0 oI0oiiIO02 = new OI0oiiIO0(2);
/* 40 */                    oI0oiiIO02.I00000oOI(obj3);
/* 43 */                    oI0oiiIO02.I00000oOI(obj2);
/* 46 */                    obj2 = oI0oiiIO02;
                        }
                    }
/* 47 */            if (!z) {
/* 61 */                oI10I1IoI0Ol.I0000Il00O[iI0001Ioi1lo] = obj2;
/* 98 */                return;
                    }
/* 49 */            int i = ~iI0001Ioi1lo;
/* 52 */            oI10I1IoI0Ol.I00000oOI[i] = obj;
/* 56 */            oI10I1IoI0Ol.I0000Il00O[i] = obj2;
                }

                public static final Object I00000oOI(OI10I1IoI0Ol oI10I1IoI0Ol, OI0IlliOIlO oI0IlliOIlO) {
/* 1 */             Object objI000II = oI10I1IoI0Ol.I000II(oI0IlliOIlO);
/* 6 */             if (objI000II == null) {
/* 5 */                 return null;
                    }
/* 11 */            if (!(objI000II instanceof OI0oiiIO0)) {
/* 59 */                oI10I1IoI0Ol.I000iOII(oI0IlliOIlO);
/* 106 */               return objI000II;
                    }
/* 13 */            OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) objI000II;
/* 19 */            if (oI0oiiIO0.I000OOo1O()) {
/* 55 */                OIiilo1Ool0o.I000II("List is empty.");
/* 5 */                 return null;
                    }
/* 24 */            int i = oI0oiiIO0.I00000oOI - 1;
/* 25 */            Object objI000II2 = oI0oiiIO0.I000II(i);
/* 29 */            oI0oiiIO0.I000l1(i);
/* 36 */            if (oI0oiiIO0.I000OOo1O()) {
/* 38 */                oI10I1IoI0Ol.I000iOII(oI0IlliOIlO);
                    }
/* 43 */            if (oI0oiiIO0.I00000oOI == 1) {
/* 49 */                oI10I1IoI0Ol.I000lI(oI0IlliOIlO, oI0oiiIO0.I0001Ioi1lo());
                    }
/* 52 */            return objI000II2;
                }

                public static final void I0000Il00O(OI10I1IoI0Ol oI10I1IoI0Ol, OI0IlliOIlO oI0IlliOIlO, Function1 function1) {
/* 1 */             Object objI000II = oI10I1IoI0Ol.I000II(oI0IlliOIlO);
/* 5 */             if (objI000II != null) {
/* 9 */                 if (!(objI000II instanceof OI0oiiIO0)) {
/* 98 */                    if (((Boolean) function1.invoke(objI000II)).booleanValue()) {
/* 100 */                       oI10I1IoI0Ol.I000iOII(oI0IlliOIlO);
/* 408 */                       return;
                            }
/* 408 */                   return;
                        }
/* 11 */                OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) objI000II;
/* 13 */                int i = oI0oiiIO0.I00000oOI;
/* 15 */                Object[] objArr = oI0oiiIO0.I00000oIO;
/* 17 */                int i2 = 0;
/* 18 */                IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, i);
/* 22 */                int i3 = iooO11lI000O01llI0.I00iOIl;
/* 24 */                int i4 = iooO11lI000O01llI0.I00iiI;
/* 26 */                if (i3 <= i4) {
                            while (true) {
/* 32 */                        objArr[i3 - i2] = objArr[i3];
/* 46 */                        if (((Boolean) function1.invoke(objArr[i3])).booleanValue()) {
/* 48 */                            i2++;
                                }
/* 50 */                        if (i3 == i4) {
                                    break;
                                } else {
/* 52 */                            i3++;
                                }
                            }
                        }
/* 58 */                Arrays.fill(objArr, i - i2, i, (Object) null);
                        oI0oiiIO0.I00000oOI -= i2;
/* 70 */                if (oI0oiiIO0.I000OOo1O()) {
/* 72 */                    oI10I1IoI0Ol.I000iOII(oI0IlliOIlO);
                        }
/* 78 */                if (oI0oiiIO0.I00000oOI == 1) {
/* 84 */                    oI10I1IoI0Ol.I000lI(oI0IlliOIlO, oI0oiiIO0.I0001Ioi1lo());
                        }
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OI0i0OIO) && this.I00000oIO.equals(((OI0i0OIO) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 18 */            return "MultiValueMap(map=" + this.I00000oIO + ")";
                }
            }

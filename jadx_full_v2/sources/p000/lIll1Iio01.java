            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            
            public abstract class lIll1Iio01 {
                /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OOoOI1lIOi I00000oIO(Class cls) {
                    O0i1llII o0i1llII;
                    boolean z;
/* 3 */             OOlIll1 oOlIll1 = new OOlIll1();
/* 7 */             oOlIll1.I00iOIl = null;
/* 9 */             oOlIll1.I00iiI = null;
/* 12 */            oOlIll1.I00iiO = 0;
/* 14 */            oOlIll1.I00iio = null;
/* 16 */            oOlIll1.I00ilI0I1 = null;
/* 18 */            oOlIll1.I00ilO0 = null;
/* 20 */            oOlIll1.I00io1l = null;
/* 22 */            oOlIll1.I00ioIO = null;
/* 30 */            for (Annotation annotation : cls.getDeclaredAnnotations()) {
/* 40 */                Class clsI001l0I00 = ((IOIO10iOi1) l0O00Ol.I00000oIO(annotation)).I001l0I00();
/* 53 */                O0iI0IlO0iI o0iI0IlO0iII0000oI00 = oOlIll1.I0000oI00(OOo1Io0I0.I00000oIO(clsI001l0I00), new OOo1Il01OliO(annotation));
/* 57 */                if (o0iI0IlO0iII0000oI00 != null) {
/* 59 */                    lIl1l0IO.I0000Il00O(o0iI0IlO0iII0000oI00, annotation, clsI001l0I00);
                        }
                    }
/* 67 */            O1lili011o o1lili011o = O1lili011o.I000II;
/* 71 */            if (oOlIll1.I00io1l == null || oOlIll1.I00iOIl == null) {
/* 220 */               o0i1llII = null;
                    } else {
/* 93 */                O1lili011o o1lili011o2 = new O1lili011o(oOlIll1.I00iOIl, (oOlIll1.I00iiO & 8) != 0);
/* 102 */               O1lili011o o1lili011o3 = o1lili011o2.I0001Ioi1lo ? o1lili011o : O1lili011o.I000O01llI0;
/* 104 */               int i = o1lili011o3.I00000oOI;
/* 106 */               int i2 = o1lili011o.I00000oOI;
/* 108 */               if (i > i2 || (i >= i2 && o1lili011o3.I0000Il00O > o1lili011o.I0000Il00O)) {
/* 120 */                   o1lili011o = o1lili011o3;
                        }
/* 121 */               int i3 = o1lili011o2.I0000Il00O;
/* 123 */               int i4 = o1lili011o2.I00000oOI;
/* 125 */               if ((i4 == 1 && i3 == 0) || i4 == 0) {
/* 132 */                   z = false;
                        } else {
/* 134 */                   int i5 = o1lili011o.I00000oOI;
                            z = !(i4 > i5 || (i4 >= i5 && i3 > o1lili011o.I0000Il00O));
                        }
/* 150 */               if (z) {
/* 159 */                   O0i1lIiil o0i1lIiil = oOlIll1.I00io1l;
/* 163 */                   if ((o0i1lIiil == O0i1lIiil.I00ilI0I1 || o0i1lIiil == O0i1lIiil.I00ilO0 || o0i1lIiil == O0i1lIiil.I00l0I0l0lO1) && oOlIll1.I00iio == null) {
                            }
                        } else {
/* 154 */                   oOlIll1.I00ilO0 = oOlIll1.I00iio;
/* 156 */                   oOlIll1.I00iio = null;
                        }
/* 178 */               String[] strArr = oOlIll1.I00ioIO;
/* 180 */               if (strArr != null) {
/* 182 */                   II0lIIl1l.I00000oIO(strArr);
                        }
/* 187 */               O0i1lIiil o0i1lIiil2 = oOlIll1.I00io1l;
/* 189 */               String[] strArr2 = oOlIll1.I00iio;
/* 191 */               String[] strArr3 = oOlIll1.I00ilO0;
/* 193 */               String[] strArr4 = oOlIll1.I00ilI0I1;
/* 195 */               String str = oOlIll1.I00iiI;
/* 197 */               int i6 = oOlIll1.I00iiO;
/* 199 */               o0i1llII = new O0i1llII(0);
/* 202 */               o0i1llII.I0000Il00O = o0i1lIiil2;
/* 204 */               o0i1llII.I0000O = o1lili011o2;
/* 206 */               o0i1llII.I0000oI00 = strArr2;
/* 208 */               o0i1llII.I0001Ioi1lo = strArr3;
/* 210 */               o0i1llII.I000II = strArr4;
/* 212 */               o0i1llII.I000O01llI0 = str;
/* 214 */               o0i1llII.I00000oOI = i6;
/* 216 */               VarHandle.storeStoreFence();
                    }
/* 221 */           if (o0i1llII == null) {
/* 6 */                 return null;
                    }
/* 224 */           OOoOI1lIOi oOoOI1lIOi = new OOoOI1lIOi();
/* 227 */           oOoOI1lIOi.I00000oIO = cls;
/* 229 */           oOoOI1lIOi.I00000oOI = o0i1llII;
/* 231 */           VarHandle.storeStoreFence();
/* 966 */           return oOoOI1lIOi;
                }
            }

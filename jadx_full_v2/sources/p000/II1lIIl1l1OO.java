            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class II1lIIl1l1OO implements Function3 {
                public int I00iOIl;
                public II1o0111IO0 I00iiI;
                public StringBuilder I00iiO;
                public OOo0ll111 I00iio;
                public OOo0l0ii10l I00ilI0I1;

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             II1o0111IO0 iI1o0111IO0 = this.I00iiI;
/* 5 */             StringBuilder sb = this.I00iiO;
/* 7 */             OOo0ll111 oOo0ll111 = this.I00iio;
/* 9 */             OOo0l0ii10l oOo0l0ii10l = this.I00ilI0I1;
/* 11 */            String str = (String) obj;
/* 15 */            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
/* 23 */            if (i == iI1o0111IO0.I000lI) {
/* 25 */                sb.append(str);
/* 28 */                if (zBooleanValue) {
/* 36 */                    II1o0111IO0.I0010o(sb, oOo0ll111, iI1o0111IO0, oOo0l0ii10l, true);
/* 47 */                    String string = OlOoOIi0o.I00OIo(sb.toString()).toString();
/* 57 */                    if (string.length() == 0) {
/* 61 */                        iI1o0111IO0.I000O01llI0.I00000oOI("I couldn't describe that clearly.");
                            }
/* 64 */                    OlO0OIIl1 olO0OIIl1 = iI1o0111IO0.I0000Il00O;
/* 71 */                    II1l1O1oi01 iI1l1O1oi01 = (II1l1O1oi01) olO0OIIl1.getValue();
/* 77 */                    if (string.length() == 0) {
/* 55 */                        string = "I couldn't describe that clearly.";
                            }
/* 97 */                    olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO(iI1l1O1oi01, null, false, "Describe mode", OlOoOIi0o.I00OIl(160, string), false, 3));
                        } else {
/* 31 */                    II1o0111IO0.I0010o(sb, oOo0ll111, iI1o0111IO0, oOo0l0ii10l, false);
                        }
                    }
/* 100 */           return OoiIlOl1iI.I00000oIO;
                }
            }

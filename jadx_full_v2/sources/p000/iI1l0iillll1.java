            package p000;

            import android.content.Context;
            
            public final class iI1l0iillll1 implements IllOoOoo {
                public static final iI1l0iillll1 I00iiI = new iI1l0iillll1(0);
                public static final iI1l0iillll1 I00iiO = new iI1l0iillll1(1);
                public static final iI1l0iillll1 I00iio = new iI1l0iillll1(2);
                public static final iI1l0iillll1 I00ilI0I1 = new iI1l0iillll1(3);
                public final int I00iOIl;

                public iI1l0iillll1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object apply(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 314 */                   Context context = (Context) obj;
/* 316 */                   String strI00000oOI = iI1l1i0I0.I00000oOI;
/* 318 */                   if (strI00000oOI == null) {
                                synchronized (iI1l1i0I0.class) {
                                    try {
/* 323 */                               strI00000oOI = iI1l1i0I0.I00000oOI;
/* 325 */                               if (strI00000oOI == null) {
/* 329 */                                   strI00000oOI = lIillol1io.I00000oOI(context, "com.google.android.gms.measurement");
/* 333 */                                   iI1l1i0I0.I00000oOI = strI00000oOI;
                                        }
                                    } finally {
                                    }
                                }
                            }
/* 342 */                   return strI00000oOI;
                        case 1:
/* 309 */                   Oi1ol0llI oi1ol0llI = lili0I0IOO0.I000OOo1O;
/* 311 */                   return "";
                        case 2:
/* 60 */                    lO1i1Iio1OIi lo1i1iio1oii = (lO1i1Iio1OIi) obj;
/* 62 */                    llOIo0oi lloio0oiI001l0I00 = llOOiIiIOo.I001l0I00();
/* 66 */                    if (lo1i1iio1oii == null) {
/* 72 */                        return (llOOiIiIOo) lloio0oiI001l0I00.I0000oI00();
                            }
/* 88 */                    for (lO1oIIoolIO lo1oiioolio : lo1i1iio1oii.I001i1lo1io()) {
/* 96 */                        llOil00o1O0 lloil00o1o0I001l0I00 = llOlO1lIl0l.I001l0I00();
/* 100 */                       String strI00111O = lo1oiioolio.I00111O();
/* 104 */                       lloil00o1o0I001l0I00.I0000Il00O();
/* 111 */                       ((llOlO1lIl0l) lloil00o1o0I001l0I00.I00iiI).I001lIiIIo1O(strI00111O);
/* 114 */                       int iI00IOO = lo1oiioolio.I00IOO();
                                int i = iI00IOO - 1;
/* 121 */                       if (iI00IOO == 0) {
/* 237 */                           throw null;
                                }
/* 123 */                       if (i == 0) {
/* 205 */                           long jI001IIilI0O = lo1oiioolio.I001IIilI0O();
/* 209 */                           lloil00o1o0I001l0I00.I0000Il00O();
/* 216 */                           ((llOlO1lIl0l) lloil00o1o0I001l0I00.I00iiI).I001lllioOl(jI001IIilI0O);
                                } else if (i == 1) {
/* 190 */                           boolean zI001IO000 = lo1oiioolio.I001IO000();
/* 194 */                           lloil00o1o0I001l0I00.I0000Il00O();
/* 201 */                           ((llOlO1lIl0l) lloil00o1o0I001l0I00.I00iiI).I001lloI(zI001IO000);
                                } else if (i == 2) {
/* 175 */                           double dI001i1O0Ol = lo1oiioolio.I001i1O0Ol();
/* 179 */                           lloil00o1o0I001l0I00.I0000Il00O();
/* 186 */                           ((llOlO1lIl0l) lloil00o1o0I001l0I00.I00iiI).I00II0Ol1O0l(dI001i1O0Ol);
                                } else if (i == 3) {
/* 160 */                           String strI001i1lo1io = lo1oiioolio.I001i1lo1io();
/* 164 */                           lloil00o1o0I001l0I00.I0000Il00O();
/* 171 */                           ((llOlO1lIl0l) lloil00o1o0I001l0I00.I00iiI).I00II0oii1o(strI001i1lo1io);
                                } else {
/* 135 */                           if (i != 4) {
/* 154 */                               I000II.I001IO000("No known flag type");
/* 120 */                               return null;
                                    }
/* 137 */                           i1lIIl01O i1liil01oI001iOo1i0O = lo1oiioolio.I001iOo1i0O();
/* 141 */                           lloil00o1o0I001l0I00.I0000Il00O();
/* 148 */                           ((llOlO1lIl0l) lloil00o1o0I001l0I00.I00iiI).I00IO1(i1liil01oI001iOo1i0O);
                                }
/* 223 */                       llOlO1lIl0l llolo1lil0l = (llOlO1lIl0l) lloil00o1o0I001l0I00.I0000oI00();
/* 225 */                       lloio0oiI001l0I00.I0000Il00O();
/* 232 */                       ((llOOiIiIOo) lloio0oiI001l0I00.I00iiI).I00IO1(llolo1lil0l);
                            }
/* 238 */                   String strI001i1O0Ol = lo1i1iio1oii.I001i1O0Ol();
/* 242 */                   lloio0oiI001l0I00.I0000Il00O();
/* 249 */                   ((llOOiIiIOo) lloio0oiI001l0I00.I00iiI).I00II0Ol1O0l(strI001i1O0Ol);
/* 252 */                   String strI00111O2 = lo1i1iio1oii.I00111O();
/* 256 */                   lloio0oiI001l0I00.I0000Il00O();
/* 263 */                   ((llOOiIiIOo) lloio0oiI001l0I00.I00iiI).I001lllioOl(strI00111O2);
/* 266 */                   long jI001iOo1i0O = lo1i1iio1oii.I001iOo1i0O();
/* 270 */                   lloio0oiI001l0I00.I0000Il00O();
/* 277 */                   ((llOOiIiIOo) lloio0oiI001l0I00.I00iiI).I00II0oii1o(jI001iOo1i0O);
/* 284 */                   if (lo1i1iio1oii.I001IIilI0O()) {
/* 286 */                       i1lIIl01O i1liil01oI001IO000 = lo1i1iio1oii.I001IO000();
/* 290 */                       lloio0oiI001l0I00.I0000Il00O();
/* 297 */                       ((llOOiIiIOo) lloio0oiI001l0I00.I00iiI).I001lloI(i1liil01oI001IO000);
                            }
/* 304 */                   return (llOOiIiIOo) lloio0oiI001l0I00.I0000oI00();
                        default:
/* 6 */                     lOI1111l loi1111l = (lOI1111l) obj;
/* 12 */                    if (loi1111l.I00iOIl != 29514) {
/* 59 */                        throw loi1111l;
                            }
/* 14 */                    lOo011l1O1 loo011l1o1I001i1O0Ol = lOo0ll1.I001i1O0Ol();
/* 18 */                    lOlI0O1 loli0o1I00IO1oi11O = lOlIllO1.I00IO1oi11O();
/* 22 */                    long jCurrentTimeMillis = System.currentTimeMillis();
/* 26 */                    loli0o1I00IO1oi11O.I0000Il00O();
/* 33 */                    ((lOlIllO1) loli0o1I00IO1oi11O.I00iiI).I00IioO0OiOi(jCurrentTimeMillis);
/* 36 */                    loo011l1o1I001i1O0Ol.I0000Il00O();
/* 49 */                    ((lOo0ll1) loo011l1o1I001i1O0Ol.I00iiI).I001i1lo1io((lOlIllO1) loli0o1I00IO1oi11O.I0000oI00());
/* 56 */                    return (lOo0ll1) loo011l1o1I001i1O0Ol.I0000oI00();
                    }
                }
            }

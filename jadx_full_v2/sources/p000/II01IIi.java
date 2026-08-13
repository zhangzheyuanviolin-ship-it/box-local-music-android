            package p000;

            import java.util.Arrays;
            import java.util.Locale;
            
            public final class II01IIi implements IlliOIilI {
                public double I00iOIl;
                public boolean I00iiI;

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    long j;
/* 3 */             double d = this.I00iOIl;
/* 5 */             boolean z = this.I00iiI;
/* 13 */            Double d2 = (Double) obj2;
/* 17 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 23 */            ((Integer) obj4).getClass();
/* 27 */            if (d2 == null || Math.abs(d2.doubleValue()) <= 1.0E-6d) {
/* 222 */               iloI0lOlll1.I00i01iIIliI(1634385557);
/* 225 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 49 */                iloI0lOlll1.I00i01iIIliI(1633819528);
/* 64 */                double dDoubleValue = ((d - d2.doubleValue()) / d2.doubleValue()) * 100.0d;
/* 88 */                String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Math.abs(dDoubleValue))}, 1));
/* 100 */               String str2 = dDoubleValue >= 0.0d ? "+" : "-";
/* 113 */               if (str2.equals(z ? "-" : "+")) {
/* 118 */                   iloI0lOlll1.I00i01iIIliI(1634128908);
/* 129 */                   j = ((Ii0iOlI) iloI0lOlll1.I000iOII(Oo0oi1olI.I00000oOI)).I000l1;
/* 131 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 138 */                   iloI0lOlll1.I00i01iIIliI(1634207338);
/* 149 */                   j = ((Ii0iOlI) iloI0lOlll1.I000iOII(Oo0oi1olI.I00000oOI)).I0010o;
/* 151 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 208 */               Oo0i1oIIoOO.I00000oOI(IlIi0I0.I000lI(str2, str, "%"), null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000o00OoI0I, iloI0lOlll1, 0, 0, 131066);
/* 213 */               iloI0lOlll1.I0010I0i(false);
                    }
/* 228 */           return OoiIlOl1iI.I00000oIO;
                }
            }

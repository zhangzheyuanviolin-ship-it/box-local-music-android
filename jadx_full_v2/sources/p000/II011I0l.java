            package p000;

            import java.util.Arrays;
            import java.util.Locale;
            
            public final class II011I0l implements IlliOIilI {
                public String I00iOIl;
                public boolean I00iiI;

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    long j;
/* 3 */             String str = this.I00iOIl;
/* 5 */             boolean z = this.I00iiI;
/* 13 */            Double d = (Double) obj2;
/* 17 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 23 */            ((Integer) obj4).getClass();
/* 27 */            if (d != null) {
/* 32 */                iloI0lOlll1.I00i01iIIliI(628411754);
/* 51 */                double d2 = ((Double.parseDouble(str) - d.doubleValue()) / d.doubleValue()) * 100.0d;
/* 75 */                String str2 = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Math.abs(d2))}, 1));
/* 87 */                String str3 = d2 >= 0.0d ? "+" : "-";
/* 100 */               if (str3.equals(z ? "-" : "+")) {
/* 105 */                   iloI0lOlll1.I00i01iIIliI(628772067);
/* 116 */                   j = ((Ii0iOlI) iloI0lOlll1.I000iOII(Oo0oi1olI.I00000oOI)).I000l1;
/* 118 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 125 */                   iloI0lOlll1.I00i01iIIliI(628850497);
/* 136 */                   j = ((Ii0iOlI) iloI0lOlll1.I000iOII(Oo0oi1olI.I00000oOI)).I0010o;
/* 138 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 194 */               Oo0i1oIIoOO.I00000oOI(IlIi0I0.I000lI(str3, str2, "%"), null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000o00OoI0I, iloI0lOlll1, 0, 0, 131066);
/* 199 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 208 */               iloI0lOlll1.I00i01iIIliI(629028716);
/* 211 */               iloI0lOlll1.I0010I0i(false);
                    }
/* 214 */           return OoiIlOl1iI.I00000oIO;
                }
            }

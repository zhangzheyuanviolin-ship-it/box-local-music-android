            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Iio1l0O implements O0O01001OOII {
                public static final Iio1l0O I00000oIO = new Iio1l0O();
                public static final OOIii1ili I00000oOI = new OOIii1ili("kotlin.time.Duration", OOIOoio0iiI.I000OiO);

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 3 */             String strI0010o = ii1iO1O.I0010o();
                    try {
/* 7 */                 long jI0000Il00O = ilI0IilIOi.I0000Il00O(strI0010o);
/* 20 */                if (jI0000Il00O == Iio1OlIo0.I00ilI0I1) {
/* 40 */                    throw new IllegalStateException("invariant failed");
                        }
/* 24 */                Iio1OlIo0 iio1OlIo0 = new Iio1OlIo0();
/* 27 */                iio1OlIo0.I00iOIl = jI0000Il00O;
/* 29 */                VarHandle.storeStoreFence();
/* 32 */                return iio1OlIo0;
                    } catch (IllegalArgumentException e) {
/* 186 */               throw new IllegalArgumentException(IlIi0I0.I000lI("Invalid ISO duration string format: '", strI0010o, "'."), e);
                    }
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 3 */             long j = ((Iio1OlIo0) obj).I00iOIl;
/* 5 */             IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 16 */            if (j < 0) {
/* 20 */                sb.append('-');
                    }
/* 25 */            sb.append("PT");
/* 35 */            long jI000O01llI0 = j < 0 ? Iio1OlIo0.I000O01llI0(j) : j;
/* 38 */            long jI000II = Iio1OlIo0.I000II(jI000O01llI0, Iio1llolooo.I00ilO0);
/* 48 */            boolean z = false;
/* 60 */            int iI000II = Iio1OlIo0.I0000oI00(jI000O01llI0) ? 0 : (int) (Iio1OlIo0.I000II(jI000O01llI0, Iio1llolooo.I00ilI0I1) % 60);
/* 76 */            int iI000II2 = Iio1OlIo0.I0000oI00(jI000O01llI0) ? 0 : (int) (Iio1OlIo0.I000II(jI000O01llI0, Iio1llolooo.I00iio) % 60);
/* 77 */            int iI0000O = Iio1OlIo0.I0000O(jI000O01llI0);
/* 85 */            if (Iio1OlIo0.I0000oI00(j)) {
/* 87 */                jI000II = 9999999999999L;
                    }
/* 99 */            boolean z2 = jI000II != 0;
/* 107 */           boolean z3 = (iI000II2 == 0 && iI0000O == 0) ? false : true;
/* 108 */           if (iI000II != 0 || (z3 && z2)) {
/* 114 */               z = true;
                    }
/* 115 */           if (z2) {
/* 117 */               sb.append(jI000II);
/* 122 */               sb.append('H');
                    }
/* 125 */           if (z) {
/* 127 */               sb.append(iI000II);
/* 132 */               sb.append('M');
                    }
/* 135 */           if (z3 || (!z2 && !z)) {
/* 148 */               Iio1OlIo0.I00000oOI(sb, iI000II2, iI0000O, 9, OIlOl1.I00iiI, true);
                    }
/* 155 */           il0I1ii.I001lloI(sb.toString());
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return I00000oOI;
                }
            }

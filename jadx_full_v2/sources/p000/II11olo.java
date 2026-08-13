            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class II11olo implements Function1 {
                public boolean I00iOIl;
                public OlI00IIlOO I00iiI;
                public long I00iiO;
                public float I00iio;
                public float I00ilI0I1;
                public long I00ilO0;
                public long I00io1l;
                public OlOooI0l0011 I00ioIO;

                @Override
                public final Object invoke(Object obj) throws Throwable {
                    long j;
/* 3 */             boolean z = this.I00iOIl;
/* 5 */             OlI00IIlOO olI00IIlOO = this.I00iiI;
/* 7 */             long j2 = this.I00iiO;
/* 9 */             float f = this.I00iio;
/* 11 */            float f2 = this.I00ilI0I1;
/* 13 */            long j3 = this.I00ilO0;
/* 15 */            long j4 = this.I00io1l;
/* 17 */            OlOooI0l0011 olOooI0l0011 = this.I00ioIO;
/* 21 */            O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 23 */            o0iiliOio.I00000oOI();
/* 26 */            IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 28 */            if (z) {
/* 40 */                IilloIOOO0i.I00ol1(o0iiliOio, olI00IIlOO, 0L, 0L, j2, 0.0f, null, null, 246);
                    } else if (Float.intBitsToFloat((int) (j2 >> 32)) < f) {
/* 70 */                float fIntBitsToFloat = Float.intBitsToFloat((int) (iIolilIo.I0000oI00() >> 32)) - f2;
/* 87 */                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iIolilIo.I0000oI00() & 4294967295L)) - f2;
/* 89 */                IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 91 */                long jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 99 */                iOO000ilo.I0010o().I000II();
                        try {
/* 109 */                   ((IIOOoll) iOO000ilo.I00iiI).I00IlilI0i0i(f2, f2, fIntBitsToFloat, fIntBitsToFloat2, 0);
/* 121 */                   j = jI001iOo1i0O;
                            try {
/* 124 */                       IilloIOOO0i.I00ol1(o0iiliOio, olI00IIlOO, 0L, 0L, j2, 0.0f, null, null, 246);
/* 127 */                       IIlIOloOOO.I001IO000(iOO000ilo, j);
                            } catch (Throwable th) {
/* 131 */                       th = th;
/* 135 */                       IIlIOloOOO.I001IO000(iOO000ilo, j);
/* 138 */                       throw th;
                            }
                        } catch (Throwable th2) {
/* 133 */                   th = th2;
/* 134 */                   j = jI001iOo1i0O;
                        }
                    } else {
/* 148 */               IilloIOOO0i.I00ol1(o0iiliOio, olI00IIlOO, j3, j4, iOi0OiI.I00000oOI(f, j2), 0.0f, olOooI0l0011, null, 208);
                    }
/* 151 */           return OoiIlOl1iI.I00000oIO;
                }
            }

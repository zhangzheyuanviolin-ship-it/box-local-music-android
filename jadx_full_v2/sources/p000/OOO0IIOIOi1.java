            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OOO0IIOIOi1 implements Function1 {
                public IolIOll I00iOIl;
                public int I00iiI;
                public float I00iiO;
                public float I00iio;
                public IolIOll I00ilI0I1;
                public IolIOll I00ilO0;
                public long I00io1l;
                public OlOooI0l0011 I00ioIO;
                public long I00l0I0l0lO1;

                @Override
                public final Object invoke(Object obj) throws Throwable {
                    float f;
                    char c;
                    long j;
/* 3 */             IolIOll iolIOll = this.I00iOIl;
/* 5 */             int i = this.I00iiI;
/* 7 */             float f2 = this.I00iiO;
/* 9 */             float f3 = this.I00iio;
/* 11 */            IolIOll iolIOll2 = this.I00ilI0I1;
/* 13 */            IolIOll iolIOll3 = this.I00ilO0;
/* 15 */            long j2 = this.I00io1l;
/* 17 */            OlOooI0l0011 olOooI0l0011 = this.I00ioIO;
/* 19 */            long j3 = this.I00l0I0l0lO1;
/* 23 */            IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 39 */            float fFloatValue = ((Number) iolIOll.I00iio.getValue()).floatValue() * 360.0f;
/* 40 */            if (i == 0) {
/* 42 */                f = 360.0f;
/* 44 */                c = ' ';
                    } else {
/* 56 */                f = 360.0f;
/* 69 */                c = ' ';
/* 80 */                if (Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) <= Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32))) {
/* 83 */                    f2 += f3;
                        }
                    }
/* 108 */           float fI00OIO1 = (f2 / ((float) (iilloIOOO0i.I00OIO1(Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> c))) * 3.141592653589793d))) * f;
/* 134 */           float fFloatValue2 = ((Number) iolIOll3.I00iio.getValue()).floatValue() + ((Number) iolIOll2.I00iio.getValue()).floatValue();
/* 135 */           long jI00lli11 = iilloIOOO0i.I00lli11();
/* 139 */           IOO000ilo iOO000iloI00iiI = iilloIOOO0i.I00iiI();
/* 143 */           long jI001iOo1i0O = iOO000iloI00iiI.I001iOo1i0O();
/* 151 */           iOO000iloI00iiI.I0010o().I000II();
                    try {
/* 158 */               ((IIOOoll) iOO000iloI00iiI.I00iiI).I00OloOo(fFloatValue2, jI00lli11);
/* 179 */               j = jI001iOo1i0O;
                        try {
/* 182 */                   OOO0iOio0oil.I0000oI00(iilloIOOO0i, Math.min(fFloatValue, fI00OIO1) + fFloatValue, (f - fFloatValue) - (Math.min(fFloatValue, fI00OIO1) * 2.0f), j2, olOooI0l0011);
/* 191 */                   OOO0iOio0oil.I0000oI00(iilloIOOO0i, 0.0f, fFloatValue, j3, olOooI0l0011);
/* 194 */                   IIlIOloOOO.I001IO000(iOO000iloI00iiI, j);
/* 197 */                   return OoiIlOl1iI.I00000oIO;
                        } catch (Throwable th) {
/* 200 */                   th = th;
/* 204 */                   IIlIOloOOO.I001IO000(iOO000iloI00iiI, j);
/* 437 */                   throw th;
                        }
                    } catch (Throwable th2) {
/* 202 */               th = th2;
/* 203 */               j = jI001iOo1i0O;
                    }
                }
            }

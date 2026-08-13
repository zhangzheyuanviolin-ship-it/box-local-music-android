            package p000;

            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class I1iI0l1I implements Function1 {
                public List I00iOIl;
                public float I00iiI;
                public long I00iiO;
                public long I00iio;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             List list = this.I00iOIl;
/* 5 */             float f = this.I00iiI;
/* 7 */             long j = this.I00iiO;
/* 9 */             long j2 = this.I00iio;
/* 13 */            IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 32 */            float f2 = 2.0f;
/* 44 */            float fIntBitsToFloat = (Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)) - (iilloIOOO0i.I00i0ilIl0i(2.0f) * (r0 - 1))) / list.size();
/* 65 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
/* 71 */            IIolOo iIolOoI0010o = iilloIOOO0i.I00iiI().I0010o();
/* 92 */            iIolOoI0010o.I0010I0i(lIl0looO.I00000oIO(0L, iilloIOOO0i.I0000oI00()), iOIlil0Il1i.I00000oIO());
/* 98 */            Iterator it = list.iterator();
/* 102 */           int i = 0;
/* 107 */           while (it.hasNext()) {
/* 109 */               Object next = it.next();
/* 113 */               int i2 = i + 1;
/* 115 */               if (i < 0) {
/* 218 */                   IOOi1I.I000lI();
/* 222 */                   throw null;
                        }
/* 134 */               float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) * ((Number) next).floatValue();
/* 139 */               if (fIntBitsToFloat2 < 1.5f) {
/* 141 */                   fIntBitsToFloat2 = 1.5f;
                        }
/* 149 */               float fI00i0ilIl0i = (iilloIOOO0i.I00i0ilIl0i(f2) + fIntBitsToFloat) * i;
/* 154 */               float f3 = f2;
/* 168 */               float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) / f3) - (fIntBitsToFloat2 / f3);
/* 173 */               Iterator it2 = it;
/* 208 */               IilloIOOO0i.I00o0l1o1o0(iilloIOOO0i, j2, (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fI00i0ilIl0i) << 32), (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), jFloatToRawIntBits, null, 240);
/* 211 */               f2 = f3;
/* 212 */               i = i2;
/* 214 */               iIolOoI0010o = iIolOoI0010o;
/* 215 */               it = it2;
                    }
/* 235 */           float fIntBitsToFloat4 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)) * f;
/* 243 */           float fIntBitsToFloat5 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L));
/* 270 */           IilloIOOO0i.I00ilI0I1(iilloIOOO0i, j, 0L, (Float.floatToRawIntBits(fIntBitsToFloat4) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L), 0.0f, null, 5, 56);
/* 273 */           iIolOoI0010o.I00100l0();
/* 276 */           return OoiIlOl1iI.I00000oIO;
                }
            }

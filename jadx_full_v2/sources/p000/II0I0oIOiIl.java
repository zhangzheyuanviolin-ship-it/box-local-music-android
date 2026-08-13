            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class II0I0oIOiIl implements Function1 {
                public IooilIliolo1 I00iOIl;
                public long I00iiI;
                public long I00iiO;
                public long I00iio;
                public double I00ilI0I1;
                public double I00ilO0;
                public long I00io1l;
                public OI10i0Il I00ioIO;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             IooilIliolo1 iooilIliolo1 = this.I00iOIl;
/* 5 */             long j = this.I00iiI;
/* 7 */             long j2 = this.I00iiO;
/* 9 */             long j3 = this.I00iio;
/* 11 */            double d = this.I00ilI0I1;
/* 13 */            double d2 = this.I00ilO0;
/* 15 */            long j4 = this.I00io1l;
/* 17 */            OI10i0Il oI10i0Il = this.I00ioIO;
/* 21 */            IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 37 */            long j5 = j;
/* 50 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)) - (iilloIOOO0i.I00i0ilIl0i(12.0f) * 2.0f);
/* 63 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L));
/* 86 */            float size = iooilIliolo1.size() > 1 ? fIntBitsToFloat / (iooilIliolo1.size() - 1) : 0.0f;
/* 98 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iooilIliolo1, 10));
/* 101 */           Iterator it = iooilIliolo1.iterator();
/* 105 */           int i = 0;
/* 110 */           while (it.hasNext()) {
/* 112 */               Object next = it.next();
/* 116 */               int i2 = i + 1;
/* 118 */               if (i < 0) {
/* 176 */                   IOOi1I.I000lI();
/* 180 */                   throw null;
                        }
/* 126 */               Iterator it2 = it;
                        double d3 = fIntBitsToFloat2;
/* 168 */               arrayList.add(OIOlIiiioi.I00000oIO((Float.floatToRawIntBits((i * size) + r2) << 32) | (Float.floatToRawIntBits((float) (d3 - (((((Double) next).doubleValue() - d) / d2) * d3))) & 4294967295L)));
/* 171 */               i = i2;
/* 173 */               it = it2;
                    }
                    int size2 = arrayList.size() - 1;
/* 187 */           int i3 = 0;
/* 188 */           while (i3 < size2) {
/* 196 */               long j6 = ((OIOlIiiioi) arrayList.get(i3)).I00000oIO;
/* 198 */               int i4 = i3 + 1;
/* 230 */               IilloIOOO0i iilloIOOO0i2 = iilloIOOO0i;
/* 237 */               long j7 = j5;
/* 247 */               IilloIOOO0i.I00oli(iilloIOOO0i2, j7, j6, ((OIOlIiiioi) arrayList.get(i4)).I00000oIO, iilloIOOO0i.I00i0ilIl0i(2.0f), 0, null, 496);
/* 250 */               size2 = size2;
/* 252 */               d = d;
/* 254 */               i3 = i4;
/* 256 */               j3 = j3;
/* 258 */               d2 = d2;
/* 260 */               j4 = j4;
/* 262 */               j5 = j7;
/* 264 */               arrayList = arrayList;
/* 265 */               iilloIOOO0i = iilloIOOO0i2;
                    }
/* 267 */           long j8 = j3;
/* 269 */           double d4 = d;
/* 271 */           double d5 = d2;
/* 273 */           long j9 = j4;
/* 275 */           IilloIOOO0i iilloIOOO0i3 = iilloIOOO0i;
/* 281 */           float fI00i0ilIl0i = iilloIOOO0i3.I00i0ilIl0i(4.0f);
/* 285 */           float fI00i0ilIl0i2 = iilloIOOO0i3.I00i0ilIl0i(2.0f);
/* 289 */           Iterator it3 = arrayList.iterator();
/* 297 */           while (it3.hasNext()) {
/* 305 */               long j10 = ((OIOlIiiioi) it3.next()).I00000oIO;
/* 310 */               long j11 = j2;
/* 311 */               IilloIOOO0i.I00iiO(iilloIOOO0i3, j11, fI00i0ilIl0i, j10, null, 120);
/* 336 */               IilloIOOO0i.I00iiO(iilloIOOO0i3, j8, fI00i0ilIl0i, j10, new OlOooI0l0011(fI00i0ilIl0i2, 0.0f, 0, 0, null, 30), 104);
/* 339 */               j2 = j11;
                    }
/* 347 */           if (((Double) oI10i0Il.getValue()) != null) {
/* 389 */               float fIntBitsToFloat3 = (float) (Float.intBitsToFloat((int) (iilloIOOO0i3.I0000oI00() & 4294967295L)) - (((((Double) oI10i0Il.getValue()).doubleValue() - d4) / d5) * Float.intBitsToFloat((int) (iilloIOOO0i3.I0000oI00() & 4294967295L))));
/* 457 */               IilloIOOO0i.I00oli(iilloIOOO0i3, j9, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (iilloIOOO0i3.I0000oI00() >> 32))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L), iilloIOOO0i3.I00i0ilIl0i(1.0f), 0, iOIloO1l10o.I00000oIO(new float[]{10.0f, 10.0f}), 464);
                    }
/* 460 */           return OoiIlOl1iI.I00000oIO;
                }
            }

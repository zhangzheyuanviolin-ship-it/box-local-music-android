            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class OIll0lliIll extends I1oO1oiO00O {
                public Oo1ol1ll I0000oI00;
                public int[] I0001Ioi1lo;
                public OIll0iIIo1iI I000II;

                public static long I001i1lo1io(byte[] bArr, int i, int i2) {
/* 1 */             long j = 0;
/* 4 */             for (int i3 = 0; i3 < i2; i3++) {
/* 21 */                j += (bArr[i3 + i] & 255) << (((i2 - i3) - 1) * 8);
                    }
/* 215 */           return j;
                }

                public final void I001i1O0Ol(IIi0io1lIo iIi0io1lIo) {
/* 1 */             int[] iArr = this.I0001Ioi1lo;
/* 5 */             IIOoIilO iIOoIilOI00lli11 = iIi0io1lIo.I00lli11(IIi0I0I0o.I0IlIoI1oi0);
/* 9 */             if (iIOoIilOI00lli11 == null) {
/* 239 */               IioIoO10iOiI.I000OOo1O("/W array is missing in Xref stream");
/* 966 */               return;
                    }
/* 18 */            if (iIOoIilOI00lli11.I00iOIl.size() != 3) {
/* 233 */               I000II.I00111O("Wrong number of values for /W array in XRef: ", Arrays.toString(iArr));
/* 236 */               return;
                    }
/* 22 */            for (int i = 0; i < 3; i++) {
/* 28 */                iArr[i] = iIOoIilOI00lli11.I00lli11(i, 0);
                    }
/* 35 */            if (iArr[0] < 0 || iArr[1] < 0 || iArr[2] < 0) {
/* 223 */               I000II.I00111O("Incorrect /W array in XRef: ", Arrays.toString(iArr));
/* 226 */               return;
                    }
/* 49 */            IIOoIilO iIOoIilOI00lli112 = iIi0io1lIo.I00lli11(IIi0I0I0o.I01l1o0Oii);
/* 53 */            if (iIOoIilOI00lli112 == null) {
/* 57 */                iIOoIilOI00lli112 = new IIOoIilO();
/* 62 */                iIOoIilOI00lli112.I00ioIO(IIOool.I00iio);
/* 77 */                iIOoIilOI00lli112.I00ioIO(IIOool.I00o0iI0io1(iIi0io1lIo.I00oooO(IIi0I0I0o.I0IO11i1, null, 0)));
                    }
/* 80 */            ArrayList arrayList = iIOoIilOI00lli112.I00iOIl;
/* 86 */            if (arrayList.size() == 0 || arrayList.size() % 2 == 1) {
/* 213 */               I000II.I00111O("Wrong number of values for /Index array in XRef: ", Arrays.toString(iArr));
/* 216 */               return;
                    }
/* 97 */            OIll0iIIo1iI oIll0iIIo1iI = new OIll0iIIo1iI();
/* 100 */           oIll0iIIo1iI.I00iiO = 0;
/* 104 */           oIll0iIIo1iI.I00iio = 0L;
/* 106 */           oIll0iIIo1iI.I00ilI0I1 = 0L;
/* 108 */           oIll0iIIo1iI.I00ilO0 = 0L;
/* 114 */           int size = arrayList.size() / 2;
/* 115 */           long[] jArr = new long[size];
/* 117 */           oIll0iIIo1iI.I00iOIl = jArr;
/* 119 */           long[] jArr2 = new long[size];
/* 121 */           oIll0iIIo1iI.I00iiI = jArr2;
/* 123 */           Iterator it = arrayList.iterator();
/* 127 */           int i2 = 0;
/* 132 */           while (it.hasNext()) {
/* 138 */               IIOoOiOI iIOoOiOI = (IIOoOiOI) it.next();
/* 144 */               if (!(iIOoOiOI instanceof IIOool)) {
/* 184 */                   IioIoO10iOiI.I000OOo1O("Xref stream must have integer in /Index array");
/* 187 */                   return;
                        }
/* 148 */               long j = ((IIOool) iIOoOiOI).I00iOIl;
/* 154 */               if (!it.hasNext()) {
                            break;
                        }
/* 161 */               IIOoOiOI iIOoOiOI2 = (IIOoOiOI) it.next();
/* 165 */               if (!(iIOoOiOI2 instanceof IIOool)) {
/* 180 */                   IioIoO10iOiI.I000OOo1O("Xref stream must have integer in /Index array");
/* 183 */                   return;
                        }
/* 169 */               long j2 = ((IIOool) iIOoOiOI2).I00iOIl;
/* 171 */               jArr[i2] = j;
/* 176 */               jArr2[i2] = j + j2;
/* 173 */               i2++;
                    }
/* 190 */           oIll0iIIo1iI.I00ilI0I1 = jArr[0];
/* 194 */           oIll0iIIo1iI.I00iio = jArr2[0];
/* 199 */           oIll0iIIo1iI.I00ilO0 = jArr2[i2 - 1];
/* 201 */           VarHandle.storeStoreFence();
/* 204 */           this.I000II = oIll0iIIo1iI;
                }
            }

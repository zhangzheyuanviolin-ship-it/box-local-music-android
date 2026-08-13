            package p000;

            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class o01IliI1I extends I011IO1I11OI {
                public I0Oi111ii I00ioIO;
                public int I00l0I0l0lO1;

                @Override
                public final void I0000O() {
                    AtomicLong atomicLong;
                    long j;
                    int i;
                    int i2;
                    boolean z;
                    o01OIIIoi o01oiiioi;
/* 1 */             I0Oi111ii i0Oi111ii = this.I00ioIO;
/* 4 */             this.I00ioIO = null;
/* 6 */             if (i0Oi111ii == null) {
/* 88 */                return;
                    }
/* 11 */            AtomicReference atomicReference = (AtomicReference) i0Oi111ii.I00iio;
/* 61 */            do {
/* 15 */                atomicLong = (AtomicLong) i0Oi111ii.I00iiO;
/* 17 */                j = atomicLong.get();
/* 21 */                i = (int) j;
/* 24 */                long j2 = j >>> 32;
/* 28 */                if (i == Integer.MIN_VALUE) {
/* 103 */                   StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
/* 108 */                   sb.append("Refcount is: ");
/* 111 */                   sb.append(j);
/* 541 */                   throw new AssertionError(sb.toString());
                        }
/* 30 */                i2 = (int) j2;
/* 39 */                z = i == -2147483647;
/* 40 */                if (z) {
/* 42 */                    i2++;
                        }
/* 61 */            } while (!atomicLong.compareAndSet(j, (i2 << 32) | (4294967295L & (i - 1))));
/* 63 */            if (z) {
/* 86 */                do {
/* 69 */                    o01oiiioi = (o01OIIIoi) atomicReference.get();
/* 71 */                    if (o01oiiioi == null) {
/* 88 */                        return;
                            }
/* 77 */                    if (o01oiiioi.I00ioIO > this.I00l0I0l0lO1) {
/* 88 */                        return;
                            } else {
/* 79 */                        o01oiiioi.cancel(true);
                            }
/* 86 */                } while (!atomicReference.compareAndSet(o01oiiioi, null));
                    }
                }

                @Override
                public final String I000iOII() {
                    I1OlOl11O0 i1OlOl11O0;
/* 1 */             I0Oi111ii i0Oi111ii = this.I00ioIO;
/* 3 */             if (i0Oi111ii == null || (i1OlOl11O0 = (I1OlOl11O0) ((liOO1i1) i0Oi111ii.I00iiI).I00iiI) == null) {
/* 16 */                return null;
                    }
/* 18 */            String string = i1OlOl11O0.toString();
/* 37 */            String strI0010I0i = IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 11), "callable=[", string, "]");
/* 51 */            o01OIIIoi o01oiiioi = (o01OIIIoi) ((AtomicReference) this.I00ioIO.I00iio).get();
/* 53 */            if (o01oiiioi == null) {
/* 113 */               return strI0010I0i;
                    }
/* 55 */            int length = strI0010I0i.length();
/* 59 */            String string2 = o01oiiioi.toString();
/* 79 */            return IIl001iO0Io.I00100o1O0lo(new StringBuilder(string2.length() + length + 9 + 1), strI0010I0i, ", trial=[", string2, "]");
                }
            }

            package p000;

            import java.io.Closeable;
            import java.io.IOException;
            import java.nio.ByteOrder;
            
            public final class II0lIOii implements Closeable {
                public static final long[] I00ilI0I1 = new long[64];
                public IOO0o0i1io I00iOIl;
                public ByteOrder I00iiI;
                public long I00iiO;
                public int I00iio;

                static {
/* 11 */            for (int i = 1; i <= 63; i++) {
/* 13 */                long[] jArr = I00ilI0I1;
/* 23 */                jArr[i] = (jArr[i - 1] << 1) + 1;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
                
                    r5 = p000.II0lIOii.I00ilI0I1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
                
                    if (r4 >= r12) goto L30;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
                
                    r4 = r12 - r4;
                    r6 = 8 - r4;
                    r7 = r0.read();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
                
                    if (r7 >= 0) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
                
                    return r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
                
                    if (r1 != java.nio.ByteOrder.LITTLE_ENDIAN) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
                
                    r0 = ((r5[r4] & r7) << r11.I00iio) | r11.I00iiO;
                    r11.I00iiO = r0;
                    r2 = (r7 >>> r4) & r5[r6];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
                
                    r0 = r11.I00iiO << r4;
                    r11.I00iiO = r0;
                    r0 = r0 | ((r7 >>> r6) & r5[r4]);
                    r11.I00iiO = r0;
                    r2 = r5[r6] & r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
                
                    r0 = r0 & r5[r12];
                    r11.I00iiO = r2;
                    r11.I00iio = r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
                
                    r0 = java.nio.ByteOrder.LITTLE_ENDIAN;
                    r2 = r11.I00iiO;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
                
                    if (r1 != r0) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
                
                    r0 = r5[r12] & r2;
                    r11.I00iiO = r2 >>> r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
                
                    r0 = (r2 >> (r4 - r12)) & r5[r12];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
                
                    r11.I00iio = r4 - r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
                
                    return r0;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I00000oIO(int i) throws IOException {
/* 1 */             IOO0o0i1io iOO0o0i1io = this.I00iOIl;
/* 3 */             ByteOrder byteOrder = this.I00iiI;
/* 7 */             if (i < 0 || i > 63) {
/* 148 */               IioIoO10iOiI.I000OOo1O("count must not be negative or greater than 63");
/* 5 */                 return 0L;
                    }
                    while (true) {
/* 13 */                int i2 = this.I00iio;
/* 15 */                if (i2 >= i || i2 >= 57) {
                            break;
                        }
/* 21 */                long j = iOO0o0i1io.read();
/* 28 */                if (j < 0) {
/* 30 */                    return -1L;
                        }
/* 33 */                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
/* 35 */                long j2 = this.I00iiO;
/* 39 */                if (byteOrder == byteOrder2) {
/* 45 */                    this.I00iiO = (j << this.I00iio) | j2;
                        } else {
/* 51 */                    this.I00iiO = j | (j2 << 8);
                        }
                        this.I00iio += 8;
                    }
                }

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iOIl.close();
                }
            }

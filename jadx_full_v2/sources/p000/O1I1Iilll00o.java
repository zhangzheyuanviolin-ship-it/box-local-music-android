            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.Writer;
            
            public final class O1I1Iilll00o extends Writer {
                public final StringBuilder I00iOIl = new StringBuilder(Barcode.FORMAT_ITF);

                public final void I00000oIO() {
/* 1 */             StringBuilder sb = this.I00iOIl;
/* 7 */             if (sb.length() > 0) {
/* 14 */                sb.delete(0, sb.length());
                    }
                }

                @Override
                public final void close() {
/* 1 */             I00000oIO();
                }

                @Override
                public final void flush() {
/* 1 */             I00000oIO();
                }

                @Override
                public final void write(char[] cArr, int i, int i2) {
/* 2 */             for (int i3 = 0; i3 < i2; i3++) {
/* 6 */                 char c = cArr[i + i3];
/* 10 */                if (c == '\n') {
/* 12 */                    I00000oIO();
                        } else {
/* 18 */                    this.I00iOIl.append(c);
                        }
                    }
                }
            }

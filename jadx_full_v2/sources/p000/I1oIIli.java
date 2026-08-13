            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class I1oIIli extends I1oIO0ll01 {
                public char[] I0000O;

                @Override
                public final void I0000Il00O(StringBuilder sb, byte[] bArr, int i) {
/* 1 */             char[] cArr = this.I0000O;
/* 5 */             lII0I0I01I1l.I000O01llI0(0, i, bArr.length);
/* 8 */             for (int i2 = 0; i2 < i; i2++) {
/* 12 */                int i3 = bArr[i2] & 255;
/* 16 */                sb.append(cArr[i3]);
/* 23 */                sb.append(cArr[i3 | Barcode.FORMAT_QR_CODE]);
                    }
                }
            }

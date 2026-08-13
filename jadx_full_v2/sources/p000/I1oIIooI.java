            package p000;
            
            public final class I1oIIooI extends I1oIO0ll01 {
                public I1oIIooI(String str, String str2) {
/* 13 */            I1oIIOIIo i1oIIOIIo = new I1oIIOIIo(str, str2.toCharArray());
/* 16 */            super(i1oIIOIIo, (Character) '=');
/* 29 */            lII0I0I01I1l.I00000oOI(i1oIIOIIo.I00000oOI.length == 64);
                }

                @Override
                public final void I0000Il00O(StringBuilder sb, byte[] bArr, int i) {
/* 2 */             int i2 = 0;
/* 3 */             lII0I0I01I1l.I000O01llI0(0, i, bArr.length);
/* 8 */             for (int i3 = i; i3 >= 3; i3 -= 3) {
/* 18 */                int i4 = i2 + 2;
/* 26 */                int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
/* 27 */                i2 += 3;
/* 33 */                int i6 = i5 | (bArr[i4] & 255);
/* 36 */                I1oIIOIIo i1oIIOIIo = this.I00000oIO;
/* 38 */                char[] cArr = i1oIIOIIo.I00000oOI;
/* 40 */                char[] cArr2 = i1oIIOIIo.I00000oOI;
/* 44 */                sb.append(cArr[i6 >>> 18]);
/* 53 */                sb.append(cArr2[(i6 >>> 12) & 63]);
/* 62 */                sb.append(cArr2[(i6 >>> 6) & 63]);
/* 69 */                sb.append(cArr2[i6 & 63]);
                    }
/* 75 */            if (i2 < i) {
/* 78 */                I00000oOI(sb, bArr, i2, i - i2);
                    }
                }
            }

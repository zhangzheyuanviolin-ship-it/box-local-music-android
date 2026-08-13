            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.math.RoundingMode;
            import java.util.Objects;
            
/* 31 */    public class I1oIO0ll01 {
                public static final I1oIIooI I0000Il00O;
                public final I1oIIOIIo I00000oIO;
                public final Character I00000oOI;

                static {
/* 7 */             new I1oIIooI("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
/* 19 */            I0000Il00O = new I1oIIooI("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
/* 27 */            new I1oIO0ll01("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
/* 36 */            new I1oIO0ll01("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
/* 52 */            I1oIIOIIo i1oIIOIIo = new I1oIIOIIo("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'});
/* 56 */            I1oIIli i1oIIli = new I1oIIli(i1oIIOIIo, null);
/* 63 */            i1oIIli.I0000O = new char[Barcode.FORMAT_UPC_A];
/* 65 */            char[] cArr = i1oIIOIIo.I00000oOI;
/* 74 */            lII0I0I01I1l.I00000oOI(cArr.length == 16);
/* 79 */            for (int i = 0; i < 256; i++) {
/* 81 */                char[] cArr2 = i1oIIli.I0000O;
/* 87 */                cArr2[i] = cArr[i >>> 4];
/* 95 */                cArr2[i | Barcode.FORMAT_QR_CODE] = cArr[i & 15];
                    }
/* 100 */           VarHandle.storeStoreFence();
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public I1oIO0ll01(I1oIIOIIo i1oIIOIIo, Character ch) {
                    boolean z;
/* 4 */             this.I00000oIO = i1oIIOIIo;
/* 6 */             if (ch != null) {
/* 8 */                 char cCharValue = ch.charValue();
/* 12 */                byte[] bArr = i1oIIOIIo.I000II;
/* 24 */                z = cCharValue >= bArr.length || bArr[cCharValue] == -1;
                    }
/* 27 */            lII0I0I01I1l.I0000Il00O(z, "Padding character %s was already in alphabet", ch);
/* 30 */            this.I00000oOI = ch;
                }

                public final String I00000oIO(byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 4 */             lII0I0I01I1l.I000O01llI0(0, length, bArr.length);
/* 9 */             I1oIIOIIo i1oIIOIIo = this.I00000oIO;
/* 11 */            int i = i1oIIOIIo.I0000oI00;
/* 13 */            int i2 = i1oIIOIIo.I0001Ioi1lo;
/* 15 */            RoundingMode roundingMode = RoundingMode.CEILING;
/* 22 */            StringBuilder sb = new StringBuilder(iooili11.I00000oIO(length, i2) * i);
                    try {
/* 25 */                I0000Il00O(sb, bArr, length);
/* 28 */                return sb.toString();
                    } catch (IOException e) {
/* 34 */                I000II.I000O01llI0(e);
/* 37 */                return null;
                    }
                }

                public final void I00000oOI(StringBuilder sb, byte[] bArr, int i, int i2) {
/* 4 */             lII0I0I01I1l.I000O01llI0(i, i + i2, bArr.length);
/* 7 */             I1oIIOIIo i1oIIOIIo = this.I00000oIO;
/* 9 */             int i3 = i1oIIOIIo.I0001Ioi1lo;
/* 11 */            int i4 = i1oIIOIIo.I0000O;
/* 13 */            int i5 = 0;
/* 19 */            lII0I0I01I1l.I00000oOI(i2 <= i3);
/* 22 */            long j = 0;
/* 27 */            for (int i6 = 0; i6 < i2; i6++) {
/* 37 */                j = (j | (bArr[i + i6] & 255)) << 8;
                    }
/* 44 */            int i7 = ((i2 + 1) * 8) - i4;
/* 47 */            while (i5 < i2 * 8) {
/* 61 */                sb.append(i1oIIOIIo.I00000oOI[((int) (j >>> (i7 - i5))) & i1oIIOIIo.I0000Il00O]);
/* 64 */                i5 += i4;
                    }
/* 66 */            Character ch = this.I00000oOI;
/* 68 */            if (ch != null) {
/* 73 */                while (i5 < i1oIIOIIo.I0001Ioi1lo * 8) {
/* 79 */                    sb.append(ch.charValue());
/* 82 */                    i5 += i4;
                        }
                    }
                }

                public void I0000Il00O(StringBuilder sb, byte[] bArr, int i) {
/* 2 */             int i2 = 0;
/* 3 */             lII0I0I01I1l.I000O01llI0(0, i, bArr.length);
/* 6 */             while (i2 < i) {
/* 8 */                 I1oIIOIIo i1oIIOIIo = this.I00000oIO;
/* 18 */                I00000oOI(sb, bArr, i2, Math.min(i1oIIOIIo.I0001Ioi1lo, i - i2));
/* 23 */                i2 += i1oIIOIIo.I0001Ioi1lo;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof I1oIO0ll01) {
/* 6 */                 I1oIO0ll01 i1oIO0ll01 = (I1oIO0ll01) obj;
/* 16 */                if (this.I00000oIO.equals(i1oIO0ll01.I00000oIO) && Objects.equals(this.I00000oOI, i1oIO0ll01.I00000oOI)) {
/* 28 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 13 */            return Objects.hashCode(this.I00000oOI) ^ this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BaseEncoding.");
/* 8 */             I1oIIOIIo i1oIIOIIo = this.I00000oIO;
/* 10 */            sb.append(i1oIIOIIo);
/* 18 */            if (8 % i1oIIOIIo.I0000O != 0) {
/* 20 */                Character ch = this.I00000oOI;
/* 22 */                if (ch == null) {
/* 26 */                    sb.append(".omitPadding()");
                        } else {
/* 32 */                    sb.append(".withPadChar('");
/* 35 */                    sb.append(ch);
/* 40 */                    sb.append("')");
                        }
                    }
/* 43 */            return sb.toString();
                }

/* 32 */        public I1oIO0ll01(String str, String str2) {
/* 33 */            this(new I1oIIOIIo(str, str2.toCharArray()), (Character) '=');
                }
            }

            package p000;

            import java.io.ByteArrayOutputStream;
            import java.util.Arrays;
            
/* 105 */   public final class IIi0l1 extends IIOoOiOI {
                public static final boolean I00iiI = Boolean.getBoolean("com.tom_roush.pdfbox.forceParsing");
                public byte[] I00iOIl;

                public IIi0l1(String str) {
/* 11 */            for (char c : str.toCharArray()) {
/* 25 */                if (!OIliioOo.I00000oOI.containsKey(Character.valueOf(c))) {
/* 29 */                    byte[] bytes = str.getBytes(IO1IIilll1I.I00000oOI);
/* 36 */                    byte[] bArr = new byte[bytes.length + 2];
/* 38 */                    this.I00iOIl = bArr;
/* 41 */                    bArr[0] = -2;
/* 45 */                    bArr[1] = -1;
/* 48 */                    System.arraycopy(bytes, 0, bArr, 2, bytes.length);
/* 51 */                    return;
                        }
                    }
/* 55 */            int[] iArr = OIliioOo.I00000oIO;
/* 59 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 68 */            for (char c2 : str.toCharArray()) {
/* 82 */                Integer num = (Integer) OIliioOo.I00000oOI.get(Character.valueOf(c2));
/* 84 */                if (num == null) {
/* 86 */                    byteArrayOutputStream.write(0);
                        } else {
/* 94 */                    byteArrayOutputStream.write(num.intValue());
                        }
                    }
/* 104 */           this.I00iOIl = byteArrayOutputStream.toByteArray();
                }

                public final String I00ioIO() {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 8 */             if (bArr.length >= 2) {
/* 10 */                byte b = bArr[0];
/* 17 */                if ((b & 255) == 254 && (bArr[1] & 255) == 255) {
/* 30 */                    return new String(bArr, 2, bArr.length - 2, IO1IIilll1I.I00000oOI);
                        }
/* 35 */                if ((b & 255) == 255 && (bArr[1] & 255) == 254) {
/* 48 */                    return new String(bArr, 2, bArr.length - 2, IO1IIilll1I.I0000Il00O);
                        }
                    }
/* 52 */            int[] iArr = OIliioOo.I00000oIO;
/* 56 */            StringBuilder sb = new StringBuilder();
/* 60 */            for (byte b2 : bArr) {
/* 64 */                int i = b2 & 255;
/* 65 */                int[] iArr2 = OIliioOo.I00000oIO;
/* 69 */                if (i >= 256) {
/* 73 */                    sb.append('?');
                        } else {
/* 80 */                    sb.append((char) iArr2[i]);
                        }
                    }
/* 86 */            return sb.toString();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof IIi0l1) {
/* 15 */                return I00ioIO().equals(((IIi0l1) obj).I00ioIO());
                    }
/* 20 */            return false;
                }

                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.I00iOIl);
                }

                public final String toString() {
/* 20 */            return "COSString{" + I00ioIO() + "}";
                }

/* 106 */       public IIi0l1(byte[] bArr) {
/* 108 */           this.I00iOIl = (byte[]) bArr.clone();
                }
            }

            package p000;

            import java.util.Arrays;
            
            public final class liIIiioIOII implements Comparable {
                public static final long I00iiO = I1Ioolli0l0o.I00000oIO.objectFieldOffset(liIIiioIOII.class.getDeclaredField("I00iiI"));
                public final String I00iOIl;
                public volatile Object I00iiI;

                public liIIiioIOII(String str, byte[] bArr) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = bArr;
                }

                public final void I00000oIO(byte[] bArr) {
                    byte[][] bArr2;
/* 2 */             int i = 0;
                    while (true) {
/* 3 */                 Object obj = this.I00iiI;
/* 7 */                 if (!(obj instanceof byte[])) {
/* 30 */                    byte[][] bArr3 = (byte[][]) obj;
                            while (true) {
/* 32 */                        int length = bArr3.length;
/* 33 */                        if (i >= length) {
/* 52 */                            bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
/* 54 */                            bArr2[length] = bArr;
                                    break;
                                } else if (Arrays.equals(bArr, bArr3[i])) {
/* 77 */                            return;
                                } else {
/* 43 */                            i++;
                                }
                            }
                        } else {
/* 10 */                    byte[] bArr4 = (byte[]) obj;
/* 16 */                    if (Arrays.equals(bArr, bArr4)) {
/* 77 */                        return;
                            }
/* 24 */                    i = 1;
/* 20 */                    bArr2 = new byte[][]{bArr4, bArr};
                        }
/* 61 */                liIIiioIOII liiiiioioii = this;
/* 66 */                if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(liiiiioioii, I00iiO, obj, bArr2)) {
/* 77 */                    return;
                        } else {
/* 68 */                    this = liiiiioioii;
                        }
                    }
                }

                @Override
                public final int compareTo(Object obj) {
/* 5 */             return this.I00iOIl.compareTo((String) obj);
                }
            }

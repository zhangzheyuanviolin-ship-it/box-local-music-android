            package p000;

            import java.util.Arrays;
            import java.util.function.Supplier;
            
            public final class IoOlii0 implements Supplier {
                public final int I00000oIO;

                @Override
                public final Object get() {
                    switch (this.I00000oIO) {
                        case 0:
/* 19 */                    byte[] bArr = IoOlilOO.I0000Il00O;
/* 22 */                    Arrays.fill(bArr, (byte) 0);
/* 25 */                    return bArr;
                        case 1:
/* 14 */                    byte[] bArr2 = IoOlilOO.I00000oIO;
/* 16 */                    return new byte[8192];
                        case 2:
/* 11 */                    return new byte[8192];
                        default:
/* 8 */                     return new char[8192];
                    }
                }
            }

            package p000;

            import java.io.File;
            import java.io.InputStream;
            import java.util.function.Supplier;
            
            public abstract class IoOlilOO {
                public static final byte[] I00000oIO;
                public static final ThreadLocal I00000oOI;
                public static final byte[] I0000Il00O;

                static {
/* 1 */             char c = File.separatorChar;
/* 6 */             I00000oIO = new byte[0];
/* 8 */             System.lineSeparator();
/* 13 */            String str = OlIliiO.I00iiO.I00iOIl;
/* 17 */            String str2 = OlIliiO.I00iiI.I00iOIl;
/* 29 */            I00000oOI = ThreadLocal.withInitial(new IoOlii0(2));
/* 35 */            I0000Il00O = new byte[8192];
/* 43 */            ThreadLocal.withInitial(new IoOlii0(3));
                }

                public static long I00000oIO(InputStream inputStream, long j, Supplier supplier) {
/* 5 */             if (j < 0) {
/* 46 */                I000II.I000iOII(IlIi0I0.I000iOII(j, "Skip count must be non-negative, actual: "));
/* 1 */                 return 0L;
                    }
/* 7 */             long j2 = j;
/* 10 */            while (j2 > 0) {
/* 26 */                long j3 = inputStream.read((byte[]) supplier.get(), 0, (int) Math.min(j2, r4.length));
/* 33 */                if (j3 < 0) {
                            break;
                        }
/* 36 */                j2 -= j3;
                    }
/* 38 */            return j - j2;
                }
            }

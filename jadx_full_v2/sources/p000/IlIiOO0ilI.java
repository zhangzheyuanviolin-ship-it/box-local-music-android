            package p000;

            import java.io.Closeable;
            import java.io.FileNotFoundException;
            import java.util.List;
            
/* 27 */    public abstract class IlIiOO0ilI implements Closeable {
                public static final O0IO0I I00iOIl;

                static {
                    O0IO0I o0io0i;
                    try {
/* 3 */                 Class.forName("java.nio.file.Files");
/* 8 */                 o0io0i = new OIIio0iO0();
                    } catch (ClassNotFoundException unused) {
/* 14 */                o0io0i = new O0IO0I();
                    }
/* 17 */            I00iOIl = o0io0i;
/* 19 */            String str = OO0IIO1Il.I00iiI;
/* 27 */            Iioi0lilII.I00lli11(System.getProperty("java.io.tmpdir"));
/* 34 */            Oi0l0oOOi0.class.getClassLoader();
                }

                public abstract Ol0i0olI I00000oIO(OO0IIO1Il oO0IIO1Il);

                public abstract void I0000Il00O(OO0IIO1Il oO0IIO1Il, OO0IIO1Il oO0IIO1Il2);

                public abstract void I000II(OO0IIO1Il oO0IIO1Il);

                public abstract void I000O01llI0(OO0IIO1Il oO0IIO1Il);

                public final boolean I000l1(OO0IIO1Il oO0IIO1Il) {
                    return I001l0I00(oO0IIO1Il) != null;
                }

                public abstract List I00100l0(OO0IIO1Il oO0IIO1Il);

                public final IlIOoOIo0l I001i1lo1io(OO0IIO1Il oO0IIO1Il) throws FileNotFoundException {
/* 1 */             IlIOoOIo0l ilIOoOIo0lI001l0I00 = I001l0I00(oO0IIO1Il);
/* 5 */             if (ilIOoOIo0lI001l0I00 != null) {
/* 7 */                 return ilIOoOIo0lI001l0I00;
                    }
/* 49 */            throw new FileNotFoundException("no such file: " + oO0IIO1Il);
                }

                public abstract IlIOoOIo0l I001l0I00(OO0IIO1Il oO0IIO1Il);

                public abstract Ol0i0olI I00IOO(OO0IIO1Il oO0IIO1Il);

                public abstract OlI1ii I00IioO0OiOi(OO0IIO1Il oO0IIO1Il);

                @Override
/* 28 */        public void close() {
                }
            }

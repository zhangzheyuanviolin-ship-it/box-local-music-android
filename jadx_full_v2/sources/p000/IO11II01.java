            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class IO11II01 {
                public static final OIOiIOO0l0O I00000oIO;

                static {
/* 3 */             String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
/* 30 */            I00000oIO = property != null ? Boolean.parseBoolean(property) : false ? new IO111OiOi1Oi() : new IO111iii(Barcode.FORMAT_AZTEC);
                }
            }

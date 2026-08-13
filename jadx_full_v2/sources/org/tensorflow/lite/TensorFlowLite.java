            package org.tensorflow.lite;

            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.IIlIOloOOO;
            
            public abstract class TensorFlowLite {
                public static final Logger I00000oIO;
                public static final UnsatisfiedLinkError I00000oOI;
                public static volatile boolean I0000Il00O;
                public static final AtomicBoolean[] I0000O;

                static {
                    UnsatisfiedLinkError unsatisfiedLinkError;
/* 11 */            Logger logger = Logger.getLogger(TensorFlowLite.class.getName());
/* 15 */            I00000oIO = logger;
/* 18 */            I0000Il00O = false;
                    try {
/* 22 */                System.loadLibrary("LiteRt");
/* 29 */                logger.logp(Level.INFO, "org.tensorflow.lite.TensorFlowLite", "<clinit>", "Loaded native library: LiteRt");
/* 33 */                I0000Il00O = true;
/* 35 */                unsatisfiedLinkError = null;
                    } catch (UnsatisfiedLinkError e) {
/* 44 */                I00000oIO.logp(Level.INFO, "org.tensorflow.lite.TensorFlowLite", "<clinit>", "Didn't load native library: LiteRt");
/* 47 */                unsatisfiedLinkError = e;
                    }
/* 48 */            I00000oOI = unsatisfiedLinkError;
/* 58 */            I0000O = new AtomicBoolean[IIlIOloOOO.I001lloI(3).length];
/* 65 */            for (int i = 0; i < IIlIOloOOO.I001lloI(3).length; i++) {
/* 74 */                I0000O[i] = new AtomicBoolean();
                    }
                }

                public static void I00000oIO() {
/* 3 */             if (I0000Il00O) {
/* 5 */                 return;
                    }
                    try {
/* 6 */                 nativeDoNothing();
/* 10 */                I0000Il00O = true;
                    } catch (UnsatisfiedLinkError e) {
/* 14 */                UnsatisfiedLinkError unsatisfiedLinkError = I00000oOI;
/* 16 */                if (unsatisfiedLinkError == null) {
/* 19 */                    unsatisfiedLinkError = e;
                        }
/* 32 */                UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  ".concat(String.valueOf(unsatisfiedLinkError)));
/* 35 */                unsatisfiedLinkError2.initCause(e);
/* 113 */               throw unsatisfiedLinkError2;
                    }
                }

                private static native void nativeDoNothing();
            }

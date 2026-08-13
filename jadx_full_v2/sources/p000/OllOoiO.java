            package p000;
            
            public abstract class OllOoiO {
                public static final boolean I00000oIO;
                public static final boolean I00000oOI;

                static {
                    Object objI00000oIO;
                    Object objI00000oIO2;
                    try {
/* 3 */                 objI00000oIO = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
                    } catch (Throwable th) {
/* 9 */                 objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 16 */            if (objI00000oIO instanceof Oi10Ii1i1lo) {
/* 18 */                objI00000oIO = null;
                    }
/* 19 */            String str = (String) objI00000oIO;
/* 21 */            boolean z = false;
/* 34 */            I00000oIO = str != null && Boolean.parseBoolean(str);
                    try {
/* 38 */                objI00000oIO2 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
                    } catch (Throwable th2) {
/* 44 */                objI00000oIO2 = lIoii1l01l0i.I00000oIO(th2);
                    }
/* 54 */            String str2 = (String) (objI00000oIO2 instanceof Oi10Ii1i1lo ? null : objI00000oIO2);
/* 56 */            if (str2 != null && Boolean.parseBoolean(str2)) {
/* 64 */                z = true;
                    }
/* 65 */            I00000oOI = z;
                }
            }

            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Method;
            
            public abstract class O11oI0 {
                public static final OOiIOoiOO I00000oIO;

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
                
                    r1 = r1.invoke(null, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
                
                    if ((r1 instanceof p000.OOiIOoiOO) == false) goto L7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
                
                    r1 = (p000.OOiIOoiOO) r1;
                 */
                static {
                    Object objI00000oIO;
                    try {
/* 16 */                Method method = OiIoOoIi01.class.getClassLoader().loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
/* 20 */                Annotation[] annotations = method.getAnnotations();
/* 24 */                int length = annotations.length;
/* 25 */                int i = 0;
                        while (true) {
/* 26 */                    if (i >= length) {
                                break;
                            } else if (annotations[i] instanceof IiO0I1oi0) {
                                break;
                            } else {
/* 36 */                        i++;
                            }
                        }
/* 34 */                objI00000oIO = null;
                    } catch (Throwable th) {
/* 52 */                objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 62 */            OOiIOoiOO olO1iIi1ol0 = (OOiIOoiOO) (objI00000oIO instanceof Oi10Ii1i1lo ? null : objI00000oIO);
/* 64 */            if (olO1iIi1ol0 == null) {
/* 75 */                olO1iIi1ol0 = new OlO1iIi1ol0(new O0o0Ol0(17));
                    }
/* 79 */            I00000oIO = olO1iIi1ol0;
                }
            }

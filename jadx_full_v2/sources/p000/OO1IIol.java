            package p000;

            import java.lang.reflect.Method;
            
            public abstract class OO1IIol {
                public static final Method I00000oIO;
                public static final Method I00000oOI;

                static {
                    Method method;
                    Method method2;
/* 3 */             Method[] methods = Throwable.class.getMethods();
/* 7 */             int length = methods.length;
/* 8 */             int i = 0;
/* 9 */             int i2 = 0;
                    while (true) {
/* 10 */                method = null;
/* 11 */                if (i2 >= length) {
/* 49 */                    method2 = null;
                            break;
                        }
/* 13 */                method2 = methods[i2];
/* 25 */                if (O0000Ioio00.I0000O(method2.getName(), "addSuppressed")) {
/* 27 */                    Class<?>[] parameterTypes = method2.getParameterTypes();
/* 43 */                    if (O0000Ioio00.I0000O(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                                break;
                            }
                        }
/* 46 */                i2++;
                    }
/* 50 */            I00000oIO = method2;
/* 52 */            int length2 = methods.length;
                    while (true) {
/* 53 */                if (i >= length2) {
                            break;
                        }
/* 55 */                Method method3 = methods[i];
/* 67 */                if (O0000Ioio00.I0000O(method3.getName(), "getSuppressed")) {
/* 69 */                    method = method3;
                            break;
                        }
/* 71 */                i++;
                    }
/* 74 */            I00000oOI = method;
                }
            }

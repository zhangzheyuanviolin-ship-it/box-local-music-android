            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.util.Arrays;
            
            public abstract class lI10OoOI {
                public static final O0O01001OOII I00000oIO(Object obj, O0O01001OOII... o0o01001ooiiArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Class[] clsArr;
                    try {
/* 3 */                 if (o0o01001ooiiArr.length == 0) {
/* 5 */                     clsArr = new Class[0];
                        } else {
/* 8 */                     int length = o0o01001ooiiArr.length;
/* 9 */                     Class[] clsArr2 = new Class[length];
/* 11 */                    for (int i = 0; i < length; i++) {
/* 15 */                        clsArr2[i] = O0O01001OOII.class;
                            }
/* 20 */                    clsArr = clsArr2;
                        }
/* 43 */                Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(o0o01001ooiiArr, o0o01001ooiiArr.length));
/* 49 */                if (objInvoke instanceof O0O01001OOII) {
/* 51 */                    return (O0O01001OOII) objInvoke;
                        }
/* 78 */                return null;
                    } catch (NoSuchMethodException unused) {
/* 78 */                return null;
                    } catch (InvocationTargetException e) {
/* 55 */                Throwable cause = e.getCause();
/* 59 */                if (cause == null) {
/* 77 */                    throw e;
                        }
/* 63 */                String message = cause.getMessage();
/* 67 */                if (message == null) {
/* 69 */                    message = e.getMessage();
                        }
/* 76 */                throw new InvocationTargetException(cause, message);
                    }
                }
            }

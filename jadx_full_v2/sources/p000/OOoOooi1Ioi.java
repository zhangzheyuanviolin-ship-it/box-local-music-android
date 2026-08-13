            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            
            public final class OOoOooi1Ioi extends lIo000I {
                public final Method I00000oIO = Class.class.getMethod("isRecord", null);
                public final Method I00000oOI = Class.class.getMethod("getRecordComponents", null);
                public final Method I0000Il00O;
                public final Method I0000O;

                public OOoOooi1Ioi() throws ClassNotFoundException {
/* 25 */            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
/* 35 */            this.I0000Il00O = cls.getMethod("getName", null);
/* 43 */            this.I0000O = cls.getMethod("getType", null);
                }

                @Override
                public final Method I00000oIO(Class cls, Field field) {
                    try {
/* 6 */                 return cls.getMethod(field.getName(), null);
                    } catch (ReflectiveOperationException e) {
/* 14 */                OIiilo1Ool0o.I000iOII("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
/* 1 */                 return null;
                    }
                }

                @Override
                public final Constructor I00000oOI(Class cls) {
                    try {
/* 8 */                 Object[] objArr = (Object[]) this.I00000oOI.invoke(cls, null);
/* 11 */                Class<?>[] clsArr = new Class[objArr.length];
/* 15 */                for (int i = 0; i < objArr.length; i++) {
/* 27 */                    clsArr[i] = (Class) this.I0000O.invoke(objArr[i], null);
                        }
/* 34 */                return cls.getDeclaredConstructor(clsArr);
                    } catch (ReflectiveOperationException e) {
/* 41 */                OIiilo1Ool0o.I000iOII("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
/* 1 */                 return null;
                    }
                }

                @Override
                public final String[] I0000Il00O(Class cls) {
                    try {
/* 8 */                 Object[] objArr = (Object[]) this.I00000oOI.invoke(cls, null);
/* 11 */                String[] strArr = new String[objArr.length];
/* 15 */                for (int i = 0; i < objArr.length; i++) {
/* 27 */                    strArr[i] = (String) this.I0000Il00O.invoke(objArr[i], null);
                        }
/* 34 */                return strArr;
                    } catch (ReflectiveOperationException e) {
/* 37 */                OIiilo1Ool0o.I000iOII("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
/* 1 */                 return null;
                    }
                }

                @Override
                public final boolean I0000O(Class cls) {
                    try {
/* 10 */                return ((Boolean) this.I00000oIO.invoke(cls, null)).booleanValue();
                    } catch (ReflectiveOperationException e) {
/* 18 */                OIiilo1Ool0o.I000iOII("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
/* 21 */                return false;
                    }
                }
            }

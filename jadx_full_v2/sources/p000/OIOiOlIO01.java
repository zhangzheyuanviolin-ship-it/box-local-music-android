            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            
            public final class OIOiOlIO01 extends i0IiIO implements IoOlilli0ol {
                public Object I000O01llI0;

                public static IoOlilli0ol I00O0i0ii(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    return iInterfaceQueryLocalInterface instanceof IoOlilli0ol ? (IoOlilli0ol) iInterfaceQueryLocalInterface : new iOoO0lOl(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 10);
                }

                public static Object I00O0o1oo(IoOlilli0ol ioOlilli0ol) throws SecurityException {
/* 3 */             if (ioOlilli0ol instanceof OIOiOlIO01) {
/* 7 */                 return ((OIOiOlIO01) ioOlilli0ol).I000O01llI0;
                    }
/* 10 */            IBinder iBinderAsBinder = ioOlilli0ol.asBinder();
/* 18 */            Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
/* 25 */            Field field = null;
/* 26 */            int i = 0;
/* 27 */            for (Field field2 : declaredFields) {
/* 35 */                if (!field2.isSynthetic()) {
/* 37 */                    i++;
/* 39 */                    field = field2;
                        }
                    }
/* 44 */            if (i != 1) {
/* 87 */                int length = declaredFields.length;
/* 109 */               I000II.I000iOII(Oi010OO0.I00100l0(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
/* 23 */                return null;
                    }
/* 46 */            lII0I0I000I.I000II(field);
/* 53 */            if (field.isAccessible()) {
/* 83 */                I000II.I000iOII("IObjectWrapper declared field not private!");
/* 23 */                return null;
                    }
/* 55 */            field.setAccessible(true);
                    try {
/* 58 */                return field.get(iBinderAsBinder);
                    } catch (IllegalAccessException e) {
/* 71 */                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                    } catch (NullPointerException e2) {
/* 80 */                throw new IllegalArgumentException("Binder object is null.", e2);
                    }
                }

                public static OIOiOlIO01 I00O10llo(Object obj) {
/* 7 */             OIOiOlIO01 oIOiOlIO01 = new OIOiOlIO01("com.google.android.gms.dynamic.IObjectWrapper", 9);
/* 10 */            oIOiOlIO01.I000O01llI0 = obj;
/* 12 */            VarHandle.storeStoreFence();
/* 29 */            return oIOiOlIO01;
                }
            }

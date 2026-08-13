            package p000;

            import android.util.Log;
            import com.google.firebase.components.ComponentRegistrar;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            
            public final class IOiOi00Io1 implements OOiO0Il {
                public final int I00000oIO;
                public Object I00000oOI;

                public IOiOi00Io1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[PHI: r7
                  0x003d: PHI (r7v14 java.lang.String) = (r7v13 java.lang.String), (r7v11 java.lang.String) binds: [B:16:0x0051, B:10:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get() throws ClassNotFoundException {
/* 1 */             int i = this.I00000oIO;
/* 3 */             String str = null;
/* 4 */             Object obj = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 93 */                    String str2 = (String) obj;
                            try {
/* 103 */                       Class<?> cls = Class.forName(str2);
/* 113 */                       if (ComponentRegistrar.class.isAssignableFrom(cls)) {
/* 123 */                           return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                                }
/* 155 */                       throw new O001O000O01i("Class " + str2 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused) {
/* 215 */                       Log.w("ComponentDiscovery", "Class " + str2 + " is not an found.");
/* 3 */                         return null;
                            } catch (IllegalAccessException e) {
/* 195 */                       throw new O001O000O01i(IlIi0I0.I000lI("Could not instantiate ", str2, "."), e);
                            } catch (InstantiationException e2) {
/* 185 */                       throw new O001O000O01i(IlIi0I0.I000lI("Could not instantiate ", str2, "."), e2);
                            } catch (NoSuchMethodException e3) {
/* 175 */                       throw new O001O000O01i(IIl001iO0Io.I000o00OoI0I("Could not instantiate ", str2), e3);
                            } catch (InvocationTargetException e4) {
/* 165 */                       throw new O001O000O01i(IIl001iO0Io.I000o00OoI0I("Could not instantiate ", str2), e4);
                            }
                        case 1:
/* 90 */                    return (ComponentRegistrar) obj;
                        default:
/* 9 */                     IlIoliIO ilIoliIO = (IlIoliIO) obj;
/* 13 */                    IoOoiiiOl ioOoiiiOl = new IoOoiiiOl();
/* 18 */                    ilIoliIO.I00000oIO();
/* 28 */                    ioOoiiiOl.I00000oIO = new O00lOo(ilIoliIO.I00000oIO, "com.google.android.gms.appid");
/* 30 */                    ilIoliIO.I00000oIO();
/* 33 */                    IlO0oiiii0IO ilO0oiiii0IO = ilIoliIO.I0000Il00O;
/* 35 */                    String str3 = ilO0oiiii0IO.I0000oI00;
/* 37 */                    if (str3 != null) {
/* 39 */                        str = str3;
                            } else {
/* 41 */                        ilIoliIO.I00000oIO();
/* 44 */                        String str4 = ilO0oiiii0IO.I00000oOI;
/* 52 */                        if (str4.startsWith("1:") || str4.startsWith("2:")) {
/* 66 */                            String[] strArrSplit = str4.split(":");
/* 72 */                            if (strArrSplit.length == 4) {
/* 76 */                                str4 = strArrSplit[1];
/* 82 */                                if (!str4.isEmpty()) {
/* 62 */                                    str = str4;
                                        }
                                    }
                                }
                            }
/* 84 */                    ioOoiiiOl.I00000oOI = str;
/* 86 */                    VarHandle.storeStoreFence();
/* 89 */                    return ioOoiiiOl;
                    }
                }
            }

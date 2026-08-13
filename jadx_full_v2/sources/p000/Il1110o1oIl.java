            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            
            public final class Il1110o1oIl implements OOiO01IO {
                public final int I00000oIO;
                public OOiO01IO I00000oOI;

                public Il1110o1oIl(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object get() {
                    switch (this.I00000oIO) {
                        case 0:
/* 49 */                    String packageName = ((Context) this.I00000oOI.get()).getPackageName();
/* 53 */                    if (packageName != null) {
/* 55 */                        return packageName;
                            }
/* 59 */                    IOOlIIilOl0.I000II("Cannot return null from a non-@Nullable @Provides method");
/* 3 */                     return null;
                        default:
/* 13 */                    Context context = (Context) this.I00000oOI.get();
/* 21 */                    int iIntValue = Integer.valueOf(OiOIoliOiII.I00iio).intValue();
/* 29 */                    OiOIoliOiII oiOIoliOiII = new OiOIoliOiII(context, "com.google.android.datatransport.events", null, iIntValue);
/* 33 */                    oiOIoliOiII.I00iiI = false;
/* 35 */                    oiOIoliOiII.I00iOIl = iIntValue;
/* 37 */                    VarHandle.storeStoreFence();
/* 40 */                    return oiOIoliOiII;
                    }
                }
            }

            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.view.View;
            import android.view.ViewGroup;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayDeque;
            
            public abstract class I11lil0o {
                public static final I11liO I00iOIl;
                public static final int I00iiI;
                public static Boolean I00iiO;
                public static boolean I00iio;
                public static final I1Io1oIoo I00ilI0I1;
                public static final Object I00ilO0;

                static {
/* 6 */             Iii11l iii11l = new Iii11l(2);
/* 10 */            I11liO i11liO = new I11liO(0);
/* 18 */            i11liO.I00iiI = new Object();
/* 25 */            i11liO.I00iiO = new ArrayDeque();
/* 27 */            i11liO.I00iio = iii11l;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            I00iOIl = i11liO;
/* 36 */            I00iiI = -100;
/* 39 */            I00iiO = null;
/* 41 */            I00iio = false;
/* 48 */            I00ilI0I1 = new I1Io1oIoo(0);
/* 55 */            I00ilO0 = new Object();
                }

                public static boolean I00000oOI(Context context) {
/* 3 */             if (I00iiO == null) {
                        try {
/* 5 */                     int i = I1IIOo1Oo1O1.I00iOIl;
/* 28 */                    Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) I1IIOo1Oo1O1.class), I1IIIoiO11.I00000oIO() | Barcode.FORMAT_ITF).metaData;
/* 30 */                    if (bundle != null) {
/* 42 */                        I00iiO = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
/* 47 */                    I00iiO = Boolean.FALSE;
                        }
                    }
/* 51 */            return I00iiO.booleanValue();
                }

                public static void I0001Ioi1lo(I11oi01ll i11oi01ll) {
                    synchronized (I00ilO0) {
                        try {
/* 4 */                     I1Io1oIoo i1Io1oIoo = I00ilI0I1;
/* 6 */                     i1Io1oIoo.getClass();
/* 11 */                    I1IlliII1i i1IlliII1i = new I1IlliII1i(i1Io1oIoo);
/* 18 */                    while (i1IlliII1i.hasNext()) {
/* 30 */                        I11lil0o i11lil0o = (I11lil0o) ((WeakReference) i1IlliII1i.next()).get();
/* 32 */                        if (i11lil0o == i11oi01ll || i11lil0o == null) {
/* 36 */                            i1IlliII1i.remove();
                                }
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public abstract void I00000oIO();

                public abstract void I0000Il00O();

                public abstract void I0000oI00();

                public abstract boolean I000II(int i);

                public abstract void I000O01llI0(int i);

                public abstract void I000OOo1O(View view);

                public abstract void I000OiO(View view, ViewGroup.LayoutParams layoutParams);

                public abstract void I000iOII(CharSequence charSequence);
            }

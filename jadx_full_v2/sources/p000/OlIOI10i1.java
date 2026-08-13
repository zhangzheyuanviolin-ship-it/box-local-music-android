            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.util.Log;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class OlIOI10i1 implements Iterable {
                public final int I00iOIl;
                public Serializable I00iiI;
                public Object I00iiO;

                public OlIOI10i1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static OlIOI10i1 I0000O(Context context) {
/* 4 */             OlIOI10i1 olIOI10i1 = new OlIOI10i1(1);
/* 12 */            olIOI10i1.I00iiI = new ArrayList();
/* 14 */            olIOI10i1.I00iiO = context;
/* 16 */            VarHandle.storeStoreFence();
/* 49 */            return olIOI10i1;
                }

                public void I00000oOI(ComponentName componentName) {
/* 3 */             Context context = (Context) this.I00iiO;
/* 7 */             ArrayList arrayList = (ArrayList) this.I00iiI;
/* 9 */             int size = arrayList.size();
                    try {
/* 17 */                for (Intent intentI00000oOI = l1iOloII.I00000oOI(context, componentName); intentI00000oOI != null; intentI00000oOI = l1iOloII.I00000oOI(context, intentI00000oOI.getComponent())) {
/* 19 */                    arrayList.add(size, intentI00000oOI);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
/* 37 */                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
/* 49 */                throw new IllegalArgumentException(e);
                    }
                }

                public void I0000oI00() {
/* 3 */             ArrayList arrayList = (ArrayList) this.I00iiI;
/* 9 */             if (arrayList.isEmpty()) {
/* 47 */                I000II.I001IO000("No intents added to TaskStackBuilder; cannot startActivities");
/* 113 */               return;
                    }
/* 18 */            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
/* 34 */            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
/* 41 */            ((Context) this.I00iiO).startActivities(intentArr, null);
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    IolIIo0o0Iio iolIIo0o0Iio = (IolIIo0o0Iio) this.I00iiO;
/* 21 */                    String str = (String) this.I00iiI;
/* 29 */                    IO11i1 iO11i1 = (IO11i1) ((I0IOIlIOIII) iolIIo0o0Iio.I0000O).I00iiI;
/* 33 */                    OlIO0o0I olIO0o0I = new OlIO0o0I();
/* 36 */                    olIO0o0I.I00ioIO = iO11i1;
/* 39 */                    olIO0o0I.I00iOIl = 2;
/* 42 */                    olIO0o0I.I00ilO0 = 0;
/* 48 */                    olIO0o0I.I00iio = (IO11i1I0) iolIIo0o0Iio.I0000Il00O;
/* 52 */                    olIO0o0I.I00ilI0I1 = iolIIo0o0Iio.I00000oIO;
/* 56 */                    olIO0o0I.I00io1l = iolIIo0o0Iio.I00000oOI;
/* 58 */                    olIO0o0I.I00iiO = str;
/* 60 */                    VarHandle.storeStoreFence();
/* 63 */                    return olIO0o0I;
                        default:
/* 10 */                    return ((ArrayList) this.I00iiI).iterator();
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 14 */                    I0i0io0oOOi i0i0io0oOOi = new I0i0io0oOOi(4);
/* 19 */                    i0i0io0oOOi.I00iiI = ", ";
/* 21 */                    VarHandle.storeStoreFence();
/* 26 */                    StringBuilder sb = new StringBuilder();
/* 31 */                    sb.append('[');
/* 38 */                    i0i0io0oOOi.I00000oOI(sb, iterator());
/* 43 */                    sb.append(']');
/* 46 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }

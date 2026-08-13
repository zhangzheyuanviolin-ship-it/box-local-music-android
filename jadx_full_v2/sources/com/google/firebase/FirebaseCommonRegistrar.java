            package com.google.firebase;

            import android.content.Context;
            import android.os.Build;
            import com.google.firebase.components.ComponentRegistrar;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.Executor;
            import p000.I1l1000Io;
            import p000.I1looi0;
            import p000.IOOlIIilOl0;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.Ii1oOil;
            import p000.Ii1oil;
            import p000.IiIO0i100IO;
            import p000.IiIooooiilo;
            import p000.IioIoO10iOiI;
            import p000.IlIoliIO;
            import p000.Io1Oioii1111;
            import p000.Io1OlOO;
            import p000.Io1OoiO;
            import p000.O0iIolI;
            import p000.OOiilOlOOI;
            import p000.l10Ii0Oo1Oio;
            
            public class FirebaseCommonRegistrar implements ComponentRegistrar {
                public static String I00000oIO(String str) {
/* 11 */            return str.replace(' ', '_').replace('/', '_');
                }

                @Override
                public final List getComponents() {
                    String string;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(IiIO0i100IO.class);
/* 21 */            iOiIOOl0lOI00000oOI.I00000oIO(new IiIooooiilo(2, 0, I1l1000Io.class));
/* 31 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new IOOlIIilOl0(21);
/* 37 */            arrayList.add(iOiIOOl0lOI00000oOI.I00000oOI());
/* 46 */            OOiilOlOOI oOiilOlOOI = new OOiilOlOOI(I1looi0.class, Executor.class);
/* 61 */            IOiIOOl0lO iOiIOOl0lO = new IOiIOOl0lO(Ii1oil.class, Io1OlOO.class, Io1OoiO.class);
/* 70 */            iOiIOOl0lO.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 79 */            iOiIOOl0lO.I00000oIO(IiIooooiilo.I00000oIO(IlIoliIO.class));
/* 89 */            iOiIOOl0lO.I00000oIO(new IiIooooiilo(2, 0, Io1Oioii1111.class));
/* 98 */            iOiIOOl0lO.I00000oIO(new IiIooooiilo(1, 1, IiIO0i100IO.class));
/* 106 */           iOiIOOl0lO.I00000oIO(new IiIooooiilo(oOiilOlOOI, 1, 0));
/* 111 */           Ii1oOil ii1oOil = new Ii1oOil(0);
/* 114 */           ii1oOil.I00iiI = oOiilOlOOI;
/* 116 */           VarHandle.storeStoreFence();
/* 119 */           iOiIOOl0lO.I0001Ioi1lo = ii1oOil;
/* 125 */           arrayList.add(iOiIOOl0lO.I00000oOI());
/* 144 */           arrayList.add(IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO("fire-android", String.valueOf(Build.VERSION.SDK_INT))));
/* 159 */           arrayList.add(IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO("fire-core", "22.2.0")));
/* 178 */           arrayList.add(IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO("device-name", I00000oIO(Build.PRODUCT))));
/* 197 */           arrayList.add(IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO("device-model", I00000oIO(Build.DEVICE))));
/* 216 */           arrayList.add(IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO("device-brand", I00000oIO(Build.BRAND))));
/* 232 */           arrayList.add(l10Ii0Oo1Oio.I00000oIO("android-target-sdk", new IioIoO10iOiI(10)));
/* 248 */           arrayList.add(l10Ii0Oo1Oio.I00000oIO("android-min-sdk", new IioIoO10iOiI(11)));
/* 264 */           arrayList.add(l10Ii0Oo1Oio.I00000oIO("android-platform", new IioIoO10iOiI(12)));
/* 280 */           arrayList.add(l10Ii0Oo1Oio.I00000oIO("android-installer", new IioIoO10iOiI(13)));
                    try {
/* 285 */               string = O0iIolI.I00ilI0I1.toString();
                    } catch (NoClassDefFoundError unused) {
/* 290 */               string = null;
                    }
/* 291 */           if (string != null) {
/* 303 */               arrayList.add(IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO("kotlin", string)));
                    }
/* 541 */           return arrayList;
                }
            }

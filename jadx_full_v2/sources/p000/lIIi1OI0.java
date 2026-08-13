            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public abstract class lIIi1OI0 {
                public static final void I00000oIO(OloilI0Ol oloilI0Ol, Context context, boolean z, CharSequence charSequence, long j) {
/* 5 */             if (Oo0lI00l.I0000O(j) || charSequence.length() == 0) {
/* 399 */               return;
                    }
/* 14 */            PackageManager packageManager = context.getPackageManager();
/* 24 */            List list = (List) iO0OIlII0.I00000oIO.invoke(context);
/* 30 */            if (list.isEmpty()) {
/* 399 */               return;
                    }
/* 33 */            oloilI0Ol.I00000oIO();
/* 39 */            int size = list.size();
/* 45 */            for (int i = 0; i < size; i++) {
/* 51 */                ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
/* 55 */                OOIllio1lil1 oOIllio1lil1 = new OOIllio1lil1();
/* 58 */                oOIllio1lil1.I00000oIO = i;
/* 60 */                VarHandle.storeStoreFence();
/* 67 */                String string = resolveInfo.loadLabel(packageManager).toString();
/* 73 */                OOIlo11 oOIlo11 = new OOIlo11();
/* 76 */                oOIlo11.I00iOIl = context;
/* 78 */                oOIlo11.I00iiI = resolveInfo;
/* 80 */                oOIlo11.I00iiO = z;
/* 82 */                oOIlo11.I00iio = charSequence;
/* 84 */                oOIlo11.I00ilI0I1 = j;
/* 86 */                VarHandle.storeStoreFence();
/* 91 */                OlolOO0oi ololOO0oi = new OlolOO0oi(oOIllio1lil1);
/* 94 */                ololOO0oi.I00000oOI = string;
/* 96 */                ololOO0oi.I0000Il00O = 0;
/* 98 */                ololOO0oi.I0000O = oOIlo11;
/* 100 */               VarHandle.storeStoreFence();
/* 105 */               oloilI0Ol.I00000oIO.I00000oOI(ololOO0oi);
                    }
/* 111 */           oloilI0Ol.I00000oIO();
                }
            }

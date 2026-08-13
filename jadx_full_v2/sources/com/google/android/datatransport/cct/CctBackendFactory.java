            package com.google.android.datatransport.cct;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import java.lang.invoke.VarHandle;
            import p000.I1ioiIIiOl;
            import p000.IIOO01;
            import p000.IO0ll11OOI;
            import p000.IOO0l0i0Oo;
            import p000.Ii0O0olil1o;
            import p000.O01IiIi1l;
            import p000.OoIOiIl10ioo;
            import p000.iolOOiI;
            
            public class CctBackendFactory {
                public OoIOiIl10ioo create(Ii0O0olil1o ii0O0olil1o) {
/* 6 */             Context context = ((I1ioiIIiOl) ii0O0olil1o).I00000oIO;
/* 8 */             I1ioiIIiOl i1ioiIIiOl = (I1ioiIIiOl) ii0O0olil1o;
/* 10 */            IOO0l0i0Oo iOO0l0i0Oo = i1ioiIIiOl.I00000oOI;
/* 12 */            IOO0l0i0Oo iOO0l0i0Oo2 = i1ioiIIiOl.I0000Il00O;
/* 14 */            IO0ll11OOI iO0ll11OOI = new IO0ll11OOI();
/* 19 */            O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 24 */            iolOOiI.I00iiI.configure(o01IiIi1l);
/* 28 */            o01IiIi1l.I0000O = true;
/* 34 */            iO0ll11OOI.I00000oIO = o01IiIi1l.I00000oIO();
/* 36 */            iO0ll11OOI.I0000Il00O = context;
/* 46 */            iO0ll11OOI.I00000oOI = (ConnectivityManager) context.getSystemService("connectivity");
/* 54 */            iO0ll11OOI.I0000O = IO0ll11OOI.I00000oOI(IIOO01.I0000Il00O);
/* 56 */            iO0ll11OOI.I0000oI00 = iOO0l0i0Oo2;
/* 58 */            iO0ll11OOI.I0001Ioi1lo = iOO0l0i0Oo;
/* 63 */            iO0ll11OOI.I000II = 130000;
/* 65 */            VarHandle.storeStoreFence();
/* 77 */            return iO0ll11OOI;
                }
            }

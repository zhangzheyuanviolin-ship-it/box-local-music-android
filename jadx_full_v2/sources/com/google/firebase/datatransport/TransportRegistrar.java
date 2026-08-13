            package com.google.firebase.datatransport;

            import android.content.Context;
            import com.google.firebase.components.ComponentRegistrar;
            import java.util.Arrays;
            import java.util.List;
            import p000.I1l1000Io;
            import p000.IIOO01;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.IiIooooiilo;
            import p000.O0oIoIl;
            import p000.OIiilo1Ool0o;
            import p000.OOiilOlOOI;
            import p000.OoIOi0o1o;
            import p000.OoIOiO;
            import p000.OoIOlo1001I;
            
            public class TransportRegistrar implements ComponentRegistrar {
                private static final String LIBRARY_NAME = "fire-transport";

                private static OoIOiO lambda$getComponents$0(IOiOIoiiO0i iOiOIoiiO0i) {
/* 9 */             OoIOlo1001I.I00000oOI((Context) iOiOIoiiO0i.I00000oIO(Context.class));
/* 18 */            return OoIOlo1001I.I00000oIO().I0000Il00O(IIOO01.I0001Ioi1lo);
                }

                private static OoIOiO lambda$getComponents$1(IOiOIoiiO0i iOiOIoiiO0i) {
/* 9 */             OoIOlo1001I.I00000oOI((Context) iOiOIoiiO0i.I00000oIO(Context.class));
/* 18 */            return OoIOlo1001I.I00000oIO().I0000Il00O(IIOO01.I0001Ioi1lo);
                }

                private static OoIOiO lambda$getComponents$2(IOiOIoiiO0i iOiOIoiiO0i) {
/* 9 */             OoIOlo1001I.I00000oOI((Context) iOiOIoiiO0i.I00000oIO(Context.class));
/* 18 */            return OoIOlo1001I.I00000oIO().I0000Il00O(IIOO01.I0000oI00);
                }

                @Override
                public List<IOiIi0Oi> getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(OoIOiO.class);
/* 9 */             iOiIOOl0lOI00000oOI.I00000oIO = LIBRARY_NAME;
/* 17 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 27 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new OIiilo1Ool0o(27);
/* 29 */            IOiIi0Oi iOiIi0OiI00000oOI = iOiIOOl0lOI00000oOI.I00000oOI();
/* 40 */            IOiIOOl0lO iOiIOOl0lOI00000oIO = IOiIi0Oi.I00000oIO(new OOiilOlOOI(O0oIoIl.class, OoIOiO.class));
/* 48 */            iOiIOOl0lOI00000oIO.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 58 */            iOiIOOl0lOI00000oIO.I0001Ioi1lo = new OIiilo1Ool0o(28);
/* 60 */            IOiIi0Oi iOiIi0OiI00000oOI2 = iOiIOOl0lOI00000oIO.I00000oOI();
/* 71 */            IOiIOOl0lO iOiIOOl0lOI00000oIO2 = IOiIi0Oi.I00000oIO(new OOiilOlOOI(OoIOi0o1o.class, OoIOiO.class));
/* 79 */            iOiIOOl0lOI00000oIO2.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 89 */            iOiIOOl0lOI00000oIO2.I0001Ioi1lo = new OIiilo1Ool0o(29);
/* 111 */           return Arrays.asList(iOiIi0OiI00000oOI, iOiIi0OiI00000oOI2, iOiIOOl0lOI00000oIO2.I00000oOI(), IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO(LIBRARY_NAME, "18.2.0")));
                }
            }

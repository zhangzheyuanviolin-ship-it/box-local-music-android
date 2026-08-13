            package com.google.firebase.analytics.connector.internal;

            import android.content.Context;
            import android.os.Bundle;
            import com.google.android.gms.measurement.api.AppMeasurementSdk;
            import com.google.firebase.components.ComponentRegistrar;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.I000II;
            import p000.I0l01l0;
            import p000.I0l01lI0O00l;
            import p000.I1l1000Io;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.Ii11I1l;
            import p000.IiIooooiilo;
            import p000.Iii11l;
            import p000.Il10OII;
            import p000.IlIoliIO;
            import p000.OliIolIIi;
            import p000.iOloo0O0O;
            import p000.io0oIOI1o1i;
            import p000.lII0I0I000I;
            import p000.loilIl10Ii;
            
            public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
                private static I0l01l0 lambda$getComponents$0(IOiOIoiiO0i iOiOIoiiO0i) {
                    boolean z;
/* 7 */             IlIoliIO ilIoliIO = (IlIoliIO) iOiOIoiiO0i.I00000oIO(IlIoliIO.class);
/* 15 */            Context context = (Context) iOiOIoiiO0i.I00000oIO(Context.class);
/* 23 */            OliIolIIi oliIolIIi = (OliIolIIi) iOiOIoiiO0i.I00000oIO(OliIolIIi.class);
/* 25 */            lII0I0I000I.I000II(ilIoliIO);
/* 28 */            lII0I0I000I.I000II(context);
/* 31 */            lII0I0I000I.I000II(oliIolIIi);
/* 38 */            lII0I0I000I.I000II(context.getApplicationContext());
/* 43 */            if (I0l01lI0O00l.I00000oOI == null) {
                        synchronized (I0l01lI0O00l.class) {
/* 50 */                    if (I0l01lI0O00l.I00000oOI == null) {
/* 55 */                        Bundle bundle = new Bundle(1);
/* 60 */                        ilIoliIO.I00000oIO();
/* 69 */                        if ("[DEFAULT]".equals(ilIoliIO.I00000oOI)) {
/* 77 */                            ((Il10OII) oliIolIIi).I00000oIO(Iii11l.I00ilI0I1, loilIl10Ii.I00l0OO0IO);
/* 82 */                            ilIoliIO.I00000oIO();
/* 91 */                            Ii11I1l ii11I1l = (Ii11I1l) ilIoliIO.I000II.get();
                                    synchronized (ii11I1l) {
/* 94 */                                z = ii11I1l.I00000oIO;
                                    }
/* 97 */                            bundle.putBoolean("dataCollectionDefaultEnabled", z);
                                }
/* 112 */                       AppMeasurementSdk appMeasurementSdk = io0oIOI1o1i.I0000Il00O(context, bundle).I00000oOI;
/* 114 */                       I0l01lI0O00l i0l01lI0O00l = new I0l01lI0O00l();
/* 117 */                       lII0I0I000I.I000II(appMeasurementSdk);
/* 120 */                       i0l01lI0O00l.I00000oIO = appMeasurementSdk;
/* 124 */                       new ConcurrentHashMap();
/* 127 */                       VarHandle.storeStoreFence();
/* 130 */                       I0l01lI0O00l.I00000oOI = i0l01lI0O00l;
                            }
                        }
                    }
/* 136 */           return I0l01lI0O00l.I00000oOI;
                }

                @Override
                public List<IOiIi0Oi> getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(I0l01l0.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(IlIoliIO.class));
/* 22 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 31 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(OliIolIIi.class));
/* 36 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = iOloo0O0O.I00li1OI;
/* 45 */            if (iOiIOOl0lOI00000oOI.I0000O == 0) {
/* 48 */                iOiIOOl0lOI00000oOI.I0000O = 2;
/* 72 */                return Arrays.asList(iOiIOOl0lOI00000oOI.I00000oOI(), IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO("fire-analytics", "23.2.0")));
                    }
/* 79 */            I000II.I001IO000("Instantiation type has already been set.");
/* 82 */            return null;
                }
            }

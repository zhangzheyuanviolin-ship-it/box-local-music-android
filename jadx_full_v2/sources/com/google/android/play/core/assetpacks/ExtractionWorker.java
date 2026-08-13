            package com.google.android.play.core.assetpacks;

            import android.content.Context;
            import android.os.Bundle;
            import androidx.work.Worker;
            import androidx.work.WorkerParameters;
            import java.lang.invoke.VarHandle;
            import p000.Ii11I1OOII1;
            import p000.IliliOOliOi;
            import p000.O10o0OiIIll;
            import p000.O10o0oOio1;
            import p000.O10oI0l1;
            import p000.OlilOlOiI;
            import p000.i000IO;
            import p000.i0IOo0i0;
            import p000.i0O0ioo00;
            import p000.i0O0lI1oiO;
            import p000.i0O0lO1il0;
            import p000.i0O1I1o;
            import p000.i0OI0oooo;
            import p000.liO0I1oOII;
            
            public final class ExtractionWorker extends Worker {
                public final i0O0ioo00 I00000oIO;

                public ExtractionWorker(Context context, WorkerParameters workerParameters) {
/* 1 */             super(context, workerParameters);
/* 18 */            this.I00000oIO = (i0O0ioo00) ((i0IOo0i0) i0O0lO1il0.I0000O(context).I00iiO).I0000Il00O();
                }

                @Override
                public final O10oI0l1 I00000oIO() {
/* 1 */             Ii11I1OOII1 inputData = getInputData();
/* 5 */             i0O0ioo00 i0o0ioo00 = this.I00000oIO;
/* 7 */             i0o0ioo00.getClass();
/* 14 */            OlilOlOiI olilOlOiI = new OlilOlOiI("session_bundle:", inputData);
/* 17 */            liO0I1oOII.I0000Il00O(olilOlOiI);
/* 22 */            Bundle bundle = (Bundle) olilOlOiI.I00iio;
                    try {
/* 24 */                i0O1I1o i0o1i1o = i0o0ioo00.I00000oIO;
/* 26 */                i0o1i1o.getClass();
/* 32 */                i000IO i000io = new i000IO(2);
/* 35 */                i000io.I00iiI = i0o1i1o;
/* 37 */                i000io.I00iiO = bundle;
/* 39 */                VarHandle.storeStoreFence();
/* 52 */                if (((Boolean) i0o1i1o.I00000oOI(i000io)).booleanValue()) {
/* 56 */                    i0o0ioo00.I00000oOI.I00000oIO();
                        }
/* 63 */                return new O10o0oOio1(Ii11I1OOII1.I00000oOI);
                    } catch (i0O0lI1oiO e) {
/* 80 */                i0O0ioo00.I0000O.I00000oOI("Error while updating ExtractorSessionStoreView: %s", e.getMessage());
/* 85 */                return new O10o0OiIIll();
                    }
                }

                @Override
                public final IliliOOliOi I00000oOI() {
/* 1 */             Ii11I1OOII1 inputData = getInputData();
/* 7 */             i0OI0oooo i0oi0oooo = this.I00000oIO.I0000Il00O;
/* 13 */            OlilOlOiI olilOlOiI = new OlilOlOiI("notification_bundle:", inputData);
/* 16 */            liO0I1oOII.I00000oOI(olilOlOiI);
/* 21 */            Bundle bundle = (Bundle) olilOlOiI.I00iio;
/* 23 */            i0oi0oooo.I00000oOI(bundle);
/* 36 */            return new IliliOOliOi(-1883842196, i0oi0oooo.I00000oIO(bundle), 0);
                }
            }

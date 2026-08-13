            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.os.Looper;
            import android.util.Log;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.multiprocess.RemoteListenableWorker;
            import com.google.mlkit.acceleration.internal.MlKitRemoteWorkerService;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.concurrent.ExecutorService;
            
            public final class lIOlOoIoo {
                public Context I00000oIO;
                public OO11il0 I00000oOI;
                public lO0Olllill I0000Il00O;
                public i01IlOO I0000O;
                public Class I0000oI00;
                public float I0001Ioi1lo;
                public I01l1o I000II;
                public ExecutorService I000O01llI0;
                public boolean I000OOo1O;
                public int I000OiO;

                public static void I00000oOI() {
/* 4 */             Log.isLoggable("MiniBenchmarkManager", 3);
                }

                public final void I00000oIO(int i, ArrayList arrayList) {
/* 5 */             i01IlOO i01iloo = this.I0000O;
/* 7 */             Context context = this.I00000oIO;
/* 13 */            if (arrayList.isEmpty()) {
/* 551 */               return;
                    }
/* 19 */            ArrayList arrayList2 = new ArrayList();
/* 22 */            Iterator it = arrayList.iterator();
/* 30 */            while (it.hasNext()) {
/* 36 */                OiI1oi1 oiI1oi1 = (OiI1oi1) it.next();
/* 40 */                if (oiI1oi1.I0000O) {
/* 44 */                    arrayList2.add(oiI1oi1.I0000Il00O);
                        }
                    }
/* 55 */            I01l10Oi i01l10Oi = ((OiI1oi1) arrayList.get(0)).I00000oOI;
/* 59 */            ArrayList arrayListI00000oIO = this.I0000Il00O.I00000oIO(i01l10Oi, arrayList2);
/* 63 */            arrayListI00000oIO.size();
/* 66 */            I00000oOI();
/* 73 */            if (arrayListI00000oIO.isEmpty()) {
/* 551 */               return;
                    }
/* 87 */            ComponentName componentName = new ComponentName(context.getPackageName(), MlKitRemoteWorkerService.class.getName());
/* 90 */            String strEncode = i01l10Oi.encode();
/* 96 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 105 */           linkedHashMap.put("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName.getPackageName());
/* 114 */           linkedHashMap.put(RemoteListenableWorker.ARGUMENT_CLASS_NAME, componentName.getClassName());
/* 119 */           linkedHashMap.put("mlkit_base_options_key", strEncode);
/* 132 */           linkedHashMap.put("mlkit_run_config_name_array_key", (String[]) arrayListI00000oIO.toArray(new String[0]));
/* 137 */           Ii11I1OOII1 ii11I1OOII1 = new Ii11I1OOII1(linkedHashMap);
/* 140 */           il01ool0o.I0000Il00O(ii11I1OOII1);
/* 147 */           I1ii1l10IO i1ii1l10IO = new I1ii1l10IO(this.I0000oI00);
/* 154 */           ((WorkSpec) i1ii1l10IO.I0000Il00O).input = ii11I1OOII1;
/* 193 */           ((WorkSpec) i1ii1l10IO.I0000Il00O).constraints = new IOo0o10i1IO(new OIIOOo(null), OIIOlI.I00iOIl, false, this.I000OOo1O, false, false, -1L, -1L, IOOi0Ool1i.I00iio(new LinkedHashSet()));
/* 195 */           OIi0i0 oIi0i0I00000oIO = i1ii1l10IO.I00000oIO();
/* 207 */           String strI000lI = IlIi0I0.I000lI(String.valueOf(this.I00000oOI), ":", strEncode);
/* 211 */           Il1OO1ilo0o1 il1OO1ilo0o1 = Il1OO1ilo0o1.I00iiI;
/* 213 */           List listSingletonList = Collections.singletonList(oIi0i0I00000oIO);
/* 221 */           if (listSingletonList.isEmpty()) {
/* 297 */               I000II.I000iOII("beginUniqueWork needs at least one OneTimeWorkRequest.");
/* 551 */               return;
                    }
/* 229 */           new i01I0IOOI10(i01iloo, strI000lI, il1OO1ilo0o1, listSingletonList, null).I00000oIO();
/* 238 */           "mini-benchmark scheduled for ".concat(arrayListI00000oIO.toString());
/* 241 */           I00000oOI();
/* 246 */           "uniqueWorkName: ".concat(strI000lI);
/* 249 */           I00000oOI();
/* 254 */           O1ii11 o1ii11I0000Il00O = i01iloo.I0000Il00O(oIi0i0I00000oIO.I00000oIO);
/* 265 */           O1oo1il01OoO o1oo1il01OoO = new O1oo1il01OoO(context.getMainLooper(), 4, false);
/* 268 */           Looper.getMainLooper();
/* 273 */           l1O1io11l l1o1io11l = new l1O1io11l();
/* 276 */           l1o1io11l.I00iOIl = this;
/* 278 */           l1o1io11l.I00iiI = o1ii11I0000Il00O;
/* 280 */           l1o1io11l.I00iiO = arrayListI00000oIO;
/* 284 */           l1o1io11l.I00iio = i;
/* 286 */           l1o1io11l.I00ilI0I1 = arrayList;
/* 288 */           VarHandle.storeStoreFence();
/* 291 */           o1oo1il01OoO.post(l1o1io11l);
                }
            }

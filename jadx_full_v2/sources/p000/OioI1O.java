            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.os.PowerManager;
            import androidx.work.impl.foreground.SystemForegroundService;
            import androidx.work.impl.model.WorkSpec;
            import java.util.UUID;
            import kotlin.jvm.functions.Function1;
            
            public final class OioI1O implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public OioI1O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 340 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 344 */                   OOii1iolI0ol oOii1iolI0ol = (OOii1iolI0ol) this.I00iio;
/* 348 */                   Context context = (Context) this.I00ilI0I1;
/* 352 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 354 */                   oI10i0Il.setValue(oOii1iolI0ol);
/* 359 */                   Oo0oii.I000II.setValue(oOii1iolI0ol);
/* 381 */                   context.getSharedPreferences("box_settings", 0).edit().putString("ptyxis_palette_extended", oOii1iolI0ol.I00iOIl).apply();
/* 386 */                   oI10i0Il2.setValue(Boolean.FALSE);
/* 389 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 310 */                   String str = (String) this.I00iio;
/* 314 */                   Function1 function1 = (Function1) this.I00ilI0I1;
/* 318 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 322 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiO;
/* 324 */                   oI10i0Il3.setValue(str);
/* 329 */                   oI10i0Il4.setValue(Boolean.FALSE);
/* 332 */                   function1.invoke(str);
/* 335 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 251 */                   Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00iio;
/* 255 */                   Ol0oI1llIloI ol0oI1llIloI = (Ol0oI1llIloI) this.I00ilI0I1;
/* 259 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiI;
/* 263 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiO;
/* 265 */                   Ii1liIllli0 ii1liIllli0 = ol0o1OiOIIIl.I00000oOI;
/* 275 */                   String strConcat = "skill___".concat(ol0oI1llIloI.I00000oIO.I001i1O0Ol());
/* 284 */                   String str2 = (String) oI10i0Il5.getValue();
/* 286 */                   ii1liIllli0.getClass();
/* 297 */                   iOi1IOoIO0l.I00000oOI(new I00oIiI10(ii1liIllli0, strConcat, str2, null, 28));
/* 302 */                   oI10i0Il6.setValue(Boolean.FALSE);
/* 305 */                   return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 245 */                   return new Oll1l0IOli((Oll1lO) this.I00iiI, (IiIooOOOI) this.I00iiO, (Function1) this.I00iio, (Function1) this.I00ilI0I1);
                        case 4:
/* 221 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new OO11OilO((Ol010000lo00) this.I00iiO, (IllOOo00lI) this.I00iio, (IllOOo00lI) this.I00ilI0I1, null, 24), 3);
/* 224 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 8 */                     i01II1o i01ii1o = (i01II1o) this.I00iiI;
/* 12 */                    UUID uuid = (UUID) this.I00iiO;
/* 16 */                    IliliOOliOi ililiOOliOi = (IliliOOliOi) this.I00iio;
/* 20 */                    Context context2 = (Context) this.I00ilI0I1;
/* 22 */                    String string = uuid.toString();
/* 28 */                    WorkSpec workSpec = i01ii1o.I00iiO.getWorkSpec(string);
/* 32 */                    if (workSpec == null || workSpec.state.I00000oIO()) {
/* 188 */                       I000II.I001IO000("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
/* 191 */                       return null;
                            }
/* 42 */                    OOIo1i0 oOIo1i0 = i01ii1o.I00iiI;
                            synchronized (oOIo1i0.I000iOII) {
                                try {
/* 72 */                            IIi0oIl.I000II().I000OOo1O(OOIo1i0.I000l1, "Moving WorkSpec (" + string + ") to the foreground");
/* 81 */                            i01ilO i01ilo = (i01ilO) oOIo1i0.I000II.remove(string);
/* 83 */                            if (i01ilo != null) {
/* 87 */                                if (oOIo1i0.I00000oIO == null) {
/* 91 */                                    PowerManager.WakeLock wakeLockI00000oIO = Oooooi0o01l.I00000oIO(oOIo1i0.I00000oOI);
/* 95 */                                    oOIo1i0.I00000oIO = wakeLockI00000oIO;
/* 97 */                                    wakeLockI00000oIO.acquire();
                                        }
/* 106 */                               oOIo1i0.I0001Ioi1lo.put(string, i01ilo);
/* 123 */                               oOIo1i0.I00000oOI.startForegroundService(OllOO1l1.I00000oOI(oOIo1i0.I00000oOI, liIOI1iO.I00000oIO(i01ilo.I00000oIO), ililiOOliOi));
                                    }
                                } catch (Throwable th) {
/* 185 */                           throw th;
                                }
                            }
/* 127 */                   i01IIlI i01iiliI00000oIO = liIOI1iO.I00000oIO(workSpec);
/* 131 */                   String str3 = OllOO1l1.I00l0OO0IO;
/* 137 */                   Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
/* 142 */                   intent.setAction("ACTION_NOTIFY");
/* 149 */                   intent.putExtra("KEY_NOTIFICATION_ID", ililiOOliOi.I00000oIO);
/* 156 */                   intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ililiOOliOi.I00000oOI);
/* 163 */                   intent.putExtra("KEY_NOTIFICATION", ililiOOliOi.I0000Il00O);
/* 170 */                   intent.putExtra("KEY_WORKSPEC_ID", i01iiliI00000oIO.I00000oIO);
/* 177 */                   intent.putExtra("KEY_GENERATION", i01iiliI00000oIO.I00000oOI);
/* 180 */                   context2.startService(intent);
/* 191 */                   return null;
                    }
                }
            }

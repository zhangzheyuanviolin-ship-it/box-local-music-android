            package p000;

            import android.content.Context;
            import android.os.Trace;
            import android.util.Log;
            import androidx.work.OverwritingInputMerger;
            import androidx.work.WorkerParameters;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.DependencyDao;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.UUID;
            import java.util.concurrent.CancellationException;
            
            public final class i01ilO {
                public WorkSpec I00000oIO;
                public Context I00000oOI;
                public String I0000Il00O;
                public OlilOlOiI I0000O;
                public OillOo0 I0000oI00;
                public IOllii I0001Ioi1lo;
                public o0llIi I000II;
                public OOIo1i0 I000O01llI0;
                public WorkDatabase I000OOo1O;
                public WorkSpecDao I000OiO;
                public DependencyDao I000iOII;
                public ArrayList I000l1;
                public String I000lI;
                public O010loOOi0Oo I000o00OoI0I;

                public final void I00000oIO(int i) {
/* 1 */             WorkSpecDao workSpecDao = this.I000OiO;
/* 3 */             i01IOiO1lO i01ioio1lo = i01IOiO1lO.I00iOIl;
/* 5 */             String str = this.I0000Il00O;
/* 7 */             workSpecDao.setState(i01ioio1lo, str);
/* 12 */            this.I000II.getClass();
/* 19 */            workSpecDao.setLastEnqueueTime(str, System.currentTimeMillis());
/* 28 */            workSpecDao.resetWorkSpecNextScheduleTimeOverride(str, this.I00000oIO.getNextScheduleTimeOverrideGeneration());
/* 33 */            workSpecDao.markWorkSpecScheduled(str, -1L);
/* 36 */            workSpecDao.setStopReason(str, i);
                }

                public final void I00000oOI() {
/* 1 */             WorkSpecDao workSpecDao = this.I000OiO;
/* 3 */             String str = this.I0000Il00O;
/* 7 */             this.I000II.getClass();
/* 14 */            workSpecDao.setLastEnqueueTime(str, System.currentTimeMillis());
/* 19 */            workSpecDao.setState(i01IOiO1lO.I00iOIl, str);
/* 22 */            workSpecDao.resetWorkSpecRunAttemptCount(str);
/* 31 */            workSpecDao.resetWorkSpecNextScheduleTimeOverride(str, this.I00000oIO.getNextScheduleTimeOverrideGeneration());
/* 34 */            workSpecDao.incrementPeriodCount(str);
/* 39 */            workSpecDao.markWorkSpecScheduled(str, -1L);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(IOoilo iOoilo) throws Throwable {
                    i01iiiOi i01iiioi;
                    OverwritingInputMerger overwritingInputMerger;
                    Ii11I1OOII1 ii11I1OOII1;
/* 5 */             String str = this.I000lI;
/* 7 */             String str2 = this.I0000Il00O;
/* 9 */             OillOo0 oillOo0 = this.I0000oI00;
/* 11 */            WorkDatabase workDatabase = this.I000OOo1O;
/* 13 */            IOllii iOllii = this.I0001Ioi1lo;
/* 15 */            WorkSpec workSpec = this.I00000oIO;
/* 19 */            if (iOoilo instanceof i01iiiOi) {
/* 22 */                i01iiioi = (i01iiiOi) iOoilo;
/* 24 */                int i = i01iiioi.I00iiO;
/* 30 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 33 */                    i01iiioi.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 38 */                    i01iiioi = new i01iiiOi(this, iOoilo);
                        }
                    }
/* 41 */            Object objI0000oI00 = i01iiioi.I00iOIl;
/* 43 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 45 */            int i2 = i01iiioi.I00iiO;
                    try {
/* 48 */                if (i2 == 0) {
/* 70 */                    lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 75 */                    iOllii.I000oI1ioi.getClass();
/* 78 */                    boolean zIsEnabled = Trace.isEnabled();
/* 82 */                    String traceTag = workSpec.getTraceTag();
/* 86 */                    int i3 = 0;
/* 88 */                    if (zIsEnabled && traceTag != null) {
/* 92 */                        O1oO0lOoI1 o1oO0lOoI1 = iOllii.I000oI1ioi;
/* 94 */                        int iHashCode = workSpec.hashCode();
/* 98 */                        o1oO0lOoI1.getClass();
/* 111 */                       String strSubstring = traceTag.length() <= 127 ? traceTag : null;
/* 112 */                       if (strSubstring == null) {
/* 114 */                           strSubstring = traceTag.substring(0, 127);
                                }
/* 118 */                       Trace.beginAsyncSection(strSubstring, iHashCode);
                            }
/* 123 */                   i01iOli i01ioli = new i01iOli(i3);
/* 126 */                   i01ioli.I00000oOI = this;
/* 128 */                   VarHandle.storeStoreFence();
/* 141 */                   if (((Boolean) workDatabase.I00100o1O0lo(i01ioli)).booleanValue()) {
/* 145 */                       return new i01iiI111lo();
                            }
/* 153 */                   if (workSpec.isPeriodic()) {
/* 155 */                       ii11I1OOII1 = workSpec.input;
                            } else {
/* 161 */                       O1oO0lOoI1 o1oO0lOoI12 = iOllii.I0001Ioi1lo;
/* 163 */                       String str3 = workSpec.inputMergerClassName;
/* 165 */                       o1oO0lOoI12.getClass();
/* 168 */                       String str4 = IoloOI0.I00000oIO;
                                try {
/* 182 */                           overwritingInputMerger = (OverwritingInputMerger) Class.forName(str3).getDeclaredConstructor(null).newInstance(null);
                                } catch (Exception e) {
/* 198 */                           IIi0oIl.I000II().I0001Ioi1lo(IoloOI0.I00000oIO, "Trouble instantiating ".concat(str3), e);
/* 201 */                           overwritingInputMerger = null;
                                }
/* 202 */                       if (overwritingInputMerger == null) {
/* 204 */                           String str5 = i01ilOlII00I.I00000oIO;
/* 226 */                           IIi0oIl.I000II().I0000oI00(str5, "Could not create Input Merger " + workSpec.inputMergerClassName);
/* 231 */                           return new i01iOoio();
                                }
/* 251 */                       ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(Collections.singletonList(workSpec.input), this.I000OiO.getInputsFromPrerequisites(str2));
/* 257 */                       Ii11I0l ii11I0l = new Ii11I0l();
/* 262 */                       LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 265 */                       Iterator it = arrayListI00O10llo.iterator();
/* 273 */                       while (it.hasNext()) {
/* 287 */                           linkedHashMap.putAll(Collections.unmodifiableMap(((Ii11I1OOII1) it.next()).I00000oIO));
                                }
/* 291 */                       ii11I0l.I00000oIO(linkedHashMap);
/* 298 */                       ii11I1OOII1 = new Ii11I1OOII1(ii11I0l.I00000oIO);
/* 301 */                       il01ool0o.I0000Il00O(ii11I1OOII1);
                            }
/* 360 */                   WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(str2), ii11I1OOII1, this.I000l1, this.I0000O, workSpec.runAttemptCount, workSpec.getGeneration(), iOllii.I00000oIO, iOllii.I00000oOI, this.I0000oI00, iOllii.I0000oI00, new i01O1I0(workDatabase, oillOo0), new i01II1o(workDatabase, this.I000O01llI0, oillOo0));
                            try {
/* 371 */                       O10oIiIi0OI0 o10oIiIi0OI0I00000oIO = iOllii.I0000oI00.I00000oIO(this.I00000oOI, workSpec.workerClassName, workerParameters);
/* 375 */                       o10oIiIi0OI0I00000oIO.setUsed();
/* 388 */                       O010OIi o010OIi = (O010OIi) i01iiioi.getContext().I00lli11(Iioi0lilII.I00iio);
/* 393 */                       I0oo10oIOO i0oo10oIOO = new I0oo10oIOO(3);
/* 396 */                       i0oo10oIOO.I00iiO = o10oIiIi0OI0I00000oIO;
/* 398 */                       i0oo10oIOO.I00iiI = zIsEnabled;
/* 400 */                       i0oo10oIOO.I00iio = traceTag;
/* 402 */                       i0oo10oIOO.I00ilI0I1 = this;
/* 404 */                       VarHandle.storeStoreFence();
/* 407 */                       o010OIi.I00iiI(i0oo10oIOO);
/* 413 */                       i01iOli i01ioli2 = new i01iOli(1);
/* 416 */                       i01ioli2.I00000oOI = this;
/* 418 */                       VarHandle.storeStoreFence();
/* 431 */                       if (!((Boolean) workDatabase.I00100o1O0lo(i01ioli2)).booleanValue()) {
/* 435 */                           return new i01iiI111lo();
                                }
/* 443 */                       if (o010OIi.isCancelled()) {
/* 447 */                           return new i01iiI111lo();
                                }
/* 451 */                       IliliOoOloi ililiOoOloi = workerParameters.I000iOII;
/* 457 */                       Ii00lIOoi ii00lIOoiI00000oIO = ilIl1O1ii0Oo.I00000oIO((Io1iO1Ooo0l) oillOo0.I00ilI0I1);
/* 466 */                       i00Iooii0i i00iooii0i = new i00Iooii0i(this, o10oIiIi0OI0I00000oIO, ililiOoOloi, null, 2);
/* 470 */                       i01iiioi.I00iiO = 1;
/* 472 */                       objI0000oI00 = iOi1II01i0.I0000oI00(ii00lIOoiI00000oIO, i00iooii0i, i01iiioi);
/* 476 */                       if (objI0000oI00 == ii0111o) {
/* 478 */                           return ii0111o;
                                }
                            } catch (Throwable unused) {
/* 548 */                       String str6 = i01ilOlII00I.I00000oIO;
/* 570 */                       IIi0oIl.I000II().I0000oI00(str6, "Could not create Worker " + workSpec.workerClassName);
/* 575 */                       return new i01iOoio();
                            }
                        } else {
/* 50 */                    if (i2 != 1) {
/* 65 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 68 */                        return null;
                            }
/* 52 */                    lIoii1l01l0i.I00000oOI(objI0000oI00);
                        }
/* 483 */               i01ii0lIOo10 i01ii0lioo10 = new i01ii0lIOo10();
/* 486 */               i01ii0lioo10.I00000oIO = (O10oI0l1) objI0000oI00;
/* 488 */               VarHandle.storeStoreFence();
/* 491 */               return i01ii0lioo10;
                    } catch (CancellationException e2) {
/* 527 */               String str7 = i01ilOlII00I.I00000oIO;
/* 529 */               IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 535 */               String strI00111O = Oi010OO0.I00111O(str, " was cancelled");
/* 542 */               if (iIi0oIlI000II.I00iOIl <= 4) {
/* 544 */                   Log.i(str7, strI00111O, e2);
                        }
/* 547 */               throw e2;
                    } catch (Throwable th) {
/* 492 */               String str8 = i01ilOlII00I.I00000oIO;
/* 515 */               IIi0oIl.I000II().I0001Ioi1lo(str8, str + " failed because it threw an exception/error", th);
/* 518 */               iOllii.getClass();
/* 523 */               return new i01iOoio();
                    }
                }

                public final void I0000O(O10oI0l1 o10oI0l1) {
/* 1 */             String str = this.I0000Il00O;
/* 3 */             WorkSpecDao workSpecDao = this.I000OiO;
/* 9 */             ArrayList arrayListI000OiO = IOOi1I.I000OiO(str);
/* 17 */            while (!arrayListI000OiO.isEmpty()) {
/* 23 */                String str2 = (String) IOOii0O10Io0.I00111O(arrayListI000OiO);
/* 31 */                if (workSpecDao.getState(str2) != i01IOiO1lO.I00ilO0) {
/* 35 */                    workSpecDao.setState(i01IOiO1lO.I00iio, str2);
                        }
/* 46 */                arrayListI000OiO.addAll(this.I000iOII.getDependentWorkIds(str2));
                    }
/* 52 */            Ii11I1OOII1 ii11I1OOII1 = ((O10o0OiIIll) o10oI0l1).I00000oIO;
/* 60 */            workSpecDao.resetWorkSpecNextScheduleTimeOverride(str, this.I00000oIO.getNextScheduleTimeOverrideGeneration());
/* 63 */            workSpecDao.setOutput(str, ii11I1OOII1);
                }
            }

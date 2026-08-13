            package p000;

            import android.os.Trace;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import androidx.work.impl.model.WorkTagDao;
            import java.util.List;
            import java.util.Set;
            
            public final class I1oli1o0I1O0 implements Runnable {
                public final int I00iOIl;
                public List I00iiI;
                public boolean I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;

                public I1oli1o0I1O0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    OI10OloOOoi oI10OloOOoiI001lloI;
                    switch (this.I00iOIl) {
                        case 0:
/* 216 */                   Oo0lloOiiIOI oo0lloOiiIOI = (Oo0lloOiiIOI) this.I00iio;
/* 220 */                   O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) this.I00ilI0I1;
/* 222 */                   List list = this.I00iiI;
/* 227 */                   I1111OO10i i1111OO10i = (I1111OO10i) this.I00ilO0;
/* 232 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) this.I00io1l;
/* 237 */                   IliO0o11i01 iliO0o11i01 = (IliO0o11i01) this.I00ioIO;
/* 239 */                   boolean z = this.I00iiO;
/* 243 */                   Trace.beginSection("BackgroundTextMeasurement");
                            try {
/* 246 */                       Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 258 */                       OI10OloOOoi oI10OloOOoi = ol1il1o1I000O01llI0 instanceof OI10OloOOoi ? (OI10OloOOoi) ol1il1o1I000O01llI0 : null;
/* 259 */                       if (oI10OloOOoi == null || (oI10OloOOoiI001lloI = oI10OloOOoi.I001lloI(null, null)) == null) {
/* 332 */                           throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                }
                                try {
/* 267 */                           Ol1il1o1 ol1il1o1I000OiO = oI10OloOOoiI001lloI.I000OiO();
                                    try {
/* 271 */                               Oo0lloOiiIOI oo0lloOiiIOII00000oIO = lOlilIi0I.I00000oIO(oo0lloOiiIOI, o0iOOoiioO);
/* 275 */                               if (list == null) {
/* 277 */                                   list = Il01100l.I00iOIl;
                                        }
/* 285 */                               I1ii1o0 i1ii1o0 = new I1ii1o0(i1111OO10i, iiIooOOOI, iliO0o11i01, oo0lloOiiIOII00000oIO, list, z);
/* 288 */                               i1ii1o0.I000l1();
/* 291 */                               i1ii1o0.I000II();
/* 294 */                               Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
/* 301 */                               oI10OloOOoiI001lloI.I001i1O0Ol().I00000oIO();
/* 307 */                               Trace.endSection();
/* 310 */                               return;
                                    } catch (Throwable th) {
/* 313 */                               Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
/* 316 */                               throw th;
                                    }
                                } finally {
                                }
                            } catch (Throwable th2) {
/* 333 */                       Trace.endSection();
/* 336 */                       throw th2;
                            }
                        default:
/* 10 */                    WorkDatabase workDatabase = (WorkDatabase) this.I00iio;
/* 14 */                    WorkSpec workSpec = (WorkSpec) this.I00ilI0I1;
/* 19 */                    WorkSpec workSpec2 = (WorkSpec) this.I00ilO0;
/* 23 */                    String str = (String) this.I00io1l;
/* 27 */                    Set<String> set = (Set) this.I00ioIO;
/* 29 */                    boolean z2 = this.I00iiO;
/* 31 */                    WorkSpecDao workSpecDaoI001lIiIIo1O = workDatabase.I001lIiIIo1O();
/* 35 */                    WorkTagDao workTagDaoI001lllioOl = workDatabase.I001lllioOl();
/* 159 */                   WorkSpec workSpecCopy$default = WorkSpec.copy$default(workSpec2, null, workSpec.state, null, null, null, null, 0L, 0L, 0L, null, workSpec.runAttemptCount, null, 0L, workSpec.lastEnqueueTime, 0L, 0L, false, null, workSpec.getPeriodCount(), workSpec.getGeneration() + 1, workSpec.getNextScheduleTimeOverride(), workSpec.getNextScheduleTimeOverrideGeneration(), 0, null, null, 29613053, null);
/* 167 */                   if (workSpec2.getNextScheduleTimeOverrideGeneration() == 1) {
/* 173 */                       workSpecCopy$default.setNextScheduleTimeOverride(workSpec2.getNextScheduleTimeOverride());
/* 181 */                       workSpecCopy$default.setNextScheduleTimeOverrideGeneration(workSpecCopy$default.getNextScheduleTimeOverrideGeneration() + 1);
                            }
/* 188 */                   workSpecDaoI001lIiIIo1O.updateWorkSpec(ilII0oO0.I00000oOI(workSpecCopy$default));
/* 191 */                   workTagDaoI001lllioOl.deleteByWorkSpecId(str);
/* 196 */                   workTagDaoI001lllioOl.insertTags(str, set);
/* 199 */                   if (z2) {
/* 213 */                       return;
                            }
/* 203 */                   workSpecDaoI001lIiIIo1O.markWorkSpecScheduled(str, -1L);
/* 210 */                   workDatabase.I001l0I00().delete(str);
/* 213 */                   return;
                    }
                }
            }

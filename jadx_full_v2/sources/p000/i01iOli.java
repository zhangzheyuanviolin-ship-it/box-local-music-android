            package p000;

            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import java.util.concurrent.Callable;
            
            public final class i01iOli implements Callable {
                public final int I00000oIO;
                public i01ilO I00000oOI;

                public i01iOli(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object call() {
                    boolean z;
/* 1 */             int i = this.I00000oIO;
/* 3 */             i01ilO i01ilo = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 41 */                    WorkSpec workSpec = i01ilo.I00000oIO;
/* 47 */                    if (workSpec.state != i01IOiO1lO.I00iOIl) {
/* 49 */                        String str = i01ilOlII00I.I00000oIO;
/* 55 */                        IIi0oIl.I000II().getClass();
/* 58 */                        return Boolean.TRUE;
                            }
/* 65 */                    if (workSpec.isPeriodic() || workSpec.isBackedOff()) {
/* 75 */                        i01ilo.I000II.getClass();
/* 88 */                        if (System.currentTimeMillis() < workSpec.calculateNextRunTime()) {
/* 90 */                            IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 94 */                            String str2 = i01ilOlII00I.I00000oIO;
/* 96 */                            iIi0oIlI000II.getClass();
/* 99 */                            return Boolean.TRUE;
                                }
                            }
/* 102 */                   return Boolean.FALSE;
                        default:
/* 8 */                     WorkSpecDao workSpecDao = i01ilo.I000OiO;
/* 10 */                    String str3 = i01ilo.I0000Il00O;
/* 18 */                    if (workSpecDao.getState(str3) == i01IOiO1lO.I00iOIl) {
/* 22 */                        workSpecDao.setState(i01IOiO1lO.I00iiI, str3);
/* 25 */                        workSpecDao.incrementWorkSpecRunAttemptCount(str3);
/* 30 */                        workSpecDao.setStopReason(str3, -256);
/* 33 */                        z = true;
                            } else {
/* 35 */                        z = false;
                            }
/* 36 */                    return Boolean.valueOf(z);
                    }
                }
            }

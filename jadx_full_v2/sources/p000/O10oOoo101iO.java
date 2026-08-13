            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutorService;
            
            public final class O10oOoo101iO {
                public static final String I0000oI00 = IIi0oIl.I000OiO("ListenableWorkerImplClient");
                public Context I00000oIO;
                public ExecutorService I00000oOI;
                public Object I0000Il00O;
                public O10oOOO I0000O;

                public final Oll0oO I00000oIO(ComponentName componentName, OOooio11i00 oOooio11i00) {
                    Oio0lloOl oio0lloOl;
                    synchronized (this.I0000Il00O) {
                        try {
/* 6 */                     if (this.I0000O == null) {
/* 8 */                         IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 12 */                        componentName.getPackageName();
/* 15 */                        componentName.getClassName();
/* 18 */                        iIi0oIlI000II.getClass();
/* 23 */                        O10oOOO o10oOOO = new O10oOOO();
/* 31 */                        o10oOOO.I00iOIl = new Oio0lloOl();
/* 33 */                        VarHandle.storeStoreFence();
/* 36 */                        this.I0000O = o10oOOO;
                                try {
/* 40 */                            Intent intent = new Intent();
/* 43 */                            intent.setComponent(componentName);
/* 55 */                            if (!this.I00000oIO.bindService(intent, this.I0000O, 1)) {
/* 57 */                                O10oOOO o10oOOO2 = this.I0000O;
/* 63 */                                RuntimeException runtimeException = new RuntimeException("Unable to bind to service");
/* 74 */                                IIi0oIl.I000II().I0001Ioi1lo(I0000oI00, "Unable to bind to service", runtimeException);
/* 79 */                                o10oOOO2.I00iOIl.I000II(runtimeException);
                                    }
                                } catch (Throwable th) {
/* 84 */                            O10oOOO o10oOOO3 = this.I0000O;
/* 94 */                            IIi0oIl.I000II().I0001Ioi1lo(I0000oI00, "Unable to bind to service", th);
/* 99 */                            o10oOOO3.I00iOIl.I000II(th);
                                }
                            }
/* 107 */                   oio0lloOl = this.I0000O.I00iOIl;
                        } catch (Throwable th2) {
/* 332 */                   throw th2;
                        }
                    }
/* 110 */           ExecutorService executorService = this.I00000oOI;
/* 112 */           IOO01l00ol iOO01l00ol = Oll101.I00000oIO;
/* 135 */           return Oll101.I00000oIO(iiollilo0IO1.I00000oIO(ilIl1O1ii0Oo.I00000oIO(executorService), l01oO1iOo.I00000oIO()), false, new O1iIlllIoo(oio0lloOl, oOooio11i00, null, 18));
                }

                public final void I00000oOI() {
                    synchronized (this.I0000Il00O) {
                        try {
/* 4 */                     O10oOOO o10oOOO = this.I0000O;
/* 6 */                     if (o10oOOO != null) {
/* 10 */                        this.I00000oIO.unbindService(o10oOOO);
/* 14 */                        this.I0000O = null;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }
            }

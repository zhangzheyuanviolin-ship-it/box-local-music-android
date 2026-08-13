            package androidx.work.multiprocess;

            import android.content.Context;
            import android.content.Intent;
            import android.os.Handler;
            import java.lang.invoke.VarHandle;
            import p000.IIi0oIl;
            import p000.IOO01l00ol;
            import p000.IOllii;
            import p000.Io11iII11ll;
            import p000.O1iIlllIoo;
            import p000.OIiilo1Ool0o;
            import p000.OOIl1i1;
            import p000.OOooio11i00;
            import p000.Oi00IilOloo0;
            import p000.Oi00O10io;
            import p000.Oi00Oi0;
            import p000.Oi00Oii00lil;
            import p000.OilOol;
            import p000.OillOo0;
            import p000.Oio0lloOl;
            import p000.Oll0oO;
            import p000.Oll101;
            import p000.i01IlOO;
            import p000.iiollilo0IO1;
            import p000.ilIl1O1ii0Oo;
            import p000.l01oO1iOo;
            
            public class RemoteWorkManagerClient extends Oi00O10io {
                public static final String I000OOo1O = IIi0oIl.I000OiO("RemoteWorkManagerClient");
                public static final OIiilo1Ool0o I000OiO = new OIiilo1Ool0o(10);
                public final Context I00000oOI;
                public final OilOol I0000Il00O;
                public volatile long I0000oI00;
                public final long I0001Ioi1lo;
                public final Oi00IilOloo0 I000II;
                public final Oi00Oii00lil I000O01llI0;
                public final Object I0000O = new Object();
                public Oi00Oi0 I00000oIO = null;

                public RemoteWorkManagerClient(Context context, i01IlOO i01iloo) {
/* 8 */             this.I00000oOI = context.getApplicationContext();
/* 18 */            this.I0000Il00O = (OilOol) ((OillOo0) i01iloo.I0000O).I00iiI;
/* 32 */            Oi00Oii00lil oi00Oii00lil = new Oi00Oii00lil();
/* 35 */            oi00Oii00lil.I00iOIl = this;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            this.I000O01llI0 = oi00Oii00lil;
/* 42 */            IOllii iOllii = i01iloo.I00000oOI;
/* 46 */            this.I0001Ioi1lo = iOllii.I000OOo1O;
/* 50 */            this.I000II = iOllii.I000II;
                }

                public final void I00000oOI() {
                    synchronized (this.I0000O) {
/* 8 */                 IIi0oIl.I000II().getClass();
/* 12 */                this.I00000oIO = null;
                    }
                }

                public final Oll0oO I0000Il00O(OOooio11i00 oOooio11i00) {
                    Oio0lloOl oio0lloOl;
/* 7 */             Intent intent = new Intent(this.I00000oOI, (Class<?>) RemoteWorkManagerService.class);
                    synchronized (this.I0000O) {
                        try {
                            this.I0000oI00++;
/* 22 */                    if (this.I00000oIO == null) {
/* 28 */                        IIi0oIl.I000II().getClass();
/* 33 */                        Oi00Oi0 oi00Oi0 = new Oi00Oi0();
/* 36 */                        oi00Oi0.I00iiI = this;
/* 43 */                        oi00Oi0.I00iOIl = new Oio0lloOl();
/* 45 */                        VarHandle.storeStoreFence();
/* 48 */                        this.I00000oIO = oi00Oi0;
                                try {
/* 57 */                            if (!this.I00000oOI.bindService(intent, oi00Oi0, 1)) {
/* 59 */                                Oi00Oi0 oi00Oi02 = this.I00000oIO;
/* 65 */                                RuntimeException runtimeException = new RuntimeException("Unable to bind to service");
/* 76 */                                IIi0oIl.I000II().I0001Ioi1lo(I000OOo1O, "Unable to bind to service", runtimeException);
/* 81 */                                oi00Oi02.I00iOIl.I000II(runtimeException);
                                    }
                                } catch (Throwable th) {
/* 86 */                            Oi00Oi0 oi00Oi03 = this.I00000oIO;
/* 96 */                            IIi0oIl.I000II().I0001Ioi1lo(I000OOo1O, "Unable to bind to service", th);
/* 101 */                           oi00Oi03.I00iOIl.I000II(th);
                                }
                            }
/* 115 */                   ((Handler) this.I000II.I00iOIl).removeCallbacks(this.I000O01llI0);
/* 120 */                   oio0lloOl = this.I00000oIO.I00iOIl;
                        } catch (Throwable th2) {
/* 437 */                   throw th2;
                        }
                    }
/* 127 */           Io11iII11ll io11iII11ll = new Io11iII11ll(15);
/* 130 */           io11iII11ll.I00iiI = this;
/* 132 */           io11iII11ll.I00iiO = oio0lloOl;
/* 134 */           VarHandle.storeStoreFence();
/* 137 */           OilOol oilOol = this.I0000Il00O;
/* 139 */           oio0lloOl.addListener(io11iII11ll, oilOol);
/* 142 */           IOO01l00ol iOO01l00ol = Oll101.I00000oIO;
/* 165 */           Oll0oO oll0oOI00000oIO = Oll101.I00000oIO(iiollilo0IO1.I00000oIO(ilIl1O1ii0Oo.I00000oIO(oilOol), l01oO1iOo.I00000oIO()), false, new O1iIlllIoo(oio0lloOl, oOooio11i00, null, 18));
/* 172 */           OOIl1i1 oOIl1i1 = new OOIl1i1(2);
/* 175 */           oOIl1i1.I00iiI = this;
/* 177 */           VarHandle.storeStoreFence();
/* 182 */           oll0oOI00000oIO.I00iiI.addListener(oOIl1i1, oilOol);
/* 185 */           return oll0oOI00000oIO;
                }
            }

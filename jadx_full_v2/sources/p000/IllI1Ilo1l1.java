            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            
            public final class IllI1Ilo1l1 implements Io1IOII0lo, OiIoOoIi01, Oool1Ii0I {
                public Ill0l1 I00iOIl;
                public Oool0l1iOIOl I00iiI;
                public Oool0IIIO0o I00iiO;
                public O0oiiOll0O1 I00iio;
                public IIlio101Io I00ilI0I1;

                public final void I00000oIO(O0oOOiI0 o0oOOiI0) {
/* 3 */             this.I00iio.I010iIIOlo(o0oOOiI0);
                }

                public final void I0000Il00O() {
/* 3 */             if (this.I00iio == null) {
/* 11 */                this.I00iio = new O0oiiOll0O1(this, true);
/* 19 */                OIOo1iiI oIOo1iiI = new OIOo1iiI(21);
/* 22 */                oIOo1iiI.I00iiI = this;
/* 24 */                VarHandle.storeStoreFence();
/* 27 */                II1oo0l11IOI iI1oo0l11IOI = new II1oo0l11IOI();
/* 30 */                iI1oo0l11IOI.I0000O = this;
/* 32 */                iI1oo0l11IOI.I0000oI00 = oIOo1iiI;
/* 41 */                iI1oo0l11IOI.I0001Ioi1lo = new lolOiIoiillI(15);
/* 48 */                iI1oo0l11IOI.I000II = new LinkedHashMap();
/* 50 */                iI1oo0l11IOI.I0000Il00O = true;
/* 52 */                VarHandle.storeStoreFence();
/* 59 */                IIlio101Io iIlio101Io = new IIlio101Io(24);
/* 62 */                iIlio101Io.I00iiI = iI1oo0l11IOI;
/* 68 */                I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(25);
/* 71 */                i1I0i0Ilo1Oi.I00iiI = iI1oo0l11IOI;
/* 73 */                VarHandle.storeStoreFence();
/* 76 */                iIlio101Io.I00iiO = i1I0i0Ilo1Oi;
/* 78 */                VarHandle.storeStoreFence();
/* 81 */                this.I00ilI0I1 = iIlio101Io;
/* 83 */                iIlio101Io.I00oliIiO01i();
/* 86 */                OiIoII10il0.I00000oOI(this);
                    }
                }

                @Override
                public final Oool0IIIO0o I0000O() {
                    Application application;
/* 1 */             Ill0l1 ill0l1 = this.I00iOIl;
/* 3 */             Oool0IIIO0o oool0IIIO0oI0000O = ill0l1.I0000O();
/* 9 */             if (oool0IIIO0oI0000O != ill0l1.I010lI0oi) {
/* 11 */                this.I00iiO = oool0IIIO0oI0000O;
/* 13 */                return oool0IIIO0oI0000O;
                    }
/* 14 */            Oool0IIIO0o oool0IIIO0o = this.I00iiO;
/* 16 */            if (oool0IIIO0o != null) {
/* 55 */                return oool0IIIO0o;
                    }
/* 22 */            Context applicationContext = ill0l1.I00IioO0OiOi().getApplicationContext();
                    while (true) {
/* 28 */                if (!(applicationContext instanceof ContextWrapper)) {
/* 44 */                    application = null;
                            break;
                        }
/* 32 */                if (applicationContext instanceof Application) {
/* 34 */                    application = (Application) applicationContext;
                            break;
                        }
/* 39 */                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
/* 49 */            OiIol0o oiIol0o = new OiIol0o(application, this, ill0l1.I00ilO0);
/* 52 */            this.I00iiO = oiIol0o;
/* 54 */            return oiIol0o;
                }

                @Override
                public final OI0l1OOllOo I0000oI00() {
                    Application application;
/* 1 */             Ill0l1 ill0l1 = this.I00iOIl;
/* 7 */             Context applicationContext = ill0l1.I00IioO0OiOi().getApplicationContext();
                    while (true) {
/* 13 */                if (!(applicationContext instanceof ContextWrapper)) {
/* 29 */                    application = null;
                            break;
                        }
/* 17 */                if (applicationContext instanceof Application) {
/* 19 */                    application = (Application) applicationContext;
                            break;
                        }
/* 24 */                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
/* 33 */            OI0l1OOllOo oI0l1OOllOo = new OI0l1OOllOo(0);
/* 36 */            if (application != null) {
/* 40 */                oI0l1OOllOo.I00000oOI(Oool01i.I0000O, application);
                    }
/* 45 */            oI0l1OOllOo.I00000oOI(OiIoII10il0.I00000oIO, this);
/* 50 */            oI0l1OOllOo.I00000oOI(OiIoII10il0.I00000oOI, this);
/* 53 */            Bundle bundle = ill0l1.I00ilO0;
/* 55 */            if (bundle != null) {
/* 59 */                oI0l1OOllOo.I00000oOI(OiIoII10il0.I0000Il00O, bundle);
                    }
/* 110 */           return oI0l1OOllOo;
                }

                @Override
                public final Oool0l1iOIOl I000II() {
/* 1 */             I0000Il00O();
/* 4 */             return this.I00iiI;
                }

                @Override
                public final I1I0i0Ilo1Oi I000O01llI0() {
/* 1 */             I0000Il00O();
/* 8 */             return (I1I0i0Ilo1Oi) this.I00ilI0I1.I00iiO;
                }

                @Override
                public final I01O1lIi I000iOII() {
/* 1 */             I0000Il00O();
/* 4 */             return this.I00iio;
                }
            }

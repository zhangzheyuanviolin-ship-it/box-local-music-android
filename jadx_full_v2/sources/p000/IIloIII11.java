            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            
            public final class IIloIII11 {
                public final Context I00000oIO;
                public final IIloIo1I0i I00000oOI;
                public final IoloOio0I I0000Il00O;
                public final iiOlilo0IIIl I0000O;
                public final IIlo110 I0000oI00;
                public final IIloIil I0001Ioi1lo;

                public IIloIII11(Context context, IIloIo1I0i iIloIo1I0i, IIlo110 iIlo110) {
/* 4 */             IoloOio0I ioloOio0I = new IoloOio0I(6);
/* 9 */             ioloOio0I.I00iiI = Il01llIol0.I00iOIl;
/* 11 */            Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 13 */            ioloOio0I.I00iiO = il011I1OiO0I;
/* 15 */            VarHandle.storeStoreFence();
/* 20 */            iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 23 */            iiolilo0iiil.I00iOIl = il011I1OiO0I;
/* 25 */            VarHandle.storeStoreFence();
/* 30 */            IIloIil iIloIil = new IIloIil();
/* 33 */            VarHandle.storeStoreFence();
/* 39 */            this.I00000oIO = context;
/* 41 */            this.I00000oOI = iIloIo1I0i;
/* 43 */            this.I0000Il00O = ioloOio0I;
/* 45 */            this.I0000O = iiolilo0iiil;
/* 47 */            this.I0000oI00 = iIlo110;
/* 49 */            this.I0001Ioi1lo = iIloIil;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 70 */                return true;
                    }
/* 7 */             if (obj instanceof IIloIII11) {
/* 10 */                IIloIII11 iIloIII11 = (IIloIII11) obj;
/* 20 */                if (this.I00000oIO.equals(iIloIII11.I00000oIO) && this.I00000oOI.equals(iIloIII11.I00000oOI) && this.I0000Il00O == iIloIII11.I0000Il00O && this.I0000O == iIloIII11.I0000O && this.I0000oI00.equals(iIloIII11.I0000oI00) && this.I0001Ioi1lo.equals(iIloIII11.I0001Ioi1lo)) {
/* 70 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 44 */            return Oi010OO0.I000OOo1O((this.I0000oI00.hashCode() + ((this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31)) * 31)) * 961, 31, false);
                }

                public final String toString() {
/* 68 */            return "Config(appContext=" + this.I00000oIO + ", threadConfig=" + this.I00000oOI + ", cameraMetadataConfig=" + this.I0000Il00O + ", cameraBackendConfig=" + this.I0000O + ", cameraInteropConfig=" + this.I0000oI00 + ", imageSources=null, flags=" + this.I0001Ioi1lo + ", platformApiCompat=null)";
                }
            }
